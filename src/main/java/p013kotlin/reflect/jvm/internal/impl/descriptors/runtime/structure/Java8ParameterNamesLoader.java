package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
final class Java8ParameterNamesLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Java8ParameterNamesLoader f87012a = new Java8ParameterNamesLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Cache f87013b;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f87014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f87015b;

        public Cache(Method method, Method method2) {
            this.f87014a = method;
            this.f87015b = method2;
        }

        public final Method getGetName() {
            return this.f87015b;
        }

        public final Method getGetParameters() {
            return this.f87014a;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    public final Cache a(Member member) {
        s.k(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    public final List<String> b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method getName;
        s.k(member, "member");
        Cache cacheA = f87013b;
        if (cacheA == null) {
            synchronized (this) {
                cacheA = f87013b;
                if (cacheA == null) {
                    cacheA = f87012a.a(member);
                    f87013b = cacheA;
                }
            }
        }
        Method getParameters = cacheA.getGetParameters();
        if (getParameters == null || (getName = cacheA.getGetName()) == null) {
            return null;
        }
        Object objInvoke = getParameters.invoke(member, null);
        s.i(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = getName.invoke(obj, null);
            s.i(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
