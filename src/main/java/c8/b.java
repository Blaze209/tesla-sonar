package c8;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f18914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f18915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, d8.b> f18916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f18917d;

    public b() {
        this(new Random());
    }

    private static <T> void b(T t11, long j11, Map<T, Long> map) {
        if (map.containsKey(t11)) {
            j11 = Math.max(j11, ((Long) q0.l(map.get(t11))).longValue());
        }
        map.put(t11, Long.valueOf(j11));
    }

    private List<d8.b> c(List<d8.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f18914a);
        h(jElapsedRealtime, this.f18915b);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d8.b bVar = list.get(i11);
            if (!this.f18914a.containsKey(bVar.f59775b) && !this.f18915b.containsKey(Integer.valueOf(bVar.f59776c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(d8.b bVar, d8.b bVar2) {
        int iCompare = Integer.compare(bVar.f59776c, bVar2.f59776c);
        return iCompare != 0 ? iCompare : bVar.f59775b.compareTo(bVar2.f59775b);
    }

    public static int f(List<d8.b> list) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hashSet.add(Integer.valueOf(list.get(i11).f59776c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j11, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j11) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            map.remove(arrayList.get(i11));
        }
    }

    private d8.b k(List<d8.b> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += list.get(i12).f59777d;
        }
        int iNextInt = this.f18917d.nextInt(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            d8.b bVar = list.get(i14);
            i13 += bVar.f59777d;
            if (iNextInt < i13) {
                return bVar;
            }
        }
        return (d8.b) c0.d(list);
    }

    public void e(d8.b bVar, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j11;
        b(bVar.f59775b, jElapsedRealtime, this.f18914a);
        int i11 = bVar.f59776c;
        if (i11 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i11), jElapsedRealtime, this.f18915b);
        }
    }

    public int g(List<d8.b> list) {
        HashSet hashSet = new HashSet();
        List<d8.b> listC = c(list);
        for (int i11 = 0; i11 < listC.size(); i11++) {
            hashSet.add(Integer.valueOf(listC.get(i11).f59776c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f18914a.clear();
        this.f18915b.clear();
        this.f18916c.clear();
    }

    public d8.b j(List<d8.b> list) {
        List<d8.b> listC = c(list);
        if (listC.size() < 2) {
            return (d8.b) c0.c(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: c8.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((d8.b) obj, (d8.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i11 = listC.get(0).f59776c;
        for (int i12 = 0; i12 < listC.size(); i12++) {
            d8.b bVar = listC.get(i12);
            if (i11 != bVar.f59776c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listC.get(0);
            }
            arrayList.add(new Pair(bVar.f59775b, Integer.valueOf(bVar.f59777d)));
        }
        d8.b bVar2 = this.f18916c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        d8.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f18916c.put(arrayList, bVarK);
        return bVarK;
    }

    b(Random random) {
        this.f18916c = new HashMap();
        this.f18917d = random;
        this.f18914a = new HashMap();
        this.f18915b = new HashMap();
    }
}
