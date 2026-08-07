package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g<T> extends d1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f43581a;

    protected g(T t11) {
        this.f43581a = t11;
    }

    protected abstract T a(T t11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43581a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t11 = this.f43581a;
        if (t11 == null) {
            throw new NoSuchElementException();
        }
        this.f43581a = a(t11);
        return t11;
    }
}
