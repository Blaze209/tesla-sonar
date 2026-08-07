package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3796a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f3798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f3799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3800e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f3803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f3804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f3805j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3801f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3802g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f3806k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f3797b = new Paint(5);

    d(ColorStateList colorStateList, float f11) {
        this.f3796a = f11;
        e(colorStateList);
        this.f3798c = new RectF();
        this.f3799d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3803h = colorStateList;
        this.f3797b.setColor(colorStateList.getColorForState(getState(), this.f3803h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3798c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3799d.set(rect);
        if (this.f3801f) {
            this.f3799d.inset((int) Math.ceil(e.a(this.f3800e, this.f3796a, this.f3802g)), (int) Math.ceil(e.b(this.f3800e, this.f3796a, this.f3802g)));
            this.f3798c.set(this.f3799d);
        }
    }

    public ColorStateList b() {
        return this.f3803h;
    }

    float c() {
        return this.f3800e;
    }

    public float d() {
        return this.f3796a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f3797b;
        if (this.f3804i == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f3804i);
            z11 = true;
        }
        RectF rectF = this.f3798c;
        float f11 = this.f3796a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f11, boolean z11, boolean z12) {
        if (f11 == this.f3800e && this.f3801f == z11 && this.f3802g == z12) {
            return;
        }
        this.f3800e = f11;
        this.f3801f = z11;
        this.f3802g = z12;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3799d, this.f3796a);
    }

    void h(float f11) {
        if (f11 == this.f3796a) {
            return;
        }
        this.f3796a = f11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f3805j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3803h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3803h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z11 = colorForState != this.f3797b.getColor();
        if (z11) {
            this.f3797b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3805j;
        if (colorStateList2 == null || (mode = this.f3806k) == null) {
            return z11;
        }
        this.f3804i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f3797b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3797b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3805j = colorStateList;
        this.f3804i = a(colorStateList, this.f3806k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3806k = mode;
        this.f3804i = a(this.f3805j, mode);
        invalidateSelf();
    }
}
