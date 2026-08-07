package jw;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements qj0.e<RemoteConfigManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84364a;

    public f(a aVar) {
        this.f84364a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) qj0.h.d(aVar.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f84364a);
    }
}
