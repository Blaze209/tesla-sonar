package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MutableStateFlow f24892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final StateFlow f24893b;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Zj f24896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Zj zj2, Continuation continuation) {
            super(2, continuation);
            this.f24896c = zj2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ActorScope actorScope, Continuation continuation) {
            return ((a) create(actorScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f24896c, continuation);
            aVar.f24895b = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f24894a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.f24895b
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                jn0.t.b(r5)
                goto L36
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                jn0.t.b(r5)
                java.lang.Object r5 = r4.f24895b
                kotlinx.coroutines.channels.ActorScope r5 = (kotlinx.coroutines.channels.ActorScope) r5
                kotlinx.coroutines.channels.Channel r5 = r5.getChannel()
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r1 = r5
            L2b:
                r4.f24895b = r1
                r4.f24894a = r2
                java.lang.Object r5 = r1.hasNext(r4)
                if (r5 != r0) goto L36
                return r0
            L36:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L4d
                java.lang.Object r5 = r1.next()
                com.fourthline.orca.internal.vk r5 = (com.fourthline.orca.internal.InterfaceC3949vk) r5
                java.util.Objects.toString(r5)
                com.fourthline.orca.internal.Zj r3 = r4.f24896c
                r3.a(r5)
                goto L2b
            L4d:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.A5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC3949vk.p(null, 1, null));
        f24892a = MutableStateFlow;
        f24893b = MutableStateFlow;
    }

    public static final SendChannel a(CoroutineScope coroutineScope, Zj coordinator) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "<this>");
        p013kotlin.jvm.internal.s.k(coordinator, "coordinator");
        return ActorKt.actor$default(coroutineScope, null, Integer.MAX_VALUE, CoroutineStart.LAZY, null, new a(coordinator, null), 9, null);
    }
}
