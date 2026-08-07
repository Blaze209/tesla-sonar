package b4;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.ref.WeakReference;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH ¢\u0006\u0004\b\u001e\u0010\u0005J\u0013\u0010 \u001a\u00020\n*\u00020\u001fH\u0004¢\u0006\u0004\b \u0010!J]\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a0$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u0017\u0010H\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR:\u0010R\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010]\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u00108R\u0014\u0010`\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010m\u001a\u0002048VX\u0096\u0004¢\u0006\f\u0012\u0004\bl\u0010\u0005\u001a\u0004\bk\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Lb4/p0;", "Lz3/w0;", "", "Lb4/t0;", "<init>", "()V", "Lz3/b1;", "ruler", "o1", "(Lz3/b1;)Lb4/p0;", "Ljn0/h0;", "L1", "(Lz3/b1;)V", "Lb4/o1;", "placeableResult", "k1", "(Lb4/o1;)V", "Landroidx/collection/l0;", "Ljava/lang/ref/WeakReference;", "Lb4/g0;", "Landroidx/compose/ui/node/WeakReference;", "layoutNodes", "U1", "(Landroidx/collection/l0;)V", "Lz3/a;", "alignmentLine", "", "g0", "(Lz3/a;)I", "j1", "V1", "Lb4/z0;", "J1", "(Lb4/z0;)V", Snapshot.WIDTH, Snapshot.HEIGHT, "", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "rulers", "Lz3/w0$a;", "placementBlock", "Lz3/j0;", "Y", "(IILjava/util/Map;Lwn0/l;Lwn0/l;)Lz3/j0;", "result", "n1", "(Lz3/j0;)V", "f", "Lz3/c1;", "_rulerScope", "", "g", "Z", "P1", "()Z", "y0", "(Z)V", "isPlacedUnderMotionFrameOfReference", "h", "T1", "X1", "isShallowPlacing", IntegerTokenConverter.CONVERTER_KEY, "R1", "W1", "isPlacingForAlignment", "j", "Lz3/w0$a;", "B1", "()Lz3/w0$a;", "placementScope", "Landroidx/collection/g0;", "k", "Landroidx/collection/g0;", "rulerValues", "l", "rulerValuesCache", "Landroidx/collection/k0;", "m", "Landroidx/collection/k0;", "rulerReaders", "Lw4/n;", "F1", "()J", "position", "q1", "()Lb4/p0;", "child", "y1", "parent", "u1", "hasMeasureResult", "v1", "()Lb4/g0;", "layoutNode", "Lz3/v;", "t1", "()Lz3/v;", "coordinates", "G1", "()Lz3/c1;", "rulerScope", "x1", "()Lz3/j0;", "measureResult", "d1", "isLookingAhead$annotations", "isLookingAhead", "n", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class p0 extends z3.w0 implements z3.k0, t0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final wn0.l<PlaceableResult, jn0.h0> f16237o = a.f16246c;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z3.c1 _rulerScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final z3.w0.a placementScope = z3.x0.a(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private androidx.collection.g0<z3.b1> rulerValues;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private androidx.collection.g0<z3.b1> rulerValuesCache;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private androidx.collection.k0<z3.b1, androidx.collection.l0<WeakReference<g0>>> rulerReaders;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/o1;", "result", "Ljn0/h0;", "a", "(Lb4/o1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<PlaceableResult, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f16246c = new a();

        a() {
            super(1);
        }

        public final void a(PlaceableResult o1Var) {
            if (o1Var.u0()) {
                o1Var.getPlaceable().k1(o1Var);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(PlaceableResult o1Var) {
            a(o1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PlaceableResult f16247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f16248d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PlaceableResult o1Var, p0 p0Var) {
            super(0);
            this.f16247c = o1Var;
            this.f16248d = p0Var;
        }

        public final void b() {
            wn0.l<z3.c1, jn0.h0> lVarG = this.f16247c.getResult().g();
            if (lVarG != null) {
                lVarG.invoke(this.f16248d.G1());
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"b4/p0$d", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "getWidth", "()I", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "q", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "g", "()Lwn0/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements z3.j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<z3.a, Integer> f16251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<z3.c1, jn0.h0> f16252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<z3.w0.a, jn0.h0> f16253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p0 f16254f;

        /* JADX WARN: Multi-variable type inference failed */
        d(int i11, int i12, Map<z3.a, Integer> map, wn0.l<? super z3.c1, jn0.h0> lVar, wn0.l<? super z3.w0.a, jn0.h0> lVar2, p0 p0Var) {
            this.f16249a = i11;
            this.f16250b = i12;
            this.f16251c = map;
            this.f16252d = lVar;
            this.f16253e = lVar2;
            this.f16254f = p0Var;
        }

        @Override // z3.j0
        public wn0.l<z3.c1, jn0.h0> g() {
            return this.f16252d;
        }

        @Override // z3.j0
        public int getHeight() {
            return this.f16250b;
        }

        @Override // z3.j0
        public int getWidth() {
            return this.f16249a;
        }

        @Override // z3.j0
        public void k() {
            this.f16253e.invoke(this.f16254f.getPlacementScope());
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.f16251c;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"b4/p0$e", "Lz3/c1;", "", "getDensity", "()F", "density", "M1", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements z3.c1 {
        e() {
        }

        @Override // w4.l
        /* JADX INFO: renamed from: M1 */
        public float getFontScale() {
            return p0.this.getFontScale();
        }

        @Override // w4.d
        public float getDensity() {
            return p0.this.getDensity();
        }
    }

    private final void L1(z3.b1 ruler) {
        androidx.collection.k0<z3.b1, androidx.collection.l0<WeakReference<g0>>> k0Var = o1(ruler).rulerReaders;
        androidx.collection.l0<WeakReference<g0>> l0VarP = k0Var != null ? k0Var.p(ruler) : null;
        if (l0VarP != null) {
            U1(l0VarP);
        }
    }

    private final void U1(androidx.collection.l0<WeakReference<g0>> layoutNodes) {
        g0 g0Var;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128 && (g0Var = (g0) ((WeakReference) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (d1()) {
                            g0Var.p1(false);
                        } else {
                            g0Var.t1(false);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0164 A[LOOP:4: B:67:0x012a->B:81:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0167 A[EDGE_INSN: B:97:0x0167->B:82:0x0167 BREAK  A[LOOP:4: B:67:0x012a->B:81:0x0164], SYNTHETIC] */
    public final void k1(PlaceableResult placeableResult) {
        long j11;
        long j12;
        p0 p0VarY1;
        long j13;
        androidx.collection.l0<WeakReference<g0>> l0VarP;
        l1 snapshotObserver;
        char c11;
        if (this.isPlacingForAlignment) {
            return;
        }
        wn0.l<z3.c1, jn0.h0> lVarG = placeableResult.getResult().g();
        androidx.collection.k0<z3.b1, androidx.collection.l0<WeakReference<g0>>> k0Var = this.rulerReaders;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        int i11 = 0;
        if (lVarG == null) {
            if (k0Var != null) {
                Object[] objArr = k0Var.values;
                long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j15 = jArr[i12];
                        if ((((~j15) << c12) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j15 & 255) < 128) {
                                    U1((androidx.collection.l0) objArr[(i12 << 3) + i14]);
                                }
                                j15 >>= 8;
                                i14++;
                                c12 = c12;
                            }
                            c11 = c12;
                            if (i13 != 8) {
                                break;
                            }
                        } else {
                            c11 = c12;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        c12 = c11;
                    }
                }
                k0Var.i();
                return;
            }
            return;
        }
        long j16 = 128;
        androidx.collection.g0<z3.b1> g0Var = this.rulerValuesCache;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i15 = 1;
        if (g0Var == null) {
            g0Var = new androidx.collection.g0<>(i11, i15, defaultConstructorMarker);
            this.rulerValuesCache = g0Var;
        }
        androidx.collection.g0<z3.b1> g0Var2 = this.rulerValues;
        if (g0Var2 == null) {
            g0Var2 = new androidx.collection.g0<>(i11, i15, defaultConstructorMarker);
            this.rulerValues = g0Var2;
        }
        g0Var.p(g0Var2);
        g0Var2.i();
        j1 owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.i(placeableResult, f16237o, new c(placeableResult, this));
        }
        if (k0Var != null) {
            Object[] objArr2 = g0Var.keys;
            float[] fArr = g0Var.values;
            long[] jArr2 = g0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i16 = 0;
                while (true) {
                    long j17 = jArr2[i16];
                    j11 = j14;
                    if ((((~j17) << 7) & j17 & j11) != j11) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = i11;
                        while (i18 < i17) {
                            if ((j17 & 255) < j16) {
                                int i19 = (i16 << 3) + i18;
                                z3.b1 b1Var = (z3.b1) objArr2[i19];
                                j13 = j16;
                                if (g0Var2.e(b1Var, Float.NaN) != fArr[i19] && (l0VarP = k0Var.p(b1Var)) != null) {
                                    U1(l0VarP);
                                }
                            } else {
                                j13 = j16;
                            }
                            j17 >>= 8;
                            i18++;
                            j16 = j13;
                        }
                        j12 = j16;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        j12 = j16;
                    }
                    if (i16 == length2) {
                        break;
                    }
                    i16++;
                    j14 = j11;
                    j16 = j12;
                    i11 = 0;
                }
            } else {
                j11 = -9187201950435737472L;
                j12 = 128;
            }
        } else {
            j11 = -9187201950435737472L;
            j12 = 128;
        }
        Object[] objArr3 = g0Var2.keys;
        long[] jArr3 = g0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j18 = jArr3[i21];
                if ((((~j18) << 7) & j18 & j11) == j11) {
                    if (i21 != length3) {
                        break;
                        break;
                    }
                    i21++;
                } else {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j18 & 255) < j12) {
                            z3.b1 b1Var2 = (z3.b1) objArr3[(i21 << 3) + i23];
                            if (!g0Var.a(b1Var2) && (p0VarY1 = y1()) != null) {
                                p0VarY1.L1(b1Var2);
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    } else if (i21 != length3) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
        }
        g0Var.i();
    }

    private final p0 o1(z3.b1 ruler) {
        p0 p0Var = this;
        while (true) {
            androidx.collection.g0<z3.b1> g0Var = p0Var.rulerValues;
            if (g0Var != null && g0Var.a(ruler)) {
                return p0Var;
            }
            p0 p0VarY1 = p0Var.y1();
            if (p0VarY1 == null) {
                return p0Var;
            }
            p0Var = p0VarY1;
        }
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final z3.w0.a getPlacementScope() {
        return this.placementScope;
    }

    /* JADX INFO: renamed from: F1 */
    public abstract long getPosition();

    public final z3.c1 G1() {
        z3.c1 c1Var = this._rulerScope;
        return c1Var == null ? new e() : c1Var;
    }

    protected final void J1(z0 z0Var) {
        b4.a aVarQ;
        z0 wrapped = z0Var.getWrapped();
        if (!p013kotlin.jvm.internal.s.f(wrapped != null ? wrapped.getLayoutNode() : null, z0Var.getLayoutNode())) {
            z0Var.y2().q().m();
            return;
        }
        b bVarA0 = z0Var.y2().a0();
        if (bVarA0 == null || (aVarQ = bVarA0.q()) == null) {
            return;
        }
        aVarQ.m();
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public abstract void V1();

    public final void W1(boolean z11) {
        this.isPlacingForAlignment = z11;
    }

    public final void X1(boolean z11) {
        this.isShallowPlacing = z11;
    }

    @Override // z3.k0
    public z3.j0 Y(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super z3.c1, jn0.h0> rulers, wn0.l<? super z3.w0.a, jn0.h0> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            y3.a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(width, height, alignmentLines, rulers, placementBlock, this);
    }

    @Override // z3.r
    public boolean d1() {
        return false;
    }

    @Override // z3.l0
    public final int g0(z3.a alignmentLine) {
        int iJ1;
        if (u1() && (iJ1 = j1(alignmentLine)) != Integer.MIN_VALUE) {
            return iJ1 + w4.n.i(getApparentToRealOffset());
        }
        return Integer.MIN_VALUE;
    }

    public abstract int j1(z3.a alignmentLine);

    /* JADX WARN: Code duplicated, block: B:19:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[LOOP:0: B:10:0x001a->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054 A[EDGE_INSN: B:29:0x0054->B:21:0x0054 BREAK  A[LOOP:0: B:10:0x001a->B:20:0x0051], SYNTHETIC] */
    public final void n1(z3.j0 result) {
        if (result != null) {
            k1(new PlaceableResult(result, this));
            return;
        }
        androidx.collection.k0<z3.b1, androidx.collection.l0<WeakReference<g0>>> k0Var = this.rulerReaders;
        if (k0Var != null) {
            Object[] objArr = k0Var.values;
            long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                U1((androidx.collection.l0) objArr[(i11 << 3) + i13]);
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        androidx.collection.k0<z3.b1, androidx.collection.l0<WeakReference<g0>>> k0Var2 = this.rulerReaders;
        if (k0Var2 != null) {
            k0Var2.i();
        }
        androidx.collection.g0<z3.b1> g0Var = this.rulerValues;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    public abstract p0 q1();

    public abstract z3.v t1();

    public abstract boolean u1();

    /* JADX INFO: renamed from: v1 */
    public abstract g0 getLayoutNode();

    public abstract z3.j0 x1();

    @Override // b4.t0
    public void y0(boolean z11) {
        this.isPlacedUnderMotionFrameOfReference = z11;
    }

    public abstract p0 y1();
}
