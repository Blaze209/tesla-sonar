package hm0;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d<T> extends io.reactivex.rxjava3.core.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f73184a;

    static final class a<T> implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f73185a;

        a(io.reactivex.rxjava3.core.d dVar) {
            this.f73185a = dVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f73185a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f73185a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f73185a.onComplete();
        }
    }

    public d(y<T> yVar) {
        this.f73184a = yVar;
    }

    @Override // io.reactivex.rxjava3.core.b
    protected void j(io.reactivex.rxjava3.core.d dVar) {
        this.f73184a.a(new a(dVar));
    }
}
