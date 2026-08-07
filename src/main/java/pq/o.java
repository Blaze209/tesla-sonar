package pq;

/* JADX INFO: loaded from: classes4.dex */
abstract class o {

    public static abstract class a {
        public abstract o a();

        abstract a b(nq.c cVar);

        abstract a c(nq.d<?> dVar);

        abstract a d(nq.h<?, byte[]> hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract nq.c b();

    abstract nq.d<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract nq.h<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
