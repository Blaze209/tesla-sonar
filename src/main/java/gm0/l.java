package gm0;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class l<T> implements w<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<am0.b> f69249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w<? super T> f69250b;

    public l(AtomicReference<am0.b> atomicReference, w<? super T> wVar) {
        this.f69249a = atomicReference;
        this.f69250b = wVar;
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onError(Throwable th2) {
        this.f69250b.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSubscribe(am0.b bVar) {
        dm0.b.replace(this.f69249a, bVar);
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSuccess(T t11) {
        this.f69250b.onSuccess(t11);
    }
}
