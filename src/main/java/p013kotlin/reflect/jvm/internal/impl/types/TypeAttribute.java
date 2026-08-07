package p013kotlin.reflect.jvm.internal.impl.types;

import co0.d;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TypeAttribute<T extends TypeAttribute<? extends T>> {
    public abstract T add(T t11);

    public abstract d<? extends T> getKey();

    public abstract T intersect(T t11);
}
