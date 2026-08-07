package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes10.dex */
abstract class a0<T> {
    a0() {
    }

    static <T> a0<T> b(z zVar, Class<?> cls, Method method) {
        x xVarB = x.b(zVar, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (d0.j(genericReturnType)) {
            throw d0.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return o.f(zVar, method, xVarB);
        }
        throw d0.n(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract T a(Object obj, Object[] objArr);
}
