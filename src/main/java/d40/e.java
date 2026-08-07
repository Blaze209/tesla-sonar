package d40;

import android.app.Application;
import c40.l;
import c40.m;
import c40.n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import h70.j;
import p013kotlin.coroutines.CoroutineContext;
import qj0.i;
import w30.o;
import w30.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    private static final class a implements d40.a.InterfaceC1213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f59360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.stripe.android.customersheet.b f59361b;

        @Override // d40.a.InterfaceC1213a
        public d40.a build() {
            qj0.h.a(this.f59360a, Application.class);
            qj0.h.a(this.f59361b, com.stripe.android.customersheet.b.class);
            return new b(new s30.d(), new s30.a(), this.f59360a, this.f59361b);
        }

        @Override // d40.a.InterfaceC1213a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(com.stripe.android.customersheet.b bVar) {
            this.f59361b = (com.stripe.android.customersheet.b) qj0.h.b(bVar);
            return this;
        }

        @Override // d40.a.InterfaceC1213a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.f59360a = (Application) qj0.h.b(application);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements d40.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f59362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i<Application> f59363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i<PaymentConfiguration> f59364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<wn0.a<String>> f59365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i<CoroutineContext> f59366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<PaymentAnalyticsRequestFactory> f59367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private i<o30.d> f59368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private i<o> f59369h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private i<com.stripe.android.networking.a> f59370i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private i<f80.d> f59371j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private i<com.stripe.android.customersheet.b> f59372k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private i<w30.e> f59373l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i<h70.i> f59374m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i<c40.b> f59375n;

        private void e(s30.d dVar, s30.a aVar, Application application, com.stripe.android.customersheet.b bVar) {
            qj0.e eVarA = qj0.f.a(application);
            this.f59363b = eVarA;
            e40.e eVarA2 = e40.e.a(eVarA);
            this.f59364c = eVarA2;
            this.f59365d = e40.f.a(eVarA2);
            this.f59366e = qj0.d.e(s30.f.a(dVar));
            this.f59367f = z60.d.a(this.f59363b, this.f59365d, e40.i.a());
            i<o30.d> iVarE = qj0.d.e(s30.c.a(aVar, e40.h.a()));
            this.f59368g = iVarE;
            this.f59369h = p.a(iVarE, this.f59366e);
            z60.e eVarA3 = z60.e.a(this.f59363b, this.f59365d, this.f59366e, e40.i.a(), this.f59367f, this.f59369h, this.f59368g);
            this.f59370i = eVarA3;
            this.f59371j = f80.e.a(eVarA3, this.f59364c, this.f59366e);
            this.f59372k = qj0.f.a(bVar);
            e40.d dVarA = e40.d.a(this.f59363b, this.f59364c);
            this.f59373l = dVarA;
            j jVarA = j.a(this.f59369h, dVarA);
            this.f59374m = jVarA;
            this.f59375n = qj0.d.e(c40.c.a(this.f59371j, this.f59372k, jVarA, this.f59366e));
        }

        @Override // d40.a
        public n a() {
            return this.f59375n.get();
        }

        @Override // d40.a
        public l b() {
            return this.f59375n.get();
        }

        @Override // d40.a
        public c40.o c() {
            return this.f59375n.get();
        }

        @Override // d40.a
        public m d() {
            return this.f59375n.get();
        }

        private b(s30.d dVar, s30.a aVar, Application application, com.stripe.android.customersheet.b bVar) {
            this.f59362a = this;
            e(dVar, aVar, application, bVar);
        }
    }

    public static d40.a.InterfaceC1213a a() {
        return new a();
    }
}
