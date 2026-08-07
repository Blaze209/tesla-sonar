package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
abstract class o<ResponseT, ReturnT> extends a0<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f107903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Call.Factory f107904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h<ResponseBody, ResponseT> f107905c;

    static final class a<ResponseT, ReturnT> extends o<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, ReturnT> f107906d;

        a(x xVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(xVar, factory, hVar);
            this.f107906d = eVar;
        }

        @Override // retrofit2.o
        protected ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f107906d.adapt(dVar);
        }
    }

    static final class b<ResponseT> extends o<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, d<ResponseT>> f107907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f107908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f107909f;

        b(x xVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z11, boolean z12) {
            super(xVar, factory, hVar);
            this.f107907d = eVar;
            this.f107908e = z11;
            this.f107909f = z12;
        }

        @Override // retrofit2.o
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarAdapt = this.f107907d.adapt(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (this.f107909f) {
                    return q.d(dVarAdapt, continuation);
                }
                return this.f107908e ? q.b(dVarAdapt, continuation) : q.a(dVarAdapt, continuation);
            } catch (LinkageError e11) {
                throw e11;
            } catch (ThreadDeath e12) {
                throw e12;
            } catch (VirtualMachineError e13) {
                throw e13;
            } catch (Throwable th2) {
                return q.e(th2, continuation);
            }
        }
    }

    static final class c<ResponseT> extends o<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, d<ResponseT>> f107910d;

        c(x xVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(xVar, factory, hVar);
            this.f107910d = eVar;
        }

        @Override // retrofit2.o
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarAdapt = this.f107910d.adapt(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return q.c(dVarAdapt, continuation);
            } catch (Exception e11) {
                return q.e(e11, continuation);
            }
        }
    }

    o(x xVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar) {
        this.f107903a = xVar;
        this.f107904b = factory;
        this.f107905c = hVar;
    }

    private static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(z zVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) zVar.a(type, annotationArr);
        } catch (RuntimeException e11) {
            throw d0.o(method, e11, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> h<ResponseBody, ResponseT> e(z zVar, Method method, Type type) {
        try {
            return zVar.i(type, method.getAnnotations());
        } catch (RuntimeException e11) {
            throw d0.o(method, e11, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> o<ResponseT, ReturnT> f(z zVar, Method method, x xVar) {
        Type genericReturnType;
        boolean z11;
        boolean z12;
        boolean zM;
        boolean z13 = xVar.f108020l;
        Annotation[] annotations = method.getAnnotations();
        if (z13) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = d0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (d0.h(typeF) == y.class && (typeF instanceof ParameterizedType)) {
                typeF = d0.g(0, (ParameterizedType) typeF);
                zM = false;
                z11 = true;
            } else {
                if (d0.h(typeF) == d.class) {
                    throw d0.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", d0.g(0, (ParameterizedType) typeF));
                }
                zM = d0.m(typeF);
                z11 = false;
            }
            genericReturnType = new d0.b(null, d.class, typeF);
            annotations = c0.a(annotations);
            z12 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z11 = false;
            z12 = false;
        }
        e eVarD = d(zVar, method, genericReturnType, annotations);
        Type typeResponseType = eVarD.responseType();
        if (typeResponseType == Response.class) {
            throw d0.n(method, "'" + d0.h(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == y.class) {
            throw d0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (xVar.f108012d.equals("HEAD") && !Void.class.equals(typeResponseType) && !d0.m(typeResponseType)) {
            throw d0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(zVar, method, typeResponseType);
        Call.Factory factory = zVar.f108051b;
        if (z13) {
            return z11 ? new c(xVar, factory, hVarE, eVarD) : new b(xVar, factory, hVarE, eVarD, false, z12);
        }
        return new a(xVar, factory, hVarE, eVarD);
    }

    @Override // retrofit2.a0
    final ReturnT a(Object obj, Object[] objArr) {
        return c(new r(this.f107903a, obj, objArr, this.f107904b, this.f107905c), objArr);
    }

    protected abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
