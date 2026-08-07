package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import at.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.List;
import u5.h;

/* JADX INFO: loaded from: classes5.dex */
abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final ExtendedFloatingActionButton f42140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f42141c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f42142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f42143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f42144f;

    class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(at.b.a(BitmapDescriptorFactory.HUE_RED, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.G.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f42140b.G.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f11) {
            int colorForState = extendedFloatingActionButton.G.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f42140b.G.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (at.b.a(BitmapDescriptorFactory.HUE_RED, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f11.floatValue() == 1.0f) {
                extendedFloatingActionButton.C(extendedFloatingActionButton.G);
            } else {
                extendedFloatingActionButton.C(colorStateListValueOf);
            }
        }
    }

    b(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f42140b = extendedFloatingActionButton;
        this.f42139a = extendedFloatingActionButton.getContext();
        this.f42142d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void a() {
        this.f42142d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void b(i iVar) {
        this.f42144f = iVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public i c() {
        return this.f42144f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet f() {
        return l(m());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void i() {
        this.f42142d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @NonNull
    public final List<Animator.AnimatorListener> j() {
        return this.f42141c;
    }

    @NonNull
    AnimatorSet l(@NonNull i iVar) {
        ArrayList arrayList = new ArrayList();
        if (iVar.j("opacity")) {
            arrayList.add(iVar.f("opacity", this.f42140b, View.ALPHA));
        }
        if (iVar.j("scale")) {
            arrayList.add(iVar.f("scale", this.f42140b, View.SCALE_Y));
            arrayList.add(iVar.f("scale", this.f42140b, View.SCALE_X));
        }
        if (iVar.j(Snapshot.WIDTH)) {
            arrayList.add(iVar.f(Snapshot.WIDTH, this.f42140b, ExtendedFloatingActionButton.L));
        }
        if (iVar.j(Snapshot.HEIGHT)) {
            arrayList.add(iVar.f(Snapshot.HEIGHT, this.f42140b, ExtendedFloatingActionButton.M));
        }
        if (iVar.j("paddingStart")) {
            arrayList.add(iVar.f("paddingStart", this.f42140b, ExtendedFloatingActionButton.N));
        }
        if (iVar.j("paddingEnd")) {
            arrayList.add(iVar.f("paddingEnd", this.f42140b, ExtendedFloatingActionButton.O));
        }
        if (iVar.j("labelOpacity")) {
            arrayList.add(iVar.f("labelOpacity", this.f42140b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        at.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final i m() {
        i iVar = this.f42144f;
        if (iVar != null) {
            return iVar;
        }
        if (this.f42143e == null) {
            this.f42143e = i.d(this.f42139a, e());
        }
        return (i) h.g(this.f42143e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void onAnimationStart(Animator animator) {
        this.f42142d.c(animator);
    }
}
