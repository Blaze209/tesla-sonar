package a30;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"La30/c;", "Landroid/view/View$OnAttachStateChangeListener;", "Lkotlinx/coroutines/CoroutineScope;", "parentCoroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlin/Function0;", "Ljn0/h0;", "block", "c", "(Lwn0/a;)V", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "a", "Ljava/util/List;", "attachHandlers", "Lkotlinx/coroutines/CompletableJob;", "b", "Lkotlinx/coroutines/CompletableJob;", "attachedJob", "Lkotlinx/coroutines/CoroutineScope;", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class c implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<wn0.a<jn0.h0>> attachHandlers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob attachedJob;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {
        a() {
            super(1);
        }

        public final void a(Throwable th2) {
            c.this.attachHandlers.clear();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    public c(CoroutineScope parentCoroutineScope) {
        p013kotlin.jvm.internal.s.k(parentCoroutineScope, "parentCoroutineScope");
        this.attachHandlers = new ArrayList();
        CompletableJob completableJobJob = JobKt.Job(JobKt.getJob(parentCoroutineScope.getCoroutineContext()));
        completableJobJob.invokeOnCompletion(new a());
        this.attachedJob = completableJobJob;
        this.coroutineScope = CoroutineScopeKt.plus(parentCoroutineScope, completableJobJob);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void c(wn0.a<jn0.h0> block) {
        p013kotlin.jvm.internal.s.k(block, "block");
        if (!CoroutineScopeKt.isActive(this.coroutineScope)) {
            throw new IllegalStateException("Expected AttachedScope to be active when adding attach handler.");
        }
        this.attachHandlers.add(block);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        List<wn0.a<jn0.h0>> list = this.attachHandlers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((wn0.a) it.next()).invoke();
        }
        list.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        CoroutineScopeKt.cancel$default(this.coroutineScope, "View detached", null, 2, null);
        v11.removeOnAttachStateChangeListener(this);
    }
}
