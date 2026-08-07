package n40;

import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Map;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086B¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln40/b1;", "", "Lt50/p;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "", "applicationId", "<init>", "(Lt50/p;Lcom/stripe/android/financialconnections/a$b;Ljava/lang/String;)V", "Lcom/stripe/android/core/exception/StripeException;", "", "showManualEntry", "Lcom/stripe/android/financialconnections/model/q;", "institution", "b", "(Lcom/stripe/android/core/exception/StripeException;ZLcom/stripe/android/financialconnections/model/q;)Lcom/stripe/android/core/exception/StripeException;", "Lcom/stripe/android/financialconnections/model/k0;", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "a", "(Lcom/stripe/android/financialconnections/model/q;Lcom/stripe/android/financialconnections/model/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/p;", "getRepository", "()Lt50/p;", "Lcom/stripe/android/financialconnections/a$b;", "getConfiguration", "()Lcom/stripe/android/financialconnections/a$b;", "c", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String applicationId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PostAuthorizationSession", f = "PostAuthorizationSession.kt", i = {0, 0, 0}, l = {37}, m = "invoke", n = {"this", "institution", BaseJavaModule.METHOD_TYPE_SYNC}, s = {"L$0", "L$1", "L$2"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f93062q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f93064s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93062q = obj;
            this.f93064s |= Integer.MIN_VALUE;
            return b1.this.a(null, null, this);
        }
    }

    public b1(t50.p repository, com.stripe.android.financialconnections.a.Configuration configuration, String applicationId) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    private final StripeException b(StripeException stripeException, boolean z11, FinancialConnectionsInstitution financialConnectionsInstitution) {
        StripeError stripeError = stripeException.getStripeError();
        if (stripeError != null) {
            Map<String, String> mapE = stripeError.e();
            String str = mapE != null ? mapE.get("institution_unavailable") : null;
            Map<String, String> mapE2 = stripeError.e();
            String str2 = mapE2 != null ? mapE2.get("expected_to_be_available_at") : null;
            if (p013kotlin.jvm.internal.s.f(str, "true")) {
                if (str2 == null || str2.length() == 0) {
                    return new InstitutionUnplannedDowntimeError(financialConnectionsInstitution, z11, stripeException);
                }
                io0.b.Companion companion = io0.b.INSTANCE;
                return new InstitutionPlannedDowntimeError(financialConnectionsInstitution, z11, true, io0.b.p(io0.d.t(Long.parseLong(str2), io0.e.SECONDS)), stripeException);
            }
        }
        return stripeException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(FinancialConnectionsInstitution financialConnectionsInstitution, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws StripeException {
        a aVar;
        b1 b1Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93064s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93064s = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objF = aVar.f93062q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93064s;
        if (i12 == 0) {
            jn0.t.b(objF);
            try {
                t50.p pVar = this.repository;
                String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                String str = this.applicationId;
                aVar.f93059n = this;
                aVar.f93060o = financialConnectionsInstitution;
                aVar.f93061p = synchronizeSessionResponse;
                aVar.f93064s = 1;
                objF = pVar.f(financialConnectionsSessionClientSecret, str, financialConnectionsInstitution, aVar);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                b1Var = this;
            } catch (StripeException e11) {
                e = e11;
                b1Var = this;
                throw b1Var.b(e, p022s40.k.g(synchronizeSessionResponse), financialConnectionsInstitution);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            synchronizeSessionResponse = (SynchronizeSessionResponse) aVar.f93061p;
            financialConnectionsInstitution = (FinancialConnectionsInstitution) aVar.f93060o;
            b1Var = (b1) aVar.f93059n;
            try {
                jn0.t.b(objF);
            } catch (StripeException e12) {
                e = e12;
                throw b1Var.b(e, p022s40.k.g(synchronizeSessionResponse), financialConnectionsInstitution);
            }
        }
        return (FinancialConnectionsAuthorizationSession) objF;
    }
}
