package m40;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f91178a;

    public h(Provider<Application> provider) {
        this.f91178a = provider;
    }

    public static h a(Provider<Application> provider) {
        return new h(provider);
    }

    public static String c(Application application) {
        return (String) qj0.h.d(f.f91173a.b(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f91178a.get());
    }
}
