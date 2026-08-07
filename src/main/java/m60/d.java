package m60;

import c60.LinkConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<LinkConfiguration> f91367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<d60.c> f91368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<e60.e> f91369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o30.d> f91370d;

    public d(Provider<LinkConfiguration> provider, Provider<d60.c> provider2, Provider<e60.e> provider3, Provider<o30.d> provider4) {
        this.f91367a = provider;
        this.f91368b = provider2;
        this.f91369c = provider3;
        this.f91370d = provider4;
    }

    public static d a(Provider<LinkConfiguration> provider, Provider<d60.c> provider2, Provider<e60.e> provider3, Provider<o30.d> provider4) {
        return new d(provider, provider2, provider3, provider4);
    }

    public static c c(k kVar, LinkConfiguration linkConfiguration, d60.c cVar, e60.e eVar, o30.d dVar) {
        return new c(kVar, linkConfiguration, cVar, eVar, dVar);
    }

    public c b(k kVar) {
        return c(kVar, this.f91367a.get(), this.f91368b.get(), this.f91369c.get(), this.f91370d.get());
    }
}
