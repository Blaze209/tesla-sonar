package qq;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements rq.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f105845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<zq.a> f105846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<zq.a> f105847c;

    public j(Provider<Context> provider, Provider<zq.a> provider2, Provider<zq.a> provider3) {
        this.f105845a = provider;
        this.f105846b = provider2;
        this.f105847c = provider3;
    }

    public static j a(Provider<Context> provider, Provider<zq.a> provider2, Provider<zq.a> provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, zq.a aVar, zq.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f105845a.get(), this.f105846b.get(), this.f105847c.get());
    }
}
