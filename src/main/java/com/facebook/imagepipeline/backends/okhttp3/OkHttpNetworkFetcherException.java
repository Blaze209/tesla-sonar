package com.facebook.imagepipeline.backends.okhttp3;

import okhttp3.Headers;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\tB\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "responseCode", "Lokhttp3/Headers;", "responseHeaders", "<init>", "(Ljava/lang/Integer;Lokhttp3/Headers;)V", "a", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "b", "Lokhttp3/Headers;", "getResponseHeaders", "()Lokhttp3/Headers;", "c", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpNetworkFetcherException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer responseCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Headers responseHeaders;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcherException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException$a;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "a", "(Lokhttp3/Response;)Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OkHttpNetworkFetcherException a(Response response) {
            s.k(response, "response");
            Response responseNetworkResponse = response.networkResponse();
            Integer numValueOf = responseNetworkResponse != null ? Integer.valueOf(responseNetworkResponse.code()) : null;
            Response responseNetworkResponse2 = response.networkResponse();
            return new OkHttpNetworkFetcherException(numValueOf, responseNetworkResponse2 != null ? responseNetworkResponse2.headers() : null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpNetworkFetcherException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ OkHttpNetworkFetcherException(Integer num, Headers headers, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : headers);
    }

    public OkHttpNetworkFetcherException(Integer num, Headers headers) {
        this.responseCode = num;
        this.responseHeaders = headers;
    }
}
