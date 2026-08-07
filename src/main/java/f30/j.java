package f30;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.a<String>> f64123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f64124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.googlepaylauncher.h.Config> f64125c;

    public j(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2, Provider<com.stripe.android.googlepaylauncher.h.Config> provider3) {
        this.f64123a = provider;
        this.f64124b = provider2;
        this.f64125c = provider3;
    }

    public static j a(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2, Provider<com.stripe.android.googlepaylauncher.h.Config> provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(wn0.a<String> aVar, wn0.a<String> aVar2, com.stripe.android.googlepaylauncher.h.Config config) {
        return new i(aVar, aVar2, config);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f64123a.get(), this.f64124b.get(), this.f64125c.get());
    }
}
