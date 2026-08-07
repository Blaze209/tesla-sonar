package ll;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f90094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f90095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f90096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f90097h;

    public b(Drawable drawable, int i11) {
        this(drawable, i11, true);
    }

    private int y() {
        return (int) ((20.0f / this.f90094e) * 360.0f);
    }

    private void z() {
        if (this.f90097h) {
            return;
        }
        this.f90097h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i11 = bounds.right;
        int i12 = bounds.left;
        int i13 = i11 - i12;
        int i14 = bounds.bottom;
        int i15 = bounds.top;
        int i16 = i14 - i15;
        float f11 = this.f90096g;
        if (!this.f90095f) {
            f11 = 360.0f - f11;
        }
        canvas.rotate(f11, i12 + (i13 / 2), i15 + (i16 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        z();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f90097h = false;
        this.f90096g += y();
        invalidateSelf();
    }

    public b(Drawable drawable, int i11, boolean z11) {
        super((Drawable) pk.k.g(drawable));
        this.f90096g = BitmapDescriptorFactory.HUE_RED;
        this.f90097h = false;
        this.f90094e = i11;
        this.f90095f = z11;
    }
}
