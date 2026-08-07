package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r0<T> implements Comparator<T> {
    protected r0() {
    }

    public static <T> r0<T> b(Comparator<T> comparator) {
        return comparator instanceof r0 ? (r0) comparator : new o(comparator);
    }

    public static <C extends Comparable> r0<C> f() {
        return o0.f43678a;
    }

    public <U extends T> r0<U> a(Comparator<? super U> comparator) {
        return new q(this, (Comparator) ou.p.m(comparator));
    }

    public <E extends T> x<E> c(Iterable<E> iterable) {
        return x.y(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t11, T t12);

    <T2 extends T> r0<Map.Entry<T2, ?>> h() {
        return (r0<Map.Entry<T2, ?>>) j(j0.e());
    }

    public <F> r0<F> j(ou.h<F, ? extends T> hVar) {
        return new j(hVar, this);
    }

    public <S extends T> r0<S> l() {
        return new y0(this);
    }
}
