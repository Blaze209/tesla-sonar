package yu;

/* JADX INFO: loaded from: classes5.dex */
public class t<T> implements yv.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f125876c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f125877a = f125876c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile yv.b<T> f125878b;

    public t(yv.b<T> bVar) {
        this.f125878b = bVar;
    }

    @Override // yv.b
    public T get() {
        T t11;
        T t12 = (T) this.f125877a;
        Object obj = f125876c;
        if (t12 != obj) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = (T) this.f125877a;
                if (t11 == obj) {
                    t11 = this.f125878b.get();
                    this.f125877a = t11;
                    this.f125878b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }
}
