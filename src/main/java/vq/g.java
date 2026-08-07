package vq;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements rq.b<wq.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<zq.a> f119757a;

    public g(Provider<zq.a> provider) {
        this.f119757a = provider;
    }

    public static wq.f a(zq.a aVar) {
        return (wq.f) rq.d.d(f.a(aVar));
    }

    public static g b(Provider<zq.a> provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public wq.f get() {
        return a(this.f119757a.get());
    }
}
