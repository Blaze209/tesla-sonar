package k3;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \n2\u00020\u0001:\u0002\n J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020!H'¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b,\u0010-J$\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020/H&ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0005H&¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00104J\u001a\u00107\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H&ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020!H&¢\u0006\u0004\b9\u0010:J*\u0010@\u001a\u00020?2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H&ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\"\u0010G\u001a\u00020B8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010Iø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006LÀ\u0006\u0003"}, d2 = {"Lk3/t3;", "", "", "x", "y", "Ljn0/h0;", "moveTo", "(FF)V", "dx", "dy", "a", "lineTo", "t", "x1", "y1", "x2", "y2", "o", "(FFFF)V", "q", "dx1", "dy1", "dx2", "dy2", "c", "g", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "b", "Lj3/i;", "rect", "Lk3/t3$b;", "direction", "h", "(Lj3/i;Lk3/t3$b;)V", "oval", "r", "(Lj3/i;)V", "Lj3/k;", "roundRect", IntegerTokenConverter.CONVERTER_KEY, "(Lj3/k;Lk3/t3$b;)V", "path", "Lj3/g;", "offset", "e", "(Lk3/t3;J)V", "close", "()V", "reset", "m", "f", "(J)V", "getBounds", "()Lj3/i;", "path1", "path2", "Lk3/x3;", "operation", "", "s", "(Lk3/t3;Lk3/t3;I)Z", "Lk3/v3;", "k", "()I", "p", "(I)V", "fillType", "n", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f84880a;

    /* JADX INFO: renamed from: k3.t3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk3/t3$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f84880a = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lk3/t3$b;", "", "<init>", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void d(t3 t3Var, j3.k kVar, b bVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i11 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        t3Var.i(kVar, bVar);
    }

    static /* synthetic */ void j(t3 t3Var, t3 t3Var2, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i11 & 2) != 0) {
            j11 = j3.g.INSTANCE.c();
        }
        t3Var.e(t3Var2, j11);
    }

    static /* synthetic */ void l(t3 t3Var, j3.i iVar, b bVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i11 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        t3Var.h(iVar, bVar);
    }

    void a(float dx2, float dy2);

    void b(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    @jn0.e
    void c(float dx1, float dy1, float dx2, float dy2);

    void close();

    void cubicTo(float x11, float y11, float x12, float y12, float x13, float y13);

    void e(t3 path, long offset);

    void f(long offset);

    default void g(float dx1, float dy1, float dx2, float dy2) {
        c(dx1, dy1, dx2, dy2);
    }

    j3.i getBounds();

    void h(j3.i rect, b direction);

    void i(j3.k roundRect, b direction);

    boolean isEmpty();

    int k();

    void lineTo(float x11, float y11);

    default void m() {
        reset();
    }

    void moveTo(float x11, float y11);

    boolean n();

    @jn0.e
    void o(float x11, float y11, float x12, float y12);

    void p(int i11);

    default void q(float x11, float y11, float x12, float y12) {
        o(x11, y11, x12, y12);
    }

    @jn0.e
    /* synthetic */ void r(j3.i oval);

    void reset();

    boolean s(t3 path1, t3 path2, int operation);

    void t(float dx2, float dy2);
}
