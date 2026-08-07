package zf0;

import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 implements qj0.e<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<v0> f128310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<MutableSharedFlow<dg0.c>> f128311b;

    public s0(qj0.i<v0> iVar, qj0.i<MutableSharedFlow<dg0.c>> iVar2) {
        this.f128310a = iVar;
        this.f128311b = iVar2;
    }

    public static s0 a(qj0.i<v0> iVar, qj0.i<MutableSharedFlow<dg0.c>> iVar2) {
        return new s0(iVar, iVar2);
    }

    public static r0 c(v0 v0Var, MutableSharedFlow<dg0.c> mutableSharedFlow) {
        return new r0(v0Var, mutableSharedFlow);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f128310a.get(), this.f128311b.get());
    }
}
