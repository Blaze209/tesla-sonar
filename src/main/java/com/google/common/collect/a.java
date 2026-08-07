package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
abstract class a<E> extends e1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43505b;

    protected a(int i11, int i12) {
        ou.p.o(i12, i11);
        this.f43504a = i11;
        this.f43505b = i12;
    }

    protected abstract E a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f43505b < this.f43504a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f43505b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f43505b;
        this.f43505b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f43505b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f43505b - 1;
        this.f43505b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f43505b - 1;
    }
}
