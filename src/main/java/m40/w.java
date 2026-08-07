package m40;

import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements qj0.e<t50.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<m80.a> f91217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<u50.c> f91218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<u50.a> f91219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<t50.g> f91220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Locale> f91221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f91222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<n40.e0> f91223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<r30.g> f91224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> f91225i;

    public w(Provider<m80.a> provider, Provider<u50.c> provider2, Provider<u50.a> provider3, Provider<t50.g> provider4, Provider<Locale> provider5, Provider<o30.d> provider6, Provider<n40.e0> provider7, Provider<r30.g> provider8, Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> provider9) {
        this.f91217a = provider;
        this.f91218b = provider2;
        this.f91219c = provider3;
        this.f91220d = provider4;
        this.f91221e = provider5;
        this.f91222f = provider6;
        this.f91223g = provider7;
        this.f91224h = provider8;
        this.f91225i = provider9;
    }

    public static w a(Provider<m80.a> provider, Provider<u50.c> provider2, Provider<u50.a> provider3, Provider<t50.g> provider4, Provider<Locale> provider5, Provider<o30.d> provider6, Provider<n40.e0> provider7, Provider<r30.g> provider8, Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> provider9) {
        return new w(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static t50.j c(m80.a aVar, u50.c cVar, u50.a aVar2, t50.g gVar, Locale locale, o30.d dVar, n40.e0 e0Var, r30.g gVar2, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        return (t50.j) qj0.h.d(q.INSTANCE.f(aVar, cVar, aVar2, gVar, locale, dVar, e0Var, gVar2, elementsSessionContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.j get() {
        return c(this.f91217a.get(), this.f91218b.get(), this.f91219c.get(), this.f91220d.get(), this.f91221e.get(), this.f91222f.get(), this.f91223g.get(), this.f91224h.get(), this.f91225i.get());
    }
}
