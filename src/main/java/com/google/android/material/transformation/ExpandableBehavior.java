package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43093a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f43094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ lt.a f43096c;

        a(View view, int i11, lt.a aVar) {
            this.f43094a = view;
            this.f43095b = i11;
            this.f43096c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f43094a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f43093a == this.f43095b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                lt.a aVar = this.f43096c;
                expandableBehavior.L((View) aVar, this.f43094a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f43093a = 0;
    }

    private boolean J(boolean z11) {
        if (!z11) {
            return this.f43093a == 1;
        }
        int i11 = this.f43093a;
        return i11 == 0 || i11 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected lt.a K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = dependencies.get(i11);
            if (i(coordinatorLayout, view, view2)) {
                return (lt.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean L(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        lt.a aVar = (lt.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f43093a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        lt.a aVarK;
        if (ViewCompat.U(view) || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i12 = aVarK.a() ? 1 : 2;
        this.f43093a = i12;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43093a = 0;
    }
}
