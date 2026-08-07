package v70;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<p70.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f118139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<p70.c> f118140b;

    public c(b bVar, Provider<p70.c> provider) {
        this.f118139a = bVar;
        this.f118140b = provider;
    }

    public static c a(b bVar, Provider<p70.c> provider) {
        return new c(bVar, provider);
    }

    public static p70.b c(b bVar, p70.c cVar) {
        return (p70.b) qj0.h.d(bVar.a(cVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p70.b get() {
        return c(this.f118139a, this.f118140b.get());
    }
}
