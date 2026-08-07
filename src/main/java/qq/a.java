package qq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<pq.i> f105832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f105833b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<pq.i> f105834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f105835b;

        b() {
        }

        @Override // qq.f.a
        public f a() {
            String str = "";
            if (this.f105834a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f105834a, this.f105835b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // qq.f.a
        public f.a b(Iterable<pq.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f105834a = iterable;
            return this;
        }

        @Override // qq.f.a
        public f.a c(byte[] bArr) {
            this.f105835b = bArr;
            return this;
        }
    }

    @Override // qq.f
    public Iterable<pq.i> b() {
        return this.f105832a;
    }

    @Override // qq.f
    public byte[] c() {
        return this.f105833b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f105832a.equals(fVar.b())) {
                if (Arrays.equals(this.f105833b, fVar instanceof a ? ((a) fVar).f105833b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f105832a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f105833b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f105832a + ", extras=" + Arrays.toString(this.f105833b) + "}";
    }

    private a(Iterable<pq.i> iterable, byte[] bArr) {
        this.f105832a = iterable;
        this.f105833b = bArr;
    }
}
