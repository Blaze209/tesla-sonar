package t7;

import p7.f0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112709c;

    public g(long j11, long j12, long j13) {
        this.f112707a = j11;
        this.f112708b = j12;
        this.f112709c = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f112707a == gVar.f112707a && this.f112708b == gVar.f112708b && this.f112709c == gVar.f112709c;
    }

    public int hashCode() {
        return ((((527 + ru.h.c(this.f112707a)) * 31) + ru.h.c(this.f112708b)) * 31) + ru.h.c(this.f112709c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f112707a + ", modification time=" + this.f112708b + ", timescale=" + this.f112709c;
    }
}
