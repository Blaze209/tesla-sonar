package fo0;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "Ljava/util/concurrent/ConcurrentMap;", "Lfo0/j3;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<j3, WeakReference<RuntimeModuleData>> f66308a = new ConcurrentHashMap();

    public static final RuntimeModuleData a(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        j3 j3Var = new j3(safeClassLoader);
        ConcurrentMap<j3, WeakReference<RuntimeModuleData>> concurrentMap = f66308a;
        WeakReference<RuntimeModuleData> weakReference = concurrentMap.get(j3Var);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(j3Var, weakReference);
        }
        RuntimeModuleData runtimeModuleDataCreate = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            try {
                ConcurrentMap<j3, WeakReference<RuntimeModuleData>> concurrentMap2 = f66308a;
                WeakReference<RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(j3Var, new WeakReference<>(runtimeModuleDataCreate));
                if (weakReferencePutIfAbsent == null) {
                    j3Var.a(null);
                    return runtimeModuleDataCreate;
                }
                RuntimeModuleData runtimeModuleData2 = weakReferencePutIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    j3Var.a(null);
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(j3Var, weakReferencePutIfAbsent);
            } catch (Throwable th2) {
                j3Var.a(null);
                throw th2;
            }
        }
    }
}
