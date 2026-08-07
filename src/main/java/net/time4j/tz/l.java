package net.time4j.tz;

import android.util.TimeUtils;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f94758a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f94759b = System.getProperty("net.time4j.tz.repository.version");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<k> f94760c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f94761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f94762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f94763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f94764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile e f94765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile l f94766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile boolean f94767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f94768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<String, k> f94769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map<String, k> f94770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final r f94771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final r f94772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ConcurrentMap<String, c> f94773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ReferenceQueue<l> f94774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final LinkedList<l> f94775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ConcurrentMap<String, r> f94776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final s f94777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final l f94778u;

    static class a implements Comparator<k> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k kVar, k kVar2) {
            return kVar.a().compareTo(kVar2.a());
        }
    }

    public static class b {
        public static void a() {
            synchronized (l.class) {
                do {
                } while (l.f94774q.poll() != null);
                l.f94775r.clear();
            }
            e unused = l.f94765h = new e();
            l.f94773p.clear();
            if (l.f94764g) {
                l unused2 = l.f94766i = l.v();
            }
        }
    }

    private static class c extends SoftReference<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94779a;

        c(l lVar, ReferenceQueue<l> referenceQueue) {
            super(lVar, referenceQueue);
            this.f94779a = lVar.z().a();
        }
    }

    private static class d implements r, s {
        private d() {
        }

        @Override // net.time4j.tz.r
        public s a() {
            return this;
        }

        @Override // net.time4j.tz.s
        public Set<String> b(Locale locale, boolean z11) {
            return Collections.EMPTY_SET;
        }

        @Override // net.time4j.tz.s
        public String c(boolean z11, Locale locale) {
            return z11 ? "GMT" : "GMT±hh:mm";
        }

        @Override // net.time4j.tz.r
        public String d() {
            return "";
        }

        @Override // net.time4j.tz.r
        public Map<String, String> e() {
            return Collections.EMPTY_MAP;
        }

        @Override // net.time4j.tz.s
        public String f(String str, net.time4j.tz.d dVar, Locale locale) {
            if (locale == null) {
                throw new NullPointerException("Missing locale.");
            }
            if (str.isEmpty()) {
                return "";
            }
            TimeZone timeZoneR = h.R(str);
            return timeZoneR.getID().equals(str) ? timeZoneR.getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation() ? 1 : 0, locale) : "";
        }

        @Override // net.time4j.tz.r
        public Set<String> g() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.tz.r
        public String getLocation() {
            return "";
        }

        @Override // net.time4j.tz.r
        public String getName() {
            return "java.util.TimeZone";
        }

        @Override // net.time4j.tz.r
        public String getVersion() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.tz.r
        public m load(String str) {
            return null;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<k> f94780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<k> f94781b;

        e() {
            ArrayList arrayList = new ArrayList(1024);
            ArrayList arrayList2 = new ArrayList(1024);
            arrayList.add(p.f94822k);
            Iterator it = l.f94776s.entrySet().iterator();
            while (it.hasNext()) {
                r rVar = (r) ((Map.Entry) it.next()).getValue();
                if (rVar != l.f94771n || l.f94772o == l.f94771n) {
                    Iterator<String> it2 = rVar.g().iterator();
                    while (it2.hasNext()) {
                        k kVarP = l.P(it2.next());
                        if (!arrayList.contains(kVarP)) {
                            arrayList.add(kVarP);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    Iterator<String> it3 = rVar.e().keySet().iterator();
                    while (it3.hasNext()) {
                        k kVarP2 = l.P(it3.next());
                        if (!arrayList2.contains(kVarP2)) {
                            arrayList2.add(kVarP2);
                        }
                    }
                }
            }
            Collections.sort(arrayList, l.f94760c);
            Collections.sort(arrayList2, l.f94760c);
            this.f94780a = Collections.unmodifiableList(arrayList);
            this.f94781b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.time4j.tz.l$a] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.time4j.tz.l] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.time4j.tz.j] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.time4j.tz.l] */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        List<Class<? extends k>> listL;
        net.time4j.tz.b bVar = net.time4j.tz.b.PUSH_FORWARD;
        g gVar = g.LATER_OFFSET;
        f94761d = bVar.and(gVar);
        f94762e = net.time4j.tz.b.ABORT.and(gVar);
        boolean zEqualsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f94763f = zEqualsIgnoreCase;
        f94764g = zEqualsIgnoreCase || Boolean.getBoolean("net.time4j.allow.system.tz.override");
        ?? K = 0;
        K = 0;
        f94765h = null;
        f94766i = null;
        f94767j = true;
        f94768k = 11;
        f94773p = new ConcurrentHashMap();
        f94776s = new ConcurrentHashMap();
        f94774q = new ReferenceQueue<>();
        f94775r = new LinkedList<>();
        try {
            listL = L(l.class.getClassLoader(), "AFRICA", "AMERICA", "AMERICA$ARGENTINA", "AMERICA$INDIANA", "AMERICA$KENTUCKY", "AMERICA$NORTH_DAKOTA", "ANTARCTICA", "ASIA", "ATLANTIC", "AUSTRALIA", "EUROPE", "INDIAN", "PACIFIC");
        } catch (ClassNotFoundException unused) {
            listL = Collections.EMPTY_LIST;
        }
        HashMap map = new HashMap();
        p pVar = p.f94822k;
        map.put("Z", pVar);
        map.put("UT", pVar);
        map.put("UTC", pVar);
        map.put("GMT", pVar);
        map.put("UTC0", pVar);
        map.put("GMT0", pVar);
        Iterator<Class<? extends k>> it = listL.iterator();
        while (it.hasNext()) {
            for (k kVar : (k[]) it.next().getEnumConstants()) {
                map.put(kVar.a(), kVar);
            }
        }
        f94769l = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        s(map2);
        f94770m = Collections.unmodifiableMap(map2);
        r rVarR = null;
        for (r rVar : net.time4j.base.d.c().g(r.class)) {
            String name = rVar.getName();
            if (name.equals("TZDB")) {
                rVarR = r(rVar, rVarR);
            } else if (!name.isEmpty() && !name.equals("DEFAULT")) {
                f94776s.put(name, rVar);
            }
        }
        sVarA = null;
        for (s sVarA : net.time4j.base.d.c().g(s.class)) {
        }
        d dVar = new d(K);
        f94771n = dVar;
        if (sVarA == null) {
            sVarA = dVar.a();
        }
        f94777t = sVarA;
        ConcurrentMap<String, r> concurrentMap = f94776s;
        concurrentMap.put("java.util.TimeZone", dVar);
        if (rVarR == null) {
            f94772o = dVar;
        } else {
            concurrentMap.put("TZDB", rVarR);
            f94772o = rVarR;
        }
        try {
            String property = System.getProperty("user.timezone");
            if ("Z".equals(property) || "UTC".equals(property)) {
                K = p.f94822k.k();
            } else if (property != null) {
                K = F(P(property), property, false);
            }
        } catch (SecurityException unused2) {
        }
        if (K == 0) {
            f94778u = v();
        } else {
            f94778u = K;
        }
        if (f94764g) {
            f94766i = f94778u;
        }
        f94765h = new e();
    }

    l() {
    }

    public static Set<k> C(Locale locale, boolean z11, String str) {
        r rVarD = D(str);
        if (rVarD == null) {
            return Collections.EMPTY_SET;
        }
        s sVarA = rVarD.a();
        if (sVarA == null) {
            sVarA = f94777t;
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it = sVarA.b(locale, z11).iterator();
        while (it.hasNext()) {
            hashSet.add(P(it.next()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static r D(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing zone model provider.");
        }
        return str.equals("DEFAULT") ? f94772o : f94776s.get(str);
    }

    private static l F(k kVar, String str, boolean z11) {
        l lVarH;
        String strSubstring;
        ConcurrentMap<String, c> concurrentMap = f94773p;
        c cVar = concurrentMap.get(str);
        if (cVar != null) {
            lVarH = cVar.get();
            if (lVarH == null) {
                concurrentMap.remove(cVar.f94779a);
            }
        } else {
            lVarH = null;
        }
        if (lVarH != null) {
            return lVarH;
        }
        String strSubstring2 = "";
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                strSubstring = str;
                break;
            }
            if (str.charAt(i11) == '~') {
                strSubstring2 = str.substring(0, i11);
                strSubstring = str.substring(i11 + 1);
                break;
            }
            i11++;
        }
        if (strSubstring.isEmpty()) {
            if (z11) {
                throw new IllegalArgumentException("Timezone key is empty.");
            }
            return null;
        }
        r rVar = f94772o;
        boolean z12 = strSubstring2.isEmpty() || strSubstring2.equals("DEFAULT");
        if (!z12 && (rVar = f94776s.get(strSubstring2)) == null) {
            if (!z11) {
                return null;
            }
            throw new IllegalArgumentException((strSubstring2.equals("TZDB") ? "TZDB provider not available: " : "Timezone model provider not registered: ") + str);
        }
        if (kVar == null) {
            if (z12) {
                kVar = P(strSubstring);
                if (kVar instanceof p) {
                    return ((p) kVar).k();
                }
            } else {
                kVar = new net.time4j.tz.e(str);
            }
        }
        if (rVar == f94771n) {
            h hVar = new h(kVar, strSubstring);
            if (!hVar.T() || strSubstring.equals("GMT") || strSubstring.startsWith("UT") || strSubstring.equals("Z")) {
                lVarH = hVar;
            }
        } else {
            m mVarLoad = rVar.load(strSubstring);
            lVarH = mVarLoad == null ? H(rVar, kVar, strSubstring) : new net.time4j.tz.c(kVar, mVarLoad);
        }
        if (lVarH == null) {
            if (!z11) {
                return null;
            }
            if (TimeZone.getDefault().getID().equals(str)) {
                return new h(new net.time4j.tz.e(str));
            }
            throw new IllegalArgumentException("Unknown timezone: " + str);
        }
        if (f94767j) {
            c cVarPutIfAbsent = f94773p.putIfAbsent(str, new c(lVarH, f94774q));
            if (cVarPutIfAbsent == null) {
                synchronized (l.class) {
                    try {
                        f94775r.addFirst(lVarH);
                        while (true) {
                            LinkedList<l> linkedList = f94775r;
                            if (linkedList.size() >= f94768k) {
                                linkedList.removeLast();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return lVarH;
            }
            l lVar = cVarPutIfAbsent.get();
            if (lVar != null) {
                return lVar;
            }
        }
        return lVarH;
    }

    private static l G(k kVar, boolean z11) {
        return kVar instanceof p ? ((p) kVar).k() : F(kVar, kVar.a(), z11);
    }

    private static l H(r rVar, k kVar, String str) {
        Map<String, String> mapE = rVar.e();
        String str2 = str;
        m mVarLoad = null;
        while (mVarLoad == null) {
            str2 = mapE.get(str2);
            if (str2 == null) {
                break;
            }
            mVarLoad = rVar.load(str2);
        }
        if (mVarLoad != null) {
            return new net.time4j.tz.c(kVar, mVarLoad);
        }
        String strD = rVar.d();
        if (strD.isEmpty()) {
            return null;
        }
        if (strD.equals(rVar.getName())) {
            throw new IllegalArgumentException("Circular zone model provider fallback: " + rVar.getName());
        }
        return new net.time4j.tz.a(kVar, M(strD + "~" + str));
    }

    private static List<Class<? extends k>> L(ClassLoader classLoader, String... strArr) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName("net.time4j.tz.olson." + str, true, classLoader);
            if (k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l M(String str) {
        return F(null, str, true);
    }

    public static l N(k kVar) {
        return G(kVar, true);
    }

    public static l O() {
        return (!f94764g || f94766i == null) ? f94778u : f94766i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k P(String str) {
        k kVar = f94769l.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (str.startsWith("GMT")) {
            str = "UTC" + str.substring(3);
        }
        p pVarS = p.s(str, false);
        return pVarS == null ? new net.time4j.tz.e(str) : pVarS;
    }

    private static r r(r rVar, r rVar2) {
        String version = rVar.getVersion();
        if (!version.isEmpty()) {
            String str = f94759b;
            if (version.equals(str) || (str == null && (rVar2 == null || version.compareTo(rVar2.getVersion()) > 0 || (version.compareTo(rVar2.getVersion()) == 0 && !rVar.getLocation().contains("{java.home}"))))) {
                return rVar;
            }
        }
        return rVar2;
    }

    private static void s(Map<String, k> map) {
        p pVar = p.f94822k;
        map.put("Etc/GMT", pVar);
        map.put("Etc/Greenwich", pVar);
        map.put("Etc/Universal", pVar);
        map.put("Etc/Zulu", pVar);
        map.put("Etc/GMT+0", pVar);
        map.put("Etc/GMT-0", pVar);
        map.put("Etc/GMT0", pVar);
        map.put("Etc/UTC", pVar);
        map.put("Etc/UCT", pVar);
        map.put("Etc/GMT-14", p.p(50400));
        map.put("Etc/GMT-13", p.p(46800));
        map.put("Etc/GMT-12", p.p(43200));
        map.put("Etc/GMT-11", p.p(39600));
        map.put("Etc/GMT-10", p.p(36000));
        map.put("Etc/GMT-9", p.p(32400));
        map.put("Etc/GMT-8", p.p(28800));
        map.put("Etc/GMT-7", p.p(25200));
        map.put("Etc/GMT-6", p.p(21600));
        map.put("Etc/GMT-5", p.p(18000));
        map.put("Etc/GMT-4", p.p(14400));
        map.put("Etc/GMT-3", p.p(10800));
        map.put("Etc/GMT-2", p.p(7200));
        map.put("Etc/GMT-1", p.p(3600));
        map.put("Etc/GMT+1", p.p(-3600));
        map.put("Etc/GMT+2", p.p(-7200));
        map.put("Etc/GMT+3", p.p(-10800));
        map.put("Etc/GMT+4", p.p(-14400));
        map.put("Etc/GMT+5", p.p(-18000));
        map.put("Etc/GMT+6", p.p(-21600));
        map.put("Etc/GMT+7", p.p(-25200));
        map.put("Etc/GMT+8", p.p(-28800));
        map.put("Etc/GMT+9", p.p(-32400));
        map.put("Etc/GMT+10", p.p(-36000));
        map.put("Etc/GMT+11", p.p(-39600));
        map.put("Etc/GMT+12", p.p(-43200));
    }

    public static List<k> t() {
        return f94765h.f94780a;
    }

    public static List<k> u(String str) {
        if (str.equals("INCLUDE_ALIAS")) {
            return f94765h.f94781b;
        }
        r rVarD = D(str);
        if (rVarD == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = rVarD.g().iterator();
        while (it.hasNext()) {
            arrayList.add(P(it.next()));
        }
        Collections.sort(arrayList, f94760c);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l v() {
        String id2 = TimeZone.getDefault().getID();
        l lVarF = F(null, id2, false);
        return lVarF == null ? new h(new net.time4j.tz.e(id2)) : lVarF;
    }

    public static String x(k kVar, net.time4j.tz.d dVar, Locale locale) {
        String strSubstring;
        String strA = kVar.a();
        int iIndexOf = strA.indexOf(126);
        r rVar = f94772o;
        if (iIndexOf >= 0) {
            String strSubstring2 = strA.substring(0, iIndexOf);
            if (strSubstring2.equals("DEFAULT") || (rVar = f94776s.get(strSubstring2)) != null) {
                strSubstring = strA.substring(iIndexOf + 1);
            }
            return strA;
        }
        strSubstring = strA;
        s sVarA = rVar.a();
        if (sVarA == null) {
            sVarA = f94777t;
        }
        String strF = sVarA.f(strSubstring, dVar, locale);
        if (strF.isEmpty()) {
            s sVar = f94777t;
            if (sVarA != sVar) {
                strF = sVar.f(strSubstring, dVar, locale);
            }
            if (strF.isEmpty()) {
                return strA;
            }
        }
        return strF;
    }

    public abstract p A(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public abstract p B(net.time4j.base.f fVar);

    public abstract o E();

    public abstract boolean I(net.time4j.base.f fVar);

    public abstract boolean J();

    public abstract boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public abstract l Q(o oVar);

    public String w(net.time4j.tz.d dVar, Locale locale) {
        return x(z(), dVar, locale);
    }

    public abstract m y();

    public abstract k z();
}
