package z7;

import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f127073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f127074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f127075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f127076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f127077g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f127079b;

    static {
        b0 b0Var = new b0(0L, 0L);
        f127073c = b0Var;
        f127074d = new b0(Long.MAX_VALUE, Long.MAX_VALUE);
        f127075e = new b0(Long.MAX_VALUE, 0L);
        f127076f = new b0(0L, Long.MAX_VALUE);
        f127077g = b0Var;
    }

    public b0(long j11, long j12) {
        s7.a.a(j11 >= 0);
        s7.a.a(j12 >= 0);
        this.f127078a = j11;
        this.f127079b = j12;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j11, long j12, long j13) {
        long j14 = this.f127078a;
        if (j14 == 0 && this.f127079b == 0) {
            return j11;
        }
        long jH1 = q0.H1(j11, j14, Long.MIN_VALUE);
        long jF = q0.f(j11, this.f127079b, Long.MAX_VALUE);
        boolean z11 = false;
        boolean z12 = jH1 <= j12 && j12 <= jF;
        if (jH1 <= j13 && j13 <= jF) {
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
            return jH1;
        }
        return j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f127078a == b0Var.f127078a && this.f127079b == b0Var.f127079b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f127078a) * 31) + ((int) this.f127079b);
    }
}
