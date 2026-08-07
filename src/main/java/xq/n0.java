package xq;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements rq.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<zq.a> f123985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<zq.a> f123986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<e> f123987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<v0> f123988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<String> f123989e;

    public n0(Provider<zq.a> provider, Provider<zq.a> provider2, Provider<e> provider3, Provider<v0> provider4, Provider<String> provider5) {
        this.f123985a = provider;
        this.f123986b = provider2;
        this.f123987c = provider3;
        this.f123988d = provider4;
        this.f123989e = provider5;
    }

    public static n0 a(Provider<zq.a> provider, Provider<zq.a> provider2, Provider<e> provider3, Provider<v0> provider4, Provider<String> provider5) {
        return new n0(provider, provider2, provider3, provider4, provider5);
    }

    public static m0 c(zq.a aVar, zq.a aVar2, Object obj, Object obj2, Provider<String> provider) {
        return new m0(aVar, aVar2, (e) obj, (v0) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f123985a.get(), this.f123986b.get(), this.f123987c.get(), this.f123988d.get(), this.f123989e);
    }
}
