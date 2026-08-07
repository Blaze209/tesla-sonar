package kotlinx.coroutines.rx3;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends p implements wn0.p<Throwable, CoroutineContext, h0> {
    public static final RxFlowableKt$RX_HANDLER$1 INSTANCE = new RxFlowableKt$RX_HANDLER$1();

    RxFlowableKt$RX_HANDLER$1() {
        super(2, RxCancellableKt.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
    }

    @Override // wn0.p
    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2, CoroutineContext coroutineContext) {
        invoke2(th2, coroutineContext);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2, CoroutineContext coroutineContext) {
        RxCancellableKt.handleUndeliverableException(th2, coroutineContext);
    }
}
