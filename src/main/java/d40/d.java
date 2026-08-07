package d40;

import android.content.Context;
import javax.inject.Provider;
import n70.r;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<l<String, r>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f59358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f59359b;

    public d(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.f59358a = provider;
        this.f59359b = provider2;
    }

    public static d a(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new d(provider, provider2);
    }

    public static l<String, r> c(Context context, CoroutineContext coroutineContext) {
        return (l) qj0.h.d(c.INSTANCE.a(context, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<String, r> get() {
        return c(this.f59358a.get(), this.f59359b.get());
    }
}
