package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
public final class z<U> implements net.time4j.engine.j0<U>, Comparable<z<U>>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z<TimeUnit> f94837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z<n0> f94838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final net.time4j.engine.h0<TimeUnit, z<TimeUnit>> f94839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final net.time4j.engine.h0<TimeUnit, z<n0>> f94840g;
    private static final long serialVersionUID = -4150291820807606229L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient long f94841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f94842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient fp0.f f94843c;

    private static class b<U> implements net.time4j.engine.h0<TimeUnit, z<U>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fp0.f f94844a;

        private b(fp0.f fVar) {
            this.f94844a = fVar;
        }
    }

    static {
        fp0.f fVar = fp0.f.POSIX;
        f94837d = new z<>(0L, 0, fVar);
        fp0.f fVar2 = fp0.f.UTC;
        f94838e = new z<>(0L, 0, fVar2);
        f94839f = new b(fVar);
        f94840g = new b(fVar2);
    }

    private z(long j11, int i11, fp0.f fVar) {
        while (i11 < 0) {
            i11 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11 = net.time4j.base.c.m(j11, 1L);
        }
        while (i11 >= 1000000000) {
            i11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11 = net.time4j.base.c.f(j11, 1L);
        }
        if (j11 < 0 && i11 > 0) {
            j11++;
            i11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        this.f94841a = j11;
        this.f94842b = i11;
        this.f94843c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T b(Object obj) {
        return obj;
    }

    private void d(StringBuilder sb2) {
        if (isNegative()) {
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(Math.abs(this.f94841a));
        } else {
            sb2.append(this.f94841a);
        }
        if (this.f94842b != 0) {
            sb2.append(CoreConstants.DOT);
            String strValueOf = String.valueOf(Math.abs(this.f94842b));
            for (int length = 9 - strValueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(strValueOf);
        }
    }

    public static z<TimeUnit> h(long j11, int i11) {
        return (j11 == 0 && i11 == 0) ? f94837d : new z<>(j11, i11, fp0.f.POSIX);
    }

    public static z<n0> i(long j11, int i11) {
        return (j11 == 0 && i11 == 0) ? f94838e : new z<>(j11, i11, fp0.f.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    @Override // net.time4j.engine.j0
    public List<net.time4j.engine.j0.a<U>> a() {
        ArrayList arrayList = new ArrayList(2);
        if (this.f94841a != 0) {
            arrayList.add(net.time4j.engine.j0.a.c(Math.abs(this.f94841a), b(this.f94843c == fp0.f.UTC ? n0.SECONDS : TimeUnit.SECONDS)));
        }
        if (this.f94842b != 0) {
            arrayList.add(net.time4j.engine.j0.a.c(Math.abs(this.f94842b), b(this.f94843c == fp0.f.UTC ? n0.NANOSECONDS : TimeUnit.NANOSECONDS)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(z<U> zVar) {
        if (this.f94843c != zVar.f94843c) {
            throw new ClassCastException("Different time scales.");
        }
        long j11 = this.f94841a;
        long j12 = zVar.f94841a;
        if (j11 < j12) {
            return -1;
        }
        if (j11 > j12) {
            return 1;
        }
        return this.f94842b - zVar.f94842b;
    }

    public int e() {
        int i11 = this.f94842b;
        return i11 < 0 ? i11 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS : i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f94841a == zVar.f94841a && this.f94842b == zVar.f94842b && this.f94843c == zVar.f94843c) {
                return true;
            }
        }
        return false;
    }

    public fp0.f f() {
        return this.f94843c;
    }

    public long g() {
        long j11 = this.f94841a;
        return this.f94842b < 0 ? j11 - 1 : j11;
    }

    public int hashCode() {
        long j11 = this.f94841a;
        return ((((161 + ((int) (j11 ^ (j11 >>> 32)))) * 23) + this.f94842b) * 23) + this.f94843c.hashCode();
    }

    @Override // net.time4j.engine.j0
    public boolean isEmpty() {
        return this.f94841a == 0 && this.f94842b == 0;
    }

    @Override // net.time4j.engine.j0
    public boolean isNegative() {
        return this.f94841a < 0 || this.f94842b < 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        d(sb2);
        sb2.append("s [");
        sb2.append(this.f94843c.name());
        sb2.append(']');
        return sb2.toString();
    }
}
