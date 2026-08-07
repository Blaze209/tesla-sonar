package k0;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f84610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f84612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f84613d;

    j(@NonNull i0 i0Var, Rational rational) {
        this.f84610a = i0Var.m();
        this.f84611b = i0Var.f();
        this.f84612c = rational;
        boolean z11 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z11 = false;
        }
        this.f84613d = z11;
    }

    private static Size a(Size size, int i11, int i12, int i13) {
        return (size == null || !e(i11, i12, i13)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, @NonNull List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : i.k(list)) {
            if (h0.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(@NonNull r1 r1Var, @NonNull List<Size> list) {
        if (r1Var.P()) {
            return i.n(r1Var.R(), this.f84613d);
        }
        Size sizeD = d(r1Var);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    private Size d(@NonNull r1 r1Var) {
        return a(r1Var.C(null), r1Var.u(0), this.f84611b, this.f84610a);
    }

    private static boolean e(int i11, int i12, int i13) {
        int iA = h0.c.a(h0.c.b(i11), i13, 1 == i12);
        return iA == 90 || iA == 270;
    }

    @NonNull
    List<Size> f(@NonNull List<Size> list, @NonNull o3<?> o3Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new h0.e(true));
        ArrayList arrayList2 = new ArrayList();
        r1 r1Var = (r1) o3Var;
        Size sizeI = r1Var.i(null);
        Size size = (Size) arrayList.get(0);
        if (sizeI == null || o0.c.c(size) < o0.c.c(sizeI)) {
            sizeI = size;
        }
        Size sizeD = d(r1Var);
        Size size2 = o0.c.f95563c;
        int iC = o0.c.c(size2);
        if (o0.c.c(sizeI) < iC) {
            size2 = o0.c.f95561a;
        } else if (sizeD != null && o0.c.c(sizeD) < iC) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (o0.c.c(size3) <= o0.c.c(sizeI) && o0.c.c(size3) >= o0.c.c(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeI + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(r1Var, arrayList2);
        if (sizeD == null) {
            sizeD = r1Var.S(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                i.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> mapO = i.o(arrayList2);
            if (sizeD != null) {
                Iterator<Rational> it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    i.q(mapO.get(it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new h0.a.C1445a(rationalC, this.f84612c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : mapO.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
