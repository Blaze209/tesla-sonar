package fg;

import android.graphics.Rect;
import androidx.collection.y0;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65941a = gg.c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", OrcaFlavourKeys.FONTS, "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static gg.c.a f65942b = gg.c.a.a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final gg.c.a f65943c = gg.c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final gg.c.a f65944d = gg.c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static tf.i a(gg.c cVar) {
        cVar = cVar;
        float fE = hg.l.e();
        androidx.collection.v<dg.e> vVar = new androidx.collection.v<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        y0<ag.d> y0Var = new y0<>();
        tf.i iVar = new tf.i();
        cVar.h();
        float fNextDouble = BitmapDescriptorFactory.HUE_RED;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        while (cVar.hasNext()) {
            switch (cVar.t(f65941a)) {
                case 0:
                    iNextDouble2 = (int) cVar.nextDouble();
                    fE = fE;
                    break;
                case 1:
                    iNextDouble = (int) cVar.nextDouble();
                    fE = fE;
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 3:
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    fE = fE;
                    break;
                case 4:
                    fNextDouble3 = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 5:
                    String[] strArrSplit = cVar.O().split("\\.");
                    if (!hg.l.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    e(cVar, iVar, arrayList, vVar);
                    break;
                case 7:
                    b(cVar, iVar, map, map2);
                    break;
                case 8:
                    d(cVar, map3);
                    break;
                case 9:
                    c(cVar, iVar, y0Var);
                    break;
                case 10:
                    f(cVar, arrayList2);
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    break;
            }
        }
        float f11 = fE;
        iVar.t(new Rect(0, 0, (int) (iNextDouble2 * f11), (int) (iNextDouble * f11)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, vVar, map, map2, hg.l.e(), y0Var, map3, arrayList2, iNextDouble2, iNextDouble);
        return iVar;
    }

    private static void b(gg.c cVar, tf.i iVar, Map<String, List<dg.e>> map, Map<String, tf.z> map2) {
        cVar.f();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.v vVar = new androidx.collection.v();
            cVar.h();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            while (cVar.hasNext()) {
                int iT = cVar.t(f65942b);
                if (iT == 0) {
                    strO = cVar.O();
                } else if (iT == 1) {
                    cVar.f();
                    while (cVar.hasNext()) {
                        dg.e eVarA = v.a(cVar, iVar);
                        vVar.h(eVarA.e(), eVarA);
                        arrayList.add(eVarA);
                    }
                    cVar.e();
                } else if (iT == 2) {
                    iNextInt = cVar.nextInt();
                } else if (iT == 3) {
                    iNextInt2 = cVar.nextInt();
                } else if (iT == 4) {
                    strO2 = cVar.O();
                } else if (iT != 5) {
                    cVar.B();
                    cVar.F();
                } else {
                    strO3 = cVar.O();
                }
            }
            cVar.j();
            if (strO2 != null) {
                tf.z zVar = new tf.z(iNextInt, iNextInt2, strO, strO2, strO3);
                map2.put(zVar.e(), zVar);
            } else {
                map.put(strO, arrayList);
            }
        }
        cVar.e();
    }

    private static void c(gg.c cVar, tf.i iVar, y0<ag.d> y0Var) {
        cVar.f();
        while (cVar.hasNext()) {
            ag.d dVarA = m.a(cVar, iVar);
            y0Var.i(dVarA.hashCode(), dVarA);
        }
        cVar.e();
    }

    private static void d(gg.c cVar, Map<String, ag.c> map) {
        cVar.h();
        while (cVar.hasNext()) {
            if (cVar.t(f65943c) != 0) {
                cVar.B();
                cVar.F();
            } else {
                cVar.f();
                while (cVar.hasNext()) {
                    ag.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.e();
            }
        }
        cVar.j();
    }

    private static void e(gg.c cVar, tf.i iVar, List<dg.e> list, androidx.collection.v<dg.e> vVar) {
        cVar.f();
        int i11 = 0;
        while (cVar.hasNext()) {
            dg.e eVarA = v.a(cVar, iVar);
            if (eVarA.g() == dg.e.a.IMAGE) {
                i11++;
            }
            list.add(eVarA);
            vVar.h(eVarA.e(), eVarA);
            if (i11 > 4) {
                hg.e.c("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.e();
    }

    private static void f(gg.c cVar, List<ag.h> list) {
        cVar.f();
        while (cVar.hasNext()) {
            cVar.h();
            float fNextDouble = BitmapDescriptorFactory.HUE_RED;
            String strO = null;
            float fNextDouble2 = 0.0f;
            while (cVar.hasNext()) {
                int iT = cVar.t(f65944d);
                if (iT == 0) {
                    strO = cVar.O();
                } else if (iT == 1) {
                    fNextDouble = (float) cVar.nextDouble();
                } else if (iT != 2) {
                    cVar.B();
                    cVar.F();
                } else {
                    fNextDouble2 = (float) cVar.nextDouble();
                }
            }
            cVar.j();
            list.add(new ag.h(strO, fNextDouble, fNextDouble2));
        }
        cVar.e();
    }
}
