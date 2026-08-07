package wq;

import android.app.job.JobInfo;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zq.a f122194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<nq.f, b> f122195b = new HashMap();

        public a a(nq.f fVar, b bVar) {
            this.f122195b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f122194a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f122195b.keySet().size() < nq.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<nq.f, b> map = this.f122195b;
            this.f122195b = new HashMap();
            return f.d(this.f122194a, map);
        }

        public a c(zq.a aVar) {
            this.f122194a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j11);

            public abstract a c(Set<c> set);

            public abstract a d(long j11);
        }

        public static a a() {
            return new wq.c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i11, long j11) {
        int i12 = i11 - 1;
        return (long) (Math.pow(3.0d, i12) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i12))));
    }

    public static a b() {
        return new a();
    }

    static f d(zq.a aVar, Map<nq.f, b> map) {
        return new wq.b(aVar, map);
    }

    public static f f(zq.a aVar) {
        return b().a(nq.f.DEFAULT, b.a().b(30000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(nq.f.HIGHEST, b.a().b(1000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(nq.f.VERY_LOW, b.a().b(CoreConstants.MILLIS_IN_ONE_DAY).d(CoreConstants.MILLIS_IN_ONE_DAY).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, nq.f fVar, long j11, int i11) {
        builder.setMinimumLatency(g(fVar, j11, i11));
        j(builder, h().get(fVar).c());
        return builder;
    }

    abstract zq.a e();

    public long g(nq.f fVar, long j11, int i11) {
        long jA = j11 - e().a();
        b bVar = h().get(fVar);
        return Math.min(Math.max(a(i11, bVar.b()), jA), bVar.d());
    }

    abstract Map<nq.f, b> h();
}
