package androidx.collection;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"V", "Landroidx/collection/o;", "a", "()Landroidx/collection/o;", "Landroidx/collection/c0;", "b", "()Landroidx/collection/c0;", "", "key1", "value1", "key2", "value2", "key3", "value3", "c", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/c0;", "", "Landroidx/collection/c0;", "EmptyIntObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0 f3896a = new c0(0);

    public static final <V> o<V> a() {
        c0 c0Var = f3896a;
        p013kotlin.jvm.internal.s.i(c0Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return c0Var;
    }

    public static final <V> c0<V> b() {
        return new c0<>(0, 1, null);
    }

    public static final <V> c0<V> c(int i11, V v11, int i12, V v12, int i13, V v13) {
        c0<V> c0Var = new c0<>(0, 1, null);
        c0Var.t(i11, v11);
        c0Var.t(i12, v12);
        c0Var.t(i13, v13);
        return c0Var;
    }
}
