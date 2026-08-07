package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 implements qj0.e<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.j> f93107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.r> f93108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.f> f93109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> f93110d;

    public g1(Provider<t50.j> provider, Provider<t50.r> provider2, Provider<t50.f> provider3, Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> provider4) {
        this.f93107a = provider;
        this.f93108b = provider2;
        this.f93109c = provider3;
        this.f93110d = provider4;
    }

    public static g1 a(Provider<t50.j> provider, Provider<t50.r> provider2, Provider<t50.f> provider3, Provider<com.stripe.android.financialconnections.a.ElementsSessionContext> provider4) {
        return new g1(provider, provider2, provider3, provider4);
    }

    public static f1 c(t50.j jVar, t50.r rVar, t50.f fVar, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        return new f1(jVar, rVar, fVar, elementsSessionContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f93107a.get(), this.f93108b.get(), this.f93109c.get(), this.f93110d.get());
    }
}
