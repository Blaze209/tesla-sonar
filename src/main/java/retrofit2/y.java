package retrofit2;

import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Response f108047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f108048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ResponseBody f108049c;

    private y(Response response, T t11, ResponseBody responseBody) {
        this.f108047a = response;
        this.f108048b = t11;
        this.f108049c = responseBody;
    }

    public static <T> y<T> c(int i11, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i11 >= 400) {
            return d(responseBody, new Response.Builder().body(new r.c(responseBody.contentType(), responseBody.contentLength())).code(i11).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i11);
    }

    public static <T> y<T> d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new y<>(response, null, responseBody);
    }

    public static <T> y<T> i(T t11) {
        return j(t11, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> y<T> j(T t11, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new y<>(response, t11, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f108048b;
    }

    public int b() {
        return this.f108047a.code();
    }

    public ResponseBody e() {
        return this.f108049c;
    }

    public Headers f() {
        return this.f108047a.headers();
    }

    public boolean g() {
        return this.f108047a.isSuccessful();
    }

    public String h() {
        return this.f108047a.message();
    }

    public String toString() {
        return this.f108047a.toString();
    }
}
