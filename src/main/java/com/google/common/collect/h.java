package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h<K, V> extends c<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient int f43588g;

    private h() {
        this(12, 3);
    }

    public static <K, V> h<K, V> C() {
        return new h<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: B */
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public List<V> s() {
        return new ArrayList(this.f43588g);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ Collection a() {
        return super.a();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ Set i() {
        return super.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean j(Object obj, Iterable iterable) {
        return super.j(obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c, com.google.common.collect.d, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private h(int i11, int i12) {
        super(s0.c(i11));
        k.b(i12, "expectedValuesPerKey");
        this.f43588g = i12;
    }
}
