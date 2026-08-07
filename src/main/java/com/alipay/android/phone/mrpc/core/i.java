package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f19997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19998b;

    public i(h hVar, ab abVar) {
        this.f19998b = hVar;
        this.f19997a = abVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public String a() {
        return this.f19997a.a();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ad b() {
        return l.a(e());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ab c() {
        return this.f19997a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public boolean d() {
        return this.f19997a.c();
    }

    public Context e() {
        return this.f19998b.f19996a.getApplicationContext();
    }
}
