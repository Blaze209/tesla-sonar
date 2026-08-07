package net.time4j.history;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
abstract class c implements net.time4j.history.b {
    private static final /* synthetic */ c[] $VALUES;
    public static final c GREGORIAN;
    public static final c JULIAN;
    public static final c SWEDISH;

    static enum a extends c {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public h fromMJD(long j11) {
            long jL = net.time4j.base.b.l(j11);
            int i11 = net.time4j.base.b.i(jL);
            int iH = net.time4j.base.b.h(jL);
            int iG = net.time4j.base.b.g(jL);
            j jVar = i11 <= 0 ? j.BC : j.AD;
            if (i11 <= 0) {
                i11 = 1 - i11;
            }
            return new h(jVar, i11, iH, iG);
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            return net.time4j.base.b.d(c.getProlepticYear(hVar), hVar.d());
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public boolean isValid(h hVar) {
            return net.time4j.base.b.f(c.getProlepticYear(hVar), hVar.d(), hVar.b());
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public long toMJD(h hVar) {
            return net.time4j.base.b.j(c.getProlepticYear(hVar), hVar.d(), hVar.b());
        }
    }

    static {
        a aVar = new a("GREGORIAN", 0);
        GREGORIAN = aVar;
        c cVar = new c("JULIAN", 1) { // from class: net.time4j.history.c.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public h fromMJD(long j11) {
                long jI = m.i(j11);
                int iG = m.g(jI);
                int iF = m.f(jI);
                int iE = m.e(jI);
                j jVar = iG <= 0 ? j.BC : j.AD;
                if (iG <= 0) {
                    iG = 1 - iG;
                }
                return new h(jVar, iG, iF, iE);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                return m.b(c.getProlepticYear(hVar), hVar.d());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                return m.d(c.getProlepticYear(hVar), hVar.d(), hVar.b());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public long toMJD(h hVar) {
                return m.h(c.getProlepticYear(hVar), hVar.d(), hVar.b());
            }
        };
        JULIAN = cVar;
        c cVar2 = new c("SWEDISH", 2) { // from class: net.time4j.history.c.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public h fromMJD(long j11) {
                return j11 == -53576 ? new h(j.AD, 1712, 2, 30) : c.JULIAN.fromMJD(j11 + 1);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.d() == 2 && prolepticYear == 1712) {
                    return 30;
                }
                return m.b(prolepticYear, hVar.d());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && prolepticYear == 1712) {
                    return true;
                }
                return m.d(prolepticYear, hVar.d(), hVar.b());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public long toMJD(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && prolepticYear == 1712) {
                    return -53576L;
                }
                return m.h(prolepticYear, hVar.d(), hVar.b()) - 1;
            }
        };
        SWEDISH = cVar2;
        $VALUES = new c[]{aVar, cVar, cVar2};
    }

    private c(String str, int i11) {
        super(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getProlepticYear(h hVar) {
        return hVar.c().annoDomini(hVar.e());
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // net.time4j.history.b
    public abstract /* synthetic */ h fromMJD(long j11);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ int getMaximumDayOfMonth(h hVar);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ boolean isValid(h hVar);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ long toMJD(h hVar);

    /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}
