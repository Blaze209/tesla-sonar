package d5;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class m extends j {
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f59546a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f59547b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f59548c1 = 0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f59549d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f59550e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f59551f1 = false;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f59552g1 = 0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f59553h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    protected e5.b.a f59554i1 = new e5.b.a();

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    e5.b.InterfaceC1268b f59555j1 = null;

    public boolean A1(HashSet<e> hashSet) {
        for (int i11 = 0; i11 < this.W0; i11++) {
            if (hashSet.contains(this.V0[i11])) {
                return true;
            }
        }
        return false;
    }

    public int B1() {
        return this.f59553h1;
    }

    public int C1() {
        return this.f59552g1;
    }

    public int D1() {
        return this.Y0;
    }

    public int E1() {
        return this.f59549d1;
    }

    public int F1() {
        return this.f59550e1;
    }

    public int G1() {
        return this.X0;
    }

    protected void I1(e eVar, e.b bVar, int i11, e.b bVar2, int i12) {
        while (this.f59555j1 == null && M() != null) {
            this.f59555j1 = ((f) M()).O1();
        }
        e5.b.a aVar = this.f59554i1;
        aVar.f61788a = bVar;
        aVar.f61789b = bVar2;
        aVar.f61790c = i11;
        aVar.f61791d = i12;
        this.f59555j1.b(eVar, aVar);
        eVar.p1(this.f59554i1.f61792e);
        eVar.Q0(this.f59554i1.f61793f);
        eVar.P0(this.f59554i1.f61795h);
        eVar.F0(this.f59554i1.f61794g);
    }

    protected boolean J1() {
        e eVar = this.f59433c0;
        e5.b.InterfaceC1268b interfaceC1268bO1 = eVar != null ? ((f) eVar).O1() : null;
        if (interfaceC1268bO1 == null) {
            return false;
        }
        for (int i11 = 0; i11 < this.W0; i11++) {
            e eVar2 = this.V0[i11];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarW = eVar2.w(0);
                e.b bVarW2 = eVar2.w(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarW != bVar || eVar2.f59472w == 1 || bVarW2 != bVar || eVar2.f59474x == 1) {
                    if (bVarW == bVar) {
                        bVarW = e.b.WRAP_CONTENT;
                    }
                    if (bVarW2 == bVar) {
                        bVarW2 = e.b.WRAP_CONTENT;
                    }
                    e5.b.a aVar = this.f59554i1;
                    aVar.f61788a = bVarW;
                    aVar.f61789b = bVarW2;
                    aVar.f61790c = eVar2.Y();
                    this.f59554i1.f61791d = eVar2.z();
                    interfaceC1268bO1.b(eVar2, this.f59554i1);
                    eVar2.p1(this.f59554i1.f61792e);
                    eVar2.Q0(this.f59554i1.f61793f);
                    eVar2.F0(this.f59554i1.f61794g);
                }
            }
        }
        return true;
    }

    public boolean K1() {
        return this.f59551f1;
    }

    protected void L1(boolean z11) {
        this.f59551f1 = z11;
    }

    public void M1(int i11, int i12) {
        this.f59552g1 = i11;
        this.f59553h1 = i12;
    }

    public void N1(int i11) {
        this.Z0 = i11;
        this.X0 = i11;
        this.f59546a1 = i11;
        this.Y0 = i11;
        this.f59547b1 = i11;
        this.f59548c1 = i11;
    }

    public void O1(int i11) {
        this.Y0 = i11;
    }

    public void P1(int i11) {
        this.f59548c1 = i11;
    }

    public void Q1(int i11) {
        this.Z0 = i11;
        this.f59549d1 = i11;
    }

    public void R1(int i11) {
        this.f59546a1 = i11;
        this.f59550e1 = i11;
    }

    public void S1(int i11) {
        this.f59547b1 = i11;
        this.f59549d1 = i11;
        this.f59550e1 = i11;
    }

    public void T1(int i11) {
        this.X0 = i11;
    }

    @Override // d5.j, d5.i
    public void c(f fVar) {
        z1();
    }

    public void y1(boolean z11) {
        int i11 = this.f59547b1;
        if (i11 > 0 || this.f59548c1 > 0) {
            if (z11) {
                this.f59549d1 = this.f59548c1;
                this.f59550e1 = i11;
            } else {
                this.f59549d1 = i11;
                this.f59550e1 = this.f59548c1;
            }
        }
    }

    public void z1() {
        for (int i11 = 0; i11 < this.W0; i11++) {
            e eVar = this.V0[i11];
            if (eVar != null) {
                eVar.Z0(true);
            }
        }
    }

    public void H1(int i11, int i12, int i13, int i14) {
    }
}
