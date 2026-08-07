package hh0;

import a30.c0;
import a30.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements qj0.e<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Set<c0<?>>> f72845a;

    public q(qj0.i<Set<c0<?>>> iVar) {
        this.f72845a = iVar;
    }

    public static q a(qj0.i<Set<c0<?>>> iVar) {
        return new q(iVar);
    }

    public static e0 c(Set<c0<?>> set) {
        return (e0) qj0.h.d(com.withpersona.sdk2.inquiry.internal.network.f.m(set));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f72845a.get());
    }
}
