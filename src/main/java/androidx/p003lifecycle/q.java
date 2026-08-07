package androidx.p003lifecycle;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/q;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/j;", "dispatchQueue", "Lkotlinx/coroutines/Job;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/j;Lkotlinx/coroutines/Job;)V", "Ljn0/h0;", "b", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "c", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/u;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/u;", "observer", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle.State minState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j dispatchQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u observer;

    public q(Lifecycle lifecycle, Lifecycle.State minState, j dispatchQueue, final Job parentJob) {
        s.k(lifecycle, "lifecycle");
        s.k(minState, "minState");
        s.k(dispatchQueue, "dispatchQueue");
        s.k(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        u uVar = new u() { // from class: androidx.lifecycle.p
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                q.c(this.f8851a, parentJob, lifecycleOwner, aVar);
            }
        };
        this.observer = uVar;
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.a(uVar);
        } else {
            Job.DefaultImpls.cancel$default(parentJob, (CancellationException) null, 1, (Object) null);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(q this$0, Job parentJob, LifecycleOwner source, Lifecycle.a aVar) {
        s.k(this$0, "this$0");
        s.k(parentJob, "$parentJob");
        s.k(source, "source");
        s.k(aVar, "<anonymous parameter 1>");
        if (source.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            Job.DefaultImpls.cancel$default(parentJob, (CancellationException) null, 1, (Object) null);
            this$0.b();
        } else if (source.getLifecycle().getState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.h();
        } else {
            this$0.dispatchQueue.i();
        }
    }

    public final void b() {
        this.lifecycle.d(this.observer);
        this.dispatchQueue.g();
    }
}
