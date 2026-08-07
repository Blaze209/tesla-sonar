package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
class e<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f41485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41487c;

    public e() {
        this.f41486b = 0;
        this.f41487c = 0;
    }

    public int I() {
        f fVar = this.f41485a;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    protected void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        coordinatorLayout.onLayoutChild(v11, i11);
    }

    public boolean K(int i11) {
        f fVar = this.f41485a;
        if (fVar != null) {
            return fVar.e(i11);
        }
        this.f41486b = i11;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        J(coordinatorLayout, v11, i11);
        if (this.f41485a == null) {
            this.f41485a = new f(v11);
        }
        this.f41485a.c();
        this.f41485a.a();
        int i12 = this.f41486b;
        if (i12 != 0) {
            this.f41485a.e(i12);
            this.f41486b = 0;
        }
        int i13 = this.f41487c;
        if (i13 == 0) {
            return true;
        }
        this.f41485a.d(i13);
        this.f41487c = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41486b = 0;
        this.f41487c = 0;
    }
}
