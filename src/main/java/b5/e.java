package b5;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b5.b f16452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f16453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16455d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16456e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16457f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<c> f16458g = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f16476a, cVar2.f16476a);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f16461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f16464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float[] f16465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double[] f16466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f16467h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f16468i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f16469j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float[] f16470k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f16471l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        b5.b f16472m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f16473n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double[] f16474o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f16475p;

        b(int i11, String str, int i12, int i13) {
            h hVar = new h();
            this.f16461b = hVar;
            this.f16462c = 0;
            this.f16463d = 1;
            this.f16464e = 2;
            this.f16471l = i11;
            this.f16460a = i12;
            hVar.e(i11, str);
            this.f16465f = new float[i13];
            this.f16466g = new double[i13];
            this.f16467h = new float[i13];
            this.f16468i = new float[i13];
            this.f16469j = new float[i13];
            this.f16470k = new float[i13];
        }

        public double a(float f11) {
            b5.b bVar = this.f16472m;
            if (bVar != null) {
                bVar.d(f11, this.f16473n);
            } else {
                double[] dArr = this.f16473n;
                dArr[0] = this.f16468i[0];
                dArr[1] = this.f16469j[0];
                dArr[2] = this.f16465f[0];
            }
            double[] dArr2 = this.f16473n;
            return dArr2[0] + (this.f16461b.c(f11, dArr2[1]) * this.f16473n[2]);
        }

        public void b(int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f16466g[i11] = ((double) i12) / 100.0d;
            this.f16467h[i11] = f11;
            this.f16468i[i11] = f12;
            this.f16469j[i11] = f13;
            this.f16465f[i11] = f14;
        }

        public void c(float f11) {
            this.f16475p = f11;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f16466g.length, 3);
            float[] fArr = this.f16465f;
            this.f16473n = new double[fArr.length + 2];
            this.f16474o = new double[fArr.length + 2];
            if (this.f16466g[0] > 0.0d) {
                this.f16461b.a(0.0d, this.f16467h[0]);
            }
            double[] dArr2 = this.f16466g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f16461b.a(1.0d, this.f16467h[length]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                double[] dArr3 = dArr[i11];
                dArr3[0] = this.f16468i[i11];
                dArr3[1] = this.f16469j[i11];
                dArr3[2] = this.f16465f[i11];
                this.f16461b.a(this.f16466g[i11], this.f16467h[i11]);
            }
            this.f16461b.d();
            double[] dArr4 = this.f16466g;
            if (dArr4.length > 1) {
                this.f16472m = b5.b.a(0, dArr4, dArr);
            } else {
                this.f16472m = null;
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f16477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f16478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f16479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f16480e;

        c(int i11, float f11, float f12, float f13, float f14) {
            this.f16476a = i11;
            this.f16477b = f14;
            this.f16478c = f12;
            this.f16479d = f11;
            this.f16480e = f13;
        }
    }

    public float a(float f11) {
        return (float) this.f16453b.a(f11);
    }

    public void c(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14) {
        this.f16458g.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f16457f = i13;
        }
        this.f16455d = i12;
        this.f16456e = str;
    }

    public void d(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14, Object obj) {
        this.f16458g.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f16457f = i13;
        }
        this.f16455d = i12;
        b(obj);
        this.f16456e = str;
    }

    public void e(String str) {
        this.f16454c = str;
    }

    public void f(float f11) {
        int size = this.f16458g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f16458g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f16453b = new b(this.f16455d, this.f16456e, this.f16457f, size);
        int i11 = 0;
        for (c cVar : this.f16458g) {
            float f12 = cVar.f16479d;
            dArr[i11] = ((double) f12) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f13 = cVar.f16477b;
            dArr3[0] = f13;
            float f14 = cVar.f16478c;
            dArr3[1] = f14;
            float f15 = cVar.f16480e;
            dArr3[2] = f15;
            this.f16453b.b(i11, cVar.f16476a, f12, f14, f15, f13);
            i11++;
        }
        this.f16453b.c(f11);
        this.f16452a = b5.b.a(0, dArr, dArr2);
    }

    public boolean g() {
        return this.f16457f == 1;
    }

    public String toString() {
        String str = this.f16454c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (c cVar : this.f16458g) {
            str = str + "[" + cVar.f16476a + " , " + decimalFormat.format(cVar.f16477b) + "] ";
        }
        return str;
    }

    protected void b(Object obj) {
    }
}
