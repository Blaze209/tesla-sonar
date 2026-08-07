package xw;

/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f124038c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e<T> f124039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f124040b = f124038c;

    private a(e<T> eVar) {
        this.f124039a = eVar;
    }

    public static <P extends e<T>, T> e<T> a(P p11) {
        d.b(p11);
        return p11 instanceof a ? p11 : new a(p11);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f124038c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11;
        T t12 = (T) this.f124040b;
        Object obj = f124038c;
        if (t12 != obj) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = (T) this.f124040b;
                if (t11 == obj) {
                    t11 = this.f124039a.get();
                    this.f124040b = b(this.f124040b, t11);
                    this.f124039a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }
}
