package t50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f112503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o30.d> f112504b;

    public d(Provider<s0> provider, Provider<o30.d> provider2) {
        this.f112503a = provider;
        this.f112504b = provider2;
    }

    public static d a(Provider<s0> provider, Provider<o30.d> provider2) {
        return new d(provider, provider2);
    }

    public static c c(s0 s0Var, o30.d dVar) {
        return new c(s0Var, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f112503a.get(), this.f112504b.get());
    }
}
