package b5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f16518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f16519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f16522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f16524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f16525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f16526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f16528k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f16530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f16531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f16532o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16529l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16533p = false;

    private float c(float f11) {
        this.f16533p = false;
        float f12 = this.f16521d;
        if (f11 <= f12) {
            float f13 = this.f16518a;
            return (f13 * f11) + ((((this.f16519b - f13) * f11) * f11) / (f12 * 2.0f));
        }
        int i11 = this.f16527j;
        if (i11 == 1) {
            return this.f16524g;
        }
        float f14 = f11 - f12;
        float f15 = this.f16522e;
        if (f14 < f15) {
            float f16 = this.f16524g;
            float f17 = this.f16519b;
            return f16 + (f17 * f14) + ((((this.f16520c - f17) * f14) * f14) / (f15 * 2.0f));
        }
        if (i11 == 2) {
            return this.f16525h;
        }
        float f18 = f14 - f15;
        float f19 = this.f16523f;
        if (f18 > f19) {
            this.f16533p = true;
            return this.f16526i;
        }
        float f21 = this.f16525h;
        float f22 = this.f16520c;
        return (f21 + (f22 * f18)) - (((f22 * f18) * f18) / (f19 * 2.0f));
    }

    private void f(float f11, float f12, float f13, float f14, float f15) {
        this.f16533p = false;
        this.f16526i = f12;
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            f11 = 1.0E-4f;
        }
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13);
            if (fSqrt < f14) {
                this.f16528k = "backward accelerate, decelerate";
                this.f16527j = 2;
                this.f16518a = f11;
                this.f16519b = fSqrt;
                this.f16520c = BitmapDescriptorFactory.HUE_RED;
                float f18 = (fSqrt - f11) / f13;
                this.f16521d = f18;
                this.f16522e = fSqrt / f13;
                this.f16524g = ((f11 + fSqrt) * f18) / 2.0f;
                this.f16525h = f12;
                this.f16526i = f12;
                return;
            }
            this.f16528k = "backward accelerate cruse decelerate";
            this.f16527j = 3;
            this.f16518a = f11;
            this.f16519b = f14;
            this.f16520c = f14;
            float f19 = (f14 - f11) / f13;
            this.f16521d = f19;
            float f21 = f14 / f13;
            this.f16523f = f21;
            float f22 = ((f11 + f14) * f19) / 2.0f;
            float f23 = (f21 * f14) / 2.0f;
            this.f16522e = ((f12 - f22) - f23) / f14;
            this.f16524g = f22;
            this.f16525h = f12 - f23;
            this.f16526i = f12;
            return;
        }
        if (f17 >= f12) {
            this.f16528k = "hard stop";
            this.f16527j = 1;
            this.f16518a = f11;
            this.f16519b = BitmapDescriptorFactory.HUE_RED;
            this.f16524g = f12;
            this.f16521d = (2.0f * f12) / f11;
            return;
        }
        float f24 = f12 - f17;
        float f25 = f24 / f11;
        if (f25 + f16 < f15) {
            this.f16528k = "cruse decelerate";
            this.f16527j = 2;
            this.f16518a = f11;
            this.f16519b = f11;
            this.f16520c = BitmapDescriptorFactory.HUE_RED;
            this.f16524g = f24;
            this.f16525h = f12;
            this.f16521d = f25;
            this.f16522e = f16;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f13 * f12) + ((f11 * f11) / 2.0f));
        float f26 = (fSqrt2 - f11) / f13;
        this.f16521d = f26;
        float f27 = fSqrt2 / f13;
        this.f16522e = f27;
        if (fSqrt2 < f14) {
            this.f16528k = "accelerate decelerate";
            this.f16527j = 2;
            this.f16518a = f11;
            this.f16519b = fSqrt2;
            this.f16520c = BitmapDescriptorFactory.HUE_RED;
            this.f16521d = f26;
            this.f16522e = f27;
            this.f16524g = ((f11 + fSqrt2) * f26) / 2.0f;
            this.f16525h = f12;
            return;
        }
        this.f16528k = "accelerate cruse decelerate";
        this.f16527j = 3;
        this.f16518a = f11;
        this.f16519b = f14;
        this.f16520c = f14;
        float f28 = (f14 - f11) / f13;
        this.f16521d = f28;
        float f29 = f14 / f13;
        this.f16523f = f29;
        float f31 = ((f11 + f14) * f28) / 2.0f;
        float f32 = (f29 * f14) / 2.0f;
        this.f16522e = ((f12 - f31) - f32) / f14;
        this.f16524g = f31;
        this.f16525h = f12 - f32;
        this.f16526i = f12;
    }

    @Override // b5.m
    public float a() {
        return this.f16529l ? -e(this.f16532o) : e(this.f16532o);
    }

    @Override // b5.m
    public boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f16526i - this.f16531n) < 1.0E-5f;
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f16533p = false;
        this.f16530m = f11;
        boolean z11 = f11 > f12;
        this.f16529l = z11;
        if (z11) {
            f(-f13, f11 - f12, f15, f16, f14);
        } else {
            f(f13, f12 - f11, f15, f16, f14);
        }
    }

    public float e(float f11) {
        float f12 = this.f16521d;
        if (f11 <= f12) {
            float f13 = this.f16518a;
            return f13 + (((this.f16519b - f13) * f11) / f12);
        }
        int i11 = this.f16527j;
        if (i11 == 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f14 = f11 - f12;
        float f15 = this.f16522e;
        if (f14 < f15) {
            float f16 = this.f16519b;
            return f16 + (((this.f16520c - f16) * f14) / f15);
        }
        if (i11 == 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f17 = f14 - f15;
        float f18 = this.f16523f;
        if (f17 >= f18) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f19 = this.f16520c;
        return f19 - ((f17 * f19) / f18);
    }

    @Override // b5.m
    public float getInterpolation(float f11) {
        float fC = c(f11);
        this.f16531n = fC;
        this.f16532o = f11;
        return this.f16529l ? this.f16530m - fC : this.f16530m + fC;
    }
}
