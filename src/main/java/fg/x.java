package fg;

/* JADX INFO: loaded from: classes3.dex */
class x {
    static cg.i a(gg.c cVar, tf.i iVar) {
        cVar.h();
        cg.i.a aVar = null;
        bg.h hVarK = null;
        bg.d dVarH = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            String strL = cVar.L();
            strL.getClass();
            switch (strL) {
                case "o":
                    dVarH = d.h(cVar, iVar);
                    break;
                case "pt":
                    hVarK = d.k(cVar, iVar);
                    break;
                case "inv":
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case "mode":
                    String strO = cVar.O();
                    strO.getClass();
                    switch (strO) {
                        case "a":
                            aVar = cg.i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = cg.i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = cg.i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = cg.i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            hg.e.c("Unknown mask mode " + strL + ". Defaulting to Add.");
                            aVar = cg.i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.F();
                    break;
            }
        }
        cVar.j();
        return new cg.i(aVar, hVarK, dVarH, zNextBoolean);
    }
}
