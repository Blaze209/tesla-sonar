package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n5 implements Comparable<n5> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n5 n5Var) {
        return Long.valueOf(f()).compareTo(Long.valueOf(n5Var.f()));
    }

    public long b(n5 n5Var) {
        return f() - n5Var.f();
    }

    public final boolean c(n5 n5Var) {
        return b(n5Var) > 0;
    }

    public final boolean d(n5 n5Var) {
        return b(n5Var) < 0;
    }

    public long e(n5 n5Var) {
        return (n5Var == null || compareTo(n5Var) >= 0) ? f() : n5Var.f();
    }

    public abstract long f();
}
