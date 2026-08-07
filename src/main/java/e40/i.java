package e40;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements qj0.e<Set<String>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f61754a = new i();
    }

    public static i a() {
        return a.f61754a;
    }

    public static Set<String> c() {
        return (Set) qj0.h.d(c.INSTANCE.h());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> get() {
        return c();
    }
}
