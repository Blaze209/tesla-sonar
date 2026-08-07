package okhttp3.internal.http;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        s.k(method, "method");
        return (s.f(method, "GET") || s.f(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        s.k(method, "method");
        return s.f(method, "POST") || s.f(method, "PUT") || s.f(method, "PATCH") || s.f(method, "PROPPATCH") || s.f(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        s.k(method, "method");
        return s.f(method, "POST") || s.f(method, "PATCH") || s.f(method, "PUT") || s.f(method, "DELETE") || s.f(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        s.k(method, "method");
        return !s.f(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        s.k(method, "method");
        return s.f(method, "PROPFIND");
    }
}
