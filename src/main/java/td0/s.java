package td0;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static s f113234b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f113235a = new a();

    private static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Charset f113236a = StandardCharsets.ISO_8859_1;

        @NonNull
        private byte[] c(@NonNull String str) {
            return Base64.decode(str, 0);
        }

        @NonNull
        private String d(@NonNull byte[] bArr) {
            return Base64.encodeToString(bArr, 0);
        }

        @Override // td0.s.b
        public String a(String str) {
            String[] strArrSplit = str.split(":");
            return new String(c.b().decrypt(c(strArrSplit[0]), c(strArrSplit[1])), f113236a);
        }

        @Override // td0.s.b
        public String b(String str) {
            EncryptionResult encryptionResultEncrypt = c.b().encrypt(str.getBytes(f113236a));
            return d(encryptionResultEncrypt.getIv()) + ":" + d(encryptionResultEncrypt.getEncryptedData());
        }

        private a() {
        }
    }

    interface b {
        String a(String str);

        String b(String str);
    }

    private s() {
    }

    public static s c() {
        if (f113234b == null) {
            f113234b = new s();
        }
        return f113234b;
    }

    public String a(String str) {
        return this.f113235a.a(str);
    }

    public String b(String str) {
        return this.f113235a.b(str);
    }
}
