package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import st.g;
import st.k;
import u5.h;

/* JADX INFO: loaded from: classes5.dex */
class e extends d {
    private StateListAnimator O;

    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // st.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, rt.b bVar) {
        super(floatingActionButton, bVar);
    }

    @NonNull
    private StateListAnimator j0(float f11, float f12, float f13) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.I, k0(f11, f13));
        stateListAnimator.addState(d.J, k0(f11, f12));
        stateListAnimator.addState(d.K, k0(f11, f12));
        stateListAnimator.addState(d.L, k0(f11, f12));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f42185w, "elevation", f11).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f42185w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f42185w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.D);
        stateListAnimator.addState(d.M, animatorSet);
        stateListAnimator.addState(d.N, k0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        return stateListAnimator;
    }

    @NonNull
    private Animator k0(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f42185w, "elevation", f11).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f42185w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(d.D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void C() {
        f0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(float f11, float f12, float f13) {
        if (this.f42185w.getStateListAnimator() == this.O) {
            StateListAnimator stateListAnimatorJ0 = j0(f11, f12, f13);
            this.O = stateListAnimatorJ0;
            this.f42185w.setStateListAnimator(stateListAnimatorJ0);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f42165c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(qt.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean Z() {
        return this.f42186x.c() || !b0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void d0() {
    }

    @NonNull
    c i0(int i11, ColorStateList colorStateList) {
        Context context = this.f42185w.getContext();
        c cVar = new c((k) h.g(this.f42163a));
        cVar.e(androidx.core.content.b.getColor(context, zs.d.f128612f), androidx.core.content.b.getColor(context, zs.d.f128611e), androidx.core.content.b.getColor(context, zs.d.f128609c), androidx.core.content.b.getColor(context, zs.d.f128610d));
        cVar.d(i11);
        cVar.c(colorStateList);
        return cVar;
    }

    @NonNull
    g l0() {
        return new a((k) h.g(this.f42163a));
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float m() {
        return this.f42185w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void r(@NonNull Rect rect) {
        if (this.f42186x.c()) {
            super.r(rect);
        } else if (b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f42173k - this.f42185w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        Drawable layerDrawable;
        g gVarL0 = l0();
        this.f42164b = gVarL0;
        gVarL0.setTintList(colorStateList);
        if (mode != null) {
            this.f42164b.setTintMode(mode);
        }
        this.f42164b.Q(this.f42185w.getContext());
        if (i11 > 0) {
            this.f42166d = i0(i11, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) h.g(this.f42166d), (Drawable) h.g(this.f42164b)});
        } else {
            this.f42166d = null;
            layerDrawable = this.f42164b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(qt.b.d(colorStateList2), layerDrawable, null);
        this.f42165c = rippleDrawable;
        this.f42167e = rippleDrawable;
    }
}
