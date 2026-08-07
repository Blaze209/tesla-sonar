package z0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<x, Range<Integer>> f126378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Rational> f126379c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, List<Size>> f126380a = new HashMap();

    static abstract class a {
        a() {
        }

        static a c(@NonNull x xVar, int i11) {
            return new i(xVar, i11);
        }

        abstract int a();

        @NonNull
        abstract x b();
    }

    static {
        HashMap map = new HashMap();
        f126378b = map;
        map.put(x.f126360d, Range.create(2160, 4319));
        map.put(x.f126359c, Range.create(1080, 1439));
        map.put(x.f126358b, Range.create(720, 1079));
        map.put(x.f126357a, Range.create(Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE), 719));
        HashMap map2 = new HashMap();
        f126379c = map2;
        map2.put(0, h0.a.f70074a);
        map2.put(1, h0.a.f70076c);
    }

    z(@NonNull List<Size> list, @NonNull Map<x, Size> map) {
        for (x xVar : f126378b.keySet()) {
            this.f126380a.put(a.c(xVar, -1), new ArrayList());
            Iterator<Integer> it = f126379c.keySet().iterator();
            while (it.hasNext()) {
                this.f126380a.put(a.c(xVar, it.next().intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i11, Size size, Size size2) {
        return Math.abs(o0.c.c(size) - i11) - Math.abs(o0.c.c(size2) - i11);
    }

    private void b(@NonNull Map<x, Size> map) {
        for (Map.Entry<x, Size> entry : map.entrySet()) {
            List<Size> listF = f(entry.getKey(), -1);
            Objects.requireNonNull(listF);
            listF.add(entry.getValue());
        }
    }

    private void c(@NonNull List<Size> list) {
        Integer numD;
        for (Size size : list) {
            x xVarE = e(size);
            if (xVarE != null && (numD = d(size)) != null) {
                List<Size> listF = f(xVarE, numD.intValue());
                Objects.requireNonNull(listF);
                listF.add(size);
            }
        }
    }

    private static Integer d(@NonNull Size size) {
        for (Map.Entry<Integer, Rational> entry : f126379c.entrySet()) {
            if (h0.a.b(size, entry.getValue(), o0.c.f95562b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static x e(@NonNull Size size) {
        for (Map.Entry<x, Range<Integer>> entry : f126378b.entrySet()) {
            if (entry.getValue().contains(Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    private List<Size> f(@NonNull x xVar, int i11) {
        return this.f126380a.get(a.c(xVar, i11));
    }

    private void h(@NonNull Map<x, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.f126380a.entrySet()) {
            Size size = map.get(entry.getKey().b());
            if (size != null) {
                final int iC = o0.c.c(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: z0.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return z.a(iC, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    @NonNull
    List<Size> g(@NonNull x xVar, int i11) {
        List<Size> listF = f(xVar, i11);
        return listF != null ? new ArrayList(listF) : new ArrayList(0);
    }
}
