package kotlinx.coroutines.rx3;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends p implements wn0.l<Continuation<? super h0>, Object>, SuspendFunction {
    final /* synthetic */ CoroutineContext $ctx;
    final /* synthetic */ Runnable $decoratedBlock;
    final /* synthetic */ am0.b $disposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxSchedulerKt$scheduleTask$toSchedule$1(am0.b bVar, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, s.a.class, "task", "scheduleTask$task(Lio/reactivex/rxjava3/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$disposable = bVar;
        this.$ctx = coroutineContext;
        this.$decoratedBlock = runnable;
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super h0> continuation) {
        return RxSchedulerKt.scheduleTask$task(this.$disposable, this.$ctx, this.$decoratedBlock, continuation);
    }
}
