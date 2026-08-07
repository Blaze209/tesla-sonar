package com.google.firebase.installations;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f44152c;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f44153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f44154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f44155c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f44153a == null) {
                str = " token";
            }
            if (this.f44154b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f44155c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f44153a, this.f44154b.longValue(), this.f44155c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f44153a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j11) {
            this.f44155c = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j11) {
            this.f44154b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public String b() {
        return this.f44150a;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public long c() {
        return this.f44152c;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public long d() {
        return this.f44151b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f44150a.equals(fVar.b()) && this.f44151b == fVar.d() && this.f44152c == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f44150a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f44151b;
        long j12 = this.f44152c;
        return ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f44150a + ", tokenExpirationTimestamp=" + this.f44151b + ", tokenCreationTimestamp=" + this.f44152c + "}";
    }

    private a(String str, long j11, long j12) {
        this.f44150a = str;
        this.f44151b = j11;
        this.f44152c = j12;
    }
}
