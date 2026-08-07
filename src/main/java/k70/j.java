package k70;

import a70.DefaultReturnUrl;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<wn0.l<com.stripe.android.view.n, f30.n>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<i70.a> f85291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<DefaultReturnUrl> f85292b;

    public j(Provider<i70.a> provider, Provider<DefaultReturnUrl> provider2) {
        this.f85291a = provider;
        this.f85292b = provider2;
    }

    public static j a(Provider<i70.a> provider, Provider<DefaultReturnUrl> provider2) {
        return new j(provider, provider2);
    }

    public static wn0.l<com.stripe.android.view.n, f30.n> c(pj0.a<i70.a> aVar, DefaultReturnUrl defaultReturnUrl) {
        return (wn0.l) qj0.h.d(h.INSTANCE.b(aVar, defaultReturnUrl));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.l<com.stripe.android.view.n, f30.n> get() {
        return c(qj0.d.b(this.f85291a), this.f85292b.get());
    }
}
