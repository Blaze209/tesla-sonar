package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
public enum n0 implements net.time4j.engine.v {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);

    private final double length;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94683a;

        static {
            int[] iArr = new int[n0.values().length];
            f94683a = iArr;
            try {
                iArr[n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94683a[n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    n0(double d11) {
        this.length = d11;
    }

    public long between(b0 b0Var, b0 b0Var2) {
        b0.R(b0Var);
        b0.R(b0Var2);
        int i11 = a.f94683a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new UnsupportedOperationException();
            }
            fp0.f fVar = fp0.f.UTC;
            return net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(b0Var2.i(fVar), b0Var.i(fVar)), 1000000000L), b0Var2.a() - b0Var.a());
        }
        fp0.f fVar2 = fp0.f.UTC;
        long jI = b0Var2.i(fVar2) - b0Var.i(fVar2);
        if (jI < 0) {
            return b0Var2.a() > b0Var.a() ? jI + 1 : jI;
        }
        return (jI <= 0 || b0Var2.a() >= b0Var.a()) ? jI : jI - 1;
    }

    @Override // net.time4j.engine.v
    public double getLength() {
        return this.length;
    }

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return false;
    }
}
