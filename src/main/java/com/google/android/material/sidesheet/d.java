package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    d() {
    }

    abstract int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract float b(int i11);

    abstract int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int d();

    abstract int e();

    abstract int f();

    abstract int g();

    abstract <V extends View> int h(@NonNull V v11);

    abstract int i(@NonNull CoordinatorLayout coordinatorLayout);

    abstract int j();

    abstract boolean k(float f11);

    abstract boolean l(@NonNull View view);

    abstract boolean m(float f11, float f12);

    abstract boolean n(@NonNull View view, float f11);

    abstract void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11);

    abstract void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12);
}
