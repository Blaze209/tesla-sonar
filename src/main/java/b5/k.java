package b5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f16508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f16509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f16510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f16512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f16513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f16514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f16515j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f16506a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16507b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16516k = 0;

    private void c(double d11) {
        if (d11 <= 0.0d) {
            return;
        }
        double d12 = this.f16508c;
        double d13 = this.f16506a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d12 / ((double) this.f16514i)) * d11) * 4.0d)) + 1.0d);
        double d14 = d11 / ((double) iSqrt);
        int i11 = 0;
        while (i11 < iSqrt) {
            float f11 = this.f16512g;
            double d15 = this.f16509d;
            float f12 = this.f16513h;
            double d16 = d12;
            double d17 = ((-d12) * (((double) f11) - d15)) - (((double) f12) * d13);
            float f13 = this.f16514i;
            double d18 = d13;
            double d19 = ((double) f12) + (((d17 / ((double) f13)) * d14) / 2.0d);
            double d21 = ((((-((((double) f11) + ((d14 * d19) / 2.0d)) - d15)) * d16) - (d19 * d18)) / ((double) f13)) * d14;
            double d22 = ((double) f12) + (d21 / 2.0d);
            float f14 = f12 + ((float) d21);
            this.f16513h = f14;
            float f15 = f11 + ((float) (d22 * d14));
            this.f16512g = f15;
            int i12 = this.f16516k;
            if (i12 > 0) {
                if (f15 < BitmapDescriptorFactory.HUE_RED && (i12 & 1) == 1) {
                    this.f16512g = -f15;
                    this.f16513h = -f14;
                }
                float f16 = this.f16512g;
                if (f16 > 1.0f && (i12 & 2) == 2) {
                    this.f16512g = 2.0f - f16;
                    this.f16513h = -this.f16513h;
                }
            }
            i11++;
            d12 = d16;
            d13 = d18;
        }
    }

    @Override // b5.m
    public float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // b5.m
    public boolean b() {
        double d11 = ((double) this.f16512g) - this.f16509d;
        double d12 = this.f16508c;
        double d13 = this.f16513h;
        return Math.sqrt((((d13 * d13) * ((double) this.f16514i)) + ((d12 * d11) * d11)) / d12) <= ((double) this.f16515j);
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        this.f16509d = f12;
        this.f16506a = f16;
        this.f16507b = false;
        this.f16512g = f11;
        this.f16510e = f13;
        this.f16508c = f15;
        this.f16514i = f14;
        this.f16515j = f17;
        this.f16516k = i11;
        this.f16511f = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // b5.m
    public float getInterpolation(float f11) {
        c(f11 - this.f16511f);
        this.f16511f = f11;
        if (b()) {
            this.f16512g = (float) this.f16509d;
        }
        return this.f16512g;
    }
}
