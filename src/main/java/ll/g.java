package ll;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class g extends Drawable implements Drawable.Callback, g0, f0, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f90124d = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f90125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f90126b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected g0 f90127c;

    public g(Drawable drawable) {
        this.f90125a = drawable;
        e.d(drawable, this, this);
    }

    @Override // ll.c
    public Drawable a() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f90125a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f90125a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // ll.f0
    public void i(g0 g0Var) {
        this.f90127c = g0Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f90125a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // ll.g0
    public void k(RectF rectF) {
        g0 g0Var = this.f90127c;
        if (g0Var != null) {
            g0Var.k(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // ll.g0
    public void m(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // ll.c
    public Drawable o(Drawable drawable) {
        return w(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.onLevelChange(i11) : drawable.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f90125a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f90126b.b(i11);
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f90126b.c(colorFilter);
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f90126b.d(z11);
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setDither(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f90126b.e(z11);
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setFilterBitmap(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.f90125a;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.f90125a;
        return drawable == null ? visible : drawable.setVisible(z11, z12);
    }

    protected void u(Matrix matrix) {
        g0 g0Var = this.f90127c;
        if (g0Var != null) {
            g0Var.m(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void v(RectF rectF) {
        Matrix matrix = f90124d;
        u(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    public Drawable w(Drawable drawable) {
        Drawable drawableX = x(drawable);
        invalidateSelf();
        return drawableX;
    }

    protected Drawable x(Drawable drawable) {
        Drawable drawable2 = this.f90125a;
        e.d(drawable2, null, null);
        e.d(drawable, null, null);
        e.e(drawable, this.f90126b);
        e.a(drawable, this);
        e.d(drawable, this, this);
        this.f90125a = drawable;
        return drawable2;
    }
}
