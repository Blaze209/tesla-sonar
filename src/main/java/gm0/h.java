package gm0;

import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public class h<T> extends b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s<? super T> f69239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected T f69240b;

    public h(s<? super T> sVar) {
        this.f69239a = sVar;
    }

    public final void a(T t11) {
        int i11 = get();
        if ((i11 & 54) != 0) {
            return;
        }
        s<? super T> sVar = this.f69239a;
        if (i11 == 8) {
            this.f69240b = t11;
            lazySet(16);
            sVar.onNext(null);
        } else {
            lazySet(2);
            sVar.onNext(t11);
        }
        if (get() != 4) {
            sVar.onComplete();
        }
    }

    public final void b(Throwable th2) {
        if ((get() & 54) != 0) {
            tm0.a.r(th2);
        } else {
            lazySet(2);
            this.f69239a.onError(th2);
        }
    }

    @Override // fm0.h
    public final void clear() {
        lazySet(32);
        this.f69240b = null;
    }

    @Override // am0.b
    public void dispose() {
        set(4);
        this.f69240b = null;
    }

    @Override // am0.b
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // fm0.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // fm0.h
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t11 = this.f69240b;
        this.f69240b = null;
        lazySet(32);
        return t11;
    }

    @Override // fm0.d
    public final int requestFusion(int i11) {
        if ((i11 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
