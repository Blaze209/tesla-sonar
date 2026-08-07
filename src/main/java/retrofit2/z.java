package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<Method, Object> f108050a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Call.Factory f108051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final HttpUrl f108052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<h.a> f108053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f108054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<e.a> f108055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f108056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Executor f108057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f108058i;

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f108059a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f108060b;

        a(Class cls) {
            this.f108060b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f108059a;
            }
            v vVar = u.f107992b;
            return vVar.c(method) ? vVar.b(method, this.f108060b, obj, objArr) : z.this.c(this.f108060b, method).a(obj, objArr);
        }
    }

    z(Call.Factory factory, HttpUrl httpUrl, List<h.a> list, int i11, List<e.a> list2, int i12, Executor executor, boolean z11) {
        this.f108051b = factory;
        this.f108052c = httpUrl;
        this.f108053d = list;
        this.f108054e = i11;
        this.f108055f = list2;
        this.f108056g = i12;
        this.f108057h = executor;
        this.f108058i = z11;
    }

    private void k(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f108058i) {
            v vVar = u.f107992b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!vVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return e(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    a0<?> c(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f108050a.get(method);
            if (objPutIfAbsent instanceof a0) {
                return (a0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f108050a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                a0<?> a0VarB = a0.b(this, cls, method);
                                this.f108050a.put(method, a0VarB);
                                return a0VarB;
                            } catch (Throwable th2) {
                                this.f108050a.remove(method);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f108050a.get(method);
                    if (obj2 != null) {
                        return (a0) obj2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public b d() {
        return new b(this);
    }

    public e<?, ?> e(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f108055f.indexOf(aVar) + 1;
        int size = this.f108055f.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            e<?, ?> eVar = this.f108055f.get(i11).get(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < iIndexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f108055f.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f108055f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f108055f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> f(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f108053d.indexOf(aVar) + 1;
        int size = this.f108053d.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            h<T, RequestBody> hVar = (h<T, RequestBody>) this.f108053d.get(i11).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < iIndexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f108053d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f108053d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f108053d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<ResponseBody, T> g(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f108053d.indexOf(aVar) + 1;
        int size = this.f108053d.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            h<ResponseBody, T> hVar = (h<ResponseBody, T>) this.f108053d.get(i11).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < iIndexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f108053d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f108053d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f108053d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f(null, type, annotationArr, annotationArr2);
    }

    public <T> h<ResponseBody, T> i(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public <T> h<T, String> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f108053d.size();
        for (int i11 = 0; i11 < size; i11++) {
            h<T, String> hVar = (h<T, String>) this.f108053d.get(i11).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return retrofit2.b.d.f107869a;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Call.Factory f108062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HttpUrl f108063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<h.a> f108064c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<e.a> f108065d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f108066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f108067f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f108065d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f108064c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.get(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.f108063b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public z e() {
            if (this.f108063b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f108062a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f108066e;
            if (executor == null) {
                executor = u.f107991a;
            }
            Executor executor2 = executor;
            c cVar = u.f107993c;
            ArrayList arrayList = new ArrayList(this.f108065d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f108064c.size() + 1 + size);
            arrayList2.add(new retrofit2.b());
            arrayList2.addAll(this.f108064c);
            arrayList2.addAll(listB);
            return new z(factory, this.f108063b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f108067f);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f108062a = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        b(z zVar) {
            this.f108062a = zVar.f108051b;
            this.f108063b = zVar.f108052c;
            int size = zVar.f108053d.size() - zVar.f108054e;
            for (int i11 = 1; i11 < size; i11++) {
                this.f108064c.add(zVar.f108053d.get(i11));
            }
            int size2 = zVar.f108055f.size() - zVar.f108056g;
            for (int i12 = 0; i12 < size2; i12++) {
                this.f108065d.add(zVar.f108055f.get(i12));
            }
            this.f108066e = zVar.f108057h;
            this.f108067f = zVar.f108058i;
        }
    }
}
