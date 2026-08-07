package k70;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements qj0.e<s80.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f85314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Boolean> f85315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f85316c;

    public w(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        this.f85314a = provider;
        this.f85315b = provider2;
        this.f85316c = provider3;
    }

    public static w a(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        return new w(provider, provider2, provider3);
    }

    public static s80.a c(Context context, boolean z11, CoroutineContext coroutineContext) {
        return (s80.a) qj0.h.d(u.INSTANCE.b(context, z11, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s80.a get() {
        return c(this.f85314a.get(), this.f85315b.get().booleanValue(), this.f85316c.get());
    }
}
