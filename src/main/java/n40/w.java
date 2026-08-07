package n40;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ln40/w;", "", "Lt50/r;", "financialConnectionsRepository", "<init>", "(Lt50/r;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/r;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.r financialConnectionsRepository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession", f = "FetchPaginatedAccountsForSession.kt", i = {0, 0, 0, 1, 1, 1}, l = {28, 34}, m = "invoke", n = {"this", "session", "accounts", "this", "session", "accounts"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93307o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93308p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f93309q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f93311s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93309q = obj;
            this.f93311s |= Integer.MIN_VALUE;
            return w.this.a(null, this);
        }
    }

    public w(t50.r financialConnectionsRepository) {
        p013kotlin.jvm.internal.s.k(financialConnectionsRepository, "financialConnectionsRepository");
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00de -> B:30:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.stripe.android.financialconnections.model.FinancialConnectionsSession r27, p013kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSession> r28) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.w.a(com.stripe.android.financialconnections.model.FinancialConnectionsSession, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
