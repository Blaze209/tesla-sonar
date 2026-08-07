package com.fourthline.orca.internal;

import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2874Gc implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Channel f25939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Flow f25940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25941d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Gc$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PD f25944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PD pd2, Continuation continuation) {
            super(2, continuation);
            this.f25944c = pd2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2874Gc.this.new a(this.f25944c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25942a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Channel channel = C2874Gc.this.f25939b;
                PD pd2 = this.f25944c;
                this.f25942a = 1;
                if (channel.send(pd2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    public C2874Gc(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25938a = coroutineScope;
        Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f25939b = channelChannel$default;
        this.f25940c = FlowKt.receiveAsFlow(channelChannel$default);
        this.f25941d = getClass().getSimpleName();
    }

    public final Flow b() {
        return this.f25940c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25938a.getCoroutineContext();
    }

    public void a(wn0.a builder) {
        p013kotlin.jvm.internal.s.k(builder, "builder");
        PD pd2 = (PD) builder.invoke();
        Objects.toString(pd2);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(pd2, null), 3, null);
    }
}
