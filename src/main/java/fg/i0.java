package fg;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65901a = gg.c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static cg.p a(gg.c cVar, tf.i iVar) {
        bg.d dVar = null;
        String strO = null;
        bg.a aVarC = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65901a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                aVarC = d.c(cVar, iVar);
            } else if (iT == 2) {
                dVar = d.h(cVar, iVar);
            } else if (iT == 3) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iT == 4) {
                iNextInt = cVar.nextInt();
            } else if (iT != 5) {
                cVar.B();
                cVar.F();
            } else {
                zNextBoolean2 = cVar.nextBoolean();
            }
        }
        if (dVar == null) {
            dVar = new bg.d(Collections.singletonList(new ig.a(100)));
        }
        return new cg.p(strO, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zNextBoolean2);
    }
}
