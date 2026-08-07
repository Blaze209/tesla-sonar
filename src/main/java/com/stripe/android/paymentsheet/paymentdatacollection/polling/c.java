package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import a70.Unvalidated;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.StripeIntent;
import d80.e;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Ld80/e;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "args", "La70/c;", DateTokenConverter.CONVERTER_KEY, "(Ld80/e;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;)La70/c;", "Lio0/b;", "duration", "Lkotlinx/coroutines/flow/Flow;", "c", "(J)Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/model/StripeIntent$Status;", "e", "(Lcom/stripe/android/model/StripeIntent$Status;)Ld80/e;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53489b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53488a = iArr;
            int[] iArr2 = new int[StripeIntent.Status.values().length];
            try {
                iArr2[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StripeIntent.Status.Succeeded.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StripeIntent.Status.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StripeIntent.Status.Processing.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresConfirmation.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f53489b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lio0/b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModelKt$countdownFlow$1", f = "PollingViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {"$this$flow", "remainingDuration", "$this$flow", "remainingDuration", "$this$flow", "remainingDuration"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class b extends SuspendLambda implements p<FlowCollector<? super io0.b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f53490n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f53491o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f53492p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f53493q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f53493q = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f53493q, continuation);
            bVar.f53492p = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0049 A[PHI: r1 r5
          0x0049: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = 
          (r1v2 kotlinx.coroutines.flow.FlowCollector)
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v6 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:13:0x0046, B:21:0x0082, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0049: PHI (r5v1 long) = (r5v0 long), (r5v3 long), (r5v4 long) binds: [B:13:0x0046, B:21:0x0082, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0055  */
        /* JADX WARN: Code duplicated, block: B:20:0x0068 A[PHI: r1 r5
          0x0068: PHI (r1v4 kotlinx.coroutines.flow.FlowCollector) = (r1v3 kotlinx.coroutines.flow.FlowCollector), (r1v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:18:0x0065, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:18:0x0065, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0082 -> B:15:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f53491o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                long r5 = r9.f53490n
                java.lang.Object r1 = r9.f53492p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r10)
                goto L68
            L24:
                long r5 = r9.f53490n
                java.lang.Object r1 = r9.f53492p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r10)
                goto L49
            L2e:
                jn0.t.b(r10)
                java.lang.Object r10 = r9.f53492p
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                long r5 = r9.f53493q
                io0.b r10 = io0.b.f(r5)
                r9.f53492p = r1
                r9.f53490n = r5
                r9.f53491o = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                goto L84
            L49:
                io0.b$a r10 = io0.b.INSTANCE
                long r7 = r10.c()
                int r10 = io0.b.h(r5, r7)
                if (r10 <= 0) goto L85
                io0.e r10 = io0.e.SECONDS
                long r7 = io0.d.s(r4, r10)
                r9.f53492p = r1
                r9.f53490n = r5
                r9.f53491o = r3
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r7, r9)
                if (r10 != r0) goto L68
                goto L84
            L68:
                io0.b$a r10 = io0.b.INSTANCE
                io0.e r10 = io0.e.SECONDS
                long r7 = io0.d.s(r4, r10)
                long r5 = io0.b.E(r5, r7)
                io0.b r10 = io0.b.f(r5)
                r9.f53492p = r1
                r9.f53490n = r5
                r9.f53491o = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
            L84:
                return r0
            L85:
                jn0.h0 r10 = jn0.h0.f84049a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super io0.b> flowCollector, Continuation<? super h0> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<io0.b> c(long j11) {
        return FlowKt.flow(new b(j11, null));
    }

    public static final Unvalidated d(e eVar, PollingContract.Args args) {
        s.k(eVar, "<this>");
        s.k(args, "args");
        int i11 = a.f53488a[eVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return null;
        }
        if (i11 == 3) {
            return new Unvalidated(args.getClientSecret(), 1, null, false, null, null, null, 124, null);
        }
        if (i11 == 4) {
            return new Unvalidated(args.getClientSecret(), 3, null, false, null, null, null, 116, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(StripeIntent.Status status) {
        switch (a.f53489b[status.ordinal()]) {
            case 1:
                return e.Active;
            case 2:
                return e.Success;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return e.Failed;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
