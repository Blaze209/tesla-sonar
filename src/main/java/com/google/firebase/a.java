package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
final class a extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43843c;

    a(long j11, long j12, long j13) {
        this.f43841a = j11;
        this.f43842b = j12;
        this.f43843c = j13;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f43842b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f43841a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f43843c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f43841a == nVar.c() && this.f43842b == nVar.b() && this.f43843c == nVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f43841a;
        long j12 = this.f43842b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f43843c;
        return i11 ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f43841a + ", elapsedRealtime=" + this.f43842b + ", uptimeMillis=" + this.f43843c + "}";
    }
}
