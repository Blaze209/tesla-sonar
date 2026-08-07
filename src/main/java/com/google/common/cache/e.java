package com.google.common.cache;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f43374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f43375f;

    public e(long j11, long j12, long j13, long j14, long j15, long j16) {
        ou.p.d(j11 >= 0);
        ou.p.d(j12 >= 0);
        ou.p.d(j13 >= 0);
        ou.p.d(j14 >= 0);
        ou.p.d(j15 >= 0);
        ou.p.d(j16 >= 0);
        this.f43370a = j11;
        this.f43371b = j12;
        this.f43372c = j13;
        this.f43373d = j14;
        this.f43374e = j15;
        this.f43375f = j16;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f43370a == eVar.f43370a && this.f43371b == eVar.f43371b && this.f43372c == eVar.f43372c && this.f43373d == eVar.f43373d && this.f43374e == eVar.f43374e && this.f43375f == eVar.f43375f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f43370a), Long.valueOf(this.f43371b), Long.valueOf(this.f43372c), Long.valueOf(this.f43373d), Long.valueOf(this.f43374e), Long.valueOf(this.f43375f));
    }

    public String toString() {
        return ou.j.b(this).b("hitCount", this.f43370a).b("missCount", this.f43371b).b("loadSuccessCount", this.f43372c).b("loadExceptionCount", this.f43373d).b("totalLoadTime", this.f43374e).b("evictionCount", this.f43375f).toString();
    }
}
