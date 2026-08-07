package fg;

import android.graphics.Color;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65937a = gg.c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65938b = gg.c.a.a(DateTokenConverter.CONVERTER_KEY, "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final gg.c.a f65939c = gg.c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65940a;

        static {
            int[] iArr = new int[dg.e.b.values().length];
            f65940a = iArr;
            try {
                iArr[dg.e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65940a[dg.e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static dg.e a(gg.c cVar, tf.i iVar) {
        float f11;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(1.0f);
        dg.e.b bVar = dg.e.b.NONE;
        cg.h hVar = cg.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.h();
        boolean z11 = false;
        dg.e.b bVar2 = bVar;
        cg.h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f12 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strO = null;
        bg.j jVarD = null;
        bg.k kVarA = null;
        bg.b bVarF = null;
        cg.a aVarB = null;
        j jVarB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strO2 = "UNSET";
        String strO3 = null;
        bg.n nVar = null;
        dg.e.a aVar = null;
        boolean z12 = false;
        while (cVar.hasNext()) {
            switch (cVar.t(f65937a)) {
                case 0:
                    strO2 = cVar.O();
                    z11 = false;
                    break;
                case 1:
                    jNextInt = cVar.nextInt();
                    z11 = false;
                    break;
                case 2:
                    strO = cVar.O();
                    z11 = false;
                    break;
                case 3:
                    f11 = fNextDouble5;
                    int iNextInt3 = cVar.nextInt();
                    aVar = dg.e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = dg.e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 4:
                    jNextInt2 = cVar.nextInt();
                    z11 = false;
                    break;
                case 5:
                    iNextInt = (int) (cVar.nextInt() * hg.l.e());
                    z11 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (cVar.nextInt() * hg.l.e());
                    z11 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.O());
                    z11 = false;
                    break;
                case 8:
                    nVar = c.g(cVar, iVar);
                    z11 = false;
                    break;
                case 9:
                    f11 = fNextDouble5;
                    int iNextInt4 = cVar.nextInt();
                    if (iNextInt4 >= dg.e.b.values().length) {
                        iVar.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = dg.e.b.values()[iNextInt4];
                        int i11 = a.f65940a[bVar2.ordinal()];
                        if (i11 == 1) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.s(1);
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = fNextDouble5;
                    cVar.f();
                    while (cVar.hasNext()) {
                        arrayList.add(x.a(cVar, iVar));
                    }
                    iVar.s(arrayList.size());
                    cVar.e();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 11:
                    f11 = fNextDouble5;
                    cVar.f();
                    while (cVar.hasNext()) {
                        cg.c cVarA = h.a(cVar, iVar);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    cVar.e();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 12:
                    f11 = fNextDouble5;
                    cVar.h();
                    while (cVar.hasNext()) {
                        int iT = cVar.t(f65938b);
                        if (iT == 0) {
                            jVarD = d.d(cVar, iVar);
                        } else if (iT != 1) {
                            cVar.B();
                            cVar.F();
                        } else {
                            cVar.f();
                            if (cVar.hasNext()) {
                                kVarA = b.a(cVar, iVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.F();
                            }
                            cVar.e();
                        }
                    }
                    cVar.j();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 13:
                    f11 = fNextDouble5;
                    cVar.f();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.h();
                        while (cVar.hasNext()) {
                            int iT2 = cVar.t(f65939c);
                            if (iT2 == 0) {
                                int iNextInt5 = cVar.nextInt();
                                if (iNextInt5 == 29) {
                                    aVarB = e.b(cVar, iVar);
                                } else if (iNextInt5 == 25) {
                                    jVarB = new k().b(cVar, iVar);
                                }
                            } else if (iT2 != 1) {
                                cVar.B();
                                cVar.F();
                            } else {
                                arrayList3.add(cVar.O());
                            }
                        }
                        cVar.j();
                    }
                    cVar.e();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 14:
                    fNextDouble5 = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 15:
                    fNextDouble4 = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 16:
                    f11 = fNextDouble5;
                    fNextDouble2 = (float) (cVar.nextDouble() * ((double) hg.l.e()));
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 17:
                    f11 = fNextDouble5;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) hg.l.e()));
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 18:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 19:
                    f12 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVarF = d.f(cVar, iVar, z11);
                    break;
                case 21:
                    strO3 = cVar.O();
                    break;
                case 22:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 23:
                    z12 = cVar.nextInt() != 1 ? z11 : true;
                    break;
                case 24:
                    int iNextInt6 = cVar.nextInt();
                    if (iNextInt6 < cg.h.values().length) {
                        hVar2 = cg.h.values()[iNextInt6];
                    } else {
                        iVar.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = cg.h.NORMAL;
                    }
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    f11 = fNextDouble5;
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
            }
        }
        float f13 = fNextDouble5;
        cVar.j();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > BitmapDescriptorFactory.HUE_RED) {
            arrayList4.add(new ig.a(iVar, fValueOf, fValueOf, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(fNextDouble)));
        }
        if (f12 <= BitmapDescriptorFactory.HUE_RED) {
            f12 = iVar.f();
        }
        arrayList4.add(new ig.a(iVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f12)));
        arrayList4.add(new ig.a(iVar, fValueOf, fValueOf, null, f12, Float.valueOf(Float.MAX_VALUE)));
        if (strO2.endsWith(".ai") || "ai".equals(strO3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z12 != 0) {
            if (nVar == null) {
                nVar = new bg.n();
            }
            nVar.m(z12);
        }
        return new dg.e(arrayList2, iVar, strO2, jNextInt, aVar, jNextInt2, strO, arrayList, nVar, iNextInt, iNextInt2, color, f13, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, bVarF, zNextBoolean, aVarB, jVarB, hVar2);
    }

    public static dg.e b(tf.i iVar) {
        Rect rectB = iVar.b();
        List list = Collections.EMPTY_LIST;
        return new dg.e(list, iVar, "__container", -1L, dg.e.a.PRE_COMP, -1L, null, list, new bg.n(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectB.width(), rectB.height(), null, null, list, dg.e.b.NONE, null, false, null, null, cg.h.NORMAL);
    }
}
