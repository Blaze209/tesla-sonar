package w30;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements qj0.e<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<o30.d> f120671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f120672b;

    public p(Provider<o30.d> provider, Provider<CoroutineContext> provider2) {
        this.f120671a = provider;
        this.f120672b = provider2;
    }

    public static p a(Provider<o30.d> provider, Provider<CoroutineContext> provider2) {
        return new p(provider, provider2);
    }

    public static o c(o30.d dVar, CoroutineContext coroutineContext) {
        return new o(dVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f120671a.get(), this.f120672b.get());
    }
}
