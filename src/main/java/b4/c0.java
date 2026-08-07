package b4;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Map;
import k3.r3;
import k3.s3;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0002RSB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J8\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010E\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Lb4/c0;", "Lb4/z0;", "Lb4/g0;", "layoutNode", "Lb4/b0;", "measureNode", "<init>", "(Lb4/g0;Lb4/b0;)V", "Ljn0/h0;", "G3", "()V", "t2", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "Lw4/n;", "position", "", "zIndex", "Ln3/c;", "layer", "X0", "(JFLn3/c;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Y0", "(JFLwn0/l;)V", "Lz3/a;", "alignmentLine", "j1", "(Lz3/a;)I", "Lk3/j1;", "canvas", "graphicsLayer", "d3", "(Lk3/j1;Ln3/c;)V", "value", "T", "Lb4/b0;", "D3", "()Lb4/b0;", "H3", "(Lb4/b0;)V", "layoutModifierNode", Gender.UNKNOWN, "Lw4/b;", "E3", "()Lw4/b;", "I3", "(Lw4/b;)V", "lookaheadConstraints", "Lb4/q0;", "<set-?>", "Lb4/q0;", "D2", "()Lb4/q0;", "J3", "(Lb4/q0;)V", "lookaheadDelegate", "Lz3/g;", "W", "Lz3/g;", "approachMeasureScope", "Landroidx/compose/ui/d$c;", "H2", "()Landroidx/compose/ui/d$c;", "tail", "F3", "()Lb4/z0;", "wrappedNonNull", "X", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 extends z0 {
    private static final r3 Y;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private b0 layoutModifierNode;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private w4.b lookaheadConstraints;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private q0 lookaheadDelegate;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private z3.g approachMeasureScope;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lb4/c0$b;", "Lb4/q0;", "<init>", "(Lb4/c0;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "Lz3/a;", "alignmentLine", "", "j1", "(Lz3/a;)I", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends q0 {
        public b() {
            super(c0.this);
        }

        @Override // b4.q0, z3.q
        public int V(int width) {
            b0 layoutModifierNode = c0.this.getLayoutModifierNode();
            q0 lookaheadDelegate = c0.this.F3().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return layoutModifierNode.n(this, lookaheadDelegate, width);
        }

        @Override // b4.p0
        public int j1(z3.a alignmentLine) {
            int iB = d0.b(this, alignmentLine);
            c2().put(alignmentLine, Integer.valueOf(iB));
            return iB;
        }

        @Override // b4.q0, z3.q
        public int m0(int width) {
            b0 layoutModifierNode = c0.this.getLayoutModifierNode();
            q0 lookaheadDelegate = c0.this.F3().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return layoutModifierNode.q(this, lookaheadDelegate, width);
        }

        @Override // b4.q0, z3.q
        public int s0(int height) {
            b0 layoutModifierNode = c0.this.getLayoutModifierNode();
            q0 lookaheadDelegate = c0.this.F3().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return layoutModifierNode.B(this, lookaheadDelegate, height);
        }

        @Override // b4.q0, z3.q
        public int t0(int height) {
            b0 layoutModifierNode = c0.this.getLayoutModifierNode();
            q0 lookaheadDelegate = c0.this.F3().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return layoutModifierNode.M(this, lookaheadDelegate, height);
        }

        @Override // z3.h0
        public z3.w0 x0(long constraints) {
            c0 c0Var = c0.this;
            e1(constraints);
            c0Var.I3(w4.b.a(constraints));
            b0 layoutModifierNode = c0Var.getLayoutModifierNode();
            q0 lookaheadDelegate = c0Var.F3().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            m2(layoutModifierNode.c(this, lookaheadDelegate, constraints));
            return this;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"b4/c0$c", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "b", "I", "getWidth", "()I", Snapshot.WIDTH, "c", "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "q", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "g", "()Lwn0/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements z3.j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z3.j0 f16038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int height;

        c(z3.j0 j0Var, c0 c0Var) {
            this.f16038a = j0Var;
            q0 lookaheadDelegate = c0Var.getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            this.width = lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            q0 lookaheadDelegate2 = c0Var.getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
        }

        @Override // z3.j0
        public wn0.l<z3.c1, jn0.h0> g() {
            return this.f16038a.g();
        }

        @Override // z3.j0
        public int getHeight() {
            return this.height;
        }

        @Override // z3.j0
        public int getWidth() {
            return this.width;
        }

        @Override // z3.j0
        public void k() {
            this.f16038a.k();
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.f16038a.q();
        }
    }

    static {
        r3 r3VarA = k3.q0.a();
        r3VarA.s(k3.p1.INSTANCE.b());
        r3VarA.B(1.0f);
        r3VarA.z(s3.INSTANCE.b());
        Y = r3VarA;
    }

    public c0(g0 g0Var, b0 b0Var) {
        super(g0Var);
        this.layoutModifierNode = b0Var;
        z3.g gVar = null;
        this.lookaheadDelegate = g0Var.getLookaheadRoot() != null ? new b() : null;
        if ((b0Var.getNode().getKindSet() & b1.a(512)) != 0) {
            p013kotlin.jvm.internal.s.i(b0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            gVar = new z3.g(this, (z3.e) b0Var);
        }
        this.approachMeasureScope = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    private final void G3() {
        boolean z11;
        if (getIsShallowPlacing()) {
            return;
        }
        b3();
        z3.g gVar = this.approachMeasureScope;
        if (gVar != null) {
            z3.e eVarN = gVar.getApproachNode();
            z3.w0.a placementScope = getPlacementScope();
            q0 lookaheadDelegate = getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            if (eVarN.Y0(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) || gVar.getApproachMeasureRequired()) {
                z11 = false;
            } else {
                long jE = e();
                q0 lookaheadDelegate2 = getLookaheadDelegate();
                if (w4.r.d(jE, lookaheadDelegate2 != null ? w4.r.b(lookaheadDelegate2.g2()) : null)) {
                    long jE2 = F3().e();
                    q0 lookaheadDelegate3 = F3().getLookaheadDelegate();
                    if (w4.r.d(jE2, lookaheadDelegate3 != null ? w4.r.b(lookaheadDelegate3.g2()) : null)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            }
            F3().k3(z11);
        }
        x1().k();
        F3().k3(false);
    }

    @Override // b4.z0
    /* JADX INFO: renamed from: D2, reason: from getter */
    public q0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX INFO: renamed from: D3, reason: from getter */
    public final b0 getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* JADX INFO: renamed from: E3, reason: from getter */
    public final w4.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    public final z0 F3() {
        z0 wrapped = getWrapped();
        p013kotlin.jvm.internal.s.h(wrapped);
        return wrapped;
    }

    @Override // b4.z0
    public androidx.compose.ui.d.c H2() {
        return this.layoutModifierNode.getNode();
    }

    public final void H3(b0 b0Var) {
        if (!p013kotlin.jvm.internal.s.f(b0Var, this.layoutModifierNode)) {
            androidx.compose.ui.d.c node = b0Var.getNode();
            if ((node.getKindSet() & b1.a(512)) != 0) {
                p013kotlin.jvm.internal.s.i(b0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                z3.e eVar = (z3.e) b0Var;
                z3.g gVar = this.approachMeasureScope;
                if (gVar != null) {
                    gVar.D(eVar);
                } else {
                    gVar = new z3.g(this, eVar);
                }
                this.approachMeasureScope = gVar;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = b0Var;
    }

    public final void I3(w4.b bVar) {
        this.lookaheadConstraints = bVar;
    }

    protected void J3(q0 q0Var) {
        this.lookaheadDelegate = q0Var;
    }

    @Override // z3.q
    public int V(int width) {
        z3.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().T0(gVar, F3(), width) : this.layoutModifierNode.n(this, F3(), width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b4.z0, z3.w0
    public void X0(long position, float zIndex, n3.c layer) {
        super.X0(position, zIndex, layer);
        G3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b4.z0, z3.w0
    public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
        super.Y0(position, zIndex, layerBlock);
        G3();
    }

    @Override // b4.z0
    public void d3(k3.j1 canvas, n3.c graphicsLayer) {
        F3().q2(canvas, graphicsLayer);
        if (k0.b(getLayoutNode()).getShowLayoutBounds()) {
            r2(canvas, Y);
        }
    }

    @Override // b4.p0
    public int j1(z3.a alignmentLine) {
        q0 lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.b2(alignmentLine) : d0.b(this, alignmentLine);
    }

    @Override // z3.q
    public int m0(int width) {
        z3.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().X0(gVar, F3(), width) : this.layoutModifierNode.q(this, F3(), width);
    }

    @Override // z3.q
    public int s0(int height) {
        z3.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().X(gVar, F3(), height) : this.layoutModifierNode.B(this, F3(), height);
    }

    @Override // z3.q
    public int t0(int height) {
        z3.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().O0(gVar, F3(), height) : this.layoutModifierNode.M(this, F3(), height);
    }

    @Override // b4.z0
    public void t2() {
        if (getLookaheadDelegate() == null) {
            J3(new b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    @Override // z3.h0
    public z3.w0 x0(long constraints) {
        z3.j0 j0VarC;
        boolean z11;
        if (getForceMeasureWithLookaheadConstraints()) {
            w4.b bVar = this.lookaheadConstraints;
            if (bVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            constraints = bVar.getValue();
        }
        e1(constraints);
        z3.g gVar = this.approachMeasureScope;
        if (gVar != null) {
            z3.e eVarN = gVar.getApproachNode();
            gVar.B(eVarN.q1(gVar.y()) || !w4.b.e(constraints, getLookaheadConstraints()));
            if (!gVar.getApproachMeasureRequired()) {
                F3().j3(true);
            }
            j0VarC = eVarN.k1(gVar, F3(), constraints);
            F3().j3(false);
            int width = j0VarC.getWidth();
            q0 lookaheadDelegate = getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            if (width == lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()) {
                int height = j0VarC.getHeight();
                q0 lookaheadDelegate2 = getLookaheadDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadDelegate2);
                z11 = height == lookaheadDelegate2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            }
            if (!gVar.getApproachMeasureRequired()) {
                long jE = F3().e();
                q0 lookaheadDelegate3 = F3().getLookaheadDelegate();
                if (w4.r.d(jE, lookaheadDelegate3 != null ? w4.r.b(lookaheadDelegate3.g2()) : null) && !z11) {
                    j0VarC = new c(j0VarC, this);
                }
            }
        } else {
            j0VarC = getLayoutModifierNode().c(this, F3(), constraints);
        }
        l3(j0VarC);
        a3();
        return this;
    }
}
