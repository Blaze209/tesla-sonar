package ml;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ll.g;
import ll.h0;
import ll.i0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g implements h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f92315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i0 f92316f;

    public d(Drawable drawable) {
        super(drawable);
        this.f92315e = null;
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            i0 i0Var = this.f92316f;
            if (i0Var != null) {
                i0Var.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f92315e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f92315e.draw(canvas);
            }
        }
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // ll.h0
    public void s(i0 i0Var) {
        this.f92316f = i0Var;
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        i0 i0Var = this.f92316f;
        if (i0Var != null) {
            i0Var.o(z11);
        }
        return super.setVisible(z11, z12);
    }

    public void y(Drawable drawable) {
        this.f92315e = drawable;
        invalidateSelf();
    }
}
