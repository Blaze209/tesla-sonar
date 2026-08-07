package fg;

/* JADX INFO: loaded from: classes3.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65921a = gg.c.a.a("s", "e", "o", "nm", "m", "hd");

    static cg.t a(gg.c cVar, tf.i iVar) {
        String strO = null;
        cg.t.a aVarForId = null;
        bg.b bVarF = null;
        bg.b bVarF2 = null;
        bg.b bVarF3 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65921a);
            if (iT == 0) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iT == 1) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iT == 2) {
                bVarF3 = d.f(cVar, iVar, false);
            } else if (iT == 3) {
                strO = cVar.O();
            } else if (iT == 4) {
                aVarForId = cg.t.a.forId(cVar.nextInt());
            } else if (iT != 5) {
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new cg.t(strO, aVarForId, bVarF, bVarF2, bVarF3, zNextBoolean);
    }
}
