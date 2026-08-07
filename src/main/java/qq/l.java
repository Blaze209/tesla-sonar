package qq;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements rq.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f105853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<i> f105854b;

    public l(Provider<Context> provider, Provider<i> provider2) {
        this.f105853a = provider;
        this.f105854b = provider2;
    }

    public static l a(Provider<Context> provider, Provider<i> provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f105853a.get(), this.f105854b.get());
    }
}
