package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class o0 extends n0 {
    o0() {
    }

    @Override // androidx.transition.k0
    public float b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.m0, androidx.transition.k0
    public void d(@NonNull View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.transition.k0
    public void e(@NonNull View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // androidx.transition.n0, androidx.transition.k0
    public void f(@NonNull View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // androidx.transition.l0, androidx.transition.k0
    public void g(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.l0, androidx.transition.k0
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
