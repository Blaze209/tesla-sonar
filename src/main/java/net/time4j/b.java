package net.time4j;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes9.dex */
abstract class b<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, h0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient p<h0> f93950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient p<h0> f93951c;

    b(String str) {
        super(str);
        this.f93950b = new r0(this, 0);
        this.f93951c = new r0(this, 1);
    }

    public p<h0> o(V v11) {
        return new r0(this, 6, v11);
    }
}
