package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f89066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f89067b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f89068a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OneElementArrayMap<T> f89069b;

        AnonymousClass1(OneElementArrayMap<T> oneElementArrayMap) {
            this.f89069b = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89068a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f89068a) {
                throw new NoSuchElementException();
            }
            this.f89068a = false;
            return this.f89069b.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T value, int i11) {
        super(null);
        s.k(value, "value");
        this.f89066a = value;
        this.f89067b = i11;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i11) {
        if (i11 == this.f89067b) {
            return this.f89066a;
        }
        return null;
    }

    public final int getIndex() {
        return this.f89067b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return this.f89066a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, T value) {
        s.k(value, "value");
        throw new IllegalStateException();
    }
}
