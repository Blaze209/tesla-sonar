package ap0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f14849a = Logger.getLogger("net.sf.scuba.tlv");

    public static byte[] a(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i11 < 128) {
            byteArrayOutputStream.write(i11);
        } else {
            int iG = g(i11, 256);
            byteArrayOutputStream.write(iG | 128);
            for (int i12 = 0; i12 < iG; i12++) {
                int i13 = ((iG - i12) - 1) * 8;
                byteArrayOutputStream.write(((255 << i13) & i11) >> i13);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int b(int i11) {
        return a(i11).length;
    }

    public static byte[] c(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iLog = ((int) (Math.log(i11) / Math.log(256.0d))) + 1;
        for (int i12 = 0; i12 < iLog; i12++) {
            int i13 = ((iLog - i12) - 1) * 8;
            byteArrayOutputStream.write(((255 << i13) & i11) >> i13);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int iD = d(i11);
        if (iD == 1) {
            byteArray[0] = (byte) (byteArray[0] | 64);
        } else if (iD == 2) {
            byteArray[0] = (byte) (byteArray[0] | 128);
        } else if (iD == 3) {
            byteArray[0] = (byte) (byteArray[0] | 192);
        }
        if (!f(i11)) {
            byteArray[0] = (byte) (byteArray[0] | 32);
        }
        return byteArray;
    }

    static int d(int i11) {
        int i12 = 3;
        while (i12 >= 0 && ((255 << (i12 * 8)) & i11) == 0) {
            i12--;
        }
        int i13 = i12 * 8;
        int i14 = ((i11 & (255 << i13)) >> i13) & 192;
        if (i14 == 0) {
            return 0;
        }
        if (i14 != 64) {
            return i14 != 128 ? 3 : 2;
        }
        return 1;
    }

    public static int e(int i11) {
        return c(i11).length;
    }

    public static boolean f(int i11) {
        int i12 = 3;
        while (i12 >= 0 && ((255 << (i12 * 8)) & i11) == 0) {
            i12--;
        }
        int i13 = i12 * 8;
        return (((i11 & (255 << i13)) >> i13) & 32) == 0;
    }

    private static int g(int i11, int i12) {
        int i13 = 0;
        while (i11 > 0) {
            i11 /= i12;
            i13++;
        }
        return i13;
    }

    public static byte[] h(int i11, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            throw new IllegalArgumentException("Wrapped data is null or length < 2");
        }
        b bVar = new b(new ByteArrayInputStream(bArr));
        try {
            try {
                int iN = bVar.n();
                if (iN != i11) {
                    throw new IllegalArgumentException("Expected tag " + Integer.toHexString(i11) + ", found tag " + Integer.toHexString(iN));
                }
                int iC = bVar.c();
                byte[] bArr2 = new byte[iC];
                System.arraycopy(bVar.o(), 0, bArr2, 0, iC);
                try {
                    bVar.close();
                    return bArr2;
                } catch (IOException e11) {
                    f14849a.log(Level.FINE, "Error closing stream", (Throwable) e11);
                    return bArr2;
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Error reading from stream", e12);
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (IOException e13) {
                f14849a.log(Level.FINE, "Error closing stream", (Throwable) e13);
            }
            throw th2;
        }
    }

    public static byte[] i(int i11, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Data to wrap is null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                d dVar = new d(byteArrayOutputStream);
                dVar.n(i11);
                dVar.o(bArr);
                dVar.flush();
                dVar.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (IOException e11) {
                    f14849a.log(Level.FINE, "Error closing stream", (Throwable) e11);
                    return byteArray;
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Error writing stream", e12);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                f14849a.log(Level.FINE, "Error closing stream", (Throwable) e13);
            }
            throw th2;
        }
    }
}
