package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f98126b = new j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadFactory f98127a;

    public g() {
        this(f98126b);
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new h(this.f98127a);
    }

    public g(ThreadFactory threadFactory) {
        this.f98127a = threadFactory;
    }
}
