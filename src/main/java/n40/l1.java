package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln40/l1;", "", "Ln40/p0;", "coordinator", "Lt50/p;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Ln40/p0;Lt50/p;Lcom/stripe/android/financialconnections/a$b;)V", "", "authorizationSessionId", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln40/p0;", "b", "Lt50/p;", "c", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 coordinator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.RetrieveAuthorizationSession", f = "RetrieveAuthorizationSession.kt", i = {0}, l = {18, 21}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93177n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93178o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93180q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93178o = obj;
            this.f93180q |= Integer.MIN_VALUE;
            return l1.this.a(null, this);
        }
    }

    public l1(p0 coordinator, t50.p repository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(coordinator, "coordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.coordinator = coordinator;
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        a aVar;
        l1 l1Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93180q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93180q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objC = aVar.f93178o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93180q;
        if (i12 == 0) {
            jn0.t.b(objC);
            t50.p pVar = this.repository;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            aVar.f93177n = this;
            aVar.f93180q = 1;
            objC = pVar.c(financialConnectionsSessionClientSecret, str, aVar);
            if (objC != coroutine_suspended) {
                l1Var = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = aVar.f93177n;
            jn0.t.b(objC);
            return obj;
        }
        l1Var = (l1) aVar.f93177n;
        jn0.t.b(objC);
        MutableSharedFlow<p0.a> mutableSharedFlowA = l1Var.coordinator.a();
        p0.a.C1987a c1987a = p0.a.C1987a.f93230a;
        aVar.f93177n = objC;
        aVar.f93180q = 2;
        return mutableSharedFlowA.emit(c1987a, aVar) == coroutine_suspended ? coroutine_suspended : objC;
    }
}
