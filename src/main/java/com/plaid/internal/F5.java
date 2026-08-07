package com.plaid.internal;

import com.plaid.internal.core.networking.models.NetworkException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class F5 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E5 f46317a;

    public F5(E5 e11) {
        this.f46317a = e11;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        p013kotlin.jvm.internal.s.k(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String str = this.f46317a.f46297a;
        if (str != null) {
            builderNewBuilder.addHeader("User-Agent", str);
        }
        Request requestBuild = builderNewBuilder.build();
        Response responseProceed = chain.proceed(requestBuild);
        if (!responseProceed.isSuccessful() && !p013kotlin.text.t.h0(requestBuild.url().encodedPath(), "sentry", false, 2, null)) {
            int i11 = NetworkException.f46925c;
            NetworkException networkExceptionA = NetworkException.a.a(requestBuild, responseProceed);
            X5.a.a(X5.f46812a, networkExceptionA, networkExceptionA.f46926a);
        }
        return responseProceed;
    }
}
