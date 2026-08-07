package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class a0 {
    private double[] A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private final float M;
    private final float N;
    private final float O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<y> f45309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<SVGLength[]> f45310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<SVGLength[]> f45311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<SVGLength[]> f45312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<SVGLength[]> f45313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<double[]> f45314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<Integer> f45315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList<Integer> f45316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList<Integer> f45317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList<Integer> f45318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<Integer> f45319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<Integer> f45320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<Integer> f45321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<Integer> f45322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<Integer> f45323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<Integer> f45324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f45325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y f45326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f45327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f45328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private double f45329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private double f45330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SVGLength[] f45331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private SVGLength[] f45332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SVGLength[] f45333y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SVGLength[] f45334z;

    a0(float f11, float f12, float f13) {
        ArrayList<y> arrayList = new ArrayList<>();
        this.f45309a = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.f45310b = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.f45311c = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.f45312d = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.f45313e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f45314f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.f45315g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.f45316h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.f45317i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.f45318j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.f45319k = arrayList11;
        this.f45320l = new ArrayList<>();
        this.f45321m = new ArrayList<>();
        this.f45322n = new ArrayList<>();
        this.f45323o = new ArrayList<>();
        this.f45324p = new ArrayList<>();
        this.f45325q = 12.0d;
        this.f45326r = y.f45529p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f45331w = sVGLengthArr;
        this.f45332x = new SVGLength[0];
        this.f45333y = new SVGLength[0];
        this.f45334z = new SVGLength[0];
        this.A = new double[]{0.0d};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f11;
        this.N = f12;
        this.O = f13;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f45332x);
        arrayList4.add(this.f45333y);
        arrayList5.add(this.f45334z);
        arrayList6.add(this.A);
        arrayList7.add(Integer.valueOf(this.G));
        arrayList8.add(Integer.valueOf(this.H));
        arrayList9.add(Integer.valueOf(this.I));
        arrayList10.add(Integer.valueOf(this.J));
        arrayList11.add(Integer.valueOf(this.K));
        arrayList.add(this.f45326r);
        q();
    }

    private double[] a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = arrayList.get(i11).f45257a;
        }
        return dArr;
    }

    private SVGLength[] e(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i11 = 0; i11 < size; i11++) {
            sVGLengthArr[i11] = arrayList.get(i11);
        }
        return sVGLengthArr;
    }

    private y f(c0 c0Var) {
        if (this.L > 0) {
            return this.f45326r;
        }
        for (c0 parentTextRoot = c0Var.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            y yVarB = parentTextRoot.j().b();
            if (yVarB != y.f45529p) {
                return yVarB;
            }
        }
        return y.f45529p;
    }

    private static void h(ArrayList<Integer> arrayList, int i11) {
        while (i11 >= 0) {
            arrayList.set(i11, Integer.valueOf(arrayList.get(i11).intValue() + 1));
            i11--;
        }
    }

    private void q() {
        this.f45320l.add(Integer.valueOf(this.B));
        this.f45321m.add(Integer.valueOf(this.C));
        this.f45322n.add(Integer.valueOf(this.D));
        this.f45323o.add(Integer.valueOf(this.E));
        this.f45324p.add(Integer.valueOf(this.F));
    }

    private void r(c0 c0Var, ReadableMap readableMap) {
        y yVarF = f(c0Var);
        this.L++;
        if (readableMap == null) {
            this.f45309a.add(yVarF);
            return;
        }
        y yVar = new y(readableMap, yVarF, this.M);
        this.f45325q = yVar.f45530a;
        this.f45309a.add(yVar);
        this.f45326r = yVar;
    }

    private void s() {
        this.F = 0;
        this.E = 0;
        this.D = 0;
        this.C = 0;
        this.B = 0;
        this.K = -1;
        this.J = -1;
        this.I = -1;
        this.H = -1;
        this.G = -1;
        this.f45330v = 0.0d;
        this.f45329u = 0.0d;
        this.f45328t = 0.0d;
        this.f45327s = 0.0d;
    }

    y b() {
        return this.f45326r;
    }

    double c() {
        return this.f45325q;
    }

    float d() {
        return this.O;
    }

    float g() {
        return this.N;
    }

    double i() {
        h(this.f45317i, this.D);
        int i11 = this.I + 1;
        SVGLength[] sVGLengthArr = this.f45333y;
        if (i11 < sVGLengthArr.length) {
            this.I = i11;
            this.f45329u += n0.a(sVGLengthArr[i11], this.N, 0.0d, this.M, this.f45325q);
        }
        return this.f45329u;
    }

    double j() {
        h(this.f45318j, this.E);
        int i11 = this.J + 1;
        SVGLength[] sVGLengthArr = this.f45334z;
        if (i11 < sVGLengthArr.length) {
            this.J = i11;
            this.f45330v += n0.a(sVGLengthArr[i11], this.O, 0.0d, this.M, this.f45325q);
        }
        return this.f45330v;
    }

    double k() {
        h(this.f45319k, this.F);
        int iMin = Math.min(this.K + 1, this.A.length - 1);
        this.K = iMin;
        return this.A[iMin];
    }

    double l(double d11) {
        h(this.f45315g, this.B);
        int i11 = this.G + 1;
        SVGLength[] sVGLengthArr = this.f45331w;
        if (i11 < sVGLengthArr.length) {
            this.f45329u = 0.0d;
            this.G = i11;
            this.f45327s = n0.a(sVGLengthArr[i11], this.N, 0.0d, this.M, this.f45325q);
        }
        double d12 = this.f45327s + d11;
        this.f45327s = d12;
        return d12;
    }

    double m() {
        h(this.f45316h, this.C);
        int i11 = this.H + 1;
        SVGLength[] sVGLengthArr = this.f45332x;
        if (i11 < sVGLengthArr.length) {
            this.f45330v = 0.0d;
            this.H = i11;
            this.f45328t = n0.a(sVGLengthArr[i11], this.O, 0.0d, this.M, this.f45325q);
        }
        return this.f45328t;
    }

    void n() {
        this.f45309a.remove(this.L);
        this.f45320l.remove(this.L);
        this.f45321m.remove(this.L);
        this.f45322n.remove(this.L);
        this.f45323o.remove(this.L);
        this.f45324p.remove(this.L);
        int i11 = this.L - 1;
        this.L = i11;
        int i12 = this.B;
        int i13 = this.C;
        int i14 = this.D;
        int i15 = this.E;
        int i16 = this.F;
        this.f45326r = this.f45309a.get(i11);
        this.B = this.f45320l.get(this.L).intValue();
        this.C = this.f45321m.get(this.L).intValue();
        this.D = this.f45322n.get(this.L).intValue();
        this.E = this.f45323o.get(this.L).intValue();
        this.F = this.f45324p.get(this.L).intValue();
        if (i12 != this.B) {
            this.f45310b.remove(i12);
            this.f45331w = this.f45310b.get(this.B);
            this.G = this.f45315g.get(this.B).intValue();
        }
        if (i13 != this.C) {
            this.f45311c.remove(i13);
            this.f45332x = this.f45311c.get(this.C);
            this.H = this.f45316h.get(this.C).intValue();
        }
        if (i14 != this.D) {
            this.f45312d.remove(i14);
            this.f45333y = this.f45312d.get(this.D);
            this.I = this.f45317i.get(this.D).intValue();
        }
        if (i15 != this.E) {
            this.f45313e.remove(i15);
            this.f45334z = this.f45313e.get(this.E);
            this.J = this.f45318j.get(this.E).intValue();
        }
        if (i16 != this.F) {
            this.f45314f.remove(i16);
            this.A = this.f45314f.get(this.F);
            this.K = this.f45319k.get(this.F).intValue();
        }
    }

    void o(c0 c0Var, ReadableMap readableMap) {
        r(c0Var, readableMap);
        q();
    }

    void p(boolean z11, h1 h1Var, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z11) {
            s();
        }
        r(h1Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.B++;
            this.G = -1;
            this.f45315g.add(-1);
            SVGLength[] sVGLengthArrE = e(arrayList);
            this.f45331w = sVGLengthArrE;
            this.f45310b.add(sVGLengthArrE);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.C++;
            this.H = -1;
            this.f45316h.add(-1);
            SVGLength[] sVGLengthArrE2 = e(arrayList2);
            this.f45332x = sVGLengthArrE2;
            this.f45311c.add(sVGLengthArrE2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.D++;
            this.I = -1;
            this.f45317i.add(-1);
            SVGLength[] sVGLengthArrE3 = e(arrayList3);
            this.f45333y = sVGLengthArrE3;
            this.f45312d.add(sVGLengthArrE3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.E++;
            this.J = -1;
            this.f45318j.add(-1);
            SVGLength[] sVGLengthArrE4 = e(arrayList4);
            this.f45334z = sVGLengthArrE4;
            this.f45313e.add(sVGLengthArrE4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.F++;
            this.K = -1;
            this.f45319k.add(-1);
            double[] dArrA = a(arrayList5);
            this.A = dArrA;
            this.f45314f.add(dArrA);
        }
        q();
    }
}
