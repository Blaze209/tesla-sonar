package net.time4j;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes9.dex */
abstract class a<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient p<g0> f93921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient p<g0> f93922c;

    a(String str) {
        super(str);
        this.f93921b = new j(this, 0);
        this.f93922c = new j(this, 1);
    }

    public p<g0> o(V v11) {
        return new j(this, 6, v11);
    }
}
