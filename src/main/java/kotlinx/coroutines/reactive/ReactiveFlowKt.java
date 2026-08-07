package kotlinx.coroutines.reactive;

import ch.qos.logback.core.CoreConstants;
import ho0.l;
import java.util.ServiceLoader;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "Lnr0/a;", "Lkotlinx/coroutines/flow/Flow;", "asFlow", "(Lnr0/a;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "asPublisher", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lnr0/a;", "coroutineContext", "injectCoroutineContext", "(Lnr0/a;Lkotlin/coroutines/CoroutineContext;)Lnr0/a;", "", "Lkotlinx/coroutines/reactive/ContextInjector;", "contextInjectors", "[Lkotlinx/coroutines/reactive/ContextInjector;", "kotlinx-coroutines-reactive"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactiveFlowKt {
    private static final ContextInjector[] contextInjectors = (ContextInjector[]) l.c0(l.h(ServiceLoader.load(ContextInjector.class, ContextInjector.class.getClassLoader()).iterator())).toArray(new ContextInjector[0]);

    public static final <T> Flow<T> asFlow(nr0.a<T> aVar) {
        return new PublisherAsFlow(aVar, null, 0, null, 14, null);
    }

    public static final <T> nr0.a<T> asPublisher(Flow<? extends T> flow) {
        return asPublisher$default(flow, null, 1, null);
    }

    public static /* synthetic */ nr0.a asPublisher$default(Flow flow, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asPublisher(flow, coroutineContext);
    }

    public static final <T> nr0.a<T> injectCoroutineContext(nr0.a<T> aVar, CoroutineContext coroutineContext) {
        for (ContextInjector contextInjector : contextInjectors) {
            aVar = contextInjector.injectCoroutineContext(aVar, coroutineContext);
        }
        return aVar;
    }

    public static final <T> nr0.a<T> asPublisher(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return new FlowAsPublisher(flow, Dispatchers.getUnconfined().plus(coroutineContext));
    }
}
