package fg;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65919a = gg.c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65920b = gg.c.a.a("shapes");

    static ag.d a(gg.c cVar, tf.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.h();
        double dNextDouble = 0.0d;
        String strO = null;
        String strO2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65919a);
            if (iT == 0) {
                cCharAt = cVar.O().charAt(0);
            } else if (iT == 1) {
                dNextDouble2 = cVar.nextDouble();
            } else if (iT == 2) {
                dNextDouble = cVar.nextDouble();
            } else if (iT == 3) {
                strO = cVar.O();
            } else if (iT == 4) {
                strO2 = cVar.O();
            } else if (iT != 5) {
                cVar.B();
                cVar.F();
            } else {
                cVar.h();
                while (cVar.hasNext()) {
                    if (cVar.t(f65920b) != 0) {
                        cVar.B();
                        cVar.F();
                    } else {
                        cVar.f();
                        while (cVar.hasNext()) {
                            arrayList.add((cg.q) h.a(cVar, iVar));
                        }
                        cVar.e();
                    }
                }
                cVar.j();
            }
        }
        cVar.j();
        return new ag.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strO, strO2);
    }
}
