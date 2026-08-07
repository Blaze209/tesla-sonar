package t70;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f112868a;

    public m(Provider<Application> provider) {
        this.f112868a = provider;
    }

    public static m a(Provider<Application> provider) {
        return new m(provider);
    }

    public static Context c(Application application) {
        return (Context) qj0.h.d(g.f112862a.f(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f112868a.get());
    }
}
