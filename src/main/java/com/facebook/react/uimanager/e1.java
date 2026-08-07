package com.facebook.react.uimanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class e1 {
    static Map<String, Object> a(q1 q1Var) {
        Map<String, Object> mapB = d1.b();
        mapB.put("ViewManagerNames", new ArrayList(q1Var.a()));
        mapB.put("LazyViewManagersEnabled", Boolean.TRUE);
        return mapB;
    }

    static Map<String, Object> b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> mapB = d1.b();
        Map<? extends String, ? extends Object> mapA = d1.a();
        Map<? extends String, ? extends Object> mapC = d1.c();
        if (map != null) {
            map.putAll(mapA);
        }
        if (map2 != null) {
            map2.putAll(mapC);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            Map<String, Object> mapC2 = c(viewManager, null, null, map, map2);
            if (!mapC2.isEmpty()) {
                mapB.put(name, mapC2);
            }
        }
        mapB.put("genericBubblingEventTypes", mapA);
        mapB.put("genericDirectEventTypes", mapC);
        return mapB;
    }

    static Map<String, Object> c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap mapB = jn.c.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (tn.b.f() && tn.b.n()) {
                exportedCustomBubblingEventTypeConstants = e(exportedCustomBubblingEventTypeConstants);
            }
            f(map3, exportedCustomBubblingEventTypeConstants);
            f(exportedCustomBubblingEventTypeConstants, map);
            mapB.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            mapB.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        g(viewManager.getName(), exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (tn.b.f() && tn.b.n()) {
                exportedCustomDirectEventTypeConstants = e(exportedCustomDirectEventTypeConstants);
            }
            f(map4, exportedCustomDirectEventTypeConstants);
            f(exportedCustomDirectEventTypeConstants, map2);
            mapB.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            mapB.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            mapB.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            mapB.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            mapB.put("NativeProps", nativeProps);
        }
        return mapB;
    }

    public static Map<String, Object> d() {
        return jn.c.e("bubblingEventTypes", d1.a(), "directEventTypes", d1.c());
    }

    static Map e(Map map) {
        if (map == null) {
            return null;
        }
        HashSet<String> hashSet = new HashSet();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.startsWith("top")) {
                    hashSet.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        for (String str2 : hashSet) {
            map.put("top" + (str2.startsWith(DebugKt.DEBUG_PROPERTY_VALUE_ON) ? str2.substring(2) : str2.substring(0, 1).toUpperCase() + str2.substring(1)), map.get(str2));
        }
        return map;
    }

    private static void f(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                if (!(obj3 instanceof HashMap)) {
                    HashMap map3 = new HashMap((Map) obj3);
                    map.replace(obj, map3);
                    obj3 = map3;
                }
                f((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }

    private static void g(String str, Map<String, Object> map) {
        String str2;
        if (!ln.a.DEBUG || map == null) {
            return;
        }
        for (String str3 : map.keySet()) {
            Object obj = map.get(str3);
            if (obj != null && (obj instanceof Map) && (str2 = (String) ((Map) obj).get("registrationName")) != null && str3.startsWith("top") && str2.startsWith(DebugKt.DEBUG_PROPERTY_VALUE_ON) && !str3.substring(3).equals(str2.substring(2))) {
                qk.a.m("UIManagerModuleConstantsHelper", String.format("Direct event name for '%s' doesn't correspond to the naming convention, expected 'topEventName'->'onEventName', got '%s'->'%s'", str, str3, str2));
            }
        }
    }
}
