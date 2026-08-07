package io.realm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public class k0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Class<E> f79138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f79139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.realm.a f79140c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f79141d = new ArrayList();

    private class b implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f79143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f79144c;

        private b() {
            this.f79142a = 0;
            this.f79143b = -1;
            this.f79144c = ((AbstractList) k0.this).modCount;
        }

        final void a() {
            if (((AbstractList) k0.this).modCount != this.f79144c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            k0.this.h();
            a();
            return this.f79142a != k0.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            k0.this.h();
            a();
            int i11 = this.f79142a;
            try {
                E e11 = (E) k0.this.get(i11);
                this.f79143b = i11;
                this.f79142a = i11 + 1;
                return e11;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index " + i11 + " when size is " + k0.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            k0.this.h();
            if (this.f79143b < 0) {
                throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
            }
            a();
            try {
                k0.this.remove(this.f79143b);
                int i11 = this.f79143b;
                int i12 = this.f79142a;
                if (i11 < i12) {
                    this.f79142a = i12 - 1;
                }
                this.f79143b = -1;
                this.f79144c = ((AbstractList) k0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    private class c extends k0<E>.b implements ListIterator<E> {
        c(int i11) {
            super();
            if (i11 >= 0 && i11 <= k0.this.size()) {
                this.f79142a = i11;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Starting location must be a valid index: [0, ");
            sb2.append(k0.this.size() - 1);
            sb2.append("]. Index was ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            k0.this.f79140c.n();
            a();
            try {
                int i11 = this.f79142a;
                k0.this.add(i11, e11);
                this.f79143b = -1;
                this.f79142a = i11 + 1;
                this.f79144c = ((AbstractList) k0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f79142a != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f79142a;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i11 = this.f79142a - 1;
            try {
                E e11 = (E) k0.this.get(i11);
                this.f79142a = i11;
                this.f79143b = i11;
                return e11;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i11 + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f79142a - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            k0.this.f79140c.n();
            if (this.f79143b < 0) {
                throw new IllegalStateException();
            }
            a();
            try {
                k0.this.set(this.f79143b, e11);
                this.f79144c = ((AbstractList) k0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f79140c.n();
    }

    private boolean i() {
        return false;
    }

    private static boolean j(Class<?> cls) {
        return n0.class.isAssignableFrom(cls);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        if (k()) {
            h();
            throw null;
        }
        this.f79141d.add(i11, e11);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (k()) {
            h();
            throw null;
        }
        this.f79141d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!k()) {
            return this.f79141d.contains(obj);
        }
        this.f79140c.n();
        if ((obj instanceof io.realm.internal.o) && ((io.realm.internal.o) obj).f().d() == io.realm.internal.f.INSTANCE) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        if (!k()) {
            return this.f79141d.get(i11);
        }
        h();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return k() ? new b() : super.iterator();
    }

    public boolean k() {
        return this.f79140c != null;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        if (k()) {
            h();
            get(i11);
            throw null;
        }
        E eRemove = this.f79141d.remove(i11);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (!k() || this.f79140c.c0()) {
            return super.removeAll(collection);
        }
        throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        if (!k()) {
            return this.f79141d.set(i11, e11);
        }
        h();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!k()) {
            return this.f79141d.size();
        }
        h();
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (k()) {
            sb2.append("RealmList<");
            String str = this.f79139b;
            if (str != null) {
                sb2.append(str);
            } else if (j(this.f79138a)) {
                sb2.append(this.f79140c.J().g(this.f79138a).d());
            } else {
                Class<E> cls = this.f79138a;
                if (cls == byte[].class) {
                    sb2.append(cls.getSimpleName());
                } else {
                    sb2.append(cls.getName());
                }
            }
            sb2.append(">@[");
            if (!i()) {
                sb2.append("invalid");
            } else if (j(this.f79138a)) {
                while (i11 < size()) {
                    sb2.append(((io.realm.internal.o) get(i11)).f().d().getObjectKey());
                    sb2.append(",");
                    i11++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            } else {
                while (i11 < size()) {
                    Object obj = get(i11);
                    if (obj instanceof byte[]) {
                        sb2.append("byte[");
                        sb2.append(((byte[]) obj).length);
                        sb2.append("]");
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                    i11++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            }
            sb2.append("]");
        } else {
            sb2.append("RealmList<?>@[");
            int size = size();
            while (i11 < size) {
                Object obj2 = get(i11);
                if (obj2 instanceof n0) {
                    sb2.append(System.identityHashCode(obj2));
                } else if (obj2 instanceof byte[]) {
                    sb2.append("byte[");
                    sb2.append(((byte[]) obj2).length);
                    sb2.append("]");
                } else {
                    sb2.append(obj2);
                }
                sb2.append(",");
                i11++;
            }
            if (size() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        return k() ? new c(i11) : super.listIterator(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        if (!k()) {
            this.f79141d.add(e11);
            ((AbstractList) this).modCount++;
            return true;
        }
        h();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (k() && !this.f79140c.c0()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }
}
