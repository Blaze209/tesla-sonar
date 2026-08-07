package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class c1<F, T> extends b1<F, T> implements ListIterator<T> {
    c1(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> b() {
        return (ListIterator) this.f43527a;
    }

    @Override // java.util.ListIterator
    public void add(T t11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t11) {
        throw new UnsupportedOperationException();
    }
}
