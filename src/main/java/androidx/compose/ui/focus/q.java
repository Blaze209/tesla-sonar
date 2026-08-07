package androidx.compose.ui.focus;

import b4.b1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/n;", "", "a", "(Li3/n;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5387c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(s.j(focusTargetNode));
        }
    }

    public static final boolean a(i3.n nVar) {
        int iA = b1.a(1024);
        androidx.compose.ui.d.c node = nVar.getNode();
        t2.b bVar = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                return focusTargetNode.C2().getCanFocus() ? s.j(focusTargetNode) : w.k(focusTargetNode, d.INSTANCE.b(), a.f5387c);
            }
            if ((node.getKindSet() & iA) != 0 && (node instanceof b4.m)) {
                int i11 = 0;
                for (androidx.compose.ui.d.c delegate = ((b4.m) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i11++;
                        if (i11 == 1) {
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
                if (i11 == 1) {
                }
            }
            node = b4.k.g(bVar);
        }
        if (!nVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = nVar.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, nVar.getNode());
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                return focusTargetNode2.C2().getCanFocus() ? s.j(focusTargetNode2) : w.k(focusTargetNode2, d.INSTANCE.b(), a.f5387c);
                            }
                            if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.d.c delegate2 = ((b4.m) cVarG).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
        return false;
    }
}
