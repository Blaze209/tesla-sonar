package e90;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Provider;
import qj0.e;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e<Resources> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f62286a;

    public b(Provider<Context> provider) {
        this.f62286a = provider;
    }

    public static b a(Provider<Context> provider) {
        return new b(provider);
    }

    public static Resources c(Context context) {
        return (Resources) h.d(a.f62285a.a(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Resources get() {
        return c(this.f62286a.get());
    }
}
