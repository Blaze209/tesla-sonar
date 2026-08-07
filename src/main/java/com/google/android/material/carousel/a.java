package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f41781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f41782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f41783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f41784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f41785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f41786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f41787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f41788h;

    a(int i11, float f11, float f12, float f13, int i12, float f14, int i13, float f15, int i14, float f16) {
        this.f41781a = i11;
        this.f41782b = o5.a.a(f11, f12, f13);
        this.f41783c = i12;
        this.f41785e = f14;
        this.f41784d = i13;
        this.f41786f = f15;
        this.f41787g = i14;
        d(f16, f12, f13, f15);
        this.f41788h = b(f15);
    }

    private float a(float f11, int i11, float f12, int i12, int i13) {
        if (i11 <= 0) {
            f12 = BitmapDescriptorFactory.HUE_RED;
        }
        float f13 = i12 / 2.0f;
        return (f11 - ((i11 + f13) * f12)) / (i13 + f13);
    }

    private float b(float f11) {
        if (g()) {
            return Math.abs(f11 - this.f41786f) * this.f41781a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f11, float f12, float f13, float f14, int[] iArr, float f15, int[] iArr2, float f16, int[] iArr3) {
        a aVar = null;
        int i11 = 1;
        for (int i12 : iArr3) {
            int length = iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr2[i13];
                int length2 = iArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length;
                    int i17 = i13;
                    int i18 = i11;
                    int i19 = length2;
                    int i21 = i15;
                    a aVar2 = new a(i18, f12, f13, f14, iArr[i15], f15, i14, f16, i12, f11);
                    if (aVar == null || aVar2.f41788h < aVar.f41788h) {
                        if (aVar2.f41788h == BitmapDescriptorFactory.HUE_RED) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i22 = i18 + 1;
                    i15 = i21 + 1;
                    i13 = i17;
                    i11 = i22;
                    length = i16;
                    length2 = i19;
                }
                i13++;
                i11 = i11;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f11, float f12, float f13, float f14) {
        float f15 = f11 - f();
        int i11 = this.f41783c;
        if (i11 > 0 && f15 > BitmapDescriptorFactory.HUE_RED) {
            float f16 = this.f41782b;
            this.f41782b = f16 + Math.min(f15 / i11, f13 - f16);
        } else if (i11 > 0 && f15 < BitmapDescriptorFactory.HUE_RED) {
            float f17 = this.f41782b;
            this.f41782b = f17 + Math.max(f15 / i11, f12 - f17);
        }
        int i12 = this.f41783c;
        float f18 = i12 > 0 ? this.f41782b : 0.0f;
        this.f41782b = f18;
        float fA = a(f11, i12, f18, this.f41784d, this.f41787g);
        this.f41786f = fA;
        float f19 = (this.f41782b + fA) / 2.0f;
        this.f41785e = f19;
        int i13 = this.f41784d;
        if (i13 <= 0 || fA == f14) {
            return;
        }
        float f21 = (f14 - fA) * this.f41787g;
        float fMin = Math.min(Math.abs(f21), f19 * 0.1f * i13);
        if (f21 > BitmapDescriptorFactory.HUE_RED) {
            this.f41785e -= fMin / this.f41784d;
            this.f41786f += fMin / this.f41787g;
        } else {
            this.f41785e += fMin / this.f41784d;
            this.f41786f -= fMin / this.f41787g;
        }
    }

    private float f() {
        return (this.f41786f * this.f41787g) + (this.f41785e * this.f41784d) + (this.f41782b * this.f41783c);
    }

    private boolean g() {
        int i11 = this.f41787g;
        if (i11 <= 0 || this.f41783c <= 0 || this.f41784d <= 0) {
            return i11 <= 0 || this.f41783c <= 0 || this.f41786f > this.f41782b;
        }
        float f11 = this.f41786f;
        float f12 = this.f41785e;
        return f11 > f12 && f12 > this.f41782b;
    }

    int e() {
        return this.f41783c + this.f41784d + this.f41787g;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f41781a + ", smallCount=" + this.f41783c + ", smallSize=" + this.f41782b + ", mediumCount=" + this.f41784d + ", mediumSize=" + this.f41785e + ", largeCount=" + this.f41787g + ", largeSize=" + this.f41786f + ", cost=" + this.f41788h + "]";
    }
}
