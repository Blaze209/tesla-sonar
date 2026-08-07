package ht;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import k5.d;
import pt.b;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static int a(int i11, int i12) {
        return d.l(i11, (Color.alpha(i11) * i12) / 255);
    }

    public static int b(@NonNull Context context, int i11, int i12) {
        Integer numF = f(context, i11);
        return numF != null ? numF.intValue() : i12;
    }

    public static int c(Context context, int i11, String str) {
        return l(context, b.e(context, i11, str));
    }

    public static int d(@NonNull View view, int i11) {
        return l(view.getContext(), b.f(view, i11));
    }

    public static int e(@NonNull View view, int i11, int i12) {
        return b(view.getContext(), i11, i12);
    }

    public static Integer f(@NonNull Context context, int i11) {
        TypedValue typedValueA = b.a(context, i11);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(@NonNull Context context, int i11) {
        TypedValue typedValueA = b.a(context, i11);
        if (typedValueA == null) {
            return null;
        }
        int i12 = typedValueA.resourceId;
        if (i12 != 0) {
            return androidx.core.content.b.getColorStateList(context, i12);
        }
        int i13 = typedValueA.data;
        if (i13 != 0) {
            return ColorStateList.valueOf(i13);
        }
        return null;
    }

    public static boolean h(int i11) {
        return i11 != 0 && d.e(i11) > 0.5d;
    }

    public static int i(int i11, int i12) {
        return d.h(i12, i11);
    }

    public static int j(int i11, int i12, float f11) {
        return i(i11, d.l(i12, Math.round(Color.alpha(i12) * f11)));
    }

    public static int k(@NonNull View view, int i11, int i12, float f11) {
        return j(d(view, i11), d(view, i12), f11);
    }

    private static int l(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? androidx.core.content.b.getColor(context, i11) : typedValue.data;
    }
}
