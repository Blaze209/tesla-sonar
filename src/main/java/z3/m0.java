package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0010\u000f\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lz3/m0;", "", "<init>", "()V", "Lz3/b0;", "modifier", "Lz3/r;", "intrinsicMeasureScope", "Lz3/q;", "intrinsicMeasurable", "", "h", DateTokenConverter.CONVERTER_KEY, "(Lz3/b0;Lz3/r;Lz3/q;I)I", "w", "c", "b", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f126778a = new m0();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lz3/m0$a;", "Lz3/h0;", "Lz3/q;", "measurable", "Lz3/m0$c;", "minMax", "Lz3/m0$d;", "widthHeight", "<init>", "(Lz3/q;Lz3/m0$c;Lz3/m0$d;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "a", "Lz3/q;", "getMeasurable", "()Lz3/q;", "b", "Lz3/m0$c;", "getMinMax", "()Lz3/m0$c;", "c", "Lz3/m0$d;", "getWidthHeight", "()Lz3/m0$d;", "", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q measurable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c minMax;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d widthHeight;

        public a(q qVar, c cVar, d dVar) {
            this.measurable = qVar;
            this.minMax = cVar;
            this.widthHeight = dVar;
        }

        @Override // z3.q
        public int V(int width) {
            return this.measurable.V(width);
        }

        @Override // z3.q
        /* JADX INFO: renamed from: c */
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @Override // z3.q
        public int m0(int width) {
            return this.measurable.m0(width);
        }

        @Override // z3.q
        public int s0(int height) {
            return this.measurable.s0(height);
        }

        @Override // z3.q
        public int t0(int height) {
            return this.measurable.t0(height);
        }

        @Override // z3.h0
        public w0 x0(long constraints) {
            if (this.widthHeight == d.Width) {
                return new b(this.minMax == c.Max ? this.measurable.t0(w4.b.k(constraints)) : this.measurable.s0(w4.b.k(constraints)), w4.b.g(constraints) ? w4.b.k(constraints) : 32767);
            }
            return new b(w4.b.h(constraints) ? w4.b.l(constraints) : 32767, this.minMax == c.Max ? this.measurable.V(w4.b.l(constraints)) : this.measurable.m0(w4.b.l(constraints)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lz3/m0$c;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum c {
        Min,
        Max
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lz3/m0$d;", "", "<init>", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum d {
        Width,
        Height
    }

    private m0() {
    }

    public final int a(b0 modifier, r intrinsicMeasureScope, q intrinsicMeasurable, int w11) {
        return modifier.c(new u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Height), w4.c.b(0, w11, 0, 0, 13, null)).getF126653b();
    }

    public final int b(b0 modifier, r intrinsicMeasureScope, q intrinsicMeasurable, int h11) {
        return modifier.c(new u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Width), w4.c.b(0, 0, 0, h11, 7, null)).getF126652a();
    }

    public final int c(b0 modifier, r intrinsicMeasureScope, q intrinsicMeasurable, int w11) {
        return modifier.c(new u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Height), w4.c.b(0, w11, 0, 0, 13, null)).getF126653b();
    }

    public final int d(b0 modifier, r intrinsicMeasureScope, q intrinsicMeasurable, int h11) {
        return modifier.c(new u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Width), w4.c.b(0, 0, 0, h11, 7, null)).getF126652a();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ8\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lz3/m0$b;", "Lz3/w0;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "<init>", "(II)V", "Lz3/a;", "alignmentLine", "g0", "(Lz3/a;)I", "Lw4/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "layerBlock", "Y0", "(JFLwn0/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends w0 {
        public b(int i11, int i12) {
            a1(w4.s.a(i11, i12));
        }

        @Override // z3.l0
        public int g0(z3.a alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z3.w0
        public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
        }
    }
}
