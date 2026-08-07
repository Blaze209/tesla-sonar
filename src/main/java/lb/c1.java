package lb;

import androidx.work.WorkerParameters;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llb/c1;", "Llb/a1;", "Llb/s;", "processor", "Lub/b;", "workTaskExecutor", "<init>", "(Llb/s;Lub/b;)V", "Llb/x;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Ljn0/h0;", "c", "(Llb/x;Landroidx/work/WorkerParameters$a;)V", "", AnalyticsAttribute.Reason, DateTokenConverter.CONVERTER_KEY, "(Llb/x;I)V", "a", "Llb/s;", "getProcessor", "()Llb/s;", "b", "Lub/b;", "getWorkTaskExecutor", "()Lub/b;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s processor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ub.b workTaskExecutor;

    public c1(s processor, ub.b workTaskExecutor) {
        p013kotlin.jvm.internal.s.k(processor, "processor");
        p013kotlin.jvm.internal.s.k(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(c1 c1Var, x xVar, WorkerParameters.a aVar) throws Throwable {
        c1Var.processor.o(xVar, aVar);
    }

    @Override // lb.a1
    public void c(final x workSpecId, final WorkerParameters.a runtimeExtras) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        this.workTaskExecutor.b(new Runnable() { // from class: lb.b1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                c1.g(this.f89749a, workSpecId, runtimeExtras);
            }
        });
    }

    @Override // lb.a1
    public void d(x workSpecId, int reason) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        this.workTaskExecutor.b(new tb.f0(this.processor, workSpecId, false, reason));
    }
}
