package kotlinx.coroutines.future;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.action.AwaitAction;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\n*\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u0011*\u00020\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a \u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "Ljava/util/concurrent/CompletableFuture;", "future", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lwn0/p;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Deferred;", "asCompletableFuture", "(Lkotlinx/coroutines/Deferred;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Job;", "Ljn0/h0;", "(Lkotlinx/coroutines/Job;)Ljava/util/concurrent/CompletableFuture;", "setupCancellation", "(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CompletableFuture;)V", "Ljava/util/concurrent/CompletionStage;", "asDeferred", "(Ljava/util/concurrent/CompletionStage;)Lkotlinx/coroutines/Deferred;", AwaitAction.ACTION_TYPE, "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FutureKt {
    public static final <T> CompletableFuture<T> asCompletableFuture(final Deferred<? extends T> deferred) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new l() { // from class: kotlinx.coroutines.future.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return FutureKt.asCompletableFuture$lambda$1(completableFuture, deferred, (Throwable) obj);
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 asCompletableFuture$lambda$1(CompletableFuture completableFuture, Deferred deferred, Throwable th2) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 asCompletableFuture$lambda$2(CompletableFuture completableFuture, Throwable th2) {
        if (th2 == null) {
            completableFuture.complete(h0.f84049a);
        } else {
            completableFuture.completeExceptionally(th2);
        }
        return h0.f84049a;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            final p pVar = new p() { // from class: kotlinx.coroutines.future.b
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return FutureKt.asDeferred$lambda$5(completableDeferredCompletableDeferred$default, obj, (Throwable) obj2);
                }
            };
            completionStage.handle(new BiFunction() { // from class: kotlinx.coroutines.future.c
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return pVar.invoke(obj, (Throwable) obj2);
                }
            });
            JobKt__JobKt.invokeOnCompletion$default(completableDeferredCompletableDeferred$default, false, new CancelFutureOnCompletion(completableFuture), 1, null);
            return completableDeferredCompletableDeferred$default;
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(completableFuture.get());
        } catch (Throwable th2) {
            th = th2;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default2.completeExceptionally(th);
            return completableDeferredCompletableDeferred$default2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asDeferred$lambda$5(CompletableDeferred completableDeferred, Object obj, Throwable th2) {
        boolean zCompleteExceptionally;
        Throwable cause;
        try {
            if (th2 == null) {
                zCompleteExceptionally = completableDeferred.complete(obj);
            } else {
                CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                zCompleteExceptionally = completableDeferred.completeExceptionally(th2);
            }
            return Boolean.valueOf(zCompleteExceptionally);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th3);
            return h0.f84049a;
        }
    }

    public static final <T> Object await(CompletionStage<T> completionStage, Continuation<? super T> continuation) throws Throwable {
        final CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, h0>() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                invoke2(th2);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar) {
        if (coroutineStart.isLazy()) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(coroutineContextNewCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, pVar);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, pVar);
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        final p pVar = new p() { // from class: kotlinx.coroutines.future.FutureKt.setupCancellation.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(obj, (Throwable) obj2);
                return h0.f84049a;
            }

            public final void invoke(Object obj, Throwable th2) {
                Job job2 = job;
                CancellationException CancellationException = null;
                if (th2 != null) {
                    CancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                    if (CancellationException == null) {
                        CancellationException = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th2);
                    }
                }
                job2.cancel(CancellationException);
            }
        };
        completableFuture.handle(new BiFunction() { // from class: kotlinx.coroutines.future.e
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return FutureKt.setupCancellation$lambda$3(pVar, obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setupCancellation$lambda$3(p pVar, Object obj, Throwable th2) {
        return (h0) pVar.invoke(obj, th2);
    }

    public static final CompletableFuture<h0> asCompletableFuture(Job job) {
        final CompletableFuture<h0> completableFuture = new CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new l() { // from class: kotlinx.coroutines.future.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return FutureKt.asCompletableFuture$lambda$2(completableFuture, (Throwable) obj);
            }
        });
        return completableFuture;
    }
}
