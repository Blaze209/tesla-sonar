package w30;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l.Options> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.a<String>> f120654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f120655b;

    public m(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2) {
        this.f120654a = provider;
        this.f120655b = provider2;
    }

    public static m a(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2) {
        return new m(provider, provider2);
    }

    public static l.Options c(wn0.a<String> aVar, wn0.a<String> aVar2) {
        return new l.Options(aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l.Options get() {
        return c(this.f120654a.get(), this.f120655b.get());
    }
}
