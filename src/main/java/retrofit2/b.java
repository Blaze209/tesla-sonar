package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jn0.h0;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
final class b extends h.a {

    static final class a implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f107866a = new a();

        a() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) {
            try {
                return d0.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$b, reason: collision with other inner class name */
    static final class C2292b implements h<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C2292b f107867a = new C2292b();

        C2292b() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    static final class c implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f107868a = new c();

        c() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f107869a = new d();

        d() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements h<ResponseBody, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f107870a = new e();

        e() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 convert(ResponseBody responseBody) {
            responseBody.close();
            return h0.f84049a;
        }
    }

    static final class f implements h<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f107871a = new f();

        f() {
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    b() {
    }

    @Override // retrofit2.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        if (RequestBody.class.isAssignableFrom(d0.h(type))) {
            return C2292b.f107867a;
        }
        return null;
    }

    @Override // retrofit2.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        if (type == ResponseBody.class) {
            return d0.l(annotationArr, sr0.w.class) ? c.f107868a : a.f107866a;
        }
        if (type == Void.class) {
            return f.f107871a;
        }
        if (d0.m(type)) {
            return e.f107870a;
        }
        return null;
    }
}
