package w30;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements qj0.e<com.stripe.android.core.networking.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f120673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j0> f120674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f120675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<k> f120676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<z30.e> f120677e;

    public q(Provider<Application> provider, Provider<j0> provider2, Provider<o30.d> provider3, Provider<k> provider4, Provider<z30.e> provider5) {
        this.f120673a = provider;
        this.f120674b = provider2;
        this.f120675c = provider3;
        this.f120676d = provider4;
        this.f120677e = provider5;
    }

    public static q a(Provider<Application> provider, Provider<j0> provider2, Provider<o30.d> provider3, Provider<k> provider4, Provider<z30.e> provider5) {
        return new q(provider, provider2, provider3, provider4, provider5);
    }

    public static com.stripe.android.core.networking.a c(Application application, j0 j0Var, o30.d dVar, k kVar, z30.e eVar) {
        return new com.stripe.android.core.networking.a(application, j0Var, dVar, kVar, eVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.core.networking.a get() {
        return c(this.f120673a.get(), this.f120674b.get(), this.f120675c.get(), this.f120676d.get(), this.f120677e.get());
    }
}
