package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
public interface JvmTypeFactory<T> {
    T boxType(T t11);

    T createFromString(String str);

    T createObjectType(String str);

    T createPrimitiveType(PrimitiveType primitiveType);

    T getJavaLangClassType();

    String toString(T t11);
}
