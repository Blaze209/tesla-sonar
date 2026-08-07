package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Map;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import t50.CachedConsumerSession;
import z50.PollTimingOptions;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ln40/s0;", "", "Lt50/h;", "repository", "Lt50/f;", "consumerSessionProvider", "Lt50/c;", "attachedPaymentAccountRepository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/h;Lt50/f;Lt50/c;Lcom/stripe/android/financialconnections/a$b;)V", "Lcom/stripe/android/core/exception/StripeException;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "", "showManualEntry", "g", "(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/q;Z)Lcom/stripe/android/core/exception/StripeException;", "Lcom/stripe/android/financialconnections/model/k0;", BaseJavaModule.METHOD_TYPE_SYNC, "activeInstitution", "Lm50/c;", "params", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "f", "(Lcom/stripe/android/financialconnections/model/k0;Lcom/stripe/android/financialconnections/model/q;Lm50/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lt50/h;", "b", "Lt50/f;", "c", "Lt50/c;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.h repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t50.c attachedPaymentAccountRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "exception", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$2", f = "PollAttachPaymentAccount.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<Throwable, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93258o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f93258o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f93257n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(z50.c.a((Throwable) this.f93258o));
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((a) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3", f = "PollAttachPaymentAccount.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.l<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93259n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m50.c f93261p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f93262q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SynchronizeSessionResponse f93263r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m50.c cVar, FinancialConnectionsInstitution financialConnectionsInstitution, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f93261p = cVar;
            this.f93262q = financialConnectionsInstitution;
            this.f93263r = synchronizeSessionResponse;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return s0.this.new b(this.f93261p, this.f93262q, this.f93263r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93259n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    t50.h hVar = s0.this.repository;
                    String financialConnectionsSessionClientSecret = s0.this.configuration.getFinancialConnectionsSessionClientSecret();
                    m50.c cVar = this.f93261p;
                    CachedConsumerSession cachedConsumerSessionA = s0.this.consumerSessionProvider.a();
                    String clientSecret = cachedConsumerSessionA != null ? cachedConsumerSessionA.getClientSecret() : null;
                    this.f93259n = 1;
                    obj = hVar.f(financialConnectionsSessionClientSecret, cVar, clientSecret, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                s0.this.attachedPaymentAccountRepository.e(this.f93261p);
                return (LinkAccountSessionPaymentAccount) obj;
            } catch (StripeException e11) {
                throw s0.this.g(e11, this.f93262q, p022s40.k.g(this.f93263r));
            }
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((b) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public s0(t50.h repository, t50.f consumerSessionProvider, t50.c attachedPaymentAccountRepository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(consumerSessionProvider, "consumerSessionProvider");
        p013kotlin.jvm.internal.s.k(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.repository = repository;
        this.consumerSessionProvider = consumerSessionProvider;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.configuration = configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeException g(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z11) {
        Map<String, String> mapE;
        if (financialConnectionsInstitution != null) {
            StripeError stripeError = stripeException.getStripeError();
            if (p013kotlin.jvm.internal.s.f((stripeError == null || (mapE = stripeError.e()) == null) ? null : mapE.get(AnalyticsAttribute.Reason), "account_number_retrieval_failed")) {
                return new AccountNumberRetrievalError(z11, financialConnectionsInstitution, stripeException);
            }
        }
        return stripeException;
    }

    public final Object f(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsInstitution financialConnectionsInstitution, m50.c cVar, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        io0.b.Companion companion = io0.b.INSTANCE;
        return z50.c.b(new PollTimingOptions(io0.b.p(io0.d.s(1, io0.e.SECONDS)), 0, 0L, 6, null), new a(null), new b(cVar, financialConnectionsInstitution, synchronizeSessionResponse, null), continuation);
    }
}
