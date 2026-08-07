package gm0;

import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public final class i<T> implements s<T>, am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s<? super T> f69241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.f<? super am0.b> f69242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.a f69243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    am0.b f69244d;

    public i(s<? super T> sVar, cm0.f<? super am0.b> fVar, cm0.a aVar) {
        this.f69241a = sVar;
        this.f69242b = fVar;
        this.f69243c = aVar;
    }

    @Override // am0.b
    public void dispose() {
        am0.b bVar = this.f69244d;
        dm0.b bVar2 = dm0.b.DISPOSED;
        if (bVar != bVar2) {
            this.f69244d = bVar2;
            try {
                this.f69243c.run();
            } catch (Throwable th2) {
                bm0.a.b(th2);
                tm0.a.r(th2);
            }
            bVar.dispose();
        }
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f69244d.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        am0.b bVar = this.f69244d;
        dm0.b bVar2 = dm0.b.DISPOSED;
        if (bVar != bVar2) {
            this.f69244d = bVar2;
            this.f69241a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        am0.b bVar = this.f69244d;
        dm0.b bVar2 = dm0.b.DISPOSED;
        if (bVar == bVar2) {
            tm0.a.r(th2);
        } else {
            this.f69244d = bVar2;
            this.f69241a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        this.f69241a.onNext(t11);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        try {
            this.f69242b.accept(bVar);
            if (dm0.b.validate(this.f69244d, bVar)) {
                this.f69244d = bVar;
                this.f69241a.onSubscribe(this);
            }
        } catch (Throwable th2) {
            bm0.a.b(th2);
            bVar.dispose();
            this.f69244d = dm0.b.DISPOSED;
            dm0.c.error(th2, this.f69241a);
        }
    }
}
