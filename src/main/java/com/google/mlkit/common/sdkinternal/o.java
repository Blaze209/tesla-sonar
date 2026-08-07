package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45082b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f45081a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f45083c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f45084d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f45081a) {
            try {
                if (this.f45083c.isEmpty()) {
                    this.f45082b = false;
                } else {
                    i0 i0Var = (i0) this.f45083c.remove();
                    e(i0Var.f45045a, i0Var.f45046b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    k0 k0Var = new k0(this.f45040a, null);
                    try {
                        runnable.run();
                        k0Var.close();
                    } catch (Throwable th2) {
                        try {
                            k0Var.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    @KeepForSdk
    public void a(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f45081a) {
            try {
                if (this.f45082b) {
                    this.f45083c.add(new i0(executor, runnable, null));
                } else {
                    this.f45082b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
