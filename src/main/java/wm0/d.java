package wm0;

import io.reactivex.rxjava3.core.s;
import rm0.i;

/* JADX INFO: loaded from: classes9.dex */
final class d<T> extends e<T> implements rm0.a.InterfaceC2312a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e<T> f122076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f122077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    rm0.a<Object> f122078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f122079d;

    d(e<T> eVar) {
        this.f122076a = eVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        this.f122076a.a(sVar);
    }

    @Override // wm0.e
    public boolean Y() {
        return this.f122076a.Y();
    }

    @Override // wm0.e
    public boolean Z() {
        return this.f122076a.Z();
    }

    @Override // wm0.e
    public boolean a0() {
        return this.f122076a.a0();
    }

    void c0() {
        rm0.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f122078c;
                    if (aVar == null) {
                        this.f122077b = false;
                        return;
                    }
                    this.f122078c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (this.f122079d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f122079d) {
                    return;
                }
                this.f122079d = true;
                if (!this.f122077b) {
                    this.f122077b = true;
                    this.f122076a.onComplete();
                    return;
                }
                rm0.a<Object> aVar = this.f122078c;
                if (aVar == null) {
                    aVar = new rm0.a<>(4);
                    this.f122078c = aVar;
                }
                aVar.c(i.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        if (this.f122079d) {
            tm0.a.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f122079d) {
                    this.f122079d = true;
                    if (this.f122077b) {
                        rm0.a<Object> aVar = this.f122078c;
                        if (aVar == null) {
                            aVar = new rm0.a<>(4);
                            this.f122078c = aVar;
                        }
                        aVar.e(i.error(th2));
                        return;
                    }
                    this.f122077b = true;
                    z11 = false;
                }
                if (z11) {
                    tm0.a.r(th2);
                } else {
                    this.f122076a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        if (this.f122079d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f122079d) {
                    return;
                }
                if (!this.f122077b) {
                    this.f122077b = true;
                    this.f122076a.onNext(t11);
                    c0();
                } else {
                    rm0.a<Object> aVar = this.f122078c;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f122078c = aVar;
                    }
                    aVar.c(i.next(t11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        boolean z11 = true;
        if (!this.f122079d) {
            synchronized (this) {
                try {
                    if (!this.f122079d) {
                        if (this.f122077b) {
                            rm0.a<Object> aVar = this.f122078c;
                            if (aVar == null) {
                                aVar = new rm0.a<>(4);
                                this.f122078c = aVar;
                            }
                            aVar.c(i.disposable(bVar));
                            return;
                        }
                        this.f122077b = true;
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            bVar.dispose();
        } else {
            this.f122076a.onSubscribe(bVar);
            c0();
        }
    }

    @Override // rm0.a.InterfaceC2312a, cm0.j
    public boolean test(Object obj) {
        return i.acceptFull(obj, this.f122076a);
    }
}
