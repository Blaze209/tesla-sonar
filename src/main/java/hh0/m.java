package hh0;

import a30.c0;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qj0.e<Set<c0<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f72839a = new m();
    }

    public static m a() {
        return a.f72839a;
    }

    public static Set<c0<?>> c() {
        return (Set) qj0.h.d(com.withpersona.sdk2.inquiry.internal.network.f.i());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<c0<?>> get() {
        return c();
    }
}
