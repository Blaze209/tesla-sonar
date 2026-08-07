package p013kotlin.reflect.jvm.internal.impl.util;

import co0.m;
import p013kotlin.jvm.internal.s;
import p013kotlin.properties.c;

/* JADX INFO: loaded from: classes9.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements c<AbstractArrayMapOwner<K, V>, V> {
    public NullableArrayMapAccessor(int i11) {
        super(i11);
    }

    @Override // p013kotlin.properties.c
    public /* bridge */ /* synthetic */ Object getValue(Object obj, m mVar) {
        return getValue((AbstractArrayMapOwner) obj, (m<?>) mVar);
    }

    public T getValue(AbstractArrayMapOwner<K, V> thisRef, m<?> property) {
        s.k(thisRef, "thisRef");
        s.k(property, "property");
        return a(thisRef);
    }
}
