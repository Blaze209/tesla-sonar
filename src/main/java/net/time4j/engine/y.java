package net.time4j.engine;

/* JADX INFO: loaded from: classes9.dex */
public interface y<T, V> {
    p<?> getChildAtCeiling(T t11);

    p<?> getChildAtFloor(T t11);

    V getMaximum(T t11);

    V getMinimum(T t11);

    V getValue(T t11);

    boolean isValid(T t11, V v11);

    T withValue(T t11, V v11, boolean z11);
}
