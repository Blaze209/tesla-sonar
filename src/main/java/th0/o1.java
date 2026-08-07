package th0;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 implements qj0.e<Set<a30.c0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<o0> f114063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<f1> f114064b;

    public o1(qj0.i<o0> iVar, qj0.i<f1> iVar2) {
        this.f114063a = iVar;
        this.f114064b = iVar2;
    }

    public static o1 a(qj0.i<o0> iVar, qj0.i<f1> iVar2) {
        return new o1(iVar, iVar2);
    }

    public static Set<a30.c0<?>> c(o0 o0Var, f1 f1Var) {
        return (Set) qj0.h.d(n1.a(o0Var, f1Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a30.c0<?>> get() {
        return c(this.f114063a.get(), this.f114064b.get());
    }
}
