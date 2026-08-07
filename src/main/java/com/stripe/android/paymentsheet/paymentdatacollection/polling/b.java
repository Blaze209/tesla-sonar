package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.StripeIntent;
import d80.PollingUiState;
import d80.e;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u000223B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020(0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;", "args", "Ll80/c;", "poller", "Ld80/h;", "timeProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;Ll80/c;Ld80/h;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/s0;)V", "Ljn0/h0;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lio0/b;", "l", "()J", "timeLimit", "p", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "Ld80/e;", "pollingState", "v", "(Ld80/e;)V", "s", "()V", "u", "n", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;", "Ll80/c;", "Ld80/h;", "Lkotlinx/coroutines/CoroutineDispatcher;", "w", "Landroidx/lifecycle/s0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ld80/f;", "x", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "y", "Lkotlinx/coroutines/flow/StateFlow;", "m", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "e", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Args args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l80.c poller;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final d80.h timeProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<PollingUiState> _uiState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<PollingUiState> uiState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$1", f = "PollingViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53451n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f53453p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f53453p = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f53453p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53451n;
            if (i11 == 0) {
                t.b(obj);
                b bVar = b.this;
                long j11 = this.f53453p;
                this.f53451n = 1;
                if (bVar.p(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$2", f = "PollingViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    static final class C1042b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53454n;

        C1042b(Continuation<? super C1042b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1042b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53454n;
            if (i11 == 0) {
                t.b(obj);
                b bVar = b.this;
                this.f53454n = 1;
                if (bVar.q(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1042b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$3", f = "PollingViewModel.kt", i = {}, l = {107, 108}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53456n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f53457o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f53458p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f53457o = j11;
            this.f53458p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f53457o, this.f53458p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r7.o(r6) == r0) goto L15;
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
                int r1 = r6.f53456n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L37
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jn0.t.b(r7)
                goto L2c
            L1e:
                jn0.t.b(r7)
                long r4 = r6.f53457o
                r6.f53456n = r3
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r4, r6)
                if (r7 != r0) goto L2c
                goto L36
            L2c:
                com.stripe.android.paymentsheet.paymentdatacollection.polling.b r7 = r6.f53458p
                r6.f53456n = r2
                java.lang.Object r7 = com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g(r7, r6)
                if (r7 != r0) goto L37
            L36:
                return r0
            L37:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$4", f = "PollingViewModel.kt", i = {0}, l = {112}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53459n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f53460o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = b.this.new d(continuation);
            dVar.f53460o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53459n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f53460o;
                long initialDelay = b.this.args.getInitialDelay();
                this.f53460o = coroutineScope2;
                this.f53459n = 1;
                if (DelayKt.m506delayVtjQ1oo(initialDelay, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f53460o;
                t.b(obj);
            }
            b.this.poller.c(coroutineScope);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;", "", "", "clientSecret", "Lio0/b;", "timeLimit", "initialDelay", "", "maxAttempts", "ctaText", "<init>", "(Ljava/lang/String;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "e", "()J", "c", DateTokenConverter.CONVERTER_KEY, "I", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeLimit;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long initialDelay;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxAttempts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int ctaText;

        public /* synthetic */ Args(String str, long j11, long j12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j11, j12, i11, i12);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getInitialDelay() {
            return this.initialDelay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getTimeLimit() {
            return this.timeLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return s.f(this.clientSecret, args.clientSecret) && io0.b.k(this.timeLimit, args.timeLimit) && io0.b.k(this.initialDelay, args.initialDelay) && this.maxAttempts == args.maxAttempts && this.ctaText == args.ctaText;
        }

        public int hashCode() {
            return (((((((this.clientSecret.hashCode() * 31) + io0.b.x(this.timeLimit)) * 31) + io0.b.x(this.initialDelay)) * 31) + Integer.hashCode(this.maxAttempts)) * 31) + Integer.hashCode(this.ctaText);
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", timeLimit=" + io0.b.K(this.timeLimit) + ", initialDelay=" + io0.b.K(this.initialDelay) + ", maxAttempts=" + this.maxAttempts + ", ctaText=" + this.ctaText + ")";
        }

        private Args(String clientSecret, long j11, long j12, int i11, int i12) {
            s.k(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.timeLimit = j11;
            this.initialDelay = j12;
            this.maxAttempts = i11;
            this.ctaText = i12;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$f;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;", "argsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<Args> argsSupplier;

        public f(wn0.a<Args> argsSupplier) {
            s.k(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            Args argsInvoke = this.argsSupplier.invoke();
            b bVarA = e80.a.a().a(z30.b.a(extras)).b(new l80.c.Config(argsInvoke.getClientSecret(), argsInvoke.getMaxAttempts())).c(Dispatchers.getIO()).build().a().a(argsInvoke).b(v0.a(extras)).build().a();
            s.i(bVarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return bVarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel", f = "PollingViewModel.kt", i = {0}, l = {119, 120}, m = "handleTimeLimitReached", n = {"this"}, s = {"L$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53468n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f53469o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f53471q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53469o = obj;
            this.f53471q |= Integer.MIN_VALUE;
            return b.this.o(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio0/b;", "duration", "Ljn0/h0;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class h<T> implements FlowCollector {
        h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(long j11, Continuation<? super h0> continuation) {
            MutableStateFlow mutableStateFlow = b.this._uiState;
            while (true) {
                Object value = mutableStateFlow.getValue();
                long j12 = j11;
                if (mutableStateFlow.compareAndSet(value, PollingUiState.b((PollingUiState) value, j12, 0, null, 6, null))) {
                    return h0.f84049a;
                }
                j11 = j12;
            }
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((io0.b) obj).getRawValue(), continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements Flow<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f53473a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f53474a;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2", f = "PollingViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C1043a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f53475n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f53476o;

                public C1043a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f53475n = obj;
                    this.f53476o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f53474a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C1043a c1043a;
                e eVarE;
                if (continuation instanceof C1043a) {
                    c1043a = (C1043a) continuation;
                    int i11 = c1043a.f53476o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1043a.f53476o = i11 - Integer.MIN_VALUE;
                    } else {
                        c1043a = new C1043a(continuation);
                    }
                } else {
                    c1043a = new C1043a(continuation);
                }
                Object obj2 = c1043a.f53475n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c1043a.f53476o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f53474a;
                    StripeIntent.Status status = (StripeIntent.Status) obj;
                    if (status == null || (eVarE = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.e(status)) == null) {
                        eVarE = e.Active;
                    }
                    c1043a.f53476o = 1;
                    if (flowCollector.emit(eVarE, c1043a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public i(Flow flow) {
            this.f53473a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super e> flowCollector, Continuation continuation) {
            Object objCollect = this.f53473a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld80/e;", "pollingState", "Ljn0/h0;", "<anonymous>", "(Ld80/e;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$3", f = "PollingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<e, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53478n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f53479o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, Continuation<? super h0> continuation) {
            return ((j) create(eVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = b.this.new j(continuation);
            jVar.f53479o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f53478n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (((e) this.f53479o) == e.Failed) {
                b.this.poller.b();
            }
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class k implements FlowCollector, p013kotlin.jvm.internal.m {
        k() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(e eVar, Continuation<? super h0> continuation) {
            Object objR = b.r(b.this, eVar, continuation);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : h0.f84049a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.a(2, b.this, b.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel", f = "PollingViewModel.kt", i = {0}, l = {124}, m = "performOneOffPoll", n = {"this"}, s = {"L$0"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53482n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f53483o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f53485q;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53483o = obj;
            this.f53485q |= Integer.MIN_VALUE;
            return b.this.t(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$resumePolling$1", f = "PollingViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53486n;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new m(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53486n;
            if (i11 == 0) {
                t.b(obj);
                long initialDelay = b.this.args.getInitialDelay();
                this.f53486n = 1;
                if (DelayKt.m506delayVtjQ1oo(initialDelay, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            b.this.poller.c(d1.a(b.this));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(Args args, l80.c poller, d80.h timeProvider, CoroutineDispatcher dispatcher, s0 savedStateHandle) {
        s.k(args, "args");
        s.k(poller, "poller");
        s.k(timeProvider, "timeProvider");
        s.k(dispatcher, "dispatcher");
        s.k(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.poller = poller;
        this.timeProvider = timeProvider;
        this.dispatcher = dispatcher;
        this.savedStateHandle = savedStateHandle;
        MutableStateFlow<PollingUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new PollingUiState(args.getTimeLimit(), args.getCtaText(), null, 4, null));
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
        long jL = l();
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), dispatcher, null, new a(jL, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), dispatcher, null, new C1042b(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), dispatcher, null, new c(jL, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), dispatcher, null, new d(null), 2, null);
    }

    private final long l() {
        Long l11 = (Long) this.savedStateHandle.f("KEY_CURRENT_POLLING_START_TIME");
        if (l11 == null) {
            this.savedStateHandle.n("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.timeProvider.a()));
        }
        return l11 != null ? ((io0.b) mn0.a.i(io0.b.f(io0.d.t((l11.longValue() + io0.b.p(this.args.getTimeLimit())) - this.timeProvider.a(), io0.e.MILLISECONDS)), io0.b.f(io0.b.INSTANCE.c()))).getRawValue() : this.args.getTimeLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2.t(r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g) r0
            int r1 = r0.f53471q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53471q = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53469o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53471q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f53468n
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r2 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r2
            jn0.t.b(r8)
            goto L59
        L3c:
            jn0.t.b(r8)
            l80.c r8 = r7.poller
            r8.b()
            io0.b$a r8 = io0.b.INSTANCE
            r8 = 3
            io0.e r2 = io0.e.SECONDS
            long r5 = io0.d.s(r8, r2)
            r0.f53468n = r7
            r0.f53471q = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r5, r0)
            if (r8 != r1) goto L58
            goto L64
        L58:
            r2 = r7
        L59:
            r8 = 0
            r0.f53468n = r8
            r0.f53471q = r3
            java.lang.Object r8 = r2.t(r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(long j11, Continuation<? super h0> continuation) {
        Object objCollect = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.c(j11).collect(new h(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(Continuation<? super h0> continuation) {
        Object objCollect = FlowKt.onEach(new i(this.poller.getState()), new j(null)).collect(new k(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object r(b bVar, e eVar, Continuation continuation) {
        bVar.v(eVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(Continuation<? super h0> continuation) {
        l lVar;
        b bVar;
        PollingUiState value;
        PollingUiState value2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f53485q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f53485q = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objA = lVar.f53483o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = lVar.f53485q;
        if (i12 == 0) {
            t.b(objA);
            l80.c cVar = this.poller;
            lVar.f53482n = this;
            lVar.f53485q = 1;
            objA = cVar.a(lVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) lVar.f53482n;
            t.b(objA);
        }
        if (((StripeIntent.Status) objA) == StripeIntent.Status.Succeeded) {
            MutableStateFlow<PollingUiState> mutableStateFlow = bVar._uiState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, PollingUiState.b(value2, 0L, 0, e.Success, 3, null)));
        } else {
            MutableStateFlow<PollingUiState> mutableStateFlow2 = bVar._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, PollingUiState.b(value, 0L, 0, e.Failed, 3, null)));
        }
        return h0.f84049a;
    }

    private final void v(e pollingState) {
        MutableStateFlow<PollingUiState> mutableStateFlow = this._uiState;
        while (true) {
            PollingUiState value = mutableStateFlow.getValue();
            e eVar = pollingState;
            if (mutableStateFlow.compareAndSet(value, PollingUiState.b(value, 0L, 0, eVar, 3, null))) {
                return;
            } else {
                pollingState = eVar;
            }
        }
    }

    public final StateFlow<PollingUiState> m() {
        return this.uiState;
    }

    public final void n() {
        PollingUiState value;
        MutableStateFlow<PollingUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PollingUiState.b(value, 0L, 0, e.Canceled, 3, null)));
        this.poller.b();
    }

    public final void s() {
        this.poller.b();
    }

    public final void u() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.dispatcher, null, new m(null), 2, null);
    }
}
