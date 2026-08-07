package ll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class l extends Drawable implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f90139c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f90137a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f90138b = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Paint f90140d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f90141e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f90142f = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f90143g = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f90144h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f90145i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f90146j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Path f90147k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Path f90148l = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f90149m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f90150n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f90151o = 255;

    public l(int i11) {
        e(i11);
    }

    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    private void i() {
        float[] fArr;
        float[] fArr2;
        this.f90147k.reset();
        this.f90148l.reset();
        this.f90150n.set(getBounds());
        RectF rectF = this.f90150n;
        float f11 = this.f90142f;
        rectF.inset(f11 / 2.0f, f11 / 2.0f);
        int i11 = 0;
        if (this.f90141e) {
            this.f90148l.addCircle(this.f90150n.centerX(), this.f90150n.centerY(), Math.min(this.f90150n.width(), this.f90150n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i12 = 0;
            while (true) {
                fArr = this.f90138b;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = (this.f90137a[i12] + this.f90143g) - (this.f90142f / 2.0f);
                i12++;
            }
            this.f90148l.addRoundRect(this.f90150n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f90150n;
        float f12 = this.f90142f;
        rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
        float f13 = this.f90143g + (this.f90145i ? this.f90142f : BitmapDescriptorFactory.HUE_RED);
        this.f90150n.inset(f13, f13);
        if (this.f90141e) {
            this.f90147k.addCircle(this.f90150n.centerX(), this.f90150n.centerY(), Math.min(this.f90150n.width(), this.f90150n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f90145i) {
            if (this.f90139c == null) {
                this.f90139c = new float[8];
            }
            while (true) {
                fArr2 = this.f90139c;
                if (i11 >= fArr2.length) {
                    break;
                }
                fArr2[i11] = this.f90137a[i11] - this.f90142f;
                i11++;
            }
            this.f90147k.addRoundRect(this.f90150n, fArr2, Path.Direction.CW);
        } else {
            this.f90147k.addRoundRect(this.f90150n, this.f90137a, Path.Direction.CW);
        }
        float f14 = -f13;
        this.f90150n.inset(f14, f14);
    }

    @Override // ll.j
    public void b(int i11, float f11) {
        if (this.f90144h != i11) {
            this.f90144h = i11;
            invalidateSelf();
        }
        if (this.f90142f != f11) {
            this.f90142f = f11;
            i();
            invalidateSelf();
        }
    }

    public boolean c() {
        return this.f90146j;
    }

    @Override // ll.j
    public void d(boolean z11) {
        this.f90141e = z11;
        i();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f90140d.setColor(e.c(this.f90149m, this.f90151o));
        this.f90140d.setStyle(Paint.Style.FILL);
        this.f90140d.setFilterBitmap(c());
        canvas.drawPath(this.f90147k, this.f90140d);
        if (this.f90142f != BitmapDescriptorFactory.HUE_RED) {
            this.f90140d.setColor(e.c(this.f90144h, this.f90151o));
            this.f90140d.setStyle(Paint.Style.STROKE);
            this.f90140d.setStrokeWidth(this.f90142f);
            canvas.drawPath(this.f90148l, this.f90140d);
        }
    }

    public void e(int i11) {
        if (this.f90149m != i11) {
            this.f90149m = i11;
            invalidateSelf();
        }
    }

    @Override // ll.j
    public void f(float f11) {
        if (this.f90143g != f11) {
            this.f90143g = f11;
            i();
            invalidateSelf();
        }
    }

    @Override // ll.j
    public void g(float f11) {
        pk.k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "radius should be non negative");
        Arrays.fill(this.f90137a, f11);
        i();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f90151o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.b(e.c(this.f90149m, this.f90151o));
    }

    @Override // ll.j
    public void j(boolean z11) {
        if (this.f90146j != z11) {
            this.f90146j = z11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i();
    }

    @Override // ll.j
    public void q(boolean z11) {
        if (this.f90145i != z11) {
            this.f90145i = z11;
            i();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f90151o) {
            this.f90151o = i11;
            invalidateSelf();
        }
    }

    @Override // ll.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f90137a, BitmapDescriptorFactory.HUE_RED);
        } else {
            pk.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f90137a, 0, 8);
        }
        i();
        invalidateSelf();
    }

    @Override // ll.j
    public void h(boolean z11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
