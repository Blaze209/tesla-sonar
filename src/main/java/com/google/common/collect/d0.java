package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends com.google.common.collect.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f43563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ou.q f43564d;

        a(Iterator it, ou.q qVar) {
            this.f43563c = it;
            this.f43564d = qVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b
        protected T a() {
            while (this.f43563c.hasNext()) {
                T t11 = (T) this.f43563c.next();
                if (this.f43564d.apply(t11)) {
                    return t11;
                }
            }
            return b();
        }
    }

    private static final class b<T> extends com.google.common.collect.a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e1<Object> f43565d = new b(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T[] f43566c;

        b(T[] tArr, int i11) {
            super(tArr.length, i11);
            this.f43566c = tArr;
        }

        @Override // com.google.common.collect.a
        protected T a(int i11) {
            return this.f43566c[i11];
        }
    }

    private enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            k.c(false);
        }
    }

    private static final class d<T> extends d1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f43567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43568b;

        d(T t11) {
            this.f43567a = t11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f43568b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f43568b) {
                throw new NoSuchElementException();
            }
            this.f43568b = true;
            return this.f43567a;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        ou.p.m(collection);
        ou.p.m(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean b(Iterator<T> it, ou.q<? super T> qVar) {
        return o(it, qVar) != -1;
    }

    static void c(Iterator<?> it) {
        ou.p.m(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> d1<T> f() {
        return g();
    }

    static <T> e1<T> g() {
        return (e1<T>) b.f43565d;
    }

    static <T> Iterator<T> h() {
        return c.INSTANCE;
    }

    public static <T> d1<T> i(Iterator<T> it, ou.q<? super T> qVar) {
        ou.p.m(it);
        ou.p.m(qVar);
        return new a(it, qVar);
    }

    public static <T> T j(Iterator<T> it, ou.q<? super T> qVar) {
        ou.p.m(it);
        ou.p.m(qVar);
        while (it.hasNext()) {
            T next = it.next();
            if (qVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T l(Iterator<? extends T> it, T t11) {
        return it.hasNext() ? (T) k(it) : t11;
    }

    public static <T> T m(Iterator<? extends T> it, T t11) {
        return it.hasNext() ? it.next() : t11;
    }

    public static <T> T n(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i11 = 0; i11 < 4 && it.hasNext(); i11++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int o(Iterator<T> it, ou.q<? super T> qVar) {
        ou.p.n(qVar, "predicate");
        int i11 = 0;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static <T> T p(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean q(Iterator<?> it, Collection<?> collection) {
        ou.p.m(collection);
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean r(Iterator<T> it, ou.q<? super T> qVar) {
        ou.p.m(qVar);
        boolean z11 = false;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> d1<T> s(T t11) {
        return new d(t11);
    }
}
