package kotlinx.coroutines.tasks;

import com.adyen.checkout.components.core.action.AwaitAction;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ho0.i;
import java.util.concurrent.CancellationException;
import jn0.e;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u001e\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086@¢\u0006\u0002\u0010\t\u001a&\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0087@¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"asTask", "Lcom/google/android/gms/tasks/Task;", "T", "Lkotlinx/coroutines/Deferred;", "asDeferred", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", AwaitAction.ACTION_TYPE, "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TasksKt {
    public static final <T> Deferred<T> asDeferred(Task<T> task) {
        return asDeferredImpl(task, null);
    }

    private static final <T> Deferred<T> asDeferredImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                completableDeferredCompletableDeferred$default.completeExceptionally(exception);
            } else if (task.isCanceled()) {
                Job.DefaultImpls.cancel$default((Job) completableDeferredCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                completableDeferredCompletableDeferred$default.complete(task.getResult());
            }
        } else {
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    TasksKt.asDeferredImpl$lambda$1(completableDeferredCompletableDeferred$default, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new l() { // from class: kotlinx.coroutines.tasks.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return TasksKt.asDeferredImpl$lambda$2(cancellationTokenSource, (Throwable) obj);
                }
            });
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public ChildHandle attachChild(ChildJob child) {
                return completableDeferredCompletableDeferred$default.attachChild(child);
            }

            @Override // kotlinx.coroutines.Deferred
            public Object await(Continuation<? super T> continuation) {
                return completableDeferredCompletableDeferred$default.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            @e
            public /* synthetic */ void cancel() {
                completableDeferredCompletableDeferred$default.cancel();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
            public <R> R fold(R initial, p<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
                return (R) completableDeferredCompletableDeferred$default.fold(initial, operation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
            public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
                return (E) completableDeferredCompletableDeferred$default.get(key);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public CancellationException getCancellationException() {
                return completableDeferredCompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public i<Job> getChildren() {
                return completableDeferredCompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public T getCompleted() {
                return completableDeferredCompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public Throwable getCompletionExceptionOrNull() {
                return completableDeferredCompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public CoroutineContext.Key<?> getKey() {
                return completableDeferredCompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public SelectClause1<T> getOnAwait() {
                return completableDeferredCompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public SelectClause0 getOnJoin() {
                return completableDeferredCompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public Job getParent() {
                return completableDeferredCompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(l<? super Throwable, h0> handler) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferredCompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferredCompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferredCompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public Object join(Continuation<? super h0> continuation) {
                return completableDeferredCompletableDeferred$default.join(continuation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
            public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
                return completableDeferredCompletableDeferred$default.minusKey(key);
            }

            @Override // p013kotlin.coroutines.CoroutineContext
            public CoroutineContext plus(CoroutineContext context) {
                return completableDeferredCompletableDeferred$default.plus(context);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferredCompletableDeferred$default.start();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(CancellationException cause) {
                completableDeferredCompletableDeferred$default.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, l<? super Throwable, h0> handler) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            @e
            public Job plus(Job other) {
                return completableDeferredCompletableDeferred$default.plus(other);
            }

            @Override // kotlinx.coroutines.Job
            @e
            public /* synthetic */ boolean cancel(Throwable cause) {
                return completableDeferredCompletableDeferred$default.cancel(cause);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$1(CompletableDeferred completableDeferred, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            completableDeferred.completeExceptionally(exception);
        } else if (task.isCanceled()) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(task.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 asDeferredImpl$lambda$2(CancellationTokenSource cancellationTokenSource, Throwable th2) {
        cancellationTokenSource.cancel();
        return h0.f84049a;
    }

    public static final <T> Task<T> asTask(final Deferred<? extends T> deferred) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new l() { // from class: kotlinx.coroutines.tasks.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return TasksKt.asTask$lambda$0(cancellationTokenSource, deferred, taskCompletionSource, (Throwable) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 asTask$lambda$0(CancellationTokenSource cancellationTokenSource, Deferred deferred, TaskCompletionSource taskCompletionSource, Throwable th2) {
        if (th2 instanceof CancellationException) {
            cancellationTokenSource.cancel();
            return h0.f84049a;
        }
        Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            taskCompletionSource.setResult(deferred.getCompleted());
        } else {
            Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
            }
            taskCompletionSource.setException(runtimeExecutionException);
        }
        return h0.f84049a;
    }

    public static final <T> Object await(Task<T> task, Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (!task.isComplete()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<T> task2) {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        Continuation continuation2 = cancellableContinuationImpl;
                        s.Companion companion = s.INSTANCE;
                        continuation2.resumeWith(s.b(t.a(exception)));
                    } else {
                        if (task2.isCanceled()) {
                            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                            return;
                        }
                        Continuation continuation3 = cancellableContinuationImpl;
                        s.Companion companion2 = s.INSTANCE;
                        continuation3.resumeWith(s.b(task2.getResult()));
                    }
                }
            });
            if (cancellationTokenSource != null) {
                cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, h0>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                        invoke2(th2);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        cancellationTokenSource.cancel();
                    }
                });
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    @ExperimentalCoroutinesApi
    public static final <T> Deferred<T> asDeferred(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Object await(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        return awaitImpl(task, cancellationTokenSource, continuation);
    }
}
