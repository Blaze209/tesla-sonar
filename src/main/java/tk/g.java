package tk;

import com.facebook.common.references.SharedReference;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class g<T> extends a<T> {
    private g(SharedReference<T> sharedReference, a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
    }

    @Override // tk.a
    /* JADX INFO: renamed from: n */
    public a<T> clone() {
        k.i(J());
        return new g(this.f114648b, this.f114649c, this.f114650d);
    }

    g(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2, false);
    }
}
