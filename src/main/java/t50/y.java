package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements qj0.e<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112669a;

    public y(Provider<s0> provider) {
        this.f112669a = provider;
    }

    public static y a(Provider<s0> provider) {
        return new y(provider);
    }

    public static x c(s0 s0Var) {
        return new x(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f112669a.get());
    }
}
