package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0017*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u0017*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u0017*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%*\u00020$H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001f*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u001f*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020$*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u001a*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u001a*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010,J]\u00100\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010O\u001a\u00020L8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Lz3/g;", "Lz3/f;", "Lz3/k0;", "", "Lb4/c0;", "coordinator", "Lz3/e;", "approachNode", "<init>", "(Lb4/c0;Lz3/e;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "", "Lz3/a;", "alignmentLines", "Lkotlin/Function1;", "Lz3/w0$a;", "Ljn0/h0;", "placementBlock", "Lz3/j0;", "b1", "(IILjava/util/Map;Lwn0/l;)Lz3/j0;", "Lw4/h;", "i1", "(F)I", "Lw4/v;", "Q1", "(J)I", "p", "(J)F", "", "x", "(F)F", "w", "(I)F", "Lj3/m;", "Lw4/k;", "o", "(J)J", "O1", "m1", "C", "E", "(F)J", "s", "Lz3/c1;", "rulers", "Y", "(IILjava/util/Map;Lwn0/l;Lwn0/l;)Lz3/j0;", "a", "Lb4/c0;", "q", "()Lb4/c0;", "b", "Lz3/e;", "n", "()Lz3/e;", "D", "(Lz3/e;)V", "", "c", "Z", "()Z", "B", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "M1", "fontScale", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "Lw4/r;", "y", "()J", "lookaheadSize", "d1", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements f, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b4.c0 coordinator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e approachNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean approachMeasureRequired;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"z3/g$a", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "a", "I", "getWidth", "()I", Snapshot.WIDTH, "b", "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "c", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "g", "()Lwn0/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<z3.a, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<c1, jn0.h0> rulers;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<w0.a, jn0.h0> f126724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f126725f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i11, int i12, Map<z3.a, Integer> map, wn0.l<? super c1, jn0.h0> lVar, wn0.l<? super w0.a, jn0.h0> lVar2, g gVar) {
            this.f126724e = lVar2;
            this.f126725f = gVar;
            this.width = i11;
            this.height = i12;
            this.alignmentLines = map;
            this.rulers = lVar;
        }

        @Override // z3.j0
        public wn0.l<c1, jn0.h0> g() {
            return this.rulers;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() {
            return this.height;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() {
            return this.width;
        }

        @Override // z3.j0
        public void k() {
            this.f126724e.invoke(this.f126725f.getCoordinator().getPlacementScope());
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.alignmentLines;
        }
    }

    public g(b4.c0 c0Var, e eVar) {
        this.coordinator = c0Var;
        this.approachNode = eVar;
    }

    public final void B(boolean z11) {
        this.approachMeasureRequired = z11;
    }

    @Override // w4.d
    public long C(long j11) {
        return this.coordinator.C(j11);
    }

    public final void D(e eVar) {
        this.approachNode = eVar;
    }

    @Override // w4.l
    public long E(float f11) {
        return this.coordinator.E(f11);
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // w4.d
    public float O1(float f11) {
        return this.coordinator.O1(f11);
    }

    @Override // w4.d
    public int Q1(long j11) {
        return this.coordinator.Q1(j11);
    }

    @Override // z3.k0
    public j0 Y(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super c1, jn0.h0> rulers, wn0.l<? super w0.a, jn0.h0> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            y3.a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, placementBlock, this);
    }

    @Override // z3.k0
    public j0 b1(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super w0.a, jn0.h0> placementBlock) {
        return this.coordinator.b1(width, height, alignmentLines, placementBlock);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    @Override // z3.r
    public boolean d1() {
        return false;
    }

    @Override // w4.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // z3.r
    public w4.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // w4.d
    public int i1(float f11) {
        return this.coordinator.i1(f11);
    }

    @Override // w4.d
    public float m1(long j11) {
        return this.coordinator.m1(j11);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final e getApproachNode() {
        return this.approachNode;
    }

    @Override // w4.d
    public long o(long j11) {
        return this.coordinator.o(j11);
    }

    @Override // w4.l
    public float p(long j11) {
        return this.coordinator.p(j11);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final b4.c0 getCoordinator() {
        return this.coordinator;
    }

    @Override // w4.d
    public long s(float f11) {
        return this.coordinator.s(f11);
    }

    @Override // w4.d
    public float w(int i11) {
        return this.coordinator.w(i11);
    }

    @Override // w4.d
    public float x(float f11) {
        return this.coordinator.x(f11);
    }

    public long y() {
        b4.q0 lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        p013kotlin.jvm.internal.s.h(lookaheadDelegate);
        j0 j0VarX1 = lookaheadDelegate.x1();
        return w4.s.a(j0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), j0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
    }
}
