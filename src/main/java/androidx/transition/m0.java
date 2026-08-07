package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class m0 extends l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f14096f = true;

    static class a {
        static void a(View view, int i11, int i12, int i13, int i14) {
            view.setLeftTopRightBottom(i11, i12, i13, i14);
        }
    }

    m0() {
    }

    @Override // androidx.transition.k0
    @SuppressLint({"NewApi"})
    public void d(@NonNull View view, int i11, int i12, int i13, int i14) {
        if (f14096f) {
            try {
                a.a(view, i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f14096f = false;
            }
        }
    }
}
