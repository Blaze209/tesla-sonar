package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import st.k;
import st.l;

/* JADX INFO: loaded from: classes5.dex */
class c extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f42147b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f42153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42158m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k f42160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f42161p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f42146a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f42148c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f42149d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f42150e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f42151f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f42152g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42159n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(k kVar) {
        this.f42160o = kVar;
        Paint paint = new Paint(1);
        this.f42147b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    private Shader a() {
        Rect rect = this.f42149d;
        copyBounds(rect);
        float fHeight = this.f42153h / rect.height();
        return new LinearGradient(BitmapDescriptorFactory.HUE_RED, rect.top, BitmapDescriptorFactory.HUE_RED, rect.bottom, new int[]{k5.d.h(this.f42154i, this.f42158m), k5.d.h(this.f42155j, this.f42158m), k5.d.h(k5.d.l(this.f42155j, 0), this.f42158m), k5.d.h(k5.d.l(this.f42157l, 0), this.f42158m), k5.d.h(this.f42157l, this.f42158m), k5.d.h(this.f42156k, this.f42158m)}, new float[]{BitmapDescriptorFactory.HUE_RED, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    protected RectF b() {
        this.f42151f.set(getBounds());
        return this.f42151f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f42158m = colorStateList.getColorForState(getState(), this.f42158m);
        }
        this.f42161p = colorStateList;
        this.f42159n = true;
        invalidateSelf();
    }

    public void d(float f11) {
        if (this.f42153h != f11) {
            this.f42153h = f11;
            this.f42147b.setStrokeWidth(f11 * 1.3333f);
            this.f42159n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f42159n) {
            this.f42147b.setShader(a());
            this.f42159n = false;
        }
        float strokeWidth = this.f42147b.getStrokeWidth() / 2.0f;
        copyBounds(this.f42149d);
        this.f42150e.set(this.f42149d);
        float fMin = Math.min(this.f42160o.r().a(b()), this.f42150e.width() / 2.0f);
        if (this.f42160o.u(b())) {
            this.f42150e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f42150e, fMin, fMin, this.f42147b);
        }
    }

    void e(int i11, int i12, int i13, int i14) {
        this.f42154i = i11;
        this.f42155j = i12;
        this.f42156k = i13;
        this.f42157l = i14;
    }

    public void f(k kVar) {
        this.f42160o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f42152g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f42153h > BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f42160o.u(b())) {
            outline.setRoundRect(getBounds(), this.f42160o.r().a(b()));
        } else {
            copyBounds(this.f42149d);
            this.f42150e.set(this.f42149d);
            this.f42146a.d(this.f42160o, 1.0f, this.f42150e, this.f42148c);
            com.google.android.material.drawable.c.l(outline, this.f42148c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f42160o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f42153h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f42161p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f42159n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f42161p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f42158m)) != this.f42158m) {
            this.f42159n = true;
            this.f42158m = colorForState;
        }
        if (this.f42159n) {
            invalidateSelf();
        }
        return this.f42159n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f42147b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42147b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
