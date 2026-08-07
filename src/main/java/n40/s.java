package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln40/s;", "", "Ln40/w;", "fetchPaginatedAccountsForSession", "Lt50/r;", "financialConnectionsRepository", "<init>", "(Ln40/w;Lt50/r;)V", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln40/w;", "b", "Lt50/r;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w fetchPaginatedAccountsForSession;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.r financialConnectionsRepository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession", f = "FetchFinancialConnectionsSession.kt", i = {0}, l = {20, 21}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93250o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93252q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93250o = obj;
            this.f93252q |= Integer.MIN_VALUE;
            return s.this.a(null, this);
        }
    }

    public s(w fetchPaginatedAccountsForSession, t50.r financialConnectionsRepository) {
        p013kotlin.jvm.internal.s.k(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        p013kotlin.jvm.internal.s.k(financialConnectionsRepository, "financialConnectionsRepository");
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        a aVar;
        s sVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93252q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93252q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f93250o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93252q;
        if (i12 == 0) {
            jn0.t.b(objB);
            t50.r rVar = this.financialConnectionsRepository;
            aVar.f93249n = this;
            aVar.f93252q = 1;
            objB = rVar.b(str, aVar);
            if (objB != coroutine_suspended) {
                sVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objB);
            return objB;
        }
        sVar = (s) aVar.f93249n;
        jn0.t.b(objB);
        w wVar = sVar.fetchPaginatedAccountsForSession;
        aVar.f93249n = null;
        aVar.f93252q = 2;
        Object objA = wVar.a((FinancialConnectionsSession) objB, aVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
