package com.stripe.android.payments.paymentlauncher;

import androidx.p002activity.result.ActivityResultLauncher;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Boolean> f52266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Set<String>> f52267b;

    public j(Provider<Boolean> provider, Provider<Set<String>> provider2) {
        this.f52266a = provider;
        this.f52267b = provider2;
    }

    public static j a(Provider<Boolean> provider, Provider<Set<String>> provider2) {
        return new j(provider, provider2);
    }

    public static g c(wn0.a<String> aVar, wn0.a<String> aVar2, ActivityResultLauncher<PaymentLauncherContract.a> activityResultLauncher, Integer num, boolean z11, boolean z12, Set<String> set) {
        return new g(aVar, aVar2, activityResultLauncher, num, z11, z12, set);
    }

    public g b(wn0.a<String> aVar, wn0.a<String> aVar2, ActivityResultLauncher<PaymentLauncherContract.a> activityResultLauncher, Integer num, boolean z11) {
        return c(aVar, aVar2, activityResultLauncher, num, z11, this.f52266a.get().booleanValue(), this.f52267b.get());
    }
}
