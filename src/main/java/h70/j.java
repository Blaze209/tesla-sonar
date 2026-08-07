package h70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.c> f70986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.e> f70987b;

    public j(Provider<w30.c> provider, Provider<w30.e> provider2) {
        this.f70986a = provider;
        this.f70987b = provider2;
    }

    public static j a(Provider<w30.c> provider, Provider<w30.e> provider2) {
        return new j(provider, provider2);
    }

    public static i c(w30.c cVar, w30.e eVar) {
        return new i(cVar, eVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f70986a.get(), this.f70987b.get());
    }
}
