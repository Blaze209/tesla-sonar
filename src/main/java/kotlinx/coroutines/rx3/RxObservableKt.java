package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.rxjava3.core.q;
import jn0.h0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001aS\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022*\b\u0001\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "block", "Lio/reactivex/rxjava3/core/o;", "rxObservable", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/o;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "rxObservableInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/o;", "", "OPEN", "I", "CLOSED", "SIGNALLED", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxObservableKt {
    private static final int CLOSED = -1;
    private static final int OPEN = 0;
    private static final int SIGNALLED = -2;

    public static final <T> io.reactivex.rxjava3.core.o<T> rxObservable(CoroutineContext coroutineContext, p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return rxObservableInternal(GlobalScope.INSTANCE, coroutineContext, pVar);
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.o rxObservable$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxObservable(coroutineContext, pVar);
    }

    private static final <T> io.reactivex.rxjava3.core.o<T> rxObservableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return io.reactivex.rxjava3.core.o.g(new q() { // from class: kotlinx.coroutines.rx3.j
            @Override // io.reactivex.rxjava3.core.q
            public final void a(io.reactivex.rxjava3.core.p pVar2) {
                RxObservableKt.rxObservableInternal$lambda$1(coroutineScope, coroutineContext, pVar, pVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxObservableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, io.reactivex.rxjava3.core.p pVar2) {
        RxObservableCoroutine rxObservableCoroutine = new RxObservableCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), pVar2);
        pVar2.b(new RxCancellable(rxObservableCoroutine));
        rxObservableCoroutine.start(CoroutineStart.DEFAULT, rxObservableCoroutine, pVar);
    }
}
