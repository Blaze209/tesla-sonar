package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class h extends f0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f69812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f0.e.a f69814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0.e.f f69815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0.e.AbstractC1441e f69816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0.e.c f69817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<f0.e.d> f69818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f69819l;

    static final class b extends f0.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f69823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f69824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f69825f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f0.e.a f69826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f0.e.f f69827h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f0.e.AbstractC1441e f69828i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f0.e.c f69829j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<f0.e.d> f69830k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f69831l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f69832m;

        @Override // gv.f0.e.b
        public f0.e a() {
            String str;
            String str2;
            f0.e.a aVar;
            if (this.f69832m == 7 && (str = this.f69820a) != null && (str2 = this.f69821b) != null && (aVar = this.f69826g) != null) {
                return new h(str, str2, this.f69822c, this.f69823d, this.f69824e, this.f69825f, aVar, this.f69827h, this.f69828i, this.f69829j, this.f69830k, this.f69831l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69820a == null) {
                sb2.append(" generator");
            }
            if (this.f69821b == null) {
                sb2.append(" identifier");
            }
            if ((this.f69832m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f69832m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f69826g == null) {
                sb2.append(" app");
            }
            if ((this.f69832m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.b
        public f0.e.b b(f0.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f69826g = aVar;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b c(String str) {
            this.f69822c = str;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b d(boolean z11) {
            this.f69825f = z11;
            this.f69832m = (byte) (this.f69832m | 2);
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b e(f0.e.c cVar) {
            this.f69829j = cVar;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b f(Long l11) {
            this.f69824e = l11;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b g(List<f0.e.d> list) {
            this.f69830k = list;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f69820a = str;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b i(int i11) {
            this.f69831l = i11;
            this.f69832m = (byte) (this.f69832m | 4);
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f69821b = str;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b l(f0.e.AbstractC1441e abstractC1441e) {
            this.f69828i = abstractC1441e;
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b m(long j11) {
            this.f69823d = j11;
            this.f69832m = (byte) (this.f69832m | 1);
            return this;
        }

        @Override // gv.f0.e.b
        public f0.e.b n(f0.e.f fVar) {
            this.f69827h = fVar;
            return this;
        }

        b() {
        }

        private b(f0.e eVar) {
            this.f69820a = eVar.g();
            this.f69821b = eVar.i();
            this.f69822c = eVar.c();
            this.f69823d = eVar.l();
            this.f69824e = eVar.e();
            this.f69825f = eVar.n();
            this.f69826g = eVar.b();
            this.f69827h = eVar.m();
            this.f69828i = eVar.k();
            this.f69829j = eVar.d();
            this.f69830k = eVar.f();
            this.f69831l = eVar.h();
            this.f69832m = (byte) 7;
        }
    }

    @Override // gv.f0.e
    @NonNull
    public f0.e.a b() {
        return this.f69814g;
    }

    @Override // gv.f0.e
    public String c() {
        return this.f69810c;
    }

    @Override // gv.f0.e
    public f0.e.c d() {
        return this.f69817j;
    }

    @Override // gv.f0.e
    public Long e() {
        return this.f69812e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l11;
        f0.e.f fVar;
        f0.e.AbstractC1441e abstractC1441e;
        f0.e.c cVar;
        List<f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e) {
            f0.e eVar = (f0.e) obj;
            if (this.f69808a.equals(eVar.g()) && this.f69809b.equals(eVar.i()) && ((str = this.f69810c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f69811d == eVar.l() && ((l11 = this.f69812e) != null ? l11.equals(eVar.e()) : eVar.e() == null) && this.f69813f == eVar.n() && this.f69814g.equals(eVar.b()) && ((fVar = this.f69815h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC1441e = this.f69816i) != null ? abstractC1441e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f69817j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f69818k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f69819l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e
    public List<f0.e.d> f() {
        return this.f69818k;
    }

    @Override // gv.f0.e
    @NonNull
    public String g() {
        return this.f69808a;
    }

    @Override // gv.f0.e
    public int h() {
        return this.f69819l;
    }

    public int hashCode() {
        int iHashCode = (((this.f69808a.hashCode() ^ 1000003) * 1000003) ^ this.f69809b.hashCode()) * 1000003;
        String str = this.f69810c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f69811d;
        int i11 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        Long l11 = this.f69812e;
        int iHashCode3 = (((((i11 ^ (l11 == null ? 0 : l11.hashCode())) * 1000003) ^ (this.f69813f ? 1231 : 1237)) * 1000003) ^ this.f69814g.hashCode()) * 1000003;
        f0.e.f fVar = this.f69815h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.AbstractC1441e abstractC1441e = this.f69816i;
        int iHashCode5 = (iHashCode4 ^ (abstractC1441e == null ? 0 : abstractC1441e.hashCode())) * 1000003;
        f0.e.c cVar = this.f69817j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f69818k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f69819l;
    }

    @Override // gv.f0.e
    @NonNull
    public String i() {
        return this.f69809b;
    }

    @Override // gv.f0.e
    public f0.e.AbstractC1441e k() {
        return this.f69816i;
    }

    @Override // gv.f0.e
    public long l() {
        return this.f69811d;
    }

    @Override // gv.f0.e
    public f0.e.f m() {
        return this.f69815h;
    }

    @Override // gv.f0.e
    public boolean n() {
        return this.f69813f;
    }

    @Override // gv.f0.e
    public f0.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f69808a + ", identifier=" + this.f69809b + ", appQualitySessionId=" + this.f69810c + ", startedAt=" + this.f69811d + ", endedAt=" + this.f69812e + ", crashed=" + this.f69813f + ", app=" + this.f69814g + ", user=" + this.f69815h + ", os=" + this.f69816i + ", device=" + this.f69817j + ", events=" + this.f69818k + ", generatorType=" + this.f69819l + "}";
    }

    private h(String str, String str2, String str3, long j11, Long l11, boolean z11, f0.e.a aVar, f0.e.f fVar, f0.e.AbstractC1441e abstractC1441e, f0.e.c cVar, List<f0.e.d> list, int i11) {
        this.f69808a = str;
        this.f69809b = str2;
        this.f69810c = str3;
        this.f69811d = j11;
        this.f69812e = l11;
        this.f69813f = z11;
        this.f69814g = aVar;
        this.f69815h = fVar;
        this.f69816i = abstractC1441e;
        this.f69817j = cVar;
        this.f69818k = list;
        this.f69819l = i11;
    }
}
