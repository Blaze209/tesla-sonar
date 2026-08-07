package a70;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<z60.g> f558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o30.d> f559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f560e;

    public h(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<z60.g> provider3, Provider<o30.d> provider4, Provider<CoroutineContext> provider5) {
        this.f556a = provider;
        this.f557b = provider2;
        this.f558c = provider3;
        this.f559d = provider4;
        this.f560e = provider5;
    }

    public static h a(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<z60.g> provider3, Provider<o30.d> provider4, Provider<CoroutineContext> provider5) {
        return new h(provider, provider2, provider3, provider4, provider5);
    }

    public static g c(Context context, wn0.a<String> aVar, z60.g gVar, o30.d dVar, CoroutineContext coroutineContext) {
        return new g(context, aVar, gVar, dVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f556a.get(), this.f557b.get(), this.f558c.get(), this.f559d.get(), this.f560e.get());
    }
}
