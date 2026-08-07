package com.google.common.collect;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f43582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f43583b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43584c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    h0.m f43585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    h0.m f43586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ou.f<Object> f43587f;

    int a() {
        int i11 = this.f43584c;
        if (i11 == -1) {
            return 4;
        }
        return i11;
    }

    int b() {
        int i11 = this.f43583b;
        if (i11 == -1) {
            return 16;
        }
        return i11;
    }

    ou.f<Object> c() {
        return (ou.f) ou.j.a(this.f43587f, d().defaultEquivalence());
    }

    h0.m d() {
        return (h0.m) ou.j.a(this.f43585d, h0.m.STRONG);
    }

    h0.m e() {
        return (h0.m) ou.j.a(this.f43586e, h0.m.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f43582a ? new ConcurrentHashMap(b(), 0.75f, a()) : h0.b(this);
    }

    g0 g(h0.m mVar) {
        h0.m mVar2 = this.f43585d;
        ou.p.u(mVar2 == null, "Key strength was already set to %s", mVar2);
        this.f43585d = (h0.m) ou.p.m(mVar);
        if (mVar != h0.m.STRONG) {
            this.f43582a = true;
        }
        return this;
    }

    public g0 h() {
        return g(h0.m.WEAK);
    }

    public String toString() {
        ou.j.b bVarB = ou.j.b(this);
        int i11 = this.f43583b;
        if (i11 != -1) {
            bVarB.a("initialCapacity", i11);
        }
        int i12 = this.f43584c;
        if (i12 != -1) {
            bVarB.a("concurrencyLevel", i12);
        }
        h0.m mVar = this.f43585d;
        if (mVar != null) {
            bVarB.c("keyStrength", ou.c.e(mVar.toString()));
        }
        h0.m mVar2 = this.f43586e;
        if (mVar2 != null) {
            bVarB.c("valueStrength", ou.c.e(mVar2.toString()));
        }
        if (this.f43587f != null) {
            bVarB.i("keyEquivalence");
        }
        return bVarB.toString();
    }
}
