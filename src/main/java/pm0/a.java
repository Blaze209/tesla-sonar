package pm0;

import fm0.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T, R> implements fm0.a<T>, e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final fm0.a<? super R> f103453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected nr0.c f103454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e<T> f103455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f103456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f103457e;

    public a(fm0.a<? super R> aVar) {
        this.f103453a = aVar;
    }

    protected boolean c() {
        return true;
    }

    @Override // nr0.c
    public void cancel() {
        this.f103454b.cancel();
    }

    @Override // fm0.h
    public void clear() {
        this.f103455c.clear();
    }

    protected final void d(Throwable th2) {
        bm0.a.b(th2);
        this.f103454b.cancel();
        onError(th2);
    }

    protected final int e(int i11) {
        e<T> eVar = this.f103455c;
        if (eVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = eVar.requestFusion(i11);
        if (iRequestFusion != 0) {
            this.f103457e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return this.f103455c.isEmpty();
    }

    @Override // fm0.h
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nr0.b
    public void onComplete() {
        if (this.f103456d) {
            return;
        }
        this.f103456d = true;
        this.f103453a.onComplete();
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        if (this.f103456d) {
            tm0.a.r(th2);
        } else {
            this.f103456d = true;
            this.f103453a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public final void onSubscribe(nr0.c cVar) {
        if (qm0.d.validate(this.f103454b, cVar)) {
            this.f103454b = cVar;
            if (cVar instanceof e) {
                this.f103455c = (e) cVar;
            }
            if (c()) {
                this.f103453a.onSubscribe(this);
                b();
            }
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        this.f103454b.request(j11);
    }

    protected void b() {
    }
}
