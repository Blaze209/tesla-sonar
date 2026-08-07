package t70;

import android.content.Context;
import androidx.p003lifecycle.LifecycleOwner;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.y;
import f30.PaymentConfiguration;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import n70.q;
import n70.r;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<DefaultFlowController> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<CoroutineScope> f112827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<LifecycleOwner> f112828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<wn0.a<Integer>> f112829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<w70.h> f112830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<n70.o> f112831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<q> f112832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<wn0.l<y.CustomerConfiguration, r>> f112833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<h.b> f112834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<Context> f112835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<EventReporter> f112836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.flowcontroller.f> f112837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<com.stripe.android.payments.paymentlauncher.h> f112838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f112839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Provider<Boolean> f112840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Provider<Set<String>> f112841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Provider<b60.e> f112842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> f112843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> f112844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Provider<com.stripe.android.link.d> f112845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.flowcontroller.c> f112846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.i> f112847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Provider<h70.h> f112848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Provider<Boolean> f112849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Provider<CoroutineContext> f112850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Provider<z30.j> f112851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Provider<r70.a> f112852z;

    public b(Provider<CoroutineScope> provider, Provider<LifecycleOwner> provider2, Provider<wn0.a<Integer>> provider3, Provider<w70.h> provider4, Provider<n70.o> provider5, Provider<q> provider6, Provider<wn0.l<y.CustomerConfiguration, r>> provider7, Provider<h.b> provider8, Provider<Context> provider9, Provider<EventReporter> provider10, Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider11, Provider<com.stripe.android.payments.paymentlauncher.h> provider12, Provider<PaymentConfiguration> provider13, Provider<Boolean> provider14, Provider<Set<String>> provider15, Provider<b60.e> provider16, Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> provider17, Provider<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> provider18, Provider<com.stripe.android.link.d> provider19, Provider<com.stripe.android.paymentsheet.flowcontroller.c> provider20, Provider<com.stripe.android.paymentsheet.i> provider21, Provider<h70.h> provider22, Provider<Boolean> provider23, Provider<CoroutineContext> provider24, Provider<z30.j> provider25, Provider<r70.a> provider26) {
        this.f112827a = provider;
        this.f112828b = provider2;
        this.f112829c = provider3;
        this.f112830d = provider4;
        this.f112831e = provider5;
        this.f112832f = provider6;
        this.f112833g = provider7;
        this.f112834h = provider8;
        this.f112835i = provider9;
        this.f112836j = provider10;
        this.f112837k = provider11;
        this.f112838l = provider12;
        this.f112839m = provider13;
        this.f112840n = provider14;
        this.f112841o = provider15;
        this.f112842p = provider16;
        this.f112843q = provider17;
        this.f112844r = provider18;
        this.f112845s = provider19;
        this.f112846t = provider20;
        this.f112847u = provider21;
        this.f112848v = provider22;
        this.f112849w = provider23;
        this.f112850x = provider24;
        this.f112851y = provider25;
        this.f112852z = provider26;
    }

    public static b a(Provider<CoroutineScope> provider, Provider<LifecycleOwner> provider2, Provider<wn0.a<Integer>> provider3, Provider<w70.h> provider4, Provider<n70.o> provider5, Provider<q> provider6, Provider<wn0.l<y.CustomerConfiguration, r>> provider7, Provider<h.b> provider8, Provider<Context> provider9, Provider<EventReporter> provider10, Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider11, Provider<com.stripe.android.payments.paymentlauncher.h> provider12, Provider<PaymentConfiguration> provider13, Provider<Boolean> provider14, Provider<Set<String>> provider15, Provider<b60.e> provider16, Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> provider17, Provider<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> provider18, Provider<com.stripe.android.link.d> provider19, Provider<com.stripe.android.paymentsheet.flowcontroller.c> provider20, Provider<com.stripe.android.paymentsheet.i> provider21, Provider<h70.h> provider22, Provider<Boolean> provider23, Provider<CoroutineContext> provider24, Provider<z30.j> provider25, Provider<r70.a> provider26) {
        return new b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26);
    }

    public static DefaultFlowController c(CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, wn0.a<Integer> aVar, w70.h hVar, n70.o oVar, q qVar, wn0.l<y.CustomerConfiguration, r> lVar, h.b bVar, Context context, EventReporter eventReporter, com.stripe.android.paymentsheet.flowcontroller.f fVar, com.stripe.android.payments.paymentlauncher.h hVar2, Provider<PaymentConfiguration> provider, boolean z11, Set<String> set, b60.e eVar, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar2, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar2, com.stripe.android.link.d dVar, com.stripe.android.paymentsheet.flowcontroller.c cVar, com.stripe.android.paymentsheet.i iVar, h70.h hVar3, boolean z12, CoroutineContext coroutineContext, z30.j jVar, r70.a aVar3) {
        return new DefaultFlowController(coroutineScope, lifecycleOwner, aVar, hVar, oVar, qVar, lVar, bVar, context, eventReporter, fVar, hVar2, provider, z11, set, eVar, bVar2, aVar2, dVar, cVar, iVar, hVar3, z12, coroutineContext, jVar, aVar3);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultFlowController get() {
        return c(this.f112827a.get(), this.f112828b.get(), this.f112829c.get(), this.f112830d.get(), this.f112831e.get(), this.f112832f.get(), this.f112833g.get(), this.f112834h.get(), this.f112835i.get(), this.f112836j.get(), this.f112837k.get(), this.f112838l.get(), this.f112839m, this.f112840n.get().booleanValue(), this.f112841o.get(), this.f112842p.get(), this.f112843q.get(), this.f112844r.get(), this.f112845s.get(), this.f112846t.get(), this.f112847u.get(), this.f112848v.get(), this.f112849w.get().booleanValue(), this.f112850x.get(), this.f112851y.get(), this.f112852z.get());
    }
}
