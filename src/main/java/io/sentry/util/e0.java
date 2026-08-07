package io.sentry.util;

import io.sentry.k7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Boolean> f81457a = new ConcurrentHashMap();

    public static List<String> a(k7 k7Var) {
        ArrayList arrayList = new ArrayList();
        k7 k7Var2 = k7.AGENT;
        if (k7Var2 == k7Var || k7.AGENTLESS_SPRING == k7Var) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.http.spring7.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.spring7.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring7.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring7.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.spring7.resttemplate");
            arrayList.add("auto.http.openfeign");
            arrayList.add("auto.http.ktor-client");
        }
        if (k7Var2 == k7Var) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    public static boolean b(List<io.sentry.f0> list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Map<String, Boolean> map = f81457a;
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            Iterator<io.sentry.f0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    f81457a.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator<io.sentry.f0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().b(str)) {
                        f81457a.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            f81457a.put(str, Boolean.FALSE);
        }
        return false;
    }
}
