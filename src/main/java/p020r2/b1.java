package p020r2;

import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rR0\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr2/b1;", "Lr2/r2;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwn0/p;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "a", "Lwn0/p;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "c", "Lkotlinx/coroutines/Job;", "job", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b1 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<CoroutineScope, Continuation<? super h0>, Object> task;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Job job;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(CoroutineContext coroutineContext, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
        this.task = pVar;
        this.scope = CoroutineScopeKt.CoroutineScope(coroutineContext);
    }

    @Override // p020r2.r2
    public void onAbandoned() {
        Job job = this.job;
        if (job != null) {
            job.cancel((CancellationException) new d1());
        }
        this.job = null;
    }

    @Override // p020r2.r2
    public void onForgotten() {
        Job job = this.job;
        if (job != null) {
            job.cancel((CancellationException) new d1());
        }
        this.job = null;
    }

    @Override // p020r2.r2
    public void onRemembered() {
        Job job = this.job;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, this.task, 3, null);
    }
}
