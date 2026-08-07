package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
final class f<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient E[] f80535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f80536b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f80537c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f80538d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f80539e;

    class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f80540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f80541b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f80542c;

        a() {
            this.f80540a = f.this.f80536b;
            this.f80542c = f.this.f80538d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f80542c || this.f80540a != f.this.f80537c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f80542c = false;
            int i11 = this.f80540a;
            this.f80541b = i11;
            this.f80540a = f.this.l(i11);
            return (E) f.this.f80535a[this.f80541b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f80541b;
            if (i11 == -1) {
                throw new IllegalStateException();
            }
            if (i11 == f.this.f80536b) {
                f.this.remove();
                this.f80541b = -1;
                return;
            }
            int iL = this.f80541b + 1;
            if (f.this.f80536b >= this.f80541b || iL >= f.this.f80537c) {
                while (iL != f.this.f80537c) {
                    if (iL >= f.this.f80539e) {
                        f.this.f80535a[iL - 1] = f.this.f80535a[0];
                        iL = 0;
                    } else {
                        f.this.f80535a[f.this.k(iL)] = f.this.f80535a[iL];
                        iL = f.this.l(iL);
                    }
                }
            } else {
                System.arraycopy(f.this.f80535a, iL, f.this.f80535a, this.f80541b, f.this.f80537c - iL);
            }
            this.f80541b = -1;
            f fVar = f.this;
            fVar.f80537c = fVar.k(fVar.f80537c);
            f.this.f80535a[f.this.f80537c] = null;
            f.this.f80538d = false;
            this.f80540a = f.this.k(this.f80540a);
        }
    }

    f(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i11];
        this.f80535a = eArr;
        this.f80539e = eArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(int i11) {
        int i12 = i11 - 1;
        return i12 < 0 ? this.f80539e - 1 : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l(int i11) {
        int i12 = i11 + 1;
        if (i12 >= this.f80539e) {
            return 0;
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (m()) {
            remove();
        }
        E[] eArr = this.f80535a;
        int i11 = this.f80537c;
        int i12 = i11 + 1;
        this.f80537c = i12;
        eArr[i11] = e11;
        if (i12 >= this.f80539e) {
            this.f80537c = 0;
        }
        if (this.f80537c == this.f80536b) {
            this.f80538d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f80538d = false;
        this.f80536b = 0;
        this.f80537c = 0;
        Arrays.fill(this.f80535a, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    public boolean m() {
        return size() == this.f80539e;
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        return add(e11);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f80535a[this.f80536b];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f80535a;
        int i11 = this.f80536b;
        E e11 = eArr[i11];
        if (e11 != null) {
            int i12 = i11 + 1;
            this.f80536b = i12;
            eArr[i11] = null;
            if (i12 >= this.f80539e) {
                this.f80536b = 0;
            }
            this.f80538d = false;
        }
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i11 = this.f80537c;
        int i12 = this.f80536b;
        if (i11 < i12) {
            return (this.f80539e - i12) + i11;
        }
        if (i11 != i12) {
            return i11 - i12;
        }
        if (this.f80538d) {
            return this.f80539e;
        }
        return 0;
    }
}
