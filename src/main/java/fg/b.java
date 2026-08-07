package fg;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65881a = gg.c.a.a("s", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65882b = gg.c.a.a("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final gg.c.a f65883c = gg.c.a.a("fc", "sc", "sw", "t", "o");

    public static bg.k a(gg.c cVar, tf.i iVar) {
        cVar.h();
        bg.m mVarC = null;
        bg.l lVarB = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65881a);
            if (iT == 0) {
                lVarB = b(cVar, iVar);
            } else if (iT != 1) {
                cVar.B();
                cVar.F();
            } else {
                mVarC = c(cVar, iVar);
            }
        }
        cVar.j();
        return new bg.k(mVarC, lVarB);
    }

    private static bg.l b(gg.c cVar, tf.i iVar) {
        cVar.h();
        bg.d dVar = null;
        bg.d dVarH = null;
        bg.d dVarH2 = null;
        cg.u uVar = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65882b);
            if (iT == 0) {
                dVar = d.h(cVar, iVar);
            } else if (iT == 1) {
                dVarH = d.h(cVar, iVar);
            } else if (iT == 2) {
                dVarH2 = d.h(cVar, iVar);
            } else if (iT != 3) {
                cVar.B();
                cVar.F();
            } else {
                int iNextInt = cVar.nextInt();
                if (iNextInt == 1 || iNextInt == 2) {
                    uVar = iNextInt == 1 ? cg.u.PERCENT : cg.u.INDEX;
                } else {
                    iVar.a("Unsupported text range units: " + iNextInt);
                    uVar = cg.u.INDEX;
                }
            }
        }
        cVar.j();
        if (dVar == null && dVarH != null) {
            dVar = new bg.d(Collections.singletonList(new ig.a(0)));
        }
        return new bg.l(dVar, dVarH, dVarH2, uVar);
    }

    private static bg.m c(gg.c cVar, tf.i iVar) {
        cVar.h();
        bg.a aVarC = null;
        bg.a aVarC2 = null;
        bg.b bVarE = null;
        bg.b bVarE2 = null;
        bg.d dVarH = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65883c);
            if (iT == 0) {
                aVarC = d.c(cVar, iVar);
            } else if (iT == 1) {
                aVarC2 = d.c(cVar, iVar);
            } else if (iT == 2) {
                bVarE = d.e(cVar, iVar);
            } else if (iT == 3) {
                bVarE2 = d.e(cVar, iVar);
            } else if (iT != 4) {
                cVar.B();
                cVar.F();
            } else {
                dVarH = d.h(cVar, iVar);
            }
        }
        cVar.j();
        return new bg.m(aVarC, aVarC2, bVarE, bVarE2, dVarH);
    }
}
