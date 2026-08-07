package lh0;

import a30.c0;
import java.util.Set;
import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<Set<c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f90034a = new f();
    }

    public static f a() {
        return a.f90034a;
    }

    public static Set<c0<?>> c() {
        return (Set) h.d(e.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<c0<?>> get() {
        return c();
    }
}
