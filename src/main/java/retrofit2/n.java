package retrofit2;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes10.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Constructor<MethodHandles.Lookup> f107902a;

    @IgnoreJRERequirement
    static Object a(Method method, Class<?> cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor<MethodHandles.Lookup> declaredConstructor = f107902a;
        if (declaredConstructor == null) {
            declaredConstructor = l.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f107902a = declaredConstructor;
        }
        return m.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
