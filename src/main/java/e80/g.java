package e80;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements qj0.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f62258a;

    public g(Provider<Application> provider) {
        this.f62258a = provider;
    }

    public static g a(Provider<Application> provider) {
        return new g(provider);
    }

    public static Context c(Application application) {
        return (Context) qj0.h.d(d.INSTANCE.c(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f62258a.get());
    }
}
