package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qj0.e<u50.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.l.Options> f91200a;

    public o(Provider<w30.l.Options> provider) {
        this.f91200a = provider;
    }

    public static o a(Provider<w30.l.Options> provider) {
        return new o(provider);
    }

    public static u50.c c(w30.l.Options options) {
        return (u50.c) qj0.h.d(m.f91193a.c(options));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u50.c get() {
        return c(this.f91200a.get());
    }
}
