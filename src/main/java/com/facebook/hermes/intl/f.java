package com.facebook.hermes.intl;

import expo.modules.contacts.Columns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static HashMap<String, Object> a(List<String> list, Object obj, List<String> list2) {
        Object obj2;
        Object objO;
        Object objR;
        HashMap<String, Object> map = new HashMap<>();
        e.a aVarF = em.d.h(em.d.a(obj, "localeMatcher")).equals(Columns.LOOKUP_KEY) ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object objB = em.d.b();
            if (!aVarF.f21658b.isEmpty() && aVarF.f21658b.containsKey(str)) {
                String str2 = aVarF.f21658b.get(str);
                if (str2.isEmpty()) {
                    obj2 = objB;
                    obj2 = objB;
                    objR = str2;
                    objR = em.d.r("true");
                }
                obj2 = objB;
                obj2 = objB;
                objR = str2;
                hashSet.add(str);
                obj2 = objR;
            }
            obj2 = objB;
            obj2 = objB;
            obj2 = objB;
            Object obj3 = obj2;
            if (em.d.g(obj).containsKey(str)) {
                Object objA = em.d.a(obj, str);
                if (em.d.m(objA) && em.d.h(objA).isEmpty()) {
                    objO = objA;
                    objO = objA;
                    objO = em.d.o(true);
                }
                objO = objA;
                objO = objA;
                objO = objA;
                obj3 = obj2;
                if (!em.d.n(objO) && !objO.equals(obj2)) {
                    obj3 = obj2;
                    hashSet.remove(str);
                    obj3 = objO;
                }
            }
            obj3 = obj2;
            boolean zJ = em.d.j(obj3);
            Object objF = obj3;
            if (!zJ) {
                objF = em.g.f(str, obj3);
            }
            if (!em.d.m(objF) || em.g.c(str, em.d.h(objF), aVarF.f21657a)) {
                map.put(str, objF);
            } else {
                map.put(str, em.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String strH = em.d.h(em.g.f(str3, em.d.r(aVarF.f21658b.get(str3))));
            if (!em.d.m(strH) || em.g.c(str3, em.d.h(strH), aVarF.f21657a)) {
                arrayList.add(strH);
                aVarF.f21657a.c(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f21657a);
        return map;
    }
}
