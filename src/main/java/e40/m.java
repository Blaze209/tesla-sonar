package e40;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f61767a;

    public m(Provider<Application> provider) {
        this.f61767a = provider;
    }

    public static Context a(Application application) {
        return (Context) qj0.h.d(l.INSTANCE.b(application));
    }

    public static m b(Provider<Application> provider) {
        return new m(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f61767a.get());
    }
}
