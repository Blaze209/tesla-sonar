package ll;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class m extends g implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f90152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f90153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f90154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f90155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f90156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f90157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Paint f90158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f90159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f90160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f90161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f90162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f90163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f90164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f90165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Path f90166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f90167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f90168u;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90169a;

        static {
            int[] iArr = new int[b.values().length];
            f90169a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90169a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) pk.k.g(drawable));
        this.f90152e = b.OVERLAY_COLOR;
        this.f90153f = new RectF();
        this.f90156i = new float[8];
        this.f90157j = new float[8];
        this.f90158k = new Paint(1);
        this.f90159l = false;
        this.f90160m = BitmapDescriptorFactory.HUE_RED;
        this.f90161n = 0;
        this.f90162o = 0;
        this.f90163p = BitmapDescriptorFactory.HUE_RED;
        this.f90164q = false;
        this.f90165r = false;
        this.f90166s = new Path();
        this.f90167t = new Path();
        this.f90168u = new RectF();
    }

    private void A() {
        float[] fArr;
        this.f90166s.reset();
        this.f90167t.reset();
        this.f90168u.set(getBounds());
        RectF rectF = this.f90168u;
        float f11 = this.f90163p;
        rectF.inset(f11, f11);
        if (this.f90152e == b.OVERLAY_COLOR) {
            this.f90166s.addRect(this.f90168u, Path.Direction.CW);
        }
        if (this.f90159l) {
            this.f90166s.addCircle(this.f90168u.centerX(), this.f90168u.centerY(), Math.min(this.f90168u.width(), this.f90168u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f90166s.addRoundRect(this.f90168u, this.f90156i, Path.Direction.CW);
        }
        RectF rectF2 = this.f90168u;
        float f12 = this.f90163p;
        rectF2.inset(-f12, -f12);
        RectF rectF3 = this.f90168u;
        float f13 = this.f90160m;
        rectF3.inset(f13 / 2.0f, f13 / 2.0f);
        if (this.f90159l) {
            this.f90167t.addCircle(this.f90168u.centerX(), this.f90168u.centerY(), Math.min(this.f90168u.width(), this.f90168u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f90157j;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f90156i[i11] + this.f90163p) - (this.f90160m / 2.0f);
                i11++;
            }
            this.f90167t.addRoundRect(this.f90168u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f90168u;
        float f14 = this.f90160m;
        rectF4.inset((-f14) / 2.0f, (-f14) / 2.0f);
    }

    @Override // ll.j
    public void b(int i11, float f11) {
        this.f90161n = i11;
        this.f90160m = f11;
        A();
        invalidateSelf();
    }

    @Override // ll.j
    public void d(boolean z11) {
        this.f90159l = z11;
        A();
        invalidateSelf();
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f90153f.set(getBounds());
        int i11 = a.f90169a[this.f90152e.ordinal()];
        if (i11 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f90166s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i11 == 2) {
            if (this.f90164q) {
                RectF rectF = this.f90154g;
                if (rectF == null) {
                    this.f90154g = new RectF(this.f90153f);
                    this.f90155h = new Matrix();
                } else {
                    rectF.set(this.f90153f);
                }
                RectF rectF2 = this.f90154g;
                float f11 = this.f90160m;
                rectF2.inset(f11, f11);
                Matrix matrix = this.f90155h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f90153f, this.f90154g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f90153f);
                canvas.concat(this.f90155h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f90158k.setStyle(Paint.Style.FILL);
            this.f90158k.setColor(this.f90162o);
            this.f90158k.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
            this.f90158k.setFilterBitmap(y());
            this.f90166s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f90166s, this.f90158k);
            if (this.f90159l) {
                float fWidth = ((this.f90153f.width() - this.f90153f.height()) + this.f90160m) / 2.0f;
                float fHeight = ((this.f90153f.height() - this.f90153f.width()) + this.f90160m) / 2.0f;
                if (fWidth > BitmapDescriptorFactory.HUE_RED) {
                    RectF rectF3 = this.f90153f;
                    float f12 = rectF3.left;
                    canvas.drawRect(f12, rectF3.top, f12 + fWidth, rectF3.bottom, this.f90158k);
                    RectF rectF4 = this.f90153f;
                    float f13 = rectF4.right;
                    canvas.drawRect(f13 - fWidth, rectF4.top, f13, rectF4.bottom, this.f90158k);
                }
                if (fHeight > BitmapDescriptorFactory.HUE_RED) {
                    RectF rectF5 = this.f90153f;
                    float f14 = rectF5.left;
                    float f15 = rectF5.top;
                    canvas.drawRect(f14, f15, rectF5.right, f15 + fHeight, this.f90158k);
                    RectF rectF6 = this.f90153f;
                    float f16 = rectF6.left;
                    float f17 = rectF6.bottom;
                    canvas.drawRect(f16, f17 - fHeight, rectF6.right, f17, this.f90158k);
                }
            }
        }
        if (this.f90161n != 0) {
            this.f90158k.setStyle(Paint.Style.STROKE);
            this.f90158k.setColor(this.f90161n);
            this.f90158k.setStrokeWidth(this.f90160m);
            this.f90166s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f90167t, this.f90158k);
        }
    }

    @Override // ll.j
    public void f(float f11) {
        this.f90163p = f11;
        A();
        invalidateSelf();
    }

    @Override // ll.j
    public void g(float f11) {
        Arrays.fill(this.f90156i, f11);
        A();
        invalidateSelf();
    }

    @Override // ll.j
    public void j(boolean z11) {
        if (this.f90165r != z11) {
            this.f90165r = z11;
            invalidateSelf();
        }
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A();
    }

    @Override // ll.j
    public void q(boolean z11) {
        this.f90164q = z11;
        A();
        invalidateSelf();
    }

    @Override // ll.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f90156i, BitmapDescriptorFactory.HUE_RED);
        } else {
            pk.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f90156i, 0, 8);
        }
        A();
        invalidateSelf();
    }

    public boolean y() {
        return this.f90165r;
    }

    public void z(int i11) {
        this.f90162o = i11;
        invalidateSelf();
    }

    @Override // ll.j
    public void h(boolean z11) {
    }
}
