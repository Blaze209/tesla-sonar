package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f20051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aa f20052b = new aa(this);

    public y(g gVar) {
        this.f20051a = gVar;
    }

    public g a() {
        return this.f20051a;
    }

    public <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new z(this.f20051a, cls, this.f20052b));
    }
}
