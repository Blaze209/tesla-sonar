package vw;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 implements xw.b<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w0> f119986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<y0> f119987b;

    public o0(Provider<w0> provider, Provider<y0> provider2) {
        this.f119986a = provider;
        this.f119987b = provider2;
    }

    public static o0 a(Provider<w0> provider, Provider<y0> provider2) {
        return new o0(provider, provider2);
    }

    public static n0 c(w0 w0Var, y0 y0Var) {
        return new n0(w0Var, y0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f119986a.get(), this.f119987b.get());
    }
}
