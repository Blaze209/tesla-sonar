package ll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends Drawable implements j, f0 {
    private g0 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f90170a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float[] f90180k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    RectF f90185p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Matrix f90191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Matrix f90192w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f90171b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f90172c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f90173d = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Path f90174e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f90175f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f90176g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Path f90177h = new Path();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f90178i = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f90179j = new float[8];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f90181l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f90182m = new RectF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RectF f90183n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final RectF f90184o = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Matrix f90186q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Matrix f90187r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Matrix f90188s = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Matrix f90189t = new Matrix();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Matrix f90190u = new Matrix();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Matrix f90193x = new Matrix();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f90194y = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f90195z = false;
    private boolean A = false;
    private boolean B = true;

    n(Drawable drawable) {
        this.f90170a = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean e(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // ll.j
    public void b(int i11, float f11) {
        if (this.f90176g == i11 && this.f90173d == f11) {
            return;
        }
        this.f90176g = i11;
        this.f90173d = f11;
        this.B = true;
        invalidateSelf();
    }

    public boolean c() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f90170a.clearColorFilter();
    }

    @Override // ll.j
    public void d(boolean z11) {
        this.f90171b = z11;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (bn.b.d()) {
            bn.b.a("RoundedDrawable#draw");
        }
        this.f90170a.draw(canvas);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    @Override // ll.j
    public void f(float f11) {
        if (this.f90194y != f11) {
            this.f90194y = f11;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // ll.j
    public void g(float f11) {
        pk.k.i(f11 >= BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f90178i, f11);
        this.f90172c = f11 != BitmapDescriptorFactory.HUE_RED;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f90170a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f90170a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f90170a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f90170a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f90170a.getOpacity();
    }

    @Override // ll.f0
    public void i(g0 g0Var) {
        this.C = g0Var;
    }

    @Override // ll.j
    public void j(boolean z11) {
        if (this.A != z11) {
            this.A = z11;
            invalidateSelf();
        }
    }

    boolean k() {
        return this.f90171b || this.f90172c || this.f90173d > BitmapDescriptorFactory.HUE_RED;
    }

    protected void l() {
        float[] fArr;
        if (this.B) {
            this.f90177h.reset();
            RectF rectF = this.f90181l;
            float f11 = this.f90173d;
            rectF.inset(f11 / 2.0f, f11 / 2.0f);
            if (this.f90171b) {
                this.f90177h.addCircle(this.f90181l.centerX(), this.f90181l.centerY(), Math.min(this.f90181l.width(), this.f90181l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i11 = 0;
                while (true) {
                    fArr = this.f90179j;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    fArr[i11] = (this.f90178i[i11] + this.f90194y) - (this.f90173d / 2.0f);
                    i11++;
                }
                this.f90177h.addRoundRect(this.f90181l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f90181l;
            float f12 = this.f90173d;
            rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
            this.f90174e.reset();
            float f13 = this.f90194y + (this.f90195z ? this.f90173d : BitmapDescriptorFactory.HUE_RED);
            this.f90181l.inset(f13, f13);
            if (this.f90171b) {
                this.f90174e.addCircle(this.f90181l.centerX(), this.f90181l.centerY(), Math.min(this.f90181l.width(), this.f90181l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f90195z) {
                if (this.f90180k == null) {
                    this.f90180k = new float[8];
                }
                for (int i12 = 0; i12 < this.f90179j.length; i12++) {
                    this.f90180k[i12] = this.f90178i[i12] - this.f90173d;
                }
                this.f90174e.addRoundRect(this.f90181l, this.f90180k, Path.Direction.CW);
            } else {
                this.f90174e.addRoundRect(this.f90181l, this.f90178i, Path.Direction.CW);
            }
            float f14 = -f13;
            this.f90181l.inset(f14, f14);
            this.f90174e.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    protected void m() {
        Matrix matrix;
        Matrix matrix2;
        g0 g0Var = this.C;
        if (g0Var != null) {
            g0Var.m(this.f90188s);
            this.C.k(this.f90181l);
        } else {
            this.f90188s.reset();
            this.f90181l.set(getBounds());
        }
        this.f90183n.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getIntrinsicWidth(), getIntrinsicHeight());
        this.f90184o.set(this.f90170a.getBounds());
        Matrix matrix3 = this.f90186q;
        RectF rectF = this.f90183n;
        RectF rectF2 = this.f90184o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f90195z) {
            RectF rectF3 = this.f90185p;
            if (rectF3 == null) {
                this.f90185p = new RectF(this.f90181l);
            } else {
                rectF3.set(this.f90181l);
            }
            RectF rectF4 = this.f90185p;
            float f11 = this.f90173d;
            rectF4.inset(f11, f11);
            if (this.f90191v == null) {
                this.f90191v = new Matrix();
            }
            this.f90191v.setRectToRect(this.f90181l, this.f90185p, scaleToFit);
        } else {
            Matrix matrix4 = this.f90191v;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f90188s.equals(this.f90189t) || !this.f90186q.equals(this.f90187r) || ((matrix2 = this.f90191v) != null && !e(matrix2, this.f90192w))) {
            this.f90175f = true;
            this.f90188s.invert(this.f90190u);
            this.f90193x.set(this.f90188s);
            if (this.f90195z && (matrix = this.f90191v) != null) {
                this.f90193x.postConcat(matrix);
            }
            this.f90193x.preConcat(this.f90186q);
            this.f90189t.set(this.f90188s);
            this.f90187r.set(this.f90186q);
            if (this.f90195z) {
                Matrix matrix5 = this.f90192w;
                if (matrix5 == null) {
                    this.f90192w = a(this.f90191v);
                } else {
                    matrix5.set(this.f90191v);
                }
            } else {
                Matrix matrix6 = this.f90192w;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f90181l.equals(this.f90182m)) {
            return;
        }
        this.B = true;
        this.f90182m.set(this.f90181l);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f90170a.setBounds(rect);
    }

    @Override // ll.j
    public void q(boolean z11) {
        if (this.f90195z != z11) {
            this.f90195z = z11;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f90170a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i11, PorterDuff.Mode mode) {
        this.f90170a.setColorFilter(i11, mode);
    }

    @Override // ll.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f90178i, BitmapDescriptorFactory.HUE_RED);
            this.f90172c = false;
        } else {
            pk.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f90178i, 0, 8);
            this.f90172c = false;
            for (int i11 = 0; i11 < 8; i11++) {
                this.f90172c |= fArr[i11] > BitmapDescriptorFactory.HUE_RED;
            }
        }
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f90170a.setColorFilter(colorFilter);
    }

    public void h(boolean z11) {
    }
}
