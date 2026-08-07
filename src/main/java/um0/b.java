package um0;

import rm0.i;

/* JADX INFO: loaded from: classes9.dex */
final class b<T> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a<T> f116472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f116473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    rm0.a<Object> f116474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f116475e;

    b(a<T> aVar) {
        this.f116472b = aVar;
    }

    void A() {
        rm0.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f116474d;
                    if (aVar == null) {
                        this.f116473c = false;
                        return;
                    }
                    this.f116474d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.b(this.f116472b);
        }
    }

    @Override // nr0.b
    public void onComplete() {
        if (this.f116475e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f116475e) {
                    return;
                }
                this.f116475e = true;
                if (!this.f116473c) {
                    this.f116473c = true;
                    this.f116472b.onComplete();
                    return;
                }
                rm0.a<Object> aVar = this.f116474d;
                if (aVar == null) {
                    aVar = new rm0.a<>(4);
                    this.f116474d = aVar;
                }
                aVar.c(i.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        if (this.f116475e) {
            tm0.a.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f116475e) {
                    this.f116475e = true;
                    if (this.f116473c) {
                        rm0.a<Object> aVar = this.f116474d;
                        if (aVar == null) {
                            aVar = new rm0.a<>(4);
                            this.f116474d = aVar;
                        }
                        aVar.e(i.error(th2));
                        return;
                    }
                    this.f116473c = true;
                    z11 = false;
                }
                if (z11) {
                    tm0.a.r(th2);
                } else {
                    this.f116472b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // nr0.b
    public void onNext(T t11) {
        if (this.f116475e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f116475e) {
                    return;
                }
                if (!this.f116473c) {
                    this.f116473c = true;
                    this.f116472b.onNext(t11);
                    A();
                } else {
                    rm0.a<Object> aVar = this.f116474d;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f116474d = aVar;
                    }
                    aVar.c(i.next(t11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nr0.b
    public void onSubscribe(nr0.c cVar) {
        boolean z11 = true;
        if (!this.f116475e) {
            synchronized (this) {
                try {
                    if (!this.f116475e) {
                        if (this.f116473c) {
                            rm0.a<Object> aVar = this.f116474d;
                            if (aVar == null) {
                                aVar = new rm0.a<>(4);
                                this.f116474d = aVar;
                            }
                            aVar.c(i.subscription(cVar));
                            return;
                        }
                        this.f116473c = true;
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            cVar.cancel();
        } else {
            this.f116472b.onSubscribe(cVar);
            A();
        }
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f116472b.subscribe(bVar);
    }
}
