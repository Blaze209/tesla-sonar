package a40;

import com.stripe.android.customersheet.o;
import h70.h;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.a<Boolean>> f265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<l<a60.d, com.stripe.android.googlepaylauncher.l>> f266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<l70.d> f267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<t60.d> f268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<h> f269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<CoroutineContext> f270f;

    public f(Provider<wn0.a<Boolean>> provider, Provider<l<a60.d, com.stripe.android.googlepaylauncher.l>> provider2, Provider<l70.d> provider3, Provider<t60.d> provider4, Provider<h> provider5, Provider<CoroutineContext> provider6) {
        this.f265a = provider;
        this.f266b = provider2;
        this.f267c = provider3;
        this.f268d = provider4;
        this.f269e = provider5;
        this.f270f = provider6;
    }

    public static f a(Provider<wn0.a<Boolean>> provider, Provider<l<a60.d, com.stripe.android.googlepaylauncher.l>> provider2, Provider<l70.d> provider3, Provider<t60.d> provider4, Provider<h> provider5, Provider<CoroutineContext> provider6) {
        return new f(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static o c(wn0.a<Boolean> aVar, l<a60.d, com.stripe.android.googlepaylauncher.l> lVar, l70.d dVar, t60.d dVar2, h hVar, CoroutineContext coroutineContext) {
        return new o(aVar, lVar, dVar, dVar2, hVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f265a.get(), this.f266b.get(), this.f267c.get(), this.f268d.get(), this.f269e.get(), this.f270f.get());
    }
}
