package oq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f98426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f98427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f98428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f98429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f98430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f98431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f98432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f98433i;

    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f98434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f98435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f98436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f98437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f98438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f98439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f98440g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f98441h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f98442i;

        b() {
        }

        @Override // oq.t.a
        public t a() {
            String str = "";
            if (this.f98434a == null) {
                str = " eventTimeMs";
            }
            if (this.f98437d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f98440g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f98434a.longValue(), this.f98435b, this.f98436c, this.f98437d.longValue(), this.f98438e, this.f98439f, this.f98440g.longValue(), this.f98441h, this.f98442i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // oq.t.a
        public t.a b(p pVar) {
            this.f98436c = pVar;
            return this;
        }

        @Override // oq.t.a
        public t.a c(Integer num) {
            this.f98435b = num;
            return this;
        }

        @Override // oq.t.a
        public t.a d(long j11) {
            this.f98434a = Long.valueOf(j11);
            return this;
        }

        @Override // oq.t.a
        public t.a e(long j11) {
            this.f98437d = Long.valueOf(j11);
            return this;
        }

        @Override // oq.t.a
        public t.a f(q qVar) {
            this.f98442i = qVar;
            return this;
        }

        @Override // oq.t.a
        public t.a g(w wVar) {
            this.f98441h = wVar;
            return this;
        }

        @Override // oq.t.a
        t.a h(byte[] bArr) {
            this.f98438e = bArr;
            return this;
        }

        @Override // oq.t.a
        t.a i(String str) {
            this.f98439f = str;
            return this;
        }

        @Override // oq.t.a
        public t.a j(long j11) {
            this.f98440g = Long.valueOf(j11);
            return this;
        }
    }

    @Override // oq.t
    public p b() {
        return this.f98427c;
    }

    @Override // oq.t
    public Integer c() {
        return this.f98426b;
    }

    @Override // oq.t
    public long d() {
        return this.f98425a;
    }

    @Override // oq.t
    public long e() {
        return this.f98428d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f98425a == tVar.d() && ((num = this.f98426b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f98427c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f98428d == tVar.e()) {
                if (Arrays.equals(this.f98429e, tVar instanceof j ? ((j) tVar).f98429e : tVar.h()) && ((str = this.f98430f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f98431g == tVar.j() && ((wVar = this.f98432h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f98433i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oq.t
    public q f() {
        return this.f98433i;
    }

    @Override // oq.t
    public w g() {
        return this.f98432h;
    }

    @Override // oq.t
    public byte[] h() {
        return this.f98429e;
    }

    public int hashCode() {
        long j11 = this.f98425a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f98426b;
        int iHashCode = (i11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f98427c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j12 = this.f98428d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f98429e)) * 1000003;
        String str = this.f98430f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j13 = this.f98431g;
        int i12 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        w wVar = this.f98432h;
        int iHashCode5 = (i12 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f98433i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // oq.t
    public String i() {
        return this.f98430f;
    }

    @Override // oq.t
    public long j() {
        return this.f98431g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f98425a + ", eventCode=" + this.f98426b + ", complianceData=" + this.f98427c + ", eventUptimeMs=" + this.f98428d + ", sourceExtension=" + Arrays.toString(this.f98429e) + ", sourceExtensionJsonProto3=" + this.f98430f + ", timezoneOffsetSeconds=" + this.f98431g + ", networkConnectionInfo=" + this.f98432h + ", experimentIds=" + this.f98433i + "}";
    }

    private j(long j11, Integer num, p pVar, long j12, byte[] bArr, String str, long j13, w wVar, q qVar) {
        this.f98425a = j11;
        this.f98426b = num;
        this.f98427c = pVar;
        this.f98428d = j12;
        this.f98429e = bArr;
        this.f98430f = str;
        this.f98431g = j13;
        this.f98432h = wVar;
        this.f98433i = qVar;
    }
}
