package b5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f16418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C0323a[] f16419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16420c = true;

    /* JADX INFO: renamed from: b5.a$a, reason: collision with other inner class name */
    private static class C0323a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static double[] f16421s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double[] f16422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f16423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f16424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f16425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f16426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f16427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f16428g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        double f16429h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        double f16430i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        double f16431j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        double f16432k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        double f16433l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        double f16434m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f16435n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double f16436o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f16437p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f16438q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f16439r;

        C0323a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            this.f16439r = false;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            if (i11 == 1) {
                this.f16438q = true;
            } else if (i11 == 4) {
                this.f16438q = d18 > 0.0d;
            } else if (i11 != 5) {
                this.f16438q = false;
            } else {
                this.f16438q = d18 < 0.0d;
            }
            this.f16424c = d11;
            this.f16425d = d12;
            this.f16430i = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.f16439r = true;
            }
            if (!this.f16439r && Math.abs(d17) >= 0.001d && Math.abs(d18) >= 0.001d) {
                this.f16422a = new double[101];
                boolean z11 = this.f16438q;
                this.f16431j = d17 * ((double) (z11 ? -1 : 1));
                this.f16432k = d18 * ((double) (z11 ? 1 : -1));
                this.f16433l = z11 ? d15 : d13;
                this.f16434m = z11 ? d14 : d16;
                a(d13, d14, d15, d16);
                this.f16435n = this.f16423b * this.f16430i;
                return;
            }
            this.f16439r = true;
            this.f16426e = d13;
            this.f16427f = d15;
            this.f16428g = d14;
            this.f16429h = d16;
            double dHypot = Math.hypot(d18, d17);
            this.f16423b = dHypot;
            this.f16435n = dHypot * this.f16430i;
            double d19 = this.f16425d;
            double d21 = this.f16424c;
            this.f16433l = d17 / (d19 - d21);
            this.f16434m = d18 / (d19 - d21);
        }

        private void a(double d11, double d12, double d13, double d14) {
            double d15 = d13 - d11;
            double d16 = d12 - d14;
            int i11 = 0;
            double dHypot = 0.0d;
            double d17 = 0.0d;
            double d18 = 0.0d;
            while (true) {
                double[] dArr = f16421s;
                if (i11 >= dArr.length) {
                    break;
                }
                int i12 = i11;
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d15;
                double dCos = Math.cos(radians) * d16;
                if (i12 > 0) {
                    dHypot += Math.hypot(dSin - d17, dCos - d18);
                    f16421s[i12] = dHypot;
                }
                i11 = i12 + 1;
                d17 = dSin;
                d18 = dCos;
            }
            this.f16423b = dHypot;
            int i13 = 0;
            while (true) {
                double[] dArr2 = f16421s;
                if (i13 >= dArr2.length) {
                    break;
                }
                dArr2[i13] = dArr2[i13] / dHypot;
                i13++;
            }
            int i14 = 0;
            while (true) {
                double[] dArr3 = this.f16422a;
                if (i14 >= dArr3.length) {
                    return;
                }
                double length = ((double) i14) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f16421s, length);
                if (iBinarySearch >= 0) {
                    this.f16422a[i14] = ((double) iBinarySearch) / ((double) (f16421s.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f16422a[i14] = 0.0d;
                } else {
                    int i15 = -iBinarySearch;
                    int i16 = i15 - 2;
                    double[] dArr4 = f16421s;
                    double d19 = dArr4[i16];
                    this.f16422a[i14] = (((double) i16) + ((length - d19) / (dArr4[i15 - 1] - d19))) / ((double) (dArr4.length - 1));
                }
                i14++;
            }
        }

        double b() {
            double d11 = this.f16431j * this.f16437p;
            double dHypot = this.f16435n / Math.hypot(d11, (-this.f16432k) * this.f16436o);
            return this.f16438q ? (-d11) * dHypot : d11 * dHypot;
        }

        double c() {
            double d11 = this.f16431j * this.f16437p;
            double d12 = (-this.f16432k) * this.f16436o;
            double dHypot = this.f16435n / Math.hypot(d11, d12);
            return this.f16438q ? (-d12) * dHypot : d12 * dHypot;
        }

        public double d(double d11) {
            return this.f16433l;
        }

        public double e(double d11) {
            return this.f16434m;
        }

        public double f(double d11) {
            double d12 = (d11 - this.f16424c) * this.f16430i;
            double d13 = this.f16426e;
            return d13 + (d12 * (this.f16427f - d13));
        }

        public double g(double d11) {
            double d12 = (d11 - this.f16424c) * this.f16430i;
            double d13 = this.f16428g;
            return d13 + (d12 * (this.f16429h - d13));
        }

        double h() {
            return this.f16433l + (this.f16431j * this.f16436o);
        }

        double i() {
            return this.f16434m + (this.f16432k * this.f16437p);
        }

        double j(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f16422a;
            double length = d11 * ((double) (dArr.length - 1));
            int i11 = (int) length;
            double d12 = length - ((double) i11);
            double d13 = dArr[i11];
            return d13 + (d12 * (dArr[i11 + 1] - d13));
        }

        void k(double d11) {
            double dJ = j((this.f16438q ? this.f16425d - d11 : d11 - this.f16424c) * this.f16430i) * 1.5707963267948966d;
            this.f16436o = Math.sin(dJ);
            this.f16437p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f16418a = dArr;
        this.f16419b = new C0323a[dArr.length - 1];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (true) {
            C0323a[] c0323aArr = this.f16419b;
            if (i13 >= c0323aArr.length) {
                return;
            }
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 != 0) {
                if (i14 == 1) {
                    i11 = 1;
                    i15 = i11;
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            i15 = 4;
                            if (i14 != 4) {
                                i15 = 5;
                                if (i14 != 5) {
                                    i15 = i12;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                i11 = 1;
                            }
                            i15 = i11;
                        }
                    }
                    i11 = 2;
                    i15 = i11;
                }
            }
            double d11 = dArr[i13];
            int i16 = i13 + 1;
            double d12 = dArr[i16];
            double[] dArr3 = dArr2[i13];
            double d13 = dArr3[0];
            double d14 = dArr3[1];
            double[] dArr4 = dArr2[i16];
            c0323aArr[i13] = new C0323a(i15, d11, d12, d13, d14, dArr4[0], dArr4[1]);
            i13 = i16;
            i12 = i15;
        }
    }

    @Override // b5.b
    public double c(double d11, int i11) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i12 = 0;
        if (this.f16420c) {
            C0323a[] c0323aArr = this.f16419b;
            C0323a c0323a = c0323aArr[0];
            double d12 = c0323a.f16424c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0323a.f16439r) {
                    if (i11 == 0) {
                        dG2 = c0323a.f(d12);
                        dE2 = this.f16419b[0].d(d12);
                    } else {
                        dG2 = c0323a.g(d12);
                        dE2 = this.f16419b[0].e(d12);
                    }
                    return dG2 + (d13 * dE2);
                }
                c0323a.k(d12);
                if (i11 == 0) {
                    dI = this.f16419b[0].h();
                    dC = this.f16419b[0].b();
                } else {
                    dI = this.f16419b[0].i();
                    dC = this.f16419b[0].c();
                }
                return dI + (d13 * dC);
            }
            if (d11 > c0323aArr[c0323aArr.length - 1].f16425d) {
                double d14 = c0323aArr[c0323aArr.length - 1].f16425d;
                double d15 = d11 - d14;
                int length = c0323aArr.length - 1;
                if (i11 == 0) {
                    dG = c0323aArr[length].f(d14);
                    dE = this.f16419b[length].d(d14);
                } else {
                    dG = c0323aArr[length].g(d14);
                    dE = this.f16419b[length].e(d14);
                }
                return dG + (d15 * dE);
            }
        } else {
            C0323a[] c0323aArr2 = this.f16419b;
            double d16 = c0323aArr2[0].f16424c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > c0323aArr2[c0323aArr2.length - 1].f16425d) {
                d11 = c0323aArr2[c0323aArr2.length - 1].f16425d;
            }
        }
        while (true) {
            C0323a[] c0323aArr3 = this.f16419b;
            if (i12 >= c0323aArr3.length) {
                return Double.NaN;
            }
            C0323a c0323a2 = c0323aArr3[i12];
            if (d11 <= c0323a2.f16425d) {
                if (c0323a2.f16439r) {
                    return i11 == 0 ? c0323a2.f(d11) : c0323a2.g(d11);
                }
                c0323a2.k(d11);
                return i11 == 0 ? this.f16419b[i12].h() : this.f16419b[i12].i();
            }
            i12++;
        }
    }

    @Override // b5.b
    public void d(double d11, double[] dArr) {
        if (this.f16420c) {
            C0323a[] c0323aArr = this.f16419b;
            C0323a c0323a = c0323aArr[0];
            double d12 = c0323a.f16424c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0323a.f16439r) {
                    dArr[0] = c0323a.f(d12) + (this.f16419b[0].d(d12) * d13);
                    dArr[1] = this.f16419b[0].g(d12) + (d13 * this.f16419b[0].e(d12));
                    return;
                } else {
                    c0323a.k(d12);
                    dArr[0] = this.f16419b[0].h() + (this.f16419b[0].b() * d13);
                    dArr[1] = this.f16419b[0].i() + (d13 * this.f16419b[0].c());
                    return;
                }
            }
            if (d11 > c0323aArr[c0323aArr.length - 1].f16425d) {
                double d14 = c0323aArr[c0323aArr.length - 1].f16425d;
                double d15 = d11 - d14;
                int length = c0323aArr.length - 1;
                C0323a c0323a2 = c0323aArr[length];
                if (c0323a2.f16439r) {
                    dArr[0] = c0323a2.f(d14) + (this.f16419b[length].d(d14) * d15);
                    dArr[1] = this.f16419b[length].g(d14) + (d15 * this.f16419b[length].e(d14));
                    return;
                } else {
                    c0323a2.k(d11);
                    dArr[0] = this.f16419b[length].h() + (this.f16419b[length].b() * d15);
                    dArr[1] = this.f16419b[length].i() + (d15 * this.f16419b[length].c());
                    return;
                }
            }
        } else {
            C0323a[] c0323aArr2 = this.f16419b;
            double d16 = c0323aArr2[0].f16424c;
            if (d11 < d16) {
                d11 = d16;
            }
            if (d11 > c0323aArr2[c0323aArr2.length - 1].f16425d) {
                d11 = c0323aArr2[c0323aArr2.length - 1].f16425d;
            }
        }
        int i11 = 0;
        while (true) {
            C0323a[] c0323aArr3 = this.f16419b;
            if (i11 >= c0323aArr3.length) {
                return;
            }
            C0323a c0323a3 = c0323aArr3[i11];
            if (d11 <= c0323a3.f16425d) {
                if (c0323a3.f16439r) {
                    dArr[0] = c0323a3.f(d11);
                    dArr[1] = this.f16419b[i11].g(d11);
                    return;
                } else {
                    c0323a3.k(d11);
                    dArr[0] = this.f16419b[i11].h();
                    dArr[1] = this.f16419b[i11].i();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // b5.b
    public void e(double d11, float[] fArr) {
        if (this.f16420c) {
            C0323a[] c0323aArr = this.f16419b;
            C0323a c0323a = c0323aArr[0];
            double d12 = c0323a.f16424c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0323a.f16439r) {
                    fArr[0] = (float) (c0323a.f(d12) + (this.f16419b[0].d(d12) * d13));
                    fArr[1] = (float) (this.f16419b[0].g(d12) + (d13 * this.f16419b[0].e(d12)));
                    return;
                } else {
                    c0323a.k(d12);
                    fArr[0] = (float) (this.f16419b[0].h() + (this.f16419b[0].b() * d13));
                    fArr[1] = (float) (this.f16419b[0].i() + (d13 * this.f16419b[0].c()));
                    return;
                }
            }
            if (d11 > c0323aArr[c0323aArr.length - 1].f16425d) {
                double d14 = c0323aArr[c0323aArr.length - 1].f16425d;
                double d15 = d11 - d14;
                int length = c0323aArr.length - 1;
                C0323a c0323a2 = c0323aArr[length];
                if (c0323a2.f16439r) {
                    fArr[0] = (float) (c0323a2.f(d14) + (this.f16419b[length].d(d14) * d15));
                    fArr[1] = (float) (this.f16419b[length].g(d14) + (d15 * this.f16419b[length].e(d14)));
                    return;
                } else {
                    c0323a2.k(d11);
                    fArr[0] = (float) this.f16419b[length].h();
                    fArr[1] = (float) this.f16419b[length].i();
                    return;
                }
            }
        } else {
            C0323a[] c0323aArr2 = this.f16419b;
            double d16 = c0323aArr2[0].f16424c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > c0323aArr2[c0323aArr2.length - 1].f16425d) {
                d11 = c0323aArr2[c0323aArr2.length - 1].f16425d;
            }
        }
        int i11 = 0;
        while (true) {
            C0323a[] c0323aArr3 = this.f16419b;
            if (i11 >= c0323aArr3.length) {
                return;
            }
            C0323a c0323a3 = c0323aArr3[i11];
            if (d11 <= c0323a3.f16425d) {
                if (c0323a3.f16439r) {
                    fArr[0] = (float) c0323a3.f(d11);
                    fArr[1] = (float) this.f16419b[i11].g(d11);
                    return;
                } else {
                    c0323a3.k(d11);
                    fArr[0] = (float) this.f16419b[i11].h();
                    fArr[1] = (float) this.f16419b[i11].i();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // b5.b
    public void f(double d11, double[] dArr) {
        C0323a[] c0323aArr = this.f16419b;
        double d12 = c0323aArr[0].f16424c;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > c0323aArr[c0323aArr.length - 1].f16425d) {
            d11 = c0323aArr[c0323aArr.length - 1].f16425d;
        }
        int i11 = 0;
        while (true) {
            C0323a[] c0323aArr2 = this.f16419b;
            if (i11 >= c0323aArr2.length) {
                return;
            }
            C0323a c0323a = c0323aArr2[i11];
            if (d11 <= c0323a.f16425d) {
                if (c0323a.f16439r) {
                    dArr[0] = c0323a.d(d11);
                    dArr[1] = this.f16419b[i11].e(d11);
                    return;
                } else {
                    c0323a.k(d11);
                    dArr[0] = this.f16419b[i11].b();
                    dArr[1] = this.f16419b[i11].c();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // b5.b
    public double[] g() {
        return this.f16418a;
    }
}
