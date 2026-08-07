package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.y$a$a, reason: collision with other inner class name */
        public static final class C0256a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g f14788a;

            public C0256a() {
                this(g.f14536c);
            }

            @Override // androidx.work.y.a
            public g c() {
                return this.f14788a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0256a.class != obj.getClass()) {
                    return false;
                }
                return this.f14788a.equals(((C0256a) obj).f14788a);
            }

            public int hashCode() {
                return (C0256a.class.getName().hashCode() * 31) + this.f14788a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f14788a + CoreConstants.CURLY_RIGHT;
            }

            public C0256a(g gVar) {
                this.f14788a = gVar;
            }
        }

        public static final class b extends a {
            @Override // androidx.work.y.a
            public g c() {
                return g.f14536c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g f14789a;

            public c() {
                this(g.f14536c);
            }

            @Override // androidx.work.y.a
            public g c() {
                return this.f14789a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f14789a.equals(((c) obj).f14789a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f14789a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f14789a + CoreConstants.CURLY_RIGHT;
            }

            public c(g gVar) {
                this.f14789a = gVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0256a();
        }

        public static a b(g gVar) {
            return new C0256a(gVar);
        }

        public static a d() {
            return new b();
        }

        public static a e() {
            return new c();
        }

        public static a f(g gVar) {
            return new c(gVar);
        }

        public abstract g c();
    }

    public y(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public static /* synthetic */ Object a(androidx.concurrent.futures.c.a aVar) {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public com.google.common.util.concurrent.s<m> getForegroundInfoAsync() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.work.x
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return y.a(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.d();
    }

    public final g getInputData() {
        return this.mWorkerParams.e();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.h();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.j();
    }

    public ub.b getTaskExecutor() {
        return this.mWorkerParams.k();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.l();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m();
    }

    public y0 getWorkerFactory() {
        return this.mWorkerParams.o();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final com.google.common.util.concurrent.s<Void> setForegroundAsync(m mVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), mVar);
    }

    public com.google.common.util.concurrent.s<Void> setProgressAsync(g gVar) {
        return this.mWorkerParams.g().a(getApplicationContext(), getId(), gVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.google.common.util.concurrent.s<a> startWork();

    public final void stop(int i11) {
        if (this.mStopReason.compareAndSet(-256, i11)) {
            onStopped();
        }
    }
}
