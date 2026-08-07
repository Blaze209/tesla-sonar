package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f92374a;

    public i(T t11) {
        this.f92374a = t11;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        wVar.onSubscribe(am0.b.c());
        wVar.onSuccess(this.f92374a);
    }
}
