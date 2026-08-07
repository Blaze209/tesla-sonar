package wm0;

import io.reactivex.rxjava3.core.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rm0.g;
import rm0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final b[] f122063d = new b[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final b[] f122064e = new b[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f122065f = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a<T> f122066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>[]> f122067b = new AtomicReference<>(f122063d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f122068c;

    interface a<T> {
        void a(Object obj);

        void add(T t11);

        void b(b<T> bVar);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();
    }

    static final class b<T> extends AtomicInteger implements am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s<? super T> f122069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T> f122070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f122071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f122072d;

        b(s<? super T> sVar, c<T> cVar) {
            this.f122069a = sVar;
            this.f122070b = cVar;
        }

        @Override // am0.b
        public void dispose() {
            if (this.f122072d) {
                return;
            }
            this.f122072d = true;
            this.f122070b.e0(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f122072d;
        }
    }

    c(a<T> aVar) {
        this.f122066a = aVar;
    }

    public static <T> c<T> d0() {
        return new c<>(new C2622c(16));
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        b<T> bVar = new b<>(sVar, this);
        sVar.onSubscribe(bVar);
        if (c0(bVar) && bVar.f122072d) {
            e0(bVar);
        } else {
            this.f122066a.b(bVar);
        }
    }

    @Override // wm0.e
    public boolean Y() {
        return i.isComplete(this.f122066a.get());
    }

    @Override // wm0.e
    public boolean Z() {
        return this.f122067b.get().length != 0;
    }

    @Override // wm0.e
    public boolean a0() {
        return i.isError(this.f122066a.get());
    }

    boolean c0(b<T> bVar) {
        b<T>[] bVarArr;
        b[] bVarArr2;
        do {
            bVarArr = this.f122067b.get();
            if (bVarArr == f122064e) {
                return false;
            }
            int length = bVarArr.length;
            bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
        } while (!androidx.camera.view.i.a(this.f122067b, bVarArr, bVarArr2));
        return true;
    }

    void e0(b<T> bVar) {
        b<T>[] bVarArr;
        b[] bVarArr2;
        do {
            bVarArr = this.f122067b.get();
            if (bVarArr == f122064e || bVarArr == f122063d) {
                return;
            }
            int length = bVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (bVarArr[i11] == bVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                bVarArr2 = f122063d;
            } else {
                b[] bVarArr3 = new b[length - 1];
                System.arraycopy(bVarArr, 0, bVarArr3, 0, i11);
                System.arraycopy(bVarArr, i11 + 1, bVarArr3, i11, (length - i11) - 1);
                bVarArr2 = bVarArr3;
            }
        } while (!androidx.camera.view.i.a(this.f122067b, bVarArr, bVarArr2));
    }

    b<T>[] f0(Object obj) {
        this.f122066a.compareAndSet(null, obj);
        return this.f122067b.getAndSet(f122064e);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (this.f122068c) {
            return;
        }
        this.f122068c = true;
        Object objComplete = i.complete();
        a<T> aVar = this.f122066a;
        aVar.a(objComplete);
        for (b<T> bVar : f0(objComplete)) {
            aVar.b(bVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (this.f122068c) {
            tm0.a.r(th2);
            return;
        }
        this.f122068c = true;
        Object objError = i.error(th2);
        a<T> aVar = this.f122066a;
        aVar.a(objError);
        for (b<T> bVar : f0(objError)) {
            aVar.b(bVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f122068c) {
            return;
        }
        a<T> aVar = this.f122066a;
        aVar.add(t11);
        for (b<T> bVar : this.f122067b.get()) {
            aVar.b(bVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        if (this.f122068c) {
            bVar.dispose();
        }
    }

    /* JADX INFO: renamed from: wm0.c$c, reason: collision with other inner class name */
    static final class C2622c<T> extends AtomicReference<Object> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Object> f122073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f122074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f122075c;

        C2622c(int i11) {
            this.f122073a = new ArrayList(i11);
        }

        @Override // wm0.c.a
        public void a(Object obj) {
            this.f122073a.add(obj);
            c();
            this.f122075c++;
            this.f122074b = true;
        }

        @Override // wm0.c.a
        public void add(T t11) {
            this.f122073a.add(t11);
            this.f122075c++;
        }

        @Override // wm0.c.a
        public void b(b<T> bVar) {
            int iIntValue;
            int i11;
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f122073a;
            s<? super T> sVar = bVar.f122069a;
            Integer num = (Integer) bVar.f122071c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                bVar.f122071c = 0;
            }
            int iAddAndGet = 1;
            while (!bVar.f122072d) {
                int i12 = this.f122075c;
                while (i12 != iIntValue) {
                    if (bVar.f122072d) {
                        bVar.f122071c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f122074b && (i11 = iIntValue + 1) == i12 && i11 == (i12 = this.f122075c)) {
                        if (i.isComplete(obj)) {
                            sVar.onComplete();
                        } else {
                            sVar.onError(i.getError(obj));
                        }
                        bVar.f122071c = null;
                        bVar.f122072d = true;
                        return;
                    }
                    sVar.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f122075c) {
                    bVar.f122071c = Integer.valueOf(iIntValue);
                    iAddAndGet = bVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            bVar.f122071c = null;
        }

        public void c() {
        }
    }
}
