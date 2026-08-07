package ll;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class h extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Matrix f90128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f90129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f90130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f90131h;

    private void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f90130g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f90131h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f90129f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f90129f = this.f90128e;
        }
    }

    private void z() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f90130g == current.getIntrinsicWidth() && this.f90131h == current.getIntrinsicHeight()) {
            return;
        }
        y();
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        z();
        if (this.f90129f == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f90129f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // ll.g, ll.g0
    public void m(Matrix matrix) {
        super.m(matrix);
        Matrix matrix2 = this.f90129f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        y();
    }

    @Override // ll.g
    public Drawable w(Drawable drawable) {
        Drawable drawableW = super.w(drawable);
        y();
        return drawableW;
    }
}
