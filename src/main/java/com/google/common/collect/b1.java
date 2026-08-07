package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class b1<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f43527a;

    b1(Iterator<? extends F> it) {
        this.f43527a = (Iterator) ou.p.m(it);
    }

    abstract T a(F f11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43527a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f43527a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43527a.remove();
    }
}
