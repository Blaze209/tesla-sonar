package kotlinx.coroutines.rx3;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/rx3/RxCancellable;", "Lcm0/e;", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lkotlinx/coroutines/Job;)V", "Ljn0/h0;", "cancel", "()V", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RxCancellable implements cm0.e {
    private final Job job;

    public RxCancellable(Job job) {
        this.job = job;
    }

    @Override // cm0.e
    public void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }
}
