package b60;

import android.content.Context;
import androidx.p003lifecycle.s0;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import p013kotlin.coroutines.CoroutineContext;
import w30.l;
import w30.o;
import w30.p;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b60.a$a, reason: collision with other inner class name */
    private static final class C0327a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f16685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f16686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wn0.a<String> f16687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private wn0.a<String> f16688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f16689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.stripe.android.googlepaylauncher.h.Config f16690f;

        @Override // b60.i.a
        public i build() {
            qj0.h.a(this.f16685a, Context.class);
            qj0.h.a(this.f16686b, Boolean.class);
            qj0.h.a(this.f16687c, wn0.a.class);
            qj0.h.a(this.f16688d, wn0.a.class);
            qj0.h.a(this.f16689e, Set.class);
            qj0.h.a(this.f16690f, com.stripe.android.googlepaylauncher.h.Config.class);
            return new b(new s30.d(), new s30.a(), this.f16685a, this.f16686b, this.f16687c, this.f16688d, this.f16689e, this.f16690f);
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0327a a(Context context) {
            this.f16685a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C0327a c(boolean z11) {
            this.f16686b = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C0327a f(com.stripe.android.googlepaylauncher.h.Config config) {
            this.f16690f = (com.stripe.android.googlepaylauncher.h.Config) qj0.h.b(config);
            return this;
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0327a b(Set<String> set) {
            this.f16689e = (Set) qj0.h.b(set);
            return this;
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C0327a d(wn0.a<String> aVar) {
            this.f16687c = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        @Override // b60.i.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0327a e(wn0.a<String> aVar) {
            this.f16688d = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        private C0327a() {
        }
    }

    private static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wn0.a<String> f16691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<String> f16692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f16693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<String> f16694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f16695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<com.stripe.android.googlepaylauncher.h.Config> f16696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<Context> f16697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<a60.a> f16698h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<a60.h> f16699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<PaymentsClient> f16700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<CoroutineContext> f16701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<Boolean> f16702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<o30.d> f16703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f16704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f16705o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<f30.i> f16706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i<o> f16707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i<Set<String>> f16708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i<PaymentAnalyticsRequestFactory> f16709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i<w30.e> f16710t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i<h70.i> f16711u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i<h70.h> f16712v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i<com.stripe.android.googlepaylauncher.c> f16713w;

        private o h() {
            return new o(this.f16703m.get(), this.f16701k.get());
        }

        private void i(s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, wn0.a<String> aVar3, Set<String> set, com.stripe.android.googlepaylauncher.h.Config config) {
            this.f16696f = qj0.f.a(config);
            qj0.e eVarA = qj0.f.a(context);
            this.f16697g = eVarA;
            a60.b bVarA = a60.b.a(eVarA);
            this.f16698h = bVarA;
            qj0.i<a60.h> iVarE = qj0.d.e(bVarA);
            this.f16699i = iVarE;
            this.f16700j = qj0.d.e(h.a(this.f16696f, iVarE));
            this.f16701k = qj0.d.e(s30.f.a(dVar));
            qj0.e eVarA2 = qj0.f.a(bool);
            this.f16702l = eVarA2;
            this.f16703m = qj0.d.e(s30.c.a(aVar, eVarA2));
            this.f16704n = qj0.f.a(aVar2);
            qj0.e eVarA3 = qj0.f.a(aVar3);
            this.f16705o = eVarA3;
            this.f16706p = qj0.d.e(f30.j.a(this.f16704n, eVarA3, this.f16696f));
            this.f16707q = p.a(this.f16703m, this.f16701k);
            qj0.e eVarA4 = qj0.f.a(set);
            this.f16708r = eVarA4;
            z60.d dVarA = z60.d.a(this.f16697g, this.f16704n, eVarA4);
            this.f16709s = dVarA;
            qj0.i<w30.e> iVarE2 = qj0.d.e(dVarA);
            this.f16710t = iVarE2;
            h70.j jVarA = h70.j.a(this.f16707q, iVarE2);
            this.f16711u = jVarA;
            qj0.i<h70.h> iVarE3 = qj0.d.e(jVarA);
            this.f16712v = iVarE3;
            this.f16713w = qj0.d.e(com.stripe.android.googlepaylauncher.d.a(this.f16697g, this.f16696f, this.f16703m, iVarE3));
        }

        private PaymentAnalyticsRequestFactory j() {
            return new PaymentAnalyticsRequestFactory(this.f16693c, this.f16691a, this.f16694d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a k() {
            return new com.stripe.android.networking.a(this.f16693c, this.f16691a, this.f16701k.get(), this.f16694d, j(), h(), this.f16703m.get());
        }

        @Override // b60.i
        public j.a a() {
            return new c(this.f16695e);
        }

        private b(s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, wn0.a<String> aVar3, Set<String> set, com.stripe.android.googlepaylauncher.h.Config config) {
            this.f16695e = this;
            this.f16691a = aVar2;
            this.f16692b = aVar3;
            this.f16693c = context;
            this.f16694d = set;
            i(dVar, aVar, context, bool, aVar2, aVar3, set, config);
        }
    }

    private static final class c implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f16714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GooglePayPaymentMethodLauncherContractV2.Args f16715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s0 f16716c;

        @Override // b60.j.a
        public j build() {
            qj0.h.a(this.f16715b, GooglePayPaymentMethodLauncherContractV2.Args.class);
            qj0.h.a(this.f16716c, s0.class);
            return new d(this.f16714a, this.f16715b, this.f16716c);
        }

        @Override // b60.j.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(GooglePayPaymentMethodLauncherContractV2.Args args) {
            this.f16715b = (GooglePayPaymentMethodLauncherContractV2.Args) qj0.h.b(args);
            return this;
        }

        @Override // b60.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(s0 s0Var) {
            this.f16716c = (s0) qj0.h.b(s0Var);
            return this;
        }

        private c(b bVar) {
            this.f16714a = bVar;
        }
    }

    private static final class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.Args f16717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f16718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f16719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f16720d;

        private l.Options b() {
            return new l.Options(this.f16719c.f16691a, this.f16719c.f16692b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b60.j
        public com.stripe.android.googlepaylauncher.j a() {
            return new com.stripe.android.googlepaylauncher.j((PaymentsClient) this.f16719c.f16700j.get(), b(), this.f16717a, this.f16719c.k(), (f30.i) this.f16719c.f16706p.get(), (com.stripe.android.googlepaylauncher.l) this.f16719c.f16713w.get(), this.f16718b);
        }

        private d(b bVar, GooglePayPaymentMethodLauncherContractV2.Args args, s0 s0Var) {
            this.f16720d = this;
            this.f16719c = bVar;
            this.f16717a = args;
            this.f16718b = s0Var;
        }
    }

    public static i.a a() {
        return new C0327a();
    }
}
