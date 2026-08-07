package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class l extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f126172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f126173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f126174c;

    l(long j11, long j12, b bVar) {
        this.f126172a = j11;
        this.f126173b = j12;
        if (bVar == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f126174c = bVar;
    }

    @Override // z0.h1
    @NonNull
    public b a() {
        return this.f126174c;
    }

    @Override // z0.h1
    public long b() {
        return this.f126173b;
    }

    @Override // z0.h1
    public long c() {
        return this.f126172a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (this.f126172a == h1Var.c() && this.f126173b == h1Var.b() && this.f126174c.equals(h1Var.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f126172a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f126173b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f126174c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f126172a + ", numBytesRecorded=" + this.f126173b + ", audioStats=" + this.f126174c + "}";
    }
}
