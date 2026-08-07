package fg;

/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static gg.c.a f65915a = gg.c.a.a("nm", "ind", "ks", "hd");

    static cg.r a(gg.c cVar, tf.i iVar) {
        String strO = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        bg.h hVarK = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65915a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                iNextInt = cVar.nextInt();
            } else if (iT == 2) {
                hVarK = d.k(cVar, iVar);
            } else if (iT != 3) {
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new cg.r(strO, iNextInt, hVarK, zNextBoolean);
    }
}
