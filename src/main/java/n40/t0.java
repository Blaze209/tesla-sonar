package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements qj0.e<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.f> f93271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.c> f93272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93273d;

    public t0(Provider<t50.h> provider, Provider<t50.f> provider2, Provider<t50.c> provider3, Provider<com.stripe.android.financialconnections.a.Configuration> provider4) {
        this.f93270a = provider;
        this.f93271b = provider2;
        this.f93272c = provider3;
        this.f93273d = provider4;
    }

    public static t0 a(Provider<t50.h> provider, Provider<t50.f> provider2, Provider<t50.c> provider3, Provider<com.stripe.android.financialconnections.a.Configuration> provider4) {
        return new t0(provider, provider2, provider3, provider4);
    }

    public static s0 c(t50.h hVar, t50.f fVar, t50.c cVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new s0(hVar, fVar, cVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f93270a.get(), this.f93271b.get(), this.f93272c.get(), this.f93273d.get());
    }
}
