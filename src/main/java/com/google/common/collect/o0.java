package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class o0 extends r0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final o0 f43678a = new o0();

    private o0() {
    }

    @Override // com.google.common.collect.r0
    public <S extends Comparable<?>> r0<S> l() {
        return x0.f43724a;
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ou.p.m(comparable);
        ou.p.m(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
