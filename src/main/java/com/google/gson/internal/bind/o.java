package com.google.gson.internal.bind;

import com.google.gson.x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes5.dex */
final class o<T> extends x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f44954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x<T> f44955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f44956c;

    o(com.google.gson.f fVar, x<T> xVar, Type type) {
        this.f44954a = fVar;
        this.f44955b = xVar;
        this.f44956c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean f(x<?> xVar) {
        x<?> xVarE;
        while ((xVar instanceof m) && (xVarE = ((m) xVar).e()) != xVar) {
            xVar = xVarE;
        }
        return xVar instanceof l.c;
    }

    @Override // com.google.gson.x
    public T b(ex.a aVar) {
        return this.f44955b.b(aVar);
    }

    @Override // com.google.gson.x
    public void d(ex.c cVar, T t11) {
        x<T> xVarL = this.f44955b;
        Type typeE = e(this.f44956c, t11);
        if (typeE != this.f44956c) {
            xVarL = this.f44954a.l(com.google.gson.reflect.a.get(typeE));
            if ((xVarL instanceof l.c) && !f(this.f44955b)) {
                xVarL = this.f44955b;
            }
        }
        xVarL.d(cVar, t11);
    }
}
