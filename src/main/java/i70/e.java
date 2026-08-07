package i70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> f76094a;

    public e(Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider) {
        this.f76094a = provider;
    }

    public static e a(Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider) {
        return new e(provider);
    }

    public static d c(wn0.l<com.stripe.android.view.n, com.stripe.android.a> lVar) {
        return new d(lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f76094a.get());
    }
}
