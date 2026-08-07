package cw;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f59210c;

    /* JADX INFO: renamed from: cw.b$b, reason: collision with other inner class name */
    static final class C1207b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f59211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f59212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f59213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f59214d;

        C1207b() {
        }

        @Override // cw.f.a
        public f a() {
            if (this.f59214d == 1) {
                return new b(this.f59211a, this.f59212b, this.f59213c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // cw.f.a
        public f.a b(f.b bVar) {
            this.f59213c = bVar;
            return this;
        }

        @Override // cw.f.a
        public f.a c(String str) {
            this.f59211a = str;
            return this;
        }

        @Override // cw.f.a
        public f.a d(long j11) {
            this.f59212b = j11;
            this.f59214d = (byte) (this.f59214d | 1);
            return this;
        }
    }

    @Override // cw.f
    public f.b b() {
        return this.f59210c;
    }

    @Override // cw.f
    public String c() {
        return this.f59208a;
    }

    @Override // cw.f
    @NonNull
    public long d() {
        return this.f59209b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f59208a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f59209b == fVar.d() && ((bVar = this.f59210c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f59208a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j11 = this.f59209b;
        int i11 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        f.b bVar = this.f59210c;
        return i11 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f59208a + ", tokenExpirationTimestamp=" + this.f59209b + ", responseCode=" + this.f59210c + "}";
    }

    private b(String str, long j11, f.b bVar) {
        this.f59208a = str;
        this.f59209b = j11;
        this.f59210c = bVar;
    }
}
