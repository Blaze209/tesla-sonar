package com.android.volley.toolbox;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    static List<com.android.volley.e> a(List<com.android.volley.e> list, com.android.volley.a.C0410a c0410a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.android.volley.e> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.e> list2 = c0410a.f20164h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.e eVar : c0410a.f20164h) {
                    if (!treeSet.contains(eVar.a())) {
                        arrayList.add(eVar);
                    }
                }
            }
        } else if (!c0410a.f20163g.isEmpty()) {
            for (Map.Entry<String, String> entry : c0410a.f20163g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j11) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j11));
    }

    static Map<String, String> c(com.android.volley.a.C0410a c0410a) {
        if (c0410a == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = c0410a.f20158b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j11 = c0410a.f20160d;
        if (j11 > 0) {
            map.put("If-Modified-Since", b(j11));
        }
        return map;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static com.android.volley.a.C0410a e(com.android.volley.h hVar) {
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = hVar.f20193c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jG = str != null ? g(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i11 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z11 = false;
            j12 = 0;
            j13 = 0;
            while (i11 < strArrSplit.length) {
                String strTrim = strArrSplit[i11].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j13 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z11 = true;
                }
                i11++;
            }
            j11 = 0;
            i11 = 1;
        } else {
            j11 = 0;
            z11 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = map.get("Expires");
        long jG2 = str3 != null ? g(str3) : j11;
        String str4 = map.get("Last-Modified");
        long jG3 = str4 != null ? g(str4) : j11;
        String str5 = map.get("ETag");
        if (i11 != 0) {
            long j16 = jCurrentTimeMillis + (j12 * 1000);
            j15 = z11 ? j16 : (j13 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (jG <= j11 || jG2 < jG) ? j11 : jCurrentTimeMillis + (jG2 - jG);
            j15 = j14;
        }
        com.android.volley.a.C0410a c0410a = new com.android.volley.a.C0410a();
        c0410a.f20157a = hVar.f20192b;
        c0410a.f20158b = str5;
        c0410a.f20162f = j14;
        c0410a.f20161e = j15;
        c0410a.f20159c = jG;
        c0410a.f20160d = jG3;
        c0410a.f20163g = map;
        c0410a.f20164h = hVar.f20194d;
        return c0410a;
    }

    public static String f(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                String[] strArrSplit2 = strArrSplit[i11].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long g(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e11) {
            if (WebrtcBuildVersion.maint_version.equals(str) || "-1".equals(str)) {
                com.android.volley.n.e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.n.d(e11, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static List<com.android.volley.e> h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> i(List<com.android.volley.e> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.e eVar : list) {
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }
}
