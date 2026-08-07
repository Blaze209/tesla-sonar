package yw;

import javax.inject.Provider;
import vw.ApplicationInfo;
import vw.w0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xw.b<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w0> f125919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<zv.f> f125920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<ApplicationInfo> f125921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<a> f125922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<l> f125923e;

    public g(Provider<w0> provider, Provider<zv.f> provider2, Provider<ApplicationInfo> provider3, Provider<a> provider4, Provider<l> provider5) {
        this.f125919a = provider;
        this.f125920b = provider2;
        this.f125921c = provider3;
        this.f125922d = provider4;
        this.f125923e = provider5;
    }

    public static g a(Provider<w0> provider, Provider<zv.f> provider2, Provider<ApplicationInfo> provider3, Provider<a> provider4, Provider<l> provider5) {
        return new g(provider, provider2, provider3, provider4, provider5);
    }

    public static d c(w0 w0Var, zv.f fVar, ApplicationInfo applicationInfo, a aVar, l lVar) {
        return new d(w0Var, fVar, applicationInfo, aVar, lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f125919a.get(), this.f125920b.get(), this.f125921c.get(), this.f125922d.get(), this.f125923e.get());
    }
}
