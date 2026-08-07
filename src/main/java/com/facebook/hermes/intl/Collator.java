package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f21581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f21582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21583c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f21586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private em.b<?> f21587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private em.b<?> f21588h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21584d = "default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f21589i = new h();

    @in.a
    public Collator(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        a(list, map);
        this.f21589i.c(this.f21587g).g(this.f21585e).f(this.f21586f).b(this.f21582b).e(this.f21583c);
    }

    private void a(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        g.a aVar = g.a.STRING;
        this.f21581a = (a.d) g.d(a.d.class, em.d.h(g.c(map, "usage", aVar, em.a.f63065e, "sort")));
        Object objQ = em.d.q();
        em.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, em.a.f63061a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, em.d.d(), em.d.d());
        if (!em.d.n(objC)) {
            objC = em.d.r(String.valueOf(em.d.e(objC)));
        }
        em.d.c(objQ, "kn", objC);
        em.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, em.a.f63064d, em.d.d()));
        HashMap<String, Object> mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        em.b<?> bVar = (em.b) em.d.g(mapA).get("locale");
        this.f21587g = bVar;
        this.f21588h = bVar.f();
        Object objA = em.d.a(mapA, "co");
        if (em.d.j(objA)) {
            objA = em.d.r("default");
        }
        this.f21584d = em.d.h(objA);
        Object objA2 = em.d.a(mapA, "kn");
        if (em.d.j(objA2)) {
            this.f21585e = false;
        } else {
            this.f21585e = Boolean.parseBoolean(em.d.h(objA2));
        }
        Object objA3 = em.d.a(mapA, "kf");
        if (em.d.j(objA3)) {
            objA3 = em.d.r("false");
        }
        this.f21586f = (a.b) g.d(a.b.class, em.d.h(objA3));
        if (this.f21581a == a.d.SEARCH) {
            ArrayList<String> arrayListE = this.f21587g.e("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList.add(em.g.e(it.next()));
            }
            arrayList.add(em.g.e("search"));
            this.f21587g.c("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, em.a.f63063c, em.d.d());
        if (!em.d.n(objC2)) {
            this.f21582b = (a.c) g.d(a.c.class, em.d.h(objC2));
        } else if (this.f21581a == a.d.SORT) {
            this.f21582b = a.c.VARIANT;
        } else {
            this.f21582b = a.c.LOCALE;
        }
        this.f21583c = em.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, em.d.d(), Boolean.FALSE));
    }

    @in.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return em.d.h(g.c(map, "localeMatcher", g.a.STRING, em.a.f63061a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    @in.a
    public double compare(String str, String str2) {
        return this.f21589i.a(str, str2);
    }

    @in.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f21588h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f21581a.toString());
        a.c cVar = this.f21582b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f21589i.d().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f21583c));
        linkedHashMap.put("collation", this.f21584d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f21585e));
        linkedHashMap.put("caseFirst", this.f21586f.toString());
        return linkedHashMap;
    }
}
