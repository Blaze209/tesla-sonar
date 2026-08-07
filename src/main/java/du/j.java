package du;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f61022a;

    j() {
        this.f61022a = null;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.f61022a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f61022a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e11) {
            c(e11);
        }
    }

    public j(TaskCompletionSource taskCompletionSource) {
        this.f61022a = taskCompletionSource;
    }
}
