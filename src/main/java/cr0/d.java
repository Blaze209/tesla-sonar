package cr0;

import br0.k;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import yq0.o;

/* JADX INFO: loaded from: classes10.dex */
public class d extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f59151f = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f59152g = {"RSA", "EC"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PublicKey f59153e;

    public d(InputStream inputStream) {
        super(111, inputStream);
    }

    private static PublicKey i(byte[] bArr) throws InvalidAlgorithmParameterException {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
        String[] strArr = f59152g;
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                return o.y(strArr[i11], x509EncodedKeySpec);
            } catch (InvalidKeySpecException e11) {
                f59151f.log(Level.FINE, "Ignore, try next algorithm", (Throwable) e11);
            }
        }
        throw new InvalidAlgorithmParameterException();
    }

    @Override // br0.e
    protected void e(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        try {
            byte[] bArr = new byte[c()];
            dataInputStream.readFully(bArr);
            this.f59153e = i(bArr);
        } catch (GeneralSecurityException e11) {
            f59151f.log(Level.WARNING, "Unexpected exception while reading DG15 content", (Throwable) e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return this.f59153e.equals(((d) obj).f59153e);
        }
        return false;
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        outputStream.write(this.f59153e.getEncoded());
    }

    public PublicKey h() {
        return this.f59153e;
    }

    public int hashCode() {
        return (this.f59153e.hashCode() * 5) + 61;
    }

    public String toString() {
        return "DG15File [" + o.t(this.f59153e) + "]";
    }
}
