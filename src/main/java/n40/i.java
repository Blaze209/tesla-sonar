package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ln40/i;", "", "Lt50/r;", "repository", "Ln40/w;", "fetchPaginatedAccountsForSession", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/r;Ln40/w;Lcom/stripe/android/financialconnections/a$b;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", "Ln40/p0$a$c$a;", "earlyTerminationCause", "", "closeAuthFlowError", "", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ln40/p0$a$c$a;Ljava/lang/Throwable;)Ljava/lang/String;", "Ln40/i$a;", "b", "(Ln40/p0$a$c$a;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/r;", "Ln40/w;", "c", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.r repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w fetchPaginatedAccountsForSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: n40.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Ln40/i$a;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", "", PermissionsResponse.STATUS_KEY, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "b", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsSession session;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String status;

        public Result(FinancialConnectionsSession session, String status) {
            p013kotlin.jvm.internal.s.k(session, "session");
            p013kotlin.jvm.internal.s.k(status, "status");
            this.session = session;
            this.status = status;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FinancialConnectionsSession getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return p013kotlin.jvm.internal.s.f(this.session, result.session) && p013kotlin.jvm.internal.s.f(this.status, result.status);
        }

        public int hashCode() {
            return (this.session.hashCode() * 31) + this.status.hashCode();
        }

        public String toString() {
            return "Result(session=" + this.session + ", status=" + this.status + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession", f = "CompleteFinancialConnectionsSession.kt", i = {0, 0, 0, 1, 1, 1}, l = {18, 23}, m = "invoke", n = {"this", "earlyTerminationCause", "closeAuthFlowError", "this", "earlyTerminationCause", "closeAuthFlowError"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93128n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93129o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93130p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f93131q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f93133s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93131q = obj;
            this.f93133s |= Integer.MIN_VALUE;
            return i.this.b(null, null, this);
        }
    }

    public i(t50.r repository, w fetchPaginatedAccountsForSession, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.repository = repository;
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.configuration = configuration;
    }

    private final String a(FinancialConnectionsSession session, p0.a.Complete.EnumC1988a earlyTerminationCause, Throwable closeAuthFlowError) {
        String analyticsValue;
        return (earlyTerminationCause == null || (analyticsValue = earlyTerminationCause.getAnalyticsValue()) == null) ? j.b(session, closeAuthFlowError) : analyticsValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p0.a.Complete.EnumC1988a enumC1988a, Throwable th2, Continuation<? super Result> continuation) {
        b bVar;
        i iVar;
        p0.a.Complete.EnumC1988a enumC1988a2;
        Throwable th3;
        i iVar2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f93133s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f93133s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objC = bVar.f93131q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f93133s;
        if (i12 == 0) {
            jn0.t.b(objC);
            t50.r rVar = this.repository;
            String value = enumC1988a != null ? enumC1988a.getValue() : null;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            bVar.f93128n = this;
            bVar.f93129o = enumC1988a;
            bVar.f93130p = th2;
            bVar.f93133s = 1;
            objC = rVar.c(financialConnectionsSessionClientSecret, value, bVar);
            if (objC != coroutine_suspended) {
                iVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            th2 = (Throwable) bVar.f93130p;
            enumC1988a = (p0.a.Complete.EnumC1988a) bVar.f93129o;
            iVar = (i) bVar.f93128n;
            jn0.t.b(objC);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th3 = (Throwable) bVar.f93130p;
            enumC1988a2 = (p0.a.Complete.EnumC1988a) bVar.f93129o;
            iVar2 = (i) bVar.f93128n;
            jn0.t.b(objC);
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) objC;
        return new Result(financialConnectionsSession, iVar2.a(financialConnectionsSession, enumC1988a2, th3));
        w wVar = iVar.fetchPaginatedAccountsForSession;
        bVar.f93128n = iVar;
        bVar.f93129o = enumC1988a;
        bVar.f93130p = th2;
        bVar.f93133s = 2;
        objC = wVar.a((FinancialConnectionsSession) objC, bVar);
        if (objC != coroutine_suspended) {
            Throwable th4 = th2;
            enumC1988a2 = enumC1988a;
            th3 = th4;
            iVar2 = iVar;
            FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) objC;
            return new Result(financialConnectionsSession2, iVar2.a(financialConnectionsSession2, enumC1988a2, th3));
        }
        return coroutine_suspended;
    }
}
