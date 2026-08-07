package m40;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements qj0.e<w30.j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<CoroutineContext> f91176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o30.d> f91177b;

    public g0(Provider<CoroutineContext> provider, Provider<o30.d> provider2) {
        this.f91176a = provider;
        this.f91177b = provider2;
    }

    public static g0 a(Provider<CoroutineContext> provider, Provider<o30.d> provider2) {
        return new g0(provider, provider2);
    }

    public static w30.j0 c(CoroutineContext coroutineContext, o30.d dVar) {
        return (w30.j0) qj0.h.d(b0.INSTANCE.g(coroutineContext, dVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.j0 get() {
        return c(this.f91176a.get(), this.f91177b.get());
    }
}
