package p013kotlin.reflect.jvm.internal.impl.util;

import co0.d;
import java.util.Iterator;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, a {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f89049a;

        public AbstractArrayMapAccessor(int i11) {
            this.f89049a = i11;
        }

        protected final T a(AbstractArrayMapOwner<K, V> thisRef) {
            s.k(thisRef, "thisRef");
            return thisRef.b().get(this.f89049a);
        }
    }

    protected abstract ArrayMap<V> b();

    protected abstract TypeRegistry<K, V> d();

    protected final void e(d<? extends K> tClass, V value) {
        s.k(tClass, "tClass");
        s.k(value, "value");
        String strC = tClass.c();
        s.h(strC);
        h(strC, value);
    }

    protected abstract void h(String str, V v11);

    public final boolean isEmpty() {
        return b().getSize() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
