package pq;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f103565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f103566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f103568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f103569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f103570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f103571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f103572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f103573j;

    /* JADX INFO: renamed from: pq.b$b, reason: collision with other inner class name */
    static final class C2198b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f103575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f103576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f103577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f103578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f103579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f103580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f103581h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f103582i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f103583j;

        C2198b() {
        }

        @Override // pq.i.a
        public i d() {
            String str = "";
            if (this.f103574a == null) {
                str = " transportName";
            }
            if (this.f103576c == null) {
                str = str + " encodedPayload";
            }
            if (this.f103577d == null) {
                str = str + " eventMillis";
            }
            if (this.f103578e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f103579f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f103574a, this.f103575b, this.f103576c, this.f103577d.longValue(), this.f103578e.longValue(), this.f103579f, this.f103580g, this.f103581h, this.f103582i, this.f103583j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // pq.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f103579f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // pq.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f103579f = map;
            return this;
        }

        @Override // pq.i.a
        public i.a g(Integer num) {
            this.f103575b = num;
            return this;
        }

        @Override // pq.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f103576c = hVar;
            return this;
        }

        @Override // pq.i.a
        public i.a i(long j11) {
            this.f103577d = Long.valueOf(j11);
            return this;
        }

        @Override // pq.i.a
        public i.a j(byte[] bArr) {
            this.f103582i = bArr;
            return this;
        }

        @Override // pq.i.a
        public i.a k(byte[] bArr) {
            this.f103583j = bArr;
            return this;
        }

        @Override // pq.i.a
        public i.a l(Integer num) {
            this.f103580g = num;
            return this;
        }

        @Override // pq.i.a
        public i.a m(String str) {
            this.f103581h = str;
            return this;
        }

        @Override // pq.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f103574a = str;
            return this;
        }

        @Override // pq.i.a
        public i.a o(long j11) {
            this.f103578e = Long.valueOf(j11);
            return this;
        }
    }

    @Override // pq.i
    protected Map<String, String> c() {
        return this.f103569f;
    }

    @Override // pq.i
    public Integer d() {
        return this.f103565b;
    }

    @Override // pq.i
    public h e() {
        return this.f103566c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f103564a.equals(iVar.n()) && ((num = this.f103565b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f103566c.equals(iVar.e()) && this.f103567d == iVar.f() && this.f103568e == iVar.o() && this.f103569f.equals(iVar.c()) && ((num2 = this.f103570g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f103571h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z11 = iVar instanceof b;
                if (Arrays.equals(this.f103572i, z11 ? ((b) iVar).f103572i : iVar.g())) {
                    if (Arrays.equals(this.f103573j, z11 ? ((b) iVar).f103573j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // pq.i
    public long f() {
        return this.f103567d;
    }

    @Override // pq.i
    public byte[] g() {
        return this.f103572i;
    }

    @Override // pq.i
    public byte[] h() {
        return this.f103573j;
    }

    public int hashCode() {
        int iHashCode = (this.f103564a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f103565b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f103566c.hashCode()) * 1000003;
        long j11 = this.f103567d;
        int i11 = (iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f103568e;
        int iHashCode3 = (((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f103569f.hashCode()) * 1000003;
        Integer num2 = this.f103570g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f103571h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f103572i)) * 1000003) ^ Arrays.hashCode(this.f103573j);
    }

    @Override // pq.i
    public Integer l() {
        return this.f103570g;
    }

    @Override // pq.i
    public String m() {
        return this.f103571h;
    }

    @Override // pq.i
    public String n() {
        return this.f103564a;
    }

    @Override // pq.i
    public long o() {
        return this.f103568e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f103564a + ", code=" + this.f103565b + ", encodedPayload=" + this.f103566c + ", eventMillis=" + this.f103567d + ", uptimeMillis=" + this.f103568e + ", autoMetadata=" + this.f103569f + ", productId=" + this.f103570g + ", pseudonymousId=" + this.f103571h + ", experimentIdsClear=" + Arrays.toString(this.f103572i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f103573j) + "}";
    }

    private b(String str, Integer num, h hVar, long j11, long j12, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f103564a = str;
        this.f103565b = num;
        this.f103566c = hVar;
        this.f103567d = j11;
        this.f103568e = j12;
        this.f103569f = map;
        this.f103570g = num2;
        this.f103571h = str2;
        this.f103572i = bArr;
        this.f103573j = bArr2;
    }
}
