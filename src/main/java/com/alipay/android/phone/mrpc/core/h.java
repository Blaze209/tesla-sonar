package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class h extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19996a;

    public h(Context context) {
        this.f19996a = context;
    }

    private g a(ab abVar) {
        return new i(this, abVar);
    }

    @Override // com.alipay.android.phone.mrpc.core.x
    public <T> T a(Class<T> cls, ab abVar) {
        return (T) new y(a(abVar)).a(cls);
    }
}
