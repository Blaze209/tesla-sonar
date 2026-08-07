package ns;

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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f95400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f95401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f95403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f95404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f95405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f95406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<d> f95407m;

    private d(String str, String str2, long j11, long j12, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f95395a = str;
        this.f95396b = str2;
        this.f95403i = str4;
        this.f95400f = gVar;
        this.f95401g = strArr;
        this.f95397c = str2 != null;
        this.f95398d = j11;
        this.f95399e = j12;
        this.f95402h = (String) ts.a.e(str3);
        this.f95404j = dVar;
        this.f95405k = new HashMap<>();
        this.f95406l = new HashMap<>();
    }

    private void b(Map<String, g> map, gs.b.C1421b c1421b, int i11, int i12, int i13) {
        g gVarF = f.f(this.f95400f, this.f95401g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1421b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c1421b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i11, i12, gVarF, this.f95404j, map, i13);
            if ("p".equals(this.f95395a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    c1421b.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    c1421b.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    c1421b.j(gVarF.h());
                }
            }
        }
    }

    public static d c(String str, long j11, long j12, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j11, j12, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
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
        boolean zEquals = "p".equals(this.f95395a);
        boolean zEquals2 = "div".equals(this.f95395a);
        if (z11 || zEquals || (zEquals2 && this.f95403i != null)) {
            long j11 = this.f95398d;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
            long j12 = this.f95399e;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
        }
        if (this.f95407m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f95407m.size(); i11++) {
            this.f95407m.get(i11).i(treeSet, z11 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, gs.b.C1421b> map) {
        if (!map.containsKey(str)) {
            gs.b.C1421b c1421b = new gs.b.C1421b();
            c1421b.o(new SpannableStringBuilder());
            map.put(str, c1421b);
        }
        return (SpannableStringBuilder) ts.a.e(map.get(str).e());
    }

    private void n(long j11, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f95402h)) {
            str = this.f95402h;
        }
        if (m(j11) && "div".equals(this.f95395a) && this.f95403i != null) {
            list.add(new Pair<>(str, this.f95403i));
            return;
        }
        for (int i11 = 0; i11 < g(); i11++) {
            f(i11).n(j11, str, list);
        }
    }

    private void o(long j11, Map<String, g> map, Map<String, e> map2, String str, Map<String, gs.b.C1421b> map3) {
        if (m(j11)) {
            String str2 = "".equals(this.f95402h) ? str : this.f95402h;
            Iterator<Map.Entry<String, Integer>> it = this.f95406l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f95405k.containsKey(key) ? this.f95405k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (gs.b.C1421b) ts.a.e(map3.get(key)), iIntValue, iIntValue2, ((e) ts.a.e(map2.get(str2))).f95417j);
                }
            }
            for (int i11 = 0; i11 < g(); i11++) {
                f(i11).o(j11, map, map2, str2, map3);
            }
        }
    }

    private void p(long j11, boolean z11, String str, Map<String, gs.b.C1421b> map) {
        this.f95405k.clear();
        this.f95406l.clear();
        if (OrcaKeys.METADATA.equals(this.f95395a)) {
            return;
        }
        if (!"".equals(this.f95402h)) {
            str = this.f95402h;
        }
        String str2 = str;
        if (this.f95397c && z11) {
            k(str2, map).append((CharSequence) ts.a.e(this.f95396b));
            return;
        }
        if ("br".equals(this.f95395a) && z11) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j11)) {
            for (Map.Entry<String, gs.b.C1421b> entry : map.entrySet()) {
                this.f95405k.put(entry.getKey(), Integer.valueOf(((CharSequence) ts.a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f95395a);
            int i11 = 0;
            while (i11 < g()) {
                f(i11).p(j11, z11 || zEquals, str2, map);
                i11++;
                j11 = j11;
                map = map;
            }
            Map<String, gs.b.C1421b> map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry<String, gs.b.C1421b> entry2 : map2.entrySet()) {
                this.f95406l.put(entry2.getKey(), Integer.valueOf(((CharSequence) ts.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f95407m == null) {
            this.f95407m = new ArrayList();
        }
        this.f95407m.add(dVar);
    }

    public d f(int i11) {
        List<d> list = this.f95407m;
        if (list != null) {
            return list.get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f95407m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<gs.b> h(long j11, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j11, this.f95402h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j11, false, this.f95402h, treeMap);
        o(j11, map, map2, this.f95402h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) ts.a.e(map2.get(pair.first));
                arrayList2.add(new gs.b.C1421b().f(bitmapDecodeByteArray).k(eVar.f95409b).l(0).h(eVar.f95410c, 0).i(eVar.f95412e).n(eVar.f95413f).g(eVar.f95414g).r(eVar.f95417j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) ts.a.e(map2.get(entry.getKey()));
            gs.b.C1421b c1421b = (gs.b.C1421b) entry.getValue();
            e((SpannableStringBuilder) ts.a.e(c1421b.e()));
            c1421b.h(eVar2.f95410c, eVar2.f95411d);
            c1421b.i(eVar2.f95412e);
            c1421b.k(eVar2.f95409b);
            c1421b.n(eVar2.f95413f);
            c1421b.q(eVar2.f95416i, eVar2.f95415h);
            c1421b.r(eVar2.f95417j);
            arrayList2.add(c1421b.a());
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
        return this.f95401g;
    }

    public boolean m(long j11) {
        long j12 = this.f95398d;
        if (j12 == -9223372036854775807L && this.f95399e == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j11 && this.f95399e == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j11 >= this.f95399e) {
            return j12 <= j11 && j11 < this.f95399e;
        }
        return true;
    }
}
