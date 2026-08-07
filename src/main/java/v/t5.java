package v;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
class t5 implements c0.d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f117284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f117285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f117286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f117287d;

    t5(float f11, float f12) {
        this.f117285b = f11;
        this.f117286c = f12;
    }

    private float e(float f11) {
        float f12 = this.f117285b;
        float f13 = this.f117286c;
        if (f12 == f13) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 == f12) {
            return 1.0f;
        }
        if (f11 == f13) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f14 = 1.0f / f13;
        return ((1.0f / f11) - f14) / ((1.0f / f12) - f14);
    }

    @Override // c0.d2
    public float a() {
        return this.f117285b;
    }

    @Override // c0.d2
    public float b() {
        return this.f117287d;
    }

    @Override // c0.d2
    public float c() {
        return this.f117286c;
    }

    @Override // c0.d2
    public float d() {
        return this.f117284a;
    }

    void f(float f11) {
        if (f11 <= this.f117285b && f11 >= this.f117286c) {
            this.f117284a = f11;
            this.f117287d = e(f11);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f11 + " is not within valid range [" + this.f117286c + " , " + this.f117285b + "]");
    }
}
