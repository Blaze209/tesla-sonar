package com.plaid.internal.core.networking.models;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/internal/core/networking/models/NetworkException;", "", "a", "networking_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NetworkException extends Throwable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f46925c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46927b;

    public static final class a {
        public static NetworkException a(Request request, Response response) {
            s.k(request, "request");
            s.k(response, "response");
            String str = "Request failed - " + request.url().encodedPath();
            HttpUrl httpUrlUrl = request.url();
            int iCode = response.code();
            ResponseBody responseBodyBody = response.body();
            return new NetworkException(str, t.n("\n        \n        \n        Url: " + httpUrlUrl + "\n        Response code: " + iCode + "\n        Error message: " + (responseBodyBody != null ? new com.plaid.internal.core.networking.models.a(responseBodyBody) : null) + "\n        \n        Stacktrace:\n      "));
        }
    }

    public NetworkException(String title, String message) {
        s.k(title, "title");
        s.k(message, "message");
        this.f46926a = title;
        this.f46927b = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f46927b;
    }
}
