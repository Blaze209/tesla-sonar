package gm0;

import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T, R> implements s<T>, fm0.c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s<? super R> f69225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected am0.b f69226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected fm0.c<T> f69227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f69228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f69229e;

    public a(s<? super R> sVar) {
        this.f69225a = sVar;
    }

    protected boolean b() {
        return true;
    }

    @Override // fm0.h
    public void clear() {
        this.f69227c.clear();
    }

    @Override // am0.b
    public void dispose() {
        this.f69226b.dispose();
    }

    protected final void e(Throwable th2) {
        bm0.a.b(th2);
        this.f69226b.dispose();
        onError(th2);
    }

    protected final int f(int i11) {
        fm0.c<T> cVar = this.f69227c;
        if (cVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = cVar.requestFusion(i11);
        if (iRequestFusion != 0) {
            this.f69229e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f69226b.isDisposed();
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return this.f69227c.isEmpty();
    }

    @Override // fm0.h
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (this.f69228d) {
            return;
        }
        this.f69228d = true;
        this.f69225a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        if (this.f69228d) {
            tm0.a.r(th2);
        } else {
            this.f69228d = true;
            this.f69225a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public final void onSubscribe(am0.b bVar) {
        if (dm0.b.validate(this.f69226b, bVar)) {
            this.f69226b = bVar;
            if (bVar instanceof fm0.c) {
                this.f69227c = (fm0.c) bVar;
            }
            if (b()) {
                this.f69225a.onSubscribe(this);
                a();
            }
        }
    }

    protected void a() {
    }
}
