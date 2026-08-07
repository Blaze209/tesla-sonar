package j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f82159a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f82160b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f82161c = new z();

    public String c(j$.time.temporal.p pVar, long j11, e0 e0Var, Locale locale) {
        Object objA = a(pVar, locale);
        if (objA instanceof y) {
            return ((y) objA).a(j11, e0Var);
        }
        return null;
    }

    public String b(j$.time.chrono.l lVar, j$.time.temporal.p pVar, long j11, e0 e0Var, Locale locale) {
        if (lVar == j$.time.chrono.s.f82037c || !(pVar instanceof j$.time.temporal.a)) {
            return c(pVar, j11, e0Var, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.p pVar, e0 e0Var, Locale locale) {
        List list;
        Object objA = a(pVar, locale);
        if (!(objA instanceof y) || (list = (List) ((HashMap) ((y) objA).f82158b).get(e0Var)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(j$.time.chrono.l lVar, j$.time.temporal.p pVar, e0 e0Var, Locale locale) {
        if (lVar == j$.time.chrono.s.f82037c || !(pVar instanceof j$.time.temporal.a)) {
            return e(pVar, e0Var, locale);
        }
        return null;
    }

    public static Object a(j$.time.temporal.p pVar, Locale locale) {
        Object yVar;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        Object obj = ((ConcurrentHashMap) f82159a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (pVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i11 = 0; i11 < eras.length; i11++) {
                if (!eras[i11].isEmpty()) {
                    long j11 = i11;
                    map2.put(Long.valueOf(j11), eras[i11]);
                    Long lValueOf = Long.valueOf(j11);
                    String str = eras[i11];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(e0.FULL, map2);
                map.put(e0.SHORT, map2);
                map.put(e0.NARROW, map3);
            }
            yVar = new y(map);
        } else if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j12 = 1; j12 <= length; j12++) {
                String strB = j$.time.b.b(j12, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j12), strB);
                linkedHashMap2.put(Long.valueOf(j12), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j12), j$.time.b.b(j12, "LLL", locale));
            }
            if (length > 0) {
                map.put(e0.FULL_STANDALONE, linkedHashMap);
                map.put(e0.NARROW_STANDALONE, linkedHashMap2);
                map.put(e0.SHORT_STANDALONE, linkedHashMap3);
                map.put(e0.FULL, linkedHashMap);
                map.put(e0.NARROW, linkedHashMap2);
                map.put(e0.SHORT, linkedHashMap3);
            }
            yVar = new y(map);
        } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z11 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j13 = 1; j13 <= length2; j13++) {
                String strA = j$.time.b.a(j13, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j13), strA);
                Long lValueOf2 = Long.valueOf(j13);
                if (!z11) {
                    strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j13), j$.time.b.a(j13, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(e0.FULL_STANDALONE, linkedHashMap4);
                map.put(e0.NARROW_STANDALONE, linkedHashMap5);
                map.put(e0.SHORT_STANDALONE, linkedHashMap6);
                map.put(e0.FULL, linkedHashMap4);
                map.put(e0.NARROW, linkedHashMap5);
                map.put(e0.SHORT, linkedHashMap6);
            }
            yVar = new y(map);
        } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i12 = 0; i12 < amPmStrings.length; i12++) {
                if (!amPmStrings[i12].isEmpty()) {
                    long j14 = i12;
                    map4.put(Long.valueOf(j14), amPmStrings[i12]);
                    Long lValueOf3 = Long.valueOf(j14);
                    String str2 = amPmStrings[i12];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(e0.FULL, map4);
                map.put(e0.SHORT, map4);
                map.put(e0.NARROW, map5);
            }
            yVar = new y(map);
        } else {
            yVar = "";
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f82159a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
