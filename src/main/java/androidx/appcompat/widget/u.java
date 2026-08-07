package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
class u extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f2817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f2818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f2819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f2820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2822i;

    u(SeekBar seekBar) {
        super(seekBar);
        this.f2819f = null;
        this.f2820g = null;
        this.f2821h = false;
        this.f2822i = false;
        this.f2817d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f2818e;
        if (drawable != null) {
            if (this.f2821h || this.f2822i) {
                Drawable drawableR = l5.a.r(drawable.mutate());
                this.f2818e = drawableR;
                if (this.f2821h) {
                    l5.a.o(drawableR, this.f2819f);
                }
                if (this.f2822i) {
                    l5.a.p(this.f2818e, this.f2820g);
                }
                if (this.f2818e.isStateful()) {
                    this.f2818e.setState(this.f2817d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.o
    void c(AttributeSet attributeSet, int i11) {
        super.c(attributeSet, i11);
        b1 b1VarV = b1.v(this.f2817d.getContext(), attributeSet, i.j.V, i11, 0);
        SeekBar seekBar = this.f2817d;
        ViewCompat.n0(seekBar, seekBar.getContext(), i.j.V, attributeSet, b1VarV.r(), i11, 0);
        Drawable drawableH = b1VarV.h(i.j.W);
        if (drawableH != null) {
            this.f2817d.setThumb(drawableH);
        }
        j(b1VarV.g(i.j.X));
        if (b1VarV.s(i.j.Z)) {
            this.f2820g = j0.d(b1VarV.k(i.j.Z, -1), this.f2820g);
            this.f2822i = true;
        }
        if (b1VarV.s(i.j.Y)) {
            this.f2819f = b1VarV.c(i.j.Y);
            this.f2821h = true;
        }
        b1VarV.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f2818e != null) {
            int max = this.f2817d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2818e.getIntrinsicWidth();
                int intrinsicHeight = this.f2818e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2818e.setBounds(-i11, -i12, i11, i12);
                float width = ((this.f2817d.getWidth() - this.f2817d.getPaddingLeft()) - this.f2817d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f2817d.getPaddingLeft(), this.f2817d.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f2818e.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f2818e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2817d.getDrawableState())) {
            this.f2817d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f2818e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f2818e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2818e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2817d);
            l5.a.m(drawable, ViewCompat.A(this.f2817d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2817d.getDrawableState());
            }
            f();
        }
        this.f2817d.invalidate();
    }
}
