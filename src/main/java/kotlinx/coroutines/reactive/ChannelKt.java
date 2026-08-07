package kotlinx.coroutines.reactive;

import jn0.e;
import jn0.h0;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"T", "Lnr0/a;", "Lkotlin/Function1;", "Ljn0/h0;", "action", "collect", "(Lnr0/a;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "request", "Lkotlinx/coroutines/channels/ReceiveChannel;", "toChannel", "(Lnr0/a;I)Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "kotlinx-coroutines-reactive"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ChannelKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.ChannelKt$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.ChannelKt", f = "Channel.kt", i = {0, 0}, l = {112}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
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
            return ChannelKt.collect(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:26:0x0066, B:28:0x006e, B:31:0x007b), top: B:44:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object collect(nr0.a<T> r6, wn0.l<? super T, jn0.h0> r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.reactive.ChannelKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = (kotlinx.coroutines.reactive.ChannelKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = new kotlinx.coroutines.reactive.ChannelKt$collect$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            wn0.l r2 = (wn0.l) r2
            jn0.t.b(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L66
        L3a:
            r6 = move-exception
            goto L90
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            jn0.t.b(r8)
            r8 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = toChannel$default(r6, r8, r3, r4)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8c
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L89
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L89
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L89
            r0.label = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L78
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L78
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L78
            r8 = r0
            r0 = r2
            goto L53
        L78:
            r6 = move-exception
            r7 = r0
            goto L90
        L7b:
            jn0.h0 r6 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L78
            p013kotlin.jvm.internal.q.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r4)
            p013kotlin.jvm.internal.q.a(r3)
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L89:
            r6 = move-exception
            r7 = r8
            goto L90
        L8c:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            p013kotlin.jvm.internal.q.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            p013kotlin.jvm.internal.q.a(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ChannelKt.collect(nr0.a, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(nr0.a<T> aVar, l<? super T, h0> lVar, Continuation<? super h0> continuation) {
        ReceiveChannel channel$default = toChannel$default(aVar, 0, 1, null);
        try {
            ChannelIterator it = channel$default.iterator();
            while (true) {
                q.c(3);
                q.c(0);
                Object objHasNext = it.hasNext(null);
                q.c(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    h0 h0Var = h0.f84049a;
                    q.b(1);
                    ChannelsKt.cancelConsumed(channel$default, null);
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
                ChannelsKt.cancelConsumed(channel$default, th2);
                q.a(1);
                throw th3;
            }
        }
    }

    @e
    public static final /* synthetic */ ReceiveChannel openSubscription(nr0.a aVar, int i11) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i11);
        aVar.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel openSubscription$default(nr0.a aVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return openSubscription(aVar, i11);
    }

    public static final <T> ReceiveChannel<T> toChannel(nr0.a<T> aVar, int i11) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i11);
        aVar.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel toChannel$default(nr0.a aVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return toChannel(aVar, i11);
    }
}
