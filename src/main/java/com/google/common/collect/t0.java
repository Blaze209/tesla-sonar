package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class t0<K, V> extends v<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final t0<Object, Object> f43685j = new t0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f43686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f43687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f43688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f43689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient t0<V, K> f43690i;

    /* JADX WARN: Multi-variable type inference failed */
    private t0() {
        this.f43686e = null;
        this.f43687f = new Object[0];
        this.f43688g = 0;
        this.f43689h = 0;
        this.f43690i = this;
    }

    @Override // com.google.common.collect.z
    b0<Map.Entry<K, V>> e() {
        return new v0.a(this, this.f43687f, this.f43688g, this.f43689h);
    }

    @Override // com.google.common.collect.z, java.util.Map
    public V get(Object obj) {
        V v11 = (V) v0.v(this.f43686e, this.f43687f, this.f43689h, this.f43688g, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.z
    b0<K> h() {
        return new v0.b(this, new v0.c(this.f43687f, this.f43688g, this.f43689h));
    }

    @Override // com.google.common.collect.z
    boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f43689h;
    }

    @Override // com.google.common.collect.v
    public v<V, K> t() {
        return this.f43690i;
    }

    t0(Object[] objArr, int i11) {
        this.f43687f = objArr;
        this.f43689h = i11;
        this.f43688g = 0;
        int iK = i11 >= 2 ? b0.k(i11) : 0;
        this.f43686e = v0.u(objArr, i11, iK, 0);
        this.f43690i = new t0<>(v0.u(objArr, i11, iK, 1), objArr, i11, this);
    }

    private t0(Object obj, Object[] objArr, int i11, t0<V, K> t0Var) {
        this.f43686e = obj;
        this.f43687f = objArr;
        this.f43688g = 1;
        this.f43689h = i11;
        this.f43690i = t0Var;
    }
}
