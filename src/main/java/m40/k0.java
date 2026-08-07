package m40;

import javax.inject.Provider;
import o30.ApiVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements qj0.e<w30.l.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<ApiVersion> f91190a;

    public k0(Provider<ApiVersion> provider) {
        this.f91190a = provider;
    }

    public static k0 a(Provider<ApiVersion> provider) {
        return new k0(provider);
    }

    public static w30.l.b c(ApiVersion apiVersion) {
        return (w30.l.b) qj0.h.d(b0.INSTANCE.k(apiVersion));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.l.b get() {
        return c(this.f91190a.get());
    }
}
