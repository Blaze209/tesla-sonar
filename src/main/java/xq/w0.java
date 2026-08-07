package xq;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements rq.b<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f124016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<String> f124017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Integer> f124018c;

    public w0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f124016a = provider;
        this.f124017b = provider2;
        this.f124018c = provider3;
    }

    public static w0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new w0(provider, provider2, provider3);
    }

    public static v0 c(Context context, String str, int i11) {
        return new v0(context, str, i11);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f124016a.get(), this.f124017b.get(), this.f124018c.get().intValue());
    }
}
