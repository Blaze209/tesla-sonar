package vj;

/* JADX INFO: loaded from: classes3.dex */
public class a<R> implements b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<?> f119524a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<?> f119525b = new C2559a();

    /* JADX INFO: renamed from: vj.a$a, reason: collision with other inner class name */
    public static class C2559a<R> implements c<R> {
        @Override // vj.c
        public b<R> a(dj.a aVar, boolean z11) {
            return a.f119524a;
        }
    }

    public static <R> c<R> b() {
        return (c<R>) f119525b;
    }

    @Override // vj.b
    public boolean a(Object obj, b.a aVar) {
        return false;
    }
}
