package e5;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61821m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f61813e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f61813e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // e5.f
    public void d(int i11) {
        if (this.f61818j) {
            return;
        }
        this.f61818j = true;
        this.f61815g = i11;
        for (d dVar : this.f61819k) {
            dVar.a(dVar);
        }
    }
}
