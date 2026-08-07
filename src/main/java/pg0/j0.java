package pg0;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements qj0.e<i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<zf0.e0> f102549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<zf0.s> f102550b;

    public j0(qj0.i<zf0.e0> iVar, qj0.i<zf0.s> iVar2) {
        this.f102549a = iVar;
        this.f102550b = iVar2;
    }

    public static j0 a(qj0.i<zf0.e0> iVar, qj0.i<zf0.s> iVar2) {
        return new j0(iVar, iVar2);
    }

    public static i0 c(zf0.e0 e0Var, zf0.s sVar) {
        return new i0(e0Var, sVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i0 get() {
        return c(this.f102549a.get(), this.f102550b.get());
    }
}
