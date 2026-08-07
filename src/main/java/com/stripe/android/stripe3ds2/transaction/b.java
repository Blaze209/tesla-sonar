package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/b;", "", "Lcom/stripe/android/stripe3ds2/transaction/a;", "action", "Lcom/stripe/android/stripe3ds2/transaction/d;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {
    Object a(com.stripe.android.stripe3ds2.transaction.a aVar, Continuation<? super d> continuation);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/b$a;", "Lcom/stripe/android/stripe3ds2/transaction/b;", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/c;", "challengeRequestExecutor", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/c;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/transaction/c$b;", "creqExecutorFactory", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/c$b;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/transaction/d;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/stripe3ds2/transactions/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/a;", "action", "a", "(Lcom/stripe/android/stripe3ds2/transaction/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transactions/a;", "b", "Lr80/c;", "c", "Lcom/stripe/android/stripe3ds2/transaction/c;", "Lkotlin/coroutines/CoroutineContext;", "e", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f53965f = TimeUnit.SECONDS.toMillis(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ChallengeRequestData creqData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final r80.c errorReporter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.stripe3ds2.transaction.c challengeRequestExecutor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext workContext;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.b$a$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", f = "ChallengeActionHandler.kt", i = {0, 0, 1, 1}, l = {78, 81}, m = "executeChallengeRequest", n = {"this", "creqData", "this", "creqData"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class C1075b extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f53970n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f53971o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f53972p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f53974r;

            C1075b(Continuation<? super C1075b> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f53972p = obj;
                this.f53974r |= Integer.MIN_VALUE;
                return a.this.d(null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/stripe3ds2/transaction/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/stripe3ds2/transaction/d;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", f = "ChallengeActionHandler.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super d>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f53975n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f53977p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(com.stripe.android.stripe3ds2.transaction.a aVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f53977p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return a.this.new c(this.f53977p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ChallengeRequestData challengeRequestDataB;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f53975n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                ChallengeRequestData challengeRequestData = new ChallengeRequestData(a.this.creqData.getMessageVersion(), a.this.creqData.getThreeDsServerTransId(), a.this.creqData.getAcsTransId(), a.this.creqData.getSdkTransId(), null, null, null, a.this.creqData.e(), null, null, 880, null);
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f53977p;
                if (aVar instanceof com.stripe.android.stripe3ds2.transaction.a.NativeForm) {
                    challengeRequestDataB = ChallengeRequestData.b(challengeRequestData, null, null, null, null, ((com.stripe.android.stripe3ds2.transaction.a.NativeForm) aVar).getUserEntry(), null, null, null, null, null, 1007, null);
                } else if (aVar instanceof com.stripe.android.stripe3ds2.transaction.a.HtmlForm) {
                    challengeRequestDataB = ChallengeRequestData.b(challengeRequestData, null, null, null, null, null, null, ((com.stripe.android.stripe3ds2.transaction.a.HtmlForm) aVar).getUserEntry(), null, null, null, 959, null);
                } else if (aVar instanceof com.stripe.android.stripe3ds2.transaction.a.d) {
                    challengeRequestDataB = ChallengeRequestData.b(challengeRequestData, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), null, 767, null);
                } else if (aVar instanceof com.stripe.android.stripe3ds2.transaction.a.e) {
                    challengeRequestDataB = ChallengeRequestData.b(challengeRequestData, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), 511, null);
                } else {
                    if (!(aVar instanceof com.stripe.android.stripe3ds2.transaction.a.C1068a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    challengeRequestDataB = ChallengeRequestData.b(challengeRequestData, null, null, null, null, null, ChallengeRequestData.EnumC1080a.UserSelected, null, null, null, null, 991, null);
                }
                a aVar2 = a.this;
                this.f53975n = 1;
                Object objD = aVar2.d(challengeRequestDataB, this);
                return objD == coroutine_suspended ? coroutine_suspended : objD;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super d> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public a(ChallengeRequestData creqData, r80.c errorReporter, com.stripe.android.stripe3ds2.transaction.c challengeRequestExecutor, CoroutineContext workContext) {
            s.k(creqData, "creqData");
            s.k(errorReporter, "errorReporter");
            s.k(challengeRequestExecutor, "challengeRequestExecutor");
            s.k(workContext, "workContext");
            this.creqData = creqData;
            this.errorReporter = errorReporter;
            this.challengeRequestExecutor = challengeRequestExecutor;
            this.workContext = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x0088, please report this as an issue */
        public final Object d(ChallengeRequestData challengeRequestData, Continuation<? super d> continuation) {
            C1075b c1075b;
            a aVar;
            a aVar2;
            Object objB;
            Throwable thE;
            Throwable thE2;
            if (continuation instanceof C1075b) {
                c1075b = (C1075b) continuation;
                int i11 = c1075b.f53974r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c1075b.f53974r = i11 - Integer.MIN_VALUE;
                } else {
                    c1075b = new C1075b(continuation);
                }
            } else {
                c1075b = new C1075b(continuation);
            }
            Object objA = c1075b.f53972p;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c1075b.f53974r;
            try {
                if (i12 == 0) {
                    t.b(objA);
                    long j11 = f53965f;
                    c1075b.f53970n = this;
                    c1075b.f53971o = challengeRequestData;
                    c1075b.f53974r = 1;
                    if (DelayKt.delay(j11, c1075b) != coroutine_suspended) {
                        aVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    challengeRequestData = (ChallengeRequestData) c1075b.f53971o;
                    aVar2 = (a) c1075b.f53970n;
                    try {
                        t.b(objA);
                        objB = jn0.s.b((d) objA);
                    } catch (Throwable th2) {
                        th = th2;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        objB = jn0.s.b(t.a(th));
                    }
                    thE = jn0.s.e(objB);
                    if (thE != null) {
                        aVar2.errorReporter.Y0(new RuntimeException(p013kotlin.text.t.n("\n                            Failed to execute challenge request.\n\n                            CReq = " + challengeRequestData.i() + "\n                        "), thE));
                    }
                    thE2 = jn0.s.e(objB);
                    if (thE2 == null) {
                        return objB;
                    }
                    return new d.RuntimeError(thE2);
                }
                challengeRequestData = (ChallengeRequestData) c1075b.f53971o;
                aVar = (a) c1075b.f53970n;
                t.b(objA);
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                com.stripe.android.stripe3ds2.transaction.c cVar = aVar.challengeRequestExecutor;
                c1075b.f53970n = aVar;
                c1075b.f53971o = challengeRequestData;
                c1075b.f53974r = 2;
                objA = cVar.a(challengeRequestData, c1075b);
                if (objA != coroutine_suspended) {
                    aVar2 = aVar;
                    objB = jn0.s.b((d) objA);
                    thE = jn0.s.e(objB);
                    if (thE != null) {
                        aVar2.errorReporter.Y0(new RuntimeException(p013kotlin.text.t.n("\n                            Failed to execute challenge request.\n\n                            CReq = " + challengeRequestData.i() + "\n                        "), thE));
                    }
                    thE2 = jn0.s.e(objB);
                    if (thE2 == null) {
                        return objB;
                    }
                    return new d.RuntimeError(thE2);
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
        }

        @Override // com.stripe.android.stripe3ds2.transaction.b
        public Object a(com.stripe.android.stripe3ds2.transaction.a aVar, Continuation<? super d> continuation) {
            return BuildersKt.withContext(this.workContext, new c(aVar, null), continuation);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(ChallengeRequestData creqData, r80.c errorReporter, com.stripe.android.stripe3ds2.transaction.c.b creqExecutorFactory, CoroutineContext workContext) {
            this(creqData, errorReporter, creqExecutorFactory.I2(errorReporter, workContext), workContext);
            s.k(creqData, "creqData");
            s.k(errorReporter, "errorReporter");
            s.k(creqExecutorFactory, "creqExecutorFactory");
            s.k(workContext, "workContext");
        }
    }
}
