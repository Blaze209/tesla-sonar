package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f42267a = {zs.c.f128591s};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f42268b = {zs.c.f128593t};

    public static void a(@NonNull Context context) {
        e(context, f42267a, "Theme.AppCompat");
    }

    private static void b(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.f128949ka, i11, i12);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(zs.m.f128973ma, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(zs.c.G, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@NonNull Context context) {
        e(context, f42268b, "Theme.MaterialComponents");
    }

    private static void d(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        boolean zF;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.f128949ka, i11, i12);
        if (!typedArrayObtainStyledAttributes.getBoolean(zs.m.f128985na, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(zs.m.f128961la, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i11, i12, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, @NonNull int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        for (int i13 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i13, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(@NonNull Context context) {
        return pt.b.b(context, zs.c.F, false);
    }

    private static boolean h(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i11)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray i(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static b1 j(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return b1.v(context, attributeSet, iArr, i11, i12);
    }
}
