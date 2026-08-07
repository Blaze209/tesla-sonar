package iu;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f81920c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile z f81921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f81922b = f81920c;

    private v(z zVar) {
        this.f81921a = zVar;
    }

    public static z b(z zVar) {
        return zVar instanceof v ? zVar : new v(zVar);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f81922b;
            Object obj2 = f81920c;
            if (obj != obj2) {
                return obj;
            }
            Object objA = this.f81921a.a();
            Object obj3 = this.f81922b;
            if (obj3 != obj2 && obj3 != objA) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
            }
            this.f81922b = objA;
            this.f81921a = null;
            return objA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // iu.b0
    public final Object a() {
        Object obj = this.f81922b;
        return obj == f81920c ? c() : obj;
    }
}
