package fg;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65893a = gg.c.a.a("nm", "r", "hd");

    static cg.n a(gg.c cVar, tf.i iVar) {
        boolean zNextBoolean = false;
        String strO = null;
        bg.b bVarF = null;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65893a);
            if (iT == 0) {
                strO = cVar.O();
            } else if (iT == 1) {
                bVarF = d.f(cVar, iVar, true);
            } else if (iT != 2) {
                cVar.F();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new cg.n(strO, bVarF);
    }
}
