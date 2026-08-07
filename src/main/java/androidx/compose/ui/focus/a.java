package androidx.compose.ui.focus;

import b4.b1;
import b4.g0;
import b4.x0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lkotlin/Function1;", "Lz3/h$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILwn0/l;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i11, wn0.l<? super z3.h.a, ? extends T> lVar) {
        androidx.compose.ui.d.c cVarG;
        z3.h hVarD2;
        int iC;
        x0 nodes;
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if ((focusTargetNode2 != null && p013kotlin.jvm.internal.s.f(focusTargetNode2.D2(), focusTargetNode.D2())) || (hVarD2 = focusTargetNode.D2()) == null) {
            return null;
        }
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.h())) {
            iC = z3.h.b.INSTANCE.a();
        } else if (d.l(i11, companion.a())) {
            iC = z3.h.b.INSTANCE.d();
        } else if (d.l(i11, companion.d())) {
            iC = z3.h.b.INSTANCE.e();
        } else if (d.l(i11, companion.g())) {
            iC = z3.h.b.INSTANCE.f();
        } else if (d.l(i11, companion.e())) {
            iC = z3.h.b.INSTANCE.b();
        } else {
            if (!d.l(i11, companion.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = z3.h.b.INSTANCE.c();
        }
        return (T) hVarD2.i(iC, lVar);
    }
}
