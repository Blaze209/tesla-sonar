package n40;

import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSessionLookup;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln40/h0;", "", "Lt50/j;", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/j;Lcom/stripe/android/financialconnections/a$b;)V", "", Scopes.EMAIL, "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/j;", "b", "Lcom/stripe/android/financialconnections/a$b;", "getConfiguration", "()Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerSessionRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.LookupAccount", f = "LookupAccount.kt", i = {}, l = {16}, m = "invoke", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f93116n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f93118p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93116n = obj;
            this.f93118p |= Integer.MIN_VALUE;
            return h0.this.a(null, this);
        }
    }

    public h0(t50.j consumerSessionRepository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.consumerSessionRepository = consumerSessionRepository;
        this.configuration = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation<? super ConsumerSessionLookup> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93118p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93118p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objG = aVar.f93116n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93118p;
        if (i12 == 0) {
            jn0.t.b(objG);
            t50.j jVar = this.consumerSessionRepository;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            String string = p013kotlin.text.t.F1(lowerCase).toString();
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            aVar.f93118p = 1;
            objG = jVar.g(string, financialConnectionsSessionClientSecret, aVar);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objG);
        }
        if (objG != null) {
            return objG;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
