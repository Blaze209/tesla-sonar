package xq;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements rq.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f123963a;

    public h(Provider<Context> provider) {
        this.f123963a = provider;
    }

    public static h a(Provider<Context> provider) {
        return new h(provider);
    }

    public static String c(Context context) {
        return (String) rq.d.d(f.b(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f123963a.get());
    }
}
