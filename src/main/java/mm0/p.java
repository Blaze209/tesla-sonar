package mm0;

import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;

/* JADX INFO: loaded from: classes9.dex */
public final class p<T> extends io.reactivex.rxjava3.core.o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92411a;

    static final class a<T> extends gm0.h<T> implements w<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        am0.b f92412c;

        a(s<? super T> sVar) {
            super(sVar);
        }

        @Override // gm0.h, am0.b
        public void dispose() {
            super.dispose();
            this.f92412c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            b(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f92412c, bVar)) {
                this.f92412c = bVar;
                this.f69239a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            a(t11);
        }
    }

    public p(y<? extends T> yVar) {
        this.f92411a = yVar;
    }

    public static <T> w<T> Y(s<? super T> sVar) {
        return new a(sVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(s<? super T> sVar) {
        this.f92411a.a(Y(sVar));
    }
}
