package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.b7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f79365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f79366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2 f79367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.p f79368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f79369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f79370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f79371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f79372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f79373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f79374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f79375k;

    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    c(long j11, boolean z11, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long a() {
                return SystemClock.uptimeMillis();
            }
        }, j11, 500L, z11, aVar, iLogger, new c2(), context);
    }

    public static /* synthetic */ void a(c cVar, io.sentry.transport.p pVar) {
        cVar.getClass();
        cVar.f79372h = pVar.a();
        cVar.f79373i.set(false);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f79374j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f79371g.a(b7.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f79375k.run();
        while (!isInterrupted()) {
            this.f79367c.b(this.f79375k);
            try {
                Thread.sleep(this.f79369e);
                if (this.f79368d.a() - this.f79372h > this.f79370f) {
                    if (!this.f79365a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f79371g.c(b7.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f79373i.set(true);
                    } else if (c() && this.f79373i.compareAndSet(false, true)) {
                        this.f79366b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f79370f + " ms.", this.f79367c.a()));
                    }
                }
            } catch (InterruptedException e11) {
                try {
                    Thread.currentThread().interrupt();
                    this.f79371g.c(b7.WARNING, "Interrupted: %s", e11.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f79371g.c(b7.WARNING, "Failed to interrupt due to SecurityException: %s", e11.getMessage());
                    return;
                }
            }
        }
    }

    c(final io.sentry.transport.p pVar, long j11, long j12, boolean z11, a aVar, ILogger iLogger, c2 c2Var, Context context) {
        super("|ANR-WatchDog|");
        this.f79372h = 0L;
        this.f79373i = new AtomicBoolean(false);
        this.f79368d = pVar;
        this.f79370f = j11;
        this.f79369e = j12;
        this.f79365a = z11;
        this.f79366b = aVar;
        this.f79371g = iLogger;
        this.f79367c = c2Var;
        this.f79374j = context;
        this.f79375k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f79353a, pVar);
            }
        };
        if (j11 < this.f79369e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f79369e * 2)));
        }
    }
}
