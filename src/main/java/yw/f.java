package yw;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import vw.ApplicationInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xw.b<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<ApplicationInfo> f125917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f125918b;

    public f(Provider<ApplicationInfo> provider, Provider<CoroutineContext> provider2) {
        this.f125917a = provider;
        this.f125918b = provider2;
    }

    public static f a(Provider<ApplicationInfo> provider, Provider<CoroutineContext> provider2) {
        return new f(provider, provider2);
    }

    public static e c(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new e(applicationInfo, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f125917a.get(), this.f125918b.get());
    }
}
