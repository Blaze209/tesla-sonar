package pq;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements rq.b<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<zq.a> f103634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<zq.a> f103635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<vq.e> f103636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<wq.r> f103637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<wq.v> f103638e;

    public w(Provider<zq.a> provider, Provider<zq.a> provider2, Provider<vq.e> provider3, Provider<wq.r> provider4, Provider<wq.v> provider5) {
        this.f103634a = provider;
        this.f103635b = provider2;
        this.f103636c = provider3;
        this.f103637d = provider4;
        this.f103638e = provider5;
    }

    public static w a(Provider<zq.a> provider, Provider<zq.a> provider2, Provider<vq.e> provider3, Provider<wq.r> provider4, Provider<wq.v> provider5) {
        return new w(provider, provider2, provider3, provider4, provider5);
    }

    public static u c(zq.a aVar, zq.a aVar2, vq.e eVar, wq.r rVar, wq.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f103634a.get(), this.f103635b.get(), this.f103636c.get(), this.f103637d.get(), this.f103638e.get());
    }
}
