package vw;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements xw.b<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f119883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<y0> f119884b;

    public b0(Provider<Context> provider, Provider<y0> provider2) {
        this.f119883a = provider;
        this.f119884b = provider2;
    }

    public static b0 a(Provider<Context> provider, Provider<y0> provider2) {
        return new b0(provider, provider2);
    }

    public static a0 c(Context context, y0 y0Var) {
        return new a0(context, y0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c(this.f119883a.get(), this.f119884b.get());
    }
}
