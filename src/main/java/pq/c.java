package pq;

/* JADX INFO: loaded from: classes4.dex */
final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f103584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.d<?> f103586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.h<?, byte[]> f103587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.c f103588e;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f103589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f103590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private nq.d<?> f103591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private nq.h<?, byte[]> f103592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private nq.c f103593e;

        b() {
        }

        @Override // pq.o.a
        public o a() {
            String str = "";
            if (this.f103589a == null) {
                str = " transportContext";
            }
            if (this.f103590b == null) {
                str = str + " transportName";
            }
            if (this.f103591c == null) {
                str = str + " event";
            }
            if (this.f103592d == null) {
                str = str + " transformer";
            }
            if (this.f103593e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f103589a, this.f103590b, this.f103591c, this.f103592d, this.f103593e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // pq.o.a
        o.a b(nq.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f103593e = cVar;
            return this;
        }

        @Override // pq.o.a
        o.a c(nq.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f103591c = dVar;
            return this;
        }

        @Override // pq.o.a
        o.a d(nq.h<?, byte[]> hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f103592d = hVar;
            return this;
        }

        @Override // pq.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f103589a = pVar;
            return this;
        }

        @Override // pq.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f103590b = str;
            return this;
        }
    }

    @Override // pq.o
    public nq.c b() {
        return this.f103588e;
    }

    @Override // pq.o
    nq.d<?> c() {
        return this.f103586c;
    }

    @Override // pq.o
    nq.h<?, byte[]> e() {
        return this.f103587d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f103584a.equals(oVar.f()) && this.f103585b.equals(oVar.g()) && this.f103586c.equals(oVar.c()) && this.f103587d.equals(oVar.e()) && this.f103588e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // pq.o
    public p f() {
        return this.f103584a;
    }

    @Override // pq.o
    public String g() {
        return this.f103585b;
    }

    public int hashCode() {
        return ((((((((this.f103584a.hashCode() ^ 1000003) * 1000003) ^ this.f103585b.hashCode()) * 1000003) ^ this.f103586c.hashCode()) * 1000003) ^ this.f103587d.hashCode()) * 1000003) ^ this.f103588e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f103584a + ", transportName=" + this.f103585b + ", event=" + this.f103586c + ", transformer=" + this.f103587d + ", encoding=" + this.f103588e + "}";
    }

    private c(p pVar, String str, nq.d<?> dVar, nq.h<?, byte[]> hVar, nq.c cVar) {
        this.f103584a = pVar;
        this.f103585b = str;
        this.f103586c = dVar;
        this.f103587d = hVar;
        this.f103588e = cVar;
    }
}
