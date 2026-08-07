package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    protected final o f45049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f45050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f45051c;

    public k() {
        this.f45050b = new AtomicInteger(0);
        this.f45051c = new AtomicBoolean(false);
        this.f45049a = new o();
    }

    @NonNull
    @KeepForSdk
    public <T> Task<T> a(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f45050b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f45049a.a(new Executor() { // from class: com.google.mlkit.common.sdkinternal.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e11) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e11);
                    }
                    throw e11;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45027a.g(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public abstract void b();

    @KeepForSdk
    public void c() {
        this.f45050b.incrementAndGet();
    }

    @KeepForSdk
    protected abstract void d();

    @KeepForSdk
    public void e(@NonNull Executor executor) {
        f(executor);
    }

    @NonNull
    @KeepForSdk
    public Task<Void> f(@NonNull Executor executor) {
        Preconditions.checkState(this.f45050b.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45049a.a(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f45094a.h(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void g(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f45051c.get()) {
                    b();
                    this.f45051c.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object objCall = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(objCall);
                }
            } catch (RuntimeException e11) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11);
            }
        } catch (Exception e12) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e12);
            }
        }
    }

    final /* synthetic */ void h(TaskCompletionSource taskCompletionSource) {
        int iDecrementAndGet = this.f45050b.decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f45051c.set(false);
        }
        zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    @KeepForSdk
    protected k(@NonNull o oVar) {
        this.f45050b = new AtomicInteger(0);
        this.f45051c = new AtomicBoolean(false);
        this.f45049a = oVar;
    }
}
