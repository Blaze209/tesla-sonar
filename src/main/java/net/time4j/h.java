package net.time4j;

import ch.qos.logback.core.CoreConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h implements w {
    private static final /* synthetic */ h[] $VALUES;
    private static final long[] FACTORS;
    public static final h HOURS;
    public static final h MICROS;
    public static final h MILLIS;
    public static final h MINUTES;
    public static final h NANOS;
    public static final h SECONDS;

    static enum a extends h {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.h, net.time4j.engine.v
        public double getLength() {
            return 3600.0d;
        }

        @Override // net.time4j.h, net.time4j.x
        public char getSymbol() {
            return 'H';
        }
    }

    static {
        a aVar = new a("HOURS", 0);
        HOURS = aVar;
        h hVar = new h("MINUTES", 1) { // from class: net.time4j.h.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.h, net.time4j.engine.v
            public double getLength() {
                return 60.0d;
            }

            @Override // net.time4j.h, net.time4j.x
            public char getSymbol() {
                return 'M';
            }
        };
        MINUTES = hVar;
        h hVar2 = new h("SECONDS", 2) { // from class: net.time4j.h.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.h, net.time4j.engine.v
            public double getLength() {
                return 1.0d;
            }

            @Override // net.time4j.h, net.time4j.x
            public char getSymbol() {
                return 'S';
            }
        };
        SECONDS = hVar2;
        h hVar3 = new h("MILLIS", 3) { // from class: net.time4j.h.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.h, net.time4j.engine.v
            public double getLength() {
                return 0.001d;
            }

            @Override // net.time4j.h, net.time4j.x
            public char getSymbol() {
                return '3';
            }
        };
        MILLIS = hVar3;
        h hVar4 = new h("MICROS", 4) { // from class: net.time4j.h.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.h, net.time4j.engine.v
            public double getLength() {
                return 1.0E-6d;
            }

            @Override // net.time4j.h, net.time4j.x
            public char getSymbol() {
                return '6';
            }
        };
        MICROS = hVar4;
        h hVar5 = new h("NANOS", 5) { // from class: net.time4j.h.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.h, net.time4j.engine.v
            public double getLength() {
                return 1.0E-9d;
            }

            @Override // net.time4j.h, net.time4j.x
            public char getSymbol() {
                return '9';
            }
        };
        NANOS = hVar5;
        $VALUES = new h[]{aVar, hVar, hVar2, hVar3, hVar4, hVar5};
        FACTORS = new long[]{1, 60, 3600, CoreConstants.MILLIS_IN_ONE_HOUR, 3600000000L, 3600000000000L};
    }

    private h(String str, int i11) {
        super(str, i11);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public <T extends net.time4j.engine.i0<? super h, T>> long between(T t11, T t12) {
        return t11.I(t12, this);
    }

    public long convert(long j11, h hVar) {
        if (j11 == 0) {
            return 0L;
        }
        int iOrdinal = ordinal();
        int iOrdinal2 = hVar.ordinal();
        if (iOrdinal == iOrdinal2) {
            return j11;
        }
        if (iOrdinal > iOrdinal2) {
            long[] jArr = FACTORS;
            return net.time4j.base.c.i(j11, jArr[iOrdinal] / jArr[iOrdinal2]);
        }
        long[] jArr2 = FACTORS;
        return j11 / (jArr2[iOrdinal2] / jArr2[iOrdinal]);
    }

    @Override // net.time4j.engine.v
    public abstract /* synthetic */ double getLength();

    @Override // net.time4j.x
    public abstract /* synthetic */ char getSymbol();

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return false;
    }

    public net.time4j.engine.c0<h> only() {
        return g.b(this);
    }

    public net.time4j.engine.c0<h> rounded() {
        return g.c(this);
    }

    public net.time4j.engine.c0<h> truncated() {
        return g.d(this);
    }

    /* synthetic */ h(String str, int i11, a aVar) {
        this(str, i11);
    }

    public long convert(net.time4j.engine.j0<? extends h> j0Var) {
        long jK = 0;
        if (j0Var.isEmpty()) {
            return 0L;
        }
        h hVar = null;
        for (int size = j0Var.a().size() - 1; size >= 0; size--) {
            net.time4j.engine.j0.a<? extends h> aVar = j0Var.a().get(size);
            h hVarB = aVar.b();
            if (hVar == null) {
                jK = aVar.a();
                hVar = hVarB;
            } else {
                jK = net.time4j.base.c.f(jK, hVar.convert(aVar.a(), hVarB));
            }
        }
        if (j0Var.isNegative()) {
            jK = net.time4j.base.c.k(jK);
        }
        return convert(jK, hVar);
    }
}
