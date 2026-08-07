package i3;

import androidx.compose.ui.focus.FocusTargetNode;
import b4.b1;
import b4.g0;
import b4.x0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li3/c;", "Ljn0/h0;", "b", "(Li3/c;)V", "Li3/o;", "a", "(Li3/c;)Li3/o;", "Landroidx/compose/ui/focus/FocusTargetNode;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75573a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f75573a = iArr;
        }
    }

    public static final o a(c cVar) {
        int iA = b1.a(1024);
        androidx.compose.ui.d.c node = cVar.getNode();
        t2.b bVar = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                p pVarE2 = ((FocusTargetNode) node).E2();
                int i11 = a.f75573a[pVarE2.ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    return pVarE2;
                }
            } else if ((node.getKindSet() & iA) != 0 && (node instanceof b4.m)) {
                int i12 = 0;
                for (androidx.compose.ui.d.c delegate = ((b4.m) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i12++;
                        if (i12 == 1) {
                            node = delegate;
                        } else {
                            if (bVar == null) {
                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (node != null) {
                                bVar.b(node);
                                node = null;
                            }
                            bVar.b(delegate);
                        }
                    }
                }
                if (i12 == 1) {
                }
            }
            node = b4.k.g(bVar);
        }
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = cVar.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, cVar.getNode());
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
                                p pVarE3 = ((FocusTargetNode) cVarG).E2();
                                int i13 = a.f75573a[pVarE3.ordinal()];
                                if (i13 == 1 || i13 == 2 || i13 == 3) {
                                    return pVarE3;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i14 = 0;
                                for (androidx.compose.ui.d.c delegate2 = ((b4.m) cVarG).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarG = delegate2;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate2);
                                        }
                                    }
                                }
                                if (i14 == 1) {
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
        return p.Inactive;
    }

    public static final void b(c cVar) {
        b4.k.n(cVar).getFocusOwner().l(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    public static final void c(FocusTargetNode focusTargetNode) {
        x0 nodes;
        int iA = b1.a(4096);
        int iA2 = b1.a(1024);
        androidx.compose.ui.d.c node = focusTargetNode.getNode();
        int i11 = iA | iA2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c node2 = focusTargetNode.getNode();
        g0 g0VarM = b4.k.m(focusTargetNode);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & i11) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i11) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            androidx.compose.ui.d.c cVarG = node2;
                            t2.b bVar = null;
                            while (cVarG != 0) {
                                if (cVarG instanceof c) {
                                    c cVar = (c) cVarG;
                                    cVar.y(a(cVar));
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
    }
}
