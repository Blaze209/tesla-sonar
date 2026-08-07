package br;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f17932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f17933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f17934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f17935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l0 f17936g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17938b;

    static {
        l0 l0Var = new l0(0L, 0L);
        f17932c = l0Var;
        f17933d = new l0(Long.MAX_VALUE, Long.MAX_VALUE);
        f17934e = new l0(Long.MAX_VALUE, 0L);
        f17935f = new l0(0L, Long.MAX_VALUE);
        f17936g = l0Var;
    }

    public l0(long j11, long j12) {
        ts.a.a(j11 >= 0);
        ts.a.a(j12 >= 0);
        this.f17937a = j11;
        this.f17938b = j12;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j11, long j12, long j13) {
        long j14 = this.f17937a;
        if (j14 == 0 && this.f17938b == 0) {
            return j11;
        }
        long jS0 = ts.p0.S0(j11, j14, Long.MIN_VALUE);
        long jB = ts.p0.b(j11, this.f17938b, Long.MAX_VALUE);
        boolean z11 = false;
        boolean z12 = jS0 <= j12 && j12 <= jB;
        if (jS0 <= j13 && j13 <= jB) {
            z11 = true;
        }
        if (z12 && z11) {
            if (Math.abs(j12 - j11) <= Math.abs(j13 - j11)) {
                return j12;
            }
            return j13;
        }
        if (!z12) {
            if (z11) {
                return j13;
            }
            return jS0;
        }
        return j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f17937a == l0Var.f17937a && this.f17938b == l0Var.f17938b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f17937a) * 31) + ((int) this.f17938b);
    }
}
