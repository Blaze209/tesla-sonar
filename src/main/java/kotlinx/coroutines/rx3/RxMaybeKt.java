package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aN\u0010\t\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aV\u0010\f\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000e"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "Lio/reactivex/rxjava3/core/j;", "rxMaybe", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/j;", "scope", "rxMaybeInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/j;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxMaybeKt {
    public static final <T> io.reactivex.rxjava3.core.j<T> rxMaybe(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return rxMaybeInternal(GlobalScope.INSTANCE, coroutineContext, pVar);
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.j rxMaybe$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxMaybe(coroutineContext, pVar);
    }

    private static final <T> io.reactivex.rxjava3.core.j<T> rxMaybeInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        return io.reactivex.rxjava3.core.j.b(new io.reactivex.rxjava3.core.m() { // from class: kotlinx.coroutines.rx3.i
            @Override // io.reactivex.rxjava3.core.m
            public final void a(io.reactivex.rxjava3.core.k kVar) {
                RxMaybeKt.rxMaybeInternal$lambda$1(coroutineScope, coroutineContext, pVar, kVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxMaybeInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, io.reactivex.rxjava3.core.k kVar) {
        RxMaybeCoroutine rxMaybeCoroutine = new RxMaybeCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), kVar);
        kVar.b(new RxCancellable(rxMaybeCoroutine));
        rxMaybeCoroutine.start(CoroutineStart.DEFAULT, rxMaybeCoroutine, pVar);
    }
}
