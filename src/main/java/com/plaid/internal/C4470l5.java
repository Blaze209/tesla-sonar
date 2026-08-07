package com.plaid.internal;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.plaid.internal.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4470l5 extends p013kotlin.jvm.internal.u implements wn0.a<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4479m5 f47843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4470l5(C4479m5 c4479m5) {
        super(0);
        this.f47843a = c4479m5;
    }

    @Override // wn0.a
    public final SharedPreferences invoke() {
        return this.f47843a.f47872a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
    }
}
