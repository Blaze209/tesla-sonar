package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import st.f;
import st.m;

/* JADX INFO: loaded from: classes5.dex */
public class b extends f implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f41579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f41580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f41581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f41582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f41584f = -1.0f;

    public b(float f11, float f12, float f13) {
        this.f41580b = f11;
        this.f41579a = f12;
        i(f13);
        this.f41583e = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // st.f
    public void b(float f11, float f12, float f13, @NonNull m mVar) {
        float f14;
        float f15;
        float f16 = this.f41581c;
        if (f16 == BitmapDescriptorFactory.HUE_RED) {
            mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f17 = ((this.f41580b * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.f41579a;
        float f19 = f12 + this.f41583e;
        float f21 = (this.f41582d * f13) + ((1.0f - f13) * f17);
        if (f21 / f17 >= 1.0f) {
            mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f22 = this.f41584f;
        float f23 = f22 * f13;
        boolean z11 = f22 == -1.0f || Math.abs((f22 * 2.0f) - f16) < 0.1f;
        if (z11) {
            f14 = f21;
            f15 = 0.0f;
        } else {
            f15 = 1.75f;
            f14 = 0.0f;
        }
        float f24 = f17 + f18;
        float f25 = f14 + f18;
        float fSqrt = (float) Math.sqrt((f24 * f24) - (f25 * f25));
        float f26 = f19 - fSqrt;
        float f27 = f19 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f25));
        float f28 = (90.0f - degrees) + f15;
        mVar.m(f26, BitmapDescriptorFactory.HUE_RED);
        float f29 = f26 - f18;
        float f31 = f26 + f18;
        float f32 = f18 * 2.0f;
        mVar.a(f29, BitmapDescriptorFactory.HUE_RED, f31, f32, 270.0f, degrees);
        if (z11) {
            mVar.a(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f28, (f28 * 2.0f) - 180.0f);
        } else {
            float f33 = this.f41580b;
            float f34 = f23 * 2.0f;
            float f35 = f33 + f34;
            float f36 = f19 - f17;
            mVar.a(f36, -(f23 + f33), f35 + f36, f33 + f23, 180.0f - f28, ((f28 * 2.0f) - 180.0f) / 2.0f);
            float f37 = f19 + f17;
            float f38 = this.f41580b;
            mVar.m(f37 - ((f38 / 2.0f) + f23), f38 + f23);
            float f39 = this.f41580b;
            mVar.a(f37 - (f34 + f39), -(f23 + f39), f37, f39 + f23, 90.0f, f28 - 90.0f);
        }
        mVar.a(f27 - f18, BitmapDescriptorFactory.HUE_RED, f27 + f18, f32, 270.0f - degrees, degrees);
        mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
    }

    float c() {
        return this.f41582d;
    }

    public float d() {
        return this.f41584f;
    }

    float e() {
        return this.f41580b;
    }

    float f() {
        return this.f41579a;
    }

    public float g() {
        return this.f41581c;
    }

    public float h() {
        return this.f41583e;
    }

    void i(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f41582d = f11;
    }

    public void j(float f11) {
        this.f41584f = f11;
    }

    void k(float f11) {
        this.f41580b = f11;
    }

    void l(float f11) {
        this.f41579a = f11;
    }

    public void m(float f11) {
        this.f41581c = f11;
    }

    void n(float f11) {
        this.f41583e = f11;
    }
}
