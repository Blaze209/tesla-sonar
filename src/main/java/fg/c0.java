package fg;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;

/* JADX INFO: loaded from: classes3.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65887a = gg.c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", DateTokenConverter.CONVERTER_KEY);

    static cg.k a(gg.c cVar, tf.i iVar, int i11) {
        boolean zNextBoolean = false;
        boolean z11 = i11 == 3;
        String strO = null;
        cg.k.a aVarForValue = null;
        bg.b bVarF = null;
        bg.o<PointF, PointF> oVarB = null;
        bg.b bVarF2 = null;
        bg.b bVarE = null;
        bg.b bVarE2 = null;
        bg.b bVarF3 = null;
        bg.b bVarF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.t(f65887a)) {
                case 0:
                    strO = cVar.O();
                    break;
                case 1:
                    aVarForValue = cg.k.a.forValue(cVar.nextInt());
                    break;
                case 2:
                    bVarF = d.f(cVar, iVar, false);
                    break;
                case 3:
                    oVarB = a.b(cVar, iVar);
                    break;
                case 4:
                    bVarF2 = d.f(cVar, iVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, iVar, false);
                    break;
                case 7:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 8:
                    bVarF3 = d.f(cVar, iVar, false);
                    break;
                case 9:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 10:
                    z11 = cVar.nextInt() == 3;
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    break;
            }
        }
        return new cg.k(strO, aVarForValue, bVarF, oVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zNextBoolean, z11);
    }
}
