package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements qj0.e<w30.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.o> f91179a;

    public h0(Provider<w30.o> provider) {
        this.f91179a = provider;
    }

    public static h0 a(Provider<w30.o> provider) {
        return new h0(provider);
    }

    public static w30.c c(w30.o oVar) {
        return (w30.c) qj0.h.d(b0.INSTANCE.h(oVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.c get() {
        return c(this.f91179a.get());
    }
}
