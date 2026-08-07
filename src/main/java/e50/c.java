package e50;

import javax.inject.Provider;
import n40.b0;
import n40.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.j> f61872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<n40.c> f61873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b0> f61874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o50.f> f61875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<d0> f61876e;

    public c(Provider<t50.j> provider, Provider<n40.c> provider2, Provider<b0> provider3, Provider<o50.f> provider4, Provider<d0> provider5) {
        this.f61872a = provider;
        this.f61873b = provider2;
        this.f61874c = provider3;
        this.f61875d = provider4;
        this.f61876e = provider5;
    }

    public static c a(Provider<t50.j> provider, Provider<n40.c> provider2, Provider<b0> provider3, Provider<o50.f> provider4, Provider<d0> provider5) {
        return new c(provider, provider2, provider3, provider4, provider5);
    }

    public static b c(t50.j jVar, n40.c cVar, b0 b0Var, o50.f fVar, d0 d0Var) {
        return new b(jVar, cVar, b0Var, fVar, d0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f61872a.get(), this.f61873b.get(), this.f61874c.get(), this.f61875d.get(), this.f61876e.get());
    }
}
