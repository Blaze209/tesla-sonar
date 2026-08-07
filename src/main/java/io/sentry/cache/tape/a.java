package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
final class a<T> extends c<T> {

    private static final class b<T> implements Iterator<T> {
        private b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    a() {
    }

    @Override // io.sentry.cache.tape.c
    public void C(int i11) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new b();
    }

    @Override // io.sentry.cache.tape.c
    public void n(T t11) {
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }
}
