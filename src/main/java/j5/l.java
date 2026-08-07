package j5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final l f82671k = k(b.f82636c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f82672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f82673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f82674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f82675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f82676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f82677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f82678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f82679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f82680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f82681j;

    private l(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f82677f = f11;
        this.f82672a = f12;
        this.f82673b = f13;
        this.f82674c = f14;
        this.f82675d = f15;
        this.f82676e = f16;
        this.f82678g = fArr;
        this.f82679h = f17;
        this.f82680i = f18;
        this.f82681j = f19;
    }

    static l k(float[] fArr, float f11, float f12, float f13, boolean z11) {
        float[][] fArr2 = b.f82634a;
        float f14 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f15 = fArr3[0] * f14;
        float f16 = fArr[1];
        float f17 = f15 + (fArr3[1] * f16);
        float f18 = fArr[2];
        float f19 = f17 + (fArr3[2] * f18);
        float[] fArr4 = fArr2[1];
        float f21 = (fArr4[0] * f14) + (fArr4[1] * f16) + (fArr4[2] * f18);
        float[] fArr5 = fArr2[2];
        float f22 = (f14 * fArr5[0]) + (f16 * fArr5[1]) + (f18 * fArr5[2]);
        float f23 = (f13 / 10.0f) + 0.8f;
        float fD = ((double) f23) >= 0.9d ? b.d(0.59f, 0.69f, (f23 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f23 - 0.8f) * 10.0f);
        float fExp = z11 ? 1.0f : (1.0f - (((float) Math.exp(((-f11) - 42.0f) / 92.0f)) * 0.2777778f)) * f23;
        double d11 = fExp;
        if (d11 > 1.0d) {
            fExp = 1.0f;
        } else if (d11 < 0.0d) {
            fExp = BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr6 = {(((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f21) * fExp) + 1.0f) - fExp, (((100.0f / f22) * fExp) + 1.0f) - fExp};
        float f24 = 1.0f / ((5.0f * f11) + 1.0f);
        float f25 = f24 * f24 * f24 * f24;
        float f26 = 1.0f - f25;
        float fCbrt = (f25 * f11) + (0.1f * f26 * f26 * ((float) Math.cbrt(((double) f11) * 5.0d)));
        float fH = b.h(f12) / fArr[1];
        double d12 = fH;
        float fSqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f21)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f22)) / 100.0d, 0.42d)};
        float f27 = fArr7[0];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[1];
        float f31 = (f29 * 400.0f) / (f29 + 27.13f);
        float f32 = fArr7[2];
        float[] fArr8 = {f28, f31, (400.0f * f32) / (f32 + 27.13f)};
        return new l(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f23, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f82672a;
    }

    float b() {
        return this.f82675d;
    }

    float c() {
        return this.f82679h;
    }

    float d() {
        return this.f82680i;
    }

    float e() {
        return this.f82677f;
    }

    float f() {
        return this.f82673b;
    }

    float g() {
        return this.f82676e;
    }

    float h() {
        return this.f82674c;
    }

    float[] i() {
        return this.f82678g;
    }

    float j() {
        return this.f82681j;
    }
}
