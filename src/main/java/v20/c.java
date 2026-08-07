package v20;

import ch.qos.logback.classic.spi.CallerData;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Annotation> f117641a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type[] f117642b = new Type[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f117643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class<? extends Annotation> f117644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f117645e;

    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f117646a;

        public a(Type type) {
            this.f117646a = c.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && y.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f117646a;
        }

        public int hashCode() {
            return this.f117646a.hashCode();
        }

        public String toString() {
            return c.v(this.f117646a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f117647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f117648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Type[] f117649c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || y.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f117647a = type == null ? null : c.a(type);
            this.f117648b = c.a(type2);
            this.f117649c = (Type[]) typeArr.clone();
            int i11 = 0;
            while (true) {
                Type[] typeArr2 = this.f117649c;
                if (i11 >= typeArr2.length) {
                    return;
                }
                typeArr2[i11].getClass();
                c.b(this.f117649c[i11]);
                Type[] typeArr3 = this.f117649c;
                typeArr3[i11] = c.a(typeArr3[i11]);
                i11++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && y.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f117649c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f117647a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f117648b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f117649c) ^ this.f117648b.hashCode()) ^ c.g(this.f117647a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f117649c.length + 1) * 30);
            sb2.append(c.v(this.f117648b));
            if (this.f117649c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(c.v(this.f117649c[0]));
            for (int i11 = 1; i11 < this.f117649c.length; i11++) {
                sb2.append(", ");
                sb2.append(c.v(this.f117649c[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: v20.c$c, reason: collision with other inner class name */
    public static final class C2527c implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f117650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f117651b;

        public C2527c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c.b(typeArr[0]);
                this.f117651b = null;
                this.f117650a = c.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            c.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f117651b = c.a(typeArr2[0]);
            this.f117650a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && y.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f117651b;
            return type != null ? new Type[]{type} : c.f117642b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f117650a};
        }

        public int hashCode() {
            Type type = this.f117651b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f117650a.hashCode() + 31);
        }

        public String toString() {
            if (this.f117651b != null) {
                return "? super " + c.v(this.f117651b);
            }
            if (this.f117650a == Object.class) {
                return CallerData.NA;
            }
            return "? extends " + c.v(this.f117650a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f117644d = cls;
        f117643c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f117645e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C2527c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C2527c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    static Class<?> c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static h<?> d(u uVar, Type type, Class<?> cls) throws NoSuchMethodException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls2 = null;
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(y.e(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(u.class, Type[].class);
                            objArr = new Object[]{uVar, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            objArr = new Object[]{uVar};
                            declaredConstructor = cls3.getDeclaredConstructor(u.class);
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((h) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e11) {
                    e = e11;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e12) {
                e = e12;
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e14);
        } catch (InstantiationException e15) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e15);
        } catch (InvocationTargetException e16) {
            throw t(e16);
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    static int h(Object[] objArr, Object obj) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f117644d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f117641a;
    }

    public static String m(String str, g gVar) {
        if (gVar != null) {
            String strName = gVar.name();
            if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    public static String n(String str, AnnotatedElement annotatedElement) {
        return m(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static JsonDataException o(String str, String str2, k kVar) {
        String path = kVar.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static Type p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type q(Type type, Class<?> cls, Type type2) {
        return r(type, cls, type2, new LinkedHashSet());
    }

    private static Type r(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        Type typeR;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeR2 = r(type, cls, componentType, collection);
                return componentType == typeR2 ? cls2 : y.b(typeR2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeR3 = r(type, cls, genericComponentType, collection);
            return genericComponentType == typeR3 ? genericArrayType : y.b(typeR3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeR4 = r(type, cls, ownerType, collection);
            boolean z11 = typeR4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type typeR5 = r(type, cls, actualTypeArguments[i11], collection);
                if (typeR5 != actualTypeArguments[i11]) {
                    if (!z11) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z11 = true;
                    }
                    actualTypeArguments[i11] = typeR5;
                }
            }
            return z11 ? new b(typeR4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeR6 = r(type, cls, lowerBounds[0], collection);
                if (typeR6 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return y.l(typeR6);
                }
            } else if (upperBounds.length == 1 && (typeR = r(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                return y.k(typeR);
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsC = c(typeVariable);
        if (clsC != null) {
            Type typeE = e(type, cls, clsC);
            if (typeE instanceof ParameterizedType) {
                return ((ParameterizedType) typeE).getActualTypeArguments()[h(clsC.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static RuntimeException t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String u(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean w(Type type, Type type2) {
        return y.d(type, type2);
    }

    public static JsonDataException x(String str, String str2, k kVar) {
        String path = kVar.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }
}
