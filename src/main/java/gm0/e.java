package gm0;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes9.dex */
public final class e<T> extends CountDownLatch implements w<T>, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f69231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f69232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    am0.b f69233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f69234d;

    public e() {
        super(1);
    }

    public T a() {
        if (getCount() != 0) {
            try {
                rm0.d.a();
                await();
            } catch (InterruptedException e11) {
                b();
                throw rm0.g.h(e11);
            }
        }
        Throwable th2 = this.f69232b;
        if (th2 == null) {
            return this.f69231a;
        }
        throw rm0.g.h(th2);
    }

    void b() {
        this.f69234d = true;
        am0.b bVar = this.f69233c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onError(Throwable th2) {
        this.f69232b = th2;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSubscribe(am0.b bVar) {
        this.f69233c = bVar;
        if (this.f69234d) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSuccess(T t11) {
        this.f69231a = t11;
        countDown();
    }
}
