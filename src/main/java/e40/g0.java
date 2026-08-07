package e40;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import java.util.List;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    private static final class a implements i0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f61733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.stripe.android.customersheet.c f61734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.stripe.android.customersheet.r f61735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f61736d;

        @Override // e40.i0.a
        public i0 build() {
            qj0.h.a(this.f61733a, Context.class);
            qj0.h.a(this.f61734b, com.stripe.android.customersheet.c.class);
            return new b(new s30.d(), new s30.a(), this.f61733a, this.f61734b, this.f61735c, this.f61736d);
        }

        @Override // e40.i0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f61733a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // e40.i0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(com.stripe.android.customersheet.c cVar) {
            this.f61734b = (com.stripe.android.customersheet.c) qj0.h.b(cVar);
            return this;
        }

        @Override // e40.i0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(List<String> list) {
            this.f61736d = list;
            return this;
        }

        @Override // e40.i0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a b(com.stripe.android.customersheet.r rVar) {
            this.f61735c = rVar;
            return this;
        }

        private a() {
        }
    }

    private static final class b implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.stripe.android.customersheet.c f61738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.stripe.android.customersheet.r f61739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<String> f61740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f61741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<Context> f61742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<PaymentConfiguration> f61743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f61744h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<CoroutineContext> f61745i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<PaymentAnalyticsRequestFactory> f61746j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<o30.d> f61747k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<w30.o> f61748l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<com.stripe.android.networking.a> f61749m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<w30.e> f61750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<h70.i> f61751o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<com.stripe.android.paymentsheet.repositories.a> f61752p;

        private wn0.l<a40.a, n70.r> b() {
            return k0.a(this.f61737a, this.f61745i.get());
        }

        private void c(s30.d dVar, s30.a aVar, Context context, com.stripe.android.customersheet.c cVar, com.stripe.android.customersheet.r rVar, List<String> list) {
            qj0.e eVarA = qj0.f.a(context);
            this.f61742f = eVarA;
            e eVarA2 = e.a(eVarA);
            this.f61743g = eVarA2;
            this.f61744h = f.a(eVarA2);
            this.f61745i = qj0.d.e(s30.f.a(dVar));
            this.f61746j = z60.d.a(this.f61742f, this.f61744h, i.a());
            qj0.i<o30.d> iVarE = qj0.d.e(s30.c.a(aVar, h.a()));
            this.f61747k = iVarE;
            this.f61748l = w30.p.a(iVarE, this.f61745i);
            this.f61749m = z60.e.a(this.f61742f, this.f61744h, this.f61745i, i.a(), this.f61746j, this.f61748l, this.f61747k);
            d dVarA = d.a(this.f61742f, this.f61743g);
            this.f61750n = dVarA;
            h70.j jVarA = h70.j.a(this.f61748l, dVarA);
            this.f61751o = jVarA;
            this.f61752p = qj0.d.e(f80.a.a(this.f61749m, this.f61743g, this.f61747k, jVarA, this.f61745i, i.a()));
        }

        @Override // e40.i0
        public com.stripe.android.customersheet.s a() {
            return new com.stripe.android.customersheet.s(this.f61737a, this.f61738b, this.f61739c, this.f61740d, g.c(), this.f61752p.get(), b(), this.f61745i.get());
        }

        private b(s30.d dVar, s30.a aVar, Context context, com.stripe.android.customersheet.c cVar, com.stripe.android.customersheet.r rVar, List<String> list) {
            this.f61741e = this;
            this.f61737a = context;
            this.f61738b = cVar;
            this.f61739c = rVar;
            this.f61740d = list;
            c(dVar, aVar, context, cVar, rVar, list);
        }
    }

    public static i0.a a() {
        return new a();
    }
}
