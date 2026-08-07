package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.g3;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\t*\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000e\u001a\u00020\r*\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u0006¢\u0006\u0004\b \u0010!\u001a\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u0001H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002¢\u0006\u0004\b%\u0010&\"\u0018\u0010)\u001a\u00020\t*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lt2/b;", "Landroidx/compose/ui/d$c;", "node", "Ljn0/h0;", "c", "(Lt2/b;Landroidx/compose/ui/d$c;)V", "Lb4/j;", "Lb4/b1;", "type", "", "e", "(Lb4/j;I)Z", "kind", "Lb4/z0;", "h", "(Lb4/j;I)Lb4/z0;", "Lb4/g0;", "m", "(Lb4/j;)Lb4/g0;", "Lb4/j1;", "n", "(Lb4/j;)Lb4/j1;", "Lw4/d;", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/j;)Lw4/d;", "Lk3/g3;", "j", "(Lb4/j;)Lk3/g3;", "Lw4/t;", "l", "(Lb4/j;)Lw4/t;", "Lz3/v;", "k", "(Lb4/j;)Lz3/v;", "Lb4/b0;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d$c;)Lb4/b0;", "g", "(Lt2/b;)Landroidx/compose/ui/d$c;", "f", "(Lb4/j;)Z", "isDelegationRoot", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(t2.b<androidx.compose.ui.d.c> bVar, androidx.compose.ui.d.c cVar) {
        t2.b<g0> bVarW0 = m(cVar).w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            int i11 = iN - 1;
            g0[] g0VarArrM = bVarW0.m();
            do {
                bVar.b(g0VarArrM[i11].getNodes().getHead());
                i11--;
            } while (i11 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b0 d(androidx.compose.ui.d.c cVar) {
        if ((b1.a(2) & cVar.getKindSet()) != 0) {
            if (cVar instanceof b0) {
                return (b0) cVar;
            }
            if (cVar instanceof m) {
                androidx.compose.ui.d.c cVarY2 = ((m) cVar).getDelegate();
                while (cVarY2 != 0) {
                    if (cVarY2 instanceof b0) {
                        return (b0) cVarY2;
                    }
                    cVarY2 = (!(cVarY2 instanceof m) || (b1.a(2) & cVarY2.getKindSet()) == 0) ? cVarY2.getChild() : ((m) cVarY2).getDelegate();
                }
            }
        }
        return null;
    }

    public static final boolean e(j jVar, int i11) {
        return (jVar.getNode().getAggregateChildKindSet() & i11) != 0;
    }

    public static final boolean f(j jVar) {
        return jVar.getNode() == jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d.c g(t2.b<androidx.compose.ui.d.c> bVar) {
        if (bVar == null || bVar.p()) {
            return null;
        }
        return bVar.v(bVar.getSize() - 1);
    }

    public static final z0 h(j jVar, int i11) {
        z0 coordinator = jVar.getNode().getCoordinator();
        p013kotlin.jvm.internal.s.h(coordinator);
        if (coordinator.H2() != jVar || !c1.i(i11)) {
            return coordinator;
        }
        z0 z0VarI2 = coordinator.getWrapped();
        p013kotlin.jvm.internal.s.h(z0VarI2);
        return z0VarI2;
    }

    public static final w4.d i(j jVar) {
        return m(jVar).getDensity();
    }

    public static final g3 j(j jVar) {
        return n(jVar).getGraphicsContext();
    }

    public static final z3.v k(j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            y3.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        z3.v vVarT1 = h(jVar, b1.a(2)).t1();
        if (!vVarT1.b0()) {
            y3.a.b("LayoutCoordinates is not attached.");
        }
        return vVarT1;
    }

    public static final w4.t l(j jVar) {
        return m(jVar).getLayoutDirection();
    }

    public static final g0 m(j jVar) {
        z0 coordinator = jVar.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        y3.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final j1 n(j jVar) {
        j1 owner = m(jVar).getOwner();
        if (owner != null) {
            return owner;
        }
        y3.a.c("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }
}
