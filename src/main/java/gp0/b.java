package gp0;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.i18n.e;
import net.time4j.tz.d;
import net.time4j.tz.s;

/* JADX INFO: loaded from: classes9.dex */
public class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Locale, Map<String, Map<d, String>>> f69324a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f69325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Set<String>> f69326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f69327d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        f69325b = Collections.unmodifiableSet(hashSet);
        HashMap map = new HashMap();
        g(map, "data/zone1970.tab");
        f69326c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        a(map2, "CL", "America/Santiago");
        a(map2, "CN", "Asia/Shanghai");
        a(map2, "DE", "Europe/Berlin");
        a(map2, "EC", "America/Guayaquil");
        a(map2, "ES", "Europe/Madrid");
        a(map2, "MH", "Pacific/Majuro");
        a(map2, "MY", "Asia/Kuala_Lumpur");
        a(map2, "NZ", "Pacific/Auckland");
        a(map2, "PT", "Europe/Lisbon");
        a(map2, "UA", "Europe/Kiev");
        a(map2, "UZ", "Asia/Tashkent");
        f69327d = Collections.unmodifiableMap(map2);
    }

    private static void a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    private static void d(Map<String, Set<String>> map, String str, String str2) {
        Set<String> linkedHashSet = map.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(str, linkedHashSet);
        }
        linkedHashSet.add(str2);
    }

    private static e e(Locale locale) {
        return e.h("olson/zones/tzname", locale);
    }

    static void g(Map<String, Set<String>> map, String str) {
        InputStream inputStreamE = net.time4j.base.d.c().e(net.time4j.base.d.c().f("olson", b.class, str), true);
        if (inputStreamE == null) {
            inputStreamE = b.class.getClassLoader().getResourceAsStream(str);
        }
        try {
            if (inputStreamE == null) {
                System.err.println("Warning: File \"" + str + "\" not found.");
                return;
            }
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamE, "UTF-8"));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                inputStreamE.close();
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace(System.err);
                                return;
                            }
                        }
                        if (!line.startsWith("#") && !line.isEmpty()) {
                            String[] strArrSplit = line.split(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
                            if (strArrSplit.length >= 3) {
                                for (String str2 : strArrSplit[0].split(",")) {
                                    d(map, str2, strArrSplit[2]);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } catch (IOException e12) {
                    throw new IllegalStateException(e12);
                }
            } catch (UnsupportedEncodingException e13) {
                throw new AssertionError(e13);
            }
        } catch (Throwable th2) {
            try {
                inputStreamE.close();
            } catch (IOException e14) {
                e14.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.tz.s
    public Set<String> b(Locale locale, boolean z11) {
        String country = locale.getCountry();
        if (z11) {
            if (country.equals("US")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add("America/New_York");
                linkedHashSet.add("America/Chicago");
                linkedHashSet.add("America/Denver");
                linkedHashSet.add("America/Los_Angeles");
                linkedHashSet.add("America/Anchorage");
                linkedHashSet.add("Pacific/Honolulu");
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = f69327d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set<String> set = f69326c.get(country);
        return set == null ? Collections.EMPTY_SET : set;
    }

    @Override // net.time4j.tz.s
    public String c(boolean z11, Locale locale) {
        return e(locale).f(z11 ? "utc-literal" : "offset-pattern");
    }

    @Override // net.time4j.tz.s
    public String f(String str, d dVar, Locale locale) {
        if (f69325b.contains(str)) {
            return "";
        }
        Map<String, Map<d, String>> mapPutIfAbsent = f69324a.get(locale);
        if (mapPutIfAbsent == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap map = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(d.class);
                enumMap.put(d.LONG_STANDARD_TIME, strArr[1]);
                enumMap.put(d.SHORT_STANDARD_TIME, strArr[2]);
                enumMap.put(d.LONG_DAYLIGHT_TIME, strArr[3]);
                enumMap.put(d.SHORT_DAYLIGHT_TIME, strArr[4]);
                map.put(strArr[0], enumMap);
            }
            mapPutIfAbsent = f69324a.putIfAbsent(locale, map);
            if (mapPutIfAbsent == null) {
                mapPutIfAbsent = map;
            }
        }
        Map<d, String> map2 = mapPutIfAbsent.get(str);
        return map2 != null ? map2.get(dVar) : "";
    }
}
