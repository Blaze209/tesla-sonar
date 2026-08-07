package p013kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.j;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.c;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class SmartSet<T> extends j<T> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f89108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89109b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        private Companion() {
        }

        public final <T> SmartSet<T> create(Collection<? extends T> set) {
            s.k(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    private static final class a<T> implements Iterator<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f89110a;

        public a(T[] array) {
            s.k(array, "array");
            this.f89110a = c.a(array);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89110a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f89110a.next();
        }
    }

    private static final class b<T> implements Iterator<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f89111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f89112b = true;

        public b(T t11) {
            this.f89111a = t11;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89112b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f89112b) {
                throw new NoSuchElementException();
            }
            this.f89112b = false;
            return this.f89111a;
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    @Override // p013kotlin.collections.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t11) {
        Object obj;
        if (size() == 0) {
            this.f89108a = t11;
        } else if (size() == 1) {
            if (s.f(this.f89108a, t11)) {
                return false;
            }
            this.f89108a = new Object[]{this.f89108a, t11};
        } else if (size() < 5) {
            Object obj2 = this.f89108a;
            s.i(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (n.e0(objArr, t11)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetF = d1.f(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetF.add(t11);
                obj = linkedHashSetF;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                s.j(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t11;
                obj = objArrCopyOf;
            }
            this.f89108a = obj;
        } else {
            Object obj3 = this.f89108a;
            s.i(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!u0.f(obj3).add(t11)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f89108a = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return s.f(this.f89108a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f89108a;
            s.i(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return n.e0((Object[]) obj2, obj);
        }
        Object obj3 = this.f89108a;
        s.i(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // p013kotlin.collections.j
    public int getSize() {
        return this.f89109b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new b(this.f89108a);
        }
        if (size() < 5) {
            Object obj = this.f89108a;
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f89108a;
        s.i(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return u0.f(obj2).iterator();
    }

    public void setSize(int i11) {
        this.f89109b = i11;
    }

    private SmartSet() {
    }
}
