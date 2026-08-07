package nk0;

import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y<T> f95096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f95097b;

    private d(y<T> yVar, Throwable th2) {
        this.f95096a = yVar;
        this.f95097b = th2;
    }

    public static <T> d<T> a(Throwable th2) {
        if (th2 != null) {
            return new d<>(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> d<T> b(y<T> yVar) {
        if (yVar != null) {
            return new d<>(yVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
