package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112582a;

    public m(Provider<s0> provider) {
        this.f112582a = provider;
    }

    public static m a(Provider<s0> provider) {
        return new m(provider);
    }

    public static l c(s0 s0Var) {
        return new l(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f112582a.get());
    }
}
