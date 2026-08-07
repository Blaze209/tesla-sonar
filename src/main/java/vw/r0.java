package vw;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 implements xw.b<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f119998a;

    public r0(Provider<s0> provider) {
        this.f119998a = provider;
    }

    public static r0 a(Provider<s0> provider) {
        return new r0(provider);
    }

    public static q0 c(s0 s0Var) {
        return new q0(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        return c(this.f119998a.get());
    }
}
