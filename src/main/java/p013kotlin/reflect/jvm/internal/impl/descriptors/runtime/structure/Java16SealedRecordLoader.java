package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
final class Java16SealedRecordLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Java16SealedRecordLoader f87006a = new Java16SealedRecordLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Cache f87007b;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f87008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f87009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f87010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f87011d;

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f87008a = method;
            this.f87009b = method2;
            this.f87010c = method3;
            this.f87011d = method4;
        }

        public final Method getGetPermittedSubclasses() {
            return this.f87009b;
        }

        public final Method getGetRecordComponents() {
            return this.f87011d;
        }

        public final Method isRecord() {
            return this.f87010c;
        }

        public final Method isSealed() {
            return this.f87008a;
        }
    }

    private Java16SealedRecordLoader() {
    }

    private final Cache a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    private final Cache b() {
        Cache cache = f87007b;
        if (cache != null) {
            return cache;
        }
        Cache cacheA = a();
        f87007b = cacheA;
        return cacheA;
    }

    public final Class<?>[] c(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        s.k(clazz, "clazz");
        Method getPermittedSubclasses = b().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object objInvoke = getPermittedSubclasses.invoke(clazz, null);
        s.i(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class<?> clazz) {
        s.k(clazz, "clazz");
        Method getRecordComponents = b().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(clazz, null);
    }

    public final Boolean e(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        s.k(clazz, "clazz");
        Method methodIsRecord = b().isRecord();
        if (methodIsRecord == null) {
            return null;
        }
        Object objInvoke = methodIsRecord.invoke(clazz, null);
        s.i(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        s.k(clazz, "clazz");
        Method methodIsSealed = b().isSealed();
        if (methodIsSealed == null) {
            return null;
        }
        Object objInvoke = methodIsSealed.invoke(clazz, null);
        s.i(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
