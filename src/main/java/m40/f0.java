package m40;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements qj0.e<r30.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f91174a;

    public f0(Provider<Application> provider) {
        this.f91174a = provider;
    }

    public static f0 a(Provider<Application> provider) {
        return new f0(provider);
    }

    public static r30.g c(Application application) {
        return (r30.g) qj0.h.d(b0.INSTANCE.f(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r30.g get() {
        return c(this.f91174a.get());
    }
}
