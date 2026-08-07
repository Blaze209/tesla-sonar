package c70;

import android.app.Application;
import android.content.Context;
import androidx.p003lifecycle.s0;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p013kotlin.coroutines.CoroutineContext;
import qj0.i;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    private static final class a implements c70.a.InterfaceC0384a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f18903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> f18904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s0 f18905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CollectBankAccountContract.a f18906d;

        @Override // c70.a.InterfaceC0384a
        public c70.a build() {
            qj0.h.a(this.f18903a, Application.class);
            qj0.h.a(this.f18904b, MutableSharedFlow.class);
            qj0.h.a(this.f18905c, s0.class);
            qj0.h.a(this.f18906d, CollectBankAccountContract.a.class);
            return new b(new s30.d(), new s30.a(), this.f18903a, this.f18904b, this.f18905c, this.f18906d);
        }

        @Override // c70.a.InterfaceC0384a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.f18903a = (Application) qj0.h.b(application);
            return this;
        }

        @Override // c70.a.InterfaceC0384a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(CollectBankAccountContract.a aVar) {
            this.f18906d = (CollectBankAccountContract.a) qj0.h.b(aVar);
            return this;
        }

        @Override // c70.a.InterfaceC0384a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(s0 s0Var) {
            this.f18905c = (s0) qj0.h.b(s0Var);
            return this;
        }

        @Override // c70.a.InterfaceC0384a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> mutableSharedFlow) {
            this.f18904b = (MutableSharedFlow) qj0.h.b(mutableSharedFlow);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements c70.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CollectBankAccountContract.a f18907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> f18908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Application f18909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s0 f18910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f18911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<CoroutineContext> f18912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private i<o30.d> f18913g;

        private d70.a b() {
            return new d70.a(j());
        }

        private Context c() {
            return d.a(this.f18909c);
        }

        private d70.b d() {
            return new d70.b(j());
        }

        private o e() {
            return new o(this.f18913g.get(), this.f18912f.get());
        }

        private void f(s30.d dVar, s30.a aVar, Application application, MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> mutableSharedFlow, s0 s0Var, CollectBankAccountContract.a aVar2) {
            this.f18912f = qj0.d.e(s30.f.a(dVar));
            this.f18913g = qj0.d.e(s30.c.a(aVar, e.a()));
        }

        private wn0.a<String> g() {
            return c.a(this.f18907a);
        }

        private PaymentAnalyticsRequestFactory h() {
            return new PaymentAnalyticsRequestFactory(c(), g(), f.a());
        }

        private d70.c i() {
            return new d70.c(j());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(c(), g(), this.f18912f.get(), f.a(), h(), e(), this.f18913g.get());
        }

        @Override // c70.a
        public com.stripe.android.payments.bankaccount.ui.b a() {
            return new com.stripe.android.payments.bankaccount.ui.b(this.f18907a, this.f18908b, d(), b(), i(), this.f18910d, this.f18913g.get());
        }

        private b(s30.d dVar, s30.a aVar, Application application, MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> mutableSharedFlow, s0 s0Var, CollectBankAccountContract.a aVar2) {
            this.f18911e = this;
            this.f18907a = aVar2;
            this.f18908b = mutableSharedFlow;
            this.f18909c = application;
            this.f18910d = s0Var;
            f(dVar, aVar, application, mutableSharedFlow, s0Var, aVar2);
        }
    }

    public static c70.a.InterfaceC0384a a() {
        return new a();
    }
}
