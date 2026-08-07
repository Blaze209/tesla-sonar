package f80;

import f30.PaymentConfiguration;
import h70.h;
import java.util.Set;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements qj0.e<com.stripe.android.paymentsheet.repositories.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<g> f64569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f64570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f64571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h> f64572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f64573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<Set<String>> f64574f;

    public a(Provider<g> provider, Provider<PaymentConfiguration> provider2, Provider<o30.d> provider3, Provider<h> provider4, Provider<CoroutineContext> provider5, Provider<Set<String>> provider6) {
        this.f64569a = provider;
        this.f64570b = provider2;
        this.f64571c = provider3;
        this.f64572d = provider4;
        this.f64573e = provider5;
        this.f64574f = provider6;
    }

    public static a a(Provider<g> provider, Provider<PaymentConfiguration> provider2, Provider<o30.d> provider3, Provider<h> provider4, Provider<CoroutineContext> provider5, Provider<Set<String>> provider6) {
        return new a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.stripe.android.paymentsheet.repositories.a c(g gVar, Provider<PaymentConfiguration> provider, o30.d dVar, h hVar, CoroutineContext coroutineContext, Set<String> set) {
        return new com.stripe.android.paymentsheet.repositories.a(gVar, provider, dVar, hVar, coroutineContext, set);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.repositories.a get() {
        return c(this.f64569a.get(), this.f64570b, this.f64571c.get(), this.f64572d.get(), this.f64573e.get(), this.f64574f.get());
    }
}
