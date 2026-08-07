package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class o extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f14104b = 3.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14105c = 80;

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    private int h(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = this.f14105c;
        if (i19 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i19 = 5;
            } else {
                i19 = 3;
            }
        } else if (i19 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i19 = 3;
            } else {
                i19 = 5;
            }
        }
        if (i19 == 3) {
            return (i17 - i11) + Math.abs(i14 - i12);
        }
        if (i19 == 5) {
            return (i11 - i15) + Math.abs(i14 - i12);
        }
        if (i19 == 48) {
            return (i18 - i12) + Math.abs(i13 - i11);
        }
        if (i19 != 80) {
            return 0;
        }
        return (i12 - i16) + Math.abs(i13 - i11);
    }

    private int i(ViewGroup viewGroup) {
        int i11 = this.f14105c;
        return (i11 == 3 || i11 == 5 || i11 == 8388611 || i11 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.a0
    public long c(@NonNull ViewGroup viewGroup, @NonNull r rVar, e0 e0Var, e0 e0Var2) {
        int i11;
        int i12;
        int iCenterY;
        int i13;
        e0 e0Var3 = e0Var;
        if (e0Var3 == null && e0Var2 == null) {
            return 0L;
        }
        Rect rectV = rVar.v();
        if (e0Var2 == null || e(e0Var3) == 0) {
            i11 = -1;
        } else {
            e0Var3 = e0Var2;
            i11 = 1;
        }
        int iF = f(e0Var3);
        int iG = g(e0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectV != null) {
            int iCenterX = rectV.centerX();
            i13 = iRound2;
            iCenterY = rectV.centerY();
            i12 = iCenterX;
        } else {
            i12 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i13 = iRound2;
        }
        float fH = h(viewGroup, iF, iG, i12, iCenterY, iRound, i13, width, height) / i(viewGroup);
        long jU = rVar.u();
        if (jU < 0) {
            jU = 300;
        }
        return Math.round(((jU * ((long) i11)) / this.f14104b) * fH);
    }

    public void j(int i11) {
        this.f14105c = i11;
    }
}
