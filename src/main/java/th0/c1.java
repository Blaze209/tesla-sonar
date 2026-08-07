package th0;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<zf0.r0> f113591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<fi0.c> f113592b;

    public c1(qj0.i<zf0.r0> iVar, qj0.i<fi0.c> iVar2) {
        this.f113591a = iVar;
        this.f113592b = iVar2;
    }

    public static c1 a(qj0.i<zf0.r0> iVar, qj0.i<fi0.c> iVar2) {
        return new c1(iVar, iVar2);
    }

    public static b1 c(zf0.r0 r0Var, a1.b bVar, boolean z11, fi0.c cVar) {
        return new b1(r0Var, bVar, z11, cVar);
    }

    public b1 b(a1.b bVar, boolean z11) {
        return c(this.f113591a.get(), bVar, z11, this.f113592b.get());
    }
}
