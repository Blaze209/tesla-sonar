package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112500a;

    public b(Provider<s0> provider) {
        this.f112500a = provider;
    }

    public static b a(Provider<s0> provider) {
        return new b(provider);
    }

    public static a c(s0 s0Var) {
        return new a(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f112500a.get());
    }
}
