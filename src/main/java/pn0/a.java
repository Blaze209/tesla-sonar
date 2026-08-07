package pn0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpn0/a;", "", "<init>", "()V", "", "cause", "exception", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Lzn0/c;", "b", "()Lzn0/c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: pn0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lpn0/a$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C2196a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2196a f103473a = new C2196a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Method addSuppressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            s.h(methods);
            int length = methods.length;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (s.f(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    s.j(parameterTypes, "getParameterTypes(...)");
                    if (s.f(n.f1(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            addSuppressed = method2;
            for (Method method3 : methods) {
                if (s.f(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            getSuppressed = method;
        }

        private C2196a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        s.k(cause, "cause");
        s.k(exception, "exception");
        Method method = C2196a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public zn0.c b() {
        return new zn0.b();
    }
}
