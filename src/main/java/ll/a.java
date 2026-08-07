package ll;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable implements Drawable.Callback, g0, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f90083a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable[] f90085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c[] f90086d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f90084b = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f90087e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f90088f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f90089g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f90090h = false;

    /* JADX INFO: renamed from: ll.a$a, reason: collision with other inner class name */
    class C1906a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f90091a;

        C1906a(int i11) {
            this.f90091a = i11;
        }

        @Override // ll.c
        public Drawable a() {
            return a.this.b(this.f90091a);
        }

        @Override // ll.c
        public Drawable o(Drawable drawable) {
            return a.this.e(this.f90091a, drawable);
        }
    }

    public a(Drawable[] drawableArr) {
        int i11 = 0;
        pk.k.g(drawableArr);
        this.f90085c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f90085c;
            if (i11 >= drawableArr2.length) {
                this.f90086d = new c[drawableArr2.length];
                return;
            } else {
                e.d(drawableArr2[i11], this, this);
                i11++;
            }
        }
    }

    private c a(int i11) {
        return new C1906a(i11);
    }

    public Drawable b(int i11) {
        pk.k.b(Boolean.valueOf(i11 >= 0));
        pk.k.b(Boolean.valueOf(i11 < this.f90085c.length));
        return this.f90085c[i11];
    }

    public c c(int i11) {
        pk.k.b(Boolean.valueOf(i11 >= 0));
        pk.k.b(Boolean.valueOf(i11 < this.f90086d.length));
        c[] cVarArr = this.f90086d;
        if (cVarArr[i11] == null) {
            cVarArr[i11] = a(i11);
        }
        return this.f90086d[i11];
    }

    public int d() {
        return this.f90085c.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i11++;
        }
    }

    public Drawable e(int i11, Drawable drawable) {
        pk.k.b(Boolean.valueOf(i11 >= 0));
        pk.k.b(Boolean.valueOf(i11 < this.f90085c.length));
        Drawable drawable2 = this.f90085c[i11];
        if (drawable != drawable2) {
            if (drawable != null && this.f90090h) {
                drawable.mutate();
            }
            e.d(this.f90085c[i11], null, null);
            e.d(drawable, null, null);
            e.e(drawable, this.f90084b);
            e.a(drawable, this);
            e.d(drawable, this, this);
            this.f90089g = false;
            this.f90085c[i11] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i11++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i11++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f90085c.length == 0) {
            return -2;
        }
        int i11 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i11 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f90087e;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i11++;
        }
    }

    @Override // ll.f0
    public void i(g0 g0Var) {
        this.f90083a = g0Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f90089g) {
            this.f90088f = false;
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr = this.f90085c;
                boolean z11 = true;
                if (i11 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i11];
                boolean z12 = this.f90088f;
                if (drawable == null || !drawable.isStateful()) {
                    z11 = false;
                }
                this.f90088f = z12 | z11;
                i11++;
            }
            this.f90089g = true;
        }
        return this.f90088f;
    }

    @Override // ll.g0
    public void k(RectF rectF) {
        g0 g0Var = this.f90083a;
        if (g0Var != null) {
            g0Var.k(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // ll.g0
    public void m(Matrix matrix) {
        g0 g0Var = this.f90083a;
        if (g0Var != null) {
            g0Var.m(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                this.f90090h = true;
                return this;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.mutate();
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i12 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null && drawable.setLevel(i11)) {
                z11 = true;
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setState(iArr)) {
                z11 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f90084b.b(i11);
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setAlpha(i11);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f90084b.c(colorFilter);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f90084b.d(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setDither(z11);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f90084b.e(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setFilterBitmap(z11);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f11, float f12) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setHotspot(f11, f12);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f90085c;
            if (i11 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setVisible(z11, z12);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
