package km0;

import fm0.e;
import fm0.h;
import io.reactivex.rxjava3.core.i;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import nr0.c;
import qm0.d;
import rm0.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T> extends AtomicInteger implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final rm0.b f86297a = new rm0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f86298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f86299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    h<T> f86300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f86301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f86302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f86303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f86304h;

    public a(int i11, f fVar) {
        this.f86299c = fVar;
        this.f86298b = i11;
    }

    abstract void b();

    abstract void c();

    abstract void d();

    abstract void e();

    final void f() {
        this.f86303g = true;
        this.f86301e.cancel();
        c();
        this.f86297a.d();
        if (getAndIncrement() == 0) {
            this.f86300d.clear();
            b();
        }
    }

    @Override // nr0.b
    public final void onComplete() {
        this.f86302f = true;
        d();
    }

    @Override // nr0.b
    public final void onError(Throwable th2) {
        if (this.f86297a.c(th2)) {
            if (this.f86299c == f.IMMEDIATE) {
                c();
            }
            this.f86302f = true;
            d();
        }
    }

    @Override // nr0.b
    public final void onNext(T t11) {
        if (t11 == null || this.f86300d.offer(t11)) {
            d();
        } else {
            this.f86301e.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public final void onSubscribe(c cVar) {
        if (d.validate(this.f86301e, cVar)) {
            this.f86301e = cVar;
            if (cVar instanceof e) {
                e eVar = (e) cVar;
                int iRequestFusion = eVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f86300d = eVar;
                    this.f86304h = true;
                    this.f86302f = true;
                    e();
                    d();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f86300d = eVar;
                    e();
                    this.f86301e.request(this.f86298b);
                    return;
                }
            }
            this.f86300d = new nm0.b(this.f86298b);
            e();
            this.f86301e.request(this.f86298b);
        }
    }
}
