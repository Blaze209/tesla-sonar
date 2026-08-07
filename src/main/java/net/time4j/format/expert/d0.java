package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
final class d0 implements h<net.time4j.tz.k> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f94285g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f94286h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f94287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<net.time4j.tz.k> f94288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<net.time4j.tz.k> f94289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final net.time4j.format.g f94290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Locale f94291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f94292f;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g0 f94293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f94294b;

        a(g0 g0Var, g0 g0Var2) {
            this.f94293a = g0Var;
            this.f94294b = g0Var2;
        }

        void a(CharSequence charSequence, int i11, List<net.time4j.tz.k> list, List<net.time4j.tz.k> list2, int[] iArr) {
            String strF = this.f94293a.f(charSequence, i11);
            int length = strF.length();
            iArr[0] = i11 + length;
            String strF2 = this.f94294b.f(charSequence, i11);
            int length2 = strF2.length();
            iArr[1] = i11 + length2;
            if (length2 > length) {
                list2.addAll(this.f94294b.b(strF2));
                return;
            }
            if (length2 < length) {
                list.addAll(this.f94293a.b(strF));
            } else if (length > 0) {
                list.addAll(this.f94293a.b(strF));
                list2.addAll(this.f94294b.b(strF2));
            }
        }
    }

    d0(boolean z11) {
        this.f94287a = z11;
        this.f94288b = new n(z11);
        this.f94289c = null;
        this.f94290d = net.time4j.format.g.SMART;
        this.f94291e = Locale.ROOT;
        this.f94292f = 0;
    }

    private g0 a(Locale locale, boolean z11) {
        net.time4j.tz.d dVarD = d(z11);
        g0.b bVarD = null;
        for (net.time4j.tz.k kVar : net.time4j.tz.l.t()) {
            String strX = net.time4j.tz.l.x(kVar, dVarD, locale);
            if (!strX.equals(kVar.a())) {
                bVarD = g0.d(bVarD, strX, kVar);
            }
        }
        return new g0(bVarD);
    }

    private static List<net.time4j.tz.k> b(List<net.time4j.tz.k> list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i11 = 1; i11 < size; i11++) {
                net.time4j.tz.k kVar = list.get(i11);
                if (kVar.a().startsWith("WINDOWS~")) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private String c(CharSequence charSequence, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = i11; i13 < i12; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (!Character.isLetter(cCharAt) && (this.f94287a || i13 <= i11 || Character.isDigit(cCharAt))) {
                break;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString().trim();
    }

    private net.time4j.tz.d d(boolean z11) {
        if (z11) {
            return this.f94287a ? net.time4j.tz.d.SHORT_DAYLIGHT_TIME : net.time4j.tz.d.LONG_DAYLIGHT_TIME;
        }
        return this.f94287a ? net.time4j.tz.d.SHORT_STANDARD_TIME : net.time4j.tz.d.LONG_STANDARD_TIME;
    }

    private List<net.time4j.tz.k> e(List<net.time4j.tz.k> list, Locale locale, net.time4j.format.g gVar) {
        boolean z11;
        HashMap map = new HashMap();
        map.put("DEFAULT", new ArrayList());
        Iterator<net.time4j.tz.k> it = list.iterator();
        while (true) {
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            String strA = it.next().a();
            Set<net.time4j.tz.k> setC = this.f94289c;
            int iIndexOf = strA.indexOf(126);
            String strSubstring = iIndexOf >= 0 ? strA.substring(0, iIndexOf) : "DEFAULT";
            if (setC == null) {
                setC = net.time4j.tz.l.C(locale, gVar.isSmart(), strSubstring);
            }
            for (net.time4j.tz.k kVar : setC) {
                if (kVar.a().equals(strA)) {
                    List arrayList = (List) map.get(strSubstring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strSubstring, arrayList);
                    }
                    arrayList.add(kVar);
                    break;
                }
            }
        }
        List<net.time4j.tz.k> list2 = (List) map.get("DEFAULT");
        if (!list2.isEmpty()) {
            return list2;
        }
        map.remove("DEFAULT");
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            List<net.time4j.tz.k> list3 = (List) map.get((String) it2.next());
            if (!list3.isEmpty()) {
                z11 = true;
                list = list3;
                break;
            }
        }
        return !z11 ? Collections.EMPTY_LIST : list;
    }

    private static String f(List<net.time4j.tz.k> list) {
        StringBuilder sb2 = new StringBuilder(list.size() * 16);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (net.time4j.tz.k kVar : list) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(kVar.a());
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f94287a == d0Var.f94287a) {
                Set<net.time4j.tz.k> set = this.f94289c;
                Set<net.time4j.tz.k> set2 = d0Var.f94289c;
                if (set != null ? set.equals(set2) : set2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_ID;
    }

    public int hashCode() {
        Set<net.time4j.tz.k> set = this.f94289c;
        return (set == null ? 0 : set.hashCode()) + (this.f94287a ? 1 : 0);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[PHI: r7
      0x009b: PHI (r7v5 net.time4j.format.expert.d0$a) = (r7v4 net.time4j.format.expert.d0$a), (r7v31 net.time4j.format.expert.d0$a) binds: [B:29:0x007b, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        a aVar;
        List<net.time4j.tz.k> listE;
        List<net.time4j.tz.k> listE2;
        ?? r11;
        boolean z12;
        List<net.time4j.tz.k> listSingletonList;
        int iF = sVar.f();
        int length = charSequence.length();
        int iIntValue = z11 ? this.f94292f : ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (iIntValue > 0) {
            length -= iIntValue;
        }
        if (iF >= length) {
            sVar.k(iF, "Missing timezone name.");
            return;
        }
        Locale locale = z11 ? this.f94291e : (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        net.time4j.format.g gVar = z11 ? this.f94290d : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        String strC = c(charSequence, iF, length);
        if (strC.startsWith("GMT") || strC.startsWith("UT")) {
            this.f94288b.parse(charSequence, sVar, dVar, tVar, z11);
            return;
        }
        ConcurrentMap<Locale, a> concurrentMap = this.f94287a ? f94285g : f94286h;
        a aVarPutIfAbsent = concurrentMap.get(locale);
        if (aVarPutIfAbsent == null) {
            a aVar2 = new a(a(locale, false), a(locale, true));
            if (concurrentMap.size() >= 25 || (aVarPutIfAbsent = concurrentMap.putIfAbsent(locale, aVar2)) == null) {
                aVar = aVar2;
            } else {
                aVar = aVarPutIfAbsent;
            }
        } else {
            aVar = aVarPutIfAbsent;
        }
        List<net.time4j.tz.k> arrayList = new ArrayList<>();
        List<net.time4j.tz.k> arrayList2 = new ArrayList<>();
        int[] iArr = new int[2];
        aVar.a(charSequence.subSequence(0, length), iF, arrayList, arrayList2, iArr);
        int size = arrayList.size() + arrayList2.size();
        if (size == 0) {
            sVar.k(iF, "\"" + strC + "\" does not match any known timezone name.");
            return;
        }
        if (size > 1 && !gVar.isStrict()) {
            arrayList = b(arrayList);
            arrayList2 = b(arrayList2);
            size = arrayList.size() + arrayList2.size();
        }
        if (size <= 1 || gVar.isLax()) {
            listE = arrayList;
            listE2 = arrayList2;
        } else {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f94173d, net.time4j.tz.p.f94822k);
            if (!(kVar instanceof net.time4j.tz.p)) {
                Iterator<net.time4j.tz.k> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        listSingletonList = arrayList;
                        listE2 = arrayList2;
                        z12 = false;
                        break;
                    } else {
                        net.time4j.tz.k next = it.next();
                        if (next.a().equals(kVar.a())) {
                            listSingletonList = Collections.singletonList(next);
                            listE2 = Collections.EMPTY_LIST;
                            z12 = true;
                            break;
                        }
                    }
                }
                if (!z12) {
                    Iterator<net.time4j.tz.k> it2 = listE2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            listE = listSingletonList;
                            break;
                        }
                        net.time4j.tz.k next2 = it2.next();
                        List<net.time4j.tz.k> list = listSingletonList;
                        if (next2.a().equals(kVar.a())) {
                            listE = Collections.EMPTY_LIST;
                            listE2 = Collections.singletonList(next2);
                            z12 = true;
                            break;
                        }
                        listSingletonList = list;
                    }
                } else {
                    listE = listSingletonList;
                    break;
                }
            } else {
                listE = arrayList;
                listE2 = arrayList2;
                z12 = false;
            }
            if (!z12) {
                if (listE.size() > 0) {
                    listE = e(listE, locale, gVar);
                }
                if (listE2.size() > 0) {
                    listE2 = e(listE2, locale, gVar);
                }
            }
        }
        int size2 = listE.size() + listE2.size();
        if (size2 == 0) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<net.time4j.tz.k> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().a());
            }
            Iterator<net.time4j.tz.k> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().a());
            }
            sVar.k(iF, "Time zone name \"" + strC + "\" not found among preferred timezones in locale " + locale + ", candidates=" + arrayList3);
            return;
        }
        if (listE.size() > 0) {
            if ((size2 != 2 || listE2.size() != 1 || !listE.get(0).a().equals(listE2.get(0).a())) && !listE2.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(listE);
                arrayList4.addAll(listE2);
                listE = arrayList4;
            }
            r11 = 0;
        } else {
            listE = listE2;
            r11 = 1;
        }
        if (listE.size() == 1 || gVar.isLax()) {
            tVar.F(b0.TIMEZONE_ID, listE.get(0));
            tVar.F(net.time4j.engine.a0.DAYLIGHT_SAVING, Boolean.valueOf((boolean) r11));
            sVar.l(iArr[r11]);
        } else {
            sVar.k(iF, "Time zone name is not unique: \"" + strC + "\" in " + f(listE));
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        if (!oVar.j()) {
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        net.time4j.tz.k kVarG = oVar.g();
        if (kVarG instanceof net.time4j.tz.p) {
            return this.f94288b.print(oVar, appendable, dVar, set, z11);
        }
        if (!(oVar instanceof net.time4j.base.f)) {
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        net.time4j.tz.l lVarN = net.time4j.tz.l.N(kVarG);
        String strW = lVarN.w(d(lVarN.I((net.time4j.base.f) net.time4j.base.f.class.cast(oVar))), z11 ? this.f94291e : (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT));
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        appendable.append(strW);
        int length2 = strW.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new d0(this.f94287a, this.f94288b, this.f94289c, (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART), (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(d0.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f94287a);
        sb2.append(", preferredZones=");
        sb2.append(this.f94289c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private d0(boolean z11, h<net.time4j.tz.k> hVar, Set<net.time4j.tz.k> set, net.time4j.format.g gVar, Locale locale, int i11) {
        this.f94287a = z11;
        this.f94288b = hVar;
        this.f94289c = set;
        this.f94290d = gVar;
        this.f94291e = locale;
        this.f94292f = i11;
    }
}
