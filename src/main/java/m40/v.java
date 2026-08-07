package m40;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<t50.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f91212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<u50.c> f91213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<w30.l.b> f91214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o30.d> f91215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<s0> f91216e;

    public v(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<w30.l.b> provider3, Provider<o30.d> provider4, Provider<s0> provider5) {
        this.f91212a = provider;
        this.f91213b = provider2;
        this.f91214c = provider3;
        this.f91215d = provider4;
        this.f91216e = provider5;
    }

    public static v a(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<w30.l.b> provider3, Provider<o30.d> provider4, Provider<s0> provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t50.h c(r50.a aVar, u50.c cVar, w30.l.b bVar, o30.d dVar, s0 s0Var) {
        return (t50.h) qj0.h.d(q.INSTANCE.e(aVar, cVar, bVar, dVar, s0Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.h get() {
        return c(this.f91212a.get(), this.f91213b.get(), this.f91214c.get(), this.f91215d.get(), this.f91216e.get());
    }
}
