package d60;

import c60.LinkConfiguration;
import h70.h;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<LinkConfiguration> f59729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<h60.c> f59730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<e60.e> f59731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h> f59732d;

    public b(Provider<LinkConfiguration> provider, Provider<h60.c> provider2, Provider<e60.e> provider3, Provider<h> provider4) {
        this.f59729a = provider;
        this.f59730b = provider2;
        this.f59731c = provider3;
        this.f59732d = provider4;
    }

    public static b a(Provider<LinkConfiguration> provider, Provider<h60.c> provider2, Provider<e60.e> provider3, Provider<h> provider4) {
        return new b(provider, provider2, provider3, provider4);
    }

    public static a c(LinkConfiguration linkConfiguration, h60.c cVar, e60.e eVar, h hVar) {
        return new a(linkConfiguration, cVar, eVar, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f59729a.get(), this.f59730b.get(), this.f59731c.get(), this.f59732d.get());
    }
}
