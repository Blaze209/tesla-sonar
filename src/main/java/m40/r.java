package m40;

import javax.inject.Provider;
import o30.ApiVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements qj0.e<m80.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<ApiVersion> f91203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.j0> f91204b;

    public r(Provider<ApiVersion> provider, Provider<w30.j0> provider2) {
        this.f91203a = provider;
        this.f91204b = provider2;
    }

    public static r a(Provider<ApiVersion> provider, Provider<w30.j0> provider2) {
        return new r(provider, provider2);
    }

    public static m80.a c(ApiVersion apiVersion, w30.j0 j0Var) {
        return (m80.a) qj0.h.d(q.INSTANCE.a(apiVersion, j0Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m80.a get() {
        return c(this.f91203a.get(), this.f91204b.get());
    }
}
