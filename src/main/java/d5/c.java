package d5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f59397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f59398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f59399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f59400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f59401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f59402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f59403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f59404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f59405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f59406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f59407k = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f59408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f59409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f59410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f59411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f59412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f59413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f59414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f59415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f59416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f59417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f59418v;

    public c(e eVar, int i11, boolean z11) {
        this.f59397a = eVar;
        this.f59412p = i11;
        this.f59413q = z11;
    }

    private void b() {
        int i11 = this.f59412p * 2;
        e eVar = this.f59397a;
        this.f59411o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f59405i++;
            e[] eVarArr = eVar.P0;
            int i12 = this.f59412p;
            e eVar3 = null;
            eVarArr[i12] = null;
            eVar.O0[i12] = null;
            if (eVar.X() != 8) {
                this.f59408l++;
                e.b bVarW = eVar.w(this.f59412p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarW != bVar) {
                    this.f59409m += eVar.G(this.f59412p);
                }
                int iF = this.f59409m + eVar.Y[i11].f();
                this.f59409m = iF;
                int i13 = i11 + 1;
                this.f59409m = iF + eVar.Y[i13].f();
                int iF2 = this.f59410n + eVar.Y[i11].f();
                this.f59410n = iF2;
                this.f59410n = iF2 + eVar.Y[i13].f();
                if (this.f59398b == null) {
                    this.f59398b = eVar;
                }
                this.f59400d = eVar;
                e.b[] bVarArr = eVar.f59431b0;
                int i14 = this.f59412p;
                if (bVarArr[i14] == bVar) {
                    int i15 = eVar.f59476y[i14];
                    if (i15 == 0 || i15 == 3 || i15 == 2) {
                        this.f59406j++;
                        float f11 = eVar.N0[i14];
                        if (f11 > BitmapDescriptorFactory.HUE_RED) {
                            this.f59407k += f11;
                        }
                        if (c(eVar, i14)) {
                            if (f11 < BitmapDescriptorFactory.HUE_RED) {
                                this.f59414r = true;
                            } else {
                                this.f59415s = true;
                            }
                            if (this.f59404h == null) {
                                this.f59404h = new ArrayList<>();
                            }
                            this.f59404h.add(eVar);
                        }
                        if (this.f59402f == null) {
                            this.f59402f = eVar;
                        }
                        e eVar4 = this.f59403g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f59412p] = eVar;
                        }
                        this.f59403g = eVar;
                    }
                    if (this.f59412p == 0) {
                        if (eVar.f59472w != 0 || eVar.f59478z != 0 || eVar.A != 0) {
                            this.f59411o = false;
                        }
                    } else if (eVar.f59474x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f59411o = false;
                    }
                    if (eVar.f59439f0 != BitmapDescriptorFactory.HUE_RED) {
                        this.f59411o = false;
                        this.f59417u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f59412p] = eVar;
            }
            d dVar = eVar.Y[i11 + 1].f59424f;
            if (dVar != null) {
                e eVar5 = dVar.f59422d;
                d dVar2 = eVar5.Y[i11].f59424f;
                if (dVar2 != null && dVar2.f59422d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f59398b;
        if (eVar6 != null) {
            this.f59409m -= eVar6.Y[i11].f();
        }
        e eVar7 = this.f59400d;
        if (eVar7 != null) {
            this.f59409m -= eVar7.Y[i11 + 1].f();
        }
        this.f59399c = eVar;
        if (this.f59412p == 0 && this.f59413q) {
            this.f59401e = eVar;
        } else {
            this.f59401e = this.f59397a;
        }
        this.f59416t = this.f59415s && this.f59414r;
    }

    private static boolean c(e eVar, int i11) {
        if (eVar.X() == 8 || eVar.f59431b0[i11] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i12 = eVar.f59476y[i11];
        return i12 == 0 || i12 == 3;
    }

    public void a() {
        if (!this.f59418v) {
            b();
        }
        this.f59418v = true;
    }
}
