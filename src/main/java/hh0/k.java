package hh0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements qj0.e<Set<Object>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f72837a = new k();
    }

    public static k a() {
        return a.f72837a;
    }

    public static Set<Object> c() {
        return (Set) qj0.h.d(com.withpersona.sdk2.inquiry.internal.network.f.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<Object> get() {
        return c();
    }
}
