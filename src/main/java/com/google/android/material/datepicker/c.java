package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final b f41941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final b f41942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final b f41943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final b f41944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    final b f41945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final b f41946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    final b f41947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    final Paint f41948h;

    c(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(pt.b.d(context, zs.c.M, p.class.getCanonicalName()), zs.m.C4);
        this.f41941a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.G4, 0));
        this.f41947g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.E4, 0));
        this.f41942b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.F4, 0));
        this.f41943c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.H4, 0));
        ColorStateList colorStateListA = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.I4);
        this.f41944d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.K4, 0));
        this.f41945e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.J4, 0));
        this.f41946f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.L4, 0));
        Paint paint = new Paint();
        this.f41948h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
