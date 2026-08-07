package d40;

import android.app.Application;
import c40.m;
import c40.n;
import c40.q;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import h70.j;
import n70.r;
import p013kotlin.coroutines.CoroutineContext;
import qj0.i;
import w30.o;
import w30.p;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    private static final class a implements d40.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f59376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.stripe.android.customersheet.d.e f59377b;

        @Override // d40.b.a
        public d40.b build() {
            qj0.h.a(this.f59376a, Application.class);
            qj0.h.a(this.f59377b, com.stripe.android.customersheet.d.e.class);
            return new b(new s30.d(), new s30.a(), this.f59376a, this.f59377b);
        }

        @Override // d40.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.f59376a = (Application) qj0.h.b(application);
            return this;
        }

        @Override // d40.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(com.stripe.android.customersheet.d.e eVar) {
            this.f59377b = (com.stripe.android.customersheet.d.e) qj0.h.b(eVar);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements d40.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Application f59378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.stripe.android.customersheet.d.e f59379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f59380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<Application> f59381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i<PaymentConfiguration> f59382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<wn0.a<String>> f59383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private i<CoroutineContext> f59384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private i<PaymentAnalyticsRequestFactory> f59385h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private i<o30.d> f59386i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private i<o> f59387j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private i<com.stripe.android.networking.a> f59388k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private i<f80.d> f59389l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i<l<String, r>> f59390m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i<com.stripe.android.customersheet.d.e> f59391n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private i<w30.e> f59392o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private i<h70.i> f59393p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private i<q> f59394q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private i<com.stripe.android.paymentsheet.repositories.a> f59395r;

        private w30.e e() {
            return e40.d.c(this.f59378a, this.f59382e);
        }

        private c40.f f() {
            return new c40.f(this.f59394q.get(), i(), this.f59384g.get());
        }

        private c40.g g() {
            return new c40.g(this.f59394q.get(), this.f59379b);
        }

        private c40.h h() {
            return new c40.h(this.f59394q.get(), this.f59395r.get(), m(), this.f59384g.get());
        }

        private c40.i i() {
            return new c40.i(this.f59394q.get(), k(), this.f59384g.get());
        }

        private o j() {
            return new o(this.f59386i.get(), this.f59384g.get());
        }

        private l<String, r> k() {
            return d.c(this.f59378a, this.f59384g.get());
        }

        private void l(s30.d dVar, s30.a aVar, Application application, com.stripe.android.customersheet.d.e eVar) {
            qj0.e eVarA = qj0.f.a(application);
            this.f59381d = eVarA;
            e40.e eVarA2 = e40.e.a(eVarA);
            this.f59382e = eVarA2;
            this.f59383f = e40.f.a(eVarA2);
            this.f59384g = qj0.d.e(s30.f.a(dVar));
            this.f59385h = z60.d.a(this.f59381d, this.f59383f, e40.i.a());
            i<o30.d> iVarE = qj0.d.e(s30.c.a(aVar, e40.h.a()));
            this.f59386i = iVarE;
            this.f59387j = p.a(iVarE, this.f59384g);
            z60.e eVarA3 = z60.e.a(this.f59381d, this.f59383f, this.f59384g, e40.i.a(), this.f59385h, this.f59387j, this.f59386i);
            this.f59388k = eVarA3;
            this.f59389l = f80.e.a(eVarA3, this.f59382e, this.f59384g);
            this.f59390m = d.a(this.f59381d, this.f59384g);
            this.f59391n = qj0.f.a(eVar);
            e40.d dVarA = e40.d.a(this.f59381d, this.f59382e);
            this.f59392o = dVarA;
            j jVarA = j.a(this.f59387j, dVarA);
            this.f59393p = jVarA;
            this.f59394q = qj0.d.e(c40.r.a(this.f59389l, this.f59390m, this.f59391n, jVarA, e40.g.a(), this.f59384g));
            this.f59395r = qj0.d.e(f80.a.a(this.f59388k, this.f59382e, this.f59386i, this.f59393p, this.f59384g, e40.i.a()));
        }

        private h70.i m() {
            return new h70.i(j(), e());
        }

        @Override // d40.b
        public n a() {
            return h();
        }

        @Override // d40.b
        public c40.l b() {
            return f();
        }

        @Override // d40.b
        public c40.o c() {
            return i();
        }

        @Override // d40.b
        public m d() {
            return g();
        }

        private b(s30.d dVar, s30.a aVar, Application application, com.stripe.android.customersheet.d.e eVar) {
            this.f59380c = this;
            this.f59378a = application;
            this.f59379b = eVar;
            l(dVar, aVar, application, eVar);
        }
    }

    public static d40.b.a a() {
        return new a();
    }
}
