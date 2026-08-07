package b5;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static float f16534k = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f16535a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f16539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f16540f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f16543i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f16536b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f16537c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float[][] f16538d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float[] f16541g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f16542h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f16544j = Float.NaN;

    protected static class a {
        static void a(int[] iArr, float[][] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int iB = b(iArr, fArr, i14, i16);
                    iArr2[i15] = iB - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = iB + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            c(iArr, fArr, i14, i12);
            return i14;
        }

        private static void c(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float[] fArr2 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = fArr2;
        }
    }

    protected float a(float f11) {
        float fAbs;
        switch (this.f16536b) {
            case 1:
                return Math.signum(f11 * f16534k);
            case 2:
                fAbs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f11 * f16534k);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f11 * f16534k);
        }
        return 1.0f - fAbs;
    }

    public void b(int i11, float f11, float f12, int i12, float f13) {
        int[] iArr = this.f16537c;
        int i13 = this.f16539e;
        iArr[i13] = i11;
        float[] fArr = this.f16538d[i13];
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        this.f16536b = Math.max(this.f16536b, i12);
        this.f16539e++;
    }

    protected void c(long j11) {
        this.f16543i = j11;
    }

    public void d(String str) {
        this.f16540f = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public void e(int i11) {
        int i12 = this.f16539e;
        if (i12 == 0) {
            System.err.println("Error no points added to " + this.f16540f);
            return;
        }
        a.a(this.f16537c, this.f16538d, 0, i12 - 1);
        int i13 = 1;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f16537c;
            if (i13 >= iArr.length) {
                break;
            }
            if (iArr[i13] != iArr[i13 - 1]) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            i14 = 1;
        }
        double[] dArr = new double[i14];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, 3);
        int i15 = 0;
        for (int i16 = 0; i16 < this.f16539e; i16++) {
            if (i16 > 0) {
                int[] iArr2 = this.f16537c;
                if (iArr2[i16] != iArr2[i16 - 1]) {
                    dArr[i15] = ((double) this.f16537c[i16]) * 0.01d;
                    double[] dArr3 = dArr2[i15];
                    float[] fArr = this.f16538d[i16];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i15++;
                }
            } else {
                dArr[i15] = ((double) this.f16537c[i16]) * 0.01d;
                double[] dArr4 = dArr2[i15];
                float[] fArr2 = this.f16538d[i16];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i15++;
            }
        }
        this.f16535a = b.a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f16540f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f16539e; i11++) {
            str = str + "[" + this.f16537c[i11] + " , " + decimalFormat.format(this.f16538d[i11]) + "] ";
        }
        return str;
    }
}
