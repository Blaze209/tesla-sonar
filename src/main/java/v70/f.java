package v70;

import android.app.Application;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import f30.PaymentConfiguration;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import p010i90.IdentifierSpec;
import p013kotlin.coroutines.CoroutineContext;
import z80.LayoutSpec;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    private static final class a implements v70.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AddressElementActivityContract.Args f118145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f118146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f118147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i<com.stripe.android.paymentsheet.addresselement.a> f118148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i<l.a> f118149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<v70.e.a> f118150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<Boolean> f118151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<o30.d> f118152h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<CoroutineContext> f118153i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<w30.o> f118154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<Context> f118155k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<PaymentConfiguration> f118156l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<w30.e> f118157m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<p70.c> f118158n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<p70.b> f118159o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<com.stripe.android.paymentsheet.addresselement.j.a> f118160p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i<AddressElementActivityContract.Args> f118161q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i<a90.b> f118162r;

        /* JADX INFO: renamed from: v70.f$a$a, reason: collision with other inner class name */
        class C2534a implements qj0.i<l.a> {
            C2534a() {
            }

            @Override // javax.inject.Provider
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l.a get() {
                return new g(a.this.f118147c);
            }
        }

        class b implements qj0.i<v70.e.a> {
            b() {
            }

            @Override // javax.inject.Provider
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public v70.e.a get() {
                return new b(a.this.f118147c);
            }
        }

        class c implements qj0.i<com.stripe.android.paymentsheet.addresselement.j.a> {
            c() {
            }

            @Override // javax.inject.Provider
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.stripe.android.paymentsheet.addresselement.j.a get() {
                return new e(a.this.f118147c);
            }
        }

        private void i(s30.d dVar, s30.a aVar, v70.b bVar, Context context, AddressElementActivityContract.Args args) {
            this.f118148d = qj0.d.e(p017o70.c.a());
            this.f118149e = new C2534a();
            this.f118150f = new b();
            qj0.i<Boolean> iVarE = qj0.d.e(x.a());
            this.f118151g = iVarE;
            this.f118152h = qj0.d.e(s30.c.a(aVar, iVarE));
            qj0.i<CoroutineContext> iVarE2 = qj0.d.e(s30.f.a(dVar));
            this.f118153i = iVarE2;
            this.f118154j = w30.p.a(this.f118152h, iVarE2);
            qj0.e eVarA = qj0.f.a(context);
            this.f118155k = eVarA;
            y yVarA = y.a(eVarA);
            this.f118156l = yVarA;
            s sVarA = s.a(this.f118155k, yVarA);
            this.f118157m = sVarA;
            qj0.i<p70.c> iVarE3 = qj0.d.e(p70.d.a(this.f118154j, sVarA, this.f118153i));
            this.f118158n = iVarE3;
            this.f118159o = qj0.d.e(v70.c.a(bVar, iVarE3));
            this.f118160p = new c();
            qj0.e eVarA2 = qj0.f.a(args);
            this.f118161q = eVarA2;
            this.f118162r = qj0.d.e(v70.d.a(bVar, this.f118155k, eVarA2));
        }

        @Override // v70.a
        public com.stripe.android.paymentsheet.addresselement.c a() {
            return new com.stripe.android.paymentsheet.addresselement.c(this.f118148d.get(), this.f118149e, this.f118150f);
        }

        private a(s30.d dVar, s30.a aVar, v70.b bVar, Context context, AddressElementActivityContract.Args args) {
            this.f118147c = this;
            this.f118145a = args;
            this.f118146b = context;
            i(dVar, aVar, bVar, context, args);
        }
    }

    private static final class b implements v70.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f118166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Application f118167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.stripe.android.paymentsheet.addresselement.i.Args f118168c;

        @Override // v70.e.a
        public v70.e build() {
            qj0.h.a(this.f118167b, Application.class);
            qj0.h.a(this.f118168c, com.stripe.android.paymentsheet.addresselement.i.Args.class);
            return new c(this.f118166a, this.f118167b, this.f118168c);
        }

        @Override // v70.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b a(Application application) {
            this.f118167b = (Application) qj0.h.b(application);
            return this;
        }

        @Override // v70.e.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b b(com.stripe.android.paymentsheet.addresselement.i.Args cVar) {
            this.f118168c = (com.stripe.android.paymentsheet.addresselement.i.Args) qj0.h.b(cVar);
            return this;
        }

        private b(a aVar) {
            this.f118166a = aVar;
        }
    }

    private static final class c implements v70.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.addresselement.i.Args f118169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Application f118170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f118171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f118172d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v70.e
        public com.stripe.android.paymentsheet.addresselement.i a() {
            return new com.stripe.android.paymentsheet.addresselement.i(this.f118171c.f118145a, (com.stripe.android.paymentsheet.addresselement.a) this.f118171c.f118148d.get(), (a90.b) this.f118171c.f118162r.get(), this.f118169a, (p70.b) this.f118171c.f118159o.get(), this.f118170b);
        }

        private c(a aVar, Application application, com.stripe.android.paymentsheet.addresselement.i.Args cVar) {
            this.f118172d = this;
            this.f118171c = aVar;
            this.f118169a = cVar;
            this.f118170b = application;
        }
    }

    private static final class d implements v70.a.InterfaceC2533a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f118173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AddressElementActivityContract.Args f118174b;

        @Override // v70.a.InterfaceC2533a
        public v70.a build() {
            qj0.h.a(this.f118173a, Context.class);
            qj0.h.a(this.f118174b, AddressElementActivityContract.Args.class);
            return new a(new s30.d(), new s30.a(), new v70.b(), this.f118173a, this.f118174b);
        }

        @Override // v70.a.InterfaceC2533a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            this.f118173a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // v70.a.InterfaceC2533a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b(AddressElementActivityContract.Args args) {
            this.f118174b = (AddressElementActivityContract.Args) qj0.h.b(args);
            return this;
        }

        private d() {
        }
    }

    private static final class e implements com.stripe.android.paymentsheet.addresselement.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f118175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LayoutSpec f118176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<IdentifierSpec, String> f118177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<IdentifierSpec, String> f118178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CoroutineScope f118179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private StripeIntent f118180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f118181g;

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        public com.stripe.android.paymentsheet.addresselement.j build() {
            qj0.h.a(this.f118176b, LayoutSpec.class);
            qj0.h.a(this.f118177c, Map.class);
            qj0.h.a(this.f118179e, CoroutineScope.class);
            qj0.h.a(this.f118181g, String.class);
            return new C2535f(this.f118175a, this.f118176b, this.f118177c, this.f118178d, this.f118179e, this.f118180f, this.f118181g);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public e f(LayoutSpec layoutSpec) {
            this.f118176b = (LayoutSpec) qj0.h.b(layoutSpec);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public e e(Map<IdentifierSpec, String> map) {
            this.f118177c = (Map) qj0.h.b(map);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public e a(String str) {
            this.f118181g = (String) qj0.h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public e c(Map<IdentifierSpec, String> map) {
            this.f118178d = map;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public e d(StripeIntent stripeIntent) {
            this.f118180f = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public e b(CoroutineScope coroutineScope) {
            this.f118179e = (CoroutineScope) qj0.h.b(coroutineScope);
            return this;
        }

        private e(a aVar) {
            this.f118175a = aVar;
        }
    }

    /* JADX INFO: renamed from: v70.f$f, reason: collision with other inner class name */
    private static final class C2535f implements com.stripe.android.paymentsheet.addresselement.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LayoutSpec f118182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f118183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<IdentifierSpec, String> f118184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<IdentifierSpec, String> f118185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f118186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C2535f f118187f;

        private t60.h b() {
            return p017o70.j.a(this.f118186e.f118146b, this.f118183b, this.f118184c, this.f118185d);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.j
        public p017o70.h a() {
            return new p017o70.h(this.f118182a, b());
        }

        private C2535f(a aVar, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2, CoroutineScope coroutineScope, StripeIntent stripeIntent, String str) {
            this.f118187f = this;
            this.f118186e = aVar;
            this.f118182a = layoutSpec;
            this.f118183b = str;
            this.f118184c = map;
            this.f118185d = map2;
        }
    }

    private static final class g implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f118188a;

        @Override // v70.l.a
        public l build() {
            return new h(this.f118188a);
        }

        private g(a aVar) {
            this.f118188a = aVar;
        }
    }

    private static final class h implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f118189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f118190b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v70.l
        public com.stripe.android.paymentsheet.addresselement.l a() {
            return new com.stripe.android.paymentsheet.addresselement.l(this.f118189a.f118145a, (com.stripe.android.paymentsheet.addresselement.a) this.f118189a.f118148d.get(), (p70.b) this.f118189a.f118159o.get(), this.f118189a.f118160p);
        }

        private h(a aVar) {
            this.f118190b = this;
            this.f118189a = aVar;
        }
    }

    public static v70.a.InterfaceC2533a a() {
        return new d();
    }
}
