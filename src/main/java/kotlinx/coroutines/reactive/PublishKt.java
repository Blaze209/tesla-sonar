package kotlinx.coroutines.reactive;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import jn0.e;
import jn0.h0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u001aO\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012*\b\u0001\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\n\u0010\u000b\u001ao\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00032(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012*\b\u0001\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0007¢\u0006\u0004\b\n\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lnr0/a;", "publish", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lnr0/a;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "exceptionOnCancelHandler", "publishInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;Lwn0/p;)Lnr0/a;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lnr0/a;", "", "CLOSED", "J", "SIGNALLED", "DEFAULT_HANDLER", "Lwn0/p;", "kotlinx-coroutines-reactive"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PublishKt {
    private static final long CLOSED = -1;
    private static final p<Throwable, CoroutineContext, h0> DEFAULT_HANDLER = new p() { // from class: kotlinx.coroutines.reactive.b
        @Override // wn0.p
        public final Object invoke(Object obj, Object obj2) {
            return PublishKt.DEFAULT_HANDLER$lambda$2((Throwable) obj, (CoroutineContext) obj2);
        }
    };
    private static final long SIGNALLED = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 DEFAULT_HANDLER$lambda$2(Throwable th2, CoroutineContext coroutineContext) {
        if (!(th2 instanceof CancellationException)) {
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th2);
        }
        return h0.f84049a;
    }

    public static final <T> nr0.a<T> publish(CoroutineContext coroutineContext, p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return publishInternal(GlobalScope.INSTANCE, coroutineContext, DEFAULT_HANDLER, pVar);
        }
        throw new IllegalArgumentException(("Publisher context cannot contain job in it.Its lifecycle should be managed via subscription. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ nr0.a publish$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return publish(coroutineContext, pVar);
    }

    @InternalCoroutinesApi
    public static final <T> nr0.a<T> publishInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final p<? super Throwable, ? super CoroutineContext, h0> pVar, final p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar2) {
        return new nr0.a() { // from class: kotlinx.coroutines.reactive.a
            @Override // nr0.a
            public final void subscribe(nr0.b bVar) {
                PublishKt.publishInternal$lambda$1(coroutineScope, coroutineContext, pVar, pVar2, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, p pVar2, nr0.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Subscriber cannot be null");
        }
        PublisherCoroutine publisherCoroutine = new PublisherCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), bVar, pVar);
        bVar.onSubscribe(publisherCoroutine);
        publisherCoroutine.start(CoroutineStart.DEFAULT, publisherCoroutine, pVar2);
    }

    public static /* synthetic */ nr0.a publish$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return publish(coroutineScope, coroutineContext, pVar);
    }

    @e
    public static final /* synthetic */ nr0.a publish(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar) {
        return publishInternal(coroutineScope, coroutineContext, DEFAULT_HANDLER, pVar);
    }
}
