package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i.i;
import i.j;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f84579m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f84580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f84581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f84582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f84583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f84584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f84585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f84586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f84587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f84588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f84589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f84590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f84591l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f84580a = paint;
        this.f84586g = new Path();
        this.f84588i = false;
        this.f84591l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.W0, i.a.C, i.f73861b);
        c(typedArrayObtainStyledAttributes.getColor(j.f73867a1, 0));
        b(typedArrayObtainStyledAttributes.getDimension(j.f73891e1, BitmapDescriptorFactory.HUE_RED));
        f(typedArrayObtainStyledAttributes.getBoolean(j.f73885d1, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(j.f73879c1, BitmapDescriptorFactory.HUE_RED)));
        this.f84587h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f73873b1, 0);
        this.f84582c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.Z0, BitmapDescriptorFactory.HUE_RED));
        this.f84581b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.X0, BitmapDescriptorFactory.HUE_RED));
        this.f84583d = typedArrayObtainStyledAttributes.getDimension(j.Y0, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float a(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    public void b(float f11) {
        if (this.f84580a.getStrokeWidth() != f11) {
            this.f84580a.setStrokeWidth(f11);
            this.f84590k = (float) (((double) (f11 / 2.0f)) * Math.cos(f84579m));
            invalidateSelf();
        }
    }

    public void c(int i11) {
        if (i11 != this.f84580a.getColor()) {
            this.f84580a.setColor(i11);
            invalidateSelf();
        }
    }

    public void d(float f11) {
        if (f11 != this.f84584e) {
            this.f84584e = f11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i11 = this.f84591l;
        boolean z11 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? l5.a.f(this) == 0 : l5.a.f(this) == 1))) {
            z11 = true;
        }
        float f11 = this.f84581b;
        float fA = a(this.f84582c, (float) Math.sqrt(f11 * f11 * 2.0f), this.f84589j);
        float fA2 = a(this.f84582c, this.f84583d, this.f84589j);
        float fRound = Math.round(a(BitmapDescriptorFactory.HUE_RED, this.f84590k, this.f84589j));
        float fA3 = a(BitmapDescriptorFactory.HUE_RED, f84579m, this.f84589j);
        float fA4 = a(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.f84589j);
        double d11 = fA;
        double d12 = fA3;
        boolean z12 = z11;
        float fRound2 = Math.round(Math.cos(d12) * d11);
        float fRound3 = Math.round(d11 * Math.sin(d12));
        this.f84586g.rewind();
        float fA5 = a(this.f84584e + this.f84580a.getStrokeWidth(), -this.f84590k, this.f84589j);
        float f12 = (-fA2) / 2.0f;
        this.f84586g.moveTo(f12 + fRound, BitmapDescriptorFactory.HUE_RED);
        this.f84586g.rLineTo(fA2 - (fRound * 2.0f), BitmapDescriptorFactory.HUE_RED);
        this.f84586g.moveTo(f12, fA5);
        this.f84586g.rLineTo(fRound2, fRound3);
        this.f84586g.moveTo(f12, -fA5);
        this.f84586g.rLineTo(fRound2, -fRound3);
        this.f84586g.close();
        canvas.save();
        float strokeWidth = this.f84580a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f13 = this.f84584e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f13 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f13);
        if (this.f84585f) {
            canvas.rotate(fA4 * (this.f84588i ^ z12 ? -1 : 1));
        } else if (z12) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f84586g, this.f84580a);
        canvas.restore();
    }

    public void e(float f11) {
        if (this.f84589j != f11) {
            this.f84589j = f11;
            invalidateSelf();
        }
    }

    public void f(boolean z11) {
        if (this.f84585f != z11) {
            this.f84585f = z11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f84587h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f84587h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f84580a.getAlpha()) {
            this.f84580a.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f84580a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
