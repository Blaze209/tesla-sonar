package oh0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 implements qj0.e<Set<a30.c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j1 f97406a = new j1();
    }

    public static j1 a() {
        return a.f97406a;
    }

    public static Set<a30.c0<?>> c() {
        return (Set) qj0.h.d(i1.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a30.c0<?>> get() {
        return c();
    }
}
