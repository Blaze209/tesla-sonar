package com.google.common.collect;

import com.google.common.collect.h0.h;
import com.google.common.collect.h0.l;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
final class h0<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final y<Object, Object, d> f43589j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f43590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f43591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient l<K, V, E, S>[] f43592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f43593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ou.f<Object> f43594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient i<K, V, E, S> f43595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Set<K> f43596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient Collection<V> f43597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f43598i;

    class a implements y<Object, Object, d> {
        a() {
        }

        @Override // com.google.common.collect.h0.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y<Object, Object, d> a(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // com.google.common.collect.h0.y
        public void clear() {
        }

        @Override // com.google.common.collect.h0.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b() {
            return null;
        }

        @Override // com.google.common.collect.h0.y
        public Object get() {
            return null;
        }
    }

    final class a0 extends AbstractMap.SimpleEntry<K, V> {
        a0(K k11, V v11) {
            super(k11, v11);
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v11) {
            h0.this.put(getKey(), v11);
            return (V) super.setValue(v11);
        }
    }

    static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f43600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43601b;

        b(K k11, int i11) {
            this.f43600a = k11;
            this.f43601b = i11;
        }

        @Override // com.google.common.collect.h0.h
        public final int getHash() {
            return this.f43601b;
        }

        @Override // com.google.common.collect.h0.h
        public final K getKey() {
            return this.f43600a;
        }

        @Override // com.google.common.collect.h0.h
        public E getNext() {
            return null;
        }
    }

    static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f43602a;

        c(ReferenceQueue<K> referenceQueue, K k11, int i11) {
            super(k11, referenceQueue);
            this.f43602a = i11;
        }

        @Override // com.google.common.collect.h0.h
        public final int getHash() {
            return this.f43602a;
        }

        @Override // com.google.common.collect.h0.h
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.h0.h
        public E getNext() {
            return null;
        }
    }

    static final class d implements h<Object, Object, d> {
        private d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.h0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.h0.h
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.h0.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.h0.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    final class e extends h0<K, V, E, S>.g<Map.Entry<K, V>> {
        e() {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    final class f extends AbstractSet<Map.Entry<K, V>> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = h0.this.get(key)) != null && h0.this.n().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && h0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }
    }

    abstract class g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f43606b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        l<K, V, E, S> f43607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<E> f43608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        E f43609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        h0<K, V, E, S>.a0 f43610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        h0<K, V, E, S>.a0 f43611g;

        g() {
            this.f43605a = h0.this.f43592c.length - 1;
            a();
        }

        final void a() {
            this.f43610f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f43605a;
                if (i11 < 0) {
                    return;
                }
                l<K, V, E, S>[] lVarArr = h0.this.f43592c;
                this.f43605a = i11 - 1;
                l<K, V, E, S> lVar = lVarArr[i11];
                this.f43607c = lVar;
                if (lVar.f43616b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f43607c.f43619e;
                    this.f43608d = atomicReferenceArray;
                    this.f43606b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(E e11) {
            l<K, V, E, S> lVar;
            try {
                Object key = e11.getKey();
                Object objD = h0.this.d(e11);
                if (objD == null) {
                    return false;
                }
                this.f43610f = new a0(key, objD);
                return true;
            } finally {
                this.f43607c.r();
            }
        }

        h0<K, V, E, S>.a0 c() {
            h0<K, V, E, S>.a0 a0Var = this.f43610f;
            if (a0Var == null) {
                throw new NoSuchElementException();
            }
            this.f43611g = a0Var;
            a();
            return this.f43611g;
        }

        boolean d() {
            E e11 = this.f43609e;
            if (e11 == null) {
                return false;
            }
            while (true) {
                this.f43609e = (E) e11.getNext();
                E e12 = this.f43609e;
                if (e12 == null) {
                    return false;
                }
                if (b(e12)) {
                    return true;
                }
                e11 = this.f43609e;
            }
        }

        boolean e() {
            while (true) {
                int i11 = this.f43606b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f43608d;
                this.f43606b = i11 - 1;
                E e11 = atomicReferenceArray.get(i11);
                this.f43609e = e11;
                if (e11 != null && (b(e11) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43610f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.k.c(this.f43611g != null);
            h0.this.remove(this.f43611g.getKey());
            this.f43611g = null;
        }
    }

    interface h<K, V, E extends h<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    interface i<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> {
        S a(h0<K, V, E, S> h0Var, int i11);

        void b(S s11, E e11, V v11);

        E c(S s11, E e11, E e12);

        m d();

        E e(S s11, K k11, int i11, E e11);
    }

    final class j extends h0<K, V, E, S>.g<K> {
        j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    final class k extends AbstractSet<K> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }
    }

    static abstract class l<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h0<K, V, E, S> f43615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f43616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f43619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f43620f = new AtomicInteger();

        l(h0<K, V, E, S> h0Var, int i11) {
            this.f43615a = h0Var;
            m(q(i11));
        }

        static <K, V, E extends h<K, V, E>> boolean n(E e11) {
            return e11.getValue() == null;
        }

        boolean A(K k11, int i11, V v11, V v12) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(k11, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.f43615a.n().d(v11, value)) {
                                return false;
                            }
                            this.f43617c++;
                            E(next, v12);
                            return true;
                        }
                        if (n(next)) {
                            this.f43617c++;
                            h hVarY = y(e11, next);
                            int i12 = this.f43616b - 1;
                            atomicReferenceArray.set(length, (E) hVarY);
                            this.f43616b = i12;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void B() {
            C();
        }

        void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f43620f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S D();

        void E(E e11, V v11) {
            this.f43615a.f43595f.b(D(), e11, v11);
        }

        void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.f43616b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    o();
                    this.f43620f.set(0);
                    this.f43617c++;
                    this.f43616b = 0;
                } finally {
                    unlock();
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        boolean c(Object obj, int i11) {
            try {
                boolean z11 = false;
                if (this.f43616b == 0) {
                    return false;
                }
                h hVarK = k(obj, i11);
                if (hVarK != null && hVarK.getValue() != null) {
                    z11 = true;
                }
                return z11;
            } finally {
                r();
            }
        }

        E d(E e11, E e12) {
            return (E) this.f43615a.f43595f.c(D(), e11, e12);
        }

        void e(ReferenceQueue<K> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f43615a.i((h) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f43615a.j((y) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f43616b;
            AtomicReferenceArray<E> atomicReferenceArrayQ = q(length << 1);
            this.f43618d = (atomicReferenceArrayQ.length() * 3) / 4;
            int length2 = atomicReferenceArrayQ.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                E next = atomicReferenceArray.get(i12);
                if (next != null) {
                    h next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayQ.set(hash, next);
                    } else {
                        h hVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                hVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayQ.set(hash, hVar);
                        while (next != hVar) {
                            int hash3 = next.getHash() & length2;
                            h hVarD = d(next, (h) atomicReferenceArrayQ.get(hash3));
                            if (hVarD != null) {
                                atomicReferenceArrayQ.set(hash3, hVarD);
                            } else {
                                i11--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f43619e = atomicReferenceArrayQ;
            this.f43616b = i11;
        }

        V h(Object obj, int i11) {
            try {
                h hVarK = k(obj, i11);
                if (hVarK == null) {
                    return null;
                }
                V v11 = (V) hVarK.getValue();
                if (v11 == null) {
                    F();
                }
                return v11;
            } finally {
                r();
            }
        }

        E i(Object obj, int i11) {
            if (this.f43616b == 0) {
                return null;
            }
            for (E e11 = (E) j(i11); e11 != null; e11 = (E) e11.getNext()) {
                if (e11.getHash() == i11) {
                    Object key = e11.getKey();
                    if (key == null) {
                        F();
                    } else if (this.f43615a.f43594e.d(obj, key)) {
                        return e11;
                    }
                }
            }
            return null;
        }

        E j(int i11) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
            return atomicReferenceArray.get(i11 & (atomicReferenceArray.length() - 1));
        }

        E k(Object obj, int i11) {
            return (E) i(obj, i11);
        }

        V l(E e11) {
            if (e11.getKey() == null) {
                F();
                return null;
            }
            V v11 = (V) e11.getValue();
            if (v11 != null) {
                return v11;
            }
            F();
            return null;
        }

        void m(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f43618d = (atomicReferenceArray.length() * 3) / 4;
            this.f43619e = atomicReferenceArray;
        }

        void o() {
        }

        void p() {
        }

        AtomicReferenceArray<E> q(int i11) {
            return new AtomicReferenceArray<>(i11);
        }

        void r() {
            if ((this.f43620f.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        void s() {
            C();
        }

        V t(K k11, int i11, V v11, boolean z11) {
            lock();
            try {
                s();
                int i12 = this.f43616b + 1;
                if (i12 > this.f43618d) {
                    g();
                    i12 = this.f43616b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(k11, key)) {
                        V v12 = (V) next.getValue();
                        if (v12 == null) {
                            this.f43617c++;
                            E(next, v11);
                            this.f43616b = this.f43616b;
                            return null;
                        }
                        if (z11) {
                            return v12;
                        }
                        this.f43617c++;
                        E(next, v11);
                        return v12;
                    }
                }
                this.f43617c++;
                h hVarE = this.f43615a.f43595f.e(D(), k11, i11, e11);
                E(hVarE, v11);
                atomicReferenceArray.set(length, (E) hVarE);
                this.f43616b = i12;
                return null;
            } finally {
                unlock();
            }
        }

        boolean u(E e11, int i11) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = i11 & (atomicReferenceArray.length() - 1);
                E e12 = atomicReferenceArray.get(length);
                for (h next = e12; next != null; next = next.getNext()) {
                    if (next == e11) {
                        this.f43617c++;
                        h hVarY = y(e12, next);
                        int i12 = this.f43616b - 1;
                        atomicReferenceArray.set(length, (E) hVarY);
                        this.f43616b = i12;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean v(K k11, int i11, y<K, V, E> yVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(k11, key)) {
                        if (((x) next).getValueReference() != yVar) {
                            return false;
                        }
                        this.f43617c++;
                        h hVarY = y(e11, next);
                        int i12 = this.f43616b - 1;
                        atomicReferenceArray.set(length, (E) hVarY);
                        this.f43616b = i12;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        V w(Object obj, int i11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(obj, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 == null && !n(next)) {
                            return null;
                        }
                        this.f43617c++;
                        h hVarY = y(e11, next);
                        int i12 = this.f43616b - 1;
                        atomicReferenceArray.set(length, (E) hVarY);
                        this.f43616b = i12;
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean x(Object obj, int i11, Object obj2) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                h next = e11;
                while (true) {
                    boolean z11 = false;
                    if (next == null) {
                        return false;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(obj, key)) {
                        if (this.f43615a.n().d(obj2, next.getValue())) {
                            z11 = true;
                        } else if (!n(next)) {
                            return false;
                        }
                        this.f43617c++;
                        h hVarY = y(e11, next);
                        int i12 = this.f43616b - 1;
                        atomicReferenceArray.set(length, (E) hVarY);
                        this.f43616b = i12;
                        return z11;
                    }
                    next = next.getNext();
                }
            } finally {
                unlock();
            }
        }

        E y(E e11, E e12) {
            int i11 = this.f43616b;
            E e13 = (E) e12.getNext();
            while (e11 != e12) {
                h hVarD = d(e11, e13);
                if (hVarD != null) {
                    e13 = (E) hVarD;
                } else {
                    i11--;
                }
                e11 = (E) e11.getNext();
            }
            this.f43616b = i11;
            return e13;
        }

        V z(K k11, int i11, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f43619e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h next = e11; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43615a.f43594e.d(k11, key)) {
                        V v12 = (V) next.getValue();
                        if (v12 != null) {
                            this.f43617c++;
                            E(next, v11);
                            return v12;
                        }
                        if (n(next)) {
                            this.f43617c++;
                            h hVarY = y(e11, next);
                            int i12 = this.f43616b - 1;
                            atomicReferenceArray.set(length, (E) hVarY);
                            this.f43616b = i12;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class m {
        public static final m STRONG = new a("STRONG", 0);
        public static final m WEAK = new b("WEAK", 1);
        private static final /* synthetic */ m[] $VALUES = $values();

        final enum a extends m {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.h0.m
            ou.f<Object> defaultEquivalence() {
                return ou.f.c();
            }
        }

        final enum b extends m {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.h0.m
            ou.f<Object> defaultEquivalence() {
                return ou.f.f();
            }
        }

        private static /* synthetic */ m[] $values() {
            return new m[]{STRONG, WEAK};
        }

        private m(String str, int i11) {
            super(str, i11);
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) $VALUES.clone();
        }

        abstract ou.f<Object> defaultEquivalence();

        /* synthetic */ m(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    static class n<K, V> extends b<K, V, n<K, V>> implements h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile V f43621c;

        static final class a<K, V> implements i<K, V, n<K, V>, o<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f43622a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f43622a;
            }

            @Override // com.google.common.collect.h0.i
            public m d() {
                return m.STRONG;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public n<K, V> c(o<K, V> oVar, n<K, V> nVar, n<K, V> nVar2) {
                n<K, V> nVarE = e(oVar, nVar.f43600a, nVar.f43601b, nVar2);
                ((n) nVarE).f43621c = ((n) nVar).f43621c;
                return nVarE;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public n<K, V> e(o<K, V> oVar, K k11, int i11, n<K, V> nVar) {
                return nVar == null ? new n<>(k11, i11, null) : new b(k11, i11, nVar);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public o<K, V> a(h0<K, V, n<K, V>, o<K, V>> h0Var, int i11) {
                return new o<>(h0Var, i11);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(o<K, V> oVar, n<K, V> nVar, V v11) {
                ((n) nVar).f43621c = v11;
            }
        }

        private static final class b<K, V> extends n<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final n<K, V> f43623d;

            b(K k11, int i11, n<K, V> nVar) {
                super(k11, i11, null);
                this.f43623d = nVar;
            }

            @Override // com.google.common.collect.h0.b, com.google.common.collect.h0.h
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n<K, V> getNext() {
                return this.f43623d;
            }
        }

        /* synthetic */ n(Object obj, int i11, a aVar) {
            this(obj, i11);
        }

        @Override // com.google.common.collect.h0.h
        public final V getValue() {
            return this.f43621c;
        }

        private n(K k11, int i11) {
            super(k11, i11);
            this.f43621c = null;
        }
    }

    static final class o<K, V> extends l<K, V, n<K, V>, o<K, V>> {
        o(h0<K, V, n<K, V>, o<K, V>> h0Var, int i11) {
            super(h0Var, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h0.l
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public o<K, V> D() {
            return this;
        }
    }

    static class p<K, V> extends b<K, V, p<K, V>> implements x<K, V, p<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile y<K, V, p<K, V>> f43624c;

        static final class a<K, V> implements i<K, V, p<K, V>, q<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f43625a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f43625a;
            }

            @Override // com.google.common.collect.h0.i
            public m d() {
                return m.WEAK;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public p<K, V> c(q<K, V> qVar, p<K, V> pVar, p<K, V> pVar2) {
                if (l.n(pVar)) {
                    return null;
                }
                p<K, V> pVarE = e(qVar, pVar.f43600a, pVar.f43601b, pVar2);
                ((p) pVarE).f43624c = ((p) pVar).f43624c.a(((q) qVar).f43627g, pVarE);
                return pVarE;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public p<K, V> e(q<K, V> qVar, K k11, int i11, p<K, V> pVar) {
                return pVar == null ? new p<>(k11, i11, null) : new b(k11, i11, pVar);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K, V> a(h0<K, V, p<K, V>, q<K, V>> h0Var, int i11) {
                return new q<>(h0Var, i11);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(q<K, V> qVar, p<K, V> pVar, V v11) {
                y yVar = ((p) pVar).f43624c;
                ((p) pVar).f43624c = new z(((q) qVar).f43627g, v11, pVar);
                yVar.clear();
            }
        }

        private static final class b<K, V> extends p<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final p<K, V> f43626d;

            b(K k11, int i11, p<K, V> pVar) {
                super(k11, i11, null);
                this.f43626d = pVar;
            }

            @Override // com.google.common.collect.h0.b, com.google.common.collect.h0.h
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p<K, V> getNext() {
                return this.f43626d;
            }
        }

        /* synthetic */ p(Object obj, int i11, a aVar) {
            this(obj, i11);
        }

        @Override // com.google.common.collect.h0.h
        public final V getValue() {
            return this.f43624c.get();
        }

        @Override // com.google.common.collect.h0.x
        public final y<K, V, p<K, V>> getValueReference() {
            return this.f43624c;
        }

        private p(K k11, int i11) {
            super(k11, i11);
            this.f43624c = h0.m();
        }
    }

    static final class q<K, V> extends l<K, V, p<K, V>, q<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<V> f43627g;

        q(h0<K, V, p<K, V>, q<K, V>> h0Var, int i11) {
            super(h0Var, i11);
            this.f43627g = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h0.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public q<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.h0.l
        void o() {
            b(this.f43627g);
        }

        @Override // com.google.common.collect.h0.l
        void p() {
            f(this.f43627g);
        }
    }

    final class r extends h0<K, V, E, S>.g<V> {
        r() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    final class s extends AbstractCollection<V> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return h0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return h0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h0.this.size();
        }
    }

    static class t<K, V> extends c<K, V, t<K, V>> implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile V f43630b;

        static final class a<K, V> implements i<K, V, t<K, V>, u<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f43631a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f43631a;
            }

            @Override // com.google.common.collect.h0.i
            public m d() {
                return m.STRONG;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public t<K, V> c(u<K, V> uVar, t<K, V> tVar, t<K, V> tVar2) {
                K key = tVar.getKey();
                if (key == null) {
                    return null;
                }
                t<K, V> tVarE = e(uVar, key, tVar.f43602a, tVar2);
                ((t) tVarE).f43630b = ((t) tVar).f43630b;
                return tVarE;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public t<K, V> e(u<K, V> uVar, K k11, int i11, t<K, V> tVar) {
                return tVar == null ? new t<>(((u) uVar).f43633g, k11, i11, null) : new b(((u) uVar).f43633g, k11, i11, tVar, null);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> a(h0<K, V, t<K, V>, u<K, V>> h0Var, int i11) {
                return new u<>(h0Var, i11);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(u<K, V> uVar, t<K, V> tVar, V v11) {
                ((t) tVar).f43630b = v11;
            }
        }

        private static final class b<K, V> extends t<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final t<K, V> f43632c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i11, t tVar, a aVar) {
                this(referenceQueue, obj, i11, tVar);
            }

            @Override // com.google.common.collect.h0.c, com.google.common.collect.h0.h
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public t<K, V> getNext() {
                return this.f43632c;
            }

            private b(ReferenceQueue<K> referenceQueue, K k11, int i11, t<K, V> tVar) {
                super(referenceQueue, k11, i11, null);
                this.f43632c = tVar;
            }
        }

        /* synthetic */ t(ReferenceQueue referenceQueue, Object obj, int i11, a aVar) {
            this(referenceQueue, obj, i11);
        }

        @Override // com.google.common.collect.h0.h
        public final V getValue() {
            return this.f43630b;
        }

        private t(ReferenceQueue<K> referenceQueue, K k11, int i11) {
            super(referenceQueue, k11, i11);
            this.f43630b = null;
        }
    }

    static final class u<K, V> extends l<K, V, t<K, V>, u<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f43633g;

        u(h0<K, V, t<K, V>, u<K, V>> h0Var, int i11) {
            super(h0Var, i11);
            this.f43633g = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h0.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public u<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.h0.l
        void o() {
            b(this.f43633g);
        }

        @Override // com.google.common.collect.h0.l
        void p() {
            e(this.f43633g);
        }
    }

    private static class v<K, V> extends c<K, V, v<K, V>> implements x<K, V, v<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile y<K, V, v<K, V>> f43634b;

        static final class a<K, V> implements i<K, V, v<K, V>, w<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f43635a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f43635a;
            }

            @Override // com.google.common.collect.h0.i
            public m d() {
                return m.WEAK;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public v<K, V> c(w<K, V> wVar, v<K, V> vVar, v<K, V> vVar2) {
                K key = vVar.getKey();
                if (key == null || l.n(vVar)) {
                    return null;
                }
                v<K, V> vVarE = e(wVar, key, vVar.f43602a, vVar2);
                ((v) vVarE).f43634b = ((v) vVar).f43634b.a(((w) wVar).f43638h, vVarE);
                return vVarE;
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(w<K, V> wVar, K k11, int i11, v<K, V> vVar) {
                return vVar == null ? new v<>(((w) wVar).f43637g, k11, i11) : new b(((w) wVar).f43637g, k11, i11, vVar);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public w<K, V> a(h0<K, V, v<K, V>, w<K, V>> h0Var, int i11) {
                return new w<>(h0Var, i11);
            }

            @Override // com.google.common.collect.h0.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(w<K, V> wVar, v<K, V> vVar, V v11) {
                y yVar = ((v) vVar).f43634b;
                ((v) vVar).f43634b = new z(((w) wVar).f43638h, v11, vVar);
                yVar.clear();
            }
        }

        private static final class b<K, V> extends v<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final v<K, V> f43636c;

            b(ReferenceQueue<K> referenceQueue, K k11, int i11, v<K, V> vVar) {
                super(referenceQueue, k11, i11);
                this.f43636c = vVar;
            }

            @Override // com.google.common.collect.h0.c, com.google.common.collect.h0.h
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public v<K, V> getNext() {
                return this.f43636c;
            }
        }

        v(ReferenceQueue<K> referenceQueue, K k11, int i11) {
            super(referenceQueue, k11, i11);
            this.f43634b = h0.m();
        }

        @Override // com.google.common.collect.h0.h
        public final V getValue() {
            return this.f43634b.get();
        }

        @Override // com.google.common.collect.h0.x
        public final y<K, V, v<K, V>> getValueReference() {
            return this.f43634b;
        }
    }

    static final class w<K, V> extends l<K, V, v<K, V>, w<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f43637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f43638h;

        w(h0<K, V, v<K, V>, w<K, V>> h0Var, int i11) {
            super(h0Var, i11);
            this.f43637g = new ReferenceQueue<>();
            this.f43638h = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h0.l
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public w<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.h0.l
        void o() {
            b(this.f43637g);
        }

        @Override // com.google.common.collect.h0.l
        void p() {
            e(this.f43637g);
            f(this.f43638h);
        }
    }

    interface x<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        y<K, V, E> getValueReference();
    }

    interface y<K, V, E extends h<K, V, E>> {
        y<K, V, E> a(ReferenceQueue<V> referenceQueue, E e11);

        E b();

        void clear();

        V get();
    }

    static final class z<K, V, E extends h<K, V, E>> extends WeakReference<V> implements y<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final E f43639a;

        z(ReferenceQueue<V> referenceQueue, V v11, E e11) {
            super(v11, referenceQueue);
            this.f43639a = e11;
        }

        @Override // com.google.common.collect.h0.y
        public y<K, V, E> a(ReferenceQueue<V> referenceQueue, E e11) {
            return new z(referenceQueue, get(), e11);
        }

        @Override // com.google.common.collect.h0.y
        public E b() {
            return this.f43639a;
        }
    }

    private h0(g0 g0Var, i<K, V, E, S> iVar) {
        this.f43593d = Math.min(g0Var.a(), 65536);
        this.f43594e = g0Var.c();
        this.f43595f = iVar;
        int iMin = Math.min(g0Var.b(), 1073741824);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f43593d) {
            i13++;
            i14 <<= 1;
        }
        this.f43591b = 32 - i13;
        this.f43590a = i14 - 1;
        this.f43592c = h(i14);
        int i15 = iMin / i14;
        while (i12 < (i14 * i15 < iMin ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        while (true) {
            l<K, V, E, S>[] lVarArr = this.f43592c;
            if (i11 >= lVarArr.length) {
                return;
            }
            lVarArr[i11] = c(i12);
            i11++;
        }
    }

    static <K, V> h0<K, V, ? extends h<K, V, ?>, ?> b(g0 g0Var) {
        m mVarD = g0Var.d();
        m mVar = m.STRONG;
        if (mVarD == mVar && g0Var.e() == mVar) {
            return new h0<>(g0Var, n.a.g());
        }
        if (g0Var.d() == mVar && g0Var.e() == m.WEAK) {
            return new h0<>(g0Var, p.a.g());
        }
        m mVarD2 = g0Var.d();
        m mVar2 = m.WEAK;
        if (mVarD2 == mVar2 && g0Var.e() == mVar) {
            return new h0<>(g0Var, t.a.g());
        }
        if (g0Var.d() == mVar2 && g0Var.e() == mVar2) {
            return new h0<>(g0Var, v.a.g());
        }
        throw new AssertionError();
    }

    static int k(int i11) {
        int i12 = i11 + ((i11 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = i15 + (i15 << 2) + (i15 << 14);
        return i16 ^ (i16 >>> 16);
    }

    static <K, V, E extends h<K, V, E>> y<K, V, E> m() {
        return (y<K, V, E>) f43589j;
    }

    l<K, V, E, S> c(int i11) {
        return this.f43595f.a(this, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (l<K, V, E, S> lVar : this.f43592c) {
            lVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iE = e(obj);
        return l(iE).c(obj, iE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        l<K, V, E, S>[] lVarArr = this.f43592c;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = lVarArr.length;
            long j12 = 0;
            for (?? r11 = z11; r11 < length; r11++) {
                l<K, V, E, S> lVar = lVarArr[r11];
                int i12 = lVar.f43616b;
                AtomicReferenceArray<E> atomicReferenceArray = lVar.f43619e;
                for (?? r13 = z11; r13 < atomicReferenceArray.length(); r13++) {
                    E next = atomicReferenceArray.get(r13);
                    while (next != null) {
                        V vL = lVar.l(next);
                        boolean z12 = z11;
                        if (vL != null && n().d(obj, vL)) {
                            return true;
                        }
                        next = next.getNext();
                        z11 = z12;
                    }
                }
                j12 += (long) lVar.f43617c;
                z11 = z11;
            }
            boolean z13 = z11;
            if (j12 == j11) {
                return z13;
            }
            i11++;
            j11 = j12;
            z11 = z13;
        }
        return z11;
    }

    V d(E e11) {
        if (e11.getKey() == null) {
            return null;
        }
        return (V) e11.getValue();
    }

    int e(Object obj) {
        return k(this.f43594e.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f43598i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f43598i = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        return l(iE).h(obj, iE);
    }

    final l<K, V, E, S>[] h(int i11) {
        return new l[i11];
    }

    void i(E e11) {
        int hash = e11.getHash();
        l(hash).u(e11, hash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        l<K, V, E, S>[] lVarArr = this.f43592c;
        long j11 = 0;
        for (int i11 = 0; i11 < lVarArr.length; i11++) {
            if (lVarArr[i11].f43616b != 0) {
                return false;
            }
            j11 += (long) lVarArr[i11].f43617c;
        }
        if (j11 == 0) {
            return true;
        }
        for (int i12 = 0; i12 < lVarArr.length; i12++) {
            if (lVarArr[i12].f43616b != 0) {
                return false;
            }
            j11 -= (long) lVarArr[i12].f43617c;
        }
        return j11 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void j(y<K, V, E> yVar) {
        h hVarB = yVar.b();
        int hash = hVarB.getHash();
        l(hash).v(hVarB.getKey(), hash, yVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f43596g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f43596g = kVar;
        return kVar;
    }

    l<K, V, E, S> l(int i11) {
        return this.f43592c[(i11 >>> this.f43591b) & this.f43590a];
    }

    ou.f<Object> n() {
        return this.f43595f.d().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        int iE = e(k11);
        return l(iE).t(k11, iE, v11, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        int iE = e(k11);
        return l(iE).t(k11, iE, v11, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        return l(iE).w(obj, iE);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k11, V v11, V v12) {
        ou.p.m(k11);
        ou.p.m(v12);
        if (v11 == null) {
            return false;
        }
        int iE = e(k11);
        return l(iE).A(k11, iE, v11, v12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j11 = 0;
        for (l<K, V, E, S> lVar : this.f43592c) {
            j11 += (long) lVar.f43616b;
        }
        return ru.f.m(j11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f43597h;
        if (collection != null) {
            return collection;
        }
        s sVar = new s();
        this.f43597h = sVar;
        return sVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iE = e(obj);
        return l(iE).x(obj, iE, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        int iE = e(k11);
        return l(iE).z(k11, iE, v11);
    }
}
