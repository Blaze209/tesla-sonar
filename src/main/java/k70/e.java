package k70;

import android.app.Application;
import android.content.Context;
import androidx.p003lifecycle.s0;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    private static final class a implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f85253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f85254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wn0.a<String> f85255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<String> f85256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f85257e;

        @Override // k70.x.a
        public x build() {
            qj0.h.a(this.f85253a, Context.class);
            qj0.h.a(this.f85254b, Boolean.class);
            qj0.h.a(this.f85255c, wn0.a.class);
            qj0.h.a(this.f85256d, Set.class);
            qj0.h.a(this.f85257e, Boolean.class);
            return new b(new s30.d(), new s30.a(), this.f85253a, this.f85254b, this.f85255c, this.f85256d, this.f85257e);
        }

        @Override // k70.x.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f85253a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // k70.x.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(boolean z11) {
            this.f85254b = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.x.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a e(boolean z11) {
            this.f85257e = (Boolean) qj0.h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // k70.x.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(Set<String> set) {
            this.f85256d = (Set) qj0.h.b(set);
            return this;
        }

        @Override // k70.x.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a d(wn0.a<String> aVar) {
            this.f85255c = (wn0.a) qj0.h.b(aVar);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f85258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<String> f85259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<String> f85260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Boolean f85261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f85262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i<CoroutineContext> f85263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i<Boolean> f85264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i<o30.d> f85265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i<Context> f85266i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i<s80.a> f85267j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i<t80.p> f85268k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i<wn0.a<String>> f85269l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i<Set<String>> f85270m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i<PaymentAnalyticsRequestFactory> f85271n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i<w30.o> f85272o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i<com.stripe.android.networking.a> f85273p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i<w30.u> f85274q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i<j70.a> f85275r;

        /* JADX INFO: Access modifiers changed from: private */
        public w30.o j() {
            return new w30.o(this.f85265h.get(), this.f85263f.get());
        }

        private void k(s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, Set<String> set, Boolean bool2) {
            this.f85263f = qj0.d.e(s30.f.a(dVar));
            qj0.e eVarA = qj0.f.a(bool);
            this.f85264g = eVarA;
            this.f85265h = qj0.d.e(s30.c.a(aVar, eVarA));
            qj0.e eVarA2 = qj0.f.a(context);
            this.f85266i = eVarA2;
            this.f85267j = qj0.d.e(w.a(eVarA2, this.f85264g, this.f85263f));
            this.f85268k = qj0.d.e(v.a());
            this.f85269l = qj0.f.a(aVar2);
            qj0.e eVarA3 = qj0.f.a(set);
            this.f85270m = eVarA3;
            this.f85271n = z60.d.a(this.f85266i, this.f85269l, eVarA3);
            w30.p pVarA = w30.p.a(this.f85265h, this.f85263f);
            this.f85272o = pVarA;
            this.f85273p = z60.e.a(this.f85266i, this.f85269l, this.f85263f, this.f85270m, this.f85271n, pVarA, this.f85265h);
            qj0.i<w30.u> iVarE = qj0.d.e(w30.v.a());
            this.f85274q = iVarE;
            this.f85275r = qj0.d.e(j70.b.a(this.f85273p, this.f85272o, this.f85271n, iVarE, this.f85265h, this.f85263f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory l() {
            return new PaymentAnalyticsRequestFactory(this.f85258a, this.f85259b, this.f85260c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a m() {
            return new com.stripe.android.networking.a(this.f85258a, this.f85259b, this.f85263f.get(), this.f85260c, l(), j(), this.f85265h.get());
        }

        @Override // k70.x
        public y.a a() {
            return new c(this.f85262e);
        }

        private b(s30.d dVar, s30.a aVar, Context context, Boolean bool, wn0.a<String> aVar2, Set<String> set, Boolean bool2) {
            this.f85262e = this;
            this.f85258a = context;
            this.f85259b = aVar2;
            this.f85260c = set;
            this.f85261d = bool2;
            k(dVar, aVar, context, bool, aVar2, set, bool2);
        }
    }

    private static final class c implements y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f85276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Stripe3ds2TransactionContract.Args f85277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s0 f85278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Application f85279d;

        @Override // k70.y.a
        public y build() {
            qj0.h.a(this.f85277b, Stripe3ds2TransactionContract.Args.class);
            qj0.h.a(this.f85278c, s0.class);
            qj0.h.a(this.f85279d, Application.class);
            return new d(this.f85276a, new z(), this.f85277b, this.f85278c, this.f85279d);
        }

        @Override // k70.y.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(Application application) {
            this.f85279d = (Application) qj0.h.b(application);
            return this;
        }

        @Override // k70.y.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(Stripe3ds2TransactionContract.Args args) {
            this.f85277b = (Stripe3ds2TransactionContract.Args) qj0.h.b(args);
            return this;
        }

        @Override // k70.y.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c b(s0 s0Var) {
            this.f85278c = (s0) qj0.h.b(s0Var);
            return this;
        }

        private c(b bVar) {
            this.f85276a = bVar;
        }
    }

    private static final class d implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stripe3ds2TransactionContract.Args f85280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z f85281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Application f85282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s0 f85283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f85284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f85285f;

        private t80.n b() {
            return a0.a(this.f85281b, this.f85282c, this.f85280a, (CoroutineContext) this.f85284e.f85263f.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k70.y
        public com.stripe.android.payments.core.authentication.threeds2.d a() {
            return new com.stripe.android.payments.core.authentication.threeds2.d(this.f85280a, this.f85284e.m(), this.f85284e.j(), this.f85284e.l(), (s80.a) this.f85284e.f85267j.get(), (t80.p) this.f85284e.f85268k.get(), (j70.d) this.f85284e.f85275r.get(), b(), (CoroutineContext) this.f85284e.f85263f.get(), this.f85283d, this.f85284e.f85261d.booleanValue());
        }

        private d(b bVar, z zVar, Stripe3ds2TransactionContract.Args args, s0 s0Var, Application application) {
            this.f85285f = this;
            this.f85284e = bVar;
            this.f85280a = args;
            this.f85281b = zVar;
            this.f85282c = application;
            this.f85283d = s0Var;
        }
    }

    public static x.a a() {
        return new a();
    }
}
