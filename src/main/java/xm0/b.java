package xm0;

import io.reactivex.rxjava3.core.i;
import nr0.c;
import qm0.d;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T> implements i<T>, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final nr0.b<? super T> f123796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f123797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f123798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f123799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    rm0.a<Object> f123800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f123801f;

    public b(nr0.b<? super T> bVar) {
        this(bVar, false);
    }

    void b() {
        rm0.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f123800e;
                    if (aVar == null) {
                        this.f123799d = false;
                        return;
                    }
                    this.f123800e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!aVar.b(this.f123796a));
    }

    @Override // nr0.c
    public void cancel() {
        this.f123798c.cancel();
    }

    @Override // nr0.b
    public void onComplete() {
        if (this.f123801f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f123801f) {
                    return;
                }
                if (!this.f123799d) {
                    this.f123801f = true;
                    this.f123799d = true;
                    this.f123796a.onComplete();
                } else {
                    rm0.a<Object> aVar = this.f123800e;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f123800e = aVar;
                    }
                    aVar.c(rm0.i.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        if (this.f123801f) {
            tm0.a.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f123801f) {
                    if (this.f123799d) {
                        this.f123801f = true;
                        rm0.a<Object> aVar = this.f123800e;
                        if (aVar == null) {
                            aVar = new rm0.a<>(4);
                            this.f123800e = aVar;
                        }
                        Object objError = rm0.i.error(th2);
                        if (this.f123797b) {
                            aVar.c(objError);
                        } else {
                            aVar.e(objError);
                        }
                        return;
                    }
                    this.f123801f = true;
                    this.f123799d = true;
                    z11 = false;
                }
                if (z11) {
                    tm0.a.r(th2);
                } else {
                    this.f123796a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // nr0.b
    public void onNext(T t11) {
        if (this.f123801f) {
            return;
        }
        if (t11 == null) {
            this.f123798c.cancel();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f123801f) {
                    return;
                }
                if (!this.f123799d) {
                    this.f123799d = true;
                    this.f123796a.onNext(t11);
                    b();
                } else {
                    rm0.a<Object> aVar = this.f123800e;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f123800e = aVar;
                    }
                    aVar.c(rm0.i.next(t11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public void onSubscribe(c cVar) {
        if (d.validate(this.f123798c, cVar)) {
            this.f123798c = cVar;
            this.f123796a.onSubscribe(this);
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        this.f123798c.request(j11);
    }

    public b(nr0.b<? super T> bVar, boolean z11) {
        this.f123796a = bVar;
        this.f123797b = z11;
    }
}
