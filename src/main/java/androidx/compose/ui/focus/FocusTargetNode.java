package androidx.compose.ui.focus;

import b4.b1;
import b4.e1;
import b4.f1;
import b4.g0;
import b4.s0;
import b4.x0;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001*B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u0007\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Lb4/h;", "Li3/q;", "Lb4/e1;", "La4/h;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "Ljn0/h0;", "F2", "g1", "i2", "Landroidx/compose/ui/focus/k;", "C2", "()Landroidx/compose/ui/focus/k;", "B2", "J2", "", "n", "Z", "isProcessingCustomExit", "o", "isProcessingCustomEnter", "Li3/p;", "p", "Li3/p;", "committedFocusState", "q", "c2", "()Z", "shouldAutoInvalidate", "value", "E2", "()Li3/p;", "K2", "(Li3/p;)V", "getFocusState$annotations", "focusState", "Lz3/h;", "D2", "()Lz3/h;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusTargetNode extends androidx.compose.ui.d.c implements b4.h, i3.q, e1, a4.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private i3.p committedFocusState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lb4/s0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "o", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends s0<FocusTargetNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f5346b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode i() {
            return new FocusTargetNode();
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void m(FocusTargetNode node) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5347a;

        static {
            int[] iArr = new int[i3.p.values().length];
            try {
                iArr[i3.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i3.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i3.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5347a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<k> f5348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5349d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0<k> n0Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.f5348c = n0Var;
            this.f5349d = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.k] */
        public final void b() {
            this.f5348c.f86529a = this.f5349d.C2();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    private final void F2() {
        if (I2(this)) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        i3.t tVarD = i3.s.d(this);
        try {
            if (tVarD.ongoingTransaction) {
                tVarD.g();
            }
            tVarD.f();
            K2((H2(this) && G2(this)) ? i3.p.ActiveParent : i3.p.Inactive);
            h0 h0Var = h0.f84049a;
        } finally {
            tVarD.h();
        }
    }

    private static final boolean G2(FocusTargetNode focusTargetNode) {
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            y3.a.b("visitSubtreeIf called on an unattached node");
        }
        t2.b bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar, focusTargetNode.getNode());
        } else {
            bVar.b(child);
        }
        while (bVar.q()) {
            androidx.compose.ui.d.c cVar = (androidx.compose.ui.d.c) bVar.v(bVar.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (androidx.compose.ui.d.c child2 = cVar; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = child2;
                        t2.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (I2(focusTargetNode2)) {
                                    int i11 = a.f5347a[focusTargetNode2.E2().ordinal()];
                                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                                        return true;
                                    }
                                    if (i11 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.b(delegate);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar2);
                        }
                    }
                }
            }
            b4.k.c(bVar, cVar);
        }
        return false;
    }

    private static final boolean H2(FocusTargetNode focusTargetNode) {
        x0 nodes;
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = focusTargetNode.getNode().getParent();
        g0 g0VarM = b4.k.m(focusTargetNode);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = parent;
                        t2.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (I2(focusTargetNode2)) {
                                    int i11 = a.f5347a[focusTargetNode2.E2().ordinal()];
                                    if (i11 != 1 && i11 != 2) {
                                        if (i11 == 3) {
                                            return true;
                                        }
                                        if (i11 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.b(delegate);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return false;
    }

    private static final boolean I2(FocusTargetNode focusTargetNode) {
        return focusTargetNode.committedFocusState != null;
    }

    public final void B2() {
        i3.p pVarI = i3.s.d(this).i(this);
        if (pVarI != null) {
            this.committedFocusState = pVarI;
        } else {
            y3.a.c("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final k C2() {
        x0 nodes;
        l lVar = new l();
        int iA = b1.a(2048);
        int iA2 = b1.a(1024);
        androidx.compose.ui.d.c node = getNode();
        int i11 = iA | iA2;
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c node2 = getNode();
        g0 g0VarM = b4.k.m(this);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & i11) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i11) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return lVar;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            androidx.compose.ui.d.c cVarG = node2;
                            t2.b bVar = null;
                            while (cVarG != 0) {
                                if (cVarG instanceof i3.j) {
                                    ((i3.j) cVarG).y1(lVar);
                                } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                    androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate();
                                    int i12 = 0;
                                    cVarG = cVarG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVarG = delegate;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (cVarG != 0) {
                                                    bVar.b(cVarG);
                                                    cVarG = 0;
                                                }
                                                bVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        cVarG = cVarG;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVarG = b4.k.g(bVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            node2 = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return lVar;
    }

    public final z3.h D2() {
        return (z3.h) I(z3.i.a());
    }

    public i3.p E2() {
        i3.p pVarI;
        i3.t tVarB = i3.s.b(this);
        if (tVarB != null && (pVarI = tVarB.i(this)) != null) {
            return pVarI;
        }
        i3.p pVar = this.committedFocusState;
        return pVar == null ? i3.p.Inactive : pVar;
    }

    public final void J2() {
        k kVar;
        if (this.committedFocusState == null) {
            F2();
        }
        int i11 = a.f5347a[E2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            n0 n0Var = new n0();
            f1.a(this, new b(n0Var, this));
            T t11 = n0Var.f86529a;
            if (t11 == 0) {
                p013kotlin.jvm.internal.s.B("focusProperties");
                kVar = null;
            } else {
                kVar = (k) t11;
            }
            if (kVar.getCanFocus()) {
                return;
            }
            b4.k.n(this).getFocusOwner().r(true);
        }
    }

    public void K2(i3.p pVar) {
        i3.s.d(this).j(this, pVar);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // b4.e1
    public void g1() {
        i3.p pVarE2 = E2();
        J2();
        if (pVarE2 != E2()) {
            i3.d.c(this);
        }
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        int i11 = a.f5347a[E2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            b4.k.n(this).getFocusOwner().f(true, true, false, d.INSTANCE.c());
            i3.s.c(this);
        } else if (i11 == 3) {
            i3.t tVarD = i3.s.d(this);
            try {
                if (tVarD.ongoingTransaction) {
                    tVarD.g();
                }
                tVarD.f();
                K2(i3.p.Inactive);
                h0 h0Var = h0.f84049a;
                tVarD.h();
            } catch (Throwable th2) {
                tVarD.h();
                throw th2;
            }
        }
        this.committedFocusState = null;
    }
}
