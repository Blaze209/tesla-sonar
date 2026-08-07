package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.reactive.PublishKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001aS\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022*\b\u0001\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\n\u0010\u000b\"&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "block", "Lio/reactivex/rxjava3/core/h;", "rxFlowable", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/h;", "", "RX_HANDLER", "Lwn0/p;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxFlowableKt {
    private static final p<Throwable, CoroutineContext, h0> RX_HANDLER = RxFlowableKt$RX_HANDLER$1.INSTANCE;

    public static final <T> io.reactivex.rxjava3.core.h<T> rxFlowable(CoroutineContext coroutineContext, p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return io.reactivex.rxjava3.core.h.k(PublishKt.publishInternal(GlobalScope.INSTANCE, coroutineContext, RX_HANDLER, pVar));
        }
        throw new IllegalArgumentException(("Flowable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.h rxFlowable$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxFlowable(coroutineContext, pVar);
    }
}
