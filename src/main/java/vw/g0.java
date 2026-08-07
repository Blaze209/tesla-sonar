package vw;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 implements xw.b<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<n0> f119938a;

    public g0(Provider<n0> provider) {
        this.f119938a = provider;
    }

    public static g0 a(Provider<n0> provider) {
        return new g0(provider);
    }

    public static f0 c(n0 n0Var) {
        return new f0(n0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f119938a.get());
    }
}
