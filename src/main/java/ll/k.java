package ll;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class k extends n {
    private static boolean J = false;
    private final Paint D;
    private final Paint E;
    private final Bitmap F;
    private WeakReference<Bitmap> G;
    private boolean H;
    private RectF I;

    public k(Resources resources, Bitmap bitmap, Paint paint, boolean z11) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.I = null;
        this.F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.H = z11;
    }

    public static boolean n() {
        return J;
    }

    private void o() {
        Shader shader;
        WeakReference<Bitmap> weakReference = this.G;
        if (weakReference == null || weakReference.get() != this.F) {
            this.G = new WeakReference<>(this.F);
            if (this.F != null) {
                Paint paint = this.D;
                Bitmap bitmap = this.F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f90175f = true;
            }
        }
        if (this.f90175f && (shader = this.D.getShader()) != null) {
            shader.setLocalMatrix(this.f90193x);
            this.f90175f = false;
        }
        this.D.setFilterBitmap(c());
    }

    @Override // ll.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (bn.b.d()) {
            bn.b.a("RoundedBitmapDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (bn.b.d()) {
                bn.b.b();
                return;
            }
            return;
        }
        m();
        l();
        o();
        int iSave = canvas.save();
        canvas.concat(this.f90190u);
        if (this.H || this.I == null) {
            canvas.drawPath(this.f90174e, this.D);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.I);
            canvas.drawPath(this.f90174e, this.D);
            canvas.restoreToCount(iSave2);
        }
        float f11 = this.f90173d;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            this.E.setStrokeWidth(f11);
            this.E.setColor(e.c(this.f90176g, this.D.getAlpha()));
            canvas.drawPath(this.f90177h, this.E);
        }
        canvas.restoreToCount(iSave);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    @Override // ll.n, ll.j
    public void h(boolean z11) {
        this.H = z11;
    }

    @Override // ll.n
    boolean k() {
        return super.k() && this.F != null;
    }

    @Override // ll.n
    protected void m() {
        super.m();
        if (this.H) {
            return;
        }
        if (this.I == null) {
            this.I = new RectF();
        }
        this.f90193x.mapRect(this.I, this.f90183n);
    }

    @Override // ll.n, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        if (i11 != this.D.getAlpha()) {
            this.D.setAlpha(i11);
            super.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // ll.n, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.D.setColorFilter(colorFilter);
    }
}
