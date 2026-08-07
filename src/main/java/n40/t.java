package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ln40/t;", "", "Lt50/r;", "connectionsRepository", "<init>", "(Lt50/r;)V", "", "clientSecret", "Lkotlin/Pair;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lcom/stripe/android/model/p1;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/r;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.r connectionsRepository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken", f = "FetchFinancialConnectionsSessionForToken.kt", i = {}, l = {20}, m = "invoke", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f93267n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f93269p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93267n = obj;
            this.f93269p |= Integer.MIN_VALUE;
            return t.this.a(null, this);
        }
    }

    public t(t50.r connectionsRepository) {
        p013kotlin.jvm.internal.s.k(connectionsRepository, "connectionsRepository");
        this.connectionsRepository = connectionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation<? super Pair<FinancialConnectionsSession, Token>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93269p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93269p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f93267n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93269p;
        if (i12 == 0) {
            jn0.t.b(objB);
            t50.r rVar = this.connectionsRepository;
            aVar.f93269p = 1;
            objB = rVar.b(str, aVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objB);
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) objB;
        Token tokenD = financialConnectionsSession.d();
        if (tokenD != null) {
            return jn0.x.a(financialConnectionsSession, tokenD);
        }
        throw new IllegalArgumentException("Could not extract Token from FinancialConnectionsSession.");
    }
}
