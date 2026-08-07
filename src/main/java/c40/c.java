package c40;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f80.b> f18653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.customersheet.b> f18654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<h70.h> f18655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<CoroutineContext> f18656d;

    public c(Provider<f80.b> provider, Provider<com.stripe.android.customersheet.b> provider2, Provider<h70.h> provider3, Provider<CoroutineContext> provider4) {
        this.f18653a = provider;
        this.f18654b = provider2;
        this.f18655c = provider3;
        this.f18656d = provider4;
    }

    public static c a(Provider<f80.b> provider, Provider<com.stripe.android.customersheet.b> provider2, Provider<h70.h> provider3, Provider<CoroutineContext> provider4) {
        return new c(provider, provider2, provider3, provider4);
    }

    public static b c(f80.b bVar, com.stripe.android.customersheet.b bVar2, h70.h hVar, CoroutineContext coroutineContext) {
        return new b(bVar, bVar2, hVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f18653a.get(), this.f18654b.get(), this.f18655c.get(), this.f18656d.get());
    }
}
