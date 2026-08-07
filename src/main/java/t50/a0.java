package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112499a;

    public a0(Provider<s0> provider) {
        this.f112499a = provider;
    }

    public static a0 a(Provider<s0> provider) {
        return new a0(provider);
    }

    public static z c(s0 s0Var) {
        return new z(s0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f112499a.get());
    }
}
