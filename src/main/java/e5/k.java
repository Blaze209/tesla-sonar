package e5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    k(d5.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f61859h.f61819k.add(fVar);
        fVar.f61820l.add(this.f61859h);
    }

    @Override // e5.p, e5.d
    public void a(d dVar) {
        d5.a aVar = (d5.a) this.f61853b;
        int iA1 = aVar.A1();
        Iterator<f> it = this.f61859h.f61820l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = it.next().f61815g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (iA1 == 0 || iA1 == 2) {
            this.f61859h.d(i12 + aVar.B1());
        } else {
            this.f61859h.d(i11 + aVar.B1());
        }
    }

    @Override // e5.p
    void d() {
        d5.e eVar = this.f61853b;
        if (eVar instanceof d5.a) {
            this.f61859h.f61810b = true;
            d5.a aVar = (d5.a) eVar;
            int iA1 = aVar.A1();
            boolean zZ1 = aVar.z1();
            int i11 = 0;
            if (iA1 == 0) {
                this.f61859h.f61813e = f.a.LEFT;
                while (i11 < aVar.W0) {
                    d5.e eVar2 = aVar.V0[i11];
                    if (zZ1 || eVar2.X() != 8) {
                        f fVar = eVar2.f59436e.f61859h;
                        fVar.f61819k.add(this.f61859h);
                        this.f61859h.f61820l.add(fVar);
                    }
                    i11++;
                }
                q(this.f61853b.f59436e.f61859h);
                q(this.f61853b.f59436e.f61860i);
                return;
            }
            if (iA1 == 1) {
                this.f61859h.f61813e = f.a.RIGHT;
                while (i11 < aVar.W0) {
                    d5.e eVar3 = aVar.V0[i11];
                    if (zZ1 || eVar3.X() != 8) {
                        f fVar2 = eVar3.f59436e.f61860i;
                        fVar2.f61819k.add(this.f61859h);
                        this.f61859h.f61820l.add(fVar2);
                    }
                    i11++;
                }
                q(this.f61853b.f59436e.f61859h);
                q(this.f61853b.f59436e.f61860i);
                return;
            }
            if (iA1 == 2) {
                this.f61859h.f61813e = f.a.TOP;
                while (i11 < aVar.W0) {
                    d5.e eVar4 = aVar.V0[i11];
                    if (zZ1 || eVar4.X() != 8) {
                        f fVar3 = eVar4.f59438f.f61859h;
                        fVar3.f61819k.add(this.f61859h);
                        this.f61859h.f61820l.add(fVar3);
                    }
                    i11++;
                }
                q(this.f61853b.f59438f.f61859h);
                q(this.f61853b.f59438f.f61860i);
                return;
            }
            if (iA1 != 3) {
                return;
            }
            this.f61859h.f61813e = f.a.BOTTOM;
            while (i11 < aVar.W0) {
                d5.e eVar5 = aVar.V0[i11];
                if (zZ1 || eVar5.X() != 8) {
                    f fVar4 = eVar5.f59438f.f61860i;
                    fVar4.f61819k.add(this.f61859h);
                    this.f61859h.f61820l.add(fVar4);
                }
                i11++;
            }
            q(this.f61853b.f59438f.f61859h);
            q(this.f61853b.f59438f.f61860i);
        }
    }

    @Override // e5.p
    public void e() {
        d5.e eVar = this.f61853b;
        if (eVar instanceof d5.a) {
            int iA1 = ((d5.a) eVar).A1();
            if (iA1 == 0 || iA1 == 1) {
                this.f61853b.r1(this.f61859h.f61815g);
            } else {
                this.f61853b.s1(this.f61859h.f61815g);
            }
        }
    }

    @Override // e5.p
    void f() {
        this.f61854c = null;
        this.f61859h.c();
    }

    @Override // e5.p
    boolean m() {
        return false;
    }
}
