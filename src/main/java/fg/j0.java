package fg;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65907a = gg.c.a.a("nm", "hd", "it");

    static cg.q a(gg.c cVar, tf.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strO = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65907a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iT != 2) {
                cVar.F();
            } else {
                cVar.f();
                while (cVar.hasNext()) {
                    cg.c cVarA = h.a(cVar, iVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.e();
            }
        }
        return new cg.q(strO, arrayList, zNextBoolean);
    }
}
