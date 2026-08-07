package e5;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d5.e f61853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f61854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d5.e.b f61855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f61856e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61857f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f61858g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f61859h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f61860i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f61861j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61862a;

        static {
            int[] iArr = new int[d5.d.a.values().length];
            f61862a = iArr;
            try {
                iArr[d5.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61862a[d5.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61862a[d5.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61862a[d5.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61862a[d5.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(d5.e eVar) {
        this.f61853b = eVar;
    }

    private void l(int i11, int i12) {
        int i13 = this.f61852a;
        if (i13 == 0) {
            this.f61856e.d(g(i12, i11));
            return;
        }
        if (i13 == 1) {
            this.f61856e.d(Math.min(g(this.f61856e.f61821m, i11), i12));
            return;
        }
        if (i13 == 2) {
            d5.e eVarM = this.f61853b.M();
            if (eVarM != null) {
                g gVar = (i11 == 0 ? eVarM.f59436e : eVarM.f59438f).f61856e;
                if (gVar.f61818j) {
                    this.f61856e.d(g((int) ((gVar.f61815g * (i11 == 0 ? this.f61853b.B : this.f61853b.E)) + 0.5f), i11));
                    return;
                }
                return;
            }
            return;
        }
        if (i13 != 3) {
            return;
        }
        d5.e eVar = this.f61853b;
        p pVar = eVar.f59436e;
        d5.e.b bVar = pVar.f61855d;
        d5.e.b bVar2 = d5.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f61852a == 3) {
            n nVar = eVar.f59438f;
            if (nVar.f61855d == bVar2 && nVar.f61852a == 3) {
                return;
            }
        }
        if (i11 == 0) {
            pVar = eVar.f59438f;
        }
        if (pVar.f61856e.f61818j) {
            float fX = eVar.x();
            this.f61856e.d(i11 == 1 ? (int) ((pVar.f61856e.f61815g / fX) + 0.5f) : (int) ((fX * pVar.f61856e.f61815g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i11) {
        fVar.f61820l.add(fVar2);
        fVar.f61814f = i11;
        fVar2.f61819k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i11, g gVar) {
        fVar.f61820l.add(fVar2);
        fVar.f61820l.add(this.f61856e);
        fVar.f61816h = i11;
        fVar.f61817i = gVar;
        fVar2.f61819k.add(fVar);
        gVar.f61819k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i11, int i12) {
        if (i12 == 0) {
            d5.e eVar = this.f61853b;
            int i13 = eVar.A;
            int iMax = Math.max(eVar.f59478z, i11);
            if (i13 > 0) {
                iMax = Math.min(i13, i11);
            }
            if (iMax != i11) {
                return iMax;
            }
        } else {
            d5.e eVar2 = this.f61853b;
            int i14 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i11);
            if (i14 > 0) {
                iMax2 = Math.min(i14, i11);
            }
            if (iMax2 != i11) {
                return iMax2;
            }
        }
        return i11;
    }

    protected final f h(d5.d dVar) {
        d5.d dVar2 = dVar.f59424f;
        if (dVar2 == null) {
            return null;
        }
        d5.e eVar = dVar2.f59422d;
        int i11 = a.f61862a[dVar2.f59423e.ordinal()];
        if (i11 == 1) {
            return eVar.f59436e.f61859h;
        }
        if (i11 == 2) {
            return eVar.f59436e.f61860i;
        }
        if (i11 == 3) {
            return eVar.f59438f.f61859h;
        }
        if (i11 == 4) {
            return eVar.f59438f.f61835k;
        }
        if (i11 != 5) {
            return null;
        }
        return eVar.f59438f.f61860i;
    }

    protected final f i(d5.d dVar, int i11) {
        d5.d dVar2 = dVar.f59424f;
        if (dVar2 == null) {
            return null;
        }
        d5.e eVar = dVar2.f59422d;
        p pVar = i11 == 0 ? eVar.f59436e : eVar.f59438f;
        int i12 = a.f61862a[dVar2.f59423e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f61860i;
        }
        return pVar.f61859h;
    }

    public long j() {
        g gVar = this.f61856e;
        if (gVar.f61818j) {
            return gVar.f61815g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f61858g;
    }

    abstract boolean m();

    protected void n(d dVar, d5.d dVar2, d5.d dVar3, int i11) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f61818j && fVarH2.f61818j) {
            int iF = fVarH.f61815g + dVar2.f();
            int iF2 = fVarH2.f61815g - dVar3.f();
            int i12 = iF2 - iF;
            if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
                l(i11, i12);
            }
            g gVar = this.f61856e;
            if (gVar.f61818j) {
                if (gVar.f61815g == i12) {
                    this.f61859h.d(iF);
                    this.f61860i.d(iF2);
                    return;
                }
                float fA = i11 == 0 ? this.f61853b.A() : this.f61853b.T();
                if (fVarH == fVarH2) {
                    iF = fVarH.f61815g;
                    iF2 = fVarH2.f61815g;
                    fA = 0.5f;
                }
                this.f61859h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f61856e.f61815g) * fA)));
                this.f61860i.d(this.f61859h.f61815g + this.f61856e.f61815g);
            }
        }
    }

    @Override // e5.d
    public void a(d dVar) {
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
