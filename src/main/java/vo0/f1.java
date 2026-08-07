package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001aQ\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\f\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a#\u0010!\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030 H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "T", "Lco0/d;", "Lro0/d;", "b", "(Lco0/d;)Lro0/d;", "", "args", "c", "(Lco0/d;[Lro0/d;)Lro0/d;", "Ljava/lang/Class;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;[Lro0/d;)Lro0/d;", "f", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "l", "(Ljava/lang/Class;)Z", "m", "jClass", "k", "companion", "j", "(Ljava/lang/Object;[Lro0/d;)Lro0/d;", "", "companionName", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/Class;)Lro0/d;", "h", "", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f1 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> ro0.d<T> b(co0.d<T> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return c(dVar, new ro0.d[0]);
    }

    public static final <T> ro0.d<T> c(co0.d<T> dVar, ro0.d<Object>... args) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(args, "args");
        return d(vn0.a.b(dVar), (ro0.d[]) Arrays.copyOf(args, args.length));
    }

    public static final <T> ro0.d<T> d(Class<T> cls, ro0.d<Object>... args) throws IllegalAccessException, InvocationTargetException {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        p013kotlin.jvm.internal.s.k(args, "args");
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        ro0.d<T> dVarK = k(cls, (ro0.d[]) Arrays.copyOf(args, args.length));
        if (dVarK != null) {
            return dVarK;
        }
        ro0.d<T> dVarH = h(cls);
        if (dVarH != null) {
            return dVarH;
        }
        ro0.d<T> dVarF = f(cls, (ro0.d[]) Arrays.copyOf(args, args.length));
        if (dVarF != null) {
            return dVarF;
        }
        if (m(cls)) {
            return new ro0.h(vn0.a.e(cls));
        }
        return null;
    }

    private static final <T> ro0.d<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        p013kotlin.jvm.internal.s.j(canonicalName, "getCanonicalName(...)");
        p013kotlin.jvm.internal.s.i(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new z(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> ro0.d<T> f(Class<T> cls, ro0.d<Object>... dVarArr) {
        Field field;
        ro0.d<T> dVarJ;
        Object objG = g(cls);
        if (objG != null && (dVarJ = j(objG, (ro0.d[]) Arrays.copyOf(dVarArr, dVarArr.length))) != null) {
            return dVarJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            p013kotlin.jvm.internal.s.j(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i11 = 0;
            Class<?> cls2 = null;
            boolean z11 = false;
            while (true) {
                if (i11 >= length) {
                    if (z11) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i11];
                    if (p013kotlin.jvm.internal.s.f(cls3.getSimpleName(), "$serializer")) {
                        if (!z11) {
                            z11 = true;
                            cls2 = cls3;
                        }
                    }
                    i11++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof ro0.d) {
                return (ro0.d) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        p013kotlin.jvm.internal.s.j(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i11];
            if (cls2.getAnnotation(v0.class) != null) {
                break;
            }
            i11++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    private static final <T> ro0.d<T> h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i11 = 0;
            if (!p013kotlin.text.t.b0(canonicalName, "java.", false, 2, null) && !p013kotlin.text.t.b0(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                p013kotlin.jvm.internal.s.j(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i12 = 0;
                boolean z11 = false;
                while (true) {
                    if (i12 >= length) {
                        if (!z11) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i12];
                    if (p013kotlin.jvm.internal.s.f(field2.getName(), "INSTANCE") && p013kotlin.jvm.internal.s.f(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z11) {
                            z11 = true;
                            field = field2;
                        }
                    }
                    i12++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                p013kotlin.jvm.internal.s.j(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z12 = false;
                while (true) {
                    if (i11 >= length2) {
                        if (!z12) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i11];
                    if (p013kotlin.jvm.internal.s.f(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        p013kotlin.jvm.internal.s.j(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && p013kotlin.jvm.internal.s.f(method2.getReturnType(), ro0.d.class)) {
                            if (!z12) {
                                method = method2;
                                z12 = true;
                            }
                        }
                    }
                    i11++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof ro0.d) {
                    return (ro0.d) objInvoke;
                }
            }
        }
        return null;
    }

    public static final Map<co0.d<?>, ro0.d<?>> i() {
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put(p013kotlin.jvm.internal.o0.b(String.class), so0.a.F(p013kotlin.jvm.internal.t0.f86535a));
        mapC.put(p013kotlin.jvm.internal.o0.b(Character.TYPE), so0.a.z(p013kotlin.jvm.internal.g.f86514a));
        mapC.put(p013kotlin.jvm.internal.o0.b(char[].class), so0.a.c());
        mapC.put(p013kotlin.jvm.internal.o0.b(Double.TYPE), so0.a.A(p013kotlin.jvm.internal.k.f86524a));
        mapC.put(p013kotlin.jvm.internal.o0.b(double[].class), so0.a.d());
        mapC.put(p013kotlin.jvm.internal.o0.b(Float.TYPE), so0.a.B(p013kotlin.jvm.internal.l.f86526a));
        mapC.put(p013kotlin.jvm.internal.o0.b(float[].class), so0.a.e());
        mapC.put(p013kotlin.jvm.internal.o0.b(Long.TYPE), so0.a.D(p013kotlin.jvm.internal.v.f86536a));
        mapC.put(p013kotlin.jvm.internal.o0.b(long[].class), so0.a.h());
        mapC.put(p013kotlin.jvm.internal.o0.b(jn0.c0.class), so0.a.t(jn0.c0.INSTANCE));
        mapC.put(p013kotlin.jvm.internal.o0.b(Integer.TYPE), so0.a.C(p013kotlin.jvm.internal.r.f86532a));
        mapC.put(p013kotlin.jvm.internal.o0.b(int[].class), so0.a.f());
        mapC.put(p013kotlin.jvm.internal.o0.b(jn0.a0.class), so0.a.s(jn0.a0.INSTANCE));
        mapC.put(p013kotlin.jvm.internal.o0.b(Short.TYPE), so0.a.E(p013kotlin.jvm.internal.r0.f86533a));
        mapC.put(p013kotlin.jvm.internal.o0.b(short[].class), so0.a.k());
        mapC.put(p013kotlin.jvm.internal.o0.b(jn0.f0.class), so0.a.u(jn0.f0.INSTANCE));
        mapC.put(p013kotlin.jvm.internal.o0.b(Byte.TYPE), so0.a.y(p013kotlin.jvm.internal.e.f86512a));
        mapC.put(p013kotlin.jvm.internal.o0.b(byte[].class), so0.a.b());
        mapC.put(p013kotlin.jvm.internal.o0.b(jn0.y.class), so0.a.r(jn0.y.INSTANCE));
        mapC.put(p013kotlin.jvm.internal.o0.b(Boolean.TYPE), so0.a.x(p013kotlin.jvm.internal.d.f86511a));
        mapC.put(p013kotlin.jvm.internal.o0.b(boolean[].class), so0.a.a());
        mapC.put(p013kotlin.jvm.internal.o0.b(jn0.h0.class), so0.a.v(jn0.h0.f84049a));
        mapC.put(p013kotlin.jvm.internal.o0.b(Void.class), so0.a.j());
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(io0.b.class), so0.a.q(io0.b.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(jn0.d0.class), so0.a.n());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(jn0.b0.class), so0.a.m());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(jn0.g0.class), so0.a.o());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(jn0.z.class), so0.a.l());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(p013kotlin.jvm.internal.o0.b(jo0.a.class), so0.a.w(jo0.a.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return p013kotlin.collections.v0.b(mapC);
    }

    private static final <T> ro0.d<T> j(Object obj, ro0.d<Object>... dVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (dVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = dVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = ro0.d.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(dVarArr, dVarArr.length));
            if (objInvoke instanceof ro0.d) {
                return (ro0.d) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw e11;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e11.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> ro0.d<T> k(Class<?> cls, ro0.d<Object>... dVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (ro0.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    private static final <T> boolean l(Class<T> cls) {
        return cls.getAnnotation(ro0.p.class) == null && cls.getAnnotation(ro0.e.class) == null;
    }

    private static final <T> boolean m(Class<T> cls) {
        if (cls.getAnnotation(ro0.e.class) != null) {
            return true;
        }
        ro0.p pVar = (ro0.p) cls.getAnnotation(ro0.p.class);
        return pVar != null && p013kotlin.jvm.internal.s.f(p013kotlin.jvm.internal.o0.b(pVar.with()), p013kotlin.jvm.internal.o0.b(ro0.h.class));
    }
}
