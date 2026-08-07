package yw;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements xw.b<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<o> f125939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o> f125940b;

    public k(Provider<o> provider, Provider<o> provider2) {
        this.f125939a = provider;
        this.f125940b = provider2;
    }

    public static k a(Provider<o> provider, Provider<o> provider2) {
        return new k(provider, provider2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f125939a.get(), this.f125940b.get());
    }
}
