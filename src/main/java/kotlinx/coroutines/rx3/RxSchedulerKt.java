package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.t;
import jn0.h0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InterruptibleKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0016\u001a\u00020\u0015*\u00020\t2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\r20\u0010\u0014\u001a,\u0012\u001e\u0012\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fj\u0002`\u0013\u0012\b\u0012\u00060\nj\u0002`\u000b0\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017*8\b\u0002\u0010\u0018\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f2\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¨\u0006\u0019"}, d2 = {"Lio/reactivex/rxjava3/core/t;", "Lkotlinx/coroutines/CoroutineDispatcher;", "asCoroutineDispatcher", "(Lio/reactivex/rxjava3/core/t;)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/rx3/SchedulerCoroutineDispatcher;", "(Lio/reactivex/rxjava3/core/t;)Lkotlinx/coroutines/rx3/SchedulerCoroutineDispatcher;", "asCoroutineDispatcher0", "asScheduler", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lio/reactivex/rxjava3/core/t;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delayMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "Lkotlinx/coroutines/rx3/Task;", "adaptForScheduling", "Lam0/b;", "scheduleTask", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Runnable;JLwn0/l;)Lam0/b;", "Task", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxSchedulerKt {
    public static final CoroutineDispatcher asCoroutineDispatcher(t tVar) {
        return tVar instanceof DispatcherScheduler ? ((DispatcherScheduler) tVar).dispatcher : new SchedulerCoroutineDispatcher(tVar);
    }

    public static final t asScheduler(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher instanceof SchedulerCoroutineDispatcher ? ((SchedulerCoroutineDispatcher) coroutineDispatcher).getScheduler() : new DispatcherScheduler(coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlinx.coroutines.DisposableHandle] */
    public static final am0.b scheduleTask(CoroutineScope coroutineScope, Runnable runnable, long j11, wn0.l<? super wn0.l<? super Continuation<? super h0>, ? extends Object>, ? extends Runnable> lVar) {
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        final n0 n0Var = new n0();
        am0.b bVarD = am0.b.d(new Runnable() { // from class: kotlinx.coroutines.rx3.l
            @Override // java.lang.Runnable
            public final void run() {
                RxSchedulerKt.scheduleTask$lambda$0(n0Var);
            }
        });
        Runnable runnableInvoke = lVar.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(bVarD, coroutineContext, tm0.a.t(runnable)));
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return am0.b.c();
        }
        if (j11 <= 0) {
            runnableInvoke.run();
            return bVarD;
        }
        n0Var.f86529a = DelayKt.getDelay(coroutineContext).invokeOnTimeout(j11, runnableInvoke, coroutineContext);
        return bVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleTask$lambda$0(n0 n0Var) {
        DisposableHandle disposableHandle = (DisposableHandle) n0Var.f86529a;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object scheduleTask$task(am0.b bVar, CoroutineContext coroutineContext, final Runnable runnable, Continuation<? super h0> continuation) {
        RxSchedulerKt$scheduleTask$task$1 rxSchedulerKt$scheduleTask$task$1;
        if (continuation instanceof RxSchedulerKt$scheduleTask$task$1) {
            rxSchedulerKt$scheduleTask$task$1 = (RxSchedulerKt$scheduleTask$task$1) continuation;
            int i11 = rxSchedulerKt$scheduleTask$task$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rxSchedulerKt$scheduleTask$task$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rxSchedulerKt$scheduleTask$task$1 = new RxSchedulerKt$scheduleTask$task$1(continuation);
            }
        } else {
            rxSchedulerKt$scheduleTask$task$1 = new RxSchedulerKt$scheduleTask$task$1(continuation);
        }
        Object obj = rxSchedulerKt$scheduleTask$task$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rxSchedulerKt$scheduleTask$task$1.label;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                if (bVar.isDisposed()) {
                    return h0.f84049a;
                }
                wn0.a aVar = new wn0.a() { // from class: kotlinx.coroutines.rx3.k
                    @Override // wn0.a
                    public final Object invoke() {
                        return RxSchedulerKt.scheduleTask$task$lambda$1(runnable);
                    }
                };
                rxSchedulerKt$scheduleTask$task$1.L$0 = coroutineContext;
                rxSchedulerKt$scheduleTask$task$1.label = 1;
                if (InterruptibleKt.runInterruptible$default(null, aVar, rxSchedulerKt$scheduleTask$task$1, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineContext = (CoroutineContext) rxSchedulerKt$scheduleTask$task$1.L$0;
                jn0.t.b(obj);
            }
        } catch (Throwable th2) {
            RxCancellableKt.handleUndeliverableException(th2, coroutineContext);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 scheduleTask$task$lambda$1(Runnable runnable) {
        runnable.run();
        return h0.f84049a;
    }

    @jn0.e
    /* JADX INFO: renamed from: asCoroutineDispatcher, reason: collision with other method in class */
    public static final /* synthetic */ SchedulerCoroutineDispatcher m590asCoroutineDispatcher(t tVar) {
        return new SchedulerCoroutineDispatcher(tVar);
    }
}
