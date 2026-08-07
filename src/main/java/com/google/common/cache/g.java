package com.google.common.cache;

import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Logger f43376w = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final y<Object, Object> f43377x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Queue<?> f43378y = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final p<K, V>[] f43381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f43382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ou.f<Object> f43383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ou.f<Object> f43384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final r f43385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final r f43386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final long f43387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final com.google.common.cache.r<K, V> f43388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f43389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f43390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final long f43391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Queue<com.google.common.cache.p<K, V>> f43392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final com.google.common.cache.o<K, V> f43393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ou.a0 f43394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final f f43395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final com.google.common.cache.b f43396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final CacheLoader<? super K, V> f43397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Set<K> f43398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Collection<V> f43399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Set<Map.Entry<K, V>> f43400v;

    class a implements y<Object, Object> {
        a() {
        }

        @Override // com.google.common.cache.g.y
        public int a() {
            return 0;
        }

        @Override // com.google.common.cache.g.y
        public com.google.common.cache.m<Object, Object> b() {
            return null;
        }

        @Override // com.google.common.cache.g.y
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.g.y
        public void d(Object obj) {
        }

        @Override // com.google.common.cache.g.y
        public Object e() {
            return null;
        }

        @Override // com.google.common.cache.g.y
        public y<Object, Object> f(ReferenceQueue<Object> referenceQueue, Object obj, com.google.common.cache.m<Object, Object> mVar) {
            return this;
        }

        @Override // com.google.common.cache.g.y
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.g.y
        public boolean isActive() {
            return false;
        }
    }

    static final class a0<K, V> extends c0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f43401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43403f;

        a0(ReferenceQueue<K> referenceQueue, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(referenceQueue, k11, i11, mVar);
            this.f43401d = Long.MAX_VALUE;
            this.f43402e = g.s();
            this.f43403f = g.s();
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public long getAccessTime() {
            return this.f43401d;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            return this.f43402e;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            return this.f43403f;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setAccessTime(long j11) {
            this.f43401d = j11;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43402e = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43403f = mVar;
        }
    }

    class b extends AbstractQueue<Object> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return com.google.common.collect.b0.q().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    static final class b0<K, V> extends c0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f43404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f43407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43409i;

        b0(ReferenceQueue<K> referenceQueue, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(referenceQueue, k11, i11, mVar);
            this.f43404d = Long.MAX_VALUE;
            this.f43405e = g.s();
            this.f43406f = g.s();
            this.f43407g = Long.MAX_VALUE;
            this.f43408h = g.s();
            this.f43409i = g.s();
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public long getAccessTime() {
            return this.f43404d;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            return this.f43405e;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            return this.f43408h;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            return this.f43406f;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            return this.f43409i;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public long getWriteTime() {
            return this.f43407g;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setAccessTime(long j11) {
            this.f43404d = j11;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43405e = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43408h = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43406f = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43409i = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setWriteTime(long j11) {
            this.f43407g = j11;
        }
    }

    abstract class c<T> extends AbstractSet<T> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return g.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.size();
        }
    }

    private static class c0<K, V> extends WeakReference<K> implements com.google.common.cache.m<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f43411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile y<K, V> f43413c;

        c0(ReferenceQueue<K> referenceQueue, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(k11, referenceQueue);
            this.f43413c = g.E();
            this.f43411a = i11;
            this.f43412b = mVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public int getHash() {
            return this.f43411a;
        }

        @Override // com.google.common.cache.m
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNext() {
            return this.f43412b;
        }

        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public y<K, V> getValueReference() {
            return this.f43413c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j11) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setValueReference(y<K, V> yVar) {
            this.f43413c = yVar;
        }

        public void setWriteTime(long j11) {
            throw new UnsupportedOperationException();
        }
    }

    static abstract class d<K, V> implements com.google.common.cache.m<K, V> {
        d() {
        }

        @Override // com.google.common.cache.m
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public y<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setAccessTime(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setValueReference(y<K, V> yVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.m
        public void setWriteTime(long j11) {
            throw new UnsupportedOperationException();
        }
    }

    private static class d0<K, V> extends WeakReference<V> implements y<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43414a;

        d0(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            super(v11, referenceQueue);
            this.f43414a = mVar;
        }

        @Override // com.google.common.cache.g.y
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.g.y
        public com.google.common.cache.m<K, V> b() {
            return this.f43414a;
        }

        @Override // com.google.common.cache.g.y
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.g.y
        public void d(V v11) {
        }

        @Override // com.google.common.cache.g.y
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.g.y
        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return new d0(referenceQueue, v11, mVar);
        }

        @Override // com.google.common.cache.g.y
        public boolean isActive() {
            return true;
        }
    }

    static final class e<K, V> extends AbstractQueue<com.google.common.cache.m<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43415a = new a();

        class a extends d<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            com.google.common.cache.m<K, V> f43416a = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            com.google.common.cache.m<K, V> f43417b = this;

            a() {
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public com.google.common.cache.m<K, V> getNextInAccessQueue() {
                return this.f43416a;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
                return this.f43417b;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setAccessTime(long j11) {
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
                this.f43416a = mVar;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
                this.f43417b = mVar;
            }
        }

        class b extends com.google.common.collect.g<com.google.common.cache.m<K, V>> {
            b(com.google.common.cache.m mVar) {
                super(mVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.m<K, V> a(com.google.common.cache.m<K, V> mVar) {
                com.google.common.cache.m<K, V> nextInAccessQueue = mVar.getNextInAccessQueue();
                if (nextInAccessQueue == e.this.f43415a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        e() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.m<K, V> mVar) {
            g.b(mVar.getPreviousInAccessQueue(), mVar.getNextInAccessQueue());
            g.b(this.f43415a.getPreviousInAccessQueue(), mVar);
            g.b(mVar, this.f43415a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.m<K, V> peek() {
            com.google.common.cache.m<K, V> nextInAccessQueue = this.f43415a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f43415a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.m<K, V> nextInAccessQueue = this.f43415a.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.m<K, V> mVar = this.f43415a;
                if (nextInAccessQueue == mVar) {
                    mVar.setNextInAccessQueue(mVar);
                    com.google.common.cache.m<K, V> mVar2 = this.f43415a;
                    mVar2.setPreviousInAccessQueue(mVar2);
                    return;
                } else {
                    com.google.common.cache.m<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    g.t(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.m) obj).getNextInAccessQueue() != o.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.m<K, V> poll() {
            com.google.common.cache.m<K, V> nextInAccessQueue = this.f43415a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f43415a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f43415a.getNextInAccessQueue() == this.f43415a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.m<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.m mVar = (com.google.common.cache.m) obj;
            com.google.common.cache.m<K, V> previousInAccessQueue = mVar.getPreviousInAccessQueue();
            com.google.common.cache.m<K, V> nextInAccessQueue = mVar.getNextInAccessQueue();
            g.b(previousInAccessQueue, nextInAccessQueue);
            g.t(mVar);
            return nextInAccessQueue != o.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (com.google.common.cache.m<K, V> nextInAccessQueue = this.f43415a.getNextInAccessQueue(); nextInAccessQueue != this.f43415a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i11++;
            }
            return i11;
        }
    }

    static final class e0<K, V> extends c0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f43420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43422f;

        e0(ReferenceQueue<K> referenceQueue, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(referenceQueue, k11, i11, mVar);
            this.f43420d = Long.MAX_VALUE;
            this.f43421e = g.s();
            this.f43422f = g.s();
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            return this.f43421e;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            return this.f43422f;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public long getWriteTime() {
            return this.f43420d;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43421e = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43422f = mVar;
        }

        @Override // com.google.common.cache.g.c0, com.google.common.cache.m
        public void setWriteTime(long j11) {
            this.f43420d = j11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class f {
        private static final /* synthetic */ f[] $VALUES;
        static final int ACCESS_MASK = 1;
        public static final f STRONG;
        public static final f STRONG_ACCESS;
        public static final f STRONG_ACCESS_WRITE;
        public static final f STRONG_WRITE;
        public static final f WEAK;
        public static final f WEAK_ACCESS;
        public static final f WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final f WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final f[] factories;

        final enum a extends f {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new u(k11, i11, mVar);
            }
        }

        final enum b extends f {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyAccessEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new s(k11, i11, mVar);
            }
        }

        final enum c extends f {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyWriteEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new w(k11, i11, mVar);
            }
        }

        final enum d extends f {
            d(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyAccessEntry(mVar, mVarCopyEntry);
                copyWriteEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new t(k11, i11, mVar);
            }
        }

        final enum e extends f {
            e(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new c0(pVar.f43457h, k11, i11, mVar);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.g$f$f, reason: collision with other inner class name */
        final enum C0679f extends f {
            C0679f(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyAccessEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new a0(pVar.f43457h, k11, i11, mVar);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.g$f$g, reason: collision with other inner class name */
        final enum C0680g extends f {
            C0680g(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyWriteEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new e0(pVar.f43457h, k11, i11, mVar);
            }
        }

        final enum h extends f {
            h(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
                com.google.common.cache.m<K, V> mVarCopyEntry = super.copyEntry(pVar, mVar, mVar2, k11);
                copyAccessEntry(mVar, mVarCopyEntry);
                copyWriteEntry(mVar, mVarCopyEntry);
                return mVarCopyEntry;
            }

            @Override // com.google.common.cache.g.f
            <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar) {
                return new b0(pVar.f43457h, k11, i11, mVar);
            }
        }

        private static /* synthetic */ f[] $values() {
            return new f[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            STRONG_ACCESS = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            STRONG_WRITE = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e("WEAK", 4);
            WEAK = eVar;
            C0679f c0679f = new C0679f("WEAK_ACCESS", 5);
            WEAK_ACCESS = c0679f;
            C0680g c0680g = new C0680g("WEAK_WRITE", 6);
            WEAK_WRITE = c0680g;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = $values();
            factories = new f[]{aVar, bVar, cVar, dVar, eVar, c0679f, c0680g, hVar};
        }

        private f(String str, int i11) {
            super(str, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static f getFactory(r rVar, boolean z11, boolean z12) {
            return factories[((rVar == r.WEAK ? (char) 4 : (char) 0) | (z11 ? 1 : 0) ? 1 : 0) | (z12 ? 2 : 0)];
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        <K, V> void copyAccessEntry(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
            mVar2.setAccessTime(mVar.getAccessTime());
            g.b(mVar.getPreviousInAccessQueue(), mVar2);
            g.b(mVar2, mVar.getNextInAccessQueue());
            g.t(mVar);
        }

        <K, V> com.google.common.cache.m<K, V> copyEntry(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11) {
            return newEntry(pVar, k11, mVar.getHash(), mVar2);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
            mVar2.setWriteTime(mVar.getWriteTime());
            g.c(mVar.getPreviousInWriteQueue(), mVar2);
            g.c(mVar2, mVar.getNextInWriteQueue());
            g.u(mVar);
        }

        abstract <K, V> com.google.common.cache.m<K, V> newEntry(p<K, V> pVar, K k11, int i11, com.google.common.cache.m<K, V> mVar);

        /* synthetic */ f(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    static final class f0<K, V> extends q<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43423b;

        f0(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar, int i11) {
            super(referenceQueue, v11, mVar);
            this.f43423b = i11;
        }

        @Override // com.google.common.cache.g.q, com.google.common.cache.g.y
        public int a() {
            return this.f43423b;
        }

        @Override // com.google.common.cache.g.q, com.google.common.cache.g.y
        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return new f0(referenceQueue, v11, mVar, this.f43423b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.g$g, reason: collision with other inner class name */
    final class C0681g extends g<K, V>.i<Map.Entry<K, V>> {
        C0681g() {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    static final class g0<K, V> extends v<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43425b;

        g0(V v11, int i11) {
            super(v11);
            this.f43425b = i11;
        }

        @Override // com.google.common.cache.g.v, com.google.common.cache.g.y
        public int a() {
            return this.f43425b;
        }
    }

    final class h extends g<K, V>.c<Map.Entry<K, V>> {
        h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = g.this.get(key)) != null && g.this.f43384f.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0681g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && g.this.remove(key, entry.getValue());
        }
    }

    static final class h0<K, V> extends d0<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43427b;

        h0(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar, int i11) {
            super(referenceQueue, v11, mVar);
            this.f43427b = i11;
        }

        @Override // com.google.common.cache.g.d0, com.google.common.cache.g.y
        public int a() {
            return this.f43427b;
        }

        @Override // com.google.common.cache.g.d0, com.google.common.cache.g.y
        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return new h0(referenceQueue, v11, mVar, this.f43427b);
        }
    }

    abstract class i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f43429b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        p<K, V> f43430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<com.google.common.cache.m<K, V>> f43431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g<K, V>.j0 f43433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        g<K, V>.j0 f43434g;

        i() {
            this.f43428a = g.this.f43381c.length - 1;
            a();
        }

        final void a() {
            this.f43433f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f43428a;
                if (i11 < 0) {
                    return;
                }
                p<K, V>[] pVarArr = g.this.f43381c;
                this.f43428a = i11 - 1;
                p<K, V> pVar = pVarArr[i11];
                this.f43430c = pVar;
                if (pVar.f43451b != 0) {
                    AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43430c.f43455f;
                    this.f43431d = atomicReferenceArray;
                    this.f43429b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(com.google.common.cache.m<K, V> mVar) {
            p<K, V> pVar;
            try {
                long jA = g.this.f43394p.a();
                K key = mVar.getKey();
                Object objM = g.this.m(mVar, jA);
                if (objM == null) {
                    return false;
                }
                this.f43433f = new j0(key, objM);
                return true;
            } finally {
                this.f43430c.F();
            }
        }

        g<K, V>.j0 c() {
            g<K, V>.j0 j0Var = this.f43433f;
            if (j0Var == null) {
                throw new NoSuchElementException();
            }
            this.f43434g = j0Var;
            a();
            return this.f43434g;
        }

        boolean d() {
            com.google.common.cache.m<K, V> mVar = this.f43432e;
            if (mVar == null) {
                return false;
            }
            while (true) {
                this.f43432e = mVar.getNext();
                com.google.common.cache.m<K, V> mVar2 = this.f43432e;
                if (mVar2 == null) {
                    return false;
                }
                if (b(mVar2)) {
                    return true;
                }
                mVar = this.f43432e;
            }
        }

        boolean e() {
            while (true) {
                int i11 = this.f43429b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43431d;
                this.f43429b = i11 - 1;
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(i11);
                this.f43432e = mVar;
                if (mVar != null && (b(mVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43433f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            ou.p.r(this.f43434g != null);
            g.this.remove(this.f43434g.getKey());
            this.f43434g = null;
        }
    }

    static final class i0<K, V> extends AbstractQueue<com.google.common.cache.m<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43436a = new a();

        class a extends d<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            com.google.common.cache.m<K, V> f43437a = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            com.google.common.cache.m<K, V> f43438b = this;

            a() {
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public com.google.common.cache.m<K, V> getNextInWriteQueue() {
                return this.f43437a;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
                return this.f43438b;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
                this.f43437a = mVar;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
                this.f43438b = mVar;
            }

            @Override // com.google.common.cache.g.d, com.google.common.cache.m
            public void setWriteTime(long j11) {
            }
        }

        class b extends com.google.common.collect.g<com.google.common.cache.m<K, V>> {
            b(com.google.common.cache.m mVar) {
                super(mVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.m<K, V> a(com.google.common.cache.m<K, V> mVar) {
                com.google.common.cache.m<K, V> nextInWriteQueue = mVar.getNextInWriteQueue();
                if (nextInWriteQueue == i0.this.f43436a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        i0() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.m<K, V> mVar) {
            g.c(mVar.getPreviousInWriteQueue(), mVar.getNextInWriteQueue());
            g.c(this.f43436a.getPreviousInWriteQueue(), mVar);
            g.c(mVar, this.f43436a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.m<K, V> peek() {
            com.google.common.cache.m<K, V> nextInWriteQueue = this.f43436a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f43436a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.m<K, V> nextInWriteQueue = this.f43436a.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.m<K, V> mVar = this.f43436a;
                if (nextInWriteQueue == mVar) {
                    mVar.setNextInWriteQueue(mVar);
                    com.google.common.cache.m<K, V> mVar2 = this.f43436a;
                    mVar2.setPreviousInWriteQueue(mVar2);
                    return;
                } else {
                    com.google.common.cache.m<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    g.u(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.m) obj).getNextInWriteQueue() != o.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.m<K, V> poll() {
            com.google.common.cache.m<K, V> nextInWriteQueue = this.f43436a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f43436a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f43436a.getNextInWriteQueue() == this.f43436a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.m<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.m mVar = (com.google.common.cache.m) obj;
            com.google.common.cache.m<K, V> previousInWriteQueue = mVar.getPreviousInWriteQueue();
            com.google.common.cache.m<K, V> nextInWriteQueue = mVar.getNextInWriteQueue();
            g.c(previousInWriteQueue, nextInWriteQueue);
            g.u(mVar);
            return nextInWriteQueue != o.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (com.google.common.cache.m<K, V> nextInWriteQueue = this.f43436a.getNextInWriteQueue(); nextInWriteQueue != this.f43436a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i11++;
            }
            return i11;
        }
    }

    final class j extends g<K, V>.i<K> {
        j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    final class j0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f43442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        V f43443b;

        j0(K k11, V v11) {
            this.f43442a = k11;
            this.f43443b = v11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f43442a.equals(entry.getKey()) && this.f43443b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f43442a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f43443b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f43442a.hashCode() ^ this.f43443b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = (V) g.this.put(this.f43442a, v11);
            this.f43443b = v11;
            return v12;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class k extends g<K, V>.c<K> {
        k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.remove(obj) != null;
        }
    }

    static class l<K, V> implements y<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile y<K, V> f43446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.util.concurrent.a0<V> f43447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ou.v f43448c;

        public l() {
            this(g.E());
        }

        public static /* synthetic */ Object g(l lVar, Object obj) {
            lVar.l(obj);
            return obj;
        }

        private com.google.common.util.concurrent.s<V> i(Throwable th2) {
            return com.google.common.util.concurrent.m.c(th2);
        }

        @Override // com.google.common.cache.g.y
        public int a() {
            return this.f43446a.a();
        }

        @Override // com.google.common.cache.g.y
        public com.google.common.cache.m<K, V> b() {
            return null;
        }

        @Override // com.google.common.cache.g.y
        public boolean c() {
            return true;
        }

        @Override // com.google.common.cache.g.y
        public void d(V v11) {
            if (v11 != null) {
                l(v11);
            } else {
                this.f43446a = g.E();
            }
        }

        @Override // com.google.common.cache.g.y
        public V e() {
            return (V) com.google.common.util.concurrent.c0.a(this.f43447b);
        }

        @Override // com.google.common.cache.g.y
        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return this;
        }

        @Override // com.google.common.cache.g.y
        public V get() {
            return this.f43446a.get();
        }

        public long h() {
            return this.f43448c.d(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.g.y
        public boolean isActive() {
            return this.f43446a.isActive();
        }

        public y<K, V> j() {
            return this.f43446a;
        }

        public com.google.common.util.concurrent.s<V> k(K k11, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f43448c.f();
                V v11 = this.f43446a.get();
                if (v11 == null) {
                    V vB = cacheLoader.b(k11);
                    return l(vB) ? this.f43447b : com.google.common.util.concurrent.m.d(vB);
                }
                com.google.common.util.concurrent.s<V> sVarC = cacheLoader.c(k11, v11);
                return sVarC == null ? com.google.common.util.concurrent.m.d(null) : com.google.common.util.concurrent.m.f(sVarC, new ou.h() { // from class: com.google.common.cache.h
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return g.l.g(this.f43484a, obj);
                    }
                }, com.google.common.util.concurrent.w.b());
            } catch (Throwable th2) {
                com.google.common.util.concurrent.s<V> sVarI = m(th2) ? this.f43447b : i(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return sVarI;
            }
        }

        public boolean l(V v11) {
            return this.f43447b.M(v11);
        }

        public boolean m(Throwable th2) {
            return this.f43447b.N(th2);
        }

        public l(y<K, V> yVar) {
            this.f43447b = com.google.common.util.concurrent.a0.Q();
            this.f43448c = ou.v.c();
            this.f43446a = yVar;
        }
    }

    static class m<K, V> extends n<K, V> implements com.google.common.cache.f<K, V> {
        m(com.google.common.cache.d<? super K, ? super V> dVar, CacheLoader<? super K, V> cacheLoader) {
            super(new g(dVar, (CacheLoader) ou.p.m(cacheLoader)), null);
        }

        public V a(K k11) {
            try {
                return get(k11);
            } catch (ExecutionException e11) {
                throw new UncheckedExecutionException(e11.getCause());
            }
        }

        @Override // ou.h
        public final V apply(K k11) {
            return a(k11);
        }

        @Override // com.google.common.cache.f
        public V get(K k11) {
            return this.f43449a.n(k11);
        }
    }

    static class n<K, V> implements com.google.common.cache.c<K, V>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g<K, V> f43449a;

        /* synthetic */ n(g gVar, a aVar) {
            this(gVar);
        }

        @Override // com.google.common.cache.c
        public ConcurrentMap<K, V> asMap() {
            return this.f43449a;
        }

        @Override // com.google.common.cache.c
        public void b() throws Throwable {
            this.f43449a.clear();
        }

        n(com.google.common.cache.d<? super K, ? super V> dVar) {
            this(new g(dVar, null));
        }

        private n(g<K, V> gVar) {
            this.f43449a = gVar;
        }
    }

    private enum o implements com.google.common.cache.m<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.m
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.m
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.m
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.m
        public com.google.common.cache.m<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.m
        public y<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.m
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.m
        public void setAccessTime(long j11) {
        }

        @Override // com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<Object, Object> mVar) {
        }

        @Override // com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<Object, Object> mVar) {
        }

        @Override // com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<Object, Object> mVar) {
        }

        @Override // com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<Object, Object> mVar) {
        }

        @Override // com.google.common.cache.m
        public void setValueReference(y<Object, Object> yVar) {
        }

        @Override // com.google.common.cache.m
        public void setWriteTime(long j11) {
        }
    }

    static final class p<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g<K, V> f43450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f43451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f43452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile AtomicReferenceArray<com.google.common.cache.m<K, V>> f43455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f43456g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final ReferenceQueue<K> f43457h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final ReferenceQueue<V> f43458i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Queue<com.google.common.cache.m<K, V>> f43459j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f43460k = new AtomicInteger();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final Queue<com.google.common.cache.m<K, V>> f43461l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Queue<com.google.common.cache.m<K, V>> f43462m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final com.google.common.cache.b f43463n;

        p(g<K, V> gVar, int i11, long j11, com.google.common.cache.b bVar) {
            this.f43450a = gVar;
            this.f43456g = j11;
            this.f43463n = (com.google.common.cache.b) ou.p.m(bVar);
            y(E(i11));
            this.f43457h = gVar.H() ? new ReferenceQueue<>() : null;
            this.f43458i = gVar.I() ? new ReferenceQueue<>() : null;
            this.f43459j = gVar.G() ? new ConcurrentLinkedQueue<>() : g.h();
            this.f43461l = gVar.K() ? new i0<>() : g.h();
            this.f43462m = gVar.G() ? new e<>() : g.h();
        }

        public static /* synthetic */ void a(p pVar, Object obj, int i11, l lVar, com.google.common.util.concurrent.s sVar) {
            pVar.getClass();
            try {
                pVar.s(obj, i11, lVar, sVar);
            } catch (Throwable th2) {
                g.f43376w.log(Level.WARNING, "Exception thrown during refresh", th2);
                lVar.m(th2);
            }
        }

        com.google.common.util.concurrent.s<V> A(final K k11, final int i11, final l<K, V> lVar, CacheLoader<? super K, V> cacheLoader) {
            final com.google.common.util.concurrent.s<V> sVarK = lVar.k(k11, cacheLoader);
            sVarK.b(new Runnable() { // from class: com.google.common.cache.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.p.a(this.f43485a, k11, i11, lVar, sVarK);
                }
            }, com.google.common.util.concurrent.w.b());
            return sVarK;
        }

        V B(K k11, int i11, l<K, V> lVar, CacheLoader<? super K, V> cacheLoader) {
            return s(k11, i11, lVar, lVar.k(k11, cacheLoader));
        }

        V C(K k11, int i11, CacheLoader<? super K, V> cacheLoader) {
            l<K, V> lVar;
            boolean z11;
            y<K, V> valueReference;
            V vB;
            int i12 = i11;
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                int i13 = this.f43451b - 1;
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = i12 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> mVarD = mVar;
                while (true) {
                    lVar = null;
                    if (mVarD == null) {
                        z11 = true;
                        valueReference = null;
                        break;
                    }
                    long j11 = jA;
                    K key = mVarD.getKey();
                    if (mVarD.getHash() == i12 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        valueReference = mVarD.getValueReference();
                        if (!valueReference.c()) {
                            V v11 = valueReference.get();
                            if (v11 == null) {
                                m(key, i12, v11, valueReference.a(), com.google.common.cache.n.COLLECTED);
                                i12 = i11;
                            } else {
                                if (!this.f43450a.p(mVarD, j11)) {
                                    L(mVarD, j11);
                                    this.f43463n.a(1);
                                    unlock();
                                    G();
                                    return v11;
                                }
                                i12 = i11;
                                m(key, i12, v11, valueReference.a(), com.google.common.cache.n.EXPIRED);
                            }
                            this.f43461l.remove(mVarD);
                            this.f43462m.remove(mVarD);
                            this.f43451b = i13;
                            z11 = true;
                            break;
                        }
                        z11 = false;
                        break;
                    }
                    mVarD = mVarD.getNext();
                    jA = j11;
                }
                if (z11) {
                    lVar = new l<>();
                    if (mVarD == null) {
                        mVarD = D(k11, i12, mVar);
                        mVarD.setValueReference(lVar);
                        atomicReferenceArray.set(length, mVarD);
                    } else {
                        mVarD.setValueReference(lVar);
                    }
                }
                unlock();
                G();
                if (!z11) {
                    return g0(mVarD, k11, valueReference);
                }
                try {
                    synchronized (mVarD) {
                        vB = B(k11, i12, lVar, cacheLoader);
                    }
                    this.f43463n.d(1);
                    return vB;
                } catch (Throwable th2) {
                    this.f43463n.d(1);
                    throw th2;
                }
            } catch (Throwable th3) {
                unlock();
                G();
                throw th3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        com.google.common.cache.m<K, V> D(K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            return this.f43450a.f43395q.newEntry(this, ou.p.m(k11), i11, mVar);
        }

        AtomicReferenceArray<com.google.common.cache.m<K, V>> E(int i11) {
            return new AtomicReferenceArray<>(i11);
        }

        void F() {
            if ((this.f43460k.incrementAndGet() & 63) == 0) {
                b();
            }
        }

        void G() {
            Z();
        }

        void H(long j11) {
            Y(j11);
        }

        V I(K k11, int i11, V v11, boolean z11) {
            com.google.common.cache.m<K, V> mVar;
            int i12;
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                if (this.f43451b + 1 > this.f43454e) {
                    o();
                }
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = i11 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.m<K, V> mVar2 = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar2;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        y<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (v12 != null) {
                            long j11 = jA;
                            com.google.common.cache.m<K, V> mVar3 = next;
                            if (z11) {
                                L(mVar3, j11);
                                return v12;
                            }
                            this.f43453d++;
                            m(k11, i11, v12, valueReference.a(), com.google.common.cache.n.REPLACED);
                            b0(mVar3, k11, v11, j11);
                            n(mVar3);
                            return v12;
                        }
                        this.f43453d++;
                        if (valueReference.isActive()) {
                            m(k11, i11, v12, valueReference.a(), com.google.common.cache.n.COLLECTED);
                            com.google.common.cache.m<K, V> mVar4 = next;
                            b0(mVar4, k11, v11, jA);
                            i12 = this.f43451b;
                            mVar = mVar4;
                        } else {
                            com.google.common.cache.m<K, V> mVar5 = next;
                            b0(mVar5, k11, v11, jA);
                            mVar = mVar5;
                            i12 = this.f43451b + 1;
                        }
                        this.f43451b = i12;
                        n(mVar);
                        return null;
                    }
                    long j12 = jA;
                    next = next.getNext();
                    jA = j12;
                }
                this.f43453d++;
                com.google.common.cache.m<K, V> mVarD = D(k11, i11, mVar2);
                b0(mVarD, k11, v11, jA);
                atomicReferenceArray.set(length, mVarD);
                this.f43451b++;
                n(mVarD);
                return null;
            } finally {
                unlock();
                G();
            }
        }

        boolean J(com.google.common.cache.m<K, V> mVar, int i11) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar2 = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar2;
                while (next != null) {
                    if (next == mVar) {
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar2, next, next.getKey(), i11, next.getValueReference().get(), next.getValueReference(), com.google.common.cache.n.COLLECTED);
                        int i12 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i12;
                        unlock();
                        G();
                        return true;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    unlock();
                    G();
                    throw th3;
                }
                unlock();
                G();
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        boolean K(K k11, int i11, y<K, V> yVar) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        if (next.getValueReference() != yVar) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                G();
                            }
                            return false;
                        }
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar, next, key, i11, yVar.get(), yVar, com.google.common.cache.n.COLLECTED);
                        int i12 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i12;
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            G();
                        }
                        return true;
                    }
                    int i13 = i11;
                    y<K, V> yVar2 = yVar;
                    try {
                        next = next.getNext();
                        i11 = i13;
                        yVar = yVar2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    unlock();
                    if (isHeldByCurrentThread()) {
                        throw th3;
                    }
                    G();
                    throw th3;
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        void L(com.google.common.cache.m<K, V> mVar, long j11) {
            if (this.f43450a.y()) {
                mVar.setAccessTime(j11);
            }
            this.f43462m.add(mVar);
        }

        void M(com.google.common.cache.m<K, V> mVar, long j11) {
            if (this.f43450a.y()) {
                mVar.setAccessTime(j11);
            }
            this.f43459j.add(mVar);
        }

        void N(com.google.common.cache.m<K, V> mVar, int i11, long j11) {
            j();
            this.f43452c += (long) i11;
            if (this.f43450a.y()) {
                mVar.setAccessTime(j11);
            }
            if (this.f43450a.A()) {
                mVar.setWriteTime(j11);
            }
            this.f43462m.add(mVar);
            this.f43461l.add(mVar);
        }

        V O(K k11, int i11, CacheLoader<? super K, V> cacheLoader, boolean z11) {
            l<K, V> lVarZ = z(k11, i11, z11);
            if (lVarZ == null) {
                return null;
            }
            com.google.common.util.concurrent.s<V> sVarA = A(k11, i11, lVarZ, cacheLoader);
            if (sVarA.isDone()) {
                try {
                    return (V) com.google.common.util.concurrent.c0.a(sVarA);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        V P(Object obj, int i11) throws Throwable {
            Throwable th2;
            com.google.common.cache.n nVar;
            lock();
            try {
                H(this.f43450a.f43394p.a());
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(obj, key)) {
                        y<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (v11 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            nVar = com.google.common.cache.n.COLLECTED;
                        } else {
                            try {
                                nVar = com.google.common.cache.n.EXPLICIT;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        com.google.common.cache.n nVar2 = nVar;
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar, next, key, i11, v11, valueReference, nVar2);
                        int i12 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i12;
                        unlock();
                        G();
                        return v11;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    unlock();
                    G();
                    throw th2;
                }
                unlock();
                G();
                return null;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        boolean Q(Object obj, int i11, Object obj2) throws Throwable {
            Throwable th2;
            com.google.common.cache.n nVar;
            lock();
            try {
                H(this.f43450a.f43394p.a());
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(obj, key)) {
                        y<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (!this.f43450a.f43384f.d(obj2, v11)) {
                            if (v11 != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            nVar = com.google.common.cache.n.COLLECTED;
                        } else {
                            try {
                                nVar = com.google.common.cache.n.EXPLICIT;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        com.google.common.cache.n nVar2 = nVar;
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar, next, key, i11, v11, valueReference, nVar2);
                        int i12 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i12;
                        boolean z11 = nVar2 == com.google.common.cache.n.EXPLICIT;
                        unlock();
                        G();
                        return z11;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    unlock();
                    G();
                    throw th2;
                }
                unlock();
                G();
                return false;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        void R(com.google.common.cache.m<K, V> mVar) {
            m(mVar.getKey(), mVar.getHash(), mVar.getValueReference().get(), mVar.getValueReference().a(), com.google.common.cache.n.COLLECTED);
            this.f43461l.remove(mVar);
            this.f43462m.remove(mVar);
        }

        boolean S(com.google.common.cache.m<K, V> mVar, int i11, com.google.common.cache.n nVar) {
            AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
            int length = (atomicReferenceArray.length() - 1) & i11;
            com.google.common.cache.m<K, V> mVar2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.m<K, V> next = mVar2; next != null; next = next.getNext()) {
                if (next == mVar) {
                    this.f43453d++;
                    com.google.common.cache.m<K, V> mVarV = V(mVar2, next, next.getKey(), i11, next.getValueReference().get(), next.getValueReference(), nVar);
                    int i12 = this.f43451b - 1;
                    atomicReferenceArray.set(length, mVarV);
                    this.f43451b = i12;
                    return true;
                }
            }
            return false;
        }

        com.google.common.cache.m<K, V> T(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
            int i11 = this.f43451b;
            com.google.common.cache.m<K, V> next = mVar2.getNext();
            while (mVar != mVar2) {
                com.google.common.cache.m<K, V> mVarH = h(mVar, next);
                if (mVarH != null) {
                    next = mVarH;
                } else {
                    R(mVar);
                    i11--;
                }
                mVar = mVar.getNext();
            }
            this.f43451b = i11;
            return next;
        }

        boolean U(K k11, int i11, l<K, V> lVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.m<K, V> next = mVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        if (next.getValueReference() != lVar) {
                            break;
                        }
                        if (lVar.isActive()) {
                            next.setValueReference(lVar.j());
                        } else {
                            atomicReferenceArray.set(length, T(mVar, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                G();
            }
        }

        com.google.common.cache.m<K, V> V(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2, K k11, int i11, V v11, y<K, V> yVar, com.google.common.cache.n nVar) {
            m(k11, i11, v11, yVar.a(), nVar);
            this.f43461l.remove(mVar2);
            this.f43462m.remove(mVar2);
            if (!yVar.c()) {
                return T(mVar, mVar2);
            }
            yVar.d(null);
            return mVar;
        }

        V W(K k11, int i11, V v11) {
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = i11 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        long j11 = jA;
                        y<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (v12 != null) {
                            com.google.common.cache.m<K, V> mVar2 = next;
                            this.f43453d++;
                            m(k11, i11, v12, valueReference.a(), com.google.common.cache.n.REPLACED);
                            b0(mVar2, k11, v11, j11);
                            n(mVar2);
                            unlock();
                            G();
                            return v12;
                        }
                        if (!valueReference.isActive()) {
                            break;
                        }
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar, next, key, i11, v12, valueReference, com.google.common.cache.n.COLLECTED);
                        int i12 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i12;
                        break;
                    }
                    com.google.common.cache.m<K, V> mVar3 = mVar;
                    long j12 = jA;
                    next = next.getNext();
                    mVar = mVar3;
                    jA = j12;
                }
                unlock();
                G();
                return null;
            } catch (Throwable th2) {
                unlock();
                G();
                throw th2;
            }
        }

        boolean X(K k11, int i11, V v11, V v12) {
            int i12 = i11;
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = i12 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                com.google.common.cache.m<K, V> next = mVar;
                while (next != null) {
                    com.google.common.cache.m<K, V> mVar2 = next;
                    K key = mVar2.getKey();
                    if (mVar2.getHash() == i12 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        long j11 = jA;
                        y<K, V> valueReference = mVar2.getValueReference();
                        V v13 = valueReference.get();
                        if (v13 != null) {
                            if (!this.f43450a.f43384f.d(v11, v13)) {
                                L(mVar2, j11);
                                break;
                            }
                            this.f43453d++;
                            m(k11, i11, v13, valueReference.a(), com.google.common.cache.n.REPLACED);
                            b0(mVar2, k11, v12, j11);
                            n(mVar2);
                            unlock();
                            G();
                            return true;
                        }
                        if (!valueReference.isActive()) {
                            break;
                        }
                        this.f43453d++;
                        com.google.common.cache.m<K, V> mVarV = V(mVar, mVar2, key, i12, v13, valueReference, com.google.common.cache.n.COLLECTED);
                        int i13 = this.f43451b - 1;
                        atomicReferenceArray.set(length, mVarV);
                        this.f43451b = i13;
                        break;
                    }
                    com.google.common.cache.m<K, V> mVar3 = mVar;
                    long j12 = jA;
                    next = mVar2.getNext();
                    mVar = mVar3;
                    i12 = i11;
                    jA = j12;
                }
                unlock();
                G();
                return false;
            } catch (Throwable th2) {
                unlock();
                G();
                throw th2;
            }
        }

        void Y(long j11) {
            if (tryLock()) {
                try {
                    k();
                    p(j11);
                    this.f43460k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void Z() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f43450a.v();
        }

        V a0(com.google.common.cache.m<K, V> mVar, K k11, int i11, V v11, long j11, CacheLoader<? super K, V> cacheLoader) {
            V vO;
            return (!this.f43450a.B() || j11 - mVar.getWriteTime() <= this.f43450a.f43391m || mVar.getValueReference().c() || (vO = O(k11, i11, cacheLoader, true)) == null) ? v11 : vO;
        }

        void b() {
            Y(this.f43450a.f43394p.a());
            Z();
        }

        void b0(com.google.common.cache.m<K, V> mVar, K k11, V v11, long j11) {
            y<K, V> valueReference = mVar.getValueReference();
            int iWeigh = this.f43450a.f43388j.weigh(k11, v11);
            ou.p.s(iWeigh >= 0, "Weights must be non-negative");
            mVar.setValueReference(this.f43450a.f43386h.referenceValue(this, mVar, v11, iWeigh));
            N(mVar, iWeigh, j11);
            valueReference.d(v11);
        }

        void c() throws Throwable {
            if (this.f43451b == 0) {
                return;
            }
            lock();
            try {
                H(this.f43450a.f43394p.a());
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    for (com.google.common.cache.m<K, V> next = atomicReferenceArray.get(i11); next != null; next = next.getNext()) {
                        if (next.getValueReference().isActive()) {
                            K key = next.getKey();
                            V v11 = next.getValueReference().get();
                            try {
                                m(key, next.getHash(), v11, next.getValueReference().a(), (key == null || v11 == null) ? com.google.common.cache.n.COLLECTED : com.google.common.cache.n.EXPLICIT);
                            } catch (Throwable th2) {
                                th = th2;
                                unlock();
                                G();
                                throw th;
                            }
                        }
                    }
                }
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    atomicReferenceArray.set(i12, null);
                }
                e();
                this.f43461l.clear();
                this.f43462m.clear();
                this.f43460k.set(0);
                this.f43453d++;
                this.f43451b = 0;
                unlock();
                G();
            } catch (Throwable th3) {
                th = th3;
            }
        }

        void d() {
            while (this.f43457h.poll() != null) {
            }
        }

        boolean d0(K k11, int i11, l<K, V> lVar, V v11) {
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                int i12 = this.f43451b + 1;
                if (i12 > this.f43454e) {
                    o();
                    i12 = this.f43451b + 1;
                }
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = i11 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.m<K, V> mVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.m<K, V> next = mVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        y<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (lVar != valueReference && (v12 != null || valueReference == g.f43377x)) {
                            m(k11, i11, v11, 0, com.google.common.cache.n.REPLACED);
                            return false;
                        }
                        this.f43453d++;
                        if (lVar.isActive()) {
                            m(k11, i11, v12, lVar.a(), v12 == null ? com.google.common.cache.n.COLLECTED : com.google.common.cache.n.REPLACED);
                            i12--;
                        }
                        com.google.common.cache.m<K, V> mVar2 = next;
                        b0(mVar2, k11, v11, jA);
                        this.f43451b = i12;
                        n(mVar2);
                        return true;
                    }
                }
                this.f43453d++;
                com.google.common.cache.m<K, V> mVarD = D(k11, i11, mVar);
                b0(mVarD, k11, v11, jA);
                atomicReferenceArray.set(length, mVarD);
                this.f43451b = i12;
                n(mVarD);
                return true;
            } finally {
                unlock();
                G();
            }
        }

        void e() {
            if (this.f43450a.H()) {
                d();
            }
            if (this.f43450a.I()) {
                f();
            }
        }

        void e0() {
            if (tryLock()) {
                try {
                    k();
                } finally {
                    unlock();
                }
            }
        }

        void f() {
            while (this.f43458i.poll() != null) {
            }
        }

        void f0(long j11) {
            if (tryLock()) {
                try {
                    p(j11);
                } finally {
                    unlock();
                }
            }
        }

        boolean g(Object obj, int i11) {
            try {
                if (this.f43451b == 0) {
                    return false;
                }
                com.google.common.cache.m<K, V> mVarV = v(obj, i11, this.f43450a.f43394p.a());
                if (mVarV == null) {
                    return false;
                }
                return mVarV.getValueReference().get() != null;
            } finally {
                F();
            }
        }

        V g0(com.google.common.cache.m<K, V> mVar, K k11, y<K, V> yVar) {
            if (!yVar.c()) {
                throw new AssertionError();
            }
            ou.p.u(!Thread.holdsLock(mVar), "Recursive load of: %s", k11);
            try {
                V vE = yVar.e();
                if (vE != null) {
                    M(mVar, this.f43450a.f43394p.a());
                    this.f43463n.d(1);
                    return vE;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k11 + ".");
            } catch (Throwable th2) {
                this.f43463n.d(1);
                throw th2;
            }
        }

        com.google.common.cache.m<K, V> h(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
            K key = mVar.getKey();
            if (key == null) {
                return null;
            }
            y<K, V> valueReference = mVar.getValueReference();
            V v11 = valueReference.get();
            if (v11 == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.m<K, V> mVarCopyEntry = this.f43450a.f43395q.copyEntry(this, mVar, mVar2, key);
            mVarCopyEntry.setValueReference(valueReference.f(this.f43458i, v11, mVarCopyEntry));
            return mVarCopyEntry;
        }

        void i() throws Throwable {
            int i11 = 0;
            do {
                Reference<? extends K> referencePoll = this.f43457h.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f43450a.w((com.google.common.cache.m) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        void j() {
            while (true) {
                com.google.common.cache.m<K, V> mVarPoll = this.f43459j.poll();
                if (mVarPoll == null) {
                    return;
                }
                if (this.f43462m.contains(mVarPoll)) {
                    this.f43462m.add(mVarPoll);
                }
            }
        }

        void k() throws Throwable {
            if (this.f43450a.H()) {
                i();
            }
            if (this.f43450a.I()) {
                l();
            }
        }

        void l() throws Throwable {
            int i11 = 0;
            do {
                Reference<? extends V> referencePoll = this.f43458i.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f43450a.x((y) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        void m(K k11, int i11, V v11, int i12, com.google.common.cache.n nVar) {
            this.f43452c -= (long) i12;
            if (nVar.wasEvicted()) {
                this.f43463n.b();
            }
            if (this.f43450a.f43392n != g.f43378y) {
                this.f43450a.f43392n.offer(com.google.common.cache.p.a(k11, v11, nVar));
            }
        }

        void n(com.google.common.cache.m<K, V> mVar) {
            if (this.f43450a.i()) {
                j();
                if (mVar.getValueReference().a() > this.f43456g && !S(mVar, mVar.getHash(), com.google.common.cache.n.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f43452c > this.f43456g) {
                    com.google.common.cache.m<K, V> mVarX = x();
                    if (!S(mVarX, mVarX.getHash(), com.google.common.cache.n.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        void o() {
            AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f43451b;
            AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArrayE = E(length << 1);
            this.f43454e = (atomicReferenceArrayE.length() * 3) / 4;
            int length2 = atomicReferenceArrayE.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                com.google.common.cache.m<K, V> next = atomicReferenceArray.get(i12);
                if (next != null) {
                    com.google.common.cache.m<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayE.set(hash, next);
                    } else {
                        com.google.common.cache.m<K, V> mVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                mVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayE.set(hash, mVar);
                        while (next != mVar) {
                            int hash3 = next.getHash() & length2;
                            com.google.common.cache.m<K, V> mVarH = h(next, atomicReferenceArrayE.get(hash3));
                            if (mVarH != null) {
                                atomicReferenceArrayE.set(hash3, mVarH);
                            } else {
                                R(next);
                                i11--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f43455f = atomicReferenceArrayE;
            this.f43451b = i11;
        }

        void p(long j11) {
            com.google.common.cache.m<K, V> mVarPeek;
            com.google.common.cache.m<K, V> mVarPeek2;
            j();
            do {
                mVarPeek = this.f43461l.peek();
                if (mVarPeek == null || !this.f43450a.p(mVarPeek, j11)) {
                    do {
                        mVarPeek2 = this.f43462m.peek();
                        if (mVarPeek2 == null || !this.f43450a.p(mVarPeek2, j11)) {
                            return;
                        }
                    } while (S(mVarPeek2, mVarPeek2.getHash(), com.google.common.cache.n.EXPIRED));
                    throw new AssertionError();
                }
            } while (S(mVarPeek, mVarPeek.getHash(), com.google.common.cache.n.EXPIRED));
            throw new AssertionError();
        }

        V q(Object obj, int i11) {
            try {
                if (this.f43451b != 0) {
                    long jA = this.f43450a.f43394p.a();
                    com.google.common.cache.m<K, V> mVarV = v(obj, i11, jA);
                    if (mVarV == null) {
                        return null;
                    }
                    V v11 = mVarV.getValueReference().get();
                    if (v11 != null) {
                        M(mVarV, jA);
                        return a0(mVarV, mVarV.getKey(), i11, v11, jA, this.f43450a.f43397s);
                    }
                    e0();
                }
                return null;
            } finally {
                F();
            }
        }

        V r(K k11, int i11, CacheLoader<? super K, V> cacheLoader) throws Throwable {
            K k12;
            com.google.common.cache.m<K, V> mVarT;
            ou.p.m(k11);
            ou.p.m(cacheLoader);
            try {
                try {
                    try {
                        if (this.f43451b != 0 && (mVarT = t(k11, i11)) != null) {
                            long jA = this.f43450a.f43394p.a();
                            V vW = w(mVarT, jA);
                            if (vW != null) {
                                M(mVarT, jA);
                                this.f43463n.a(1);
                                V vA0 = a0(mVarT, k11, i11, vW, jA, cacheLoader);
                                F();
                                return vA0;
                            }
                            k12 = k11;
                            y<K, V> valueReference = mVarT.getValueReference();
                            if (valueReference.c()) {
                                V vG0 = g0(mVarT, k12, valueReference);
                                F();
                                return vG0;
                            }
                            ExecutionException executionException = e;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                throw new com.google.common.util.concurrent.h((Error) cause);
                            }
                            if (cause instanceof RuntimeException) {
                                throw new UncheckedExecutionException(cause);
                            }
                            throw executionException;
                        }
                        k12 = k11;
                        V vC = C(k12, i11, cacheLoader);
                        F();
                        return vC;
                    } catch (ExecutionException e11) {
                        e = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    F();
                    throw th3;
                }
            } catch (ExecutionException e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                F();
                throw th5;
            }
        }

        V s(K k11, int i11, l<K, V> lVar, com.google.common.util.concurrent.s<V> sVar) throws Throwable {
            V v11;
            try {
                v11 = (V) com.google.common.util.concurrent.c0.a(sVar);
                try {
                    if (v11 != null) {
                        this.f43463n.c(lVar.h());
                        d0(k11, i11, lVar, v11);
                        return v11;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k11 + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (v11 == null) {
                        this.f43463n.e(lVar.h());
                        U(k11, i11, lVar);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v11 = null;
            }
        }

        com.google.common.cache.m<K, V> t(Object obj, int i11) {
            for (com.google.common.cache.m<K, V> mVarU = u(i11); mVarU != null; mVarU = mVarU.getNext()) {
                if (mVarU.getHash() == i11) {
                    K key = mVarU.getKey();
                    if (key == null) {
                        e0();
                    } else if (this.f43450a.f43383e.d(obj, key)) {
                        return mVarU;
                    }
                }
            }
            return null;
        }

        com.google.common.cache.m<K, V> u(int i11) {
            AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
            return atomicReferenceArray.get(i11 & (atomicReferenceArray.length() - 1));
        }

        com.google.common.cache.m<K, V> v(Object obj, int i11, long j11) {
            com.google.common.cache.m<K, V> mVarT = t(obj, i11);
            if (mVarT == null) {
                return null;
            }
            if (!this.f43450a.p(mVarT, j11)) {
                return mVarT;
            }
            f0(j11);
            return null;
        }

        V w(com.google.common.cache.m<K, V> mVar, long j11) {
            if (mVar.getKey() == null) {
                e0();
                return null;
            }
            V v11 = mVar.getValueReference().get();
            if (v11 == null) {
                e0();
                return null;
            }
            if (!this.f43450a.p(mVar, j11)) {
                return v11;
            }
            f0(j11);
            return null;
        }

        com.google.common.cache.m<K, V> x() {
            for (com.google.common.cache.m<K, V> mVar : this.f43462m) {
                if (mVar.getValueReference().a() > 0) {
                    return mVar;
                }
            }
            throw new AssertionError();
        }

        void y(AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray) {
            this.f43454e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f43450a.e()) {
                int i11 = this.f43454e;
                if (i11 == this.f43456g) {
                    this.f43454e = i11 + 1;
                }
            }
            this.f43455f = atomicReferenceArray;
        }

        l<K, V> z(K k11, int i11, boolean z11) {
            lock();
            try {
                long jA = this.f43450a.f43394p.a();
                H(jA);
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = this.f43455f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.m<K, V> mVar = (com.google.common.cache.m) atomicReferenceArray.get(length);
                for (com.google.common.cache.m next = mVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.f43450a.f43383e.d(k11, key)) {
                        y<K, V> valueReference = next.getValueReference();
                        if (!valueReference.c() && (!z11 || jA - next.getWriteTime() >= this.f43450a.f43391m)) {
                            this.f43453d++;
                            l<K, V> lVar = new l<>(valueReference);
                            next.setValueReference(lVar);
                            return lVar;
                        }
                        return null;
                    }
                }
                this.f43453d++;
                l<K, V> lVar2 = new l<>();
                com.google.common.cache.m<K, V> mVarD = D(k11, i11, mVar);
                mVarD.setValueReference(lVar2);
                atomicReferenceArray.set(length, mVarD);
                return lVar2;
            } finally {
                unlock();
                G();
            }
        }
    }

    private static class q<K, V> extends SoftReference<V> implements y<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43464a;

        q(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            super(v11, referenceQueue);
            this.f43464a = mVar;
        }

        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.g.y
        public com.google.common.cache.m<K, V> b() {
            return this.f43464a;
        }

        @Override // com.google.common.cache.g.y
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.g.y
        public void d(V v11) {
        }

        @Override // com.google.common.cache.g.y
        public V e() {
            return get();
        }

        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return new q(referenceQueue, v11, mVar);
        }

        @Override // com.google.common.cache.g.y
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class r {
        public static final r STRONG = new a("STRONG", 0);
        public static final r SOFT = new b("SOFT", 1);
        public static final r WEAK = new c("WEAK", 2);
        private static final /* synthetic */ r[] $VALUES = $values();

        final enum a extends r {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.r
            ou.f<Object> defaultEquivalence() {
                return ou.f.c();
            }

            @Override // com.google.common.cache.g.r
            <K, V> y<K, V> referenceValue(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, V v11, int i11) {
                return i11 == 1 ? new v(v11) : new g0(v11, i11);
            }
        }

        final enum b extends r {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.r
            ou.f<Object> defaultEquivalence() {
                return ou.f.f();
            }

            @Override // com.google.common.cache.g.r
            <K, V> y<K, V> referenceValue(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, V v11, int i11) {
                return i11 == 1 ? new q(pVar.f43458i, v11, mVar) : new f0(pVar.f43458i, v11, mVar, i11);
            }
        }

        final enum c extends r {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.cache.g.r
            ou.f<Object> defaultEquivalence() {
                return ou.f.f();
            }

            @Override // com.google.common.cache.g.r
            <K, V> y<K, V> referenceValue(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, V v11, int i11) {
                return i11 == 1 ? new d0(pVar.f43458i, v11, mVar) : new h0(pVar.f43458i, v11, mVar, i11);
            }
        }

        private static /* synthetic */ r[] $values() {
            return new r[]{STRONG, SOFT, WEAK};
        }

        private r(String str, int i11) {
            super(str, i11);
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        abstract ou.f<Object> defaultEquivalence();

        abstract <K, V> y<K, V> referenceValue(p<K, V> pVar, com.google.common.cache.m<K, V> mVar, V v11, int i11);

        /* synthetic */ r(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    static final class s<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f43465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43467g;

        s(K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(k11, i11, mVar);
            this.f43465e = Long.MAX_VALUE;
            this.f43466f = g.s();
            this.f43467g = g.s();
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public long getAccessTime() {
            return this.f43465e;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            return this.f43466f;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            return this.f43467g;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setAccessTime(long j11) {
            this.f43465e = j11;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43466f = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43467g = mVar;
        }
    }

    static final class t<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f43468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f43471h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43472i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43473j;

        t(K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(k11, i11, mVar);
            this.f43468e = Long.MAX_VALUE;
            this.f43469f = g.s();
            this.f43470g = g.s();
            this.f43471h = Long.MAX_VALUE;
            this.f43472i = g.s();
            this.f43473j = g.s();
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public long getAccessTime() {
            return this.f43468e;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInAccessQueue() {
            return this.f43469f;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            return this.f43472i;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInAccessQueue() {
            return this.f43470g;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            return this.f43473j;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public long getWriteTime() {
            return this.f43471h;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setAccessTime(long j11) {
            this.f43468e = j11;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setNextInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43469f = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43472i = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setPreviousInAccessQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43470g = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43473j = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setWriteTime(long j11) {
            this.f43471h = j11;
        }
    }

    private static class u<K, V> extends d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f43474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.cache.m<K, V> f43476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile y<K, V> f43477d = g.E();

        u(K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            this.f43474a = k11;
            this.f43475b = i11;
            this.f43476c = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public int getHash() {
            return this.f43475b;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public K getKey() {
            return this.f43474a;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNext() {
            return this.f43476c;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public y<K, V> getValueReference() {
            return this.f43477d;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setValueReference(y<K, V> yVar) {
            this.f43477d = yVar;
        }
    }

    private static class v<K, V> implements y<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final V f43478a;

        v(V v11) {
            this.f43478a = v11;
        }

        @Override // com.google.common.cache.g.y
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.g.y
        public com.google.common.cache.m<K, V> b() {
            return null;
        }

        @Override // com.google.common.cache.g.y
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.g.y
        public void d(V v11) {
        }

        @Override // com.google.common.cache.g.y
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.g.y
        public y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar) {
            return this;
        }

        @Override // com.google.common.cache.g.y
        public V get() {
            return this.f43478a;
        }

        @Override // com.google.common.cache.g.y
        public boolean isActive() {
            return true;
        }
    }

    static final class w<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f43479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.cache.m<K, V> f43481g;

        w(K k11, int i11, com.google.common.cache.m<K, V> mVar) {
            super(k11, i11, mVar);
            this.f43479e = Long.MAX_VALUE;
            this.f43480f = g.s();
            this.f43481g = g.s();
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getNextInWriteQueue() {
            return this.f43480f;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public com.google.common.cache.m<K, V> getPreviousInWriteQueue() {
            return this.f43481g;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public long getWriteTime() {
            return this.f43479e;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setNextInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43480f = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setPreviousInWriteQueue(com.google.common.cache.m<K, V> mVar) {
            this.f43481g = mVar;
        }

        @Override // com.google.common.cache.g.d, com.google.common.cache.m
        public void setWriteTime(long j11) {
            this.f43479e = j11;
        }
    }

    final class x extends g<K, V>.i<V> {
        x() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    interface y<K, V> {
        int a();

        com.google.common.cache.m<K, V> b();

        boolean c();

        void d(V v11);

        V e();

        y<K, V> f(ReferenceQueue<V> referenceQueue, V v11, com.google.common.cache.m<K, V> mVar);

        V get();

        boolean isActive();
    }

    final class z extends AbstractCollection<V> {
        z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return g.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return g.this.size();
        }
    }

    g(com.google.common.cache.d<? super K, ? super V> dVar, CacheLoader<? super K, V> cacheLoader) {
        this.f43382d = Math.min(dVar.e(), 65536);
        r rVarJ = dVar.j();
        this.f43385g = rVarJ;
        this.f43386h = dVar.q();
        this.f43383e = dVar.i();
        this.f43384f = dVar.p();
        long jK = dVar.k();
        this.f43387i = jK;
        this.f43388j = (com.google.common.cache.r<K, V>) dVar.r();
        this.f43389k = dVar.f();
        this.f43390l = dVar.g();
        this.f43391m = dVar.l();
        com.google.common.cache.d.e eVar = (com.google.common.cache.o<K, V>) dVar.m();
        this.f43393o = eVar;
        this.f43392n = eVar == com.google.common.cache.d.e.INSTANCE ? h() : new ConcurrentLinkedQueue<>();
        this.f43394p = dVar.o(z());
        this.f43395q = f.getFactory(rVarJ, F(), J());
        this.f43396r = dVar.n().get();
        this.f43397s = cacheLoader;
        int iMin = Math.min(dVar.h(), 1073741824);
        if (i() && !e()) {
            iMin = (int) Math.min(iMin, jK);
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f43382d && (!i() || ((long) i14) * 20 <= this.f43387i)) {
            i13++;
            i14 <<= 1;
        }
        this.f43380b = 32 - i13;
        this.f43379a = i14 - 1;
        this.f43381c = r(i14);
        int i15 = iMin / i14;
        while (i12 < (i15 * i14 < iMin ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        if (i()) {
            long j11 = this.f43387i;
            long j12 = i14;
            long j13 = (j11 / j12) + 1;
            long j14 = j11 % j12;
            while (true) {
                p<K, V>[] pVarArr = this.f43381c;
                if (i11 >= pVarArr.length) {
                    return;
                }
                if (i11 == j14) {
                    j13--;
                }
                pVarArr[i11] = d(i12, j13, dVar.n().get());
                i11++;
            }
        } else {
            while (true) {
                p<K, V>[] pVarArr2 = this.f43381c;
                if (i11 >= pVarArr2.length) {
                    return;
                }
                pVarArr2[i11] = d(i12, -1L, dVar.n().get());
                i11++;
            }
        }
    }

    static int C(int i11) {
        int i12 = i11 + ((i11 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = i15 + (i15 << 2) + (i15 << 14);
        return i16 ^ (i16 >>> 16);
    }

    static <K, V> y<K, V> E() {
        return (y<K, V>) f43377x;
    }

    static <K, V> void b(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
        mVar.setNextInAccessQueue(mVar2);
        mVar2.setPreviousInAccessQueue(mVar);
    }

    static <K, V> void c(com.google.common.cache.m<K, V> mVar, com.google.common.cache.m<K, V> mVar2) {
        mVar.setNextInWriteQueue(mVar2);
        mVar2.setPreviousInWriteQueue(mVar);
    }

    static <E> Queue<E> h() {
        return (Queue<E>) f43378y;
    }

    static <K, V> com.google.common.cache.m<K, V> s() {
        return o.INSTANCE;
    }

    static <K, V> void t(com.google.common.cache.m<K, V> mVar) {
        com.google.common.cache.m<K, V> mVarS = s();
        mVar.setNextInAccessQueue(mVarS);
        mVar.setPreviousInAccessQueue(mVarS);
    }

    static <K, V> void u(com.google.common.cache.m<K, V> mVar) {
        com.google.common.cache.m<K, V> mVarS = s();
        mVar.setNextInWriteQueue(mVarS);
        mVar.setPreviousInWriteQueue(mVarS);
    }

    boolean A() {
        return k() || B();
    }

    boolean B() {
        return this.f43391m > 0;
    }

    p<K, V> D(int i11) {
        return this.f43381c[(i11 >>> this.f43380b) & this.f43379a];
    }

    boolean F() {
        return G() || y();
    }

    boolean G() {
        return j() || i();
    }

    boolean H() {
        return this.f43385g != r.STRONG;
    }

    boolean I() {
        return this.f43386h != r.STRONG;
    }

    boolean J() {
        return K() || A();
    }

    boolean K() {
        return k();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (p<K, V> pVar : this.f43381c) {
            pVar.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iO = o(obj);
        return D(iO).g(obj, iO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        int i11 = 0;
        if (obj == null) {
            return false;
        }
        long jA = this.f43394p.a();
        p<K, V>[] pVarArr = this.f43381c;
        long j11 = -1;
        int i12 = 0;
        while (i12 < 3) {
            int length = pVarArr.length;
            long j12 = 0;
            int i13 = i11 == true ? 1 : 0;
            while (i13 < length) {
                p<K, V> pVar = pVarArr[i13];
                int i14 = pVar.f43451b;
                AtomicReferenceArray<com.google.common.cache.m<K, V>> atomicReferenceArray = pVar.f43455f;
                int i15 = i11;
                while (i15 < atomicReferenceArray.length()) {
                    com.google.common.cache.m<K, V> next = atomicReferenceArray.get(i15);
                    while (next != null) {
                        p<K, V>[] pVarArr2 = pVarArr;
                        V vW = pVar.w(next, jA);
                        com.google.common.cache.m<K, V> mVar = next;
                        if (vW != null && this.f43384f.d(obj, vW)) {
                            return true;
                        }
                        next = mVar.getNext();
                        pVarArr = pVarArr2;
                    }
                    i15++;
                }
                j12 += (long) pVar.f43453d;
                i13++;
                i11 = i15;
            }
            boolean z11 = i11;
            p<K, V>[] pVarArr3 = pVarArr;
            if (j12 == j11) {
                return z11;
            }
            i12++;
            j11 = j12;
            i11 = z11 ? 1 : 0;
            pVarArr = pVarArr3;
        }
        return i11 == true ? 1 : 0;
    }

    p<K, V> d(int i11, long j11, com.google.common.cache.b bVar) {
        return new p<>(this, i11, j11, bVar);
    }

    boolean e() {
        return this.f43388j != com.google.common.cache.d.f.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f43400v;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f43400v = hVar;
        return hVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iO = o(obj);
        return D(iO).q(obj, iO);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        return v12 != null ? v12 : v11;
    }

    boolean i() {
        return this.f43387i >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        p<K, V>[] pVarArr = this.f43381c;
        long j11 = 0;
        for (p<K, V> pVar : pVarArr) {
            if (pVar.f43451b != 0) {
                return false;
            }
            j11 += (long) pVar.f43453d;
        }
        if (j11 == 0) {
            return true;
        }
        for (p<K, V> pVar2 : pVarArr) {
            if (pVar2.f43451b != 0) {
                return false;
            }
            j11 -= (long) pVar2.f43453d;
        }
        return j11 == 0;
    }

    boolean j() {
        return this.f43389k > 0;
    }

    boolean k() {
        return this.f43390l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f43398t;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f43398t = kVar;
        return kVar;
    }

    V l(K k11, CacheLoader<? super K, V> cacheLoader) {
        int iO = o(ou.p.m(k11));
        return D(iO).r(k11, iO, cacheLoader);
    }

    V m(com.google.common.cache.m<K, V> mVar, long j11) {
        V v11;
        if (mVar.getKey() == null || (v11 = mVar.getValueReference().get()) == null || p(mVar, j11)) {
            return null;
        }
        return v11;
    }

    V n(K k11) {
        return l(k11, this.f43397s);
    }

    int o(Object obj) {
        return C(this.f43383e.e(obj));
    }

    boolean p(com.google.common.cache.m<K, V> mVar, long j11) {
        ou.p.m(mVar);
        if (!j() || j11 - mVar.getAccessTime() < this.f43389k) {
            return k() && j11 - mVar.getWriteTime() >= this.f43390l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        int iO = o(k11);
        return D(iO).I(k11, iO, v11, false);
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
        int iO = o(k11);
        return D(iO).I(k11, iO, v11, true);
    }

    long q() {
        long jMax = 0;
        for (p<K, V> pVar : this.f43381c) {
            jMax += (long) Math.max(0, pVar.f43451b);
        }
        return jMax;
    }

    final p<K, V>[] r(int i11) {
        return new p[i11];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iO = o(obj);
        return D(iO).P(obj, iO);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k11, V v11, V v12) {
        ou.p.m(k11);
        ou.p.m(v12);
        if (v11 == null) {
            return false;
        }
        int iO = o(k11);
        return D(iO).X(k11, iO, v11, v12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return ru.f.m(q());
    }

    void v() {
        while (true) {
            com.google.common.cache.p<K, V> pVarPoll = this.f43392n.poll();
            if (pVarPoll == null) {
                return;
            }
            try {
                this.f43393o.onRemoval(pVarPoll);
            } catch (Throwable th2) {
                f43376w.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f43399u;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.f43399u = zVar;
        return zVar;
    }

    void w(com.google.common.cache.m<K, V> mVar) throws Throwable {
        int hash = mVar.getHash();
        D(hash).J(mVar, hash);
    }

    void x(y<K, V> yVar) throws Throwable {
        com.google.common.cache.m<K, V> mVarB = yVar.b();
        int hash = mVarB.getHash();
        D(hash).K(mVarB.getKey(), hash, yVar);
    }

    boolean y() {
        return j();
    }

    boolean z() {
        return A() || y();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iO = o(obj);
        return D(iO).Q(obj, iO, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        int iO = o(k11);
        return D(iO).W(k11, iO, v11);
    }
}
