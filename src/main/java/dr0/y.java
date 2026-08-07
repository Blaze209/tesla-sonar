package dr0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y implements Serializable, zo0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f61002h = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f61005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Cipher f61006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Mac f61007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SecretKey f61008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SecretKey f61009g;

    protected y(SecretKey secretKey, SecretKey secretKey2, String str, String str2, int i11, boolean z11, long j11) {
        this.f61003a = i11;
        this.f61004b = z11;
        this.f61008f = secretKey;
        this.f61009g = secretKey2;
        this.f61005c = j11;
        this.f61006d = yq0.o.p(str);
        this.f61007e = yq0.o.u(str2);
    }

    private byte[] d(int i11) {
        return (i11 < 0 || i11 > 256) ? new byte[]{(byte) ((65280 & i11) >> 8), (byte) (i11 & 255)} : new byte[]{(byte) i11};
    }

    public static y h(y yVar) {
        try {
            if (yVar instanceof h) {
                return new h((h) yVar);
            }
            if (yVar instanceof d) {
                return new d((d) yVar);
            }
            f61002h.warning("Not copying wrapper");
            return yVar;
        } catch (GeneralSecurityException e11) {
            f61002h.log(Level.WARNING, "Could not copy wrapper", (Throwable) e11);
        }
    }

    private byte[] m(DataInputStream dataInputStream, boolean z11) throws IOException {
        int unsignedByte;
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & 128) == 128) {
            int i11 = unsignedByte2 & 127;
            int unsignedByte3 = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                unsignedByte3 = (unsignedByte3 << 8) | dataInputStream.readUnsignedByte();
            }
            if (!z11 && dataInputStream.readUnsignedByte() != 1) {
                throw new IllegalStateException("DO'87 expected 0x01 marker");
            }
            unsignedByte2 = unsignedByte3;
        } else if (!z11 && (unsignedByte = dataInputStream.readUnsignedByte()) != 1) {
            throw new IllegalStateException("DO'87 expected 0x01 marker, found " + Integer.toHexString(unsignedByte & 255));
        }
        if (!z11) {
            unsignedByte2--;
        }
        byte[] bArr = new byte[unsignedByte2];
        dataInputStream.readFully(bArr);
        return yq0.o.a0(this.f61006d.doFinal(bArr));
    }

    private byte[] n(DataInputStream dataInputStream) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 8 || unsignedByte == 16) {
            byte[] bArr = new byte[unsignedByte];
            dataInputStream.readFully(bArr);
            return bArr;
        }
        throw new IllegalStateException("DO'8E wrong length for MAC: " + unsignedByte);
    }

    private short o(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readUnsignedByte() != 2) {
            throw new IllegalStateException("DO'99 wrong length");
        }
        byte b11 = dataInputStream.readByte();
        return (short) ((dataInputStream.readByte() & 255) | ((b11 & 255) << 8));
    }

    private zo0.j q(zo0.j jVar) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        byte[] bArrB = jVar.b();
        if (bArrB == null || bArrB.length < 2) {
            throw new IllegalArgumentException("Invalid response APDU");
        }
        this.f61006d.init(2, this.f61008f, g());
        byte[] bArrM = new byte[0];
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrB));
        byte[] bArrN = null;
        boolean z11 = false;
        short sO = 0;
        while (!z11) {
            try {
                byte b11 = dataInputStream.readByte();
                if (b11 == -123) {
                    bArrM = m(dataInputStream, true);
                } else if (b11 == -121) {
                    bArrM = m(dataInputStream, false);
                } else if (b11 == -114) {
                    bArrN = n(dataInputStream);
                    z11 = true;
                } else if (b11 != -103) {
                    f61002h.warning("Unexpected tag " + Integer.toHexString(b11));
                } else {
                    sO = o(dataInputStream);
                }
            } catch (Throwable th2) {
                dataInputStream.close();
                throw th2;
            }
        }
        dataInputStream.close();
        if (p() && !c(bArrB, bArrN)) {
            throw new IllegalStateException("Invalid MAC");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArrM, 0, bArrM.length);
        byteArrayOutputStream.write((65280 & sO) >> 8);
        byteArrayOutputStream.write(sO & 255);
        return new zo0.j(byteArrayOutputStream.toByteArray());
    }

    private zo0.f r(zo0.f fVar) {
        int iD = fVar.d();
        int iF = fVar.f();
        int i11 = fVar.i();
        int iJ = fVar.j();
        int iG = fVar.g();
        int iH = fVar.h();
        byte[] bArr = {(byte) (iD | 12), (byte) iF, (byte) i11, (byte) iJ};
        byte[] bArrJ = yq0.o.J(bArr, k());
        int i12 = ((byte) fVar.f()) == -79 ? 1 : 0;
        byte[] byteArray = new byte[0];
        byte[] bArrI = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (iH > 0) {
            try {
                bArrI = ap0.e.i(151, d(iH));
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (IOException e11) {
                    f61002h.log(Level.FINE, "Error closing stream", (Throwable) e11);
                    throw th2;
                }
            }
        }
        if (iG > 0) {
            byte[] bArrJ2 = yq0.o.J(fVar.e(), k());
            this.f61006d.init(1, this.f61008f, g());
            byte[] bArrDoFinal = this.f61006d.doFinal(bArrJ2);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(i12 != 0 ? -123 : -121);
            byteArrayOutputStream.write(ap0.e.a(bArrDoFinal.length + (i12 ^ 1)));
            if (i12 == 0) {
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(e());
        byteArrayOutputStream.write(bArrJ);
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(bArrI);
        byte[] bArrJ3 = yq0.o.J(byteArrayOutputStream.toByteArray(), k());
        this.f61007e.init(this.f61009g);
        byte[] bArrDoFinal2 = this.f61007e.doFinal(bArrJ3);
        int length = bArrDoFinal2.length;
        if (length != 8) {
            length = 8;
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(-114);
        byteArrayOutputStream.write(length);
        byteArrayOutputStream.write(bArrDoFinal2, 0, length);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(bArrI);
        byteArrayOutputStream.write(byteArray2);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e12) {
            f61002h.log(Level.FINE, "Error closing stream", (Throwable) e12);
        }
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        if (iH > 256 || byteArray3.length > 255) {
            return (iH > 256 || byteArray3.length > 255) ? new zo0.f(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, 65536) : new zo0.f(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, j());
        }
        return new zo0.f(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, 256);
    }

    @Override // zo0.c
    public zo0.f a(zo0.f fVar) {
        this.f61005c++;
        try {
            return r(fVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        } catch (GeneralSecurityException e12) {
            throw new IllegalStateException("Unexpected exception", e12);
        }
    }

    @Override // zo0.c
    public zo0.j b(zo0.j jVar) {
        this.f61005c++;
        try {
            byte[] bArrC = jVar.c();
            if (bArrC != null && bArrC.length > 0) {
                return q(jVar);
            }
            throw new IllegalStateException("Card indicates SM error, SW = " + Integer.toHexString(jVar.d() & 65535));
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        } catch (GeneralSecurityException e12) {
            throw new IllegalStateException("Unexpected exception", e12);
        }
    }

    protected boolean c(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(e());
            byte[] bArrK = yq0.o.K(bArr, 0, bArr.length - 12, k());
            dataOutputStream.write(bArrK, 0, bArrK.length);
            dataOutputStream.flush();
            dataOutputStream.close();
            this.f61007e.init(this.f61009g);
            byte[] bArrDoFinal = this.f61007e.doFinal(byteArrayOutputStream.toByteArray());
            if (bArrDoFinal.length > 8 && bArr2.length == 8) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
                bArrDoFinal = bArr3;
            }
            return Arrays.equals(bArr2, bArrDoFinal);
        } catch (IOException e11) {
            f61002h.log(Level.WARNING, "Exception checking MAC", (Throwable) e11);
            return false;
        }
    }

    protected abstract byte[] e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        SecretKey secretKey = this.f61008f;
        if (secretKey == null) {
            if (yVar.f61008f != null) {
                return false;
            }
        } else if (!secretKey.equals(yVar.f61008f)) {
            return false;
        }
        SecretKey secretKey2 = this.f61009g;
        if (secretKey2 == null) {
            if (yVar.f61009g != null) {
                return false;
            }
        } else if (!secretKey2.equals(yVar.f61009g)) {
            return false;
        }
        return this.f61003a == yVar.f61003a && this.f61004b == yVar.f61004b && this.f61005c == yVar.f61005c;
    }

    public SecretKey f() {
        return this.f61008f;
    }

    protected abstract IvParameterSpec g();

    public int hashCode() {
        SecretKey secretKey = this.f61008f;
        int iHashCode = ((secretKey == null ? 0 : secretKey.hashCode()) + 31) * 31;
        SecretKey secretKey2 = this.f61009g;
        int iHashCode2 = (((((iHashCode + (secretKey2 != null ? secretKey2.hashCode() : 0)) * 31) + this.f61003a) * 31) + (this.f61004b ? 1231 : 1237)) * 31;
        long j11 = this.f61005c;
        return iHashCode2 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public SecretKey i() {
        return this.f61009g;
    }

    public int j() {
        return this.f61003a;
    }

    protected abstract int k();

    public long l() {
        return this.f61005c;
    }

    public boolean p() {
        return this.f61004b;
    }

    public String toString() {
        return "SecureMessagingWrapper [ssc: " + this.f61005c + ", ksEnc: " + this.f61008f + ", ksMac: " + this.f61009g + ", maxTranceiveLength: " + this.f61003a + ", shouldCheckMAC: " + this.f61004b + "]";
    }
}
