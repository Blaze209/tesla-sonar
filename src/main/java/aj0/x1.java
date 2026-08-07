package aj0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 implements qj0.e<Set<Object>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x1 f1701a = new x1();
    }

    public static x1 a() {
        return a.f1701a;
    }

    public static Set<Object> c() {
        return (Set) qj0.h.d(w1.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<Object> get() {
        return c();
    }
}
