package m40;

import android.app.Application;
import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements qj0.e<j40.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f91181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<n40.b0> f91182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Locale> f91183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f91184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<w30.h> f91185e;

    public i0(Provider<Application> provider, Provider<n40.b0> provider2, Provider<Locale> provider3, Provider<com.stripe.android.financialconnections.a.Configuration> provider4, Provider<w30.h> provider5) {
        this.f91181a = provider;
        this.f91182b = provider2;
        this.f91183c = provider3;
        this.f91184d = provider4;
        this.f91185e = provider5;
    }

    public static i0 a(Provider<Application> provider, Provider<n40.b0> provider2, Provider<Locale> provider3, Provider<com.stripe.android.financialconnections.a.Configuration> provider4, Provider<w30.h> provider5) {
        return new i0(provider, provider2, provider3, provider4, provider5);
    }

    public static j40.f c(Application application, n40.b0 b0Var, Locale locale, com.stripe.android.financialconnections.a.Configuration configuration, w30.h hVar) {
        return (j40.f) qj0.h.d(b0.INSTANCE.i(application, b0Var, locale, configuration, hVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j40.f get() {
        return c(this.f91181a.get(), this.f91182b.get(), this.f91183c.get(), this.f91184d.get(), this.f91185e.get());
    }
}
