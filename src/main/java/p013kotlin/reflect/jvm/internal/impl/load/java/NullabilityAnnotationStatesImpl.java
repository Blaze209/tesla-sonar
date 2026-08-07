package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes9.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<FqName, T> f87139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LockBasedStorageManager f87140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MemoizedFunctionToNullable<FqName, T> f87141c;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(Map<FqName, ? extends T> states) {
        s.k(states, "states");
        this.f87139a = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f87140b = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new h(this));
        s.j(memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues, "createMemoizedFunctionWithNullableValues(...)");
        this.f87141c = memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, FqName fqName) {
        s.h(fqName);
        return FqNamesUtilKt.findValueForMostSpecificFqname(fqName, nullabilityAnnotationStatesImpl.f87139a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    public T get(FqName fqName) {
        s.k(fqName, "fqName");
        return (T) this.f87141c.invoke(fqName);
    }
}
