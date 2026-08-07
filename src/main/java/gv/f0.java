package gv;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f69803a = Charset.forName("UTF-8");

    public static abstract class a {

        /* JADX INFO: renamed from: gv.f0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1424a {

            /* JADX INFO: renamed from: gv.f0$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC1425a {
                @NonNull
                public abstract AbstractC1424a a();

                @NonNull
                public abstract AbstractC1425a b(@NonNull String str);

                @NonNull
                public abstract AbstractC1425a c(@NonNull String str);

                @NonNull
                public abstract AbstractC1425a d(@NonNull String str);
            }

            @NonNull
            public static AbstractC1425a a() {
                return new gv.d.b();
            }

            @NonNull
            public abstract String b();

            @NonNull
            public abstract String c();

            @NonNull
            public abstract String d();
        }

        public static abstract class b {
            @NonNull
            public abstract a a();

            @NonNull
            public abstract b b(List<AbstractC1424a> list);

            @NonNull
            public abstract b c(@NonNull int i11);

            @NonNull
            public abstract b d(@NonNull int i11);

            @NonNull
            public abstract b e(@NonNull String str);

            @NonNull
            public abstract b f(@NonNull long j11);

            @NonNull
            public abstract b g(@NonNull int i11);

            @NonNull
            public abstract b h(@NonNull long j11);

            @NonNull
            public abstract b i(@NonNull long j11);

            @NonNull
            public abstract b j(String str);
        }

        @NonNull
        public static b a() {
            return new gv.c.b();
        }

        public abstract List<AbstractC1424a> b();

        @NonNull
        public abstract int c();

        @NonNull
        public abstract int d();

        @NonNull
        public abstract String e();

        @NonNull
        public abstract long f();

        @NonNull
        public abstract int g();

        @NonNull
        public abstract long h();

        @NonNull
        public abstract long i();

        public abstract String j();
    }

    public static abstract class b {
        @NonNull
        public abstract f0 a();

        @NonNull
        public abstract b b(a aVar);

        @NonNull
        public abstract b c(String str);

        @NonNull
        public abstract b d(@NonNull String str);

        @NonNull
        public abstract b e(@NonNull String str);

        @NonNull
        public abstract b f(String str);

        @NonNull
        public abstract b g(String str);

        @NonNull
        public abstract b h(@NonNull String str);

        @NonNull
        public abstract b i(@NonNull String str);

        @NonNull
        public abstract b j(d dVar);

        @NonNull
        public abstract b k(int i11);

        @NonNull
        public abstract b l(@NonNull String str);

        @NonNull
        public abstract b m(@NonNull e eVar);
    }

    public static abstract class c {

        public static abstract class a {
            @NonNull
            public abstract c a();

            @NonNull
            public abstract a b(@NonNull String str);

            @NonNull
            public abstract a c(@NonNull String str);
        }

        @NonNull
        public static a a() {
            return new gv.e.b();
        }

        @NonNull
        public abstract String b();

        @NonNull
        public abstract String c();
    }

    public static abstract class d {

        public static abstract class a {
            public abstract d a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        public static abstract class b {

            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @NonNull
            public static a a() {
                return new g.b();
            }

            @NonNull
            public abstract byte[] b();

            @NonNull
            public abstract String c();
        }

        @NonNull
        public static a a() {
            return new f.b();
        }

        @NonNull
        public abstract List<b> b();

        public abstract String c();
    }

    public static abstract class e {

        public static abstract class a {

            /* JADX INFO: renamed from: gv.f0$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC1426a {
                @NonNull
                public abstract a a();

                @NonNull
                public abstract AbstractC1426a b(String str);

                @NonNull
                public abstract AbstractC1426a c(String str);

                @NonNull
                public abstract AbstractC1426a d(@NonNull String str);

                @NonNull
                public abstract AbstractC1426a e(@NonNull String str);

                @NonNull
                public abstract AbstractC1426a f(@NonNull String str);

                @NonNull
                public abstract AbstractC1426a g(@NonNull String str);
            }

            public static abstract class b {
                @NonNull
                public abstract String a();
            }

            @NonNull
            public static AbstractC1426a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            @NonNull
            public abstract String e();

            public abstract String f();

            public abstract b g();

            @NonNull
            public abstract String h();
        }

        public static abstract class b {
            @NonNull
            public abstract e a();

            @NonNull
            public abstract b b(@NonNull a aVar);

            @NonNull
            public abstract b c(String str);

            @NonNull
            public abstract b d(boolean z11);

            @NonNull
            public abstract b e(@NonNull c cVar);

            @NonNull
            public abstract b f(@NonNull Long l11);

            @NonNull
            public abstract b g(@NonNull List<d> list);

            @NonNull
            public abstract b h(@NonNull String str);

            @NonNull
            public abstract b i(int i11);

            @NonNull
            public abstract b j(@NonNull String str);

            @NonNull
            public b k(@NonNull byte[] bArr) {
                return j(new String(bArr, f0.f69803a));
            }

            @NonNull
            public abstract b l(@NonNull AbstractC1441e abstractC1441e);

            @NonNull
            public abstract b m(long j11);

            @NonNull
            public abstract b n(@NonNull f fVar);
        }

        public static abstract class c {

            public static abstract class a {
                @NonNull
                public abstract c a();

                @NonNull
                public abstract a b(int i11);

                @NonNull
                public abstract a c(int i11);

                @NonNull
                public abstract a d(long j11);

                @NonNull
                public abstract a e(@NonNull String str);

                @NonNull
                public abstract a f(@NonNull String str);

                @NonNull
                public abstract a g(@NonNull String str);

                @NonNull
                public abstract a h(long j11);

                @NonNull
                public abstract a i(boolean z11);

                @NonNull
                public abstract a j(int i11);
            }

            @NonNull
            public static a a() {
                return new k.b();
            }

            @NonNull
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @NonNull
            public abstract String e();

            @NonNull
            public abstract String f();

            @NonNull
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        public static abstract class d {

            public static abstract class a {

                /* JADX INFO: renamed from: gv.f0$e$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC1427a {
                    @NonNull
                    public abstract a a();

                    @NonNull
                    public abstract AbstractC1427a b(List<c> list);

                    @NonNull
                    public abstract AbstractC1427a c(Boolean bool);

                    @NonNull
                    public abstract AbstractC1427a d(c cVar);

                    @NonNull
                    public abstract AbstractC1427a e(@NonNull List<c> list);

                    @NonNull
                    public abstract AbstractC1427a f(@NonNull b bVar);

                    @NonNull
                    public abstract AbstractC1427a g(@NonNull List<c> list);

                    @NonNull
                    public abstract AbstractC1427a h(int i11);
                }

                public static abstract class b {

                    /* JADX INFO: renamed from: gv.f0$e$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC1428a {

                        /* JADX INFO: renamed from: gv.f0$e$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC1429a {
                            @NonNull
                            public abstract AbstractC1428a a();

                            @NonNull
                            public abstract AbstractC1429a b(long j11);

                            @NonNull
                            public abstract AbstractC1429a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1429a d(long j11);

                            @NonNull
                            public abstract AbstractC1429a e(String str);

                            @NonNull
                            public AbstractC1429a f(@NonNull byte[] bArr) {
                                return e(new String(bArr, f0.f69803a));
                            }
                        }

                        @NonNull
                        public static AbstractC1429a a() {
                            return new o.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(f0.f69803a);
                            }
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: gv.f0$e$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC1430b {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract AbstractC1430b b(@NonNull a aVar);

                        @NonNull
                        public abstract AbstractC1430b c(@NonNull List<AbstractC1428a> list);

                        @NonNull
                        public abstract AbstractC1430b d(@NonNull c cVar);

                        @NonNull
                        public abstract AbstractC1430b e(@NonNull AbstractC1432d abstractC1432d);

                        @NonNull
                        public abstract AbstractC1430b f(@NonNull List<AbstractC1434e> list);
                    }

                    public static abstract class c {

                        /* JADX INFO: renamed from: gv.f0$e$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC1431a {
                            @NonNull
                            public abstract c a();

                            @NonNull
                            public abstract AbstractC1431a b(@NonNull c cVar);

                            @NonNull
                            public abstract AbstractC1431a c(@NonNull List<AbstractC1434e.AbstractC1436b> list);

                            @NonNull
                            public abstract AbstractC1431a d(int i11);

                            @NonNull
                            public abstract AbstractC1431a e(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1431a f(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC1431a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        @NonNull
                        public abstract List<AbstractC1434e.AbstractC1436b> c();

                        public abstract int d();

                        public abstract String e();

                        @NonNull
                        public abstract String f();
                    }

                    /* JADX INFO: renamed from: gv.f0$e$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC1432d {

                        /* JADX INFO: renamed from: gv.f0$e$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC1433a {
                            @NonNull
                            public abstract AbstractC1432d a();

                            @NonNull
                            public abstract AbstractC1433a b(long j11);

                            @NonNull
                            public abstract AbstractC1433a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1433a d(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC1433a a() {
                            return new q.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        @NonNull
                        public abstract String d();
                    }

                    /* JADX INFO: renamed from: gv.f0$e$d$a$b$e, reason: collision with other inner class name */
                    public static abstract class AbstractC1434e {

                        /* JADX INFO: renamed from: gv.f0$e$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC1435a {
                            @NonNull
                            public abstract AbstractC1434e a();

                            @NonNull
                            public abstract AbstractC1435a b(@NonNull List<AbstractC1436b> list);

                            @NonNull
                            public abstract AbstractC1435a c(int i11);

                            @NonNull
                            public abstract AbstractC1435a d(@NonNull String str);
                        }

                        /* JADX INFO: renamed from: gv.f0$e$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC1436b {

                            /* JADX INFO: renamed from: gv.f0$e$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC1437a {
                                @NonNull
                                public abstract AbstractC1436b a();

                                @NonNull
                                public abstract AbstractC1437a b(@NonNull String str);

                                @NonNull
                                public abstract AbstractC1437a c(int i11);

                                @NonNull
                                public abstract AbstractC1437a d(long j11);

                                @NonNull
                                public abstract AbstractC1437a e(long j11);

                                @NonNull
                                public abstract AbstractC1437a f(@NonNull String str);
                            }

                            @NonNull
                            public static AbstractC1437a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @NonNull
                            public abstract String f();
                        }

                        @NonNull
                        public static AbstractC1435a a() {
                            return new r.b();
                        }

                        @NonNull
                        public abstract List<AbstractC1436b> b();

                        public abstract int c();

                        @NonNull
                        public abstract String d();
                    }

                    @NonNull
                    public static AbstractC1430b a() {
                        return new n.b();
                    }

                    public abstract a b();

                    @NonNull
                    public abstract List<AbstractC1428a> c();

                    public abstract c d();

                    @NonNull
                    public abstract AbstractC1432d e();

                    public abstract List<AbstractC1434e> f();
                }

                public static abstract class c {

                    /* JADX INFO: renamed from: gv.f0$e$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC1438a {
                        @NonNull
                        public abstract c a();

                        @NonNull
                        public abstract AbstractC1438a b(boolean z11);

                        @NonNull
                        public abstract AbstractC1438a c(int i11);

                        @NonNull
                        public abstract AbstractC1438a d(int i11);

                        @NonNull
                        public abstract AbstractC1438a e(@NonNull String str);
                    }

                    @NonNull
                    public static AbstractC1438a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    @NonNull
                    public abstract String d();

                    public abstract boolean e();
                }

                @NonNull
                public static AbstractC1427a a() {
                    return new m.b();
                }

                public abstract List<c> b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List<c> e();

                @NonNull
                public abstract b f();

                public abstract List<c> g();

                public abstract int h();

                @NonNull
                public abstract AbstractC1427a i();
            }

            public static abstract class b {
                @NonNull
                public abstract d a();

                @NonNull
                public abstract b b(@NonNull a aVar);

                @NonNull
                public abstract b c(@NonNull c cVar);

                @NonNull
                public abstract b d(@NonNull AbstractC1439d abstractC1439d);

                @NonNull
                public abstract b e(@NonNull f fVar);

                @NonNull
                public abstract b f(long j11);

                @NonNull
                public abstract b g(@NonNull String str);
            }

            public static abstract class c {

                public static abstract class a {
                    @NonNull
                    public abstract c a();

                    @NonNull
                    public abstract a b(Double d11);

                    @NonNull
                    public abstract a c(int i11);

                    @NonNull
                    public abstract a d(long j11);

                    @NonNull
                    public abstract a e(int i11);

                    @NonNull
                    public abstract a f(boolean z11);

                    @NonNull
                    public abstract a g(long j11);
                }

                @NonNull
                public static a a() {
                    return new u.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* JADX INFO: renamed from: gv.f0$e$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC1439d {

                /* JADX INFO: renamed from: gv.f0$e$d$d$a */
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC1439d a();

                    @NonNull
                    public abstract a b(@NonNull String str);
                }

                @NonNull
                public static a a() {
                    return new v.b();
                }

                @NonNull
                public abstract String b();
            }

            /* JADX INFO: renamed from: gv.f0$e$d$e, reason: collision with other inner class name */
            public static abstract class AbstractC1440e {

                /* JADX INFO: renamed from: gv.f0$e$d$e$a */
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC1440e a();

                    @NonNull
                    public abstract a b(@NonNull String str);

                    @NonNull
                    public abstract a c(@NonNull String str);

                    @NonNull
                    public abstract a d(@NonNull b bVar);

                    @NonNull
                    public abstract a e(@NonNull long j11);
                }

                /* JADX INFO: renamed from: gv.f0$e$d$e$b */
                public static abstract class b {

                    /* JADX INFO: renamed from: gv.f0$e$d$e$b$a */
                    public static abstract class a {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract a b(@NonNull String str);

                        @NonNull
                        public abstract a c(@NonNull String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    @NonNull
                    public abstract String b();

                    @NonNull
                    public abstract String c();
                }

                @NonNull
                public static a a() {
                    return new w.b();
                }

                @NonNull
                public abstract String b();

                @NonNull
                public abstract String c();

                @NonNull
                public abstract b d();

                @NonNull
                public abstract long e();
            }

            public static abstract class f {

                public static abstract class a {
                    @NonNull
                    public abstract f a();

                    @NonNull
                    public abstract a b(@NonNull List<AbstractC1440e> list);
                }

                @NonNull
                public static a a() {
                    return new y.b();
                }

                @NonNull
                public abstract List<AbstractC1440e> b();
            }

            @NonNull
            public static b a() {
                return new l.b();
            }

            @NonNull
            public abstract a b();

            @NonNull
            public abstract c c();

            public abstract AbstractC1439d d();

            public abstract f e();

            public abstract long f();

            @NonNull
            public abstract String g();

            @NonNull
            public abstract b h();
        }

        /* JADX INFO: renamed from: gv.f0$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC1441e {

            /* JADX INFO: renamed from: gv.f0$e$e$a */
            public static abstract class a {
                @NonNull
                public abstract AbstractC1441e a();

                @NonNull
                public abstract a b(@NonNull String str);

                @NonNull
                public abstract a c(boolean z11);

                @NonNull
                public abstract a d(int i11);

                @NonNull
                public abstract a e(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new z.b();
            }

            @NonNull
            public abstract String b();

            public abstract int c();

            @NonNull
            public abstract String d();

            public abstract boolean e();
        }

        public static abstract class f {

            public static abstract class a {
                @NonNull
                public abstract f a();

                @NonNull
                public abstract a b(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new a0.b();
            }

            @NonNull
            public abstract String b();
        }

        @NonNull
        public static b a() {
            return new h.b().d(false);
        }

        @NonNull
        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract List<d> f();

        @NonNull
        public abstract String g();

        public abstract int h();

        @NonNull
        public abstract String i();

        @NonNull
        public byte[] j() {
            return i().getBytes(f0.f69803a);
        }

        public abstract AbstractC1441e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        @NonNull
        public abstract b o();

        @NonNull
        e p(String str) {
            return o().c(str).a();
        }

        @NonNull
        e q(@NonNull List<d> list) {
            return o().g(list).a();
        }

        @NonNull
        e r(long j11, boolean z11, String str) {
            b bVarO = o();
            bVarO.f(Long.valueOf(j11));
            bVarO.d(z11);
            if (str != null) {
                bVarO.n(f.a().b(str).a());
            }
            return bVarO.a();
        }
    }

    @NonNull
    public static b b() {
        return new gv.b.C1423b();
    }

    public abstract a c();

    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    public abstract String g();

    public abstract String h();

    @NonNull
    public abstract String i();

    @NonNull
    public abstract String j();

    public abstract d k();

    public abstract int l();

    @NonNull
    public abstract String m();

    public abstract e n();

    @NonNull
    protected abstract b o();

    @NonNull
    public f0 p(String str) {
        b bVarC = o().c(str);
        if (n() != null) {
            bVarC.m(n().p(str));
        }
        return bVarC.a();
    }

    @NonNull
    public f0 q(a aVar) {
        return aVar == null ? this : o().b(aVar).a();
    }

    @NonNull
    public f0 r(@NonNull List<e.d> list) {
        if (n() != null) {
            return o().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    public f0 s(String str) {
        return o().f(str).a();
    }

    @NonNull
    public f0 t(String str) {
        return o().g(str).a();
    }

    @NonNull
    public f0 u(@NonNull d dVar) {
        return o().m(null).j(dVar).a();
    }

    @NonNull
    public f0 v(long j11, boolean z11, String str) {
        b bVarO = o();
        if (n() != null) {
            bVarO.m(n().r(j11, z11, str));
        }
        return bVarO.a();
    }
}
