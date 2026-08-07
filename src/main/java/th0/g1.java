package th0;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements qj0.e<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<zf0.s> f113896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<zf0.r0> f113897b;

    public g1(qj0.i<zf0.s> iVar, qj0.i<zf0.r0> iVar2) {
        this.f113896a = iVar;
        this.f113897b = iVar2;
    }

    public static g1 a(qj0.i<zf0.s> iVar, qj0.i<zf0.r0> iVar2) {
        return new g1(iVar, iVar2);
    }

    public static f1 c(zf0.s sVar, zf0.r0 r0Var) {
        return new f1(sVar, r0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f113896a.get(), this.f113897b.get());
    }
}
