package com.google.gson.internal.bind;

import bx.d0;
import bx.f0;
import bx.g0;
import bx.i0;
import bx.v;
import bx.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.t;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f44915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.d f44916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f44917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f44918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<t> f44919e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends x<T> {
        a() {
        }

        @Override // com.google.gson.x
        public T b(ex.a aVar) throws IOException {
            aVar.F();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ex.c cVar, T t11) throws IOException {
            cVar.k0();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f44921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f44922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f44923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x f44924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f44925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f44926i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z11, Method method, x xVar, x xVar2, boolean z12, boolean z13) {
            super(str, field);
            this.f44921d = z11;
            this.f44922e = method;
            this.f44923f = xVar;
            this.f44924g = xVar2;
            this.f44925h = z12;
            this.f44926i = z13;
        }

        @Override // com.google.gson.internal.bind.l.d
        void a(ex.a aVar, int i11, Object[] objArr) {
            Object objB = this.f44924g.b(aVar);
            if (objB != null || !this.f44925h) {
                objArr[i11] = objB;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f44931c + "' of primitive type; at path " + aVar.getPath());
        }

        @Override // com.google.gson.internal.bind.l.d
        void b(ex.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f44924g.b(aVar);
            if (objB == null && this.f44925h) {
                return;
            }
            if (this.f44921d) {
                l.c(obj, this.f44930b);
            } else if (this.f44926i) {
                throw new JsonIOException("Cannot set value of 'static final' " + dx.a.g(this.f44930b, false));
            }
            this.f44930b.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.l.d
        void c(ex.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f44921d) {
                Method method = this.f44922e;
                if (method == null) {
                    l.c(obj, this.f44930b);
                } else {
                    l.c(obj, method);
                }
            }
            Method method2 = this.f44922e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e11) {
                    throw new JsonIOException("Accessor " + dx.a.g(this.f44922e, false) + " threw exception", e11.getCause());
                }
            } else {
                objInvoke = this.f44930b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.c0(this.f44929a);
            this.f44923f.d(cVar, objInvoke);
        }
    }

    public static abstract class c<T, A> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f44928a;

        c(f fVar) {
            this.f44928a = fVar;
        }

        @Override // com.google.gson.x
        public T b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            A aE = e();
            Map<String, d> map = this.f44928a.f44934a;
            try {
                aVar.h();
                while (aVar.hasNext()) {
                    d dVar = map.get(aVar.L());
                    if (dVar == null) {
                        aVar.F();
                    } else {
                        g(aE, aVar, dVar);
                    }
                }
                aVar.j();
                return f(aE);
            } catch (IllegalAccessException e11) {
                throw dx.a.e(e11);
            } catch (IllegalStateException e12) {
                throw new JsonSyntaxException(e12);
            }
        }

        @Override // com.google.gson.x
        public void d(ex.c cVar, T t11) throws IOException {
            if (t11 == null) {
                cVar.k0();
                return;
            }
            cVar.t();
            try {
                Iterator<d> it = this.f44928a.f44935b.iterator();
                while (it.hasNext()) {
                    it.next().c(cVar, t11);
                }
                cVar.H();
            } catch (IllegalAccessException e11) {
                throw dx.a.e(e11);
            }
        }

        abstract A e();

        abstract T f(A a11);

        abstract void g(A a11, ex.a aVar, d dVar);
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f44929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f44930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f44931c;

        protected d(String str, Field field) {
            this.f44929a = str;
            this.f44930b = field;
            this.f44931c = field.getName();
        }

        abstract void a(ex.a aVar, int i11, Object[] objArr);

        abstract void b(ex.a aVar, Object obj);

        abstract void c(ex.c cVar, Object obj);
    }

    private static final class e<T> extends c<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0<T> f44932b;

        e(d0<T> d0Var, f fVar) {
            super(fVar);
            this.f44932b = d0Var;
        }

        @Override // com.google.gson.internal.bind.l.c
        T e() {
            return this.f44932b.construct();
        }

        @Override // com.google.gson.internal.bind.l.c
        T f(T t11) {
            return t11;
        }

        @Override // com.google.gson.internal.bind.l.c
        void g(T t11, ex.a aVar, d dVar) {
            dVar.b(aVar, t11);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f44933c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, d> f44934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f44935b;

        f(Map<String, d> map, List<d> list) {
            this.f44934a = map;
            this.f44935b = list;
        }
    }

    private static final class g<T> extends c<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f44936e = j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor<T> f44937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f44938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f44939d;

        g(Class<T> cls, f fVar, boolean z11) {
            super(fVar);
            this.f44939d = new HashMap();
            Constructor<T> constructorI = dx.a.i(cls);
            this.f44937b = constructorI;
            if (z11) {
                l.c(null, constructorI);
            } else {
                dx.a.o(constructorI);
            }
            String[] strArrK = dx.a.k(cls);
            for (int i11 = 0; i11 < strArrK.length; i11++) {
                this.f44939d.put(strArrK[i11], Integer.valueOf(i11));
            }
            Class<?>[] parameterTypes = this.f44937b.getParameterTypes();
            this.f44938c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f44938c[i12] = f44936e.get(parameterTypes[i12]);
            }
        }

        private static Map<Class<?>, Object> j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f44938c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T f(Object[] objArr) {
            try {
                return this.f44937b.newInstance(objArr);
            } catch (IllegalAccessException e11) {
                throw dx.a.e(e11);
            } catch (IllegalArgumentException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + dx.a.c(this.f44937b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e13) {
                e = e13;
                throw new RuntimeException("Failed to invoke constructor '" + dx.a.c(this.f44937b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException("Failed to invoke constructor '" + dx.a.c(this.f44937b) + "' with args " + Arrays.toString(objArr), e14.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, ex.a aVar, d dVar) {
            Integer num = this.f44939d.get(dVar.f44931c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + dx.a.c(this.f44937b) + "' for field with name '" + dVar.f44931c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public l(v vVar, com.google.gson.d dVar, w wVar, com.google.gson.internal.bind.e eVar, List<t> list) {
        this.f44915a = vVar;
        this.f44916b = dVar;
        this.f44917c = wVar;
        this.f44918d = eVar;
        this.f44919e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void c(Object obj, M m11) {
        if (Modifier.isStatic(m11.getModifiers())) {
            obj = null;
        }
        if (g0.a(m11, obj)) {
            return;
        }
        throw new JsonIOException(dx.a.g(m11, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(com.google.gson.f fVar, Field field, Method method, String str, com.google.gson.reflect.a<?> aVar, boolean z11, boolean z12) {
        x<?> oVar;
        boolean zA = f0.a(aVar.getRawType());
        int modifiers = field.getModifiers();
        boolean z13 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z13 = true;
        }
        ax.b bVar = (ax.b) field.getAnnotation(ax.b.class);
        x<?> xVarD = bVar != null ? this.f44918d.d(this.f44915a, fVar, aVar, bVar, false) : null;
        boolean z14 = xVarD != null;
        if (xVarD == null) {
            xVarD = fVar.l(aVar);
        }
        x<?> xVar = xVarD;
        if (z11) {
            oVar = z14 ? xVar : new o<>(fVar, xVar, aVar.getType());
        } else {
            oVar = xVar;
        }
        return new b(str, field, z12, method, oVar, xVar, zA, z13);
    }

    private static IllegalArgumentException e(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + dx.a.f(field) + " and " + dx.a.f(field2) + "\nSee " + i0.a("duplicate-fields"));
    }

    private f f(com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, Class<?> cls, boolean z11, boolean z12) {
        boolean z13;
        com.google.gson.reflect.a<?> aVar2;
        boolean z14;
        int i11;
        int i12;
        d dVar;
        if (cls.isInterface()) {
            return f.f44933c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.google.gson.reflect.a<?> aVar3 = aVar;
        boolean z15 = z11;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z16 = true;
            boolean z17 = false;
            if (rawType != cls && declaredFields.length > 0) {
                t.a aVarB = g0.b(this.f44919e, rawType);
                if (aVarB == t.a.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z15 = aVarB == t.a.BLOCK_INACCESSIBLE;
            }
            boolean z18 = z15;
            int length = declaredFields.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13;
                Field field = declaredFields[i14];
                boolean zH = this.h(field, z16);
                boolean zH2 = this.h(field, z17);
                if (zH || zH2) {
                    Method methodH = null;
                    if (!z12) {
                        z13 = zH2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z13 = z17;
                    } else {
                        methodH = dx.a.h(rawType, field);
                        if (!z18) {
                            dx.a.o(methodH);
                        }
                        if (methodH.getAnnotation(ax.c.class) != null && field.getAnnotation(ax.c.class) == null) {
                            throw new JsonIOException("@SerializedName on " + dx.a.g(methodH, z17) + " is not supported");
                        }
                        z13 = zH2;
                    }
                    if (!z18 && methodH == null) {
                        dx.a.o(field);
                    }
                    Type typeP = bx.x.p(aVar3.getType(), rawType, field.getGenericType());
                    List<String> listG = this.g(field);
                    aVar2 = aVar3;
                    z14 = false;
                    String str = listG.get(0);
                    i11 = i14;
                    i12 = length;
                    d dVarD = this.d(fVar, field, methodH, str, com.google.gson.reflect.a.get(typeP), zH, z18);
                    if (z13) {
                        for (String str2 : listG) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarD);
                            if (dVar2 != null) {
                                throw e(cls, str2, dVar2.f44930b, field);
                            }
                        }
                    }
                    if (zH && (dVar = (d) linkedHashMap2.put(str, dVarD)) != null) {
                        throw e(cls, str, dVar.f44930b, field);
                    }
                } else {
                    i12 = length;
                    i11 = i14;
                    aVar2 = aVar3;
                    z14 = z17;
                }
                i13 = i11 + 1;
                this = this;
                z17 = z14;
                aVar3 = aVar2;
                length = i12;
                z16 = true;
            }
            aVar3 = com.google.gson.reflect.a.get(bx.x.p(aVar3.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = aVar3.getRawType();
            z15 = z18;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> g(Field field) {
        String strTranslateName;
        List<String> listAlternateNames;
        ax.c cVar = (ax.c) field.getAnnotation(ax.c.class);
        if (cVar == null) {
            strTranslateName = this.f44916b.translateName(field);
            listAlternateNames = this.f44916b.alternateNames(field);
        } else {
            String strValue = cVar.value();
            List<String> listAsList = Arrays.asList(cVar.alternate());
            strTranslateName = strValue;
            listAlternateNames = listAsList;
        }
        if (listAlternateNames.isEmpty()) {
            return Collections.singletonList(strTranslateName);
        }
        ArrayList arrayList = new ArrayList(listAlternateNames.size() + 1);
        arrayList.add(strTranslateName);
        arrayList.addAll(listAlternateNames);
        return arrayList;
    }

    private boolean h(Field field, boolean z11) {
        return !this.f44917c.d(field, z11);
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (dx.a.l(rawType)) {
            return new a();
        }
        t.a aVarB = g0.b(this.f44919e, rawType);
        if (aVarB != t.a.BLOCK_ALL) {
            boolean z11 = aVarB == t.a.BLOCK_INACCESSIBLE;
            return dx.a.m(rawType) ? new g(rawType, f(fVar, aVar, rawType, z11, true), z11) : new e(this.f44915a.w(aVar, true), f(fVar, aVar, rawType, z11, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
