package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f14136a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(e0 e0Var, int i11) {
        int[] iArr;
        if (e0Var == null || (iArr = (int[]) e0Var.f14041a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i11];
    }

    @Override // androidx.transition.a0
    public void a(@NonNull e0 e0Var) {
        View view = e0Var.f14042b;
        Integer numValueOf = (Integer) e0Var.f14041a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        e0Var.f14041a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        e0Var.f14041a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.a0
    public String[] b() {
        return f14136a;
    }

    public int e(e0 e0Var) {
        Integer num;
        if (e0Var == null || (num = (Integer) e0Var.f14041a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(e0 e0Var) {
        return d(e0Var, 0);
    }

    public int g(e0 e0Var) {
        return d(e0Var, 1);
    }
}
