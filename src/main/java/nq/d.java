package nq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T> {
    public static <T> d<T> f(T t11) {
        return new a(null, t11, f.DEFAULT, null, null);
    }

    public static <T> d<T> g(T t11, g gVar) {
        return new a(null, t11, f.DEFAULT, gVar, null);
    }

    public static <T> d<T> h(T t11) {
        return new a(null, t11, f.VERY_LOW, null, null);
    }

    public static <T> d<T> i(T t11) {
        return new a(null, t11, f.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract e b();

    public abstract T c();

    public abstract f d();

    public abstract g e();
}
