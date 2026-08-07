package pt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateListA = j.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateListA;
    }

    public static ColorStateList b(@NonNull Context context, @NonNull b1 b1Var, int i11) {
        int iN;
        ColorStateList colorStateListA;
        return (!b1Var.s(i11) || (iN = b1Var.n(i11, 0)) == 0 || (colorStateListA = j.a.a(context, iN)) == null) ? b1Var.c(i11) : colorStateListA;
    }

    private static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@NonNull Context context, @NonNull TypedArray typedArray, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i11, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i11, i12);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i12);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable e(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (drawableB = j.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i11) : drawableB;
    }

    public static float f(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int g(@NonNull TypedArray typedArray, int i11, int i12) {
        return typedArray.hasValue(i11) ? i11 : i12;
    }

    public static d h(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static int i(@NonNull Context context, int i11, int i12) {
        if (i11 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, m.f129125z8);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(m.A8, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i12;
    }

    public static boolean j(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean k(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
