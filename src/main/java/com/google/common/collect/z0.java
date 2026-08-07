package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends f<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f43738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f43739b;

        /* JADX INFO: renamed from: com.google.common.collect.z0$a$a, reason: collision with other inner class name */
        class C0687a extends com.google.common.collect.b<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<? extends E> f43740c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f43741d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f43742e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Set f43743f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f43744g;

            C0687a(a aVar, Set set, Set set2) {
                this.f43742e = set;
                this.f43743f = set2;
                this.f43744g = aVar;
                this.f43740c = set.iterator();
                this.f43741d = set2.iterator();
            }

            @Override // com.google.common.collect.b
            protected E a() {
                if (this.f43740c.hasNext()) {
                    return this.f43740c.next();
                }
                while (this.f43741d.hasNext()) {
                    E next = this.f43741d.next();
                    if (!this.f43742e.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f43738a = set;
            this.f43739b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1<E> iterator() {
            return new C0687a(this, this.f43738a, this.f43739b);
        }

        @Override // com.google.common.collect.z0.f
        int b() {
            return qu.d.f(f.d(this.f43738a), f.d(this.f43739b));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f43738a.contains(obj) || this.f43739b.contains(obj);
        }

        @Override // com.google.common.collect.z0.f
        int e() {
            return Math.max(f.f(this.f43738a), f.f(this.f43739b));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f43738a.isEmpty() && this.f43739b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f43738a.size();
            Iterator<E> it = this.f43739b.iterator();
            while (it.hasNext()) {
                if (!this.f43738a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends f<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f43745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f43746b;

        class a extends com.google.common.collect.b<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<E> f43747c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Set f43748d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f43749e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f43750f;

            a(b bVar, Set set, Set set2) {
                this.f43748d = set;
                this.f43749e = set2;
                this.f43750f = bVar;
                this.f43747c = set.iterator();
            }

            @Override // com.google.common.collect.b
            protected E a() {
                while (this.f43747c.hasNext()) {
                    E next = this.f43747c.next();
                    if (this.f43749e.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f43745a = set;
            this.f43746b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public d1<E> iterator() {
            return new a(this, this.f43745a, this.f43746b);
        }

        @Override // com.google.common.collect.z0.f
        int b() {
            return Math.min(f.d(this.f43745a), f.d(this.f43746b));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f43745a.contains(obj) && this.f43746b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f43745a.containsAll(collection) && this.f43746b.containsAll(collection);
        }

        @Override // com.google.common.collect.z0.f
        int e() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f43746b, this.f43745a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f43745a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.f43746b.contains(it.next())) {
                    i11++;
                }
            }
            return i11;
        }
    }

    private static class c<E> extends l.a<E> implements Set<E> {
        c(Set<E> set, ou.q<? super E> qVar) {
            super(set, qVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return z0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return z0.d(this);
        }
    }

    private static class d<E> extends c<E> implements SortedSet<E> {
        d(SortedSet<E> sortedSet, ou.q<? super E> qVar) {
            super(sortedSet, qVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f43646a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) d0.j(this.f43646a.iterator(), this.f43647b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e11) {
            return new d(((SortedSet) this.f43646a).headSet(e11), this.f43647b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f43646a;
            while (true) {
                E e11 = (Object) sortedSetHeadSet.last();
                if (this.f43647b.apply(e11)) {
                    return e11;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e11);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e11, E e12) {
            return new d(((SortedSet) this.f43646a).subSet(e11, e12), this.f43647b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e11) {
            return new d(((SortedSet) this.f43646a).tailSet(e11), this.f43647b);
        }
    }

    static abstract class e<E> extends AbstractSet<E> {
        e() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return z0.h(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) ou.p.m(collection));
        }
    }

    public static abstract class f<E> extends AbstractSet<E> {
        /* synthetic */ f(a aVar) {
            this();
        }

        static int d(Set<?> set) {
            return set instanceof f ? ((f) set).b() : set.size();
        }

        static int f(Set<?> set) {
            return set instanceof f ? ((f) set).e() : set.size();
        }

        /* JADX INFO: renamed from: a */
        public abstract d1<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        abstract int b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        abstract int e();

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            int iD;
            int iF;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Set) || e() > (iD = d((set = (Set) obj))) || b() < (iF = f(set))) {
                return false;
            }
            d1<E> it = iterator();
            int i11 = 0;
            while (it.hasNext()) {
                try {
                    if (!set.contains(it.next())) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            if (i11 == iD) {
                return true;
            }
            if (i11 < iF) {
                return false;
            }
            Iterator<E> it2 = set.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                it2.next();
                i12++;
                if (i12 > i11) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private f() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, ou.q<? super E> qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) ou.p.m(set), (ou.q) ou.p.m(qVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f43646a, ou.r.b(cVar.f43647b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, ou.q<? super E> qVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) ou.p.m(sortedSet), (ou.q) ou.p.m(qVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f43646a, ou.r.b(cVar.f43647b, qVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    public static <E> f<E> e(Set<E> set, Set<?> set2) {
        ou.p.n(set, "set1");
        ou.p.n(set2, "set2");
        return new b(set, set2);
    }

    public static <E> HashSet<E> f(int i11) {
        return new HashSet<>(j0.a(i11));
    }

    public static <E> Set<E> g() {
        return Collections.newSetFromMap(j0.g());
    }

    static boolean h(Set<?> set, Collection<?> collection) {
        ou.p.m(collection);
        if (collection instanceof n0) {
            collection = ((n0) collection).K2();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? i(set, collection.iterator()) : d0.q(set.iterator(), collection);
    }

    static boolean i(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> f<E> j(Set<? extends E> set, Set<? extends E> set2) {
        ou.p.n(set, "set1");
        ou.p.n(set2, "set2");
        return new a(set, set2);
    }
}
