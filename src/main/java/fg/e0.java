package fg;

/* JADX INFO: loaded from: classes3.dex */
class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65891a = gg.c.a.a("nm", "c", "o", "tr", "hd");

    static cg.m a(gg.c cVar, tf.i iVar) {
        String strO = null;
        bg.b bVarF = null;
        bg.b bVarF2 = null;
        bg.n nVarG = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65891a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iT == 2) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iT == 3) {
                nVarG = c.g(cVar, iVar);
            } else if (iT != 4) {
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new cg.m(strO, bVarF, bVarF2, nVarG, zNextBoolean);
    }
}
