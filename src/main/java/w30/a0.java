package w30;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f120545a;

    public a0(Provider<Application> provider) {
        this.f120545a = provider;
    }

    public static a0 a(Provider<Application> provider) {
        return new a0(provider);
    }

    public static z c(Application application) {
        return new z(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f120545a.get());
    }
}
