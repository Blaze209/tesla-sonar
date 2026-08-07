package androidx.concurrent.futures;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f<V> extends a<V> {
    private f() {
    }

    @NonNull
    public static <V> f<V> t() {
        return new f<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean p(V v11) {
        return super.p(v11);
    }

    @Override // androidx.concurrent.futures.a
    public boolean q(@NonNull Throwable th2) {
        return super.q(th2);
    }
}
