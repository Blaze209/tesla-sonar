package fg;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65892a = gg.c.a.a("nm", "p", "s", "hd", DateTokenConverter.CONVERTER_KEY);

    static cg.b a(gg.c cVar, tf.i iVar, int i11) {
        boolean z11 = i11 == 3;
        boolean zNextBoolean = false;
        String strO = null;
        bg.o<PointF, PointF> oVarB = null;
        bg.f fVarI = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65892a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iT == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iT == 3) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iT != 4) {
                cVar.B();
                cVar.F();
            } else {
                z11 = cVar.nextInt() == 3;
            }
        }
        return new cg.b(strO, oVarB, fVarI, z11, zNextBoolean);
    }
}
