package vw;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements xw.b<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.google.firebase.f> f119999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<yw.j> f120000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f120001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<q0> f120002d;

    public s(Provider<com.google.firebase.f> provider, Provider<yw.j> provider2, Provider<CoroutineContext> provider3, Provider<q0> provider4) {
        this.f119999a = provider;
        this.f120000b = provider2;
        this.f120001c = provider3;
        this.f120002d = provider4;
    }

    public static s a(Provider<com.google.firebase.f> provider, Provider<yw.j> provider2, Provider<CoroutineContext> provider3, Provider<q0> provider4) {
        return new s(provider, provider2, provider3, provider4);
    }

    public static l c(com.google.firebase.f fVar, yw.j jVar, CoroutineContext coroutineContext, q0 q0Var) {
        return new l(fVar, jVar, coroutineContext, q0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f119999a.get(), this.f120000b.get(), this.f120001c.get(), this.f120002d.get());
    }
}
