package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class h implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<Runnable> f48472a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f48473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f48474c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f48475a;

        a(Runnable runnable) {
            this.f48475a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f48475a.run();
            } finally {
                h.this.a();
            }
        }
    }

    public h(Executor executor) {
        this.f48474c = executor;
    }

    synchronized void a() {
        Runnable runnablePoll = this.f48472a.poll();
        this.f48473b = runnablePoll;
        if (runnablePoll != null) {
            this.f48474c.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f48472a.offer(new a(runnable));
        if (this.f48473b == null) {
            a();
        }
    }
}
