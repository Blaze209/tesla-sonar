package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: k70.a$a, reason: collision with other inner class name */
    private static final class C1808a implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f85178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PaymentAnalyticsRequestFactory f85179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f85180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CoroutineContext f85181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CoroutineContext f85182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f85183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private wn0.a<String> f85184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Set<String> f85185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f85186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f85187j;

        @Override // k70.g.a
        public g build() {
            qj0.h.a(this.f85178a, Context.class);
            qj0.h.a(this.f85179b, PaymentAnalyticsRequestFactory.class);
            qj0.h.a(this.f85180c, Boolean.class);
            qj0.h.a(this.f85181d, CoroutineContext.class);
            qj0.h.a(this.f85182e, CoroutineContext.class);
            qj0.h.a(this.f85183f, Map.class);
            qj0.h.a(this.f85184g, wn0.a.class);
            qj0.h.a(this.f85185h, Set.class);
            qj0.h.a(this.f85186i, Boolean.class);
            qj0.h.a(this.f85187j, Boolean.class);
            return new b(new b0(), new s30.a(), this.f85178a, this.f85179b, this.f85180c, this.f85181d, this.f85182e, this.f85183f, this.f85184g, this.f85185h, this.f85186i, this.f85187j);
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C1808a g(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.f85179b = (PaymentAnalyticsRequestFactory) qj0.h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C1808a a(Context context) {
            this.f85178a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C1808a c(boolean z11) {
            this.f85180c = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C1808a i(boolean z11) {
            this.f85187j = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C1808a e(boolean z11) {
            this.f85186i = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C1808a b(Set<String> set) {
            this.f85185h = (Set) qj0.h.b(set);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C1808a d(wn0.a<String> aVar) {
            this.f85184g = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C1808a f(Map<String, String> map) {
            this.f85183f = (Map) qj0.h.b(map);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C1808a h(CoroutineContext coroutineContext) {
            this.f85182e = (CoroutineContext) qj0.h.b(coroutineContext);
            return this;
        }

        @Override // k70.g.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public C1808a j(CoroutineContext coroutineContext) {
            this.f85181d = (CoroutineContext) qj0.h.b(coroutineContext);
            return this;
        }

        private C1808a() {
        }
    }

    private static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f85188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qj0.i<i70.a> f85189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qj0.i<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> f85190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i<i70.d> f85191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i<Context> f85192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<DefaultReturnUrl> f85193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<wn0.l<com.stripe.android.view.n, f30.n>> f85194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<Boolean> f85195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<o30.d> f85196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<CoroutineContext> f85197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<w30.o> f85198k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<PaymentAnalyticsRequestFactory> f85199l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<CoroutineContext> f85200m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f85201n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<Boolean> f85202o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<i70.l> f85203p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i<i70.n> f85204q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i<i70.f<StripeIntent>> f85205r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i<Map<String, String>> f85206s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i<i70.s> f85207t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i<i70.p> f85208u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i<f30.l> f85209v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i<Set<String>> f85210w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private qj0.i<com.stripe.android.payments.core.authentication.threeds2.b> f85211x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private qj0.i<Map<Class<? extends StripeIntent.a>, i70.f<StripeIntent>>> f85212y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private qj0.i<Boolean> f85213z;

        private void b(b0 b0Var, s30.a aVar, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, wn0.a<String> aVar2, Set<String> set, Boolean bool2, Boolean bool3) {
            qj0.c cVar = new qj0.c();
            this.f85189b = cVar;
            qj0.i<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> iVarE = qj0.d.e(k.a(cVar));
            this.f85190c = iVarE;
            this.f85191d = qj0.d.e(i70.e.a(iVarE));
            qj0.e eVarA = qj0.f.a(context);
            this.f85192e = eVarA;
            qj0.i<DefaultReturnUrl> iVarE2 = qj0.d.e(i.a(eVarA));
            this.f85193f = iVarE2;
            this.f85194g = qj0.d.e(j.a(this.f85189b, iVarE2));
            qj0.e eVarA2 = qj0.f.a(bool);
            this.f85195h = eVarA2;
            this.f85196i = qj0.d.e(s30.c.a(aVar, eVarA2));
            qj0.e eVarA3 = qj0.f.a(coroutineContext);
            this.f85197j = eVarA3;
            this.f85198k = w30.p.a(this.f85196i, eVarA3);
            this.f85199l = qj0.f.a(paymentAnalyticsRequestFactory);
            this.f85200m = qj0.f.a(coroutineContext2);
            this.f85201n = qj0.f.a(aVar2);
            qj0.e eVarA4 = qj0.f.a(bool2);
            this.f85202o = eVarA4;
            this.f85203p = qj0.d.e(i70.m.a(this.f85194g, this.f85190c, this.f85198k, this.f85199l, this.f85195h, this.f85200m, this.f85201n, eVarA4));
            qj0.i<i70.n> iVarE3 = qj0.d.e(i70.o.a(this.f85190c));
            this.f85204q = iVarE3;
            this.f85205r = c0.a(b0Var, iVarE3);
            qj0.e eVarA5 = qj0.f.a(map);
            this.f85206s = eVarA5;
            qj0.i<i70.s> iVarE4 = qj0.d.e(i70.t.a(this.f85194g, this.f85198k, this.f85199l, this.f85195h, this.f85200m, eVarA5, this.f85201n, this.f85202o, this.f85193f, i70.j.a()));
            this.f85207t = iVarE4;
            this.f85208u = qj0.d.e(i70.q.a(iVarE4, this.f85191d, this.f85192e));
            this.f85209v = qj0.d.e(t.a());
            qj0.e eVarA6 = qj0.f.a(set);
            this.f85210w = eVarA6;
            this.f85211x = qj0.d.e(j70.c.a(this.f85209v, this.f85195h, this.f85201n, eVarA6));
            this.f85212y = qj0.g.b(11).c(StripeIntent.a.WeChatPayRedirect.class, this.f85205r).c(StripeIntent.a.j.Use3DS1.class, this.f85207t).c(StripeIntent.a.RedirectToUrl.class, this.f85207t).c(StripeIntent.a.AlipayRedirect.class, this.f85207t).c(StripeIntent.a.DisplayMultibancoDetails.class, this.f85208u).c(StripeIntent.a.DisplayOxxoDetails.class, this.f85208u).c(StripeIntent.a.DisplayKonbiniDetails.class, this.f85208u).c(StripeIntent.a.DisplayBoletoDetails.class, this.f85208u).c(StripeIntent.a.CashAppRedirect.class, this.f85207t).c(StripeIntent.a.SwishRedirect.class, this.f85207t).c(StripeIntent.a.j.Use3DS2.class, this.f85211x).b();
            qj0.e eVarA7 = qj0.f.a(bool3);
            this.f85213z = eVarA7;
            qj0.c.a(this.f85189b, qj0.d.e(i70.c.a(this.f85191d, this.f85203p, this.f85212y, eVarA7, this.f85192e)));
        }

        @Override // k70.g
        public i70.a a() {
            return this.f85189b.get();
        }

        private b(b0 b0Var, s30.a aVar, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, wn0.a<String> aVar2, Set<String> set, Boolean bool2, Boolean bool3) {
            this.f85188a = this;
            b(b0Var, aVar, context, paymentAnalyticsRequestFactory, bool, coroutineContext, coroutineContext2, map, aVar2, set, bool2, bool3);
        }
    }

    public static g.a a() {
        return new C1808a();
    }
}
