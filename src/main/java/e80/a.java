package e80;

import android.app.Application;
import android.content.Context;
import androidx.p003lifecycle.s0;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import kotlinx.coroutines.CoroutineDispatcher;
import p013kotlin.coroutines.CoroutineContext;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: e80.a$a, reason: collision with other inner class name */
    private static final class C1279a implements e80.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f62235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l80.c.Config f62236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CoroutineDispatcher f62237c;

        @Override // e80.c.a
        public e80.c build() {
            qj0.h.a(this.f62235a, Application.class);
            qj0.h.a(this.f62236b, l80.c.Config.class);
            qj0.h.a(this.f62237c, CoroutineDispatcher.class);
            return new b(new s30.d(), new s30.a(), this.f62235a, this.f62236b, this.f62237c);
        }

        @Override // e80.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1279a a(Application application) {
            this.f62235a = (Application) qj0.h.b(application);
            return this;
        }

        @Override // e80.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1279a b(l80.c.Config config) {
            this.f62236b = (l80.c.Config) qj0.h.b(config);
            return this;
        }

        @Override // e80.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1279a c(CoroutineDispatcher coroutineDispatcher) {
            this.f62237c = (CoroutineDispatcher) qj0.h.b(coroutineDispatcher);
            return this;
        }

        private C1279a() {
        }
    }

    private static final class b implements e80.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Application f62238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l80.c.Config f62239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoroutineDispatcher f62240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f62241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i<CoroutineContext> f62242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<o30.d> f62243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<Application> f62244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<Context> f62245h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<PaymentConfiguration> f62246i;

        private Context d() {
            return g.c(this.f62238a);
        }

        private o e() {
            return new o(this.f62243f.get(), this.f62242e.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l80.a f() {
            return new l80.a(j(), this.f62246i, this.f62239b, this.f62240c);
        }

        private void g(s30.d dVar, s30.a aVar, Application application, l80.c.Config config, CoroutineDispatcher coroutineDispatcher) {
            this.f62242e = qj0.d.e(s30.f.a(dVar));
            this.f62243f = qj0.d.e(s30.c.a(aVar, h.a()));
            qj0.e eVarA = qj0.f.a(application);
            this.f62244g = eVarA;
            g gVarA = g.a(eVarA);
            this.f62245h = gVarA;
            this.f62246i = e.a(gVarA);
        }

        private wn0.a<String> h() {
            return f.a(d());
        }

        private PaymentAnalyticsRequestFactory i() {
            return new PaymentAnalyticsRequestFactory(d(), h(), i.a());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(d(), h(), this.f62242e.get(), i.a(), i(), e(), this.f62243f.get());
        }

        @Override // e80.c
        public j.a a() {
            return new c(this.f62241d);
        }

        private b(s30.d dVar, s30.a aVar, Application application, l80.c.Config config, CoroutineDispatcher coroutineDispatcher) {
            this.f62241d = this;
            this.f62238a = application;
            this.f62239b = config;
            this.f62240c = coroutineDispatcher;
            g(dVar, aVar, application, config, coroutineDispatcher);
        }
    }

    private static final class c implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f62247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s0 f62248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args f62249c;

        @Override // e80.j.a
        public j build() {
            qj0.h.a(this.f62248b, s0.class);
            qj0.h.a(this.f62249c, com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args.class);
            return new d(this.f62247a, this.f62248b, this.f62249c);
        }

        @Override // e80.j.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args args) {
            this.f62249c = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args) qj0.h.b(args);
            return this;
        }

        @Override // e80.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(s0 s0Var) {
            this.f62248b = (s0) qj0.h.b(s0Var);
            return this;
        }

        private c(b bVar) {
            this.f62247a = bVar;
        }
    }

    private static final class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args f62250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f62251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f62252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f62253d;

        @Override // e80.j
        public com.stripe.android.paymentsheet.paymentdatacollection.polling.b a() {
            return new com.stripe.android.paymentsheet.paymentdatacollection.polling.b(this.f62250a, this.f62252c.f(), new d80.b(), this.f62252c.f62240c, this.f62251b);
        }

        private d(b bVar, s0 s0Var, com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args args) {
            this.f62253d = this;
            this.f62252c = bVar;
            this.f62250a = args;
            this.f62251b = s0Var;
        }
    }

    public static e80.c.a a() {
        return new C1279a();
    }
}
