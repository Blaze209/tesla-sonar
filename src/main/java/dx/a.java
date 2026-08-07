package dx;

import bx.i0;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f61050a;

    private static abstract class b {
        private b() {
        }

        abstract Method a(Class<?> cls, Field field);

        abstract <T> Constructor<T> b(Class<T> cls);

        abstract String[] c(Class<?> cls);

        abstract boolean d(Class<?> cls);
    }

    private static class c extends b {
        private c() {
            super();
        }

        @Override // dx.a.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // dx.a.b
        <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // dx.a.b
        String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // dx.a.b
        boolean d(Class<?> cls) {
            return false;
        }
    }

    private static class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f61051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f61052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f61053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f61054d;

        @Override // dx.a.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e11) {
                throw a.d(e11);
            }
        }

        @Override // dx.a.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f61052b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    clsArr[i11] = (Class) this.f61054d.invoke(objArr[i11], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e11) {
                throw a.d(e11);
            }
        }

        @Override // dx.a.b
        String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f61052b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    strArr[i11] = (String) this.f61053c.invoke(objArr[i11], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e11) {
                throw a.d(e11);
            }
        }

        @Override // dx.a.b
        boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f61051a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e11) {
                throw a.d(e11);
            }
        }

        private d() throws ClassNotFoundException {
            super();
            this.f61051a = Class.class.getMethod("isRecord", null);
            this.f61052b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f61053c = cls.getMethod("getName", null);
            this.f61054d = cls.getMethod("getType", null);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        f61050a = cVar;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i11].getSimpleName());
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z11) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z11 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class<?> cls, Field field) {
        return f61050a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return f61050a.b(cls);
    }

    private static String j(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + i0.a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String[] k(Class<?> cls) {
        return f61050a.c(cls);
    }

    public static boolean l(Class<?> cls) {
        if (n(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean m(Class<?> cls) {
        return f61050a.d(cls);
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void o(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e11) {
            throw new JsonIOException("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e11), e11);
        }
    }

    public static String p(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e11) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e11.getMessage() + j(e11);
        }
    }
}
