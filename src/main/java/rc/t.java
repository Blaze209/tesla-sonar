package rc;

import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.w;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"Lrc/t;", "Lrc/o;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lec/r;", "imageLoader", "Lrc/g;", "initialRequest", "Lvc/d;", "target", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lec/r;Lrc/g;Lvc/d;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "Ljn0/h0;", "e", "()V", "b", "start", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lec/r;", "Lrc/g;", "c", "Lvc/d;", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements o, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest initialRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vc.d<?> target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Job job;

    public t(ec.r rVar, ImageRequest imageRequest, vc.d<?> dVar, Lifecycle lifecycle, Job job) {
        this.imageLoader = rVar;
        this.initialRequest = imageRequest;
        this.target = dVar;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // rc.o
    public Object a(Continuation<? super h0> continuation) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            return h0.f84049a;
        }
        Object objA = yc.r.a(lifecycle, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : h0.f84049a;
    }

    @Override // rc.o
    public void b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        v.a(this.target.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public void d() {
        Lifecycle lifecycle;
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        vc.d<?> dVar = this.target;
        if ((dVar instanceof w) && (lifecycle = this.lifecycle) != null) {
            lifecycle.d((w) dVar);
        }
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.d(this);
        }
    }

    public final void e() {
        this.imageLoader.b(this.initialRequest);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        v.a(this.target.getView()).a();
    }

    @Override // rc.o
    public void start() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.a(this);
        }
        vc.d<?> dVar = this.target;
        if ((dVar instanceof w) && (lifecycle = this.lifecycle) != null) {
            yc.r.b(lifecycle, (w) dVar);
        }
        v.a(this.target.getView()).c(this);
    }
}
