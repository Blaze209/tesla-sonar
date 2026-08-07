package k3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0014\u0010)\u001a\u00020(*\u00020 ø\u0001\u0000¢\u0006\u0004\b)\u0010*J*\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J*\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109JO\u0010>\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010AJ*\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FJB\u0010M\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020I2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\u0003J\u000f\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\u0003R,\u0010Y\u001a\u00060Qj\u0002`R8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010S\u0012\u0004\bX\u0010\u0003\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"Lk3/e0;", "Lk3/j1;", "<init>", "()V", "Ljn0/h0;", "u", "o", "Lj3/i;", "bounds", "Lk3/r3;", "paint", "e", "(Lj3/i;Lk3/r3;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "k", "degrees", "q", "(F)V", "Lk3/n3;", "matrix", "v", "([F)V", "left", "top", "right", "bottom", "Lk3/o1;", "clipOp", "a", "(FFFFI)V", "Lk3/t3;", "path", DateTokenConverter.CONVERTER_KEY, "(Lk3/t3;I)V", "Landroid/graphics/Region$Op;", "A", "(I)Landroid/graphics/Region$Op;", "Lj3/g;", "p1", "p2", "n", "(JJLk3/r3;)V", IntegerTokenConverter.CONVERTER_KEY, "(FFFFLk3/r3;)V", "radiusX", "radiusY", "m", "(FFFFFFLk3/r3;)V", "center", "radius", "h", "(JFLk3/r3;)V", "startAngle", "sweepAngle", "", "useCenter", "s", "(FFFFFFZLk3/r3;)V", "f", "(Lk3/t3;Lk3/r3;)V", "Lk3/i3;", "image", "topLeftOffset", "x", "(Lk3/i3;JLk3/r3;)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "t", "(Lk3/i3;JJJJLk3/r3;)V", "p", "j", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;", "z", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Canvas internalCanvas = f0.f84778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect srcRect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect dstRect;

    public final Region.Op A(int i11) {
        return o1.d(i11, o1.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // k3.j1
    public void a(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, A(clipOp));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // k3.j1
    public void c(float dx2, float dy2) {
        this.internalCanvas.translate(dx2, dy2);
    }

    @Override // k3.j1
    public void d(t3 path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof r0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((r0) path).getInternalPath(), A(clipOp));
    }

    @Override // k3.j1
    public void e(j3.i bounds, r3 paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.w(), 31);
    }

    @Override // k3.j1
    public void f(t3 path, r3 paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof r0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((r0) path).getInternalPath(), paint.w());
    }

    @Override // k3.j1
    public void h(long center, float radius, r3 paint) {
        this.internalCanvas.drawCircle(j3.g.m(center), j3.g.n(center), radius, paint.w());
    }

    @Override // k3.j1
    public void i(float left, float top, float right, float bottom, r3 paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.w());
    }

    @Override // k3.j1
    public void j() {
        m1.f84825a.a(this.internalCanvas, false);
    }

    @Override // k3.j1
    public void k(float sx2, float sy2) {
        this.internalCanvas.scale(sx2, sy2);
    }

    @Override // k3.j1
    public void m(float left, float top, float right, float bottom, float radiusX, float radiusY, r3 paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.w());
    }

    @Override // k3.j1
    public void n(long p11, long p12, r3 paint) {
        this.internalCanvas.drawLine(j3.g.m(p11), j3.g.n(p11), j3.g.m(p12), j3.g.n(p12), paint.w());
    }

    @Override // k3.j1
    public void o() {
        this.internalCanvas.restore();
    }

    @Override // k3.j1
    public void p() {
        m1.f84825a.a(this.internalCanvas, true);
    }

    @Override // k3.j1
    public void q(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // k3.j1
    public void s(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, r3 paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.w());
    }

    @Override // k3.j1
    public void t(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, r3 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = n0.b(image);
        Rect rect = this.srcRect;
        p013kotlin.jvm.internal.s.h(rect);
        rect.left = w4.n.h(srcOffset);
        rect.top = w4.n.i(srcOffset);
        rect.right = w4.n.h(srcOffset) + w4.r.g(srcSize);
        rect.bottom = w4.n.i(srcOffset) + w4.r.f(srcSize);
        jn0.h0 h0Var = jn0.h0.f84049a;
        Rect rect2 = this.dstRect;
        p013kotlin.jvm.internal.s.h(rect2);
        rect2.left = w4.n.h(dstOffset);
        rect2.top = w4.n.i(dstOffset);
        rect2.right = w4.n.h(dstOffset) + w4.r.g(dstSize);
        rect2.bottom = w4.n.i(dstOffset) + w4.r.f(dstSize);
        canvas.drawBitmap(bitmapB, rect, rect2, paint.w());
    }

    @Override // k3.j1
    public void u() {
        this.internalCanvas.save();
    }

    @Override // k3.j1
    public void v(float[] matrix) {
        if (o3.c(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        o0.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // k3.j1
    public void x(i3 image, long topLeftOffset, r3 paint) {
        this.internalCanvas.drawBitmap(n0.b(image), j3.g.m(topLeftOffset), j3.g.n(topLeftOffset), paint.w());
    }

    public final void z(Canvas canvas) {
        this.internalCanvas = canvas;
    }
}
