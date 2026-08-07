package a4;

import b4.b1;
import b4.g0;
import b4.m;
import b4.x0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"La4/h;", "La4/k;", "Lb4/j;", "La4/g;", "d0", "()La4/g;", "providedValues", "T", "La4/c;", "I", "(La4/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h extends k, b4.j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t2.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t2.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // a4.k
    default <T> T I(c<T> cVar) {
        x0 nodes;
        if (!getNode().getIsAttached()) {
            y3.a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = b1.a(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = getNode().getParent();
        g0 g0VarM = b4.k.m(this);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        ?? G = parent;
                        ?? bVar = 0;
                        while (G != 0) {
                            if (G instanceof h) {
                                h hVar = (h) G;
                                if (hVar.d0().a(cVar)) {
                                    return (T) hVar.d0().b(cVar);
                                }
                            } else if ((G.getKindSet() & iA) != 0 && (G instanceof m)) {
                                androidx.compose.ui.d.c delegate = ((m) G).getDelegate();
                                int i11 = 0;
                                G = G;
                                bVar = bVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            bVar = bVar;
                                            G = delegate;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (G != 0) {
                                                bVar.b(G);
                                                G = 0;
                                            }
                                            bVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    G = G;
                                    bVar = bVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            G = b4.k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    default g d0() {
        return b.f247a;
    }
}
