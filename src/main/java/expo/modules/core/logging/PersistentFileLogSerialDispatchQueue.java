package expo.modules.core.logging;

import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0003R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, d2 = {"Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljn0/h0;", "Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueueBlock;", "block", "add", "(Lwn0/a;)V", "stop", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "queueRunner", "Lkotlinx/coroutines/Job;", "getQueueRunner$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersistentFileLogSerialDispatchQueue {
    private final Channel<wn0.a<h0>> channel = ChannelKt.Channel$default(-2, null, null, 6, null);
    private final Job queueRunner = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new PersistentFileLogSerialDispatchQueue$queueRunner$1(this, null), 3, null);

    /* JADX INFO: renamed from: expo.modules.core.logging.PersistentFileLogSerialDispatchQueue$add$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.core.logging.PersistentFileLogSerialDispatchQueue$add$1", f = "PersistentFileLogSerialDispatchQueue.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(wn0.a<h0> aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PersistentFileLogSerialDispatchQueue.this.new AnonymousClass1(this.$block, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Channel channel = PersistentFileLogSerialDispatchQueue.this.channel;
                wn0.a<h0> aVar = this.$block;
                this.label = 1;
                if (channel.send(aVar, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private static /* synthetic */ void getQueueRunner$annotations() {
    }

    public final void add(wn0.a<h0> block) {
        s.k(block, "block");
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(block, null), 1, null);
    }

    public final void stop() {
        Job.DefaultImpls.cancel$default(this.queueRunner, (CancellationException) null, 1, (Object) null);
    }
}
