package e40;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements qj0.e<Set<String>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final u f61776a = new u();
    }

    public static u a() {
        return a.f61776a;
    }

    public static Set<String> c() {
        return (Set) qj0.h.d(l.INSTANCE.k());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> get() {
        return c();
    }
}
