package fg;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65924a = gg.c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65925b = gg.c.a.a("p", "k");

    static cg.e a(gg.c cVar, tf.i iVar) {
        bg.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strO = null;
        cg.g gVar = null;
        bg.c cVarG = null;
        bg.f fVarI = null;
        bg.f fVarI2 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            switch (cVar.t(f65924a)) {
                case 0:
                    strO = cVar.O();
                    break;
                case 1:
                    cVar.h();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iT = cVar.t(f65925b);
                        if (iT == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iT != 1) {
                            cVar.B();
                            cVar.F();
                        } else {
                            cVarG = d.g(cVar, iVar, iNextInt);
                        }
                    }
                    cVar.j();
                    break;
                case 2:
                    dVar = d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? cg.g.LINEAR : cg.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new bg.d(Collections.singletonList(new ig.a(100)));
        }
        return new cg.e(strO, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zNextBoolean);
    }
}
