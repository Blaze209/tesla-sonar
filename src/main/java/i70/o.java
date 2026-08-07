package i70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qj0.e<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> f76138a;

    public o(Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider) {
        this.f76138a = provider;
    }

    public static o a(Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider) {
        return new o(provider);
    }

    public static n c(wn0.l<com.stripe.android.view.n, com.stripe.android.a> lVar) {
        return new n(lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f76138a.get());
    }
}
