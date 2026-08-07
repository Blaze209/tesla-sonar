package k0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.r1;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f84605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f84607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rational f84608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f84609e;

    public i(@NonNull i0 i0Var, Size size) {
        this.f84605a = i0Var;
        this.f84606b = i0Var.m();
        this.f84607c = i0Var.f();
        Rational rationalH = size != null ? h(size) : i(i0Var);
        this.f84608d = rationalH;
        this.f84609e = new j(i0Var, rationalH);
    }

    @NonNull
    private static LinkedHashMap<Rational, List<Size>> a(@NonNull List<Size> list, @NonNull s0.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> b(@NonNull Map<Rational, List<Size>> map, @NonNull s0.a aVar, Rational rational) {
        boolean z11 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z11 = false;
        }
        Rational rationalN = n(aVar.b(), z11);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z11);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new h0.a.C1445a(rationalN, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    @NonNull
    private List<Size> c(@NonNull List<Size> list, @NonNull s0.c cVar, int i11) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f84605a.o(i11));
        Collections.sort(arrayList, new h0.e(true));
        return arrayList;
    }

    private static void d(@NonNull LinkedHashMap<Rational, List<Size>> linkedHashMap, @NonNull Size size) {
        int iC = o0.c.c(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (o0.c.c(size2) <= iC) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    @NonNull
    private static List<Size> e(@NonNull List<Size> list, s0.b bVar, int i11, int i12, int i13) {
        if (bVar == null) {
            return list;
        }
        List<Size> listA = bVar.a(new ArrayList(list), h0.c.a(h0.c.b(i11), i12, i13 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(@NonNull LinkedHashMap<Rational, List<Size>> linkedHashMap, s0.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    private static void g(@NonNull List<Size> list, @NonNull s0.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(s0.d.f109295c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    @NonNull
    private Rational h(@NonNull Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(@NonNull i0 i0Var) {
        List<Size> listS = i0Var.s(256);
        if (listS.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listS, new h0.e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    @NonNull
    private List<Size> j(List<Pair<Integer, Size[]>> list, int i11) {
        List<Size> listL = l(list, i11);
        if (listL == null) {
            listL = this.f84605a.s(i11);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new h0.e(true));
        if (arrayList.isEmpty()) {
            y0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i11 + ".");
        }
        return arrayList;
    }

    @NonNull
    static List<Rational> k(@NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h0.a.f70074a);
        arrayList.add(h0.a.f70076c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!h0.a.a(size, (Rational) it.next()));
            }
        }
        return arrayList;
    }

    private List<Size> l(List<Pair<Integer, Size[]>> list, int i11) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i11) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i11, boolean z11) {
        if (i11 == -1) {
            return null;
        }
        if (i11 == 0) {
            return z11 ? h0.a.f70074a : h0.a.f70075b;
        }
        if (i11 == 1) {
            return z11 ? h0.a.f70076c : h0.a.f70077d;
        }
        y0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i11);
        return null;
    }

    static Map<Rational, List<Size>> o(@NonNull List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = k(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (h0.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    @NonNull
    public static List<Size> p(@NonNull s0.c cVar, @NonNull List<Size> list, Size size, int i11, @NonNull Rational rational, int i12, int i13) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i11, i12, i13);
    }

    static void q(@NonNull List<Size> list, @NonNull Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    private static void r(@NonNull List<Size> list, @NonNull Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    private static void s(@NonNull List<Size> list, @NonNull Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    @NonNull
    public List<Size> m(@NonNull o3<?> o3Var) {
        r1 r1Var = (r1) o3Var;
        List<Size> listY = r1Var.y(null);
        if (listY != null) {
            return listY;
        }
        s0.c cVarX = r1Var.x(null);
        List<Size> listJ = j(r1Var.k(null), o3Var.getInputFormat());
        if (cVarX == null) {
            return this.f84609e.f(listJ, o3Var);
        }
        Size sizeI = ((r1) o3Var).i(null);
        int iU = r1Var.u(0);
        if (!o3Var.F(false)) {
            listJ = c(listJ, cVarX, o3Var.getInputFormat());
        }
        return p(r1Var.J(), listJ, sizeI, iU, this.f84608d, this.f84606b, this.f84607c);
    }
}
