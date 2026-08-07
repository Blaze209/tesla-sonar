package m3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.i3;
import k3.j1;
import k3.r3;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J*\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.JG\u00101\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J*\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106JO\u0010;\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u0010:\u001a\u0002092\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J*\u0010B\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJB\u0010J\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020F2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N"}, d2 = {"Lm3/i;", "Lk3/j1;", "<init>", "()V", "Ljn0/h0;", "u", "o", "Lj3/i;", "bounds", "Lk3/r3;", "paint", "e", "(Lj3/i;Lk3/r3;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "k", "degrees", "q", "(F)V", "Lk3/n3;", "matrix", "v", "([F)V", "left", "top", "right", "bottom", "Lk3/o1;", "clipOp", "a", "(FFFFI)V", "Lk3/t3;", "path", DateTokenConverter.CONVERTER_KEY, "(Lk3/t3;I)V", "Lj3/g;", "p1", "p2", "n", "(JJLk3/r3;)V", IntegerTokenConverter.CONVERTER_KEY, "(FFFFLk3/r3;)V", "radiusX", "radiusY", "m", "(FFFFFFLk3/r3;)V", "center", "radius", "h", "(JFLk3/r3;)V", "startAngle", "sweepAngle", "", "useCenter", "s", "(FFFFFFZLk3/r3;)V", "f", "(Lk3/t3;Lk3/r3;)V", "Lk3/i3;", "image", "topLeftOffset", "x", "(Lk3/i3;JLk3/r3;)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "t", "(Lk3/i3;JJJJLk3/r3;)V", "p", "j", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements j1 {
    @Override // k3.j1
    public void a(float left, float top, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void c(float dx2, float dy2) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void d(t3 path, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void e(j3.i bounds, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void f(t3 path, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void h(long center, float radius, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void i(float left, float top, float right, float bottom, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void j() {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void k(float sx2, float sy2) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void m(float left, float top, float right, float bottom, float radiusX, float radiusY, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void n(long p11, long p12, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void p() {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void q(float degrees) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void s(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void t(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, r3 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void u() {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void v(float[] matrix) {
        throw new UnsupportedOperationException();
    }

    @Override // k3.j1
    public void x(i3 image, long topLeftOffset, r3 paint) {
        throw new UnsupportedOperationException();
    }
}
