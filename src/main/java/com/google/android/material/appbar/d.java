package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class d extends e<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Rect f41481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f41482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41484g;

    public d() {
        this.f41481d = new Rect();
        this.f41482e = new Rect();
        this.f41483f = 0;
    }

    private static int R(int i11) {
        if (i11 == 0) {
            return 8388659;
        }
        return i11;
    }

    @Override // com.google.android.material.appbar.e
    protected void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        View viewL = L(coordinatorLayout.getDependencies(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i11);
            this.f41483f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f41481d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.x(coordinatorLayout) && !ViewCompat.x(view)) {
            rect.left += lastWindowInsets.k();
            rect.right -= lastWindowInsets.l();
        }
        Rect rect2 = this.f41482e;
        k.a(R(fVar.f7405c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i11);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f41483f = rect2.top - viewL.getBottom();
    }

    abstract View L(List<View> list);

    final int M(View view) {
        if (this.f41484g == 0) {
            return 0;
        }
        float fN = N(view);
        int i11 = this.f41484g;
        return o5.a.b((int) (fN * i11), 0, i11);
    }

    float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.f41484g;
    }

    int P(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    final int Q() {
        return this.f41483f;
    }

    public final void S(int i11) {
        this.f41484g = i11;
    }

    protected boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
        View viewL;
        WindowInsetsCompat lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 != -1 && i15 != -2) || (viewL = L(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.x(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            iP -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i11, i12, View.MeasureSpec.makeMeasureSpec(iP, i15 == -1 ? 1073741824 : Integer.MIN_VALUE), i14);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41481d = new Rect();
        this.f41482e = new Rect();
        this.f41483f = 0;
    }
}
