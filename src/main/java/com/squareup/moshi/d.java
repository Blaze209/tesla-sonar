package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
final class d<T> extends h<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h.e f49392d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<T> f49393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<?>[] f49394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.b f49395c;

    class a implements h.e {
        a() {
        }

        private void a(u uVar, Type type, Map<String, b<?>> map) {
            g gVar;
            Class<?> clsG = y.g(type);
            boolean zJ = v20.c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (b(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = v20.c.q(type, clsG, field.getGenericType());
                    Set<? extends Annotation> setK = v20.c.k(field);
                    String name = field.getName();
                    h<T> hVarF = uVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strM = v20.c.m(name, gVar);
                    b<?> bVar = new b<>(strM, field, hVarF);
                    b<?> bVarPut = map.put(strM, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f49397b + "\n    " + bVar.f49397b);
                    }
                }
            }
        }

        private boolean b(boolean z11, int i11) {
            if (Modifier.isStatic(i11) || Modifier.isTransient(i11)) {
                return false;
            }
            return Modifier.isPublic(i11) || Modifier.isProtected(i11) || !z11;
        }

        private void c(Type type, Class<?> cls) {
            Class<?> clsG = y.g(type);
            if (cls.isAssignableFrom(clsG)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsG.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsG = y.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (v20.c.j(clsG)) {
                c(type, List.class);
                c(type, Set.class);
                c(type, Map.class);
                c(type, Collection.class);
                String str = "Platform " + clsG;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsG.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsG.getName());
            }
            if (clsG.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsG.getName());
            }
            if (clsG.getEnclosingClass() != null && !Modifier.isStatic(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsG.getName());
            }
            if (Modifier.isAbstract(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsG.getName());
            }
            if (v20.c.i(clsG)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsG.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c cVarA = c.a(clsG);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                a(uVar, type, treeMap);
                type = y.f(type);
            }
            return new d(cVarA, treeMap).nullSafe();
        }
    }

    static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f49396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f49397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h<T> f49398c;

        b(String str, Field field, h<T> hVar) {
            this.f49396a = str;
            this.f49397b = field;
            this.f49398c = hVar;
        }

        void a(k kVar, Object obj) throws IllegalAccessException {
            this.f49397b.set(obj, this.f49398c.fromJson(kVar));
        }

        void b(r rVar, Object obj) throws IllegalAccessException {
            this.f49398c.toJson(rVar, (T) this.f49397b.get(obj));
        }
    }

    d(c<T> cVar, Map<String, b<?>> map) {
        this.f49393a = cVar;
        this.f49394b = (b[]) map.values().toArray(new b[map.size()]);
        this.f49395c = k.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) {
        try {
            T tB = this.f49393a.b();
            try {
                kVar.h();
                while (kVar.hasNext()) {
                    int iT = kVar.T(this.f49395c);
                    if (iT == -1) {
                        kVar.e0();
                        kVar.F();
                    } else {
                        this.f49394b[iT].a(kVar, tB);
                    }
                }
                kVar.j();
                return tB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw v20.c.t(e12);
        }
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, T t11) {
        try {
            rVar.o();
            for (b<?> bVar : this.f49394b) {
                rVar.b0(bVar.f49396a);
                bVar.b(rVar, t11);
            }
            rVar.C();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f49393a + ")";
    }
}
