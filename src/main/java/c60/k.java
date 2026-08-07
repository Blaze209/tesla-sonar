package c60;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f60.b.a> f18843a;

    public k(Provider<f60.b.a> provider) {
        this.f18843a = provider;
    }

    public static k a(Provider<f60.b.a> provider) {
        return new k(provider);
    }

    public static j c(f60.b.a aVar) {
        return new j(aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f18843a.get());
    }
}
