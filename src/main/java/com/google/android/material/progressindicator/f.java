package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.b;

/* JADX INFO: loaded from: classes5.dex */
public final class f<S extends b> extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p004c7.d<f<?>> f42514u = new a("indicatorLevel");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h<S> f42515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p004c7.g f42516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p004c7.f f42517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h.a f42518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42519t;

    class a extends p004c7.d<f<?>> {
        a(String str) {
            super(str);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f<?> fVar) {
            return fVar.y() * 10000.0f;
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f<?> fVar, float f11) {
            fVar.A(f11 / 10000.0f);
        }
    }

    f(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar) {
        super(context, bVar);
        this.f42519t = false;
        z(hVar);
        this.f42518s = new h.a();
        p004c7.g gVar = new p004c7.g();
        this.f42516q = gVar;
        gVar.d(1.0f);
        gVar.f(50.0f);
        p004c7.f fVar = new p004c7.f(this, (p004c7.d<f<S>>) f42514u);
        this.f42517r = fVar;
        fVar.y(gVar);
        n(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(float f11) {
        this.f42518s.f42539b = f11;
        invalidateSelf();
    }

    @NonNull
    static f<e> v(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        return new f<>(context, eVar, cVar);
    }

    @NonNull
    static f<n> w(@NonNull Context context, @NonNull n nVar, @NonNull k kVar) {
        return new f<>(context, nVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float y() {
        return this.f42518s.f42539b;
    }

    void B(float f11) {
        setLevel((int) (f11 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f42515p.g(canvas, getBounds(), h(), k(), j());
            this.f42533m.setStyle(Paint.Style.FILL);
            this.f42533m.setAntiAlias(true);
            h.a aVar = this.f42518s;
            b bVar = this.f42522b;
            aVar.f42540c = bVar.f42486c[0];
            int iA = bVar.f42490g;
            if (iA > 0) {
                if (!(this.f42515p instanceof k)) {
                    iA = (int) ((iA * o5.a.a(y(), BitmapDescriptorFactory.HUE_RED, 0.01f)) / 0.01f);
                }
                this.f42515p.d(canvas, this.f42533m, y(), 1.0f, this.f42522b.f42487d, getAlpha(), iA);
            } else {
                this.f42515p.d(canvas, this.f42533m, BitmapDescriptorFactory.HUE_RED, 1.0f, bVar.f42487d, getAlpha(), 0);
            }
            this.f42515p.c(canvas, this.f42533m, this.f42518s, getAlpha());
            this.f42515p.b(canvas, this.f42533m, this.f42522b.f42486c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f42515p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f42515p.f();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f42517r.z();
        A(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        if (this.f42519t) {
            this.f42517r.z();
            A(i11 / 10000.0f);
            return true;
        }
        this.f42517r.n(y() * 10000.0f);
        this.f42517r.t(i11);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z11, boolean z12, boolean z13) {
        return super.q(z11, z12, z13);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean r(boolean z11, boolean z12, boolean z13) {
        boolean zR = super.r(z11, z12, z13);
        float fA = this.f42523c.a(this.f42521a.getContentResolver());
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            this.f42519t = true;
            return zR;
        }
        this.f42519t = false;
        this.f42516q.f(50.0f / fA);
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
    h<S> x() {
        return this.f42515p;
    }

    void z(@NonNull h<S> hVar) {
        this.f42515p = hVar;
    }
}
