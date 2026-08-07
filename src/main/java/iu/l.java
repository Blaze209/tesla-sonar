package iu;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
abstract class l extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f81895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81896b;

    protected l(int i11, int i12) {
        j.b(i12, i11, "index");
        this.f81895a = i11;
        this.f81896b = i12;
    }

    protected abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f81896b < this.f81895a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81896b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f81896b;
        this.f81896b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81896b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f81896b - 1;
        this.f81896b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81896b - 1;
    }
}
