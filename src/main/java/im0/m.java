package im0;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public final class m<T> extends b<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f78362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f78363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f78364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final cm0.a f78365f;

    static final class a<T> extends qm0.a<T> implements io.reactivex.rxjava3.core.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super T> f78366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final fm0.g<T> f78367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f78368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final cm0.a f78369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        nr0.c f78370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f78371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f78372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f78373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f78374i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f78375j;

        a(nr0.b<? super T> bVar, int i11, boolean z11, boolean z12, cm0.a aVar) {
            this.f78366a = bVar;
            this.f78369d = aVar;
            this.f78368c = z12;
            this.f78367b = z11 ? new nm0.c<>(i11) : new nm0.b<>(i11);
        }

        boolean b(boolean z11, boolean z12, nr0.b<? super T> bVar) {
            if (this.f78371f) {
                this.f78367b.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.f78368c) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.f78373h;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f78373h;
            if (th3 != null) {
                this.f78367b.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        void c() {
            if (getAndIncrement() == 0) {
                fm0.g<T> gVar = this.f78367b;
                nr0.b<? super T> bVar = this.f78366a;
                int iAddAndGet = 1;
                while (!b(this.f78372g, gVar.isEmpty(), bVar)) {
                    long j11 = this.f78374i.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        boolean z11 = this.f78372g;
                        T tPoll = gVar.poll();
                        boolean z12 = tPoll == null;
                        if (b(z11, z12, bVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        bVar.onNext(tPoll);
                        j12++;
                    }
                    if (j12 == j11 && b(this.f78372g, gVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j12 != 0 && j11 != Long.MAX_VALUE) {
                        this.f78374i.addAndGet(-j12);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // nr0.c
        public void cancel() {
            if (this.f78371f) {
                return;
            }
            this.f78371f = true;
            this.f78370e.cancel();
            if (this.f78375j || getAndIncrement() != 0) {
                return;
            }
            this.f78367b.clear();
        }

        @Override // fm0.h
        public void clear() {
            this.f78367b.clear();
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return this.f78367b.isEmpty();
        }

        @Override // nr0.b
        public void onComplete() {
            this.f78372g = true;
            if (this.f78375j) {
                this.f78366a.onComplete();
            } else {
                c();
            }
        }

        @Override // nr0.b
        public void onError(Throwable th2) {
            this.f78373h = th2;
            this.f78372g = true;
            if (this.f78375j) {
                this.f78366a.onError(th2);
            } else {
                c();
            }
        }

        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f78367b.offer(t11)) {
                if (this.f78375j) {
                    this.f78366a.onNext(null);
                    return;
                } else {
                    c();
                    return;
                }
            }
            this.f78370e.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f78369d.run();
            } catch (Throwable th2) {
                bm0.a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.rxjava3.core.i, nr0.b
        public void onSubscribe(nr0.c cVar) {
            if (qm0.d.validate(this.f78370e, cVar)) {
                this.f78370e = cVar;
                this.f78366a.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // fm0.h
        public T poll() {
            return this.f78367b.poll();
        }

        @Override // nr0.c
        public void request(long j11) {
            if (this.f78375j || !qm0.d.validate(j11)) {
                return;
            }
            rm0.c.a(this.f78374i, j11);
            c();
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.f78375j = true;
            return 2;
        }
    }

    public m(io.reactivex.rxjava3.core.h<T> hVar, int i11, boolean z11, boolean z12, cm0.a aVar) {
        super(hVar);
        this.f78362c = i11;
        this.f78363d = z11;
        this.f78364e = z12;
        this.f78365f = aVar;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78303b.x(new a(bVar, this.f78362c, this.f78363d, this.f78364e, this.f78365f));
    }
}
