package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f108009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f108010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HttpUrl f108011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f108012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f108013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Headers f108014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MediaType f108015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f108016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f108017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f108018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t<?>[] f108019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f108020l;

    static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Pattern f108021y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Pattern f108022z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final z f108023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<?> f108024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Method f108025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Annotation[] f108026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Annotation[][] f108027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Type[] f108028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f108029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f108030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f108031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f108032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f108033k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f108034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f108035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f108036n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f108037o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f108038p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f108039q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f108040r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        String f108041s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Headers f108042t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        MediaType f108043u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Set<String> f108044v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        t<?>[] f108045w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f108046x;

        a(z zVar, Class<?> cls, Method method) {
            this.f108023a = zVar;
            this.f108024b = cls;
            this.f108025c = method;
            this.f108026d = method.getAnnotations();
            this.f108028f = method.getGenericParameterTypes();
            this.f108027e = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private Headers c(String[] strArr, boolean z11) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw d0.n(this.f108025c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f108043u = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e11) {
                        throw d0.o(this.f108025c, e11, "Malformed content type: %s", strTrim);
                    }
                } else if (z11) {
                    builder.addUnsafeNonAscii(strSubstring, strTrim);
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        private void d(String str, String str2, boolean z11) {
            String str3 = this.f108037o;
            if (str3 != null) {
                throw d0.n(this.f108025c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f108037o = str;
            this.f108038p = z11;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f108021y.matcher(strSubstring).find()) {
                    throw d0.n(this.f108025c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f108041s = str2;
            this.f108044v = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof sr0.b) {
                d("DELETE", ((sr0.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof sr0.f) {
                d("GET", ((sr0.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof sr0.g) {
                d("HEAD", ((sr0.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof sr0.n) {
                d("PATCH", ((sr0.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof sr0.o) {
                d("POST", ((sr0.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof sr0.p) {
                d("PUT", ((sr0.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof sr0.m) {
                d("OPTIONS", ((sr0.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof sr0.h) {
                sr0.h hVar = (sr0.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof sr0.k) {
                sr0.k kVar = (sr0.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw d0.n(this.f108025c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f108042t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof sr0.l) {
                if (this.f108039q) {
                    throw d0.n(this.f108025c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f108040r = true;
            } else if (annotation instanceof sr0.e) {
                if (this.f108040r) {
                    throw d0.n(this.f108025c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f108039q = true;
            }
        }

        private t<?> f(int i11, Type type, Annotation[] annotationArr, boolean z11) {
            t<?> tVar;
            if (annotationArr != null) {
                tVar = null;
                for (Annotation annotation : annotationArr) {
                    t<?> tVarG = g(i11, type, annotationArr, annotation);
                    if (tVarG != null) {
                        if (tVar != null) {
                            throw d0.p(this.f108025c, i11, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        tVar = tVarG;
                    }
                }
            } else {
                tVar = null;
            }
            if (tVar != null) {
                return tVar;
            }
            if (z11) {
                try {
                    if (d0.h(type) == Continuation.class) {
                        this.f108046x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw d0.p(this.f108025c, i11, "No Retrofit annotation found.", new Object[0]);
        }

        private t<?> g(int i11, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof sr0.y) {
                j(i11, type);
                if (this.f108036n) {
                    throw d0.p(this.f108025c, i11, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f108032j) {
                    throw d0.p(this.f108025c, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f108033k) {
                    throw d0.p(this.f108025c, i11, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f108034l) {
                    throw d0.p(this.f108025c, i11, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f108035m) {
                    throw d0.p(this.f108025c, i11, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f108041s != null) {
                    throw d0.p(this.f108025c, i11, "@Url cannot be used with @%s URL", this.f108037o);
                }
                this.f108036n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new t.p(this.f108025c, i11);
                }
                throw d0.p(this.f108025c, i11, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof sr0.s) {
                j(i11, type);
                if (this.f108033k) {
                    throw d0.p(this.f108025c, i11, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f108034l) {
                    throw d0.p(this.f108025c, i11, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f108035m) {
                    throw d0.p(this.f108025c, i11, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f108036n) {
                    throw d0.p(this.f108025c, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f108041s == null) {
                    throw d0.p(this.f108025c, i11, "@Path can only be used with relative url on @%s", this.f108037o);
                }
                this.f108032j = true;
                sr0.s sVar = (sr0.s) annotation;
                String strValue = sVar.value();
                i(i11, strValue);
                return new t.k(this.f108025c, i11, strValue, this.f108023a.j(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof sr0.t) {
                j(i11, type);
                sr0.t tVar = (sr0.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = d0.h(type);
                this.f108033k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new t.l(strValue2, this.f108023a.j(type, annotationArr), zEncoded);
                    }
                    return new t.l(strValue2, this.f108023a.j(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new t.l(strValue2, this.f108023a.j(d0.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw d0.p(this.f108025c, i11, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof sr0.v) {
                j(i11, type);
                boolean zEncoded2 = ((sr0.v) annotation).encoded();
                Class<?> clsH2 = d0.h(type);
                this.f108034l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new t.n(this.f108023a.j(type, annotationArr), zEncoded2);
                    }
                    return new t.n(this.f108023a.j(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new t.n(this.f108023a.j(d0.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw d0.p(this.f108025c, i11, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof sr0.u) {
                j(i11, type);
                Class<?> clsH3 = d0.h(type);
                this.f108035m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw d0.p(this.f108025c, i11, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = d0.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw d0.p(this.f108025c, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = d0.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new t.m(this.f108025c, i11, this.f108023a.j(d0.g(1, parameterizedType), annotationArr), ((sr0.u) annotation).encoded());
                }
                throw d0.p(this.f108025c, i11, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof sr0.i) {
                j(i11, type);
                sr0.i iVar = (sr0.i) annotation;
                String strValue3 = iVar.value();
                Class<?> clsH4 = d0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new t.f(strValue3, this.f108023a.j(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new t.f(strValue3, this.f108023a.j(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new t.f(strValue3, this.f108023a.j(d0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw d0.p(this.f108025c, i11, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof sr0.j) {
                if (type == Headers.class) {
                    return new t.h(this.f108025c, i11);
                }
                j(i11, type);
                Class<?> clsH5 = d0.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw d0.p(this.f108025c, i11, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = d0.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw d0.p(this.f108025c, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = d0.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new t.g(this.f108025c, i11, this.f108023a.j(d0.g(1, parameterizedType2), annotationArr), ((sr0.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw d0.p(this.f108025c, i11, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof sr0.c) {
                j(i11, type);
                if (!this.f108039q) {
                    throw d0.p(this.f108025c, i11, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                sr0.c cVar = (sr0.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f108029g = true;
                Class<?> clsH6 = d0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new t.d(strValue4, this.f108023a.j(type, annotationArr), zEncoded3);
                    }
                    return new t.d(strValue4, this.f108023a.j(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new t.d(strValue4, this.f108023a.j(d0.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw d0.p(this.f108025c, i11, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof sr0.d) {
                j(i11, type);
                if (!this.f108039q) {
                    throw d0.p(this.f108025c, i11, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = d0.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw d0.p(this.f108025c, i11, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = d0.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw d0.p(this.f108025c, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = d0.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarJ = this.f108023a.j(d0.g(1, parameterizedType3), annotationArr);
                    this.f108029g = true;
                    return new t.e(this.f108025c, i11, hVarJ, ((sr0.d) annotation).encoded());
                }
                throw d0.p(this.f108025c, i11, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof sr0.q)) {
                if (annotation instanceof sr0.r) {
                    j(i11, type);
                    if (!this.f108040r) {
                        throw d0.p(this.f108025c, i11, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f108030h = true;
                    Class<?> clsH8 = d0.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw d0.p(this.f108025c, i11, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = d0.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw d0.p(this.f108025c, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = d0.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = d0.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(d0.h(typeG5))) {
                            throw d0.p(this.f108025c, i11, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new t.j(this.f108025c, i11, this.f108023a.h(typeG5, annotationArr, this.f108026d), ((sr0.r) annotation).encoding());
                    }
                    throw d0.p(this.f108025c, i11, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof sr0.a) {
                    j(i11, type);
                    if (this.f108039q || this.f108040r) {
                        throw d0.p(this.f108025c, i11, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f108031i) {
                        throw d0.p(this.f108025c, i11, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarH = this.f108023a.h(type, annotationArr, this.f108026d);
                        this.f108031i = true;
                        return new t.c(this.f108025c, i11, hVarH);
                    } catch (RuntimeException e11) {
                        throw d0.q(this.f108025c, e11, i11, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof sr0.x)) {
                    return null;
                }
                j(i11, type);
                Class<?> clsH9 = d0.h(type);
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    t<?> tVar2 = this.f108045w[i12];
                    if ((tVar2 instanceof t.q) && ((t.q) tVar2).f107990a.equals(clsH9)) {
                        throw d0.p(this.f108025c, i11, "@Tag type " + clsH9.getName() + " is duplicate of " + u.f107992b.a(this.f108025c, i12) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new t.q(clsH9);
            }
            j(i11, type);
            if (!this.f108040r) {
                throw d0.p(this.f108025c, i11, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            sr0.q qVar = (sr0.q) annotation;
            this.f108030h = true;
            String strValue5 = qVar.value();
            Class<?> clsH10 = d0.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsH10.getComponentType())) {
                            return t.o.f107987a.b();
                        }
                        throw d0.p(this.f108025c, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        return t.o.f107987a;
                    }
                    throw d0.p(this.f108025c, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(d0.h(d0.g(0, (ParameterizedType) type)))) {
                        return t.o.f107987a.c();
                    }
                    throw d0.p(this.f108025c, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw d0.p(this.f108025c, i11, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        throw d0.p(this.f108025c, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new t.i(this.f108025c, i11, headersOf, this.f108023a.h(type, annotationArr, this.f108026d));
                }
                Class<?> clsA = a(clsH10.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                    throw d0.p(this.f108025c, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new t.i(this.f108025c, i11, headersOf, this.f108023a.h(clsA, annotationArr, this.f108026d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = d0.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(d0.h(typeG6))) {
                    throw d0.p(this.f108025c, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new t.i(this.f108025c, i11, headersOf, this.f108023a.h(typeG6, annotationArr, this.f108026d)).c();
            }
            throw d0.p(this.f108025c, i11, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set<String> h(String str) {
            Matcher matcher = f108021y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i11, String str) {
            if (!f108022z.matcher(str).matches()) {
                throw d0.p(this.f108025c, i11, "@Path parameter name must match %s. Found: %s", f108021y.pattern(), str);
            }
            if (!this.f108044v.contains(str)) {
                throw d0.p(this.f108025c, i11, "URL \"%s\" does not contain \"{%s}\".", this.f108041s, str);
            }
        }

        private void j(int i11, Type type) {
            if (d0.j(type)) {
                throw d0.p(this.f108025c, i11, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        x b() {
            for (Annotation annotation : this.f108026d) {
                e(annotation);
            }
            if (this.f108037o == null) {
                throw d0.n(this.f108025c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f108038p) {
                if (this.f108040r) {
                    throw d0.n(this.f108025c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f108039q) {
                    throw d0.n(this.f108025c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f108027e.length;
            this.f108045w = new t[length];
            int i11 = length - 1;
            int i12 = 0;
            while (i12 < length) {
                this.f108045w[i12] = f(i12, this.f108028f[i12], this.f108027e[i12], i12 == i11);
                i12++;
            }
            if (this.f108041s == null && !this.f108036n) {
                throw d0.n(this.f108025c, "Missing either @%s URL or @Url parameter.", this.f108037o);
            }
            boolean z11 = this.f108039q;
            if (!z11 && !this.f108040r && !this.f108038p && this.f108031i) {
                throw d0.n(this.f108025c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z11 && !this.f108029g) {
                throw d0.n(this.f108025c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f108040r || this.f108030h) {
                return new x(this);
            }
            throw d0.n(this.f108025c, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    x(a aVar) {
        this.f108009a = aVar.f108024b;
        this.f108010b = aVar.f108025c;
        this.f108011c = aVar.f108023a.f108052c;
        this.f108012d = aVar.f108037o;
        this.f108013e = aVar.f108041s;
        this.f108014f = aVar.f108042t;
        this.f108015g = aVar.f108043u;
        this.f108016h = aVar.f108038p;
        this.f108017i = aVar.f108039q;
        this.f108018j = aVar.f108040r;
        this.f108019k = aVar.f108045w;
        this.f108020l = aVar.f108046x;
    }

    static x b(z zVar, Class<?> cls, Method method) {
        return new a(zVar, cls, method).b();
    }

    Request a(Object obj, Object[] objArr) {
        t<?>[] tVarArr = this.f108019k;
        int length = objArr.length;
        if (length != tVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + tVarArr.length + ")");
        }
        w wVar = new w(this.f108012d, this.f108011c, this.f108013e, this.f108014f, this.f108015g, this.f108016h, this.f108017i, this.f108018j);
        if (this.f108020l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
            tVarArr[i11].a(wVar, objArr[i11]);
        }
        return wVar.k().tag(p.class, new p(this.f108009a, obj, this.f108010b, arrayList)).build();
    }
}
