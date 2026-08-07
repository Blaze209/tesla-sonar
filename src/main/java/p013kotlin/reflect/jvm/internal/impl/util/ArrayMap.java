package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ArrayMap<T> implements Iterable<T>, a {
    public /* synthetic */ ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T get(int i11);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i11, T t11);

    private ArrayMap() {
    }
}
