package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f45037b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f45038c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f45039a;

    private g(Looper looper) {
        this.f45039a = new zza(looper);
    }

    @NonNull
    @KeepForSdk
    public static g a() {
        g gVar;
        synchronized (f45037b) {
            try {
                if (f45038c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f45038c = new g(handlerThread.getLooper());
                }
                gVar = f45038c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    @KeepForSdk
    public static Executor d() {
        return u.zza;
    }

    @NonNull
    @KeepForSdk
    public <ResultT> Task<ResultT> b(@NonNull final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e11) {
                    taskCompletionSource2.setException(e11);
                } catch (Exception e12) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e12));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public void c(@NonNull Runnable runnable) {
        d().execute(runnable);
    }
}
