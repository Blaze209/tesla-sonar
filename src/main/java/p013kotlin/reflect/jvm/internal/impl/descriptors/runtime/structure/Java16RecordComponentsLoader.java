package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
final class Java16RecordComponentsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Java16RecordComponentsLoader f87002a = new Java16RecordComponentsLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Cache f87003b;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f87004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f87005b;

        public Cache(Method method, Method method2) {
            this.f87004a = method;
            this.f87005b = method2;
        }

        public final Method getGetAccessor() {
            return this.f87005b;
        }

        public final Method getGetType() {
            return this.f87004a;
        }
    }

    private Java16RecordComponentsLoader() {
    }

    private final Cache a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    private final Cache b(Object obj) {
        Cache cache = f87003b;
        if (cache != null) {
            return cache;
        }
        Cache cacheA = a(obj);
        f87003b = cacheA;
        return cacheA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        s.k(recordComponent, "recordComponent");
        Method getAccessor = b(recordComponent).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object objInvoke = getAccessor.invoke(recordComponent, null);
        s.i(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class<?> d(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        s.k(recordComponent, "recordComponent");
        Method getType = b(recordComponent).getGetType();
        if (getType == null) {
            return null;
        }
        Object objInvoke = getType.invoke(recordComponent, null);
        s.i(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
