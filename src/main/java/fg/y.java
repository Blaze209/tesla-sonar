package fg;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65945a = gg.c.a.a("nm", "mm", "hd");

    static cg.j a(gg.c cVar) {
        String strO = null;
        boolean zNextBoolean = false;
        cg.j.a aVarForId = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65945a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                aVarForId = cg.j.a.forId(cVar.nextInt());
            } else if (iT != 2) {
                cVar.B();
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new cg.j(strO, aVarForId, zNextBoolean);
    }
}
