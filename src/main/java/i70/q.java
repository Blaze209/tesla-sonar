package i70;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements qj0.e<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s> f76142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<d> f76143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Context> f76144c;

    public q(Provider<s> provider, Provider<d> provider2, Provider<Context> provider3) {
        this.f76142a = provider;
        this.f76143b = provider2;
        this.f76144c = provider3;
    }

    public static q a(Provider<s> provider, Provider<d> provider2, Provider<Context> provider3) {
        return new q(provider, provider2, provider3);
    }

    public static p c(s sVar, d dVar, Context context) {
        return new p(sVar, dVar, context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f76142a.get(), this.f76143b.get(), this.f76144c.get());
    }
}
