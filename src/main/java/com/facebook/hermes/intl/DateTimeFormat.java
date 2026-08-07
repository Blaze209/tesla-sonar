package com.facebook.hermes.intl;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f21597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f21598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f21599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f21600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f21601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f21602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f21603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f21604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f21605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f21606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f21607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f21608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0434b f21609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f21610u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private em.b<?> f21591b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private em.b<?> f21592c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f21611v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f21590a = new i();

    @in.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        c(list, map);
        this.f21590a.d(this.f21591b, this.f21593d ? "" : this.f21594e, this.f21595f ? "" : this.f21596g, this.f21599j, this.f21600k, this.f21601l, this.f21602m, this.f21603n, this.f21604o, this.f21605p, this.f21606q, this.f21607r, this.f21608s, this.f21598i, this.f21611v, this.f21609t, this.f21610u, this.f21597h);
    }

    private Object a() {
        return this.f21590a.h(this.f21591b);
    }

    private Object b(Object obj, String str, String str2) throws JSRangeErrorException {
        if (!em.d.l(obj)) {
            throw new JSRangeErrorException("Invalid options object !");
        }
        boolean z11 = true;
        if (str.equals(InquiryField.DateField.TYPE) || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i11 = 0; i11 < 4; i11++) {
                if (!em.d.n(em.d.a(obj, strArr[i11]))) {
                    z11 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i12 = 0; i12 < 3; i12++) {
                if (!em.d.n(em.d.a(obj, strArr2[i12]))) {
                    z11 = false;
                }
            }
        }
        if (!em.d.n(em.d.a(obj, "dateStyle")) || !em.d.n(em.d.a(obj, "timeStyle"))) {
            z11 = false;
        }
        if (z11 && (str2.equals(InquiryField.DateField.TYPE) || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i13 = 0; i13 < 3; i13++) {
                em.d.c(obj, strArr3[i13], "numeric");
            }
        }
        if (z11 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i14 = 0; i14 < 3; i14++) {
                em.d.c(obj, strArr4[i14], "numeric");
            }
        }
        return obj;
    }

    private void c(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", InquiryField.DateField.TYPE);
        Object objQ = em.d.q();
        g.a aVar = g.a.STRING;
        em.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, em.a.f63061a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, em.d.d(), em.d.d());
        if (!em.d.n(objC) && !d(em.d.h(objC))) {
            throw new JSRangeErrorException("Invalid calendar option !");
        }
        em.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, em.d.d(), em.d.d());
        if (!em.d.n(objC2) && !d(em.d.h(objC2))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        em.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, em.d.d(), em.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, em.d.d());
        if (!em.d.n(objC3)) {
            objC4 = em.d.b();
        }
        em.d.c(objQ, "hc", objC4);
        HashMap<String, Object> mapA = f.a(list, objQ, listAsList);
        em.b<?> bVar = (em.b) em.d.g(mapA).get("locale");
        this.f21591b = bVar;
        this.f21592c = bVar.f();
        Object objA = em.d.a(mapA, "ca");
        if (em.d.j(objA)) {
            this.f21593d = true;
            this.f21594e = this.f21590a.g(this.f21591b);
        } else {
            this.f21593d = false;
            this.f21594e = em.d.h(objA);
        }
        Object objA2 = em.d.a(mapA, "nu");
        if (em.d.j(objA2)) {
            this.f21595f = true;
            this.f21596g = this.f21590a.b(this.f21591b);
        } else {
            this.f21595f = false;
            this.f21596g = em.d.h(objA2);
        }
        Object objA3 = em.d.a(mapA, "hc");
        Object objA4 = em.d.a(objB, "timeZone");
        this.f21611v = em.d.n(objA4) ? a() : e(objA4.toString());
        this.f21599j = (b.e) g.d(b.e.class, em.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f21600k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{"long", "short", "narrow"}, em.d.d()));
        this.f21601l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{"long", "short", "narrow"}, em.d.d()));
        this.f21602m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, em.d.d()));
        this.f21603n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, em.d.d()));
        this.f21604o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, em.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, em.d.d());
        this.f21605p = (b.f) g.d(b.f.class, objC5);
        this.f21606q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, em.d.d()));
        this.f21607r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, em.d.d()));
        this.f21608s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, em.d.d()));
        this.f21609t = (b.EnumC0434b) g.d(b.EnumC0434b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, em.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, em.d.d());
        this.f21610u = (b.k) g.d(b.k.class, objC6);
        if (em.d.n(objC5) && em.d.n(objC6)) {
            this.f21598i = b.g.UNDEFINED;
        } else {
            b.g gVarF = this.f21590a.f(this.f21591b);
            b.g gVar = em.d.j(objA3) ? gVarF : (b.g) g.d(b.g.class, objA3);
            if (!em.d.n(objC3)) {
                if (em.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarF != gVar && gVarF != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarF == b.g.H11 || gVarF == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f21598i = gVar;
        }
        this.f21597h = objC3;
    }

    private boolean d(String str) {
        return em.c.e(str, 0, str.length() - 1);
    }

    @in.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = em.d.h(g.c(map, "localeMatcher", g.a.STRING, em.a.f63061a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) throws JSRangeErrorException {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new JSRangeErrorException("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    @in.a
    public String format(double d11) {
        return this.f21590a.c(d11);
    }

    @in.a
    public List<Map<String, String>> formatToParts(double d11) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f21590a.a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strE = it.hasNext() ? this.f21590a.e(it.next(), sb2.toString()) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strE);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @in.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f21592c.g());
        linkedHashMap.put("numberingSystem", this.f21596g);
        linkedHashMap.put("calendar", this.f21594e);
        linkedHashMap.put("timeZone", this.f21611v);
        b.g gVar = this.f21598i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f21598i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f21600k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f21601l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f21602m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f21603n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f21604o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f21605p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f21606q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f21607r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f21608s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0434b enumC0434b = this.f21609t;
        if (enumC0434b != b.EnumC0434b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0434b.toString());
        }
        b.k kVar = this.f21610u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
