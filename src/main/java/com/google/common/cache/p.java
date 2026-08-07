package com.google.common.cache;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes5.dex */
public final class p<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f43491a;

    private p(K k11, V v11, n nVar) {
        super(k11, v11);
        this.f43491a = (n) ou.p.m(nVar);
    }

    public static <K, V> p<K, V> a(K k11, V v11, n nVar) {
        return new p<>(k11, v11, nVar);
    }
}
