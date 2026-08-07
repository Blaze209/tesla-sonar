package i0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class i implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f74027b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Deque<Runnable> f74026a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f74028c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f74029d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f74030e = 0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f74031a;

        a(Runnable runnable) {
            this.f74031a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f74031a.run();
        }
    }

    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            c0.y0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                i0.i r2 = i0.i.this     // Catch: java.lang.Throwable -> L49
                java.util.Deque<java.lang.Runnable> r2 = r2.f74026a     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                i0.i r0 = i0.i.this     // Catch: java.lang.Throwable -> L1c
                i0.i$c r3 = r0.f74029d     // Catch: java.lang.Throwable -> L1c
                i0.i$c r4 = i0.i.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L3e
            L1c:
                r0 = move-exception
                goto L63
            L1e:
                long r5 = r0.f74030e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f74030e = r5     // Catch: java.lang.Throwable -> L1c
                r0.f74029d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                i0.i r3 = i0.i.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque<java.lang.Runnable> r3 = r3.f74026a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                i0.i r0 = i0.i.this     // Catch: java.lang.Throwable -> L1c
                i0.i$c r3 = i0.i.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f74029d = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r0 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                c0.y0.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L6e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.i.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (i.this.f74026a) {
                    i.this.f74029d = c.IDLE;
                    throw e11;
                }
            }
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    i(Executor executor) {
        this.f74027b = (Executor) u5.h.g(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z11;
        u5.h.g(runnable);
        synchronized (this.f74026a) {
            c cVar2 = this.f74029d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j11 = this.f74030e;
                a aVar = new a(runnable);
                this.f74026a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f74029d = cVar3;
                try {
                    this.f74027b.execute(this.f74028c);
                    if (this.f74029d != cVar3) {
                        return;
                    }
                    synchronized (this.f74026a) {
                        try {
                            if (this.f74030e == j11 && this.f74029d == cVar3) {
                                this.f74029d = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.f74026a) {
                        try {
                            c cVar4 = this.f74029d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z11 = false;
                            } else if (this.f74026a.removeLastOccurrence(aVar)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!(e11 instanceof RejectedExecutionException) || z11) {
                                throw e11;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f74026a.add(runnable);
        }
    }
}
