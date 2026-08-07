package t0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.r1;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f111953h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Size f111954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rational f111955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Rational f111956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Set<o3<?>> f111957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final k0.i f111958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final i0 f111959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Map<o3<?>, List<Size>> f111960g;

    private static class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Rational f111961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f111962b;

        a(@NonNull Rational rational, boolean z11) {
            this.f111961a = rational;
            this.f111962b = z11;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NonNull Rational rational, @NonNull Rational rational2) {
            float fC = b.c(rational, this.f111961a);
            float fC2 = b.c(rational2, this.f111961a);
            return this.f111962b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    b(@NonNull j0 j0Var, @NonNull Set<o3<?>> set) {
        this(s.m(j0Var.l().l()), j0Var.e(), set);
    }

    private static boolean A(@NonNull Collection<Size> collection, @NonNull Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(@NonNull Rational rational, @NonNull Size size) {
        if (this.f111955b.equals(rational) || h0.a.a(size, rational)) {
            return false;
        }
        return b(this.f111955b.floatValue(), rational.floatValue(), N(size).floatValue());
    }

    private boolean C(@NonNull Size size, @NonNull Size size2) {
        return B(N(size), size2);
    }

    private boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!h0.a.a(it.next(), this.f111956c)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    private static List<Size> E(@NonNull List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    @NonNull
    static Rect F(@NonNull Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    @NonNull
    private List<Size> G(@NonNull List<Size> list, boolean z11) {
        Map<Rational, List<Size>> mapX = x(list);
        ArrayList arrayList = new ArrayList(mapX.keySet());
        K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(h0.a.f70076c) && !rational.equals(h0.a.f70074a)) {
                List<Size> list2 = mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z11));
            }
        }
        return arrayList2;
    }

    @NonNull
    private List<Size> H(@NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f111955b, list, false));
        }
        arrayList.addAll(I(this.f111956c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            y0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        y0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List<Size> I(@NonNull Rational rational, @NonNull List<Size> list, boolean z11) {
        List<Size> listG = g(rational, list);
        L(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator<o3<?>> it = this.f111957d.iterator();
        while (it.hasNext()) {
            List<Size> listV = v(it.next());
            if (!z11) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z11;
        s0.c cVarX;
        Iterator<o3<?>> it = this.f111957d.iterator();
        while (true) {
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            o3<?> next = it.next();
            if (!next.F(false) && (next instanceof r1) && (cVarX = ((r1) next).x(null)) != null) {
                z11 = true;
                if (cVarX.a() == 1) {
                    break;
                }
            }
        }
        return z11;
    }

    private void K(@NonNull List<Rational> list) {
        Collections.sort(list, new a(M(this.f111954a), true));
    }

    static void L(@NonNull List<Size> list) {
        Collections.sort(list, new h0.e(true));
    }

    @NonNull
    private static Rational M(@NonNull Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    @NonNull
    private static Rational N(@NonNull Size size) {
        Rational rational = h0.a.f70074a;
        if (h0.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = h0.a.f70076c;
        return h0.a.a(size, rational2) ? rational2 : M(size);
    }

    private boolean b(float f11, float f12, float f13) {
        if (f11 != f12 && f12 != f13) {
            if (f11 > f12) {
                return f12 < f13;
            }
            if (f12 > f13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(@NonNull Rational rational, @NonNull Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    @NonNull
    private List<Size> d(@NonNull Rational rational, @NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> e(@NonNull List<Size> list) {
        Rational rationalM;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalM = null;
                    break;
                }
                rationalM = (Rational) it.next();
            } while (!h0.a.a(size, rationalM));
            if (rationalM != null) {
                Size size2 = (Size) map.get(rationalM);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM = M(size);
            }
            arrayList.add(size);
            map.put(rationalM, size);
        }
        return arrayList;
    }

    @NonNull
    static List<Size> f(@NonNull Collection<Size> collection, @NonNull List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    @NonNull
    static List<Size> g(@NonNull Rational rational, @NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (h0.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    @NonNull
    private static Rational h(@NonNull Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f111953h ? h0.a.f70076c : h0.a.f70074a;
    }

    @NonNull
    private List<Size> i() {
        return this.f111959f.o(34);
    }

    @NonNull
    private List<Size> j() {
        return this.f111959f.s(34);
    }

    @NonNull
    private static Rect k(@NonNull Rational rational, @NonNull Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM = M(size);
        if (rational.floatValue() == rationalM.floatValue()) {
            rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
        } else {
            if (rational.floatValue() > rationalM.floatValue()) {
                float f11 = width;
                float fFloatValue = f11 / rational.floatValue();
                float f12 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, f12, f11, fFloatValue + f12);
            } else {
                float f13 = height;
                float fFloatValue2 = rational.floatValue() * f13;
                float f14 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f14, BitmapDescriptorFactory.HUE_RED, fFloatValue2 + f14, f13);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    @NonNull
    private Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<o3<?>> it = this.f111957d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    @NonNull
    static Rect m(@NonNull Size size, @NonNull Size size2) {
        return k(M(size2), size);
    }

    @NonNull
    private static Rational n(@NonNull Rational rational) {
        Rational rational2 = h0.a.f70074a;
        if (rational.equals(rational2)) {
            return h0.a.f70076c;
        }
        if (rational.equals(h0.a.f70076c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    @NonNull
    static List<Size> p(@NonNull Collection<Size> collection, @NonNull List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    @NonNull
    private Pair<Rect, Size> t(@NonNull Rect rect, @NonNull o3<?> o3Var, boolean z11) {
        Size sizeQ;
        if (z11) {
            sizeQ = r(s.m(rect), o3Var);
        } else {
            Size sizeM = s.m(rect);
            sizeQ = q(sizeM, o3Var);
            rect = m(sizeM, sizeQ);
        }
        return new Pair<>(rect, sizeQ);
    }

    @NonNull
    private static Rational u(@NonNull Size size) {
        Rational rationalH = h(size);
        y0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    @NonNull
    private List<Size> v(@NonNull o3<?> o3Var) {
        if (!this.f111957d.contains(o3Var)) {
            throw new IllegalArgumentException("Invalid child config: " + o3Var);
        }
        if (this.f111960g.containsKey(o3Var)) {
            List<Size> list = this.f111960g.get(o3Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = e(this.f111958e.m(o3Var));
        this.f111960g.put(o3Var, listE);
        return listE;
    }

    @NonNull
    private static List<Size> w(@NonNull List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    @NonNull
    private Map<Rational, List<Size>> x(@NonNull List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = h0.a.f70074a;
        map.put(rational, new ArrayList());
        Rational rational2 = h0.a.f70076c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (h0.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM = M(size);
                    arrayList2.add(rationalM);
                    map.put(rationalM, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    static boolean y(@NonNull Size size, @NonNull Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(@NonNull Collection<Size> collection, @NonNull Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    List<Size> o(@NonNull c2 c2Var) {
        List<Size> listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) c2Var.d(r1.f3293r, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    @NonNull
    Size q(@NonNull Size size, @NonNull o3<?> o3Var) {
        List<Size> listV = v(o3Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    @NonNull
    Size r(@NonNull Size size, @NonNull o3<?> o3Var) {
        Iterator<Size> it = v(o3Var).iterator();
        while (it.hasNext()) {
            Size sizeM = s.m(m(it.next(), size));
            if (!y(sizeM, size)) {
                return sizeM;
            }
        }
        return size;
    }

    @NonNull
    Pair<Rect, Size> s(@NonNull o3<?> o3Var, @NonNull Rect rect, int i11, boolean z11) {
        boolean z12;
        if (s.i(i11)) {
            rect = F(rect);
            z12 = true;
        } else {
            z12 = false;
        }
        Pair<Rect, Size> pairT = t(rect, o3Var, z11);
        Rect rectF = (Rect) pairT.first;
        Size sizeO = (Size) pairT.second;
        if (z12) {
            sizeO = s.o(sizeO);
            rectF = F(rectF);
        }
        return new Pair<>(rectF, sizeO);
    }

    private b(@NonNull Size size, @NonNull i0 i0Var, @NonNull Set<o3<?>> set) {
        this(size, i0Var, set, new k0.i(i0Var, size));
    }

    b(@NonNull Size size, @NonNull i0 i0Var, @NonNull Set<o3<?>> set, @NonNull k0.i iVar) {
        this.f111960g = new HashMap();
        this.f111954a = size;
        Rational rationalU = u(size);
        this.f111955b = rationalU;
        this.f111956c = n(rationalU);
        this.f111959f = i0Var;
        this.f111957d = set;
        this.f111958e = iVar;
    }
}
