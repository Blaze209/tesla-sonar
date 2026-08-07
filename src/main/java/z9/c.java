package z9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f127909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f127910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f127911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f127912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f127913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f127914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f127915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f127916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f127917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<c> f127918m;

    private c(String str, String str2, long j11, long j12, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f127906a = str;
        this.f127907b = str2;
        this.f127914i = str4;
        this.f127911f = gVar;
        this.f127912g = strArr;
        this.f127908c = str2 != null;
        this.f127909d = j11;
        this.f127910e = j12;
        this.f127913h = (String) s7.a.f(str3);
        this.f127915j = cVar;
        this.f127916k = new HashMap<>();
        this.f127917l = new HashMap<>();
    }

    private void b(Map<String, g> map, r7.a.b bVar, int i11, int i12, int i13) {
        g gVarF = f.f(this.f127911f, this.f127912g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i11, i12, gVarF, this.f127915j, map, i13);
            if ("p".equals(this.f127906a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static c c(String str, long j11, long j12, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j11, j12, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
            if (spannableStringBuilder.charAt(i11) == ' ') {
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                    i13++;
                }
                int i14 = i13 - i12;
                if (i14 > 0) {
                    spannableStringBuilder.delete(i11, i14 + i11);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == '\n') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
            if (spannableStringBuilder.charAt(i17) == ' ') {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z11) {
        boolean zEquals = "p".equals(this.f127906a);
        boolean zEquals2 = "div".equals(this.f127906a);
        if (z11 || zEquals || (zEquals2 && this.f127914i != null)) {
            long j11 = this.f127909d;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
            long j12 = this.f127910e;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
        }
        if (this.f127918m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f127918m.size(); i11++) {
            this.f127918m.get(i11).i(treeSet, z11 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, r7.a.b> map) {
        if (!map.containsKey(str)) {
            r7.a.b bVar = new r7.a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) s7.a.f(map.get(str).e());
    }

    private void n(long j11, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f127913h)) {
            str = this.f127913h;
        }
        if (m(j11) && "div".equals(this.f127906a) && this.f127914i != null) {
            list.add(new Pair<>(str, this.f127914i));
            return;
        }
        for (int i11 = 0; i11 < g(); i11++) {
            f(i11).n(j11, str, list);
        }
    }

    private void o(long j11, Map<String, g> map, Map<String, e> map2, String str, Map<String, r7.a.b> map3) {
        if (m(j11)) {
            String str2 = "".equals(this.f127913h) ? str : this.f127913h;
            Iterator<Map.Entry<String, Integer>> it = this.f127917l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f127916k.containsKey(key) ? this.f127916k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (r7.a.b) s7.a.f(map3.get(key)), iIntValue, iIntValue2, ((e) s7.a.f(map2.get(str2))).f127942j);
                }
            }
            for (int i11 = 0; i11 < g(); i11++) {
                f(i11).o(j11, map, map2, str2, map3);
            }
        }
    }

    private void p(long j11, boolean z11, String str, Map<String, r7.a.b> map) {
        this.f127916k.clear();
        this.f127917l.clear();
        if (OrcaKeys.METADATA.equals(this.f127906a)) {
            return;
        }
        if (!"".equals(this.f127913h)) {
            str = this.f127913h;
        }
        String str2 = str;
        if (this.f127908c && z11) {
            k(str2, map).append((CharSequence) s7.a.f(this.f127907b));
            return;
        }
        if ("br".equals(this.f127906a) && z11) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j11)) {
            for (Map.Entry<String, r7.a.b> entry : map.entrySet()) {
                this.f127916k.put(entry.getKey(), Integer.valueOf(((CharSequence) s7.a.f(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f127906a);
            int i11 = 0;
            while (i11 < g()) {
                f(i11).p(j11, z11 || zEquals, str2, map);
                i11++;
                j11 = j11;
                map = map;
            }
            Map<String, r7.a.b> map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry<String, r7.a.b> entry2 : map2.entrySet()) {
                this.f127917l.put(entry2.getKey(), Integer.valueOf(((CharSequence) s7.a.f(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f127918m == null) {
            this.f127918m = new ArrayList();
        }
        this.f127918m.add(cVar);
    }

    public c f(int i11) {
        List<c> list = this.f127918m;
        if (list != null) {
            return list.get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f127918m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<r7.a> h(long j11, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j11, this.f127913h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j11, false, this.f127913h, treeMap);
        o(j11, map, map2, this.f127913h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) s7.a.f(map2.get(pair.first));
                arrayList2.add(new r7.a.b().f(bitmapDecodeByteArray).k(eVar.f127934b).l(0).h(eVar.f127935c, 0).i(eVar.f127937e).n(eVar.f127938f).g(eVar.f127939g).r(eVar.f127942j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) s7.a.f(map2.get(entry.getKey()));
            r7.a.b bVar = (r7.a.b) entry.getValue();
            e((SpannableStringBuilder) s7.a.f(bVar.e()));
            bVar.h(eVar2.f127935c, eVar2.f127936d);
            bVar.i(eVar2.f127937e);
            bVar.k(eVar2.f127934b);
            bVar.n(eVar2.f127938f);
            bVar.q(eVar2.f127941i, eVar2.f127940h);
            bVar.r(eVar2.f127942j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i11 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f127912g;
    }

    public boolean m(long j11) {
        long j12 = this.f127909d;
        if (j12 == -9223372036854775807L && this.f127910e == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j11 && this.f127910e == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j11 >= this.f127910e) {
            return j12 <= j11 && j11 < this.f127910e;
        }
        return true;
    }
}
