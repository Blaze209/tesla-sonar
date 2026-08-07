package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import lw.h;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long lA = nw.d.a(httpRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new nw.c(responseHandler, lVar, hVarC));
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long lA = nw.d.a(httpRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new nw.c(responseHandler, lVar, hVarC), httpContext);
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long lA = nw.d.a(httpUriRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new nw.c(responseHandler, lVar, hVarC));
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long lA = nw.d.a(httpUriRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new nw.c(responseHandler, lVar, hVarC), httpContext);
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long lA = nw.d.a(httpRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            hVarC.x(lVar.c());
            hVarC.l(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nw.d.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.v(lA2.longValue());
            }
            String strB = nw.d.b(httpResponseExecute);
            if (strB != null) {
                hVarC.u(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long lA = nw.d.a(httpRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            hVarC.x(lVar.c());
            hVarC.l(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nw.d.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.v(lA2.longValue());
            }
            String strB = nw.d.b(httpResponseExecute);
            if (strB != null) {
                hVarC.u(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long lA = nw.d.a(httpUriRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            hVarC.x(lVar.c());
            hVarC.l(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nw.d.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.v(lA2.longValue());
            }
            String strB = nw.d.b(httpResponseExecute);
            if (strB != null) {
                hVarC.u(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.z(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long lA = nw.d.a(httpUriRequest);
            if (lA != null) {
                hVarC.r(lA.longValue());
            }
            lVar.g();
            hVarC.s(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            hVarC.x(lVar.c());
            hVarC.l(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nw.d.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.v(lA2.longValue());
            }
            String strB = nw.d.b(httpResponseExecute);
            if (strB != null) {
                hVarC.u(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e11) {
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }
}
