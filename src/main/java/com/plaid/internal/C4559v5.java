package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.plaid.internal.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4559v5 implements qj0.e<AbstractC4394d1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f48181a;

    public C4559v5(C4515q5 c4515q5, qj0.e eVar) {
        this.f48181a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f48181a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        p013kotlin.jvm.internal.s.j(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        p013kotlin.jvm.internal.s.j(sharedPreferences2, "getSharedPreferences(...)");
        return (AbstractC4394d1) qj0.h.d(new V6(sharedPreferences, sharedPreferences2));
    }
}
