package wz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f122445b = "Invalid or non Implemented status";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f122446a;

    public f(e eVar) {
        this.f122446a = eVar;
    }

    public abstract void a(Object obj, Object obj2);

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f122445b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) {
        throw new RuntimeException(f122445b + " setValue in " + getClass() + " key=" + str);
    }

    public f<?> f(String str) {
        throw new RuntimeException(f122445b + " startArray in " + getClass() + " key=" + str);
    }

    public f<?> g(String str) {
        throw new RuntimeException(f122445b + " startObject(String key) in " + getClass() + " key=" + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T b(Object obj) {
        return obj;
    }
}
