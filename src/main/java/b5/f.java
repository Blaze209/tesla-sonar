package b5;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f16481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[][] f16482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f16483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16484d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f16485e;

    public f(double[] dArr, double[][] dArr2) {
        this.f16483c = Double.NaN;
        int length = dArr2[0].length;
        this.f16485e = new double[length];
        this.f16481a = dArr;
        this.f16482b = dArr2;
        if (length <= 2) {
            return;
        }
        int i11 = 0;
        double d11 = 0.0d;
        while (true) {
            double d12 = d11;
            if (i11 >= dArr.length) {
                this.f16483c = 0.0d;
                return;
            }
            double d13 = dArr2[i11][0];
            if (i11 > 0) {
                Math.hypot(d13 - d11, d13 - d12);
            }
            i11++;
            d11 = d13;
        }
    }

    @Override // b5.b
    public double c(double d11, int i11) {
        double d12;
        double d13;
        double dH;
        double[] dArr = this.f16481a;
        int length = dArr.length;
        int i12 = 0;
        if (this.f16484d) {
            double d14 = dArr[0];
            if (d11 <= d14) {
                d12 = this.f16482b[0][i11];
                d13 = d11 - d14;
                dH = h(d14, i11);
            } else {
                int i13 = length - 1;
                double d15 = dArr[i13];
                if (d11 >= d15) {
                    d12 = this.f16482b[i13][i11];
                    d13 = d11 - d15;
                    dH = h(d15, i11);
                }
            }
            return d12 + (d13 * dH);
        }
        if (d11 <= dArr[0]) {
            return this.f16482b[0][i11];
        }
        int i14 = length - 1;
        if (d11 >= dArr[i14]) {
            return this.f16482b[i14][i11];
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f16481a;
            double d16 = dArr2[i12];
            if (d11 == d16) {
                return this.f16482b[i12][i11];
            }
            int i15 = i12 + 1;
            double d17 = dArr2[i15];
            if (d11 < d17) {
                double d18 = (d11 - d16) / (d17 - d16);
                double[][] dArr3 = this.f16482b;
                return (dArr3[i12][i11] * (1.0d - d18)) + (dArr3[i15][i11] * d18);
            }
            i12 = i15;
        }
        return 0.0d;
    }

    @Override // b5.b
    public void d(double d11, double[] dArr) {
        double[] dArr2 = this.f16481a;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f16482b[0].length;
        if (this.f16484d) {
            double d12 = dArr2[0];
            if (d11 <= d12) {
                f(d12, this.f16485e);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f16482b[0][i12] + ((d11 - this.f16481a[0]) * this.f16485e[i12]);
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr2[i13];
            if (d11 >= d13) {
                f(d13, this.f16485e);
                while (i11 < length2) {
                    dArr[i11] = this.f16482b[i13][i11] + ((d11 - this.f16481a[i13]) * this.f16485e[i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr2[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f16482b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f16482b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f16481a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f16482b[i16][i17];
                }
            }
            double[] dArr3 = this.f16481a;
            int i18 = i16 + 1;
            double d14 = dArr3[i18];
            if (d11 < d14) {
                double d15 = dArr3[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr4 = this.f16482b;
                    dArr[i11] = (dArr4[i16][i11] * (1.0d - d16)) + (dArr4[i18][i11] * d16);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // b5.b
    public void e(double d11, float[] fArr) {
        double[] dArr = this.f16481a;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f16482b[0].length;
        if (this.f16484d) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                f(d12, this.f16485e);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f16482b[0][i12] + ((d11 - this.f16481a[0]) * this.f16485e[i12]));
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                f(d13, this.f16485e);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f16482b[i13][i11] + ((d11 - this.f16481a[i13]) * this.f16485e[i11]));
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f16482b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f16482b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f16481a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f16482b[i16][i17];
                }
            }
            double[] dArr2 = this.f16481a;
            int i18 = i16 + 1;
            double d14 = dArr2[i18];
            if (d11 < d14) {
                double d15 = dArr2[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr3 = this.f16482b;
                    fArr[i11] = (float) ((dArr3[i16][i11] * (1.0d - d16)) + (dArr3[i18][i11] * d16));
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b5.b
    public void f(double d11, double[] dArr) {
        double[] dArr2 = this.f16481a;
        int length = dArr2.length;
        int length2 = this.f16482b[0].length;
        double d12 = dArr2[0];
        if (d11 <= d12) {
            d11 = d12;
        } else {
            d12 = dArr2[length - 1];
            if (d11 >= d12) {
                d11 = d12;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f16481a;
            int i12 = i11 + 1;
            double d13 = dArr3[i12];
            if (d11 <= d13) {
                double d14 = d13 - dArr3[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f16482b;
                    dArr[i13] = (dArr4[i12][i13] - dArr4[i11][i13]) / d14;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // b5.b
    public double[] g() {
        return this.f16481a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public double h(double d11, int i11) {
        double[] dArr = this.f16481a;
        int length = dArr.length;
        int i12 = 0;
        double d12 = dArr[0];
        if (d11 < d12) {
            d11 = d12;
        } else {
            d12 = dArr[length - 1];
            if (d11 >= d12) {
                d11 = d12;
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f16481a;
            int i13 = i12 + 1;
            double d13 = dArr2[i13];
            if (d11 <= d13) {
                double d14 = d13 - dArr2[i12];
                double[][] dArr3 = this.f16482b;
                return (dArr3[i13][i11] - dArr3[i12][i11]) / d14;
            }
            i12 = i13;
        }
        return 0.0d;
    }
}
