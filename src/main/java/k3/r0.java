package k3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ/\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u001aJ?\u0010$\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J?\u0010(\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010%J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\nJ\u001f\u0010/\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J\u001f\u00102\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103J\"\u00107\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00012\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010:J\u001a\u0010=\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J*\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010SR*\u0010[\u001a\u00020U2\u0006\u0010V\u001a\u00020U8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010_\u001a\u00020E8VX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010:\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Lk3/r0;", "Lk3/t3;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lj3/i;", "rect", "Ljn0/h0;", "w", "(Lj3/i;)V", "", "x", "y", "moveTo", "(FF)V", "dx", "dy", "a", "lineTo", "t", "x1", "y1", "x2", "y2", "o", "(FFFF)V", "q", "dx1", "dy1", "dx2", "dy2", "c", "g", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "b", "Lk3/t3$b;", "direction", "h", "(Lj3/i;Lk3/t3$b;)V", "oval", "r", "u", "Lj3/k;", "roundRect", IntegerTokenConverter.CONVERTER_KEY, "(Lj3/k;Lk3/t3$b;)V", "path", "Lj3/g;", "offset", "e", "(Lk3/t3;J)V", "close", "()V", "reset", "m", "f", "(J)V", "getBounds", "()Lj3/i;", "path1", "path2", "Lk3/x3;", "operation", "", "s", "(Lk3/t3;Lk3/t3;I)Z", "Landroid/graphics/Path;", "v", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", DateTokenConverter.CONVERTER_KEY, "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "Lk3/v3;", "value", "k", "()I", "p", "(I)V", "fillType", "n", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0 implements t3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Path internalPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private RectF rectF;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] radii;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Matrix mMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public r0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void w(j3.i rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            w0.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // k3.t3
    public void a(float dx2, float dy2) {
        this.internalPath.rMoveTo(dx2, dy2);
    }

    @Override // k3.t3
    public void b(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // k3.t3
    public void c(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // k3.t3
    public void close() {
        this.internalPath.close();
    }

    @Override // k3.t3
    public void cubicTo(float x11, float y11, float x12, float y12, float x13, float y13) {
        this.internalPath.cubicTo(x11, y11, x12, y12, x13, y13);
    }

    @Override // k3.t3
    public void e(t3 path, long offset) {
        Path path2 = this.internalPath;
        if (!(path instanceof r0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((r0) path).getInternalPath(), j3.g.m(offset), j3.g.n(offset));
    }

    @Override // k3.t3
    public void f(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            p013kotlin.jvm.internal.s.h(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        p013kotlin.jvm.internal.s.h(matrix2);
        matrix2.setTranslate(j3.g.m(offset), j3.g.n(offset));
        Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        p013kotlin.jvm.internal.s.h(matrix3);
        path.transform(matrix3);
    }

    @Override // k3.t3
    public void g(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // k3.t3
    public j3.i getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new j3.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // k3.t3
    public void h(j3.i rect, t3.b direction) {
        w(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF2);
        path.addRect(rectF2, w0.e(direction));
    }

    @Override // k3.t3
    public void i(j3.k roundRect, t3.b direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        p013kotlin.jvm.internal.s.h(fArr);
        fArr[0] = j3.a.d(roundRect.getTopLeftCornerRadius());
        fArr[1] = j3.a.e(roundRect.getTopLeftCornerRadius());
        fArr[2] = j3.a.d(roundRect.getTopRightCornerRadius());
        fArr[3] = j3.a.e(roundRect.getTopRightCornerRadius());
        fArr[4] = j3.a.d(roundRect.getBottomRightCornerRadius());
        fArr[5] = j3.a.e(roundRect.getBottomRightCornerRadius());
        fArr[6] = j3.a.d(roundRect.getBottomLeftCornerRadius());
        fArr[7] = j3.a.e(roundRect.getBottomLeftCornerRadius());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF2);
        float[] fArr2 = this.radii;
        p013kotlin.jvm.internal.s.h(fArr2);
        path.addRoundRect(rectF2, fArr2, w0.e(direction));
    }

    @Override // k3.t3
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // k3.t3
    public int k() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? v3.INSTANCE.a() : v3.INSTANCE.b();
    }

    @Override // k3.t3
    public void lineTo(float x11, float y11) {
        this.internalPath.lineTo(x11, y11);
    }

    @Override // k3.t3
    public void m() {
        this.internalPath.rewind();
    }

    @Override // k3.t3
    public void moveTo(float x11, float y11) {
        this.internalPath.moveTo(x11, y11);
    }

    @Override // k3.t3
    public boolean n() {
        return this.internalPath.isConvex();
    }

    @Override // k3.t3
    public void o(float x11, float y11, float x12, float y12) {
        this.internalPath.quadTo(x11, y11, x12, y12);
    }

    @Override // k3.t3
    public void p(int i11) {
        this.internalPath.setFillType(v3.d(i11, v3.INSTANCE.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // k3.t3
    public void q(float x11, float y11, float x12, float y12) {
        this.internalPath.quadTo(x11, y11, x12, y12);
    }

    @Override // k3.t3
    public /* synthetic */ void r(j3.i oval) {
        u(oval, t3.b.CounterClockwise);
    }

    @Override // k3.t3
    public void reset() {
        this.internalPath.reset();
    }

    @Override // k3.t3
    public boolean s(t3 path1, t3 path2, int operation) {
        Path.Op op2;
        x3.Companion companion = x3.INSTANCE;
        if (x3.f(operation, companion.a())) {
            op2 = Path.Op.DIFFERENCE;
        } else if (x3.f(operation, companion.b())) {
            op2 = Path.Op.INTERSECT;
        } else if (x3.f(operation, companion.c())) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = x3.f(operation, companion.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.internalPath;
        if (!(path1 instanceof r0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((r0) path1).getInternalPath();
        if (path2 instanceof r0) {
            return path.op(internalPath, ((r0) path2).getInternalPath(), op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // k3.t3
    public void t(float dx2, float dy2) {
        this.internalPath.rLineTo(dx2, dy2);
    }

    public void u(j3.i oval, t3.b direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        p013kotlin.jvm.internal.s.h(rectF2);
        path.addOval(rectF2, w0.e(direction));
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }

    public r0(Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ r0(Path path, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Path() : path);
    }
}
