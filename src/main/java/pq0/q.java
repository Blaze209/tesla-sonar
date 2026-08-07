package pq0;

/* JADX INFO: loaded from: classes10.dex */
public class q extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.q f103737a = new sq0.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103739c;

    public q(int i11) {
        this.f103738b = i11;
    }

    @Override // uq0.a, uq0.d
    public boolean a() {
        return true;
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103737a;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        if (!hVar.b()) {
            return hVar.O() >= this.f103738b ? uq0.c.a(hVar.getColumn() + this.f103738b) : uq0.c.d();
        }
        if (this.f103737a.c() == null) {
            return uq0.c.d();
        }
        sq0.a aVarC = hVar.d().c();
        this.f103739c = (aVarC instanceof sq0.t) || (aVarC instanceof sq0.q);
        return uq0.c.b(hVar.c());
    }

    @Override // uq0.a, uq0.d
    public boolean f(sq0.a aVar) {
        if (!this.f103739c) {
            return true;
        }
        sq0.a aVarF = this.f103737a.f();
        if (!(aVarF instanceof sq0.p)) {
            return true;
        }
        ((sq0.p) aVarF).o(false);
        return true;
    }
}
