package e5;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    j(d5.e eVar) {
        super(eVar);
        eVar.f59436e.f();
        eVar.f59438f.f();
        this.f61857f = ((d5.h) eVar).x1();
    }

    private void q(f fVar) {
        this.f61859h.f61819k.add(fVar);
        fVar.f61820l.add(this.f61859h);
    }

    @Override // e5.p, e5.d
    public void a(d dVar) {
        f fVar = this.f61859h;
        if (fVar.f61811c && !fVar.f61818j) {
            this.f61859h.d((int) ((fVar.f61820l.get(0).f61815g * ((d5.h) this.f61853b).A1()) + 0.5f));
        }
    }

    @Override // e5.p
    void d() {
        d5.h hVar = (d5.h) this.f61853b;
        int iY1 = hVar.y1();
        int iZ1 = hVar.z1();
        hVar.A1();
        if (hVar.x1() == 1) {
            if (iY1 != -1) {
                this.f61859h.f61820l.add(this.f61853b.f59433c0.f59436e.f61859h);
                this.f61853b.f59433c0.f59436e.f61859h.f61819k.add(this.f61859h);
                this.f61859h.f61814f = iY1;
            } else if (iZ1 != -1) {
                this.f61859h.f61820l.add(this.f61853b.f59433c0.f59436e.f61860i);
                this.f61853b.f59433c0.f59436e.f61860i.f61819k.add(this.f61859h);
                this.f61859h.f61814f = -iZ1;
            } else {
                f fVar = this.f61859h;
                fVar.f61810b = true;
                fVar.f61820l.add(this.f61853b.f59433c0.f59436e.f61860i);
                this.f61853b.f59433c0.f59436e.f61860i.f61819k.add(this.f61859h);
            }
            q(this.f61853b.f59436e.f61859h);
            q(this.f61853b.f59436e.f61860i);
            return;
        }
        if (iY1 != -1) {
            this.f61859h.f61820l.add(this.f61853b.f59433c0.f59438f.f61859h);
            this.f61853b.f59433c0.f59438f.f61859h.f61819k.add(this.f61859h);
            this.f61859h.f61814f = iY1;
        } else if (iZ1 != -1) {
            this.f61859h.f61820l.add(this.f61853b.f59433c0.f59438f.f61860i);
            this.f61853b.f59433c0.f59438f.f61860i.f61819k.add(this.f61859h);
            this.f61859h.f61814f = -iZ1;
        } else {
            f fVar2 = this.f61859h;
            fVar2.f61810b = true;
            fVar2.f61820l.add(this.f61853b.f59433c0.f59438f.f61860i);
            this.f61853b.f59433c0.f59438f.f61860i.f61819k.add(this.f61859h);
        }
        q(this.f61853b.f59438f.f61859h);
        q(this.f61853b.f59438f.f61860i);
    }

    @Override // e5.p
    public void e() {
        if (((d5.h) this.f61853b).x1() == 1) {
            this.f61853b.r1(this.f61859h.f61815g);
        } else {
            this.f61853b.s1(this.f61859h.f61815g);
        }
    }

    @Override // e5.p
    void f() {
        this.f61859h.c();
    }

    @Override // e5.p
    boolean m() {
        return false;
    }
}
