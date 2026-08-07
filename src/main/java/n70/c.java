package n70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<com.stripe.android.paymentsheet.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<z60.g> f93395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Boolean> f93396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<wn0.a<String>> f93397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<wn0.a<String>> f93398d;

    public c(Provider<z60.g> provider, Provider<Boolean> provider2, Provider<wn0.a<String>> provider3, Provider<wn0.a<String>> provider4) {
        this.f93395a = provider;
        this.f93396b = provider2;
        this.f93397c = provider3;
        this.f93398d = provider4;
    }

    public static c a(Provider<z60.g> provider, Provider<Boolean> provider2, Provider<wn0.a<String>> provider3, Provider<wn0.a<String>> provider4) {
        return new c(provider, provider2, provider3, provider4);
    }

    public static com.stripe.android.paymentsheet.b c(z60.g gVar, boolean z11, wn0.a<String> aVar, wn0.a<String> aVar2) {
        return new com.stripe.android.paymentsheet.b(gVar, z11, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.b get() {
        return c(this.f93395a.get(), this.f93396b.get().booleanValue(), this.f93397c.get(), this.f93398d.get());
    }
}
