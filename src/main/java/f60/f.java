package f60;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<m80.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<o30.d> f64516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f64517b;

    public f(Provider<o30.d> provider, Provider<CoroutineContext> provider2) {
        this.f64516a = provider;
        this.f64517b = provider2;
    }

    public static f a(Provider<o30.d> provider, Provider<CoroutineContext> provider2) {
        return new f(provider, provider2);
    }

    public static m80.a c(o30.d dVar, CoroutineContext coroutineContext) {
        return (m80.a) h.d(e.INSTANCE.a(dVar, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m80.a get() {
        return c(this.f64516a.get(), this.f64517b.get());
    }
}
