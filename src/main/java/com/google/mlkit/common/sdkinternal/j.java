package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class j extends zzav {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f45047b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f45048a;

    public j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b(runnable);
                    }
                });
            }
        });
        this.f45048a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void b(Runnable runnable) {
        f45047b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(@NonNull final Runnable runnable) {
        Deque deque = (Deque) f45047b.get();
        if (deque == null || deque.size() > 1) {
            this.f45048a.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.v
                @Override // java.lang.Runnable
                public final void run() {
                    j.d((Deque) j.f45047b.get(), runnable);
                }
            });
        } else {
            d(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    @NonNull
    protected final /* synthetic */ Object zza() {
        return this.f45048a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    @NonNull
    protected final ExecutorService zzb() {
        return this.f45048a;
    }
}
