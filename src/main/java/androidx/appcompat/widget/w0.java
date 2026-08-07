package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2891a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f2892b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f2893c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f2894d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f2895e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f2896f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f2897g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f2898h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f2899i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f2900j = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i.j.f73996z0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(i.j.E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(@NonNull Context context, int i11) {
        ColorStateList colorStateListE = e(context, i11);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f2892b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i11, typedValueF.getFloat());
    }

    public static int c(@NonNull Context context, int i11) {
        int[] iArr = f2900j;
        iArr[0] = i11;
        b1 b1VarU = b1.u(context, null, iArr);
        try {
            return b1VarU.b(0, 0);
        } finally {
            b1VarU.w();
        }
    }

    static int d(@NonNull Context context, int i11, float f11) {
        int iC = c(context, i11);
        return k5.d.l(iC, Math.round(Color.alpha(iC) * f11));
    }

    public static ColorStateList e(@NonNull Context context, int i11) {
        int[] iArr = f2900j;
        iArr[0] = i11;
        b1 b1VarU = b1.u(context, null, iArr);
        try {
            return b1VarU.c(0);
        } finally {
            b1VarU.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f2891a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
