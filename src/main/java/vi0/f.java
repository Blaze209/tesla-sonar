package vi0;

import android.app.Application;
import okhttp3.OkHttpClient;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<OkHttpClient> f119519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<Application> f119520b;

    public f(i<OkHttpClient> iVar, i<Application> iVar2) {
        this.f119519a = iVar;
        this.f119520b = iVar2;
    }

    public static f a(i<OkHttpClient> iVar, i<Application> iVar2) {
        return new f(iVar, iVar2);
    }

    public static c c(OkHttpClient okHttpClient, Application application) {
        return new c(okHttpClient, application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f119519a.get(), this.f119520b.get());
    }
}
