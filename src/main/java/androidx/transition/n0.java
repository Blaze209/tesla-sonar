package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class n0 extends m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f14103g = true;

    static class a {
        static void a(View view, int i11) {
            view.setTransitionVisibility(i11);
        }
    }

    n0() {
    }

    @Override // androidx.transition.k0
    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i11);
        } else if (f14103g) {
            try {
                a.a(view, i11);
            } catch (NoSuchMethodError unused) {
                f14103g = false;
            }
        }
    }
}
