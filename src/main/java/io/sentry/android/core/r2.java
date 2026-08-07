package io.sentry.android.core;

import io.sentry.c3;
import io.sentry.e3;
import io.sentry.i7;
import io.sentry.n5;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class r2 implements io.sentry.u0, io.sentry.android.core.internal.util.c0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f79719h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i7 f79720i = new i7(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f79721a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.c0 f79723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f79724d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.a f79722b = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet<io.sentry.g1> f79725e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.q2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r2.f((io.sentry.g1) obj, (io.sentry.g1) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentSkipListSet<a> f79726f = new ConcurrentSkipListSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f79727g = 16666666;

    private static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f79728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f79729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f79730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f79731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f79732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f79733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f79734g;

        a(long j11) {
            this(j11, j11, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f79729b, aVar.f79729b);
        }

        a(long j11, long j12, long j13, long j14, boolean z11, boolean z12, long j15) {
            this.f79728a = j11;
            this.f79729b = j12;
            this.f79730c = j13;
            this.f79731d = j14;
            this.f79732e = z11;
            this.f79733f = z12;
            this.f79734g = j15;
        }
    }

    public r2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.c0 c0Var) {
        this.f79723c = c0Var;
        this.f79721a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(io.sentry.g1 g1Var, io.sentry.g1 g1Var2) {
        if (g1Var == g1Var2) {
            return 0;
        }
        int iCompareTo = g1Var.r().compareTo(g1Var2.r());
        return iCompareTo != 0 ? iCompareTo : g1Var.e().m().toString().compareTo(g1Var2.e().m().toString());
    }

    private static int g(o2 o2Var, long j11, long j12, long j13) {
        long jMax = Math.max(0L, j12 - j13);
        if (!io.sentry.android.core.internal.util.c0.j(jMax, j11)) {
            return 0;
        }
        o2Var.a(jMax, Math.max(0L, jMax - j11), true, io.sentry.android.core.internal.util.c0.i(jMax));
        return 1;
    }

    private void h(io.sentry.g1 g1Var) {
        io.sentry.d1 d1VarA = this.f79722b.a();
        try {
            if (!this.f79725e.remove(g1Var)) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            n5 n5VarQ = g1Var.q();
            if (n5VarQ == null) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            long j11 = j(g1Var.r());
            long j12 = j(n5VarQ);
            long j13 = j12 - j11;
            long j14 = 0;
            if (j13 <= 0) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            o2 o2Var = new o2();
            long j15 = this.f79727g;
            if (!this.f79726f.isEmpty()) {
                for (a aVar : this.f79726f.tailSet(new a(j11))) {
                    if (aVar.f79728a > j12) {
                        break;
                    }
                    if (aVar.f79728a >= j11 && aVar.f79729b <= j12) {
                        o2Var.a(aVar.f79730c, aVar.f79731d, aVar.f79732e, aVar.f79733f);
                    } else if ((j11 > aVar.f79728a && j11 < aVar.f79729b) || (j12 > aVar.f79728a && j12 < aVar.f79729b)) {
                        long jMin = Math.min(aVar.f79731d - Math.max(j14, Math.max(j14, j11 - aVar.f79728a) - aVar.f79734g), j13);
                        long jMin2 = Math.min(j12, aVar.f79729b) - Math.max(j11, aVar.f79728a);
                        o2Var.a(jMin2, jMin, io.sentry.android.core.internal.util.c0.j(jMin2, aVar.f79734g), io.sentry.android.core.internal.util.c0.i(jMin2));
                    }
                    j15 = aVar.f79734g;
                    j14 = 0;
                }
            }
            long j16 = j15;
            int iF = o2Var.f();
            long jH = this.f79723c.h();
            if (jH != -1) {
                iF = iF + g(o2Var, j16, j12, jH) + i(o2Var, j16, j13);
            }
            double dE = (o2Var.e() + o2Var.c()) / 1.0E9d;
            g1Var.l("frames.total", Integer.valueOf(iF));
            g1Var.l("frames.slow", Integer.valueOf(o2Var.d()));
            g1Var.l("frames.frozen", Integer.valueOf(o2Var.b()));
            g1Var.l("frames.delay", Double.valueOf(dE));
            if (g1Var instanceof io.sentry.i1) {
                g1Var.j("frames_total", Integer.valueOf(iF));
                g1Var.j("frames_slow", Integer.valueOf(o2Var.d()));
                g1Var.j("frames_frozen", Integer.valueOf(o2Var.b()));
                g1Var.j("frames_delay", Double.valueOf(dE));
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA == null) {
                throw th2;
            }
            try {
                d1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static int i(o2 o2Var, long j11, long j12) {
        long jG = j12 - o2Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j11);
        }
        return 0;
    }

    private static long j(n5 n5Var) {
        if (n5Var instanceof i7) {
            return n5Var.b(f79720i);
        }
        return System.nanoTime() - (io.sentry.l.i(System.currentTimeMillis()) - n5Var.f());
    }

    @Override // io.sentry.u0
    public void a(io.sentry.g1 g1Var) {
        if (!this.f79721a || (g1Var instanceof c3) || (g1Var instanceof e3)) {
            return;
        }
        io.sentry.d1 d1VarA = this.f79722b.a();
        try {
            if (!this.f79725e.contains(g1Var)) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            h(g1Var);
            io.sentry.d1 d1VarA2 = this.f79722b.a();
            try {
                if (this.f79725e.isEmpty()) {
                    clear();
                } else {
                    this.f79726f.headSet(new a(j(this.f79725e.first().r()))).clear();
                }
                if (d1VarA2 != null) {
                    d1VarA2.close();
                }
            } catch (Throwable th2) {
                if (d1VarA2 != null) {
                    try {
                        d1VarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.u0
    public void b(io.sentry.g1 g1Var) {
        if (!this.f79721a || (g1Var instanceof c3) || (g1Var instanceof e3)) {
            return;
        }
        io.sentry.d1 d1VarA = this.f79722b.a();
        try {
            this.f79725e.add(g1Var);
            if (this.f79724d == null) {
                this.f79724d = this.f79723c.l(this);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.u0
    public void clear() {
        io.sentry.d1 d1VarA = this.f79722b.a();
        try {
            if (this.f79724d != null) {
                this.f79723c.m(this.f79724d);
                this.f79724d = null;
            }
            this.f79726f.clear();
            this.f79725e.clear();
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.internal.util.c0.b
    public void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f11) {
        if (this.f79726f.size() > 3600) {
            return;
        }
        long j15 = (long) (f79719h / ((double) f11));
        this.f79727g = j15;
        if (z11 || z12) {
            this.f79726f.add(new a(j11, j12, j13, j14, z11, z12, j15));
        }
    }
}
