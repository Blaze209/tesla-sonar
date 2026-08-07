package kotlinx.coroutines.reactive;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/reactive/FlowAsPublisher;", "", "T", "Lnr0/a;", "Lkotlinx/coroutines/flow/Flow;", AnalyticsContext.Flow, "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)V", "Lnr0/b;", "subscriber", "Ljn0/h0;", "subscribe", "(Lnr0/b;)V", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class FlowAsPublisher<T> implements nr0.a<T> {
    private final CoroutineContext context;
    private final Flow<T> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowAsPublisher(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        this.flow = flow;
        this.context = coroutineContext;
    }

    @Override // nr0.a
    public void subscribe(nr0.b<? super T> subscriber) {
        subscriber.getClass();
        subscriber.onSubscribe(new FlowSubscription(this.flow, subscriber, this.context));
    }
}
