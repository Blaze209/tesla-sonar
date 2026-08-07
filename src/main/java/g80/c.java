package g80;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<c60.d> f67481a;

    public c(Provider<c60.d> provider) {
        this.f67481a = provider;
    }

    public static c a(Provider<c60.d> provider) {
        return new c(provider);
    }

    public static b c(c60.d dVar) {
        return new b(dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f67481a.get());
    }
}
