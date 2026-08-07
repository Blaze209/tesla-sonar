package n40;

import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln40/t1;", "", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lt50/z;", "successContentRepository", "Lt50/h;", "repository", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lt50/z;Lt50/h;)V", "", "consumerSessionClientSecret", "", "selectedAccountIds", "", "consentAcquired", "Lcom/stripe/android/financialconnections/model/i0;", "a", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/a$b;", "b", "Lt50/z;", "c", "Lt50/h;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.z successContentRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t50.h repository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SelectNetworkedAccounts", f = "SelectNetworkedAccounts.kt", i = {0}, l = {21}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93277n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93278o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93280q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93278o = obj;
            this.f93280q |= Integer.MIN_VALUE;
            return t1.this.a(null, null, null, this);
        }
    }

    public t1(com.stripe.android.financialconnections.a.Configuration configuration, t50.z successContentRepository, t50.h repository) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(successContentRepository, "successContentRepository");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.configuration = configuration;
        this.successContentRepository = successContentRepository;
        this.repository = repository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation) {
        a aVar;
        t1 t1Var;
        TextUpdate text;
        SuccessPane successPane;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93280q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93280q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objH = aVar2.f93278o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f93280q;
        if (i12 == 0) {
            jn0.t.b(objH);
            t50.h hVar = this.repository;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            aVar2.f93277n = this;
            aVar2.f93280q = 1;
            objH = hVar.h(financialConnectionsSessionClientSecret, str, set, bool, aVar2);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
            t1Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1Var = (t1) aVar2.f93277n;
            jn0.t.b(objH);
        }
        Display display = ((ShareNetworkedAccountsResponse) objH).getDisplay();
        if (display != null && (text = display.getText()) != null && (successPane = text.getSuccessPane()) != null) {
            t1Var.successContentRepository.e(new v50.g.Text(successPane.getSubCaption()), new v50.g.Text(successPane.getCaption()));
        }
        return objH;
    }
}
