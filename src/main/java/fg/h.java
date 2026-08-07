package fg;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;

/* JADX INFO: loaded from: classes3.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65896a = gg.c.a.a("ty", DateTokenConverter.CONVERTER_KEY);

    static cg.c a(gg.c cVar, tf.i iVar) {
        cg.c cVarA;
        String strO;
        cVar.h();
        byte b11 = 2;
        int iNextInt = 2;
        while (true) {
            cVarA = null;
            if (!cVar.hasNext()) {
                strO = null;
                break;
            }
            int iT = cVar.t(f65896a);
            if (iT == 0) {
                strO = cVar.O();
                break;
            }
            if (iT != 1) {
                cVar.B();
                cVar.F();
            } else {
                iNextInt = cVar.nextInt();
            }
        }
        if (strO == null) {
            return null;
        }
        switch (strO.hashCode()) {
            case 3239:
                b11 = !strO.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b11 = !strO.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strO.equals("gf")) {
                    b11 = -1;
                }
                break;
            case 3307:
                b11 = !strO.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b11 = !strO.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b11 = !strO.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b11 = !strO.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b11 = !strO.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b11 = !strO.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b11 = !strO.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b11 = !strO.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b11 = !strO.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b11 = !strO.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b11 = !strO.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                cVarA = f.a(cVar, iVar, iNextInt);
                break;
            case 1:
                cVarA = i0.a(cVar, iVar);
                break;
            case 2:
                cVarA = p.a(cVar, iVar);
                break;
            case 3:
                cVarA = j0.a(cVar, iVar);
                break;
            case 4:
                cVarA = q.a(cVar, iVar);
                break;
            case 5:
                cVarA = y.a(cVar);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = d0.a(cVar, iVar);
                break;
            case 7:
                cVarA = f0.a(cVar, iVar);
                break;
            case 8:
                cVarA = e0.a(cVar, iVar);
                break;
            case 9:
                cVarA = k0.a(cVar, iVar);
                break;
            case 10:
                cVarA = c0.a(cVar, iVar, iNextInt);
                break;
            case 11:
                cVarA = l0.a(cVar, iVar);
                break;
            case 12:
                cVarA = m0.a(cVar, iVar);
                break;
            case 13:
                cVarA = c.g(cVar, iVar);
                break;
            default:
                hg.e.c("Unknown shape type " + strO);
                break;
        }
        while (cVar.hasNext()) {
            cVar.F();
        }
        cVar.j();
        return cVarA;
    }
}
