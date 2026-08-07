package v70;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements qj0.e<Set<String>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i0 f118250a = new i0();
    }

    public static i0 a() {
        return a.f118250a;
    }

    public static Set<String> c() {
        return (Set) qj0.h.d(f0.INSTANCE.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> get() {
        return c();
    }
}
