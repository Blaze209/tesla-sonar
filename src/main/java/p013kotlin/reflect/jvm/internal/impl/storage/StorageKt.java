package p013kotlin.reflect.jvm.internal.impl.storage;

import co0.m;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class StorageKt {
    public static final <T> T getValue(NotNullLazyValue<? extends T> notNullLazyValue, Object obj, m<?> p11) {
        s.k(notNullLazyValue, "<this>");
        s.k(p11, "p");
        return (T) notNullLazyValue.invoke();
    }

    public static final <T> T getValue(NullableLazyValue<? extends T> nullableLazyValue, Object obj, m<?> p11) {
        s.k(nullableLazyValue, "<this>");
        s.k(p11, "p");
        return (T) nullableLazyValue.invoke();
    }
}
