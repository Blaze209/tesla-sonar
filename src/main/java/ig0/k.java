package ig0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements qj0.e<Set<a30.c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f77786a = new k();
    }

    public static k a() {
        return a.f77786a;
    }

    public static Set<a30.c0<?>> c() {
        return (Set) qj0.h.d(j.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a30.c0<?>> get() {
        return c();
    }
}
