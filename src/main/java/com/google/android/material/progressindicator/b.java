package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.internal.a0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f42486c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42490g;

    protected b(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(zs.e.A0);
        TypedArray typedArrayI = a0.i(context, attributeSet, zs.m.f128891g0, i11, i12, new int[0]);
        this.f42484a = pt.c.d(context, typedArrayI, zs.m.f128999p0, dimensionPixelSize);
        this.f42485b = Math.min(pt.c.d(context, typedArrayI, zs.m.f128987o0, 0), this.f42484a / 2);
        this.f42488e = typedArrayI.getInt(zs.m.f128951l0, 0);
        this.f42489f = typedArrayI.getInt(zs.m.f128903h0, 0);
        this.f42490g = typedArrayI.getDimensionPixelSize(zs.m.f128927j0, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(zs.m.f128915i0)) {
            this.f42486c = new int[]{ht.a.b(context, zs.c.f128591s, -1)};
            return;
        }
        if (typedArray.peekValue(zs.m.f128915i0).type != 1) {
            this.f42486c = new int[]{typedArray.getColor(zs.m.f128915i0, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(zs.m.f128915i0, -1));
        this.f42486c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (typedArray.hasValue(zs.m.f128975n0)) {
            this.f42487d = typedArray.getColor(zs.m.f128975n0, -1);
            return;
        }
        this.f42487d = this.f42486c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f11 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f42487d = ht.a.a(this.f42487d, (int) (f11 * 255.0f));
    }

    public boolean a() {
        return this.f42489f != 0;
    }

    public boolean b() {
        return this.f42488e != 0;
    }

    void e() {
        if (this.f42490g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
