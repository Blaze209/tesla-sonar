package fg;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65930a = gg.c.a.a("x", "y");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65931a;

        static {
            int[] iArr = new int[gg.c.b.values().length];
            f65931a = iArr;
            try {
                iArr[gg.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65931a[gg.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65931a[gg.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(gg.c cVar, float f11) {
        cVar.f();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.o() != gg.c.b.END_ARRAY) {
            cVar.F();
        }
        cVar.e();
        return new PointF(fNextDouble * f11, fNextDouble2 * f11);
    }

    private static PointF b(gg.c cVar, float f11) {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.F();
        }
        return new PointF(fNextDouble * f11, fNextDouble2 * f11);
    }

    private static PointF c(gg.c cVar, float f11) {
        cVar.h();
        float fG = BitmapDescriptorFactory.HUE_RED;
        float fG2 = 0.0f;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65930a);
            if (iT == 0) {
                fG = g(cVar);
            } else if (iT != 1) {
                cVar.B();
                cVar.F();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.j();
        return new PointF(fG * f11, fG2 * f11);
    }

    static int d(gg.c cVar) {
        cVar.f();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.F();
        }
        cVar.e();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(gg.c cVar, float f11) {
        int i11 = a.f65931a[cVar.o().ordinal()];
        if (i11 == 1) {
            return b(cVar, f11);
        }
        if (i11 == 2) {
            return a(cVar, f11);
        }
        if (i11 == 3) {
            return c(cVar, f11);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.o());
    }

    static List<PointF> f(gg.c cVar, float f11) {
        ArrayList arrayList = new ArrayList();
        cVar.f();
        while (cVar.o() == gg.c.b.BEGIN_ARRAY) {
            cVar.f();
            arrayList.add(e(cVar, f11));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    static float g(gg.c cVar) {
        gg.c.b bVarO = cVar.o();
        int i11 = a.f65931a[bVarO.ordinal()];
        if (i11 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarO);
        }
        cVar.f();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.F();
        }
        cVar.e();
        return fNextDouble;
    }
}
