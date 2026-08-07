package pg0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 implements qj0.e<Set<a30.c0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<i0> f102928a;

    public w0(qj0.i<i0> iVar) {
        this.f102928a = iVar;
    }

    public static w0 a(qj0.i<i0> iVar) {
        return new w0(iVar);
    }

    public static Set<a30.c0<?>> c(i0 i0Var) {
        return (Set) qj0.h.d(u0.b(i0Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a30.c0<?>> get() {
        return c(this.f102928a.get());
    }
}
