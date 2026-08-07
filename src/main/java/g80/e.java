package g80;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.y;
import javax.inject.Provider;
import n70.r;
import p013kotlin.coroutines.CoroutineContext;
import z80.b1;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.l<y.CustomerConfiguration, r>> f67594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.l<a60.d, com.stripe.android.googlepaylauncher.l>> f67595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<f80.b> f67596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.repositories.b> f67597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<t60.d> f67598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f67599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<EventReporter> f67600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<h70.h> f67601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<CoroutineContext> f67602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<f> f67603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<d60.d> f67604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<b1> f67605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Provider<z30.j> f67606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Provider<r70.a> f67607n;

    public e(Provider<wn0.l<y.CustomerConfiguration, r>> provider, Provider<wn0.l<a60.d, com.stripe.android.googlepaylauncher.l>> provider2, Provider<f80.b> provider3, Provider<com.stripe.android.paymentsheet.repositories.b> provider4, Provider<t60.d> provider5, Provider<o30.d> provider6, Provider<EventReporter> provider7, Provider<h70.h> provider8, Provider<CoroutineContext> provider9, Provider<f> provider10, Provider<d60.d> provider11, Provider<b1> provider12, Provider<z30.j> provider13, Provider<r70.a> provider14) {
        this.f67594a = provider;
        this.f67595b = provider2;
        this.f67596c = provider3;
        this.f67597d = provider4;
        this.f67598e = provider5;
        this.f67599f = provider6;
        this.f67600g = provider7;
        this.f67601h = provider8;
        this.f67602i = provider9;
        this.f67603j = provider10;
        this.f67604k = provider11;
        this.f67605l = provider12;
        this.f67606m = provider13;
        this.f67607n = provider14;
    }

    public static e a(Provider<wn0.l<y.CustomerConfiguration, r>> provider, Provider<wn0.l<a60.d, com.stripe.android.googlepaylauncher.l>> provider2, Provider<f80.b> provider3, Provider<com.stripe.android.paymentsheet.repositories.b> provider4, Provider<t60.d> provider5, Provider<o30.d> provider6, Provider<EventReporter> provider7, Provider<h70.h> provider8, Provider<CoroutineContext> provider9, Provider<f> provider10, Provider<d60.d> provider11, Provider<b1> provider12, Provider<z30.j> provider13, Provider<r70.a> provider14) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static d c(wn0.l<y.CustomerConfiguration, r> lVar, wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> lVar2, f80.b bVar, com.stripe.android.paymentsheet.repositories.b bVar2, t60.d dVar, o30.d dVar2, EventReporter eventReporter, h70.h hVar, CoroutineContext coroutineContext, f fVar, d60.d dVar3, b1 b1Var, z30.j jVar, r70.a aVar) {
        return new d(lVar, lVar2, bVar, bVar2, dVar, dVar2, eventReporter, hVar, coroutineContext, fVar, dVar3, b1Var, jVar, aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f67594a.get(), this.f67595b.get(), this.f67596c.get(), this.f67597d.get(), this.f67598e.get(), this.f67599f.get(), this.f67600g.get(), this.f67601h.get(), this.f67602i.get(), this.f67603j.get(), this.f67604k.get(), this.f67605l.get(), this.f67606m.get(), this.f67607n.get());
    }
}
