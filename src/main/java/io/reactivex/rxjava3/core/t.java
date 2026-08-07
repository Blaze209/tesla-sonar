package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t {
    static boolean IS_DRIFT_USE_NANOTIME = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = computeClockDrift(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    static final class a implements am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f78864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f78865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Thread f78866c;

        a(Runnable runnable, c cVar) {
            this.f78864a = runnable;
            this.f78865b = cVar;
        }

        @Override // am0.b
        public void dispose() {
            if (this.f78866c == Thread.currentThread()) {
                c cVar = this.f78865b;
                if (cVar instanceof om0.h) {
                    ((om0.h) cVar).f();
                    return;
                }
            }
            this.f78865b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f78865b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f78866c = Thread.currentThread();
            try {
                this.f78864a.run();
                dispose();
                this.f78866c = null;
            } catch (Throwable th2) {
                try {
                    tm0.a.r(th2);
                    throw th2;
                } catch (Throwable th3) {
                    dispose();
                    this.f78866c = null;
                    throw th3;
                }
            }
        }
    }

    static final class b implements am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f78867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f78868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f78869c;

        b(Runnable runnable, c cVar) {
            this.f78867a = runnable;
            this.f78868b = cVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f78869c = true;
            this.f78868b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f78869c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f78869c) {
                return;
            }
            try {
                this.f78867a.run();
            } catch (Throwable th2) {
                dispose();
                tm0.a.r(th2);
                throw th2;
            }
        }
    }

    public static abstract class c implements am0.b {

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Runnable f78870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final dm0.e f78871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f78872c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f78873d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            long f78874e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f78875f;

            a(long j11, Runnable runnable, long j12, dm0.e eVar, long j13) {
                this.f78870a = runnable;
                this.f78871b = eVar;
                this.f78872c = j13;
                this.f78874e = j12;
                this.f78875f = j11;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j11;
                this.f78870a.run();
                if (this.f78871b.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jNow = cVar.now(timeUnit);
                long j12 = t.CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
                long j13 = jNow + j12;
                long j14 = this.f78874e;
                if (j13 >= j14) {
                    long j15 = this.f78872c;
                    if (jNow >= j14 + j15 + j12) {
                        long j16 = this.f78872c;
                        long j17 = jNow + j16;
                        long j18 = this.f78873d + 1;
                        this.f78873d = j18;
                        this.f78875f = j17 - (j16 * j18);
                        j11 = j17;
                    } else {
                        long j19 = this.f78875f;
                        long j21 = this.f78873d + 1;
                        this.f78873d = j21;
                        j11 = j19 + (j21 * j15);
                    }
                } else {
                    long j110 = this.f78872c;
                    long j111 = jNow + j110;
                    long j112 = this.f78873d + 1;
                    this.f78873d = j112;
                    this.f78875f = j111 - (j110 * j112);
                    j11 = j111;
                }
                this.f78874e = jNow;
                this.f78871b.a(c.this.schedule(this, j11 - jNow, timeUnit));
            }
        }

        public long now(TimeUnit timeUnit) {
            return t.computeNow(timeUnit);
        }

        public am0.b schedule(Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit);

        public am0.b schedulePeriodically(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            dm0.e eVar = new dm0.e();
            dm0.e eVar2 = new dm0.e(eVar);
            Runnable runnableT = tm0.a.t(runnable);
            long nanos = timeUnit.toNanos(j12);
            long jNow = now(TimeUnit.NANOSECONDS);
            am0.b bVarSchedule = schedule(new a(jNow + timeUnit.toNanos(j11), runnableT, jNow, eVar2, nanos), j11, timeUnit);
            if (bVarSchedule == dm0.c.INSTANCE) {
                return bVarSchedule;
            }
            eVar.a(bVarSchedule);
            return eVar2;
        }
    }

    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    static long computeClockDrift(long j11, String str) {
        if ("seconds".equalsIgnoreCase(str)) {
            return TimeUnit.SECONDS.toNanos(j11);
        }
        return "milliseconds".equalsIgnoreCase(str) ? TimeUnit.MILLISECONDS.toNanos(j11) : TimeUnit.MINUTES.toNanos(j11);
    }

    static long computeNow(TimeUnit timeUnit) {
        return !IS_DRIFT_USE_NANOTIME ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c createWorker();

    public long now(TimeUnit timeUnit) {
        return computeNow(timeUnit);
    }

    public am0.b scheduleDirect(Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public am0.b schedulePeriodicallyDirect(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        c cVarCreateWorker = createWorker();
        b bVar = new b(tm0.a.t(runnable), cVarCreateWorker);
        am0.b bVarSchedulePeriodically = cVarCreateWorker.schedulePeriodically(bVar, j11, j12, timeUnit);
        return bVarSchedulePeriodically == dm0.c.INSTANCE ? bVarSchedulePeriodically : bVar;
    }

    public void shutdown() {
    }

    public void start() {
    }

    public <S extends t & am0.b> S when(cm0.h<h<h<io.reactivex.rxjava3.core.b>>, io.reactivex.rxjava3.core.b> hVar) {
        Objects.requireNonNull(hVar, "combine is null");
        return new om0.o(hVar, this);
    }

    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        c cVarCreateWorker = createWorker();
        a aVar = new a(tm0.a.t(runnable), cVarCreateWorker);
        cVarCreateWorker.schedule(aVar, j11, timeUnit);
        return aVar;
    }
}
