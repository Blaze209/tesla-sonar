package ab0;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lab0/b;", "", "<init>", "()V", "Ljava/security/cert/Certificate;", "cert", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "_cache", "b", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ConcurrentHashMap<byte[], String> _cache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ab0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lab0/b$a;", "", "<init>", "()V", "Ljava/security/PublicKey;", "publicKey", "", "a", "(Ljava/security/PublicKey;)Ljava/lang/String;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(PublicKey publicKey) {
            s.k(publicKey, "publicKey");
            String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded()), 2);
            s.j(strEncodeToString, "encodeToString(digest, Base64.NO_WRAP)");
            return strEncodeToString;
        }

        private Companion() {
        }
    }

    public final String a(Certificate cert) {
        s.k(cert, "cert");
        String str = this._cache.get(cert.getPublicKey().getEncoded());
        if (str != null) {
            return str;
        }
        Companion companion = INSTANCE;
        PublicKey publicKey = cert.getPublicKey();
        s.j(publicKey, "cert.publicKey");
        String strA = companion.a(publicKey);
        this._cache.put(cert.getPublicKey().getEncoded(), strA);
        return strA;
    }
}
