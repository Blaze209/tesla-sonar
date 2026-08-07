package m40;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements qj0.e<w30.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f91169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<String> f91170b;

    public c0(Provider<Application> provider, Provider<String> provider2) {
        this.f91169a = provider;
        this.f91170b = provider2;
    }

    public static c0 a(Provider<Application> provider, Provider<String> provider2) {
        return new c0(provider, provider2);
    }

    public static w30.e c(Application application, String str) {
        return (w30.e) qj0.h.d(b0.INSTANCE.b(application, str));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.e get() {
        return c(this.f91169a.get(), this.f91170b.get());
    }
}
