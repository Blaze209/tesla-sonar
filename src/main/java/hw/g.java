package hw;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import javax.inject.Provider;
import nq.j;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements qj0.e<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.google.firebase.f> f73673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<yv.b<com.google.firebase.remoteconfig.c>> f73674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<zv.f> f73675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<yv.b<j>> f73676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<RemoteConfigManager> f73677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<com.google.firebase.perf.config.a> f73678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<SessionManager> f73679g;

    public g(Provider<com.google.firebase.f> provider, Provider<yv.b<com.google.firebase.remoteconfig.c>> provider2, Provider<zv.f> provider3, Provider<yv.b<j>> provider4, Provider<RemoteConfigManager> provider5, Provider<com.google.firebase.perf.config.a> provider6, Provider<SessionManager> provider7) {
        this.f73673a = provider;
        this.f73674b = provider2;
        this.f73675c = provider3;
        this.f73676d = provider4;
        this.f73677e = provider5;
        this.f73678f = provider6;
        this.f73679g = provider7;
    }

    public static g a(Provider<com.google.firebase.f> provider, Provider<yv.b<com.google.firebase.remoteconfig.c>> provider2, Provider<zv.f> provider3, Provider<yv.b<j>> provider4, Provider<RemoteConfigManager> provider5, Provider<com.google.firebase.perf.config.a> provider6, Provider<SessionManager> provider7) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static e c(com.google.firebase.f fVar, yv.b<com.google.firebase.remoteconfig.c> bVar, zv.f fVar2, yv.b<j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(fVar, bVar, fVar2, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f73673a.get(), this.f73674b.get(), this.f73675c.get(), this.f73676d.get(), this.f73677e.get(), this.f73678f.get(), this.f73679g.get());
    }
}
