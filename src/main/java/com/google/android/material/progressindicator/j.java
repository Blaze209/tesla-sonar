package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.b;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j<S extends b> extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h<S> f42544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private i<ObjectAnimator> f42545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f42546r;

    j(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar, @NonNull i<ObjectAnimator> iVar) {
        super(context, bVar);
        z(hVar);
        y(iVar);
    }

    @NonNull
    static j<e> t(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.A(androidx.vectordrawable.graphics.drawable.g.b(context.getResources(), zs.f.f128673d, null));
        return jVar;
    }

    @NonNull
    static j<n> u(@NonNull Context context, @NonNull n nVar, @NonNull k kVar) {
        return new j<>(context, nVar, kVar, nVar.f42573h == 0 ? new l(nVar) : new m(context, nVar));
    }

    private boolean x() {
        ot.a aVar = this.f42523c;
        return aVar != null && aVar.a(this.f42521a.getContentResolver()) == BitmapDescriptorFactory.HUE_RED;
    }

    public void A(Drawable drawable) {
        this.f42546r = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i11;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (x() && (drawable = this.f42546r) != null) {
                drawable.setBounds(getBounds());
                l5.a.n(this.f42546r, this.f42522b.f42486c[0]);
                this.f42546r.draw(canvas);
                return;
            }
            canvas.save();
            this.f42544p.g(canvas, getBounds(), h(), k(), j());
            int i12 = this.f42522b.f42490g;
            int alpha = getAlpha();
            if (i12 == 0) {
                this.f42544p.d(canvas, this.f42533m, BitmapDescriptorFactory.HUE_RED, 1.0f, this.f42522b.f42487d, alpha, 0);
                i11 = i12;
            } else {
                h.a aVar = this.f42545q.f42543b.get(0);
                List<h.a> list = this.f42545q.f42543b;
                h.a aVar2 = list.get(list.size() - 1);
                h<S> hVar = this.f42544p;
                if (hVar instanceof k) {
                    i11 = i12;
                    hVar.d(canvas, this.f42533m, BitmapDescriptorFactory.HUE_RED, aVar.f42538a, this.f42522b.f42487d, alpha, i11);
                    this.f42544p.d(canvas, this.f42533m, aVar2.f42539b, 1.0f, this.f42522b.f42487d, alpha, i11);
                } else {
                    i11 = i12;
                    alpha = 0;
                    hVar.d(canvas, this.f42533m, aVar2.f42539b, 1.0f + aVar.f42538a, this.f42522b.f42487d, 0, i11);
                }
            }
            for (int i13 = 0; i13 < this.f42545q.f42543b.size(); i13++) {
                h.a aVar3 = this.f42545q.f42543b.get(i13);
                this.f42544p.c(canvas, this.f42533m, aVar3, getAlpha());
                if (i13 > 0 && i11 > 0) {
                    this.f42544p.d(canvas, this.f42533m, this.f42545q.f42543b.get(i13 - 1).f42539b, aVar3.f42538a, this.f42522b.f42487d, alpha, i11);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f42544p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f42544p.f();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z11, boolean z12, boolean z13) {
        return super.q(z11, z12, z13);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean r(boolean z11, boolean z12, boolean z13) {
        Drawable drawable;
        boolean zR = super.r(z11, z12, z13);
        if (x() && (drawable = this.f42546r) != null) {
            return drawable.setVisible(z11, z12);
        }
        if (!isRunning()) {
            this.f42545q.a();
        }
        if (!z11 || !z13) {
            return zR;
        }
        this.f42545q.g();
        return zR;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean s(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.s(bVar);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i11) {
        super.setAlpha(i11);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    i<ObjectAnimator> v() {
        return this.f42545q;
    }

    @NonNull
    h<S> w() {
        return this.f42544p;
    }

    void y(@NonNull i<ObjectAnimator> iVar) {
        this.f42545q = iVar;
        iVar.e(this);
    }

    void z(@NonNull h<S> hVar) {
        this.f42544p = hVar;
    }
}
