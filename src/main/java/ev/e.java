package ev;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f63225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f63226b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task<?> f63227c = Tasks.forResult(null);

    e(ExecutorService executorService) {
        this.f63225a = executorService;
    }

    public static /* synthetic */ Task a(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService d() {
        return this.f63225a;
    }

    public Task<Void> e(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f63226b) {
            taskContinueWithTask = this.f63227c.continueWithTask(this.f63225a, new Continuation() { // from class: ev.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.a(runnable, task);
                }
            });
            this.f63227c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f63225a.execute(runnable);
    }

    public <T> Task<T> f(final Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.f63226b) {
            zzwVar = (Task<T>) this.f63227c.continueWithTask(this.f63225a, new Continuation() { // from class: ev.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.b(callable, task);
                }
            });
            this.f63227c = zzwVar;
        }
        return zzwVar;
    }
}
