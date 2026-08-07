package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f98166a = new q();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f98167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f98168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f98169c;

        a(Runnable runnable, c cVar, long j11) {
            this.f98167a = runnable;
            this.f98168b = cVar;
            this.f98169c = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98168b.f98177d) {
                return;
            }
            long jNow = this.f98168b.now(TimeUnit.MILLISECONDS);
            long j11 = this.f98169c;
            if (j11 > jNow) {
                try {
                    Thread.sleep(j11 - jNow);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    tm0.a.r(e11);
                    return;
                }
            }
            if (this.f98168b.f98177d) {
                return;
            }
            this.f98167a.run();
        }
    }

    static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f98170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f98171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f98172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f98173d;

        b(Runnable runnable, Long l11, int i11) {
            this.f98170a = runnable;
            this.f98171b = l11.longValue();
            this.f98172c = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iCompare = Long.compare(this.f98171b, bVar.f98171b);
            return iCompare == 0 ? Integer.compare(this.f98172c, bVar.f98172c) : iCompare;
        }
    }

    static final class c extends t.c implements am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f98174a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f98175b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f98176c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f98177d;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f98178a;

            a(b bVar) {
                this.f98178a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f98178a.f98173d = true;
                c.this.f98174a.remove(this.f98178a);
            }
        }

        c() {
        }

        am0.b a(Runnable runnable, long j11) {
            if (this.f98177d) {
                return dm0.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j11), this.f98176c.incrementAndGet());
            this.f98174a.add(bVar);
            if (this.f98175b.getAndIncrement() != 0) {
                return am0.b.d(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f98177d) {
                b bVarPoll = this.f98174a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f98175b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return dm0.c.INSTANCE;
                    }
                } else if (!bVarPoll.f98173d) {
                    bVarPoll.f98170a.run();
                }
            }
            this.f98174a.clear();
            return dm0.c.INSTANCE;
        }

        @Override // am0.b
        public void dispose() {
            this.f98177d = true;
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98177d;
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable) {
            return a(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            long jNow = now(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j11);
            return a(new a(runnable, this, jNow), jNow);
        }
    }

    q() {
    }

    public static q a() {
        return f98166a;
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new c();
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable) {
        tm0.a.t(runnable).run();
        return dm0.c.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j11);
            tm0.a.t(runnable).run();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            tm0.a.r(e11);
        }
        return dm0.c.INSTANCE;
    }
}
