package p013kotlin.reflect.jvm.internal.impl.util;

import co0.d;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f89075a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f89076b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(TypeRegistry typeRegistry, String it) {
        s.k(it, "it");
        return typeRegistry.f89076b.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<Integer> c() {
        Collection<Integer> collectionValues = this.f89075a.values();
        s.j(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    public abstract int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(d<KK> kClass) {
        s.k(kClass, "kClass");
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(d<T> kClass) {
        s.k(kClass, "kClass");
        String strC = kClass.c();
        s.h(strC);
        return getId(strC);
    }

    public final int getId(String keyQualifiedName) {
        s.k(keyQualifiedName, "keyQualifiedName");
        return customComputeIfAbsent(this.f89075a, keyQualifiedName, new i(this));
    }
}
