package com.plaid.internal;

import android.util.LruCache;

/* JADX INFO: renamed from: com.plaid.internal.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4345a4<K, V> implements InterfaceC4580y<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache<K, V> f46861a = new LruCache<>(10);

    @Override // com.plaid.internal.InterfaceC4580y
    public final void a(String str, Object obj) {
        this.f46861a.put(str, obj);
    }

    @Override // com.plaid.internal.InterfaceC4580y
    public final void clear() {
        this.f46861a.evictAll();
    }

    @Override // com.plaid.internal.InterfaceC4580y
    public final Object a(String str) {
        return this.f46861a.get(str);
    }
}
