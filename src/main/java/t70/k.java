package t70;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<o90.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f112866a;

    public k(Provider<Context> provider) {
        this.f112866a = provider;
    }

    public static k a(Provider<Context> provider) {
        return new k(provider);
    }

    public static o90.f c(Context context) {
        return (o90.f) qj0.h.d(g.f112862a.d(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o90.f get() {
        return c(this.f112866a.get());
    }
}
