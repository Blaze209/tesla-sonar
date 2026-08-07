package b4;

import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/d$b;", "element", "", "f", "(Landroidx/compose/ui/d$b;)I", "Landroidx/compose/ui/d$c;", "node", "g", "(Landroidx/compose/ui/d$c;)I", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d$c;)V", "a", "e", "remainingSet", "phase", "b", "(Landroidx/compose/ui/d$c;II)V", "selfKindSet", "c", "Li3/j;", "j", "(Li3/j;)V", "", "k", "(Li3/j;)Z", "h", "Landroidx/collection/h0;", "", "Landroidx/collection/h0;", "classToKindSetMap", "Lb4/b1;", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.h0<Object> f16041a = androidx.collection.o0.b();

    public static final void a(androidx.compose.ui.d.c cVar) {
        if (!cVar.getIsAttached()) {
            y3.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(androidx.compose.ui.d.c cVar, int i11, int i12) {
        if (!(cVar instanceof m)) {
            c(cVar, i11 & cVar.getKindSet(), i12);
            return;
        }
        m mVar = (m) cVar;
        c(cVar, mVar.getSelfKindSet() & i11, i12);
        int i13 = (~mVar.getSelfKindSet()) & i11;
        for (androidx.compose.ui.d.c cVarY2 = mVar.getDelegate(); cVarY2 != null; cVarY2 = cVarY2.getChild()) {
            b(cVarY2, i13, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(androidx.compose.ui.d.c cVar, int i11, int i12) {
        if (i12 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((b1.a(2) & i11) != 0 && (cVar instanceof b0)) {
                e0.b((b0) cVar);
                if (i12 == 2) {
                    k.h(cVar, b1.a(2)).c3();
                }
            }
            if ((b1.a(128) & i11) != 0 && (cVar instanceof a0) && i12 != 2) {
                k.m(cVar).F0();
            }
            if ((b1.a(256) & i11) != 0 && (cVar instanceof t) && i12 != 2) {
                k.m(cVar).G0();
            }
            if ((b1.a(4) & i11) != 0 && (cVar instanceof r)) {
                s.a((r) cVar);
            }
            if ((b1.a(8) & i11) != 0 && (cVar instanceof s1)) {
                t1.b((s1) cVar);
            }
            if ((b1.a(64) & i11) != 0 && (cVar instanceof m1)) {
                n1.a((m1) cVar);
            }
            if ((b1.a(1024) & i11) != 0 && (cVar instanceof FocusTargetNode) && i12 != 2) {
                i3.s.c((FocusTargetNode) cVar);
            }
            if ((b1.a(2048) & i11) != 0 && (cVar instanceof i3.j)) {
                i3.j jVar = (i3.j) cVar;
                if (k(jVar)) {
                    if (i12 == 2) {
                        j(jVar);
                    } else {
                        i3.k.a(jVar);
                    }
                }
            }
            if ((i11 & b1.a(4096)) == 0 || !(cVar instanceof i3.c)) {
                return;
            }
            i3.d.b((i3.c) cVar);
        }
    }

    public static final void d(androidx.compose.ui.d.c cVar) {
        if (!cVar.getIsAttached()) {
            y3.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(androidx.compose.ui.d.c cVar) {
        if (!cVar.getIsAttached()) {
            y3.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(androidx.compose.ui.d.b bVar) {
        int iA = b1.a(1);
        if (bVar instanceof z3.b0) {
            iA |= b1.a(2);
        }
        if (bVar instanceof h3.h) {
            iA |= b1.a(4);
        }
        if (bVar instanceof g4.n) {
            iA |= b1.a(8);
        }
        if (bVar instanceof v3.e0) {
            iA |= b1.a(16);
        }
        if ((bVar instanceof a4.d) || (bVar instanceof a4.j)) {
            iA |= b1.a(32);
        }
        if (bVar instanceof i3.b) {
            iA |= b1.a(4096);
        }
        if (bVar instanceof i3.h) {
            iA |= b1.a(2048);
        }
        if (bVar instanceof z3.p0) {
            iA |= b1.a(256);
        }
        if (bVar instanceof z3.t0) {
            iA |= b1.a(64);
        }
        return ((bVar instanceof z3.q0) || (bVar instanceof z3.r0)) ? b1.a(128) | iA : iA;
    }

    public static final int g(androidx.compose.ui.d.c cVar) {
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        androidx.collection.h0<Object> h0Var = f16041a;
        Object objB = d3.b.b(cVar);
        int iB = h0Var.b(objB);
        if (iB >= 0) {
            return h0Var.values[iB];
        }
        int iA = b1.a(1);
        if (cVar instanceof b0) {
            iA |= b1.a(2);
        }
        if (cVar instanceof r) {
            iA |= b1.a(4);
        }
        if (cVar instanceof s1) {
            iA |= b1.a(8);
        }
        if (cVar instanceof p1) {
            iA |= b1.a(16);
        }
        if (cVar instanceof a4.h) {
            iA |= b1.a(32);
        }
        if (cVar instanceof m1) {
            iA |= b1.a(64);
        }
        if (cVar instanceof a0) {
            iA |= b1.a(128);
        }
        if (cVar instanceof t) {
            iA |= b1.a(256);
        }
        if (cVar instanceof z3.e) {
            iA |= b1.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= b1.a(1024);
        }
        if (cVar instanceof i3.j) {
            iA |= b1.a(2048);
        }
        if (cVar instanceof i3.c) {
            iA |= b1.a(4096);
        }
        if (cVar instanceof t3.e) {
            iA |= b1.a(PKIFailureInfo.certRevoked);
        }
        if (cVar instanceof x3.a) {
            iA |= b1.a(16384);
        }
        if (cVar instanceof h) {
            iA |= b1.a(32768);
        }
        if (cVar instanceof t3.g) {
            iA |= b1.a(131072);
        }
        if (cVar instanceof x1) {
            iA |= b1.a(262144);
        }
        h0Var.s(objB, iA);
        return iA;
    }

    public static final int h(androidx.compose.ui.d.c cVar) {
        if (!(cVar instanceof m)) {
            return g(cVar);
        }
        m mVar = (m) cVar;
        int iZ2 = mVar.getSelfKindSet();
        for (androidx.compose.ui.d.c cVarY2 = mVar.getDelegate(); cVarY2 != null; cVarY2 = cVarY2.getChild()) {
            iZ2 |= h(cVarY2);
        }
        return iZ2;
    }

    public static final boolean i(int i11) {
        return (i11 & b1.a(128)) != 0;
    }

    private static final void j(i3.j jVar) {
        int iA = b1.a(1024);
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = jVar.getNode().getChild();
        if (child == null) {
            k.c(bVar, jVar.getNode());
        } else {
            bVar.b(child);
        }
        while (bVar.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar.v(bVar.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                k.c(bVar, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                i3.s.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.d.c cVarY2 = ((m) cVarG).getDelegate(); cVarY2 != null; cVarY2 = cVarY2.getChild()) {
                                    if ((cVarY2.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarY2;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.b(cVarY2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = k.g(bVar2);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
    }

    private static final boolean k(i3.j jVar) {
        e eVar = e.f16051a;
        eVar.b();
        jVar.y1(eVar);
        return eVar.a();
    }
}
