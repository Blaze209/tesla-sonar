package lm0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class l<T> extends io.reactivex.rxjava3.core.o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T[] f90412a;

    static final class a<T> extends gm0.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T[] f90414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f90415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f90416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f90417e;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, T[] tArr) {
            this.f90413a = sVar;
            this.f90414b = tArr;
        }

        void a() {
            T[] tArr = this.f90414b;
            int length = tArr.length;
            for (int i11 = 0; i11 < length && !isDisposed(); i11++) {
                T t11 = tArr[i11];
                if (t11 == null) {
                    this.f90413a.onError(new NullPointerException("The element at index " + i11 + " is null"));
                    return;
                }
                this.f90413a.onNext(t11);
            }
            if (isDisposed()) {
                return;
            }
            this.f90413a.onComplete();
        }

        @Override // fm0.h
        public void clear() {
            this.f90415c = this.f90414b.length;
        }

        @Override // am0.b
        public void dispose() {
            this.f90417e = true;
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90417e;
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return this.f90415c == this.f90414b.length;
        }

        @Override // fm0.h
        public T poll() {
            int i11 = this.f90415c;
            T[] tArr = this.f90414b;
            if (i11 == tArr.length) {
                return null;
            }
            this.f90415c = i11 + 1;
            T t11 = tArr[i11];
            Objects.requireNonNull(t11, "The array element is null");
            return t11;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            this.f90416d = true;
            return 1;
        }
    }

    public l(T[] tArr) {
        this.f90412a = tArr;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        a aVar = new a(sVar, this.f90412a);
        sVar.onSubscribe(aVar);
        if (aVar.f90416d) {
            return;
        }
        aVar.a();
    }
}
