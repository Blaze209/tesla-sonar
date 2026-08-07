package rh0;

import a30.c0;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements qj0.e<Set<c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f108269a = new h();
    }

    public static h a() {
        return a.f108269a;
    }

    public static Set<c0<?>> c() {
        return (Set) qj0.h.d(f.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<c0<?>> get() {
        return c();
    }
}
