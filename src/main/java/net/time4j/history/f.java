package net.time4j.history;

import net.time4j.engine.z;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f94588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f94589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h f94590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f94591d;

    f(long j11, c cVar, c cVar2) {
        this.f94588a = j11;
        this.f94589b = cVar2;
        if (j11 != Long.MIN_VALUE) {
            this.f94590c = cVar2.fromMJD(j11);
            this.f94591d = cVar.fromMJD(j11 - 1);
        } else {
            h hVar = new h(j.BC, Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 1, 1);
            this.f94590c = hVar;
            this.f94591d = hVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f94588a == fVar.f94588a && this.f94589b == fVar.f94589b && this.f94591d.equals(fVar.f94591d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f94588a;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public String toString() {
        return f.class.getName() + "[start=" + this.f94588a + " (" + g0.O0(this.f94588a, z.MODIFIED_JULIAN_DATE) + "),algorithm=" + this.f94589b + ",date-before-cutover=" + this.f94591d + ",date-at-cutover=" + this.f94590c + ']';
    }
}
