package dr0;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class d extends y implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f60928j = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Cipher f60929i;

    public d(d dVar) {
        this(dVar.f(), dVar.i(), dVar.j(), dVar.p(), dVar.l());
    }

    @Override // dr0.y
    public byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        try {
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(l());
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                return byteArray;
            } catch (IOException e11) {
                return byteArray;
            }
        } catch (IOException e12) {
            f60928j.log(Level.FINE, "Error writing to stream", (Throwable) e12);
            try {
                return null;
            } catch (IOException e13) {
                return null;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e14) {
                f60928j.log(Level.FINE, "Error closing stream", (Throwable) e14);
            }
        }
    }

    @Override // dr0.y
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // dr0.y
    protected IvParameterSpec g() {
        return new IvParameterSpec(this.f60929i.doFinal(e()));
    }

    @Override // zo0.c
    public String getType() {
        return "AES";
    }

    @Override // dr0.y
    public int hashCode() {
        return (super.hashCode() * 71) + 17;
    }

    @Override // dr0.y
    public int k() {
        return 16;
    }

    @Override // dr0.y
    public String toString() {
        return "AESSecureMessagingWrapper [ssc: " + l() + ", kEnc: " + f() + ", kMac: " + i() + ", shouldCheckMAC: " + p() + ", maxTranceiveLength: " + j() + "]";
    }

    public d(SecretKey secretKey, SecretKey secretKey2, int i11, boolean z11, long j11) {
        super(secretKey, secretKey2, "AES/CBC/NoPadding", "AESCMAC", i11, z11, j11);
        this.f60929i = yq0.o.q("AES/ECB/NoPadding", 1, secretKey);
    }
}
