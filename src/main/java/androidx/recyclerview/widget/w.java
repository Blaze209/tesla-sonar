package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class w {
    static int a(RecyclerView.c0 c0Var, t tVar, View view, View view2, RecyclerView.q qVar, boolean z11) {
        if (qVar.P() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(qVar.m0(view) - qVar.m0(view2)) + 1;
        }
        return Math.min(tVar.n(), tVar.d(view2) - tVar.g(view));
    }

    static int b(RecyclerView.c0 c0Var, t tVar, View view, View view2, RecyclerView.q qVar, boolean z11, boolean z12) {
        if (qVar.P() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z12 ? Math.max(0, (c0Var.b() - Math.max(qVar.m0(view), qVar.m0(view2))) - 1) : Math.max(0, Math.min(qVar.m0(view), qVar.m0(view2)));
        if (z11) {
            return Math.round((iMax * (Math.abs(tVar.d(view2) - tVar.g(view)) / (Math.abs(qVar.m0(view) - qVar.m0(view2)) + 1))) + (tVar.m() - tVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.c0 c0Var, t tVar, View view, View view2, RecyclerView.q qVar, boolean z11) {
        if (qVar.P() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return c0Var.b();
        }
        return (int) (((tVar.d(view2) - tVar.g(view)) / (Math.abs(qVar.m0(view) - qVar.m0(view2)) + 1)) * c0Var.b());
    }
}
