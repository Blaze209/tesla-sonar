package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.plaid.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4479m5 implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f47872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f47873b;

    public C4479m5(Application context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f47872a = context;
        this.f47873b = jn0.m.b(new C4470l5(this));
    }

    public final void a(EnumC4452j5 environment) {
        p013kotlin.jvm.internal.s.k(environment, "environment");
        ((SharedPreferences) this.f47873b.getValue()).edit().putString("plaid_environment", environment.getJson()).apply();
    }

    public final EnumC4452j5 b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f47873b.getValue();
        p013kotlin.jvm.internal.s.j(sharedPreferences, "<get-sharedPrefs>(...)");
        String strA = W6.a(sharedPreferences, EnumC4452j5.SANDBOX.getJson());
        try {
            EnumC4452j5.Companion.getClass();
            return EnumC4452j5.a.a(strA);
        } catch (Exception e11) {
            X5.a.b(X5.f46812a, "Unknown value was stored in shared prefs: " + strA, new Object[]{e11});
            return EnumC4452j5.SANDBOX;
        }
    }

    @Override // com.plaid.internal.Y
    public final String a() {
        return b().name();
    }
}
