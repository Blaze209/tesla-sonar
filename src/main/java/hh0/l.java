package hh0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements qj0.e<Set<com.squareup.moshi.h.e>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f72838a = new l();
    }

    public static l a() {
        return a.f72838a;
    }

    public static Set<com.squareup.moshi.h.e> c() {
        return (Set) qj0.h.d(com.withpersona.sdk2.inquiry.internal.network.f.h());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<com.squareup.moshi.h.e> get() {
        return c();
    }
}
