package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f42713a;

    b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f42713a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i11) {
        float fE = e();
        return (fE - i11) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.d
    int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, (e() - this.f42713a.d0()) - this.f42713a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return this.f42713a.n0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return this.f42713a.n0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int h(@NonNull V v11) {
        return v11.getLeft() - this.f42713a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.d
    int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(float f11) {
        return f11 < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(@NonNull View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(float f11, float f12) {
        return e.a(f11, f12) && Math.abs(f11) > ((float) this.f42713a.o0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean n(@NonNull View view, float f11) {
        return Math.abs(((float) view.getRight()) + (f11 * this.f42713a.i0())) > this.f42713a.j0();
    }

    @Override // com.google.android.material.sidesheet.d
    void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.rightMargin = i11;
    }

    @Override // com.google.android.material.sidesheet.d
    void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        int iN0 = this.f42713a.n0();
        if (i11 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i11;
        }
    }
}
