package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.r;
import jn0.h0;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a9\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b9¨\u0006\r"}, d2 = {"T", "Lio/reactivex/rxjava3/core/n;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "(Lio/reactivex/rxjava3/core/n;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/reactivex/rxjava3/core/r;", "(Lio/reactivex/rxjava3/core/r;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/Function1;", "Ljn0/h0;", "action", "collect", "(Lio/reactivex/rxjava3/core/n;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/reactivex/rxjava3/core/r;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxChannelKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxChannelKt$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {92}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxChannelKt.collect((io.reactivex.rxjava3.core.n) null, (wn0.l) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxChannelKt$collect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {92}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxChannelKt.collect((r) null, (wn0.l) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:26:0x0064, B:28:0x006c, B:31:0x0079), top: B:44:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object collect(io.reactivex.rxjava3.core.n<T> r5, wn0.l<? super T, jn0.h0> r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.RxChannelKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.RxChannelKt$collect$1 r0 = (kotlinx.coroutines.rx3.RxChannelKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxChannelKt$collect$1 r0 = new kotlinx.coroutines.rx3.RxChannelKt$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            wn0.l r2 = (wn0.l) r2
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L39
            r4 = r0
            r0 = r6
            r6 = r2
        L37:
            r2 = r4
            goto L64
        L39:
            r5 = move-exception
            goto L8f
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            jn0.t.b(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = openSubscription(r5)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L8b
            r4 = r7
            r7 = r5
            r5 = r4
        L51:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L88
            r0.label = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L60
            return r1
        L60:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L37
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L76
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L79
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L76
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L76
            r7 = r0
            r0 = r2
            goto L51
        L76:
            r5 = move-exception
            r6 = r0
            goto L8f
        L79:
            jn0.h0 r5 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L76
            p013kotlin.jvm.internal.q.b(r3)
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            p013kotlin.jvm.internal.q.a(r3)
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        L88:
            r5 = move-exception
            r6 = r7
            goto L8f
        L8b:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L8f:
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            p013kotlin.jvm.internal.q.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            p013kotlin.jvm.internal.q.a(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxChannelKt.collect(io.reactivex.rxjava3.core.n, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(io.reactivex.rxjava3.core.n<T> nVar, wn0.l<? super T, h0> lVar, Continuation<? super h0> continuation) {
        ReceiveChannel receiveChannelOpenSubscription = openSubscription(nVar);
        try {
            ChannelIterator it = receiveChannelOpenSubscription.iterator();
            while (true) {
                q.c(3);
                q.c(0);
                Object objHasNext = it.hasNext(null);
                q.c(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    h0 h0Var = h0.f84049a;
                    q.b(1);
                    ChannelsKt.cancelConsumed(receiveChannelOpenSubscription, null);
                    q.a(1);
                    return h0.f84049a;
                }
                lVar.invoke((Object) it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q.b(1);
                ChannelsKt.cancelConsumed(receiveChannelOpenSubscription, th2);
                q.a(1);
                throw th3;
            }
        }
    }

    public static final <T> ReceiveChannel<T> openSubscription(io.reactivex.rxjava3.core.n<T> nVar) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        nVar.a(subscriptionChannel);
        return subscriptionChannel;
    }

    public static final <T> ReceiveChannel<T> openSubscription(r<T> rVar) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        rVar.a(subscriptionChannel);
        return subscriptionChannel;
    }

    private static final <T> Object collect$$forInline(r<T> rVar, wn0.l<? super T, h0> lVar, Continuation<? super h0> continuation) {
        ReceiveChannel receiveChannelOpenSubscription = openSubscription(rVar);
        try {
            ChannelIterator it = receiveChannelOpenSubscription.iterator();
            while (true) {
                q.c(3);
                q.c(0);
                Object objHasNext = it.hasNext(null);
                q.c(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    h0 h0Var = h0.f84049a;
                    q.b(1);
                    ChannelsKt.cancelConsumed(receiveChannelOpenSubscription, null);
                    q.a(1);
                    return h0.f84049a;
                }
                lVar.invoke((Object) it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q.b(1);
                ChannelsKt.cancelConsumed(receiveChannelOpenSubscription, th2);
                q.a(1);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:26:0x0064, B:28:0x006c, B:31:0x0079), top: B:44:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object collect(io.reactivex.rxjava3.core.r<T> r5, wn0.l<? super T, jn0.h0> r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.RxChannelKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.RxChannelKt$collect$2 r0 = (kotlinx.coroutines.rx3.RxChannelKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxChannelKt$collect$2 r0 = new kotlinx.coroutines.rx3.RxChannelKt$collect$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            wn0.l r2 = (wn0.l) r2
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L39
            r4 = r0
            r0 = r6
            r6 = r2
        L37:
            r2 = r4
            goto L64
        L39:
            r5 = move-exception
            goto L8f
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            jn0.t.b(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = openSubscription(r5)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L8b
            r4 = r7
            r7 = r5
            r5 = r4
        L51:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L88
            r0.label = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L60
            return r1
        L60:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L37
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L76
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L79
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L76
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L76
            r7 = r0
            r0 = r2
            goto L51
        L76:
            r5 = move-exception
            r6 = r0
            goto L8f
        L79:
            jn0.h0 r5 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L76
            p013kotlin.jvm.internal.q.b(r3)
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            p013kotlin.jvm.internal.q.a(r3)
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        L88:
            r5 = move-exception
            r6 = r7
            goto L8f
        L8b:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L8f:
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            p013kotlin.jvm.internal.q.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            p013kotlin.jvm.internal.q.a(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxChannelKt.collect(io.reactivex.rxjava3.core.r, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
