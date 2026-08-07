package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f14084a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f14085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f14086c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f11) {
            view.setTransitionAlpha(f11);
        }
    }

    k0() {
    }

    public void a(@NonNull View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(@NonNull View view) {
        if (f14084a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f14084a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(@NonNull View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(@NonNull View view, int i11, int i12, int i13, int i14) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, float f11) {
        if (f14084a) {
            try {
                a.b(view, f11);
                return;
            } catch (NoSuchMethodError unused) {
                f14084a = false;
            }
        }
        view.setAlpha(f11);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(@NonNull View view, int i11) {
        if (!f14086c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f14085b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f14086c = true;
        }
        Field field = f14085b;
        if (field != null) {
            try {
                f14085b.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    public void h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
