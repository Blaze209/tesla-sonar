package uk0;

import kotlinx.coroutines.slf4j.MDCContext;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final Object a(Continuation<? super CoroutineContext> continuation) {
        MDCContext mDCContext = (MDCContext) continuation.getContext().get(MDCContext.INSTANCE);
        return mDCContext != null ? mDCContext : EmptyCoroutineContext.INSTANCE;
    }
}
