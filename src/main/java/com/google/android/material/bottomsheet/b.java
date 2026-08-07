package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.i;

/* JADX INFO: loaded from: classes5.dex */
public class b extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41663m;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    private class C0660b extends BottomSheetBehavior.g {
        private C0660b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f11) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i11) {
            if (i11 == 5) {
                b.this.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f41663m) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void j(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z11) {
        this.f41663m = z11;
        if (bottomSheetBehavior.w0() == 5) {
            i();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).l();
        }
        bottomSheetBehavior.c0(new C0660b());
        bottomSheetBehavior.Y0(5);
    }

    private boolean k(boolean z11) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorJ = aVar.j();
        if (!bottomSheetBehaviorJ.C0() || !aVar.k()) {
            return false;
        }
        j(bottomSheetBehaviorJ, z11);
        return true;
    }

    @Override // androidx.fragment.app.o
    public void dismiss() {
        if (k(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.o
    public void dismissAllowingStateLoss() {
        if (k(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.o
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
