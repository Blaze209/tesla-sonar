package k40;

import android.app.Application;
import javax.inject.Provider;
import qj0.e;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f84920a;

    public b(Provider<Application> provider) {
        this.f84920a = provider;
    }

    public static b a(Provider<Application> provider) {
        return new b(provider);
    }

    public static a c(Application application) {
        return new a(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f84920a.get());
    }
}
