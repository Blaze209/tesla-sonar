package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ln40/g;", "", "Ln40/p0;", "coordinator", "Lt50/p;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Ln40/p0;Lt50/p;Lcom/stripe/android/financialconnections/a$b;)V", "", "authorizationSessionId", "publicToken", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln40/p0;", "b", "Lt50/p;", "c", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 coordinator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.CompleteAuthorizationSession", f = "CompleteAuthorizationSession.kt", i = {0}, l = {19, 23}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93101n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93102o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93104q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93102o = obj;
            this.f93104q |= Integer.MIN_VALUE;
            return g.this.a(null, null, this);
        }
    }

    public g(p0 coordinator, t50.p repository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(coordinator, "coordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.coordinator = coordinator;
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        a aVar;
        g gVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93104q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93104q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f93102o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93104q;
        if (i12 == 0) {
            jn0.t.b(objA);
            t50.p pVar = this.repository;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            aVar.f93101n = this;
            aVar.f93104q = 1;
            objA = pVar.a(financialConnectionsSessionClientSecret, str, str2, aVar);
            if (objA != coroutine_suspended) {
                gVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = aVar.f93101n;
            jn0.t.b(objA);
            return obj;
        }
        gVar = (g) aVar.f93101n;
        jn0.t.b(objA);
        MutableSharedFlow<p0.a> mutableSharedFlowA = gVar.coordinator.a();
        p0.a.C1987a c1987a = p0.a.C1987a.f93230a;
        aVar.f93101n = objA;
        aVar.f93104q = 2;
        return mutableSharedFlowA.emit(c1987a, aVar) == coroutine_suspended ? coroutine_suspended : objA;
    }
}
