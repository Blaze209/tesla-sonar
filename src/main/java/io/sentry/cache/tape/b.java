package io.sentry.cache.tape;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
final class b<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f80383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f80384b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a<T> f80385c;

    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] c() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    private final class C1698b implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<byte[]> f80386a;

        C1698b(Iterator<byte[]> it) {
            this.f80386a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f80386a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            try {
                return b.this.f80385c.b(this.f80386a.next());
            } catch (IOException e11) {
                throw ((Error) d.B(e11));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f80386a.remove();
        }
    }

    b(d dVar, c.a<T> aVar) {
        this.f80383a = dVar;
        this.f80385c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void C(int i11) throws IOException {
        this.f80383a.r0(i11);
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f80383a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f80383a.close();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C1698b(this.f80383a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public void n(T t11) throws IOException {
        this.f80384b.reset();
        this.f80385c.a(t11, this.f80384b);
        this.f80383a.p(this.f80384b.c(), 0, this.f80384b.size());
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f80383a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f80383a + CoreConstants.CURLY_RIGHT;
    }
}
