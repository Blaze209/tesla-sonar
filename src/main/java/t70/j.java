package t70;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<Set<String>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f112865a = new j();
    }

    public static j a() {
        return a.f112865a;
    }

    public static Set<String> c() {
        return (Set) qj0.h.d(g.f112862a.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> get() {
        return c();
    }
}
