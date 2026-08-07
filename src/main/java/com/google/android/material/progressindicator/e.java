package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.internal.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42513j;

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128575k);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, CircularProgressIndicator.f42463p);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(zs.e.f128669z0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(zs.e.f128667y0);
        TypedArray typedArrayI = a0.i(context, attributeSet, zs.m.f128977n2, i11, i12, new int[0]);
        this.f42511h = Math.max(pt.c.d(context, typedArrayI, zs.m.f129013q2, dimensionPixelSize), this.f42484a * 2);
        this.f42512i = pt.c.d(context, typedArrayI, zs.m.f129001p2, dimensionPixelSize2);
        this.f42513j = typedArrayI.getInt(zs.m.f128989o2, 0);
        typedArrayI.recycle();
        e();
    }
}
