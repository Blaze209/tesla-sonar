package a80;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Application> f850b;

    public f(d dVar, Provider<Application> provider) {
        this.f849a = dVar;
        this.f850b = provider;
    }

    public static f a(d dVar, Provider<Application> provider) {
        return new f(dVar, provider);
    }

    public static Context c(d dVar, Application application) {
        return (Context) h.d(dVar.b(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f849a, this.f850b.get());
    }
}
