package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class l0 extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f14093d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f14094e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    l0() {
    }

    @Override // androidx.transition.k0
    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, @NonNull Matrix matrix) {
        if (f14093d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f14093d = false;
            }
        }
    }

    @Override // androidx.transition.k0
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        if (f14094e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f14094e = false;
            }
        }
    }
}
