package bx;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f18188a = c();

    class a extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f18190c;

        a(Method method, Object obj) {
            this.f18189b = method;
            this.f18190c = obj;
        }

        @Override // bx.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f18189b.invoke(this.f18190c, cls);
        }
    }

    class b extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18192c;

        b(Method method, int i11) {
            this.f18191b = method;
            this.f18192c = i11;
        }

        @Override // bx.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f18191b.invoke(null, cls, Integer.valueOf(this.f18192c));
        }
    }

    class c extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18193b;

        c(Method method) {
            this.f18193b = method;
        }

        @Override // bx.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f18193b.invoke(null, cls, Object.class);
        }
    }

    class d extends j0 {
        d() {
        }

        @Override // bx.j0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    private static j0 c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract <T> T d(Class<T> cls);
}
