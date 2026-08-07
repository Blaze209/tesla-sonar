package z50;

import com.stripe.android.core.exception.StripeException;
import jn0.h0;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a`\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00020\u0006*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"T", "Lz50/o;", "options", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "retryCondition", "Lkotlin/Function1;", "block", "b", "(Lz50/o;Lwn0/p;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/Throwable;)Z", "shouldRetry", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.utils.ErrorsKt$retryOnException$2", f = "Errors.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3}, l = {23, 30, 38, 35}, m = "invokeSuspend", n = {"$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "exception"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class a<T> extends SuspendLambda implements wn0.p<ProducerScope<? super T>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f126988o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f126989p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f126990q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ PollTimingOptions f126991r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super T>, Object> f126992s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ wn0.p<Throwable, Continuation<? super Boolean>, Object> f126993t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(PollTimingOptions pollTimingOptions, wn0.l<? super Continuation<? super T>, ? extends Object> lVar, wn0.p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f126991r = pollTimingOptions;
            this.f126992s = lVar;
            this.f126993t = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f126991r, this.f126992s, this.f126993t, continuation);
            aVar.f126990q = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x0097  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[Catch: all -> 0x0046, PHI: r1 r6 r11
          0x00a9: PHI (r1v7 kotlin.jvm.internal.l0) = (r1v8 kotlin.jvm.internal.l0), (r1v16 kotlin.jvm.internal.l0) binds: [B:31:0x00a6, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
          0x00a9: PHI (r6v7 kotlinx.coroutines.channels.ProducerScope) = (r6v8 kotlinx.coroutines.channels.ProducerScope), (r6v24 kotlinx.coroutines.channels.ProducerScope) binds: [B:31:0x00a6, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
          0x00a9: PHI (r11v12 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x00a6, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:30:0x009a, B:33:0x00a9, B:13:0x0042), top: B:58:0x0042 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:45:0x00da  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:56:0x0103  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e9 -> B:49:0x00ea). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z50.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super h0> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final boolean a(Throwable th2) {
        s.k(th2, "<this>");
        StripeException stripeException = th2 instanceof StripeException ? (StripeException) th2 : null;
        Integer numValueOf = stripeException != null ? Integer.valueOf(stripeException.getStatusCode()) : null;
        return numValueOf != null && numValueOf.intValue() == 202;
    }

    public static final <T> Object b(PollTimingOptions pollTimingOptions, wn0.p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar, wn0.l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        return FlowKt.first(FlowKt.channelFlow(new a(pollTimingOptions, lVar, pVar, null)), continuation);
    }
}
