package du;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f61026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f61027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f61028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j jVar) {
        super(taskCompletionSource);
        this.f61026b = taskCompletionSource2;
        this.f61027c = jVar;
        this.f61028d = tVar;
    }

    @Override // du.j
    public final void a() {
        synchronized (this.f61028d.f61040f) {
            try {
                t.n(this.f61028d, this.f61026b);
                if (this.f61028d.f61045k.getAndIncrement() > 0) {
                    this.f61028d.f61036b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f61028d, this.f61027c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
