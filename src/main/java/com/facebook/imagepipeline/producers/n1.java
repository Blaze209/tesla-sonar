package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class n1<T> implements z0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<T> f21897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21898b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f21901e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<n<T>, a1>> f21900d = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21899c = 0;

    private class a extends u<T, T> {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.n1$a$a, reason: collision with other inner class name */
        class RunnableC0439a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f21903a;

            RunnableC0439a(Pair pair) {
                this.f21903a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                n1 n1Var = n1.this;
                Pair pair = this.f21903a;
                n1Var.g((n) pair.first, (a1) pair.second);
            }
        }

        private void p() {
            Pair pair;
            synchronized (n1.this) {
                try {
                    pair = (Pair) n1.this.f21900d.poll();
                    if (pair == null) {
                        n1.this.f21899c--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair != null) {
                n1.this.f21901e.execute(new RunnableC0439a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void g(Throwable th2) {
            o().onFailure(th2);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void h(T t11, int i11) {
            o().b(t11, i11);
            if (c.d(i11)) {
                p();
            }
        }

        private a(n<T> nVar) {
            super(nVar);
        }
    }

    public n1(int i11, Executor executor, z0<T> z0Var) {
        this.f21898b = i11;
        this.f21901e = (Executor) pk.k.g(executor);
        this.f21897a = (z0) pk.k.g(z0Var);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<T> nVar, a1 a1Var) {
        boolean z11;
        a1Var.p().b(a1Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i11 = this.f21899c;
                z11 = true;
                if (i11 >= this.f21898b) {
                    this.f21900d.add(Pair.create(nVar, a1Var));
                } else {
                    this.f21899c = i11 + 1;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            return;
        }
        g(nVar, a1Var);
    }

    void g(n<T> nVar, a1 a1Var) {
        a1Var.p().j(a1Var, "ThrottlingProducer", null);
        this.f21897a.a(new a(nVar), a1Var);
    }
}
