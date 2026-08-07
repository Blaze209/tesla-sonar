package vw;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 implements xw.b<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.google.firebase.f> f119977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<zv.f> f119978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<yw.j> f119979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h> f119980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f119981e;

    public m0(Provider<com.google.firebase.f> provider, Provider<zv.f> provider2, Provider<yw.j> provider3, Provider<h> provider4, Provider<CoroutineContext> provider5) {
        this.f119977a = provider;
        this.f119978b = provider2;
        this.f119979c = provider3;
        this.f119980d = provider4;
        this.f119981e = provider5;
    }

    public static m0 a(Provider<com.google.firebase.f> provider, Provider<zv.f> provider2, Provider<yw.j> provider3, Provider<h> provider4, Provider<CoroutineContext> provider5) {
        return new m0(provider, provider2, provider3, provider4, provider5);
    }

    public static l0 c(com.google.firebase.f fVar, zv.f fVar2, yw.j jVar, h hVar, CoroutineContext coroutineContext) {
        return new l0(fVar, fVar2, jVar, hVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f119977a.get(), this.f119978b.get(), this.f119979c.get(), this.f119980d.get(), this.f119981e.get());
    }
}
