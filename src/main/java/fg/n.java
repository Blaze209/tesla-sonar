package fg;

/* JADX INFO: loaded from: classes3.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65922a = gg.c.a.a("fFamily", "fName", "fStyle", "ascent");

    static ag.c a(gg.c cVar) {
        cVar.h();
        String strO = null;
        String strO2 = null;
        float fNextDouble = 0.0f;
        String strO3 = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65922a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                strO3 = cVar.O();
            } else if (iT == 2) {
                strO2 = cVar.O();
            } else if (iT != 3) {
                cVar.B();
                cVar.F();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.j();
        return new ag.c(strO, strO3, strO2, fNextDouble);
    }
}
