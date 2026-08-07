package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements qj0.e<j40.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<j40.c> f91172a;

    public e0(Provider<j40.c> provider) {
        this.f91172a = provider;
    }

    public static e0 a(Provider<j40.c> provider) {
        return new e0(provider);
    }

    public static j40.k c(j40.c cVar) {
        return (j40.k) qj0.h.d(b0.INSTANCE.e(cVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j40.k get() {
        return c(this.f91172a.get());
    }
}
