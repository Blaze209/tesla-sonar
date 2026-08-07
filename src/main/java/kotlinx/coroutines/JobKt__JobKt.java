package kotlinx.coroutines;

import ho0.i;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.p;
import wn0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0017\u001a\u00020\u0011*\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u001f\u0010\u0017\u001a\u00020\u0011*\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0017\u0010\u001b\u001a#\u0010\u001d\u001a\u00020\u0011*\u00020\u001c2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0011*\u00020\u0000¢\u0006\u0004\b \u0010\u0019\u001a\u0011\u0010 \u001a\u00020\u0011*\u00020\u001c¢\u0006\u0004\b \u0010\u001f\u001a%\u0010\u001d\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010#\u001a\u001f\u0010\u001d\u001a\u00020\u0001*\u00020\u001c2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010$\u001a#\u0010\u0017\u001a\u00020\u0011*\u00020\u001c2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u001e\u001a\u0013\u0010\u0017\u001a\u00020\u0011*\u00020\u001cH\u0007¢\u0006\u0004\b\u0017\u0010\u001f\u001a\u001f\u0010\u0017\u001a\u00020\u0011*\u00020\u001c2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0017\u0010%\u001a\u001d\u0010)\u001a\u00020\u001a*\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(\"\u0015\u0010*\u001a\u00020\u0001*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u0010&\u001a\u00020\u0000*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lkotlinx/coroutines/Job;", "", "invokeImmediately", "Lkotlinx/coroutines/JobNode;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlinx/coroutines/Job;ZLkotlinx/coroutines/JobNode;)Lkotlinx/coroutines/DisposableHandle;", "parent", "Lkotlinx/coroutines/CompletableJob;", "Job", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "Job0", "handle", "disposeOnCompletion", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/DisposableHandle;)Lkotlinx/coroutines/DisposableHandle;", "Ljn0/h0;", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "cancelChildren", "(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;)V", "(Lkotlinx/coroutines/Job;)V", "", "(Lkotlinx/coroutines/Job;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "cancel", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "(Lkotlin/coroutines/CoroutineContext;)V", "ensureActive", "", "message", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)Z", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "job", "orCancellation$JobKt__JobKt", "(Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "orCancellation", "isActive", "(Lkotlin/coroutines/CoroutineContext;)Z", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class JobKt__JobKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends p implements l<Throwable, h0> {
        AnonymousClass1(Object obj) {
            super(1, obj, JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            invoke2(th2);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((JobNode) this.receiver).invoke(th2);
        }
    }

    public static final CompletableJob Job(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineContext coroutineContext, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(coroutineContext, cancellationException);
    }

    public static final Object cancelAndJoin(Job job, Continuation<? super h0> continuation) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object objJoin = job.join(continuation);
        return objJoin == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : h0.f84049a;
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final void ensureActive(Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final Job getJob(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z11, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z11, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z11, new AnonymousClass1(jobNode));
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z11, JobNode jobNode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return JobKt.invokeOnCompletion(job, z11, jobNode);
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th2, Job job) {
        return th2 == null ? new JobCancellationException("Job was cancelled", null, job) : th2;
    }

    @jn0.e
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m511Job(Job job) {
        return JobKt.Job(job);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m512Job$default(Job job, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            job = null;
        }
        return m511Job(job);
    }

    public static /* synthetic */ void cancel$default(Job job, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        JobKt.cancel(job, str, th2);
    }

    public static /* synthetic */ void cancelChildren$default(Job job, Throwable th2, int i11, Object obj) throws Throwable {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        cancelChildren(job, th2);
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    public static final void cancel(Job job, String str, Throwable th2) {
        job.cancel(ExceptionsKt.CancellationException(str, th2));
    }

    public static /* synthetic */ boolean cancel$default(CoroutineContext coroutineContext, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        return cancel(coroutineContext, th2);
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext coroutineContext, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    @jn0.e
    public static final /* synthetic */ boolean cancel(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        CoroutineContext.Element element = coroutineContext.get(Job.INSTANCE);
        JobSupport jobSupport = element instanceof JobSupport ? (JobSupport) element : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, jobSupport));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext coroutineContext, Throwable th2, int i11, Object obj) throws Throwable {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        cancelChildren(coroutineContext, th2);
    }

    @jn0.e
    public static final /* synthetic */ void cancelChildren(Job job, Throwable th2) throws Throwable {
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, job));
            }
        }
    }

    public static final void cancelChildren(CoroutineContext coroutineContext, CancellationException cancellationException) {
        i<Job> children;
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator<Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    @jn0.e
    public static final /* synthetic */ void cancelChildren(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        Job job = (Job) coroutineContext.get(Job.INSTANCE);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, job));
            }
        }
    }
}
