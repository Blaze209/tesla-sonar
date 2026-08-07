package androidx.compose.ui.focus;

import b4.b1;
import b4.g0;
import b4.x0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILwn0/l;)Z", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;Lwn0/l;)Z", "b", "focusedItem", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILwn0/l;)Z", IntegerTokenConverter.CONVERTER_KEY, "h", "g", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5396a;

        static {
            int[] iArr = new int[i3.p.values().length];
            try {
                iArr[i3.p.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i3.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i3.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5396a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/h$a;", "", "a", "(Lz3/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<z3.h.a, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<FocusTargetNode, Boolean> f5400f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f5397c = focusTargetNode;
            this.f5398d = focusTargetNode2;
            this.f5399e = i11;
            this.f5400f = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z3.h.a aVar) {
            boolean zI = v.i(this.f5397c, this.f5398d, this.f5399e, this.f5400f);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        i3.p pVarE2 = focusTargetNode.E2();
        int[] iArr = a.f5396a;
        int i11 = iArr[pVarE2.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return g(focusTargetNode, lVar);
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.C2().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[focusTargetNodeF.E2().ordinal()];
        if (i12 == 1) {
            return b(focusTargetNodeF, lVar) || d(focusTargetNode, focusTargetNodeF, d.INSTANCE.f(), lVar) || (focusTargetNodeF.C2().getCanFocus() && lVar.invoke(focusTargetNodeF).booleanValue());
        }
        if (i12 == 2 || i12 == 3) {
            return d(focusTargetNode, focusTargetNodeF, d.INSTANCE.f(), lVar);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(FocusTargetNode focusTargetNode, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        int i11 = a.f5396a[focusTargetNode.E2().ordinal()];
        if (i11 == 1) {
            FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, lVar) || d(focusTargetNode, focusTargetNodeF, d.INSTANCE.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i11 == 2 || i11 == 3) {
            return h(focusTargetNode, lVar);
        }
        if (i11 == 4) {
            return focusTargetNode.C2().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : h(focusTargetNode, lVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i11, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i11, new b(focusTargetNode, focusTargetNode2, i11, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.d.c cVar;
        x0 nodes;
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = focusTargetNode.getNode().getParent();
        g0 g0VarM = b4.k.m(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (g0VarM == null) {
                break;
            }
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
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.e())) {
            return c(focusTargetNode, lVar);
        }
        if (d.l(i11, companion.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        t2.b bVar = new t2.b(new FocusTargetNode[16], 0);
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child);
        }
        while (bVar2.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.b((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
        bVar.A(u.f5395a);
        int size = bVar.getSize();
        if (size > 0) {
            int i12 = size - 1;
            Object[] objArrM = bVar.m();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrM[i12];
                if (t.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                    return true;
                }
                i12--;
            } while (i12 >= 0);
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        t2.b bVar = new t2.b(new FocusTargetNode[16], 0);
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child);
        }
        while (bVar2.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.b((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
        bVar.A(u.f5395a);
        int size = bVar.getSize();
        if (size > 0) {
            Object[] objArrM = bVar.m();
            int i12 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrM[i12];
                if (t.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                    return true;
                }
                i12++;
            } while (i12 < size);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.E2() != i3.p.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        t2.b bVar = new t2.b(new FocusTargetNode[16], 0);
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child);
        }
        while (bVar2.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.b((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
        bVar.A(u.f5395a);
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.e())) {
            bo0.j jVar = new bo0.j(0, bVar.getSize() - 1);
            int first = jVar.getFirst();
            int last = jVar.getLast();
            if (first <= last) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.m()[first];
                        if (t.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (p013kotlin.jvm.internal.s.f(bVar.m()[first], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!d.l(i11, companion.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            bo0.j jVar2 = new bo0.j(0, bVar.getSize() - 1);
            int first2 = jVar2.getFirst();
            int last2 = jVar2.getLast();
            if (first2 <= last2) {
                boolean z12 = false;
                while (true) {
                    if (z12) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.m()[last2];
                        if (t.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (p013kotlin.jvm.internal.s.f(bVar.m()[last2], focusTargetNode2)) {
                        z12 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (d.l(i11, d.INSTANCE.e()) || !focusTargetNode.C2().getCanFocus() || e(focusTargetNode)) {
            return false;
        }
        return lVar.invoke(focusTargetNode).booleanValue();
    }
}
