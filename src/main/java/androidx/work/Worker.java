package androidx.work;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/work/y$a;", "Lcom/google/common/util/concurrent/s;", "startWork", "()Lcom/google/common/util/concurrent/s;", "Landroidx/work/m;", "getForegroundInfoAsync", "e", "()Landroidx/work/m;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workerParams, "workerParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m f(Worker worker) {
        return worker.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y.a g(Worker worker) {
        return worker.d();
    }

    public abstract y.a d();

    public m e() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.y
    public com.google.common.util.concurrent.s<m> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        p013kotlin.jvm.internal.s.j(backgroundExecutor, "getBackgroundExecutor(...)");
        return d1.e(backgroundExecutor, new wn0.a() { // from class: androidx.work.w0
            @Override // wn0.a
            public final Object invoke() {
                return Worker.f(this.f14784a);
            }
        });
    }

    @Override // androidx.work.y
    public final com.google.common.util.concurrent.s<y.a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        p013kotlin.jvm.internal.s.j(backgroundExecutor, "getBackgroundExecutor(...)");
        return d1.e(backgroundExecutor, new wn0.a() { // from class: androidx.work.v0
            @Override // wn0.a
            public final Object invoke() {
                return Worker.g(this.f14779a);
            }
        });
    }
}
