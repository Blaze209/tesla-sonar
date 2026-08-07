package com.plaid.internal;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public final class U<S, E> implements retrofit2.d<AbstractC4442i4<? extends S, ? extends E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final retrofit2.d<S> f46722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final retrofit2.h<ResponseBody, E> f46723b;

    public static final class a implements retrofit2.f<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ retrofit2.f<AbstractC4442i4<S, E>> f46724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U<S, E> f46725b;

        public a(retrofit2.f<AbstractC4442i4<S, E>> fVar, U<S, E> u11) {
            this.f46724a = fVar;
            this.f46725b = u11;
        }

        @Override // retrofit2.f
        public final void onFailure(retrofit2.d<S> call, Throwable throwable) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(throwable, "throwable");
            this.f46724a.onResponse(this.f46725b, retrofit2.y.i(throwable instanceof IOException ? new AbstractC4442i4.b((IOException) throwable) : new AbstractC4442i4.d(throwable)));
        }

        @Override // retrofit2.f
        public final void onResponse(retrofit2.d<S> call, retrofit2.y<S> response) {
            E eConvert;
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(response, "response");
            S sA = response.a();
            int iB = response.b();
            ResponseBody responseBodyE = response.e();
            if (response.g()) {
                if (sA != null) {
                    this.f46724a.onResponse(this.f46725b, retrofit2.y.i(new AbstractC4442i4.c(sA)));
                    return;
                } else {
                    this.f46724a.onResponse(this.f46725b, retrofit2.y.i(new AbstractC4442i4.d(null)));
                    return;
                }
            }
            if (responseBodyE == null || responseBodyE.getContentLength() == 0) {
                eConvert = null;
            } else {
                try {
                    eConvert = this.f46725b.f46723b.convert(responseBodyE);
                } catch (Exception unused) {
                    eConvert = null;
                }
            }
            if (eConvert != null) {
                this.f46724a.onResponse(this.f46725b, retrofit2.y.i(new AbstractC4442i4.a(eConvert, iB)));
            } else {
                this.f46724a.onResponse(this.f46725b, retrofit2.y.i(new AbstractC4442i4.d(null)));
            }
        }
    }

    public U(retrofit2.d<S> delegate, retrofit2.h<ResponseBody, E> errorConverter) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(errorConverter, "errorConverter");
        this.f46722a = delegate;
        this.f46723b = errorConverter;
    }

    @Override // retrofit2.d
    public final void cancel() {
        this.f46722a.cancel();
    }

    @Override // retrofit2.d
    public final void enqueue(retrofit2.f<AbstractC4442i4<S, E>> callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.f46722a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.d
    public final retrofit2.y<AbstractC4442i4<S, E>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.d
    public final boolean isCanceled() {
        return this.f46722a.isCanceled();
    }

    @Override // retrofit2.d
    public final boolean isExecuted() {
        return this.f46722a.isExecuted();
    }

    @Override // retrofit2.d
    public final Request request() {
        Request request = this.f46722a.request();
        p013kotlin.jvm.internal.s.j(request, "request(...)");
        return request;
    }

    @Override // retrofit2.d
    public final okio.s0 timeout() {
        okio.s0 s0VarTimeout = this.f46722a.timeout();
        p013kotlin.jvm.internal.s.j(s0VarTimeout, "timeout(...)");
        return s0VarTimeout;
    }

    @Override // retrofit2.d
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final U<S, E> m123clone() {
        retrofit2.d<S> dVarM123clone = this.f46722a.m123clone();
        p013kotlin.jvm.internal.s.j(dVarM123clone, "clone(...)");
        return new U<>(dVarM123clone, this.f46723b);
    }
}
