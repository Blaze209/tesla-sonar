package b5;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f16440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double[] f16441b;

        a(double d11, double[] dArr) {
            this.f16440a = d11;
            this.f16441b = dArr;
        }

        @Override // b5.b
        public double c(double d11, int i11) {
            return this.f16441b[i11];
        }

        @Override // b5.b
        public void d(double d11, double[] dArr) {
            double[] dArr2 = this.f16441b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // b5.b
        public void e(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.f16441b;
                if (i11 >= dArr.length) {
                    return;
                }
                fArr[i11] = (float) dArr[i11];
                i11++;
            }
        }

        @Override // b5.b
        public void f(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.f16441b.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        @Override // b5.b
        public double[] g() {
            return new double[]{this.f16440a};
        }
    }

    public static b a(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 != 0) {
            return i11 != 2 ? new f(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new g(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new b5.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d11, int i11);

    public abstract void d(double d11, double[] dArr);

    public abstract void e(double d11, float[] fArr);

    public abstract void f(double d11, double[] dArr);

    public abstract double[] g();
}
