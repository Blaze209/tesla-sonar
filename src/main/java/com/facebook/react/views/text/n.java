package com.facebook.react.views.text;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23769a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23770b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23771c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23772d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23773e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23774f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private p f23775g = p.UNSET;

    public n a(n nVar) {
        n nVar2 = new n();
        nVar2.f23769a = this.f23769a;
        nVar2.f23770b = !Float.isNaN(nVar.f23770b) ? nVar.f23770b : this.f23770b;
        nVar2.f23771c = !Float.isNaN(nVar.f23771c) ? nVar.f23771c : this.f23771c;
        nVar2.f23772d = !Float.isNaN(nVar.f23772d) ? nVar.f23772d : this.f23772d;
        nVar2.f23773e = !Float.isNaN(nVar.f23773e) ? nVar.f23773e : this.f23773e;
        nVar2.f23774f = !Float.isNaN(nVar.f23774f) ? nVar.f23774f : this.f23774f;
        p pVar = nVar.f23775g;
        if (pVar == p.UNSET) {
            pVar = this.f23775g;
        }
        nVar2.f23775g = pVar;
        return nVar2;
    }

    public boolean b() {
        return this.f23769a;
    }

    public int c() {
        float f11 = !Float.isNaN(this.f23770b) ? this.f23770b : 14.0f;
        return (int) (this.f23769a ? Math.ceil(w.k(f11, f())) : Math.ceil(w.h(f11)));
    }

    public float d() {
        if (Float.isNaN(this.f23772d)) {
            return Float.NaN;
        }
        return (this.f23769a ? w.k(this.f23772d, f()) : w.h(this.f23772d)) / c();
    }

    public float e() {
        if (Float.isNaN(this.f23771c)) {
            return Float.NaN;
        }
        float fK = this.f23769a ? w.k(this.f23771c, f()) : w.h(this.f23771c);
        if (!Float.isNaN(this.f23774f)) {
            float f11 = this.f23774f;
            if (f11 > fK) {
                return f11;
            }
        }
        return fK;
    }

    public float f() {
        return !Float.isNaN(this.f23773e) ? this.f23773e : BitmapDescriptorFactory.HUE_RED;
    }

    public float g() {
        return this.f23770b;
    }

    public float h() {
        return this.f23774f;
    }

    public float i() {
        return this.f23772d;
    }

    public float j() {
        return this.f23771c;
    }

    public float k() {
        return this.f23773e;
    }

    public p l() {
        return this.f23775g;
    }

    public void m(boolean z11) {
        this.f23769a = z11;
    }

    public void n(float f11) {
        this.f23770b = f11;
    }

    public void o(float f11) {
        this.f23774f = f11;
    }

    public void p(float f11) {
        this.f23772d = f11;
    }

    public void q(float f11) {
        this.f23771c = f11;
    }

    public void r(float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f) {
            this.f23773e = f11;
        } else {
            qk.a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f23773e = Float.NaN;
        }
    }

    public void s(@NonNull p pVar) {
        this.f23775g = pVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
