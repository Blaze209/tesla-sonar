package oq;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f98444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f98445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f98446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<t> f98448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f98449g;

    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f98450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f98451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f98452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f98453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f98454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<t> f98455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f98456g;

        b() {
        }

        @Override // oq.u.a
        public u a() {
            String str = "";
            if (this.f98450a == null) {
                str = " requestTimeMs";
            }
            if (this.f98451b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f98450a.longValue(), this.f98451b.longValue(), this.f98452c, this.f98453d, this.f98454e, this.f98455f, this.f98456g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // oq.u.a
        public u.a b(o oVar) {
            this.f98452c = oVar;
            return this;
        }

        @Override // oq.u.a
        public u.a c(List<t> list) {
            this.f98455f = list;
            return this;
        }

        @Override // oq.u.a
        u.a d(Integer num) {
            this.f98453d = num;
            return this;
        }

        @Override // oq.u.a
        u.a e(String str) {
            this.f98454e = str;
            return this;
        }

        @Override // oq.u.a
        public u.a f(x xVar) {
            this.f98456g = xVar;
            return this;
        }

        @Override // oq.u.a
        public u.a g(long j11) {
            this.f98450a = Long.valueOf(j11);
            return this;
        }

        @Override // oq.u.a
        public u.a h(long j11) {
            this.f98451b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // oq.u
    public o b() {
        return this.f98445c;
    }

    @Override // oq.u
    public List<t> c() {
        return this.f98448f;
    }

    @Override // oq.u
    public Integer d() {
        return this.f98446d;
    }

    @Override // oq.u
    public String e() {
        return this.f98447e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f98443a == uVar.g() && this.f98444b == uVar.h() && ((oVar = this.f98445c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f98446d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f98447e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f98448f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f98449g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // oq.u
    public x f() {
        return this.f98449g;
    }

    @Override // oq.u
    public long g() {
        return this.f98443a;
    }

    @Override // oq.u
    public long h() {
        return this.f98444b;
    }

    public int hashCode() {
        long j11 = this.f98443a;
        long j12 = this.f98444b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f98445c;
        int iHashCode = (i11 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f98446d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f98447e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f98448f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f98449g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f98443a + ", requestUptimeMs=" + this.f98444b + ", clientInfo=" + this.f98445c + ", logSource=" + this.f98446d + ", logSourceName=" + this.f98447e + ", logEvents=" + this.f98448f + ", qosTier=" + this.f98449g + "}";
    }

    private k(long j11, long j12, o oVar, Integer num, String str, List<t> list, x xVar) {
        this.f98443a = j11;
        this.f98444b = j12;
        this.f98445c = oVar;
        this.f98446d = num;
        this.f98447e = str;
        this.f98448f = list;
        this.f98449g = xVar;
    }
}
