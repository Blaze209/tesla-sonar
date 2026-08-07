package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements qj0.e<w30.l.Options> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<String> f91187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<String> f91188b;

    public j0(Provider<String> provider, Provider<String> provider2) {
        this.f91187a = provider;
        this.f91188b = provider2;
    }

    public static j0 a(Provider<String> provider, Provider<String> provider2) {
        return new j0(provider, provider2);
    }

    public static w30.l.Options c(String str, String str2) {
        return (w30.l.Options) qj0.h.d(b0.INSTANCE.j(str, str2));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.l.Options get() {
        return c(this.f91187a.get(), this.f91188b.get());
    }
}
