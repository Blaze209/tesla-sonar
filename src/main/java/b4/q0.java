package b4;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001eJ%\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u000bR$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e018\u0004X\u0084\u0004¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020;8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010JR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0016\u0010[\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010GR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010f\u001a\u00020d8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\be\u0010/R\u001a\u0010i\u001a\u00020g8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010/R\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Lb4/q0;", "Lz3/h0;", "Lb4/p0;", "Lb4/z0;", "coordinator", "<init>", "(Lb4/z0;)V", "Lw4/n;", "position", "Ljn0/h0;", "i2", "(J)V", "Lz3/a;", "alignmentLine", "", "b2", "(Lz3/a;)I", "V1", "()V", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Y0", "(JFLwn0/l;)V", "j2", "h2", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "ancestor", "", "excludingAgnosticOffset", "k2", "(Lb4/q0;Z)J", "p", "Lb4/z0;", "e2", "()Lb4/z0;", "q", "J", "F1", "()J", "l2", "", "r", "Ljava/util/Map;", "oldAlignmentLines", "Lz3/f0;", "s", "Lz3/f0;", "f2", "()Lz3/f0;", "lookaheadLayoutCoordinates", "Lz3/j0;", "result", "t", "Lz3/j0;", "m2", "(Lz3/j0;)V", "_measureResult", "u", "c2", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "q1", "()Lb4/p0;", "child", "u1", "()Z", "hasMeasureResult", "x1", "()Lz3/j0;", "measureResult", "d1", "isLookingAhead", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "getDensity", "()F", "density", "M1", "fontScale", "y1", "parent", "Lb4/g0;", "v1", "()Lb4/g0;", "layoutNode", "Lz3/v;", "t1", "()Lz3/v;", "coordinates", "Lw4/r;", "g2", "size", "Lw4/b;", "d2", CryptoServicesPermission.CONSTRAINTS, "Lb4/b;", "a2", "()Lb4/b;", "alignmentLinesOwner", "", "c", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q0 extends p0 implements z3.h0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final z0 coordinator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Map<z3.a, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private z3.j0 _measureResult;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long position = w4.n.INSTANCE.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final z3.f0 lookaheadLayoutCoordinates = new z3.f0(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Map<z3.a, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public q0(z0 z0Var) {
        this.coordinator = z0Var;
    }

    private final void i2(long position) {
        if (!w4.n.g(getPosition(), position)) {
            l2(position);
            l0.a aVarH = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (aVarH != null) {
                aVarH.J1();
            }
            J1(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        n1(x1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(z3.j0 j0Var) {
        jn0.h0 h0Var;
        Map<z3.a, Integer> map;
        if (j0Var != null) {
            a1(w4.s.a(j0Var.getF126684a(), j0Var.getF126685b()));
            h0Var = jn0.h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            a1(w4.r.INSTANCE.a());
        }
        if (!p013kotlin.jvm.internal.s.f(this._measureResult, j0Var) && j0Var != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !j0Var.q().isEmpty()) && !p013kotlin.jvm.internal.s.f(j0Var.q(), this.oldAlignmentLines))) {
            a2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(j0Var.q());
        }
        this._measureResult = j0Var;
    }

    @Override // b4.p0
    /* JADX INFO: renamed from: F1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    public abstract int V(int width);

    @Override // b4.p0
    public void V1() {
        Y0(getPosition(), BitmapDescriptorFactory.HUE_RED, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0
    public final void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
        i2(position);
        if (getIsShallowPlacing()) {
            return;
        }
        h2();
    }

    public b a2() {
        b bVarC = this.coordinator.getLayoutNode().getLayoutDelegate().C();
        p013kotlin.jvm.internal.s.h(bVarC);
        return bVarC;
    }

    public final int b2(z3.a alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // z3.l0, z3.q
    /* JADX INFO: renamed from: c */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    protected final Map<z3.a, Integer> c2() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // b4.p0, z3.r
    public boolean d1() {
        return true;
    }

    public final long d2() {
        return getMeasurementConstraints();
    }

    /* JADX INFO: renamed from: e2, reason: from getter */
    public final z0 getCoordinator() {
        return this.coordinator;
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final z3.f0 getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final long g2() {
        return w4.s.a(getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
    }

    @Override // w4.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // z3.r
    public w4.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    protected void h2() {
        x1().k();
    }

    public final void j2(long position) {
        i2(w4.n.l(position, getApparentToRealOffset()));
    }

    public final long k2(q0 ancestor, boolean excludingAgnosticOffset) {
        long jA = w4.n.INSTANCE.a();
        q0 lookaheadDelegate = this;
        while (!p013kotlin.jvm.internal.s.f(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jA = w4.n.l(jA, lookaheadDelegate.getPosition());
            }
            z0 wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            p013kotlin.jvm.internal.s.h(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
        }
        return jA;
    }

    public void l2(long j11) {
        this.position = j11;
    }

    public abstract int m0(int width);

    @Override // b4.p0
    public p0 q1() {
        z0 wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    public abstract int s0(int height);

    public abstract int t0(int height);

    @Override // b4.p0
    public z3.v t1() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // b4.p0
    public boolean u1() {
        return this._measureResult != null;
    }

    @Override // b4.p0
    /* JADX INFO: renamed from: v1 */
    public g0 getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // b4.p0
    public z3.j0 x1() {
        z3.j0 j0Var = this._measureResult;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // b4.p0
    public p0 y1() {
        z0 wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }
}
