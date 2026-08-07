package dj;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b<Object> f60685e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f60686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f60687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f60689d;

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t11, @NonNull MessageDigest messageDigest);
    }

    private g(@NonNull String str, T t11, @NonNull b<T> bVar) {
        this.f60688c = xj.k.b(str);
        this.f60686a = t11;
        this.f60687b = (b) xj.k.d(bVar);
    }

    @NonNull
    public static <T> g<T> a(@NonNull String str, T t11, @NonNull b<T> bVar) {
        return new g<>(str, t11, bVar);
    }

    @NonNull
    private static <T> b<T> b() {
        return (b<T>) f60685e;
    }

    @NonNull
    private byte[] d() {
        if (this.f60689d == null) {
            this.f60689d = this.f60688c.getBytes(e.f60683a);
        }
        return this.f60689d;
    }

    @NonNull
    public static <T> g<T> e(@NonNull String str) {
        return new g<>(str, null, b());
    }

    @NonNull
    public static <T> g<T> f(@NonNull String str, @NonNull T t11) {
        return new g<>(str, t11, b());
    }

    public T c() {
        return this.f60686a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f60688c.equals(((g) obj).f60688c);
        }
        return false;
    }

    public void g(@NonNull T t11, @NonNull MessageDigest messageDigest) {
        this.f60687b.a(d(), t11, messageDigest);
    }

    public int hashCode() {
        return this.f60688c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f60688c + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    class a implements b<Object> {
        a() {
        }

        @Override // dj.g.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
