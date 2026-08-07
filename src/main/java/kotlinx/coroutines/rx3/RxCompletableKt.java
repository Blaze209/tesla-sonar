package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lio/reactivex/rxjava3/core/b;", "rxCompletable", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/b;", "scope", "rxCompletableInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/b;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxCompletableKt {
    public static final io.reactivex.rxjava3.core.b rxCompletable(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return rxCompletableInternal(GlobalScope.INSTANCE, coroutineContext, pVar);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.b rxCompletable$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxCompletable(coroutineContext, pVar);
    }

    private static final io.reactivex.rxjava3.core.b rxCompletableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return io.reactivex.rxjava3.core.b.e(new io.reactivex.rxjava3.core.e() { // from class: kotlinx.coroutines.rx3.f
            @Override // io.reactivex.rxjava3.core.e
            public final void a(io.reactivex.rxjava3.core.c cVar) {
                RxCompletableKt.rxCompletableInternal$lambda$1(coroutineScope, coroutineContext, pVar, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxCompletableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, io.reactivex.rxjava3.core.c cVar) {
        RxCompletableCoroutine rxCompletableCoroutine = new RxCompletableCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), cVar);
        cVar.b(new RxCancellable(rxCompletableCoroutine));
        rxCompletableCoroutine.start(CoroutineStart.DEFAULT, rxCompletableCoroutine, pVar);
    }
}
