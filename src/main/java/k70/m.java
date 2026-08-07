package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<DefaultReturnUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f85294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f85295b;

    public m(l lVar, Provider<Context> provider) {
        this.f85294a = lVar;
        this.f85295b = provider;
    }

    public static m a(l lVar, Provider<Context> provider) {
        return new m(lVar, provider);
    }

    public static DefaultReturnUrl c(l lVar, Context context) {
        return (DefaultReturnUrl) qj0.h.d(lVar.a(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultReturnUrl get() {
        return c(this.f85294a, this.f85295b.get());
    }
}
