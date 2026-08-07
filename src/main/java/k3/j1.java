package k3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u000bJ7\u00100\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b4\u00105J*\u00108\u001a\u00020\u00022\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b8\u00109JO\u0010>\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010=\u001a\u00020<2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b@\u0010AJ*\u0010E\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bE\u0010FJJ\u0010M\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020G2\b\b\u0002\u0010L\u001a\u00020I2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0002H&¢\u0006\u0004\bO\u0010\u0004J\u000f\u0010P\u001a\u00020\u0002H&¢\u0006\u0004\bP\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0003"}, d2 = {"Lk3/j1;", "", "Ljn0/h0;", "u", "()V", "o", "Lj3/i;", "bounds", "Lk3/r3;", "paint", "e", "(Lj3/i;Lk3/r3;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "k", "degrees", "q", "(F)V", "Lk3/n3;", "matrix", "v", "([F)V", "rect", "Lk3/o1;", "clipOp", "r", "(Lj3/i;I)V", "left", "top", "right", "bottom", "a", "(FFFFI)V", "Lk3/t3;", "path", DateTokenConverter.CONVERTER_KEY, "(Lk3/t3;I)V", "Lj3/g;", "p1", "p2", "n", "(JJLk3/r3;)V", "y", IntegerTokenConverter.CONVERTER_KEY, "(FFFFLk3/r3;)V", "radiusX", "radiusY", "m", "(FFFFFFLk3/r3;)V", "center", "radius", "h", "(JFLk3/r3;)V", "startAngle", "sweepAngle", "", "useCenter", "s", "(FFFFFFZLk3/r3;)V", "f", "(Lk3/t3;Lk3/r3;)V", "Lk3/i3;", "image", "topLeftOffset", "x", "(Lk3/i3;JLk3/r3;)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "t", "(Lk3/i3;JJJJLk3/r3;)V", "p", "j", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface j1 {
    static /* synthetic */ void g(j1 j1Var, t3 t3Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i12 & 2) != 0) {
            i11 = o1.INSTANCE.b();
        }
        j1Var.d(t3Var, i11);
    }

    static /* synthetic */ void l(j1 j1Var, float f11, float f12, float f13, float f14, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i12 & 16) != 0) {
            i11 = o1.INSTANCE.b();
        }
        j1Var.a(f11, f12, f13, f14, i11);
    }

    static /* synthetic */ void w(j1 j1Var, j3.i iVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i12 & 2) != 0) {
            i11 = o1.INSTANCE.b();
        }
        j1Var.r(iVar, i11);
    }

    void a(float left, float top, float right, float bottom, int clipOp);

    void c(float dx2, float dy2);

    void d(t3 path, int clipOp);

    void e(j3.i bounds, r3 paint);

    void f(t3 path, r3 paint);

    void h(long center, float radius, r3 paint);

    void i(float left, float top, float right, float bottom, r3 paint);

    void j();

    void k(float sx2, float sy2);

    void m(float left, float top, float right, float bottom, float radiusX, float radiusY, r3 paint);

    void n(long p11, long p12, r3 paint);

    void o();

    void p();

    void q(float degrees);

    default void r(j3.i rect, int clipOp) {
        a(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), clipOp);
    }

    void s(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, r3 paint);

    void t(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, r3 paint);

    void u();

    void v(float[] matrix);

    void x(i3 image, long topLeftOffset, r3 paint);

    default void y(j3.i rect, r3 paint) {
        i(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }
}
