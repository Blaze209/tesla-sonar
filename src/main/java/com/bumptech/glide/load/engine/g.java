package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<jj.o.a<?>> f20586a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<dj.e> f20587b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f20588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f20589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class<?> f20592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f20593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private dj.h f20594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Class<?>, dj.l<?>> f20595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class<Transcode> f20596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private dj.e f20599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f20600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private fj.a f20601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20603r;

    g() {
    }

    void a() {
        this.f20588c = null;
        this.f20589d = null;
        this.f20599n = null;
        this.f20592g = null;
        this.f20596k = null;
        this.f20594i = null;
        this.f20600o = null;
        this.f20595j = null;
        this.f20601p = null;
        this.f20586a.clear();
        this.f20597l = false;
        this.f20587b.clear();
        this.f20598m = false;
    }

    gj.b b() {
        return this.f20588c.b();
    }

    List<dj.e> c() {
        if (!this.f20598m) {
            this.f20598m = true;
            this.f20587b.clear();
            List<jj.o.a<?>> listG = g();
            int size = listG.size();
            for (int i11 = 0; i11 < size; i11++) {
                jj.o.a<?> aVar = listG.get(i11);
                if (!this.f20587b.contains(aVar.f83874a)) {
                    this.f20587b.add(aVar.f83874a);
                }
                for (int i12 = 0; i12 < aVar.f83875b.size(); i12++) {
                    if (!this.f20587b.contains(aVar.f83875b.get(i12))) {
                        this.f20587b.add(aVar.f83875b.get(i12));
                    }
                }
            }
        }
        return this.f20587b;
    }

    hj.a d() {
        return this.f20593h.a();
    }

    fj.a e() {
        return this.f20601p;
    }

    int f() {
        return this.f20591f;
    }

    List<jj.o.a<?>> g() {
        if (!this.f20597l) {
            this.f20597l = true;
            this.f20586a.clear();
            List listI = this.f20588c.i().i(this.f20589d);
            int size = listI.size();
            for (int i11 = 0; i11 < size; i11++) {
                jj.o.a<?> aVarB = ((jj.o) listI.get(i11)).b(this.f20589d, this.f20590e, this.f20591f, this.f20594i);
                if (aVarB != null) {
                    this.f20586a.add(aVarB);
                }
            }
        }
        return this.f20586a;
    }

    <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f20588c.i().h(cls, this.f20592g, this.f20596k);
    }

    Class<?> i() {
        return this.f20589d.getClass();
    }

    List<jj.o<File, ?>> j(File file) {
        return this.f20588c.i().i(file);
    }

    dj.h k() {
        return this.f20594i;
    }

    com.bumptech.glide.h l() {
        return this.f20600o;
    }

    List<Class<?>> m() {
        return this.f20588c.i().j(this.f20589d.getClass(), this.f20592g, this.f20596k);
    }

    <Z> dj.k<Z> n(fj.c<Z> cVar) {
        return this.f20588c.i().k(cVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t11) {
        return this.f20588c.i().l(t11);
    }

    dj.e p() {
        return this.f20599n;
    }

    <X> dj.d<X> q(X x11) {
        return this.f20588c.i().m(x11);
    }

    Class<?> r() {
        return this.f20596k;
    }

    <Z> dj.l<Z> s(Class<Z> cls) {
        dj.l<Z> lVar = (dj.l) this.f20595j.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, dj.l<?>> entry : this.f20595j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (dj.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f20595j.isEmpty() || !this.f20602q) {
            return lj.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f20590e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.e eVar, Object obj, dj.e eVar2, int i11, int i12, fj.a aVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, dj.h hVar2, Map<Class<?>, dj.l<?>> map, boolean z11, boolean z12, h.e eVar3) {
        this.f20588c = eVar;
        this.f20589d = obj;
        this.f20599n = eVar2;
        this.f20590e = i11;
        this.f20591f = i12;
        this.f20601p = aVar;
        this.f20592g = cls;
        this.f20593h = eVar3;
        this.f20596k = cls2;
        this.f20600o = hVar;
        this.f20594i = hVar2;
        this.f20595j = map;
        this.f20602q = z11;
        this.f20603r = z12;
    }

    boolean w(fj.c<?> cVar) {
        return this.f20588c.i().n(cVar);
    }

    boolean x() {
        return this.f20603r;
    }

    boolean y(dj.e eVar) {
        List<jj.o.a<?>> listG = g();
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (listG.get(i11).f83874a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
