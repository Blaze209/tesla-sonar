package com.plaid.internal;

import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public final class S<S, E> implements retrofit2.e<S, retrofit2.d<AbstractC4442i4<? extends S, ? extends E>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f46677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final retrofit2.h<ResponseBody, E> f46678b;

    public S(Type successType, retrofit2.h<ResponseBody, E> errorBodyConverter) {
        p013kotlin.jvm.internal.s.k(successType, "successType");
        p013kotlin.jvm.internal.s.k(errorBodyConverter, "errorBodyConverter");
        this.f46677a = successType;
        this.f46678b = errorBodyConverter;
    }

    @Override // retrofit2.e
    public final Object adapt(retrofit2.d call) {
        p013kotlin.jvm.internal.s.k(call, "call");
        return new U(call, this.f46678b);
    }

    @Override // retrofit2.e
    public final Type responseType() {
        return this.f46677a;
    }
}
