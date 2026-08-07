package pm0;

import fm0.e;
import io.reactivex.rxjava3.core.i;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b<T, R> implements i<T>, e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final nr0.b<? super R> f103458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected nr0.c f103459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e<T> f103460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f103461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f103462e;

    public b(nr0.b<? super R> bVar) {
        this.f103458a = bVar;
    }

    protected boolean c() {
        return true;
    }

    @Override // nr0.c
    public void cancel() {
        this.f103459b.cancel();
    }

    @Override // fm0.h
    public void clear() {
        this.f103460c.clear();
    }

    protected final void d(Throwable th2) {
        bm0.a.b(th2);
        this.f103459b.cancel();
        onError(th2);
    }

    protected final int e(int i11) {
        e<T> eVar = this.f103460c;
        if (eVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = eVar.requestFusion(i11);
        if (iRequestFusion != 0) {
            this.f103462e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return this.f103460c.isEmpty();
    }

    @Override // fm0.h
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nr0.b
    public void onComplete() {
        if (this.f103461d) {
            return;
        }
        this.f103461d = true;
        this.f103458a.onComplete();
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        if (this.f103461d) {
            tm0.a.r(th2);
        } else {
            this.f103461d = true;
            this.f103458a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public final void onSubscribe(nr0.c cVar) {
        if (qm0.d.validate(this.f103459b, cVar)) {
            this.f103459b = cVar;
            if (cVar instanceof e) {
                this.f103460c = (e) cVar;
            }
            if (c()) {
                this.f103458a.onSubscribe(this);
                b();
            }
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        this.f103459b.request(j11);
    }

    protected void b() {
    }
}
