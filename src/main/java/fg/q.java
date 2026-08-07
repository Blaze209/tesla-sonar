package fg;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65926a = gg.c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65927b = gg.c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final gg.c.a f65928c = gg.c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    static cg.f a(gg.c cVar, tf.i iVar) {
        bg.d dVar;
        ArrayList arrayList = new ArrayList();
        cg.g gVar = null;
        String strO = null;
        bg.c cVarG = null;
        bg.f fVarI = null;
        bg.f fVarI2 = null;
        bg.b bVarE = null;
        cg.s.a aVar = null;
        cg.s.b bVar = null;
        bg.b bVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        bg.d dVarH = null;
        while (cVar.hasNext()) {
            cg.g gVar2 = gVar;
            switch (cVar.t(f65926a)) {
                case 0:
                    strO = cVar.O();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
                    cVar.h();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iT = cVar.t(f65927b);
                        if (iT == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iT != 1) {
                            cVar.B();
                            cVar.F();
                        } else {
                            cVarG = d.g(cVar, iVar, iNextInt);
                        }
                    }
                    cVar.j();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.nextInt() == 1 ? cg.g.LINEAR : cg.g.RADIAL;
                    dVarH = dVar;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 6:
                    bVarE = d.e(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVarH;
                    aVar = cg.s.a.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    bVar = cg.s.b.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 9:
                    dVar = dVarH;
                    fNextDouble = (float) cVar.nextDouble();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 10:
                    zNextBoolean = cVar.nextBoolean();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.f();
                    while (cVar.hasNext()) {
                        cVar.h();
                        String strO2 = null;
                        bg.b bVarE2 = null;
                        while (cVar.hasNext()) {
                            int iT2 = cVar.t(f65928c);
                            if (iT2 != 0) {
                                bg.d dVar2 = dVarH;
                                if (iT2 != 1) {
                                    cVar.B();
                                    cVar.F();
                                } else {
                                    bVarE2 = d.e(cVar, iVar);
                                }
                                dVarH = dVar2;
                            } else {
                                strO2 = cVar.O();
                            }
                        }
                        bg.d dVar3 = dVarH;
                        cVar.j();
                        if (strO2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strO2.equals(DateTokenConverter.CONVERTER_KEY) || strO2.equals("g")) {
                                iVar.v(true);
                                arrayList.add(bVarE2);
                            }
                            dVarH = dVar3;
                        }
                        dVarH = dVar3;
                    }
                    dVar = dVarH;
                    cVar.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((bg.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    gVar = gVar2;
                    break;
            }
        }
        bg.d dVar4 = dVarH;
        return new cg.f(strO, gVar, cVarG, dVar4 == null ? new bg.d(Collections.singletonList(new ig.a(100))) : dVar4, fVarI, fVarI2, bVarE, aVar, bVar, fNextDouble, arrayList, bVar2, zNextBoolean);
    }
}
