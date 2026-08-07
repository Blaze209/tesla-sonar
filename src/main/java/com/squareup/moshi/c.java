package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
abstract class c<T> {

    class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f49382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f49383b;

        a(Constructor constructor, Class cls) {
            this.f49382a = constructor;
            this.f49383b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f49382a.newInstance(null);
        }

        public String toString() {
            return this.f49383b.getName();
        }
    }

    class b extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f49384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f49385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f49386c;

        b(Method method, Object obj, Class cls) {
            this.f49384a = method;
            this.f49385b = obj;
            this.f49386c = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f49384a.invoke(this.f49385b, this.f49386c);
        }

        public String toString() {
            return this.f49386c.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.c$c, reason: collision with other inner class name */
    class C0782c extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f49387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f49388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f49389c;

        C0782c(Method method, Class cls, int i11) {
            this.f49387a = method;
            this.f49388b = cls;
            this.f49389c = i11;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f49387a.invoke(null, this.f49388b, Integer.valueOf(this.f49389c));
        }

        public String toString() {
            return this.f49388b.getName();
        }
    }

    class d extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f49390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f49391b;

        d(Method method, Class cls) {
            this.f49390a = method;
            this.f49391b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f49390a.invoke(null, this.f49391b, Object.class);
        }

        public String toString() {
            return this.f49391b.getName();
        }
    }

    c() {
    }

    public static <T> c<T> a(Class<?> cls) {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C0782c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e11) {
            throw v20.c.t(e11);
        }
    }

    abstract T b();
}
