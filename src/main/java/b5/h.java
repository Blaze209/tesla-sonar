package b5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f16493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f16494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f16495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f16496f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f16491a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double[] f16492b = new double[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f16497g = 6.283185307179586d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16498h = false;

    public void a(double d11, float f11) {
        int length = this.f16491a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f16492b, d11);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f16492b = Arrays.copyOf(this.f16492b, length);
        this.f16491a = Arrays.copyOf(this.f16491a, length);
        this.f16493c = new double[length];
        double[] dArr = this.f16492b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f16492b[iBinarySearch] = d11;
        this.f16491a[iBinarySearch] = f11;
        this.f16498h = false;
    }

    double b(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f16492b, d11);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f16491a;
        float f11 = fArr[iBinarySearch];
        int i11 = iBinarySearch - 1;
        float f12 = fArr[i11];
        double d12 = f11 - f12;
        double[] dArr = this.f16492b;
        double d13 = dArr[iBinarySearch];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return this.f16493c[i11] + ((((double) f12) - (d15 * d14)) * (d11 - d14)) + ((d15 * ((d11 * d11) - (d14 * d14))) / 2.0d);
    }

    public double c(double d11, double d12) {
        double dAbs;
        double dB = b(d11) + d12;
        switch (this.f16496f) {
            case 1:
                return Math.signum(0.5d - (dB % 1.0d));
            case 2:
                dAbs = Math.abs((((dB * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dB * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dB * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f16497g * (d12 + dB));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dB * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f16495e.c(dB % 1.0d, 0);
            default:
                return Math.sin(this.f16497g * dB);
        }
        return 1.0d - dAbs;
    }

    public void d() {
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f16491a;
            if (i11 >= fArr.length) {
                break;
            }
            d11 += (double) fArr[i11];
            i11++;
        }
        double d12 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr2 = this.f16491a;
            if (i12 >= fArr2.length) {
                break;
            }
            int i13 = i12 - 1;
            float f11 = (fArr2[i13] + fArr2[i12]) / 2.0f;
            double[] dArr = this.f16492b;
            d12 += (dArr[i12] - dArr[i13]) * ((double) f11);
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr3 = this.f16491a;
            if (i14 >= fArr3.length) {
                break;
            }
            fArr3[i14] = fArr3[i14] * ((float) (d11 / d12));
            i14++;
        }
        this.f16493c[0] = 0.0d;
        int i15 = 1;
        while (true) {
            float[] fArr4 = this.f16491a;
            if (i15 >= fArr4.length) {
                this.f16498h = true;
                return;
            }
            int i16 = i15 - 1;
            float f12 = (fArr4[i16] + fArr4[i15]) / 2.0f;
            double[] dArr2 = this.f16492b;
            double d13 = dArr2[i15] - dArr2[i16];
            double[] dArr3 = this.f16493c;
            dArr3[i15] = dArr3[i16] + (d13 * ((double) f12));
            i15++;
        }
    }

    public void e(int i11, String str) {
        this.f16496f = i11;
        this.f16494d = str;
        if (str != null) {
            this.f16495e = g.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f16492b) + " period=" + Arrays.toString(this.f16491a);
    }
}
