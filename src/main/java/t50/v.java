package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112665a;

    public v(Provider<s0> provider) {
        this.f112665a = provider;
    }

    public static v a(Provider<s0> provider) {
        return new v(provider);
    }

    public static u c(s0 s0Var) {
        return new u(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f112665a.get());
    }
}
