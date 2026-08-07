package net.time4j.history;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n BEGIN_OF_JANUARY;
    public static final n BEGIN_OF_MARCH;
    public static final n BEGIN_OF_SEPTEMBER;
    public static final n CALCULUS_PISANUS;
    public static final n CHRISTMAS_STYLE;
    private static final int COUNCIL_OF_TOURS = 567;
    public static final n EASTER_STYLE;
    public static final n EPIPHANY;
    public static final n GOOD_FRIDAY;
    public static final n MARIA_ANUNCIATA;

    static enum a extends n {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.history.n
        int displayedYear(o oVar, net.time4j.history.h hVar) {
            return hVar.e();
        }

        @Override // net.time4j.history.n
        net.time4j.history.h newYear(j jVar, int i11) {
            return net.time4j.history.h.g(jVar, i11, 1, 1);
        }
    }

    static {
        a aVar = new a("BEGIN_OF_JANUARY", 0);
        BEGIN_OF_JANUARY = aVar;
        n nVar = new n("BEGIN_OF_MARCH", 1) { // from class: net.time4j.history.n.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.g(jVar, i11, 3, 1);
            }
        };
        BEGIN_OF_MARCH = nVar;
        n nVar2 = new n("BEGIN_OF_SEPTEMBER", 2) { // from class: net.time4j.history.n.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                j jVarC = hVar.c();
                int iE = hVar.e();
                int i11 = iE + 1;
                return hVar.compareTo(oVar.d(jVarC, i11)) >= 0 ? i11 : iE;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.g(jVar, i11 - 1, 9, 1);
            }
        };
        BEGIN_OF_SEPTEMBER = nVar2;
        n nVar3 = new n("CHRISTMAS_STYLE", 3) { // from class: net.time4j.history.n.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                int iE = hVar.e();
                int i11 = iE + 1;
                return hVar.compareTo(oVar.d(hVar.c(), i11)) >= 0 ? i11 : iE;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.g(jVar, i11 - 1, 12, 25);
            }
        };
        CHRISTMAS_STYLE = nVar3;
        n nVar4 = new n("EASTER_STYLE", 4) { // from class: net.time4j.history.n.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                int i12;
                int iMarchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i11));
                int i13 = iMarchDay - 1;
                if (i13 > 31) {
                    i13 = iMarchDay - 32;
                    i12 = 4;
                } else {
                    i12 = 3;
                }
                return net.time4j.history.h.g(jVar, i11, i12, i13);
            }
        };
        EASTER_STYLE = nVar4;
        n nVar5 = new n("GOOD_FRIDAY", 5) { // from class: net.time4j.history.n.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                int i12;
                int iMarchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i11));
                int i13 = iMarchDay - 2;
                if (i13 > 31) {
                    i13 = iMarchDay - 33;
                    i12 = 4;
                } else {
                    i12 = 3;
                }
                return net.time4j.history.h.g(jVar, i11, i12, i13);
            }
        };
        GOOD_FRIDAY = nVar5;
        n nVar6 = new n("MARIA_ANUNCIATA", 6) { // from class: net.time4j.history.n.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.g(jVar, i11, 3, 25);
            }
        };
        MARIA_ANUNCIATA = nVar6;
        n nVar7 = new n("CALCULUS_PISANUS", 7) { // from class: net.time4j.history.n.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                int iE = hVar.e();
                int i11 = iE - 1;
                return hVar.compareTo(newYear(hVar.c(), i11)) < 0 ? iE - 2 : i11;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return n.MARIA_ANUNCIATA.newYear(jVar, i11 + 1);
            }

            @Override // net.time4j.history.n
            int standardYear(boolean z11, o oVar, j jVar, int i11, int i12, int i13) {
                return n.MARIA_ANUNCIATA.standardYear(z11, oVar, jVar, i11 + 1, i12, i13);
            }
        };
        CALCULUS_PISANUS = nVar7;
        n nVar8 = new n("EPIPHANY", 8) { // from class: net.time4j.history.n.i
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.g(jVar, i11, 1, 6);
            }
        };
        EPIPHANY = nVar8;
        $VALUES = new n[]{aVar, nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
    }

    private n(String str, int i11) {
        super(str, i11);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    int displayedYear(o oVar, net.time4j.history.h hVar) {
        int iE = hVar.e();
        return hVar.compareTo(newYear(hVar.c(), iE)) < 0 ? iE - 1 : iE;
    }

    abstract net.time4j.history.h newYear(j jVar, int i11);

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[PHI: r1 r9
      0x002d: PHI (r1v2 int) = (r1v1 int), (r1v0 int) binds: [B:22:0x0042, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r9v5 int) = (r9v2 int), (r9v8 int) binds: [B:22:0x0042, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    int standardYear(boolean z11, o oVar, j jVar, int i11, int i12, int i13) {
        int i14;
        if (i12 >= 5 && i12 <= 8) {
            return i11;
        }
        net.time4j.history.h hVarNewYear = newYear(jVar, i11);
        int i15 = i11 + 1;
        net.time4j.history.h hVarD = oVar.d(jVar, i15);
        net.time4j.history.h hVarG = net.time4j.history.h.g(jVar, i11, i12, i13);
        if (i12 <= 4) {
            net.time4j.history.h hVarG2 = net.time4j.history.h.g(jVar, i15, i12, i13);
            i14 = hVarG.compareTo(hVarNewYear) >= 0 ? i11 : i15;
            if (hVarG2.compareTo(hVarD) < 0) {
                i11 = i15;
            }
        } else {
            i15 = i11 - 1;
            i14 = net.time4j.history.h.g(jVar, i15, i12, i13).compareTo(hVarNewYear) >= 0 ? i15 : i11;
            if (hVarG.compareTo(hVarD) >= 0) {
                i11 = i15;
            }
        }
        if (i14 <= i11) {
            return z11 ? i14 : i11;
        }
        throw new IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + hVarG);
    }

    public o until(int i11) {
        if (i11 <= COUNCIL_OF_TOURS) {
            throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
        }
        o oVar = new o(this, i11);
        n nVar = BEGIN_OF_JANUARY;
        return this != nVar ? new o(nVar, COUNCIL_OF_TOURS).b(oVar) : oVar;
    }

    /* synthetic */ n(String str, int i11, a aVar) {
        this(str, i11);
    }
}
