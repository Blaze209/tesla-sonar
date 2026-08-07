package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f implements v {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CENTURIES;
    public static final f DAYS;
    public static final f DECADES;
    public static final f MILLENNIA;
    public static final f MONTHS;
    public static final f QUARTERS;
    public static final f WEEKS;
    public static final f YEARS;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final v f94166co;
    private final v eof;
    private final v joda;
    private final v kld;
    private final v nvd;

    /* JADX INFO: renamed from: ui, reason: collision with root package name */
    private final v f94167ui;

    static enum a extends f {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.f, net.time4j.engine.v
        public double getLength() {
            return 3.1556952E10d;
        }

        @Override // net.time4j.f, net.time4j.x
        public char getSymbol() {
            return 'I';
        }
    }

    static /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94168a;

        static {
            int[] iArr = new int[f.values().length];
            f94168a = iArr;
            try {
                iArr[f.WEEKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94168a[f.DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94168a[f.MILLENNIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94168a[f.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94168a[f.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94168a[f.YEARS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94168a[f.QUARTERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94168a[f.MONTHS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static class j<T extends net.time4j.engine.q<T>> implements net.time4j.engine.k0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f94169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94170b;

        j(f fVar) {
            this(fVar, 0);
        }

        private static long e(g0 g0Var, g0 g0Var2) {
            return g0Var.b() == g0Var2.b() ? g0Var2.B0() - g0Var.B0() : g0Var2.C0() - g0Var.C0();
        }

        private long f(g0 g0Var, g0 g0Var2) {
            long jD0 = g0Var2.D0() - g0Var.D0();
            int i11 = this.f94170b;
            if (i11 != 5 && i11 != 2 && i11 != 6) {
                if (jD0 <= 0 || g0Var2.f() >= g0Var.f()) {
                    return (jD0 >= 0 || g0Var2.f() <= g0Var.f()) ? jD0 : jD0 + 1;
                }
                return jD0 - 1;
            }
            f fVar = f.MONTHS;
            if (jD0 <= 0 || !g0.r0(fVar, g0Var, jD0, i11).M(g0Var2)) {
                return (jD0 >= 0 || !g0.r0(fVar, g0Var, jD0, this.f94170b).N(g0Var2)) ? jD0 : jD0 + 1;
            }
            return jD0 - 1;
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(T t11, long j11) {
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            return (T) t11.B(pVar, g0.r0(this.f94169a, (g0) t11.s(pVar), j11, this.f94170b));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(T t11, T t12) {
            long jE;
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            g0 g0Var2 = (g0) t12.s(pVar);
            switch (i.f94168a[this.f94169a.ordinal()]) {
                case 1:
                    jE = e(g0Var, g0Var2) / 7;
                    break;
                case 2:
                    jE = e(g0Var, g0Var2);
                    break;
                case 3:
                    jE = f(g0Var, g0Var2) / 12000;
                    break;
                case 4:
                    jE = f(g0Var, g0Var2) / 1200;
                    break;
                case 5:
                    jE = f(g0Var, g0Var2) / 120;
                    break;
                case 6:
                    jE = f(g0Var, g0Var2) / 12;
                    break;
                case 7:
                    jE = f(g0Var, g0Var2) / 3;
                    break;
                case 8:
                    jE = f(g0Var, g0Var2);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f94169a.name());
            }
            if (jE == 0) {
                return jE;
            }
            net.time4j.engine.p<h0> pVar2 = h0.f94524o;
            if (!t11.n(pVar2) || !t12.n(pVar2)) {
                return jE;
            }
            f fVar = this.f94169a;
            if (fVar != f.DAYS && ((g0) g0Var.H(jE, fVar)).J(g0Var2) != 0) {
                return jE;
            }
            h0 h0Var = (h0) t11.s(pVar2);
            h0 h0Var2 = (h0) t12.s(pVar2);
            if (jE <= 0 || !h0Var.w0(h0Var2)) {
                return (jE >= 0 || !h0Var.x0(h0Var2)) ? jE : jE + 1;
            }
            return jE - 1;
        }

        j(f fVar, int i11) {
            this.f94169a = fVar;
            this.f94170b = i11;
        }
    }

    static {
        a aVar = new a("MILLENNIA", 0);
        MILLENNIA = aVar;
        f fVar = new f("CENTURIES", 1) { // from class: net.time4j.f.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E9d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'C';
            }
        };
        CENTURIES = fVar;
        f fVar2 = new f("DECADES", 2) { // from class: net.time4j.f.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E8d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'E';
            }
        };
        DECADES = fVar2;
        f fVar3 = new f("YEARS", 3) { // from class: net.time4j.f.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E7d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'Y';
            }
        };
        YEARS = fVar3;
        f fVar4 = new f("QUARTERS", 4) { // from class: net.time4j.f.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 7889238.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'Q';
            }
        };
        QUARTERS = fVar4;
        f fVar5 = new f("MONTHS", 5) { // from class: net.time4j.f.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 2629746.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'M';
            }
        };
        MONTHS = fVar5;
        f fVar6 = new f("WEEKS", 6) { // from class: net.time4j.f.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 604800.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'W';
            }
        };
        WEEKS = fVar6;
        f fVar7 = new f("DAYS", 7) { // from class: net.time4j.f.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 86400.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'D';
            }
        };
        DAYS = fVar7;
        $VALUES = new f[]{aVar, fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
    }

    private f(String str, int i11) {
        super(str, i11);
        this.eof = new f0(this, 2);
        this.kld = new f0(this, 5);
        this.f94167ui = new f0(this, 4);
        this.nvd = new f0(this, 1);
        this.f94166co = new f0(this, 3);
        this.joda = new f0(this, 6);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public static v weekBasedYears() {
        return w0.f94831a;
    }

    public v atEndOfMonth() {
        int i11 = i.f94168a[ordinal()];
        if (i11 != 1 && i11 != 2) {
            return this.eof;
        }
        throw new UnsupportedOperationException("Original unit is not month-based: " + name());
    }

    public <T extends net.time4j.engine.i0<? super f, T>> long between(T t11, T t12) {
        return t11.I(t12, this);
    }

    @Override // net.time4j.engine.v
    public abstract /* synthetic */ double getLength();

    @Override // net.time4j.x
    public abstract /* synthetic */ char getSymbol();

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return true;
    }

    public v keepingEndOfMonth() {
        int i11 = i.f94168a[ordinal()];
        if (i11 != 1 && i11 != 2) {
            return this.kld;
        }
        throw new UnsupportedOperationException("Original unit is not month-based: " + name());
    }

    public v nextValidDate() {
        int i11 = i.f94168a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.nvd;
    }

    public v unlessInvalid() {
        int i11 = i.f94168a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.f94167ui;
    }

    public v withCarryOver() {
        int i11 = i.f94168a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.f94166co;
    }

    public v withJodaMetric() {
        int i11 = i.f94168a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.joda;
    }

    /* synthetic */ f(String str, int i11, a aVar) {
        this(str, i11);
    }
}
