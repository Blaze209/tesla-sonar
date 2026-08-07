package net.time4j;

import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 implements net.time4j.base.e<b0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final fp0.e f94704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f94705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0 f94706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p0 f94707f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f94708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f94709b;

    private static class b implements fp0.e {
        private b() {
        }

        @Override // fp0.e
        public String a() {
            return "";
        }

        @Override // fp0.e
        public long getNanos() {
            return System.nanoTime();
        }
    }

    static {
        fp0.e bVar;
        String property = System.getProperty("java.vm.name");
        Iterator it = net.time4j.base.d.c().g(fp0.e.class).iterator();
        do {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (fp0.e) it.next();
        } while (!property.equals(bVar.a()));
        if (bVar == null) {
            bVar = new b();
        }
        f94704c = bVar;
        f94705d = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        f94706e = new p0(false, a());
        f94707f = new p0(true, a());
    }

    private p0(boolean z11, long j11) {
        this.f94708a = z11;
        this.f94709b = j11;
    }

    private static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime = 0;
        int i11 = 0;
        while (i11 < 10) {
            jNanoTime = f94705d ? System.nanoTime() : f94704c.getNanos();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis == jCurrentTimeMillis2) {
                break;
            }
            i11++;
            jCurrentTimeMillis = jCurrentTimeMillis2;
        }
        return net.time4j.base.c.m(net.time4j.base.c.i(fp0.d.n().f(net.time4j.base.c.b(jCurrentTimeMillis, 1000)), 1000000000L) + ((long) (net.time4j.base.c.d(jCurrentTimeMillis, 1000) * 1000000)), jNanoTime);
    }

    public static b0 b() {
        return f94706e.c();
    }

    private long d() {
        return net.time4j.base.c.f(f94705d ? System.nanoTime() : f94704c.getNanos(), this.f94709b);
    }

    public b0 c() {
        if ((this.f94708a || f94705d) && fp0.d.n().r()) {
            long jD = d();
            return b0.k0(net.time4j.base.c.b(jD, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), net.time4j.base.c.d(jD, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), fp0.f.UTC);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return b0.k0(net.time4j.base.c.b(jCurrentTimeMillis, 1000), net.time4j.base.c.d(jCurrentTimeMillis, 1000) * 1000000, fp0.f.POSIX);
    }
}
