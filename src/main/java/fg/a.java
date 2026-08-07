package fg;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65879a = gg.c.a.a("k", "x", "y");

    public static bg.e a(gg.c cVar, tf.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == gg.c.b.BEGIN_ARRAY) {
            cVar.f();
            while (cVar.hasNext()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.e();
            u.b(arrayList);
        } else {
            arrayList.add(new ig.a(s.e(cVar, hg.l.e())));
        }
        return new bg.e(arrayList);
    }

    static bg.o<PointF, PointF> b(gg.c cVar, tf.i iVar) {
        cVar.h();
        bg.e eVarA = null;
        bg.b bVarE = null;
        boolean z11 = false;
        bg.b bVarE2 = null;
        while (cVar.o() != gg.c.b.END_OBJECT) {
            int iT = cVar.t(f65879a);
            if (iT == 0) {
                eVarA = a(cVar, iVar);
            } else if (iT != 1) {
                if (iT != 2) {
                    cVar.B();
                    cVar.F();
                } else if (cVar.o() == gg.c.b.STRING) {
                    cVar.F();
                    z11 = true;
                } else {
                    bVarE = d.e(cVar, iVar);
                }
            } else if (cVar.o() == gg.c.b.STRING) {
                cVar.F();
                z11 = true;
            } else {
                bVarE2 = d.e(cVar, iVar);
            }
        }
        cVar.j();
        if (z11) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new bg.i(bVarE2, bVarE);
    }
}
