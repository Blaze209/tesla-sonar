package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
abstract class x<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.realm.a f79176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class<E> f79177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f79178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final OsResults f79179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b<E> f79180e;

    static class a extends e<Byte> {
        a(io.realm.a aVar, OsResults osResults, Class<Byte> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Byte c(int i11) {
            return Byte.valueOf(((Long) this.f79182b.l(i11)).byteValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Byte d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Byte.valueOf(l11.byteValue());
        }
    }

    static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final io.realm.a f79181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final OsResults f79182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Class<T> f79183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final String f79184d;

        b(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            this.f79181a = aVar;
            this.f79182b = osResults;
            this.f79183c = cls;
            this.f79184d = str;
        }

        protected T a(UncheckedRow uncheckedRow, boolean z11, T t11) {
            if (uncheckedRow != null) {
                return (T) this.f79181a.H(this.f79183c, this.f79184d, uncheckedRow);
            }
            if (z11) {
                throw new IndexOutOfBoundsException("No results were found.");
            }
            return t11;
        }

        public abstract T b(boolean z11, T t11);

        public abstract T c(int i11);

        public abstract T d(int i11, OsResults osResults);
    }

    static class c extends e<Integer> {
        c(io.realm.a aVar, OsResults osResults, Class<Integer> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer c(int i11) {
            return Integer.valueOf(((Long) this.f79182b.l(i11)).intValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Integer.valueOf(l11.intValue());
        }
    }

    static class d<T> extends b<T> {
        d(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.b
        public T b(boolean z11, T t11) {
            return a(this.f79182b.h(), z11, t11);
        }

        @Override // io.realm.x.b
        public T c(int i11) {
            return (T) this.f79181a.H(this.f79183c, this.f79184d, this.f79182b.k(i11));
        }

        @Override // io.realm.x.b
        public T d(int i11, OsResults osResults) {
            return e(osResults.k(i11));
        }

        public T e(UncheckedRow uncheckedRow) {
            return (T) this.f79181a.H(this.f79183c, this.f79184d, uncheckedRow);
        }
    }

    static class e<T> extends b<T> {
        e(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.b
        public T b(boolean z11, T t11) {
            return this.f79182b.r() != 0 ? (T) this.f79182b.l(0) : t11;
        }

        @Override // io.realm.x.b
        public T c(int i11) {
            return (T) this.f79182b.l(i11);
        }

        @Override // io.realm.x.b
        public T d(int i11, OsResults osResults) {
            return (T) osResults.l(i11);
        }
    }

    static class f extends e<d0> {
        f(io.realm.a aVar, OsResults osResults, Class<d0> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d0 c(int i11) {
            return new d0(f0.b(this.f79181a, (NativeRealmAny) this.f79182b.l(i11)));
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d0 d(int i11, OsResults osResults) {
            return new d0(f0.b(this.f79181a, (NativeRealmAny) osResults.l(i11)));
        }
    }

    private class g extends OsResults.a<E> {
        g() {
            super(x.this.f79179d);
        }

        @Override // io.realm.internal.OsResults.a
        protected E d(int i11, OsResults osResults) {
            return x.this.f79180e.d(i11, osResults);
        }
    }

    private class h extends OsResults.b<E> {
        h(int i11) {
            super(x.this.f79179d, i11);
        }

        @Override // io.realm.internal.OsResults.a
        protected E d(int i11, OsResults osResults) {
            return x.this.f79180e.d(i11, osResults);
        }
    }

    static class i extends e<Short> {
        i(io.realm.a aVar, OsResults osResults, Class<Short> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Short c(int i11) {
            return Short.valueOf(((Long) this.f79182b.l(i11)).shortValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Short d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Short.valueOf(l11.shortValue());
        }
    }

    x(io.realm.a aVar, OsResults osResults, Class<E> cls, b<E> bVar) {
        this(aVar, osResults, cls, null, bVar);
    }

    private E b(boolean z11, E e11) {
        return this.f79180e.b(z11, e11);
    }

    protected static <T> b<T> d(boolean z11, io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
        if (!z11) {
            return new d(aVar, osResults, cls, str);
        }
        if (cls == Integer.class) {
            return new c(aVar, osResults, Integer.class, str);
        }
        if (cls == Short.class) {
            return new i(aVar, osResults, Short.class, str);
        }
        if (cls == Byte.class) {
            return new a(aVar, osResults, Byte.class, str);
        }
        return cls == d0.class ? new f(aVar, osResults, d0.class, str) : new e(aVar, osResults, cls, str);
    }

    public boolean a() {
        this.f79176a.n();
        if (size() <= 0) {
            return false;
        }
        this.f79179d.e();
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!n3() || ((obj instanceof io.realm.internal.o) && ((io.realm.internal.o) obj).f().d() == io.realm.internal.f.INSTANCE)) {
            return false;
        }
        for (E e11 : this) {
            if ((e11 instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) e11, (byte[]) obj)) {
                    return true;
                }
            } else {
                if (e11 != null && e11.equals(obj)) {
                    return true;
                }
                if (e11 == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    OsResults e() {
        return this.f79179d;
    }

    Table f() {
        return this.f79179d.j();
    }

    public E first() {
        return b(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        this.f79176a.n();
        return this.f79180e.c(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new g();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new h(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i11, E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!n3()) {
            return 0;
        }
        long jR = this.f79179d.r();
        if (jR > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jR;
    }

    x(io.realm.a aVar, OsResults osResults, String str, b<E> bVar) {
        this(aVar, osResults, null, str, bVar);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i11, E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        return new h(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    private x(io.realm.a aVar, OsResults osResults, Class<E> cls, String str, b<E> bVar) {
        this.f79176a = aVar;
        this.f79179d = osResults;
        this.f79177b = cls;
        this.f79178c = str;
        this.f79180e = bVar;
    }
}
