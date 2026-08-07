package h30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00102R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b)\u00106R*\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u00108\u0012\u0004\b=\u0010\u001e\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010?¨\u0006A"}, d2 = {"Lh30/c;", "", "Lh30/b;", "cardAccountRangeRepository", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "workContext", "Lh30/p;", "staticCardAccountRanges", "Lh30/c$a;", "accountRangeResultListener", "Lkotlin/Function0;", "", "isCbcEligible", "<init>", "(Lh30/b;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lh30/p;Lh30/c$a;Lwn0/a;)V", "", "Lcom/stripe/android/model/a;", "accountRanges", "k", "(Ljava/util/List;)Z", "Lh30/f$b;", "cardNumber", "j", "(Lh30/f$b;)Z", "Ljn0/h0;", "h", "(Lh30/f$b;)V", IntegerTokenConverter.CONVERTER_KEY, "c", "()V", "l", "(Ljava/util/List;)V", "a", "Lh30/b;", "b", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "Lh30/p;", "f", "()Lh30/p;", "e", "Lh30/c$a;", "Lwn0/a;", "Lkotlinx/coroutines/flow/StateFlow;", "g", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "Lh30/a;", "Lh30/a;", "lastBin", "<set-?>", "Ljava/util/List;", "()Ljava/util/List;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getAccountRangeRepositoryJob", "()Lkotlinx/coroutines/Job;", "setAccountRangeRepositoryJob", "(Lkotlinx/coroutines/Job;)V", "getAccountRangeRepositoryJob$annotations", "accountRangeRepositoryJob", "()Lcom/stripe/android/model/a;", "accountRange", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h30.b cardAccountRangeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p staticCardAccountRanges;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a accountRangeResultListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> isCbcEligible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isLoading;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private h30.a lastBin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<AccountRange> accountRanges;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Job accountRangeRepositoryJob;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh30/c$a;", "", "", "Lcom/stripe/android/model/a;", "accountRanges", "Ljn0/h0;", "a", "(Ljava/util/List;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(List<AccountRange> accountRanges);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70583a;

        static {
            int[] iArr = new int[com.stripe.android.model.h.values().length];
            try {
                iArr[com.stripe.android.model.h.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.model.h.UnionPay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70583a = iArr;
        }
    }

    /* JADX INFO: renamed from: h30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1", f = "CardAccountRangeService.kt", i = {}, l = {86, 91}, m = "invokeSuspend", n = {}, s = {})
    static final class C1463c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70584n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ f.Unvalidated f70585o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f70586p;

        /* JADX INFO: renamed from: h30.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1", f = "CardAccountRangeService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70587n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ c f70588o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<AccountRange> f70589p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, List<AccountRange> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f70588o = cVar;
                this.f70589p = list;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f70588o, this.f70589p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f70587n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                c cVar = this.f70588o;
                List<AccountRange> listM = this.f70589p;
                if (listM == null) {
                    listM = v.m();
                }
                cVar.l(listM);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1463c(f.Unvalidated unvalidated, c cVar, Continuation<? super C1463c> continuation) {
            super(2, continuation);
            this.f70585o = unvalidated;
            this.f70586p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1463c(this.f70585o, this.f70586p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6) == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f70584n
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                jn0.t.b(r7)
                goto L55
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                jn0.t.b(r7)
                goto L3b
            L1f:
                jn0.t.b(r7)
                h30.f$b r7 = r6.f70585o
                h30.a r7 = r7.getBin()
                if (r7 == 0) goto L3e
                h30.c r7 = r6.f70586p
                h30.b r7 = h30.c.a(r7)
                h30.f$b r1 = r6.f70585o
                r6.f70584n = r4
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L3b
                goto L54
            L3b:
                java.util.List r7 = (java.util.List) r7
                goto L3f
            L3e:
                r7 = r2
            L3f:
                h30.c r1 = r6.f70586p
                kotlin.coroutines.CoroutineContext r1 = h30.c.b(r1)
                h30.c$c$a r4 = new h30.c$c$a
                h30.c r5 = r6.f70586p
                r4.<init>(r5, r7, r2)
                r6.f70584n = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6)
                if (r7 != r0) goto L55
            L54:
                return r0
            L55:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: h30.c.C1463c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1463c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(h30.b cardAccountRangeRepository, CoroutineContext uiContext, CoroutineContext workContext, p staticCardAccountRanges, a accountRangeResultListener, wn0.a<Boolean> isCbcEligible) {
        s.k(cardAccountRangeRepository, "cardAccountRangeRepository");
        s.k(uiContext, "uiContext");
        s.k(workContext, "workContext");
        s.k(staticCardAccountRanges, "staticCardAccountRanges");
        s.k(accountRangeResultListener, "accountRangeResultListener");
        s.k(isCbcEligible, "isCbcEligible");
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.uiContext = uiContext;
        this.workContext = workContext;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.accountRangeResultListener = accountRangeResultListener;
        this.isCbcEligible = isCbcEligible;
        this.isLoading = cardAccountRangeRepository.b();
        this.accountRanges = v.m();
    }

    private final boolean j(f.Unvalidated cardNumber) {
        AccountRange accountRangeD;
        BinRange binRange;
        boolean z11 = d() == null || cardNumber.getBin() == null || !(((accountRangeD = d()) == null || (binRange = accountRangeD.getBinRange()) == null || binRange.a(cardNumber)) && s.f(cardNumber.getBin(), this.lastBin));
        this.lastBin = cardNumber.getBin();
        return z11;
    }

    private final boolean k(List<AccountRange> accountRanges) {
        AccountRange accountRange = (AccountRange) v.q0(accountRanges);
        com.stripe.android.model.h hVarB = accountRange != null ? accountRange.b() : null;
        int i11 = hVarB == null ? -1 : b.f70583a[hVarB.ordinal()];
        return i11 == 1 || i11 == 2;
    }

    public final void c() {
        Job job = this.accountRangeRepositoryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public final AccountRange d() {
        return (AccountRange) v.q0(this.accountRanges);
    }

    public final List<AccountRange> e() {
        return this.accountRanges;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getStaticCardAccountRanges() {
        return this.staticCardAccountRanges;
    }

    public final StateFlow<Boolean> g() {
        return this.isLoading;
    }

    public final void h(f.Unvalidated cardNumber) {
        s.k(cardNumber, "cardNumber");
        boolean zBooleanValue = this.isCbcEligible.invoke().booleanValue();
        if (zBooleanValue && cardNumber.getLength() < 8) {
            l(v.m());
            return;
        }
        List<AccountRange> listA = this.isCbcEligible.invoke().booleanValue() ? g.f70602a.a(cardNumber) : v.m();
        if (!listA.isEmpty()) {
            l(listA);
            return;
        }
        List<AccountRange> listA2 = this.staticCardAccountRanges.a(cardNumber);
        if (zBooleanValue) {
            i(cardNumber);
        } else if (listA2.isEmpty() || k(listA2)) {
            i(cardNumber);
        } else {
            l(listA2);
        }
    }

    public final /* synthetic */ void i(f.Unvalidated cardNumber) {
        s.k(cardNumber, "cardNumber");
        if (j(cardNumber)) {
            c();
            this.accountRanges = v.m();
            this.accountRangeRepositoryJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C1463c(cardNumber, this, null), 3, null);
        }
    }

    public final void l(List<AccountRange> accountRanges) {
        s.k(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.accountRangeResultListener.a(accountRanges);
    }
}
