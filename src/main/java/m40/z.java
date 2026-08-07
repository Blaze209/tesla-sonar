package m40;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements qj0.e<o90.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f91235a;

    public z(Provider<Application> provider) {
        this.f91235a = provider;
    }

    public static z a(Provider<Application> provider) {
        return new z(provider);
    }

    public static o90.f c(Application application) {
        return (o90.f) qj0.h.d(q.INSTANCE.i(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o90.f get() {
        return c(this.f91235a.get());
    }
}
