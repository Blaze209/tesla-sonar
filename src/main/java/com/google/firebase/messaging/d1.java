package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
class d1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f44259i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f44261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f44262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f44263d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f44265f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b1 f44267h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f44264e = new androidx.collection.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44266g = false;

    private d1(FirebaseMessaging firebaseMessaging, k0 k0Var, b1 b1Var, f0 f0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f44263d = firebaseMessaging;
        this.f44261b = k0Var;
        this.f44267h = b1Var;
        this.f44262c = f0Var;
        this.f44260a = context;
        this.f44265f = scheduledExecutorService;
    }

    public static /* synthetic */ d1 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, k0 k0Var, f0 f0Var) {
        return new d1(firebaseMessaging, k0Var, b1.a(context, scheduledExecutorService), f0Var, context, scheduledExecutorService);
    }

    private static <T> void b(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e12);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void c(String str) throws IOException {
        b(this.f44262c.m(this.f44263d.m(), str));
    }

    private void d(String str) throws IOException {
        b(this.f44262c.n(this.f44263d.m(), str));
    }

    static Task<d1> e(final FirebaseMessaging firebaseMessaging, final k0 k0Var, final f0 f0Var, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.c1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d1.a(context, scheduledExecutorService, firebaseMessaging, k0Var, f0Var);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void i(a1 a1Var) {
        synchronized (this.f44264e) {
            try {
                String strE = a1Var.e();
                if (this.f44264e.containsKey(strE)) {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f44264e.get(strE);
                    TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                    if (taskCompletionSourcePoll != null) {
                        taskCompletionSourcePoll.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f44264e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m() {
        if (h()) {
            return;
        }
        p(0L);
    }

    boolean f() {
        return this.f44267h.b() != null;
    }

    synchronized boolean h() {
        return this.f44266g;
    }

    boolean j(a1 a1Var) throws IOException {
        try {
            String strB = a1Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals(Gender.UNKNOWN)) {
                    d(a1Var.c());
                    if (!g()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + a1Var.c() + " succeeded.");
                    return true;
                }
            } else if (strB.equals("S")) {
                c(a1Var.c());
                if (!g()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + a1Var.c() + " succeeded.");
                return true;
            }
            if (!g()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + a1Var + ".");
            return true;
        } catch (IOException e11) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e11.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e11.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e11.getMessage())) {
                if (e11.getMessage() != null) {
                    throw e11;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e11.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void k(Runnable runnable, long j11) {
        this.f44265f.schedule(runnable, j11, TimeUnit.SECONDS);
    }

    synchronized void l(boolean z11) {
        this.f44266g = z11;
    }

    void n() {
        if (f()) {
            m();
        }
    }

    boolean o() {
        while (true) {
            synchronized (this) {
                try {
                    a1 a1VarB = this.f44267h.b();
                    if (a1VarB == null) {
                        if (g()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!j(a1VarB)) {
                        return false;
                    }
                    this.f44267h.d(a1VarB);
                    i(a1VarB);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    void p(long j11) {
        k(new e1(this, this.f44260a, this.f44261b, Math.min(Math.max(30L, 2 * j11), f44259i)), j11);
        l(true);
    }
}
