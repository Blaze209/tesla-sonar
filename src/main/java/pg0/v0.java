package pg0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 implements qj0.e<Set<com.squareup.moshi.h.e>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final v0 f102903a = new v0();
    }

    public static v0 a() {
        return a.f102903a;
    }

    public static Set<com.squareup.moshi.h.e> c() {
        return (Set) qj0.h.d(u0.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<com.squareup.moshi.h.e> get() {
        return c();
    }
}
