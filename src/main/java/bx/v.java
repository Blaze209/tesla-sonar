package bx;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.h<?>> f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.t> f18204c;

    public v(Map<Type, com.google.gson.h<?>> map, boolean z11, List<com.google.gson.t> list) {
        this.f18202a = map;
        this.f18203b = z11;
        this.f18204c = list;
    }

    private static <T> d0<T> A(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (d0<T>) y(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (d0<T>) B(type, cls);
        }
        return null;
    }

    private static d0<? extends Map<? extends Object, Object>> B(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(b0.class) && x(type)) {
            return new d0() { // from class: bx.e
                @Override // bx.d0
                public final Object construct() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new d0() { // from class: bx.f
                @Override // bx.d0
                public final Object construct() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new d0() { // from class: bx.g
                @Override // bx.d0
                public final Object construct() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new d0() { // from class: bx.h
                @Override // bx.d0
                public final Object construct() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new d0() { // from class: bx.i
                @Override // bx.d0
                public final Object construct() {
                    return v.h();
                }
            };
        }
        return null;
    }

    private static <T> d0<T> C(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new d0() { // from class: bx.c
                @Override // bx.d0
                public final Object construct() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new d0() { // from class: bx.d
                @Override // bx.d0
                public final Object construct() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    private <T> d0<T> D(final Class<? super T> cls) {
        if (this.f18203b) {
            return new d0() { // from class: bx.u
                @Override // bx.d0
                public final Object construct() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new d0() { // from class: bx.b
            @Override // bx.d0
            public final Object construct() {
                return v.o(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return j0.f18188a.d(cls);
        } catch (Exception e11) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Map p() {
        return new b0();
    }

    public static /* synthetic */ Object q(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e11) {
            throw dx.a.e(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + dx.a.c(constructor) + "' with no args", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + dx.a.c(constructor) + "' with no args", e13.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new JsonIOException(str);
    }

    static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + i0.a("r8-abstract-class");
    }

    private static boolean x(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && x.k(actualTypeArguments[0]) == String.class;
    }

    private static d0<? extends Collection<? extends Object>> y(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new d0() { // from class: bx.q
                @Override // bx.d0
                public final Object construct() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new d0() { // from class: bx.r
                @Override // bx.d0
                public final Object construct() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new d0() { // from class: bx.s
                @Override // bx.d0
                public final Object construct() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new d0() { // from class: bx.t
                @Override // bx.d0
                public final Object construct() {
                    return v.t();
                }
            };
        }
        return null;
    }

    private static <T> d0<T> z(Class<? super T> cls, com.google.gson.t.a aVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.t.a aVar2 = com.google.gson.t.a.ALLOW;
            if (aVar == aVar2 || (g0.a(declaredConstructor, null) && (aVar != com.google.gson.t.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strP = dx.a.p(declaredConstructor)) == null) ? new d0() { // from class: bx.m
                    @Override // bx.d0
                    public final Object construct() {
                        return v.s(declaredConstructor);
                    }
                } : new d0() { // from class: bx.k
                    @Override // bx.d0
                    public final Object construct() {
                        return v.k(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new d0() { // from class: bx.j
                @Override // bx.d0
                public final Object construct() {
                    return v.n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f18202a.toString();
    }

    public <T> d0<T> w(com.google.gson.reflect.a<T> aVar, boolean z11) {
        final Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        final com.google.gson.h<?> hVar = this.f18202a.get(type);
        if (hVar != null) {
            return new d0() { // from class: bx.a
                @Override // bx.d0
                public final Object construct() {
                    return hVar.a(type);
                }
            };
        }
        final com.google.gson.h<?> hVar2 = this.f18202a.get(rawType);
        if (hVar2 != null) {
            return new d0() { // from class: bx.l
                @Override // bx.d0
                public final Object construct() {
                    return hVar2.a(type);
                }
            };
        }
        d0<T> d0VarC = C(type, rawType);
        if (d0VarC != null) {
            return d0VarC;
        }
        com.google.gson.t.a aVarB = g0.b(this.f18204c, rawType);
        d0<T> d0VarZ = z(rawType, aVarB);
        if (d0VarZ != null) {
            return d0VarZ;
        }
        d0<T> d0VarA = A(type, rawType);
        if (d0VarA != null) {
            return d0VarA;
        }
        final String strV = v(rawType);
        if (strV != null) {
            return new d0() { // from class: bx.n
                @Override // bx.d0
                public final Object construct() {
                    return v.q(strV);
                }
            };
        }
        if (!z11) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new d0() { // from class: bx.o
                @Override // bx.d0
                public final Object construct() {
                    return v.d(str);
                }
            };
        }
        if (aVarB == com.google.gson.t.a.ALLOW) {
            return D(rawType);
        }
        final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new d0() { // from class: bx.p
            @Override // bx.d0
            public final Object construct() {
                return v.u(str2);
            }
        };
    }
}
