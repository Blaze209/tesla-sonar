package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.p1;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\rH&¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H&ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u000bJ,\u00108\u001a\u0002072\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;JR\u0010H\u001a\u0002072\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020>2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010G\u001a\u00020FH&ø\u0001\u0000¢\u0006\u0004\bH\u0010IJZ\u0010M\u001a\u0002072\u0006\u0010=\u001a\u00020<2\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020\r2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010G\u001a\u00020FH&ø\u0001\u0000¢\u0006\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0014\u0010U\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010PR\u0014\u0010W\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0014\u0010Y\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010PR\u0014\u0010[\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010PR\u0014\u0010^\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0082\u0001\u0001fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006gÀ\u0006\u0003"}, d2 = {"Li4/o;", "", "", "start", "end", "Lk3/t3;", "w", "(II)Lk3/t3;", "offset", "Lj3/i;", "q", "(I)Lj3/i;", "lineIndex", "", "n", "(I)F", "u", "a", "c", "b", "(I)I", "", "visibleEnd", "l", "(IZ)I", "t", "(I)Z", "A", "usePrimaryDirection", "x", "(IZ)F", "Lt4/i;", "g", "(I)Lt4/i;", "B", "vertical", "m", "(F)I", "Lj3/g;", "position", "k", "(J)I", "rect", "Li4/g0;", "granularity", "Li4/k0;", "inclusionStrategy", "Li4/p0;", "h", "(Lj3/i;ILi4/k0;)J", "C", "range", "", "array", "arrayStart", "Ljn0/h0;", "o", "(J[FI)V", IntegerTokenConverter.CONVERTER_KEY, "(I)J", "Lk3/j1;", "canvas", "Lk3/p1;", "color", "Lk3/e4;", "shadow", "Lt4/k;", "textDecoration", "Lm3/g;", "drawStyle", "Lk3/b1;", "blendMode", "s", "(Lk3/j1;JLk3/e4;Lt4/k;Lm3/g;I)V", "Lk3/h1;", "brush", "alpha", "p", "(Lk3/j1;Lk3/h1;FLk3/e4;Lt4/k;Lm3/g;I)V", "getWidth", "()F", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, DateTokenConverter.CONVERTER_KEY, "minIntrinsicWidth", "f", "maxIntrinsicWidth", "j", "firstBaseline", "z", "lastBaseline", "v", "()Z", "didExceedMaxLines", "e", "()I", "lineCount", "", "D", "()Ljava/util/List;", "placeholderRects", "Li4/a;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface o {
    static /* synthetic */ void r(o oVar, j1 j1Var, h1 h1Var, float f11, Shadow shadow, t4.k kVar, m3.g gVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i12 & 4) != 0) {
            f11 = Float.NaN;
        }
        oVar.p(j1Var, h1Var, f11, (i12 & 8) != 0 ? null : shadow, (i12 & 16) != 0 ? null : kVar, (i12 & 32) != 0 ? null : gVar, (i12 & 64) != 0 ? m3.f.INSTANCE.a() : i11);
    }

    static /* synthetic */ void y(o oVar, j1 j1Var, long j11, Shadow shadow, t4.k kVar, m3.g gVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        oVar.s(j1Var, (i12 & 2) != 0 ? p1.INSTANCE.j() : j11, (i12 & 4) != 0 ? null : shadow, (i12 & 8) != 0 ? null : kVar, (i12 & 16) == 0 ? gVar : null, (i12 & 32) != 0 ? m3.f.INSTANCE.a() : i11);
    }

    int A(int offset);

    t4.i B(int offset);

    j3.i C(int offset);

    List<j3.i> D();

    float a(int lineIndex);

    int b(int lineIndex);

    float c(int lineIndex);

    float d();

    int e();

    float f();

    t4.i g(int offset);

    float getHeight();

    float getWidth();

    long h(j3.i rect, int granularity, k0 inclusionStrategy);

    long i(int offset);

    float j();

    int k(long position);

    int l(int lineIndex, boolean visibleEnd);

    int m(float vertical);

    float n(int lineIndex);

    void o(long range, float[] array, int arrayStart);

    void p(j1 canvas, h1 brush, float alpha, Shadow shadow, t4.k textDecoration, m3.g drawStyle, int blendMode);

    j3.i q(int offset);

    void s(j1 canvas, long color, Shadow shadow, t4.k textDecoration, m3.g drawStyle, int blendMode);

    boolean t(int lineIndex);

    float u(int lineIndex);

    boolean v();

    t3 w(int start, int end);

    float x(int offset, boolean usePrimaryDirection);

    float z();
}
