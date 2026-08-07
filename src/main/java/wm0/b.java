package wm0;

import androidx.camera.view.i;
import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T> extends e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a[] f122057c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a[] f122058d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f122059a = new AtomicReference<>(f122058d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f122060b;

    static final class a<T> extends AtomicBoolean implements am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s<? super T> f122061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f122062b;

        a(s<? super T> sVar, b<T> bVar) {
            this.f122061a = sVar;
            this.f122062b = bVar;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f122061a.onComplete();
        }

        public void b(Throwable th2) {
            if (get()) {
                tm0.a.r(th2);
            } else {
                this.f122061a.onError(th2);
            }
        }

        @Override // am0.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f122062b.e0(this);
            }
        }

        public void e(T t11) {
            if (get()) {
                return;
            }
            this.f122061a.onNext(t11);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get();
        }
    }

    b() {
    }

    public static <T> b<T> d0() {
        return new b<>();
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        if (c0(aVar)) {
            if (aVar.isDisposed()) {
                e0(aVar);
            }
        } else {
            Throwable th2 = this.f122060b;
            if (th2 != null) {
                sVar.onError(th2);
            } else {
                sVar.onComplete();
            }
        }
    }

    @Override // wm0.e
    public boolean Y() {
        return this.f122059a.get() == f122057c && this.f122060b == null;
    }

    @Override // wm0.e
    public boolean Z() {
        return this.f122059a.get().length != 0;
    }

    @Override // wm0.e
    public boolean a0() {
        return this.f122059a.get() == f122057c && this.f122060b != null;
    }

    boolean c0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f122059a.get();
            if (aVarArr == f122057c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!i.a(this.f122059a, aVarArr, aVarArr2));
        return true;
    }

    void e0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f122059a.get();
            if (aVarArr == f122057c || aVarArr == f122058d) {
                return;
            }
            int length = aVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f122058d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!i.a(this.f122059a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        a<T>[] aVarArr = this.f122059a.get();
        a<T>[] aVarArr2 = f122057c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f122059a.getAndSet(aVarArr2)) {
            aVar.a();
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        a<T>[] aVarArr = this.f122059a.get();
        a<T>[] aVarArr2 = f122057c;
        if (aVarArr == aVarArr2) {
            tm0.a.r(th2);
            return;
        }
        this.f122060b = th2;
        for (a<T> aVar : this.f122059a.getAndSet(aVarArr2)) {
            aVar.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        g.c(t11, "onNext called with a null value.");
        for (a<T> aVar : this.f122059a.get()) {
            aVar.e(t11);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        if (this.f122059a.get() == f122057c) {
            bVar.dispose();
        }
    }
}
