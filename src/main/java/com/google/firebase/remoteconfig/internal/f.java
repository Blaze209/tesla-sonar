package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, f> f44654d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f44655e = new d6.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f44656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f44657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task<g> f44658c = null;

    private static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f44659a;

        private b() {
            this.f44659a = new CountDownLatch(1);
        }

        public boolean a(long j11, TimeUnit timeUnit) {
            return this.f44659a.await(j11, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f44659a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            this.f44659a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f44659a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f44656a = executor;
        this.f44657b = uVar;
    }

    public static /* synthetic */ Task a(f fVar, boolean z11, g gVar, Void r11) {
        if (z11) {
            fVar.k(gVar);
        } else {
            fVar.getClass();
        }
        return Tasks.forResult(gVar);
    }

    private static <TResult> TResult c(Task<TResult> task, long j11, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f44655e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.a(j11, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map<String, f> map;
        try {
            strB = uVar.b();
            map = f44654d;
            if (!map.containsKey(strB)) {
                map.put(strB, new f(executor, uVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(strB);
    }

    private synchronized void k(g gVar) {
        this.f44658c = Tasks.forResult(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f44658c = Tasks.forResult(null);
        }
        this.f44657b.a();
    }

    public synchronized Task<g> e() {
        try {
            Task<g> task = this.f44658c;
            if (task == null || (task.isComplete() && !this.f44658c.isSuccessful())) {
                Executor executor = this.f44656a;
                final u uVar = this.f44657b;
                Objects.requireNonNull(uVar);
                this.f44658c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f44658c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j11) {
        synchronized (this) {
            try {
                Task<g> task = this.f44658c;
                if (task != null && task.isSuccessful()) {
                    return this.f44658c.getResult();
                }
                try {
                    return (g) c(e(), j11, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e11);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Task<g> i(g gVar) {
        return j(gVar, true);
    }

    public Task<g> j(final g gVar, final boolean z11) {
        return Tasks.call(this.f44656a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f44649a.f44657b.e(gVar);
            }
        }).onSuccessTask(this.f44656a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return f.a(this.f44651a, z11, gVar, (Void) obj);
            }
        });
    }
}
