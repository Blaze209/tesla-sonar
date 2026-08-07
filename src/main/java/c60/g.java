package c60;

import com.stripe.android.link.LinkActivityContract;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements qj0.e<com.stripe.android.link.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f60.a.InterfaceC1329a> f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<LinkActivityContract> f18817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<d60.d> f18818c;

    public g(Provider<f60.a.InterfaceC1329a> provider, Provider<LinkActivityContract> provider2, Provider<d60.d> provider3) {
        this.f18816a = provider;
        this.f18817b = provider2;
        this.f18818c = provider3;
    }

    public static g a(Provider<f60.a.InterfaceC1329a> provider, Provider<LinkActivityContract> provider2, Provider<d60.d> provider3) {
        return new g(provider, provider2, provider3);
    }

    public static com.stripe.android.link.d c(f60.a.InterfaceC1329a interfaceC1329a, LinkActivityContract linkActivityContract, d60.d dVar) {
        return new com.stripe.android.link.d(interfaceC1329a, linkActivityContract, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.link.d get() {
        return c(this.f18816a.get(), this.f18817b.get(), this.f18818c.get());
    }
}
