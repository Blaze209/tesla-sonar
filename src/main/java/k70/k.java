package k70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<i70.a> f85293a;

    public k(Provider<i70.a> provider) {
        this.f85293a = provider;
    }

    public static k a(Provider<i70.a> provider) {
        return new k(provider);
    }

    public static wn0.l<com.stripe.android.view.n, com.stripe.android.a> c(pj0.a<i70.a> aVar) {
        return (wn0.l) qj0.h.d(h.INSTANCE.c(aVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.l<com.stripe.android.view.n, com.stripe.android.a> get() {
        return c(qj0.d.b(this.f85293a));
    }
}
