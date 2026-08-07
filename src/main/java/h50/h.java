package h50;

import javax.inject.Provider;
import t50.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<o50.f> f70896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<u> f70897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.a> f70898c;

    public h(Provider<o50.f> provider, Provider<u> provider2, Provider<t50.a> provider3) {
        this.f70896a = provider;
        this.f70897b = provider2;
        this.f70898c = provider3;
    }

    public static h a(Provider<o50.f> provider, Provider<u> provider2, Provider<t50.a> provider3) {
        return new h(provider, provider2, provider3);
    }

    public static g c(o50.f fVar, u uVar, t50.a aVar) {
        return new g(fVar, uVar, aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f70896a.get(), this.f70897b.get(), this.f70898c.get());
    }
}
