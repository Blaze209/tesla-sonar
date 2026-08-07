package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.x;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\t\u0010\n\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "Lio/reactivex/rxjava3/core/u;", "rxSingle", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/u;", "scope", "rxSingleInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lio/reactivex/rxjava3/core/u;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxSingleKt {
    public static final <T> u<T> rxSingle(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        if (coroutineContext.get(Job.INSTANCE) == null) {
            return rxSingleInternal(GlobalScope.INSTANCE, coroutineContext, pVar);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ u rxSingle$default(CoroutineContext coroutineContext, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxSingle(coroutineContext, pVar);
    }

    private static final <T> u<T> rxSingleInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        return u.d(new x() { // from class: kotlinx.coroutines.rx3.m
            @Override // io.reactivex.rxjava3.core.x
            public final void a(v vVar) {
                RxSingleKt.rxSingleInternal$lambda$1(coroutineScope, coroutineContext, pVar, vVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxSingleInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, p pVar, v vVar) {
        RxSingleCoroutine rxSingleCoroutine = new RxSingleCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), vVar);
        vVar.b(new RxCancellable(rxSingleCoroutine));
        rxSingleCoroutine.start(CoroutineStart.DEFAULT, rxSingleCoroutine, pVar);
    }
}
