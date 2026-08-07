package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class u extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f13583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f13584e;

    class a extends p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.b0
        protected void o(@NonNull View view, @NonNull RecyclerView.c0 c0Var, @NonNull RecyclerView.b0.a aVar) {
            u uVar = u.this;
            int[] iArrC = uVar.c(uVar.f13590a.getLayoutManager(), view);
            int i11 = iArrC[0];
            int i12 = iArrC[1];
            int iW = w(Math.max(Math.abs(i11), Math.abs(i12)));
            if (iW > 0) {
                aVar.d(i11, i12, iW, this.f13571j);
            }
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.p
        protected int x(int i11) {
            return Math.min(100, super.x(i11));
        }
    }

    private int k(@NonNull View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.m() + (tVar.n() / 2));
    }

    private View l(RecyclerView.q qVar, t tVar) {
        int iP = qVar.P();
        View view = null;
        if (iP == 0) {
            return null;
        }
        int iM = tVar.m() + (tVar.n() / 2);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iP; i12++) {
            View viewO = qVar.O(i12);
            int iAbs = Math.abs((tVar.g(viewO) + (tVar.e(viewO) / 2)) - iM);
            if (iAbs < i11) {
                view = viewO;
                i11 = iAbs;
            }
        }
        return view;
    }

    @NonNull
    private t m(@NonNull RecyclerView.q qVar) {
        t tVar = this.f13584e;
        if (tVar == null || tVar.f13580a != qVar) {
            this.f13584e = t.a(qVar);
        }
        return this.f13584e;
    }

    private t n(RecyclerView.q qVar) {
        if (qVar.r()) {
            return o(qVar);
        }
        if (qVar.q()) {
            return m(qVar);
        }
        return null;
    }

    @NonNull
    private t o(@NonNull RecyclerView.q qVar) {
        t tVar = this.f13583d;
        if (tVar == null || tVar.f13580a != qVar) {
            this.f13583d = t.c(qVar);
        }
        return this.f13583d;
    }

    private boolean p(RecyclerView.q qVar, int i11, int i12) {
        if (qVar.q()) {
            return i11 > 0;
        }
        return i12 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.q qVar) {
        PointF pointFC;
        int iA = qVar.a();
        if (!(qVar instanceof RecyclerView.b0.b) || (pointFC = ((RecyclerView.b0.b) qVar).c(iA - 1)) == null) {
            return false;
        }
        return pointFC.x < BitmapDescriptorFactory.HUE_RED || pointFC.y < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.recyclerview.widget.y
    public int[] c(@NonNull RecyclerView.q qVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (qVar.q()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.r()) {
            iArr[1] = k(view, o(qVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y
    protected RecyclerView.b0 d(@NonNull RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.b0.b) {
            return new a(this.f13590a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.q qVar) {
        if (qVar.r()) {
            return l(qVar, o(qVar));
        }
        if (qVar.q()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.q qVar, int i11, int i12) {
        t tVarN;
        int iA = qVar.a();
        if (iA == 0 || (tVarN = n(qVar)) == null) {
            return -1;
        }
        int iP = qVar.P();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < iP; i15++) {
            View viewO = qVar.O(i15);
            if (viewO != null) {
                int iK = k(viewO, tVarN);
                if (iK <= 0 && iK > i14) {
                    view2 = viewO;
                    i14 = iK;
                }
                if (iK >= 0 && iK < i13) {
                    view = viewO;
                    i13 = iK;
                }
            }
        }
        boolean zP = p(qVar, i11, i12);
        if (zP && view != null) {
            return qVar.m0(view);
        }
        if (!zP && view2 != null) {
            return qVar.m0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM0 = qVar.m0(view) + (q(qVar) == zP ? -1 : 1);
        if (iM0 < 0 || iM0 >= iA) {
            return -1;
        }
        return iM0;
    }
}
