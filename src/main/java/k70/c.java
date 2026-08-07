package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import androidx.p003lifecycle.s0;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    private static final class a implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f85214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f85215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wn0.a<String> f85216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private wn0.a<String> f85217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f85218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f85219f;

        @Override // k70.q.a
        public q build() {
            qj0.h.a(this.f85214a, Context.class);
            qj0.h.a(this.f85215b, Boolean.class);
            qj0.h.a(this.f85216c, wn0.a.class);
            qj0.h.a(this.f85217d, wn0.a.class);
            qj0.h.a(this.f85218e, Set.class);
            qj0.h.a(this.f85219f, Boolean.class);
            return new b(new l(), new s30.d(), new s30.a(), this.f85214a, this.f85215b, this.f85216c, this.f85217d, this.f85218e, this.f85219f);
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f85214a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a c(boolean z11) {
            this.f85215b = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(boolean z11) {
            this.f85219f = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set<String> set) {
            this.f85218e = (Set) qj0.h.b(set);
            return this;
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a d(wn0.a<String> aVar) {
            this.f85216c = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        @Override // k70.q.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(wn0.a<String> aVar) {
            this.f85217d = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f85220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<String> f85221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<String> f85222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l f85223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f85224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<CoroutineContext> f85225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<Boolean> f85226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<o30.d> f85227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<Context> f85228i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<CoroutineContext> f85229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<Map<String, String>> f85230k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f85231l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<Set<String>> f85232m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<PaymentAnalyticsRequestFactory> f85233n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<Boolean> f85234o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<Boolean> f85235p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i<i70.h> f85236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i<DefaultReturnUrl> f85237r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f85238s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i<w30.o> f85239t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i<com.stripe.android.networking.a> f85240u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i<a70.g> f85241v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i<a70.j> f85242w;

        /* JADX INFO: Access modifiers changed from: private */
        public w30.o n() {
            return new w30.o(this.f85227h.get(), this.f85225f.get());
        }

        private void o(l lVar, s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, wn0.a<String> aVar3, Set<String> set, Boolean bool2) {
            this.f85225f = qj0.d.e(s30.f.a(dVar));
            qj0.e eVarA = qj0.f.a(bool);
            this.f85226g = eVarA;
            this.f85227h = qj0.d.e(s30.c.a(aVar, eVarA));
            this.f85228i = qj0.f.a(context);
            this.f85229j = qj0.d.e(s30.e.a(dVar));
            this.f85230k = qj0.d.e(p.a(lVar));
            this.f85231l = qj0.f.a(aVar2);
            qj0.e eVarA2 = qj0.f.a(set);
            this.f85232m = eVarA2;
            this.f85233n = z60.d.a(this.f85228i, this.f85231l, eVarA2);
            this.f85234o = n.a(lVar, this.f85228i);
            qj0.e eVarA3 = qj0.f.a(bool2);
            this.f85235p = eVarA3;
            this.f85236q = qj0.d.e(o.a(lVar, this.f85228i, this.f85226g, this.f85225f, this.f85229j, this.f85230k, this.f85233n, this.f85231l, this.f85232m, this.f85234o, eVarA3));
            this.f85237r = qj0.d.e(m.a(lVar, this.f85228i));
            this.f85238s = qj0.f.a(aVar3);
            w30.p pVarA = w30.p.a(this.f85227h, this.f85225f);
            this.f85239t = pVarA;
            z60.e eVarA4 = z60.e.a(this.f85228i, this.f85231l, this.f85225f, this.f85232m, this.f85233n, pVarA, this.f85227h);
            this.f85240u = eVarA4;
            this.f85241v = qj0.d.e(a70.h.a(this.f85228i, this.f85231l, eVarA4, this.f85227h, this.f85225f));
            this.f85242w = qj0.d.e(a70.k.a(this.f85228i, this.f85231l, this.f85240u, this.f85227h, this.f85225f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.f85223d.b(this.f85220a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory q() {
            return new PaymentAnalyticsRequestFactory(this.f85220a, this.f85221b, this.f85222c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a r() {
            return new com.stripe.android.networking.a(this.f85220a, this.f85221b, this.f85225f.get(), this.f85222c, q(), n(), this.f85227h.get());
        }

        @Override // k70.q
        public r.a a() {
            return new C1809c(this.f85224e);
        }

        private b(l lVar, s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, wn0.a<String> aVar3, Set<String> set, Boolean bool2) {
            this.f85224e = this;
            this.f85220a = context;
            this.f85221b = aVar2;
            this.f85222c = set;
            this.f85223d = lVar;
            o(lVar, dVar, aVar, context, bool, aVar2, aVar3, set, bool2);
        }
    }

    /* JADX INFO: renamed from: k70.c$c, reason: collision with other inner class name */
    private static final class C1809c implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f85243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f85244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s0 f85245c;

        @Override // k70.r.a
        public r build() {
            qj0.h.a(this.f85244b, Boolean.class);
            qj0.h.a(this.f85245c, s0.class);
            return new d(this.f85243a, this.f85244b, this.f85245c);
        }

        @Override // k70.r.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1809c a(boolean z11) {
            this.f85244b = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.r.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1809c b(s0 s0Var) {
            this.f85245c = (s0) qj0.h.b(s0Var);
            return this;
        }

        private C1809c(b bVar) {
            this.f85243a = bVar;
        }
    }

    private static final class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f85246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f85247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f85248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f85249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i<w30.l.Options> f85250e;

        private void b(Boolean bool, s0 s0Var) {
            this.f85250e = w30.m.a(this.f85248c.f85231l, this.f85248c.f85238s);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k70.r
        public com.stripe.android.payments.paymentlauncher.e a() {
            return new com.stripe.android.payments.paymentlauncher.e(this.f85246a.booleanValue(), this.f85248c.r(), (i70.h) this.f85248c.f85236q.get(), (DefaultReturnUrl) this.f85248c.f85237r.get(), this.f85250e, (Map) this.f85248c.f85230k.get(), qj0.d.c(this.f85248c.f85241v), qj0.d.c(this.f85248c.f85242w), this.f85248c.n(), this.f85248c.q(), (CoroutineContext) this.f85248c.f85229j.get(), this.f85247b, this.f85248c.p());
        }

        private d(b bVar, Boolean bool, s0 s0Var) {
            this.f85249d = this;
            this.f85248c = bVar;
            this.f85246a = bool;
            this.f85247b = s0Var;
            b(bool, s0Var);
        }
    }

    public static q.a a() {
        return new a();
    }
}
