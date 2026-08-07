package androidx.compose.ui.focus;

import b4.b1;
import b4.g0;
import b4.x0;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "focusDirection", "Lw4/t;", "layoutDirection", "Landroidx/compose/ui/focus/o;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILw4/t;)Landroidx/compose/ui/focus/o;", "Lj3/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILw4/t;Lj3/i;Lwn0/l;)Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetNode;)Lj3/i;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5394b;

        static {
            int[] iArr = new int[w4.t.values().length];
            try {
                iArr[w4.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w4.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5393a = iArr;
            int[] iArr2 = new int[i3.p.values().length];
            try {
                iArr2[i3.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[i3.p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[i3.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i3.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f5394b = iArr2;
        }
    }

    public static final o a(FocusTargetNode focusTargetNode, int i11, w4.t tVar) {
        o end;
        o oVar;
        o start;
        k kVarC2 = focusTargetNode.C2();
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.e())) {
            return kVarC2.getNext();
        }
        if (d.l(i11, companion.f())) {
            return kVarC2.getPrevious();
        }
        if (d.l(i11, companion.h())) {
            return kVarC2.getUp();
        }
        if (d.l(i11, companion.a())) {
            return kVarC2.getDown();
        }
        if (d.l(i11, companion.d())) {
            int i12 = a.f5393a[tVar.ordinal()];
            if (i12 == 1) {
                start = kVarC2.getStart();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = kVarC2.getEnd();
            }
            oVar = start != o.INSTANCE.b() ? start : null;
            return oVar == null ? kVarC2.getLeft() : oVar;
        }
        if (!d.l(i11, companion.g())) {
            if (d.l(i11, companion.b())) {
                return kVarC2.u().invoke(d.i(i11));
            }
            if (d.l(i11, companion.c())) {
                return kVarC2.p().invoke(d.i(i11));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i13 = a.f5393a[tVar.ordinal()];
        if (i13 == 1) {
            end = kVarC2.getEnd();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            end = kVarC2.getStart();
        }
        oVar = end != o.INSTANCE.b() ? end : null;
        return oVar == null ? kVarC2.getRight() : oVar;
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        int i11 = a.f5394b[focusTargetNode.E2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                int iA = b1.a(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                t2.b bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
                if (child == null) {
                    b4.k.c(bVar, focusTargetNode.getNode());
                } else {
                    bVar.b(child);
                }
                while (bVar.q()) {
                    androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar.v(bVar.getSize() - 1);
                    if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                        b4.k.c(bVar, cVarG);
                    } else {
                        while (cVarG != null) {
                            if ((cVarG.getKindSet() & iA) != 0) {
                                t2.b bVar2 = null;
                                while (cVarG != null) {
                                    if (cVarG instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNodeB = b((FocusTargetNode) cVarG);
                                        if (focusTargetNodeB != null) {
                                            return focusTargetNodeB;
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
                                break;
                            }
                            cVarG = cVarG.getChild();
                        }
                    }
                }
                return null;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
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
                                if (focusTargetNode2.C2().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
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
        return null;
    }

    public static final j3.i d(FocusTargetNode focusTargetNode) {
        j3.i iVarF;
        z0 coordinator = focusTargetNode.getCoordinator();
        return (coordinator == null || (iVarF = z3.w.d(coordinator).F(coordinator, false)) == null) ? j3.i.INSTANCE.a() : iVarF;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i11, w4.t tVar, j3.i iVar, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        int iG;
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.e()) ? true : d.l(i11, companion.f())) {
            return Boolean.valueOf(v.f(focusTargetNode, i11, lVar));
        }
        if (d.l(i11, companion.d()) ? true : d.l(i11, companion.g()) ? true : d.l(i11, companion.h()) ? true : d.l(i11, companion.a())) {
            return w.t(focusTargetNode, i11, iVar, lVar);
        }
        if (!d.l(i11, companion.b())) {
            if (d.l(i11, companion.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || p013kotlin.jvm.internal.s.f(focusTargetNodeC, focusTargetNode)) ? false : lVar.invoke(focusTargetNodeC).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.n(i11))).toString());
        }
        int i12 = a.f5393a[tVar.ordinal()];
        if (i12 == 1) {
            iG = companion.g();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = companion.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return w.t(focusTargetNodeB2, iG, iVar, lVar);
        }
        return null;
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
        }
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar, focusTargetNode.getNode());
        } else {
            bVar.b(child);
        }
        while (bVar.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar.v(bVar.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.getNode().getIsAttached()) {
                                    int i11 = a.f5394b[focusTargetNode2.E2().ordinal()];
                                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                                        return focusTargetNode2;
                                    }
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
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
        return null;
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        g0 layoutNode;
        z0 coordinator;
        g0 layoutNode2;
        z0 coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.y() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.K0()) ? false : true;
    }
}
