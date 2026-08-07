package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class x0 extends r0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x0 f43724a = new x0();

    private x0() {
    }

    @Override // com.google.common.collect.r0
    public <S extends Comparable<?>> r0<S> l() {
        return r0.f();
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ou.p.m(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
