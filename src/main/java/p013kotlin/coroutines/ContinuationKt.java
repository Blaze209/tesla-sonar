package p013kotlin.coroutines;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import jn0.q;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u00030\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aW\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00162\u0006\u0010\u0017\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aQ\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00162\u0006\u0010\u0017\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001a?\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00030\fH\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u001b\u0010#\u001a\u00020\n8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "value", "Ljn0/h0;", "resume", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "", "exception", "resumeWithException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Ljn0/s;", "resumeWith", "Continuation", "(Lkotlin/coroutines/CoroutineContext;Lwn0/l;)Lkotlin/coroutines/Continuation;", "", "completion", "createCoroutine", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "receiver", "(Lwn0/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "startCoroutine", "(Lwn0/l;Lkotlin/coroutines/Continuation;)V", "(Lwn0/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "block", "suspendCoroutine", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "coroutineContext", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContinuationKt {
    private static final <T> Continuation<T> Continuation(final CoroutineContext context, final l<? super s<? extends T>, h0> resumeWith) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(resumeWith, "resumeWith");
        return new Continuation<T>() { // from class: kotlin.coroutines.ContinuationKt.Continuation.1
            @Override // p013kotlin.coroutines.Continuation
            /* JADX INFO: renamed from: getContext, reason: from getter */
            public CoroutineContext get$context() {
                return context;
            }

            @Override // p013kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                resumeWith.invoke(s.a(result));
            }
        };
    }

    public static final <T> Continuation<h0> createCoroutine(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> completion) {
        p013kotlin.jvm.internal.s.k(lVar, "<this>");
        p013kotlin.jvm.internal.s.k(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(lVar, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new q("Implemented as intrinsic");
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    private static final <T> void resume(Continuation<? super T> continuation, T t11) {
        p013kotlin.jvm.internal.s.k(continuation, "<this>");
        continuation.resumeWith(s.b(t11));
    }

    private static final <T> void resumeWithException(Continuation<? super T> continuation, Throwable exception) {
        p013kotlin.jvm.internal.s.k(continuation, "<this>");
        p013kotlin.jvm.internal.s.k(exception, "exception");
        s.Companion companion = s.INSTANCE;
        continuation.resumeWith(s.b(t.a(exception)));
    }

    public static final <T> void startCoroutine(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> completion) {
        p013kotlin.jvm.internal.s.k(lVar, "<this>");
        p013kotlin.jvm.internal.s.k(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(lVar, completion));
        s.Companion companion = s.INSTANCE;
        continuationIntercepted.resumeWith(s.b(h0.f84049a));
    }

    private static final <T> Object suspendCoroutine(l<? super Continuation<? super T>, h0> lVar, Continuation<? super T> continuation) throws Throwable {
        p013kotlin.jvm.internal.q.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        lVar.invoke(safeContinuation);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        p013kotlin.jvm.internal.q.c(1);
        return orThrow;
    }

    public static final <R, T> Continuation<h0> createCoroutine(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r11, Continuation<? super T> completion) {
        p013kotlin.jvm.internal.s.k(pVar, "<this>");
        p013kotlin.jvm.internal.s.k(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, r11, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <R, T> void startCoroutine(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r11, Continuation<? super T> completion) {
        p013kotlin.jvm.internal.s.k(pVar, "<this>");
        p013kotlin.jvm.internal.s.k(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, r11, completion));
        s.Companion companion = s.INSTANCE;
        continuationIntercepted.resumeWith(s.b(h0.f84049a));
    }
}
