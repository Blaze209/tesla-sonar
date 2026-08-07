package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public final class i7 extends n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f80650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f80651b;

    public i7() {
        this(l.d(), System.nanoTime());
    }

    private long g(i7 i7Var, i7 i7Var2) {
        return i7Var.f() + (i7Var2.f80651b - i7Var.f80651b);
    }

    @Override // io.sentry.n5, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(n5 n5Var) {
        if (!(n5Var instanceof i7)) {
            return super.compareTo(n5Var);
        }
        i7 i7Var = (i7) n5Var;
        long time = this.f80650a.getTime();
        long time2 = i7Var.f80650a.getTime();
        return time == time2 ? Long.valueOf(this.f80651b).compareTo(Long.valueOf(i7Var.f80651b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.n5
    public long b(n5 n5Var) {
        return n5Var instanceof i7 ? this.f80651b - ((i7) n5Var).f80651b : super.b(n5Var);
    }

    @Override // io.sentry.n5
    public long e(n5 n5Var) {
        if (n5Var == null || !(n5Var instanceof i7)) {
            return super.e(n5Var);
        }
        i7 i7Var = (i7) n5Var;
        return compareTo(n5Var) < 0 ? g(this, i7Var) : g(i7Var, this);
    }

    @Override // io.sentry.n5
    public long f() {
        return l.a(this.f80650a);
    }

    public i7(Date date, long j11) {
        this.f80650a = date;
        this.f80651b = j11;
    }
}
