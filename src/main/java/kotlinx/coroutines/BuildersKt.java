package kotlinx.coroutines;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, pVar, continuation);
    }

    public static final Job launch(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> T runBlocking(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        return (T) BuildersKt__BuildersKt.runBlocking(coroutineContext, pVar);
    }

    public static final <T> Object withContext(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return BuildersKt__Builders_commonKt.withContext(coroutineContext, pVar, continuation);
    }
}
