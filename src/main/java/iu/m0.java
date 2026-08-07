package iu;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f81899a;

    m0() {
        this.f81899a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f81899a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f81899a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e11) {
            a(e11);
        }
    }

    public m0(TaskCompletionSource taskCompletionSource) {
        this.f81899a = taskCompletionSource;
    }
}
