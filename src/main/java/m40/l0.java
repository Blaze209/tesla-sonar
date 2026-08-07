package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements qj0.e<z30.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<n40.b0> f91192a;

    public l0(Provider<n40.b0> provider) {
        this.f91192a = provider;
    }

    public static l0 a(Provider<n40.b0> provider) {
        return new l0(provider);
    }

    public static z30.e c(n40.b0 b0Var) {
        return (z30.e) qj0.h.d(b0.INSTANCE.l(b0Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z30.e get() {
        return c(this.f91192a.get());
    }
}
