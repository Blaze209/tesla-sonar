package fg;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65917a = gg.c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65918b = gg.c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    static cg.s a(gg.c cVar, tf.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strO = null;
        cg.s.a aVar = null;
        cg.s.b bVar = null;
        Object obj = null;
        bg.a aVarC = null;
        bg.b bVarE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        bg.d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar.t(f65917a)) {
                case 0:
                    strO = cVar.O();
                    break;
                case 1:
                    aVarC = d.c(cVar, iVar);
                    break;
                case 2:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 3:
                    dVar = d.h(cVar, iVar);
                    break;
                case 4:
                    aVar = cg.s.a.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    bVar = cg.s.b.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 7:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 8:
                    cVar.f();
                    while (cVar.hasNext()) {
                        cVar.h();
                        String strO2 = str;
                        Object objE = strO2;
                        while (cVar.hasNext()) {
                            int iT = cVar.t(f65918b);
                            if (iT == 0) {
                                strO2 = cVar.O();
                            } else if (iT != 1) {
                                cVar.B();
                                cVar.F();
                            } else {
                                objE = d.e(cVar, iVar);
                            }
                        }
                        cVar.j();
                        strO2.getClass();
                        switch (strO2) {
                            case "d":
                            case "g":
                                iVar.v(true);
                                arrayList.add(objE);
                                break;
                            case "o":
                                obj = objE;
                                break;
                        }
                        str = null;
                    }
                    cVar.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((bg.b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.F();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new bg.d(Collections.singletonList(new ig.a(100)));
        }
        if (aVar == null) {
            aVar = cg.s.a.BUTT;
        }
        if (bVar == null) {
            bVar = cg.s.b.MITER;
        }
        return new cg.s(strO, obj, arrayList, aVarC, dVar, bVarE, aVar, bVar, fNextDouble, zNextBoolean);
    }
}
