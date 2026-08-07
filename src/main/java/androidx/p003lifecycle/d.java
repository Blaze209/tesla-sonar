package androidx.p003lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static d f8768c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f8769a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f8770b = new HashMap();

    @Deprecated
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<Lifecycle.a, List<b>> f8771a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, Lifecycle.a> f8772b;

        a(Map<b, Lifecycle.a> map) {
            this.f8772b = map;
            for (Map.Entry<b, Lifecycle.a> entry : map.entrySet()) {
                Lifecycle.a value = entry.getValue();
                List<b> arrayList = this.f8771a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f8771a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(lifecycleOwner, aVar, obj);
                }
            }
        }

        void a(LifecycleOwner lifecycleOwner, Lifecycle.a aVar, Object obj) {
            b(this.f8771a.get(aVar), lifecycleOwner, aVar, obj);
            b(this.f8771a.get(Lifecycle.a.ON_ANY), lifecycleOwner, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f8774b;

        b(int i11, Method method) {
            this.f8773a = i11;
            this.f8774b = method;
            method.setAccessible(true);
        }

        void a(LifecycleOwner lifecycleOwner, Lifecycle.a aVar, Object obj) {
            try {
                int i11 = this.f8773a;
                if (i11 == 0) {
                    this.f8774b.invoke(obj, null);
                } else if (i11 == 1) {
                    this.f8774b.invoke(obj, lifecycleOwner);
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    this.f8774b.invoke(obj, lifecycleOwner, aVar);
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to call observer method", e12.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8773a == bVar.f8773a && this.f8774b.getName().equals(bVar.f8774b.getName());
        }

        public int hashCode() {
            return (this.f8773a * 31) + this.f8774b.getName().hashCode();
        }
    }

    d() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i11;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f8772b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.a> entry : c(cls2).f8772b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            k0 k0Var = (k0) method.getAnnotation(k0.class);
            if (k0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i11 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i11 = 1;
                }
                Lifecycle.a aVarValue = k0Var.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != Lifecycle.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i11 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i11, method), aVarValue, cls);
                z11 = true;
            }
        }
        a aVar = new a(map);
        this.f8769a.put(cls, aVar);
        this.f8770b.put(cls, Boolean.valueOf(z11));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e11) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
        }
    }

    private void e(Map<b, Lifecycle.a> map, b bVar, Lifecycle.a aVar, Class<?> cls) {
        Lifecycle.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f8774b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f8769a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f8770b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((k0) method.getAnnotation(k0.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f8770b.put(cls, Boolean.FALSE);
        return false;
    }
}
