package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln40/z0;", "", "Lt50/p;", "repository", "Lo30/d;", "logger", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/p;Lo30/d;Lcom/stripe/android/financialconnections/a$b;)V", "", "sessionId", "", "Lj40/b;", "events", "Ljn0/h0;", "e", "(Ljava/lang/String;Ljava/util/List;)V", "event", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lj40/b;)V", "a", "Lt50/p;", "b", "Lo30/d;", "c", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PostAuthSessionEvent$invoke$1", f = "PostAuthSessionEvent.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f93336o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f93338q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<j40.b> f93339r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, List<? extends j40.b> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93338q = str;
            this.f93339r = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = z0.this.new a(this.f93338q, this.f93339r, continuation);
            aVar.f93336o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Throwable th2;
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93335n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z0 z0Var = z0.this;
                String str = this.f93338q;
                List<j40.b> list = this.f93339r;
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    t50.p pVar = z0Var.repository;
                    Date date = new Date();
                    String financialConnectionsSessionClientSecret = z0Var.configuration.getFinancialConnectionsSessionClientSecret();
                    this.f93335n = 1;
                    aVar = this;
                    try {
                        obj = pVar.j(financialConnectionsSessionClientSecret, date, str, list, aVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        jn0.s.Companion companion2 = jn0.s.INSTANCE;
                        objB = jn0.s.b(jn0.t.a(th2));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    aVar = this;
                    th2 = th;
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th2));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    jn0.t.b(obj);
                    aVar = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    aVar = this;
                    jn0.s.Companion companion4 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th2));
                }
            }
            objB = jn0.s.b((FinancialConnectionsAuthorizationSession) obj);
            z0 z0Var2 = z0.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                z0Var2.logger.error("error posting auth session event", thE);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public z0(t50.p repository, o30.d logger, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.repository = repository;
        this.logger = logger;
        this.configuration = configuration;
    }

    public final void d(String sessionId, j40.b event) {
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(event, "event");
        e(sessionId, p013kotlin.collections.v.e(event));
    }

    public final void e(String sessionId, List<? extends j40.b> events) {
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(events, "events");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(sessionId, events, null), 2, null);
    }
}
