package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import m50.MixedOAuthParams;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import z50.PollTimingOptions;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ln40/x0;", "", "Lt50/r;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/r;Lcom/stripe/android/financialconnections/a$b;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "session", "Lm50/b;", "c", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lt50/r;", "b", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.r repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "exception", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$2", f = "PollAuthorizationSessionOAuthResults.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<Throwable, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93318n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93319o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f93319o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f93318n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(z50.c.a((Throwable) this.f93319o));
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((a) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm50/b;", "<anonymous>", "()Lm50/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$3", f = "PollAuthorizationSessionOAuthResults.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.l<Continuation<? super MixedOAuthParams>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93320n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsAuthorizationSession f93322p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f93322p = financialConnectionsAuthorizationSession;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return x0.this.new b(this.f93322p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93320n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            t50.r rVar = x0.this.repository;
            String financialConnectionsSessionClientSecret = x0.this.configuration.getFinancialConnectionsSessionClientSecret();
            String id2 = this.f93322p.getId();
            this.f93320n = 1;
            Object objA = rVar.a(financialConnectionsSessionClientSecret, id2, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super MixedOAuthParams> continuation) {
            return ((b) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public x0(t50.r repository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    public final Object c(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super MixedOAuthParams> continuation) {
        io0.b.Companion companion = io0.b.INSTANCE;
        return z50.c.b(new PollTimingOptions(0L, 300, io0.b.p(io0.d.s(2, io0.e.SECONDS))), new a(null), new b(financialConnectionsAuthorizationSession, null), continuation);
    }
}
