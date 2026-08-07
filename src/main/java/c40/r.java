package c40;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements qj0.e<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f80.b> f18732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.l<String, n70.r>> f18733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.customersheet.d.e> f18734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h70.h> f18735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<wn0.a<Long>> f18736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<CoroutineContext> f18737f;

    public r(Provider<f80.b> provider, Provider<wn0.l<String, n70.r>> provider2, Provider<com.stripe.android.customersheet.d.e> provider3, Provider<h70.h> provider4, Provider<wn0.a<Long>> provider5, Provider<CoroutineContext> provider6) {
        this.f18732a = provider;
        this.f18733b = provider2;
        this.f18734c = provider3;
        this.f18735d = provider4;
        this.f18736e = provider5;
        this.f18737f = provider6;
    }

    public static r a(Provider<f80.b> provider, Provider<wn0.l<String, n70.r>> provider2, Provider<com.stripe.android.customersheet.d.e> provider3, Provider<h70.h> provider4, Provider<wn0.a<Long>> provider5, Provider<CoroutineContext> provider6) {
        return new r(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static q c(f80.b bVar, wn0.l<String, n70.r> lVar, com.stripe.android.customersheet.d.e eVar, h70.h hVar, wn0.a<Long> aVar, CoroutineContext coroutineContext) {
        return new q(bVar, lVar, eVar, hVar, aVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f18732a.get(), this.f18733b.get(), this.f18734c.get(), this.f18735d.get(), this.f18736e.get(), this.f18737f.get());
    }
}
