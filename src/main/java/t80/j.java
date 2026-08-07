package t80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lt80/j;", "Lt80/v;", "", "timeoutMinutes", "Lcom/stripe/android/stripe3ds2/transaction/k;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "<init>", "(ILcom/stripe/android/stripe3ds2/transaction/k;Lcom/stripe/android/stripe3ds2/transactions/a;)V", "Lu80/a;", "c", "()Lu80/a;", "Ljn0/h0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "()V", "Lcom/stripe/android/stripe3ds2/transaction/k;", "b", "Lcom/stripe/android/stripe3ds2/transactions/a;", "", "J", "timeoutMillis", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableTimeoutFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "timeout", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ChallengeRequestData creqData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> mutableTimeoutFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> timeout;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer", f = "TransactionTimer.kt", i = {0}, l = {35}, m = "start", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112932n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112933o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112935q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112933o = obj;
            this.f112935q |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    public j(int i11, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, ChallengeRequestData creqData) {
        p013kotlin.jvm.internal.s.k(errorRequestExecutor, "errorRequestExecutor");
        p013kotlin.jvm.internal.s.k(creqData, "creqData");
        this.errorRequestExecutor = errorRequestExecutor;
        this.creqData = creqData;
        this.timeoutMillis = TimeUnit.MINUTES.toMillis(i11);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableTimeoutFlow = MutableStateFlow;
        this.timeout = MutableStateFlow;
    }

    private final ErrorData c() {
        String threeDsServerTransId = this.creqData.getThreeDsServerTransId();
        String acsTransId = this.creqData.getAcsTransId();
        u80.b bVar = u80.b.TransactionTimedout;
        return new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(bVar.getCode()), ErrorData.c.ThreeDsSdk, bVar.getDescription(), "Timeout expiry reached for the transaction", null, this.creqData.getMessageVersion(), this.creqData.getSdkTransId(), 132, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t80.v
    public Object a(Continuation<? super h0> continuation) {
        a aVar;
        j jVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f112935q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f112935q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f112933o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f112935q;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.timeoutMillis;
            aVar.f112932n = this;
            aVar.f112935q = 1;
            if (DelayKt.delay(j11, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) aVar.f112932n;
            jn0.t.b(obj);
        }
        jVar.e();
        return h0.f84049a;
    }

    @Override // t80.v
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public StateFlow<Boolean> b() {
        return this.timeout;
    }

    public final void e() {
        this.errorRequestExecutor.a(c());
        this.mutableTimeoutFlow.setValue(Boolean.TRUE);
    }
}
