package a70;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<z60.g> f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o30.d> f574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f575e;

    public k(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<z60.g> provider3, Provider<o30.d> provider4, Provider<CoroutineContext> provider5) {
        this.f571a = provider;
        this.f572b = provider2;
        this.f573c = provider3;
        this.f574d = provider4;
        this.f575e = provider5;
    }

    public static k a(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<z60.g> provider3, Provider<o30.d> provider4, Provider<CoroutineContext> provider5) {
        return new k(provider, provider2, provider3, provider4, provider5);
    }

    public static j c(Context context, wn0.a<String> aVar, z60.g gVar, o30.d dVar, CoroutineContext coroutineContext) {
        return new j(context, aVar, gVar, dVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f571a.get(), this.f572b.get(), this.f573c.get(), this.f574d.get(), this.f575e.get());
    }
}
