package ig;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f77679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wf.a<?, ?> f77680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected T f77681c;

    public c() {
        this.f77679a = new b<>();
        this.f77681c = null;
    }

    public T a(b<T> bVar) {
        return this.f77681c;
    }

    public final T b(float f11, float f12, T t11, T t12, float f13, float f14, float f15) {
        return a(this.f77679a.h(f11, f12, t11, t12, f13, f14, f15));
    }

    public final void c(wf.a<?, ?> aVar) {
        this.f77680b = aVar;
    }

    public c(T t11) {
        this.f77679a = new b<>();
        this.f77681c = t11;
    }
}
