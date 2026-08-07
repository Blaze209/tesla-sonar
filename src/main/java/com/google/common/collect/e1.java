package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e1<E> extends d1<E> implements ListIterator<E> {
    protected e1() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e11) {
        throw new UnsupportedOperationException();
    }
}
