package n40;

import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 implements qj0.e<n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Locale> f93221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.c> f93223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<t50.z> f93224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<t50.p> f93225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<t50.h> f93226f;

    public o1(Provider<Locale> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<t50.c> provider3, Provider<t50.z> provider4, Provider<t50.p> provider5, Provider<t50.h> provider6) {
        this.f93221a = provider;
        this.f93222b = provider2;
        this.f93223c = provider3;
        this.f93224d = provider4;
        this.f93225e = provider5;
        this.f93226f = provider6;
    }

    public static o1 a(Provider<Locale> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<t50.c> provider3, Provider<t50.z> provider4, Provider<t50.p> provider5, Provider<t50.h> provider6) {
        return new o1(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static n1 c(Locale locale, com.stripe.android.financialconnections.a.Configuration configuration, t50.c cVar, t50.z zVar, t50.p pVar, t50.h hVar) {
        return new n1(locale, configuration, cVar, zVar, pVar, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n1 get() {
        return c(this.f93221a.get(), this.f93222b.get(), this.f93223c.get(), this.f93224d.get(), this.f93225e.get(), this.f93226f.get());
    }
}
