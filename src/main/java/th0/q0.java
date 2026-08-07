package th0;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements qj0.e<o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<zf0.s> f114096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<zf0.r0> f114097b;

    public q0(qj0.i<zf0.s> iVar, qj0.i<zf0.r0> iVar2) {
        this.f114096a = iVar;
        this.f114097b = iVar2;
    }

    public static q0 a(qj0.i<zf0.s> iVar, qj0.i<zf0.r0> iVar2) {
        return new q0(iVar, iVar2);
    }

    public static o0 c(zf0.s sVar, zf0.r0 r0Var) {
        return new o0(sVar, r0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f114096a.get(), this.f114097b.get());
    }
}
