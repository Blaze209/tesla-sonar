package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements qj0.e<DefaultReturnUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f85290a;

    public i(Provider<Context> provider) {
        this.f85290a = provider;
    }

    public static i a(Provider<Context> provider) {
        return new i(provider);
    }

    public static DefaultReturnUrl c(Context context) {
        return (DefaultReturnUrl) qj0.h.d(h.INSTANCE.a(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultReturnUrl get() {
        return c(this.f85290a.get());
    }
}
