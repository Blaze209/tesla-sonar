package b4;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.r3;
import k3.s3;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002HIB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001fH\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b+\u0010,J:\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107R \u0010>\u001a\u0002088\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\b\u001a\u0004\b;\u0010<R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Lb4/w;", "Lb4/z0;", "Lb4/g0;", "layoutNode", "<init>", "(Lb4/g0;)V", "Ljn0/h0;", "D3", "()V", "t2", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "", Snapshot.HEIGHT, "s0", "(I)I", Snapshot.WIDTH, "m0", "t0", "V", "Lw4/n;", "position", "", "zIndex", "Ln3/c;", "layer", "X0", "(JFLn3/c;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Y0", "(JFLwn0/l;)V", "Lz3/a;", "alignmentLine", "j1", "(Lz3/a;)I", "Lk3/j1;", "canvas", "graphicsLayer", "d3", "(Lk3/j1;Ln3/c;)V", "Lb4/z0$f;", "hitTestSource", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "", "isTouchEvent", "isInLayer", "R2", "(Lb4/z0$f;JLb4/u;ZZ)V", "Lb4/v1;", "T", "Lb4/v1;", "C3", "()Lb4/v1;", "getTail$annotations", "tail", "Lb4/q0;", "<set-?>", Gender.UNKNOWN, "Lb4/q0;", "D2", "()Lb4/q0;", "E3", "(Lb4/q0;)V", "lookaheadDelegate", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w extends z0 {
    private static final r3 W;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final v1 tail;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private q0 lookaheadDelegate;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lb4/w$b;", "Lb4/q0;", "<init>", "(Lb4/w;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "Lz3/a;", "alignmentLine", "", "j1", "(Lz3/a;)I", "Ljn0/h0;", "h2", "()V", Snapshot.HEIGHT, "s0", "(I)I", Snapshot.WIDTH, "m0", "t0", "V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends q0 {
        public b() {
            super(w.this);
        }

        @Override // b4.q0, z3.q
        public int V(int width) {
            return getLayoutNode().Y0(width);
        }

        @Override // b4.q0
        protected void h2() {
            l0.a aVarY = getLayoutNode().Y();
            p013kotlin.jvm.internal.s.h(aVarY);
            aVarY.T1();
        }

        @Override // b4.p0
        public int j1(z3.a alignmentLine) {
            Integer num = a2().B().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            c2().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // b4.q0, z3.q
        public int m0(int width) {
            return getLayoutNode().c1(width);
        }

        @Override // b4.q0, z3.q
        public int s0(int height) {
            return getLayoutNode().d1(height);
        }

        @Override // b4.q0, z3.q
        public int t0(int height) {
            return getLayoutNode().Z0(height);
        }

        @Override // z3.h0
        public z3.w0 x0(long constraints) {
            e1(constraints);
            t2.b<g0> bVarW0 = getLayoutNode().w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    l0.a aVarY = g0VarArrM[i11].Y();
                    p013kotlin.jvm.internal.s.h(aVarY);
                    aVarY.Y1(g0.g.NotUsed);
                    i11++;
                } while (i11 < size);
            }
            m2(getLayoutNode().getMeasurePolicy().c(this, getLayoutNode().E(), constraints));
            return this;
        }
    }

    static {
        r3 r3VarA = k3.q0.a();
        r3VarA.s(k3.p1.INSTANCE.h());
        r3VarA.B(1.0f);
        r3VarA.z(s3.INSTANCE.b());
        W = r3VarA;
    }

    public w(g0 g0Var) {
        super(g0Var);
        this.tail = new v1();
        H2().w2(this);
        this.lookaheadDelegate = g0Var.getLookaheadRoot() != null ? new b() : null;
    }

    private final void D3() {
        if (getIsShallowPlacing()) {
            return;
        }
        b3();
        getLayoutNode().b0().Z1();
    }

    @Override // b4.z0
    /* JADX INFO: renamed from: C3, reason: from getter and merged with bridge method [inline-methods] */
    public v1 H2() {
        return this.tail;
    }

    @Override // b4.z0
    /* JADX INFO: renamed from: D2, reason: from getter */
    public q0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    protected void E3(q0 q0Var) {
        this.lookaheadDelegate = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    @Override // b4.z0
    public void R2(z0.f hitTestSource, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z11;
        boolean z12 = false;
        if (hitTestSource.d(getLayoutNode())) {
            if (B3(pointerPosition)) {
                z11 = isInLayer;
            } else {
                if (isTouchEvent) {
                    float fP2 = p2(pointerPosition, E2());
                    if (!Float.isInfinite(fP2) && !Float.isNaN(fP2)) {
                        z11 = false;
                    }
                }
                z11 = isInLayer;
            }
            z12 = true;
        } else {
            z11 = isInLayer;
        }
        if (z12) {
            int i11 = hitTestResult.hitDepth;
            t2.b<g0> bVarV0 = getLayoutNode().v0();
            int size = bVarV0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarV0.m();
                int i12 = size - 1;
                do {
                    g0 g0Var = g0VarArrM[i12];
                    if (g0Var.y()) {
                        hitTestSource.c(g0Var, pointerPosition, hitTestResult, isTouchEvent, z11);
                        if (!hitTestResult.o()) {
                            i12--;
                        } else {
                            if (!hitTestResult.getShouldSharePointerInputWithSibling()) {
                                break;
                            }
                            hitTestResult.b();
                            i12--;
                        }
                    } else {
                        i12--;
                    }
                } while (i12 >= 0);
            }
            hitTestResult.hitDepth = i11;
        }
    }

    @Override // z3.q
    public int V(int width) {
        return getLayoutNode().W0(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b4.z0, z3.w0
    public void X0(long position, float zIndex, n3.c layer) {
        super.X0(position, zIndex, layer);
        D3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b4.z0, z3.w0
    public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
        super.Y0(position, zIndex, layerBlock);
        D3();
    }

    @Override // b4.z0
    public void d3(k3.j1 canvas, n3.c graphicsLayer) {
        j1 j1VarB = k0.b(getLayoutNode());
        t2.b<g0> bVarV0 = getLayoutNode().v0();
        int size = bVarV0.getSize();
        if (size > 0) {
            g0[] g0VarArrM = bVarV0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if (g0Var.y()) {
                    g0Var.A(canvas, graphicsLayer);
                }
                i11++;
            } while (i11 < size);
        }
        if (j1VarB.getShowLayoutBounds()) {
            r2(canvas, W);
        }
    }

    @Override // b4.p0
    public int j1(z3.a alignmentLine) {
        q0 lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.j1(alignmentLine);
        }
        Integer num = y2().B().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // z3.q
    public int m0(int width) {
        return getLayoutNode().a1(width);
    }

    @Override // z3.q
    public int s0(int height) {
        return getLayoutNode().b1(height);
    }

    @Override // z3.q
    public int t0(int height) {
        return getLayoutNode().X0(height);
    }

    @Override // b4.z0
    public void t2() {
        if (getLookaheadDelegate() == null) {
            E3(new b());
        }
    }

    @Override // z3.h0
    public z3.w0 x0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            q0 lookaheadDelegate = getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            constraints = lookaheadDelegate.d2();
        }
        e1(constraints);
        t2.b<g0> bVarW0 = getLayoutNode().w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0VarArrM[i11].b0().f2(g0.g.NotUsed);
                i11++;
            } while (i11 < size);
        }
        l3(getLayoutNode().getMeasurePolicy().c(this, getLayoutNode().F(), constraints));
        a3();
        return this;
    }
}
