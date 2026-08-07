package dr0;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class h extends y implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f60941i = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final IvParameterSpec f60942j = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});

    public h(h hVar) {
        this(hVar.f(), hVar.i(), hVar.j(), hVar.p(), hVar.l());
    }

    @Override // dr0.y
    public byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                new DataOutputStream(byteArrayOutputStream).writeLong(l());
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e11) {
                    f60941i.log(Level.FINE, "Error closing stream", (Throwable) e11);
                }
            }
        } catch (IOException e12) {
            f60941i.log(Level.FINE, "Error writing to stream", (Throwable) e12);
        }
        return byteArrayOutputStream.toByteArray();
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
        return f60942j;
    }

    @Override // zo0.c
    public String getType() {
        return "DESede";
    }

    @Override // dr0.y
    public int hashCode() {
        return (super.hashCode() * 31) + 13;
    }

    @Override // dr0.y
    public int k() {
        return 8;
    }

    @Override // dr0.y
    public String toString() {
        return "DESedeSecureMessagingWrapper [ssc: " + l() + ", kEnc: " + f() + ", kMac: " + i() + ", shouldCheckMAC: " + p() + ", maxTranceiveLength: " + j() + "]";
    }

    public h(SecretKey secretKey, SecretKey secretKey2, int i11, boolean z11, long j11) {
        super(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", i11, z11, j11);
    }
}
