package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, String> f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f20062b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    private static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            String str = (String) arrayList.get(i11);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            if (i11 != 0) {
                str3 = "&";
            }
            sb2.append(str3);
            sb2.append(str);
            sb2.append("=");
            sb2.append(str2);
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        TreeMap treeMap;
        try {
            a(context, map);
            treeMap = new TreeMap();
            for (String str : f20062b) {
                if (f20061a.containsKey(str)) {
                    treeMap.put(str, f20061a.get(str));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ug.b.a(a(treeMap));
    }

    private static synchronized void c(Context context, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        f20061a = treeMap;
        treeMap.putAll(b.a(context, map));
        f20061a.putAll(d.a(context));
        f20061a.putAll(c.a(context));
        f20061a.putAll(a.a(context, map));
    }

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        try {
            if (f20061a == null) {
                c(context, map);
            }
            f20061a.putAll(d.b(context));
        } catch (Throwable th2) {
            throw th2;
        }
        return f20061a;
    }

    public static synchronized void a() {
        f20061a = null;
    }
}
