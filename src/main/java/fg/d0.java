package fg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65888a = gg.c.a.a("nm", "p", "s", "r", "hd");

    static cg.l a(gg.c cVar, tf.i iVar) {
        String strO = null;
        bg.o<PointF, PointF> oVarB = null;
        bg.f fVarI = null;
        bg.b bVarE = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65888a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iT == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iT == 3) {
                bVarE = d.e(cVar, iVar);
            } else if (iT != 4) {
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new cg.l(strO, oVarB, fVarI, bVarE, zNextBoolean);
    }
}
