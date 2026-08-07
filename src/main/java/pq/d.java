package pq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.f f103596c;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f103598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private nq.f f103599c;

        b() {
        }

        @Override // pq.p.a
        public p a() {
            String str = "";
            if (this.f103597a == null) {
                str = " backendName";
            }
            if (this.f103599c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f103597a, this.f103598b, this.f103599c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // pq.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f103597a = str;
            return this;
        }

        @Override // pq.p.a
        public p.a c(byte[] bArr) {
            this.f103598b = bArr;
            return this;
        }

        @Override // pq.p.a
        public p.a d(nq.f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f103599c = fVar;
            return this;
        }
    }

    @Override // pq.p
    public String b() {
        return this.f103594a;
    }

    @Override // pq.p
    public byte[] c() {
        return this.f103595b;
    }

    @Override // pq.p
    public nq.f d() {
        return this.f103596c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f103594a.equals(pVar.b())) {
                if (Arrays.equals(this.f103595b, pVar instanceof d ? ((d) pVar).f103595b : pVar.c()) && this.f103596c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f103594a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f103595b)) * 1000003) ^ this.f103596c.hashCode();
    }

    private d(String str, byte[] bArr, nq.f fVar) {
        this.f103594a = str;
        this.f103595b = bArr;
        this.f103596c = fVar;
    }
}
