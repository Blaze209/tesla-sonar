package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f42712a;

    a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f42712a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i11) {
        float fE = e();
        return (i11 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.d
    int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, this.f42712a.m0() + this.f42712a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return (-this.f42712a.d0()) - this.f42712a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return this.f42712a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return -this.f42712a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int h(@NonNull V v11) {
        return v11.getRight() + this.f42712a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(float f11) {
        return f11 > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(float f11, float f12) {
        return e.a(f11, f12) && Math.abs(f11) > ((float) this.f42712a.o0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean n(@NonNull View view, float f11) {
        return Math.abs(((float) view.getLeft()) + (f11 * this.f42712a.i0())) > this.f42712a.j0();
    }

    @Override // com.google.android.material.sidesheet.d
    void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.leftMargin = i11;
    }

    @Override // com.google.android.material.sidesheet.d
    void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        if (i11 <= this.f42712a.n0()) {
            marginLayoutParams.leftMargin = i12;
        }
    }
}
