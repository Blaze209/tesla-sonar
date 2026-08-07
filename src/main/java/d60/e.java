package d60;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f59737a;

    public e(Provider<Context> provider) {
        this.f59737a = provider;
    }

    public static e a(Provider<Context> provider) {
        return new e(provider);
    }

    public static d c(Context context) {
        return new d(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f59737a.get());
    }
}
