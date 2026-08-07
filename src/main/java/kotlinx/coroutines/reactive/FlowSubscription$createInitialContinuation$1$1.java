package kotlinx.coroutines.reactive;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.jvm.internal.p;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class FlowSubscription$createInitialContinuation$1$1 extends p implements l<Continuation<? super h0>, Object>, SuspendFunction {
    FlowSubscription$createInitialContinuation$1$1(Object obj) {
        super(1, obj, FlowSubscription.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super h0> continuation) {
        return ((FlowSubscription) this.receiver).flowProcessing(continuation);
    }
}
