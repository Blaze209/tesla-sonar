package com.stripe.android.payments.paymentlauncher;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f52265a;

    i(j jVar) {
        this.f52265a = jVar;
    }

    public static qj0.i<h> b(j jVar) {
        return qj0.f.a(new i(jVar));
    }

    @Override // com.stripe.android.payments.paymentlauncher.h
    public g a(wn0.a<String> aVar, wn0.a<String> aVar2, Integer num, boolean z11, ActivityResultLauncher<PaymentLauncherContract.a> activityResultLauncher) {
        return this.f52265a.b(aVar, aVar2, activityResultLauncher, num, z11);
    }
}
