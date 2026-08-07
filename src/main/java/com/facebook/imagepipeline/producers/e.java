package com.facebook.imagepipeline.producers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<String> f21774n = pk.h.a("id", "uri_source");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f21775o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.request.a f21776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f21779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f21780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.facebook.imagepipeline.request.a.c f21781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f21782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private om.e f21784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<b1> f21787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final pm.v f21788m;

    public e(com.facebook.imagepipeline.request.a aVar, String str, c1 c1Var, Object obj, com.facebook.imagepipeline.request.a.c cVar, boolean z11, boolean z12, om.e eVar, pm.v vVar) {
        this(aVar, str, null, null, c1Var, obj, cVar, z11, z12, eVar, vVar);
    }

    public static void a(List<b1> list) {
        if (list == null) {
            return;
        }
        Iterator<b1> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void b(List<b1> list) {
        if (list == null) {
            return;
        }
        Iterator<b1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void d(List<b1> list) {
        if (list == null) {
            return;
        }
        Iterator<b1> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public static void e(List<b1> list) {
        if (list == null) {
            return;
        }
        Iterator<b1> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public com.facebook.imagepipeline.request.a B() {
        return this.f21776a;
    }

    @Override // am.a
    public void C(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            o(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public void H(b1 b1Var) {
        boolean z11;
        synchronized (this) {
            this.f21787l.add(b1Var);
            z11 = this.f21786k;
        }
        if (z11) {
            b1Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public void I(String str, String str2) {
        this.f21782g.put("origin", str);
        this.f21782g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public String J() {
        return this.f21778c;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public void T(String str) {
        I(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public synchronized boolean b0() {
        return this.f21785j;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public Object c() {
        return this.f21780e;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public synchronized boolean c0() {
        return this.f21783h;
    }

    @Override // am.a
    public <T> T e0(String str) {
        return (T) this.f21782g.get(str);
    }

    public void f() {
        a(g());
    }

    public synchronized List<b1> g() {
        if (this.f21786k) {
            return null;
        }
        this.f21786k = true;
        return new ArrayList(this.f21787l);
    }

    @Override // am.a
    public Map<String, Object> getExtras() {
        return this.f21782g;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public String getId() {
        return this.f21777b;
    }

    public synchronized List<b1> h(boolean z11) {
        if (z11 == this.f21785j) {
            return null;
        }
        this.f21785j = z11;
        return new ArrayList(this.f21787l);
    }

    public synchronized List<b1> i(boolean z11) {
        if (z11 == this.f21783h) {
            return null;
        }
        this.f21783h = z11;
        return new ArrayList(this.f21787l);
    }

    public synchronized List<b1> j(om.e eVar) {
        if (eVar == this.f21784i) {
            return null;
        }
        this.f21784i = eVar;
        return new ArrayList(this.f21787l);
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public com.facebook.imagepipeline.request.a.c k0() {
        return this.f21781f;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public pm.v n() {
        return this.f21788m;
    }

    @Override // am.a
    public void o(String str, Object obj) {
        if (f21774n.contains(str)) {
            return;
        }
        this.f21782g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public c1 p() {
        return this.f21779d;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public synchronized om.e t() {
        return this.f21784i;
    }

    public e(com.facebook.imagepipeline.request.a aVar, String str, String str2, Map<String, ?> map, c1 c1Var, Object obj, com.facebook.imagepipeline.request.a.c cVar, boolean z11, boolean z12, om.e eVar, pm.v vVar) {
        this.f21776a = aVar;
        this.f21777b = str;
        HashMap map2 = new HashMap();
        this.f21782g = map2;
        map2.put("id", str);
        map2.put("uri_source", aVar == null ? "null-request" : aVar.v());
        C(map);
        this.f21778c = str2;
        this.f21779d = c1Var;
        this.f21780e = obj == null ? f21775o : obj;
        this.f21781f = cVar;
        this.f21783h = z11;
        this.f21784i = eVar;
        this.f21785j = z12;
        this.f21786k = false;
        this.f21787l = new ArrayList();
        this.f21788m = vVar;
    }
}
