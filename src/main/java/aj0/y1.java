package aj0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 implements qj0.e<Set<a30.c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final y1 f1711a = new y1();
    }

    public static y1 a() {
        return a.f1711a;
    }

    public static Set<a30.c0<?>> c() {
        return (Set) qj0.h.d(w1.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a30.c0<?>> get() {
        return c();
    }
}
