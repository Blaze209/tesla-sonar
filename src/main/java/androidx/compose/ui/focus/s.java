package androidx.compose.ui.focus;

import b4.b1;
import b4.f1;
import b4.g0;
import b4.x0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "Landroidx/compose/ui/focus/d;", "focusDirection", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "forced", "refreshFocusEvents", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", DateTokenConverter.CONVERTER_KEY, "a", "childNode", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "m", "n", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Li3/a;", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Li3/a;", "e", "f", "g", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5390b;

        static {
            int[] iArr = new int[i3.a.values().length];
            try {
                iArr[i3.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i3.a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i3.a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5389a = iArr;
            int[] iArr2 = new int[i3.p.values().length];
            try {
                iArr2[i3.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i3.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i3.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i3.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f5390b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f5391c = focusTargetNode;
        }

        public final void b() {
            this.f5391c.C2();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusTargetNode focusTargetNode) {
            super(0);
            this.f5392c = focusTargetNode;
        }

        public final void b() {
            if (this.f5392c.getNode().getIsAttached()) {
                i3.d.c(this.f5392c);
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z11, boolean z12) {
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z11, z12);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return a(focusTargetNode, z11, z12);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z11, boolean z12) {
        int i11 = a.f5390b[focusTargetNode.E2().ordinal()];
        if (i11 == 1) {
            focusTargetNode.K2(i3.p.Inactive);
            if (z12) {
                i3.d.c(focusTargetNode);
            }
            return true;
        }
        if (i11 == 2) {
            if (z11) {
                focusTargetNode.K2(i3.p.Inactive);
                if (z12) {
                    i3.d.c(focusTargetNode);
                }
            }
            return z11;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!a(focusTargetNode, z11, z12)) {
            return false;
        }
        focusTargetNode.K2(i3.p.Inactive);
        if (z12) {
            i3.d.c(focusTargetNode);
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        f1.a(focusTargetNode, new b(focusTargetNode));
        int i11 = a.f5390b[focusTargetNode.E2().ordinal()];
        if (i11 != 3 && i11 != 4) {
            return true;
        }
        focusTargetNode.K2(i3.p.Active);
        return true;
    }

    public static final i3.a e(FocusTargetNode focusTargetNode, int i11) {
        int i12 = a.f5390b[focusTargetNode.E2().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return i3.a.Cancelled;
            }
            if (i12 == 3) {
                i3.a aVarE = e(n(focusTargetNode), i11);
                if (aVarE == i3.a.None) {
                    aVarE = null;
                }
                return aVarE == null ? g(focusTargetNode, i11) : aVarE;
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i3.a.None;
    }

    private static final i3.a f(FocusTargetNode focusTargetNode, int i11) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                o oVarInvoke = focusTargetNode.C2().u().invoke(d.i(i11));
                o.Companion companion = o.INSTANCE;
                if (oVarInvoke != companion.b()) {
                    if (oVarInvoke == companion.a()) {
                        return i3.a.Cancelled;
                    }
                    return oVarInvoke.d() ? i3.a.Redirected : i3.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return i3.a.None;
    }

    private static final i3.a g(FocusTargetNode focusTargetNode, int i11) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                o oVarInvoke = focusTargetNode.C2().p().invoke(d.i(i11));
                o.Companion companion = o.INSTANCE;
                if (oVarInvoke != companion.b()) {
                    if (oVarInvoke == companion.a()) {
                        return i3.a.Cancelled;
                    }
                    return oVarInvoke.d() ? i3.a.Redirected : i3.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return i3.a.None;
    }

    public static final i3.a h(FocusTargetNode focusTargetNode, int i11) {
        androidx.compose.ui.d.c cVarG;
        x0 nodes;
        int i12 = a.f5390b[focusTargetNode.E2().ordinal()];
        if (i12 == 1 || i12 == 2) {
            return i3.a.None;
        }
        if (i12 == 3) {
            return e(n(focusTargetNode), i11);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = focusTargetNode.getNode().getParent();
        g0 g0VarM = b4.k.m(focusTargetNode);
        loop0: while (true) {
            if (g0VarM == null) {
                cVarG = null;
                break;
            }
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarG = parent;
                        t2.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i13 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if (focusTargetNode2 == null) {
            return i3.a.None;
        }
        int i14 = a.f5390b[focusTargetNode2.E2().ordinal()];
        if (i14 == 1) {
            return f(focusTargetNode2, i11);
        }
        if (i14 == 2) {
            return i3.a.Cancelled;
        }
        if (i14 == 3) {
            return h(focusTargetNode2, i11);
        }
        if (i14 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        i3.a aVarH = h(focusTargetNode2, i11);
        i3.a aVar = aVarH != i3.a.None ? aVarH : null;
        return aVar == null ? f(focusTargetNode2, i11) : aVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    public static final boolean i(FocusTargetNode focusTargetNode) {
        x0 nodes;
        int i11 = a.f5390b[focusTargetNode.E2().ordinal()];
        boolean zL = true;
        if (i11 != 1 && i11 != 2) {
            androidx.compose.ui.d.c cVar = null;
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iA = b1.a(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.d.c parent = focusTargetNode.getNode().getParent();
                g0 g0VarM = b4.k.m(focusTargetNode);
                loop0: while (g0VarM != null) {
                    if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iA) != 0) {
                                androidx.compose.ui.d.c cVarG = parent;
                                t2.b bVar = null;
                                while (cVarG != null) {
                                    if (cVarG instanceof FocusTargetNode) {
                                        cVar = cVarG;
                                        break loop0;
                                    }
                                    if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
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
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                if (focusTargetNode2 != null) {
                    i3.p pVarE2 = focusTargetNode2.E2();
                    zL = l(focusTargetNode2, focusTargetNode);
                    if (zL && pVarE2 != focusTargetNode2.E2()) {
                        i3.d.c(focusTargetNode2);
                    }
                } else if (!m(focusTargetNode) || !d(focusTargetNode)) {
                    zL = false;
                }
            } else if (!b(focusTargetNode, false, false, 3, null) || !d(focusTargetNode)) {
                zL = false;
            }
        }
        if (zL) {
            i3.d.c(focusTargetNode);
        }
        return zL;
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        Boolean boolK = k(focusTargetNode, d.INSTANCE.b());
        if (boolK != null) {
            return boolK.booleanValue();
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i11) {
        Boolean boolValueOf;
        i3.t tVarD = i3.s.d(focusTargetNode);
        c cVar = new c(focusTargetNode);
        try {
            if (tVarD.ongoingTransaction) {
                tVarD.g();
            }
            tVarD.f();
            tVarD.cancellationListener.b(cVar);
            int i12 = a.f5389a[h(focusTargetNode, i11).ordinal()];
            if (i12 == 1) {
                boolValueOf = Boolean.valueOf(i(focusTargetNode));
            } else if (i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            tVarD.h();
            return boolValueOf;
        } catch (Throwable th2) {
            tVarD.h();
            throw th2;
        }
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.d.c cVar;
        androidx.compose.ui.d.c cVarG;
        x0 nodes;
        x0 nodes2;
        int iA = b1.a(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = focusTargetNode2.getNode().getParent();
        g0 g0VarM = b4.k.m(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (g0VarM == null) {
                cVarG = null;
                break;
            }
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarG = parent;
                        t2.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes2 = g0VarM.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!p013kotlin.jvm.internal.s.f(cVarG, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i12 = a.f5390b[focusTargetNode.E2().ordinal()];
        if (i12 == 1) {
            boolean zD = d(focusTargetNode2);
            if (zD) {
                focusTargetNode.K2(i3.p.ActiveParent);
            }
            return zD;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iA2 = b1.a(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.d.c parent2 = focusTargetNode.getNode().getParent();
                g0 g0VarM2 = b4.k.m(focusTargetNode);
                loop4: while (g0VarM2 != null) {
                    if ((g0VarM2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iA2) != 0) {
                                androidx.compose.ui.d.c cVarG2 = parent2;
                                t2.b bVar2 = null;
                                while (cVarG2 != null) {
                                    if (cVarG2 instanceof FocusTargetNode) {
                                        cVar = cVarG2;
                                        break loop4;
                                    }
                                    if ((cVarG2.getKindSet() & iA2) != 0 && (cVarG2 instanceof b4.m)) {
                                        int i13 = 0;
                                        for (androidx.compose.ui.d.c delegate2 = ((b4.m) cVarG2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iA2) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    cVarG2 = delegate2;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                                    }
                                                    if (cVarG2 != null) {
                                                        bVar2.b(cVarG2);
                                                        cVarG2 = null;
                                                    }
                                                    bVar2.b(delegate2);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    cVarG2 = b4.k.g(bVar2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    g0VarM2 = g0VarM2.n0();
                    parent2 = (g0VarM2 == null || (nodes = g0VarM2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && m(focusTargetNode)) {
                    boolean zD2 = d(focusTargetNode2);
                    if (zD2) {
                        focusTargetNode.K2(i3.p.ActiveParent);
                    }
                    return zD2;
                }
                if (focusTargetNode3 == null || !l(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zL = l(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.E2() != i3.p.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zL) {
                    i3.d.c(focusTargetNode3);
                }
                return zL;
            }
            n(focusTargetNode);
            if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean m(FocusTargetNode focusTargetNode) {
        return b4.k.n(focusTargetNode).getFocusOwner().g(null, null);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
