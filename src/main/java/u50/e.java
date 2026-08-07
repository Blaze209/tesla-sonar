package u50;

import javax.inject.Provider;
import n40.e0;
import t50.f;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f> f115431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<e0> f115432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<l.Options> f115433c;

    public e(Provider<f> provider, Provider<e0> provider2, Provider<l.Options> provider3) {
        this.f115431a = provider;
        this.f115432b = provider2;
        this.f115433c = provider3;
    }

    public static e a(Provider<f> provider, Provider<e0> provider2, Provider<l.Options> provider3) {
        return new e(provider, provider2, provider3);
    }

    public static d c(f fVar, e0 e0Var, l.Options options) {
        return new d(fVar, e0Var, options);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f115431a.get(), this.f115432b.get(), this.f115433c.get());
    }
}
