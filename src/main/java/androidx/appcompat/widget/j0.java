package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2710a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2711b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f2712c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class<?> f2713d;

    static {
        try {
            f2713d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@NonNull Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof l5.c) {
                return a(((l5.c) drawable).b());
            }
            if (drawable instanceof k.a) {
                return a(((k.a) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    static void b(@NonNull Drawable drawable) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Rect c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f2713d != null) {
            try {
                Drawable drawableQ = l5.a.q(drawable);
                Object objInvoke = drawableQ.getClass().getMethod("getOpticalInsets", null).invoke(drawableQ, null);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f2713d.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    rect2.bottom = field.getInt(objInvoke);
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    rect2.top = field.getInt(objInvoke);
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    rect2.left = field.getInt(objInvoke);
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    rect2.right = field.getInt(objInvoke);
                                }
                                break;
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f2712c;
    }

    public static PorterDuff.Mode d(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
