package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class a implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f49353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f> f49354b;

    /* JADX INFO: renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    class C0781a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f49355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f49356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f49357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f49358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f49359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Type f49360f;

        C0781a(f fVar, h hVar, u uVar, f fVar2, Set set, Type type) {
            this.f49355a = fVar;
            this.f49356b = hVar;
            this.f49357c = uVar;
            this.f49358d = fVar2;
            this.f49359e = set;
            this.f49360f = type;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) throws IOException {
            f fVar = this.f49358d;
            if (fVar == null) {
                return this.f49356b.fromJson(kVar);
            }
            if (!fVar.f49378g && kVar.B() == k.c.NULL) {
                kVar.o();
                return null;
            }
            try {
                return this.f49358d.b(this.f49357c, kVar);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + kVar.getPath(), cause);
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Object obj) throws IOException {
            f fVar = this.f49355a;
            if (fVar == null) {
                this.f49356b.toJson(rVar, obj);
                return;
            }
            if (!fVar.f49378g && obj == null) {
                rVar.c0();
                return;
            }
            try {
                fVar.e(this.f49357c, rVar, obj);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + rVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f49359e + "(" + this.f49360f + ")";
        }
    }

    class b extends f {
        b(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11) {
            super(type, set, obj, method, i11, i12, z11);
        }

        @Override // com.squareup.moshi.a.f
        public void e(u uVar, r rVar, Object obj) {
            d(rVar, obj);
        }
    }

    class c extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private h<Object> f49362h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f49363i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f49364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f49365k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f49366l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i11, i12, z11);
            this.f49363i = typeArr;
            this.f49364j = type2;
            this.f49365k = set2;
            this.f49366l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(u uVar, h.e eVar) {
            super.a(uVar, eVar);
            this.f49362h = (y.d(this.f49363i[0], this.f49364j) && this.f49365k.equals(this.f49366l)) ? uVar.i(eVar, this.f49364j, this.f49366l) : uVar.e(this.f49364j, this.f49366l);
        }

        @Override // com.squareup.moshi.a.f
        public void e(u uVar, r rVar, Object obj) {
            this.f49362h.toJson(rVar, c(obj));
        }
    }

    class d extends f {
        d(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11) {
            super(type, set, obj, method, i11, i12, z11);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(u uVar, k kVar) {
            return c(kVar);
        }
    }

    class e extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        h<Object> f49367h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f49368i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f49369j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f49370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f49371l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i11, i12, z11);
            this.f49368i = typeArr;
            this.f49369j = type2;
            this.f49370k = set2;
            this.f49371l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(u uVar, h.e eVar) {
            super.a(uVar, eVar);
            this.f49367h = (y.d(this.f49368i[0], this.f49369j) && this.f49370k.equals(this.f49371l)) ? uVar.i(eVar, this.f49368i[0], this.f49370k) : uVar.e(this.f49368i[0], this.f49370k);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(u uVar, k kVar) {
            return c(this.f49367h.fromJson(kVar));
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Type f49372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<? extends Annotation> f49373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f49374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f49375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f49376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final h<?>[] f49377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f49378g;

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i11, int i12, boolean z11) {
            this.f49372a = v20.c.a(type);
            this.f49373b = set;
            this.f49374c = obj;
            this.f49375d = method;
            this.f49376e = i12;
            this.f49377f = new h[i11 - i12];
            this.f49378g = z11;
        }

        public void a(u uVar, h.e eVar) {
            if (this.f49377f.length > 0) {
                Type[] genericParameterTypes = this.f49375d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f49375d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i11 = this.f49376e; i11 < length; i11++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i11]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setL = v20.c.l(parameterAnnotations[i11]);
                    this.f49377f[i11 - this.f49376e] = (y.d(this.f49372a, type) && this.f49373b.equals(setL)) ? uVar.i(eVar, type, setL) : uVar.e(type, setL);
                }
            }
        }

        public Object b(u uVar, k kVar) {
            throw new AssertionError();
        }

        protected Object c(Object obj) {
            h<?>[] hVarArr = this.f49377f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f49375d.invoke(this.f49374c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) {
            h<?>[] hVarArr = this.f49377f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f49375d.invoke(this.f49374c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(u uVar, r rVar, Object obj) {
            throw new AssertionError();
        }
    }

    a(List<f> list, List<f> list2) {
        this.f49353a = list;
        this.f49354b = list2;
    }

    static f a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setK = v20.c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == k.class && genericReturnType != cls && d(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, v20.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, v20.c.l(parameterAnnotations[0]), setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static f b(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = list.get(i11);
            if (y.d(fVar.f49372a, type) && fVar.f49373b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(x.class)) {
                    f fVarE = e(obj, method);
                    f fVarB = b(arrayList, fVarE.f49372a, fVarE.f49373b);
                    if (fVarB != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarB.f49375d + "\n    " + fVarE.f49375d);
                    }
                    arrayList.add(fVarE);
                }
                if (method.isAnnotationPresent(com.squareup.moshi.f.class)) {
                    f fVarA = a(obj, method);
                    f fVarB2 = b(arrayList2, fVarA.f49372a, fVarA.f49373b);
                    if (fVarB2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarB2.f49375d + "\n    " + fVarA.f49375d);
                    }
                    arrayList2.add(fVarA);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    private static boolean d(int i11, Type[] typeArr) {
        int length = typeArr.length;
        while (i11 < length) {
            Type type = typeArr[i11];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != h.class) {
                return false;
            }
            i11++;
        }
        return true;
    }

    static f e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == r.class && genericReturnType == cls && d(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], v20.c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setK = v20.c.k(method);
            Set<? extends Annotation> setL = v20.c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, v20.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // com.squareup.moshi.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
        f fVarB = b(this.f49353a, type, set);
        f fVarB2 = b(this.f49354b, type, set);
        h hVarI = null;
        if (fVarB == null && fVarB2 == null) {
            return null;
        }
        if (fVarB == null || fVarB2 == null) {
            try {
                hVarI = uVar.i(this, type, set);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("No " + (fVarB == null ? "@ToJson" : "@FromJson") + " adapter for " + v20.c.u(type, set), e11);
            }
        }
        h hVar = hVarI;
        if (fVarB != null) {
            fVarB.a(uVar, this);
        }
        if (fVarB2 != null) {
            fVarB2.a(uVar, this);
        }
        return new C0781a(fVarB, hVar, uVar, fVarB2, set, type);
    }
}
