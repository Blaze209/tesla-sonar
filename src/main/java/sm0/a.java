package sm0;

import am0.b;
import io.reactivex.rxjava3.core.s;
import rm0.g;
import rm0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> implements s<T>, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s<? super T> f111444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f111445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f111446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f111447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    rm0.a<Object> f111448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f111449f;

    public a(s<? super T> sVar) {
        this(sVar, false);
    }

    void a() {
        rm0.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f111448e;
                    if (aVar == null) {
                        this.f111447d = false;
                        return;
                    }
                    this.f111448e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!aVar.a(this.f111444a));
    }

    @Override // am0.b
    public void dispose() {
        this.f111449f = true;
        this.f111446c.dispose();
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f111446c.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (this.f111449f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f111449f) {
                    return;
                }
                if (!this.f111447d) {
                    this.f111449f = true;
                    this.f111447d = true;
                    this.f111444a.onComplete();
                } else {
                    rm0.a<Object> aVar = this.f111448e;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f111448e = aVar;
                    }
                    aVar.c(i.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        if (this.f111449f) {
            tm0.a.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f111449f) {
                    if (this.f111447d) {
                        this.f111449f = true;
                        rm0.a<Object> aVar = this.f111448e;
                        if (aVar == null) {
                            aVar = new rm0.a<>(4);
                            this.f111448e = aVar;
                        }
                        Object objError = i.error(th2);
                        if (this.f111445b) {
                            aVar.c(objError);
                        } else {
                            aVar.e(objError);
                        }
                        return;
                    }
                    this.f111449f = true;
                    this.f111447d = true;
                    z11 = false;
                }
                if (z11) {
                    tm0.a.r(th2);
                } else {
                    this.f111444a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        if (this.f111449f) {
            return;
        }
        if (t11 == null) {
            this.f111446c.dispose();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f111449f) {
                    return;
                }
                if (!this.f111447d) {
                    this.f111447d = true;
                    this.f111444a.onNext(t11);
                    a();
                } else {
                    rm0.a<Object> aVar = this.f111448e;
                    if (aVar == null) {
                        aVar = new rm0.a<>(4);
                        this.f111448e = aVar;
                    }
                    aVar.c(i.next(t11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(b bVar) {
        if (dm0.b.validate(this.f111446c, bVar)) {
            this.f111446c = bVar;
            this.f111444a.onSubscribe(this);
        }
    }

    public a(s<? super T> sVar, boolean z11) {
        this.f111444a = sVar;
        this.f111445b = z11;
    }
}
