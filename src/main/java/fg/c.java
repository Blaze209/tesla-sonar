package fg;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65885a = gg.c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65886b = gg.c.a.a("k");

    private static boolean a(bg.e eVar) {
        if (eVar != null) {
            return eVar.isStatic() && eVar.b().get(0).f77657b.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    private static boolean b(bg.o<PointF, PointF> oVar) {
        if (oVar != null) {
            return !(oVar instanceof bg.i) && oVar.isStatic() && oVar.b().get(0).f77657b.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(bg.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((ig.a) bVar.b().get(0)).f77657b).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(bg.g gVar) {
        if (gVar != null) {
            return gVar.isStatic() && ((ig.d) ((ig.a) gVar.b().get(0)).f77657b).a(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(bg.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((ig.a) bVar.b().get(0)).f77657b).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(bg.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((ig.a) bVar.b().get(0)).f77657b).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    public static bg.n g(gg.c cVar, tf.i iVar) {
        bg.b bVarF;
        tf.i iVar2 = iVar;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        boolean z11 = cVar.o() == gg.c.b.BEGIN_OBJECT;
        if (z11) {
            cVar.h();
        }
        bg.b bVar = null;
        bg.e eVarA = null;
        bg.o<PointF, PointF> oVarB = null;
        bg.g gVarJ = null;
        bg.b bVarF2 = null;
        bg.b bVarF3 = null;
        bg.d dVarH = null;
        bg.b bVarF4 = null;
        bg.b bVarF5 = null;
        while (cVar.hasNext()) {
            switch (cVar.t(f65885a)) {
                case 0:
                    cVar.h();
                    while (cVar.hasNext()) {
                        if (cVar.t(f65886b) != 0) {
                            cVar.B();
                            cVar.F();
                        } else {
                            eVarA = a.a(cVar, iVar);
                        }
                    }
                    cVar.j();
                    iVar2 = iVar;
                    break;
                case 1:
                    oVarB = a.b(cVar, iVar);
                    iVar2 = iVar;
                    break;
                case 2:
                    gVarJ = d.j(cVar, iVar);
                    iVar2 = iVar;
                    break;
                case 3:
                    iVar2.a("Lottie doesn't support 3D layers.");
                    bVarF = d.f(cVar, iVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new ig.a(iVar2, fValueOf, fValueOf, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(iVar2.f())));
                    } else if (((ig.a) bVarF.b().get(0)).f77657b == 0) {
                        bVarF.b().set(0, new ig.a(iVar, fValueOf, fValueOf, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(iVar.f())));
                    }
                    iVar2 = iVar;
                    bVar = bVarF;
                    break;
                case 4:
                    bVarF = d.f(cVar, iVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new ig.a(iVar2, fValueOf, fValueOf, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(iVar2.f())));
                    } else if (((ig.a) bVarF.b().get(0)).f77657b == 0) {
                        bVarF.b().set(0, new ig.a(iVar, fValueOf, fValueOf, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(iVar.f())));
                    }
                    iVar2 = iVar;
                    bVar = bVarF;
                    break;
                case 5:
                    dVarH = d.h(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, iVar2, false);
                    break;
                case 7:
                    bVarF5 = d.f(cVar, iVar2, false);
                    break;
                case 8:
                    bVarF2 = d.f(cVar, iVar2, false);
                    break;
                case 9:
                    bVarF3 = d.f(cVar, iVar2, false);
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    break;
            }
        }
        if (z11) {
            cVar.j();
        }
        bg.e eVar = a(eVarA) ? null : eVarA;
        if (b(oVarB)) {
            oVarB = null;
        }
        return new bg.n(eVar, oVarB, d(gVarJ) ? null : gVarJ, c(bVar) ? null : bVar, dVarH, bVarF4, bVarF5, f(bVarF2) ? null : bVarF2, e(bVarF3) ? null : bVarF3);
    }
}
