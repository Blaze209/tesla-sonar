package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class z implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f20053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f20054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public aa f20055c;

    public z(g gVar, Class<?> cls, aa aaVar) {
        this.f20053a = gVar;
        this.f20054b = cls;
        this.f20055c = aaVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f20055c.a(obj, this.f20054b, method, objArr);
    }
}
