package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
final class a1 extends net.time4j.a<Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final net.time4j.engine.k0 f93923f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a1 f93924g = new a1("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient p<g0> f93925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient p<g0> f93926e;

    private static class b<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {
        private b() {
        }

        private net.time4j.engine.p<?> c() {
            return z0.f94846m.n();
        }

        private static g0 j(g0 g0Var, int i11) {
            int iW = a1.w(i11);
            int iZ = a1.z(g0Var);
            long jTransform = net.time4j.engine.z.UNIX.transform(net.time4j.base.b.j(i11, 1, 1), net.time4j.engine.z.MODIFIED_JULIAN_DATE) + ((long) (iW - 1)) + ((long) ((iZ - 1) * 7)) + ((long) (g0Var.A0().getValue(z0.f94846m) - 1));
            if (iZ == 53) {
                if (((a1.w(i11 + 1) + (net.time4j.base.b.e(i11) ? 366 : 365)) - iW) / 7 < 53) {
                    jTransform -= 7;
                }
            }
            return g0Var.V0(jTransform - 730);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t11) {
            return a1.f93924g.s();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t11) {
            return a1.f93924g.t();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t11) {
            g0 g0Var = (g0) t11.s(g0.f94487n);
            int iB = g0Var.b();
            int iB0 = g0Var.B0();
            int iX = a1.x(g0Var, 0);
            if (iX > iB0) {
                iB--;
            } else if (((iB0 - iX) / 7) + 1 >= 53 && a1.x(g0Var, 1) + a1.y(g0Var, 0) <= iB0) {
                iB++;
            }
            return Integer.valueOf(iB);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, Integer num) {
            int iIntValue;
            return num != null && (iIntValue = num.intValue()) >= -999999999 && iIntValue <= 999999999;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, Integer num, boolean z11) {
            if (num == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            return (T) t11.B(pVar, j((g0) t11.s(pVar), num.intValue()));
        }
    }

    private static class c<T extends net.time4j.engine.q<T>> implements net.time4j.engine.k0<T> {
        private c() {
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(T t11, long j11) {
            if (j11 == 0) {
                return t11;
            }
            int iG = net.time4j.base.c.g(net.time4j.base.c.f(((Integer) t11.s(a1.f93924g)).intValue(), j11));
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            int iE0 = g0Var.E0();
            x0 x0VarA0 = g0Var.A0();
            if (iE0 == 53) {
                iE0 = ((Integer) g0.L0(iG, 26, x0VarA0).o(z0.f94846m.n())).intValue();
            }
            return (T) t11.B(pVar, g0.L0(iG, iE0, x0VarA0));
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(T t11, T t12) {
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            g0 g0Var2 = (g0) t12.s(pVar);
            a1 a1Var = a1.f93924g;
            long jIntValue = ((Integer) g0Var2.s(a1Var)).intValue() - ((Integer) g0Var.s(a1Var)).intValue();
            if (jIntValue == 0) {
                return jIntValue;
            }
            int iZ = a1.z(g0Var);
            int iZ2 = a1.z(g0Var2);
            if (jIntValue > 0 && iZ > iZ2) {
                jIntValue--;
            } else if (jIntValue < 0 && iZ < iZ2) {
                jIntValue++;
            }
            if (jIntValue == 0 || iZ != iZ2) {
                return jIntValue;
            }
            int value = g0Var.A0().getValue();
            int value2 = g0Var2.A0().getValue();
            if (jIntValue > 0 && value > value2) {
                jIntValue--;
            } else if (jIntValue < 0 && value < value2) {
                jIntValue++;
            }
            if (jIntValue == 0 || value != value2) {
                return jIntValue;
            }
            net.time4j.engine.p<h0> pVar2 = h0.f94524o;
            if (!t11.n(pVar2) || !t12.n(pVar2)) {
                return jIntValue;
            }
            h0 h0Var = (h0) t11.s(pVar2);
            h0 h0Var2 = (h0) t12.s(pVar2);
            if (jIntValue <= 0 || !h0Var.w0(h0Var2)) {
                return (jIntValue >= 0 || !h0Var.x0(h0Var2)) ? jIntValue : jIntValue + 1;
            }
            return jIntValue - 1;
        }
    }

    private static class d extends p<g0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f93927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final net.time4j.engine.u<i0> f93928d;

        class a implements net.time4j.engine.u<i0> {
            a() {
            }

            @Override // net.time4j.engine.u
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i0 apply(i0 i0Var) {
                return (i0) a1.A().b(i0Var, d.this.f93927c);
            }
        }

        @Override // net.time4j.engine.u
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0 apply(g0 g0Var) {
            return (g0) a1.A().b(g0Var, this.f93927c);
        }

        private d(long j11) {
            super(a1.f93924g, 8);
            this.f93927c = j11;
            this.f93928d = new a();
        }
    }

    private a1(String str) {
        super(str);
        this.f93925d = new d(-1L);
        this.f93926e = new d(1L);
    }

    static <T extends net.time4j.engine.q<T>> net.time4j.engine.k0<T> A() {
        return f93923f;
    }

    private Object readResolve() {
        return f93924g;
    }

    static <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, Integer> t(Class<T> cls) {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(int i11) {
        x0 x0VarValueOf = x0.valueOf(net.time4j.base.b.c(i11, 1, 1));
        z0 z0Var = z0.f94846m;
        int value = x0VarValueOf.getValue(z0Var);
        return value <= 8 - z0Var.g() ? 2 - value : 9 - value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(g0 g0Var, int i11) {
        return w(g0Var.b() + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(g0 g0Var, int i11) {
        return net.time4j.base.b.e(g0Var.b() + i11) ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(g0 g0Var) {
        int iB0 = g0Var.B0();
        int iX = x(g0Var, 0);
        if (iX > iB0) {
            return (((iB0 + y(g0Var, -1)) - x(g0Var, -1)) / 7) + 1;
        }
        int i11 = ((iB0 - iX) / 7) + 1;
        if (i11 < 53 || x(g0Var, 1) + y(g0Var, 0) > iB0) {
            return i11;
        }
        return 1;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean n() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer s() {
        return g0.f94480g;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer t() {
        return g0.f94479f;
    }
}
