package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class EmptyArrayMap extends ArrayMap {
    public static final EmptyArrayMap INSTANCE = new EmptyArrayMap();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator, a {
        AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public Void next() {
            throw new NoSuchElementException();
        }
    }

    private EmptyArrayMap() {
        super(null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public Void get(int i11) {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 0;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, Void value) {
        s.k(value, "value");
        throw new IllegalStateException();
    }
}
