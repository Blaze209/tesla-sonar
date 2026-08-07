package com.plaid.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public final class T extends retrofit2.e.a {
    @Override // retrofit2.e.a
    public final retrofit2.e<?, ?> get(Type returnType, Annotation[] annotations, retrofit2.z retrofit) {
        p013kotlin.jvm.internal.s.k(returnType, "returnType");
        p013kotlin.jvm.internal.s.k(annotations, "annotations");
        p013kotlin.jvm.internal.s.k(retrofit, "retrofit");
        if (!p013kotlin.jvm.internal.s.f(retrofit2.d.class, retrofit2.e.a.getRawType(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        Type parameterUpperBound = retrofit2.e.a.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!p013kotlin.jvm.internal.s.f(retrofit2.e.a.getRawType(parameterUpperBound), AbstractC4442i4.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        ParameterizedType parameterizedType = (ParameterizedType) parameterUpperBound;
        Type parameterUpperBound2 = retrofit2.e.a.getParameterUpperBound(0, parameterizedType);
        retrofit2.h hVarG = retrofit.g(null, retrofit2.e.a.getParameterUpperBound(1, parameterizedType), annotations);
        p013kotlin.jvm.internal.s.h(parameterUpperBound2);
        p013kotlin.jvm.internal.s.h(hVarG);
        return new S(parameterUpperBound2, hVarG);
    }
}
