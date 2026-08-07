package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f82225f = t.f(1, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f82226g = t.g(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f82227h = t.g(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f82228i = t.g(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f82230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f82231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f82232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f82233e;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public final ChronoLocalDate e(j$.time.chrono.l lVar, int i11, int i12, int i13) {
        ChronoLocalDate chronoLocalDateK = lVar.K(i11, 1, 1);
        int iH = h(1, b(chronoLocalDateK));
        return chronoLocalDateK.g(((Math.min(i12, a(iH, chronoLocalDateK.O() + this.f82230b.f82237b) - 1) - 1) * 7) + (i13 - 1) + (-iH), (r) ChronoUnit.DAYS);
    }

    public u(String str, v vVar, r rVar, r rVar2, t tVar) {
        this.f82229a = str;
        this.f82230b = vVar;
        this.f82231c = rVar;
        this.f82232d = rVar2;
        this.f82233e = tVar;
    }

    @Override // j$.time.temporal.p
    public final long J(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f82232d;
        if (rVar == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (rVar != ChronoUnit.MONTHS) {
            if (rVar != ChronoUnit.YEARS) {
                if (rVar == v.f82235h) {
                    iC = d(temporalAccessor);
                } else if (rVar == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iE = temporalAccessor.e(a.DAY_OF_YEAR);
                iC = a(h(iE, iB), iE);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iE2 = temporalAccessor.e(a.DAY_OF_MONTH);
            iC = a(h(iE2, iB2), iE2);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.e(a.DAY_OF_WEEK) - this.f82230b.f82236a.getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iE = temporalAccessor.e(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iE2 = temporalAccessor.e(aVar);
        int iH = h(iE2, iB);
        int iA = a(iH, iE2);
        if (iA == 0) {
            return iE - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.j(aVar).f82224d) + this.f82230b.f82237b) ? iE + 1 : iE;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iE = temporalAccessor.e(aVar);
        int iH = h(iE, iB);
        int iA2 = a(iH, iE);
        if (iA2 == 0) {
            return d(j$.time.chrono.l.n(temporalAccessor).C(temporalAccessor).a(iE, (r) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.j(aVar).f82224d) + this.f82230b.f82237b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i11, int i12) {
        int iFloorMod = Math.floorMod(i11 - i12, 7);
        return iFloorMod + 1 > this.f82230b.f82237b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i11, int i12) {
        return ((i12 - 1) + (i11 + 7)) / 7;
    }

    @Override // j$.time.temporal.p
    public final l P(l lVar, long j11) {
        int iA = this.f82233e.a(j11, this);
        int iE = lVar.e(this);
        if (iA == iE) {
            return lVar;
        }
        if (this.f82232d != ChronoUnit.FOREVER) {
            return lVar.g(iA - iE, this.f82231c);
        }
        v vVar = this.f82230b;
        return e(j$.time.chrono.l.n(lVar), (int) j11, lVar.e(vVar.f82240e), lVar.e(vVar.f82238c));
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor B(Map map, b0 b0Var, c0 c0Var) {
        ChronoLocalDate chronoLocalDateG;
        ChronoLocalDate chronoLocalDateG2;
        ChronoLocalDate chronoLocalDateG3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        t tVar = this.f82233e;
        v vVar = this.f82230b;
        r rVar = this.f82232d;
        if (rVar == chronoUnit) {
            long jFloorMod = Math.floorMod((tVar.a(jLongValue, this) - 1) + (vVar.f82236a.getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.f82197b.a(((Long) map.get(aVar)).longValue(), aVar) - vVar.f82236a.getValue(), 7) + 1;
        j$.time.chrono.l lVarN = j$.time.chrono.l.n(b0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((rVar != v.f82235h && rVar != ChronoUnit.FOREVER) || !map.containsKey(vVar.f82241f) || !map.containsKey(vVar.f82240e)) {
                return null;
            }
            u uVar = vVar.f82241f;
            int iA = uVar.f82233e.a(((Long) map.get(uVar)).longValue(), vVar.f82241f);
            if (c0Var == c0.LENIENT) {
                chronoLocalDateG = e(lVarN, iA, 1, iFloorMod).g(Math.subtractExact(((Long) map.get(vVar.f82240e)).longValue(), 1L), (r) chronoUnit);
            } else {
                u uVar2 = vVar.f82240e;
                ChronoLocalDate chronoLocalDateE = e(lVarN, iA, uVar2.f82233e.a(((Long) map.get(uVar2)).longValue(), vVar.f82240e), iFloorMod);
                if (c0Var == c0.STRICT && c(chronoLocalDateE) != iA) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateG = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(vVar.f82241f);
            map.remove(vVar.f82240e);
            map.remove(aVar);
            return chronoLocalDateG;
        }
        int iA2 = aVar2.f82197b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (rVar == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j11 = intExact;
                if (c0Var == c0.LENIENT) {
                    ChronoLocalDate chronoLocalDateG4 = lVarN.K(iA2, 1, 1).g(Math.subtractExact(jLongValue2, 1L), (r) chronoUnit2);
                    int iB = b(chronoLocalDateG4);
                    int iE = chronoLocalDateG4.e(a.DAY_OF_MONTH);
                    chronoLocalDateG3 = chronoLocalDateG4.g(Math.addExact(Math.multiplyExact(Math.subtractExact(j11, a(h(iE, iB), iE)), 7), iFloorMod - b(chronoLocalDateG4)), (r) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateK = lVarN.K(iA2, aVar3.f82197b.a(jLongValue2, aVar3), 1);
                    long jA = tVar.a(j11, this);
                    int iB2 = b(chronoLocalDateK);
                    int iE2 = chronoLocalDateK.e(a.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateG5 = chronoLocalDateK.g((((int) (jA - ((long) a(h(iE2, iB2), iE2)))) * 7) + (iFloorMod - b(chronoLocalDateK)), (r) ChronoUnit.DAYS);
                    if (c0Var == c0.STRICT && chronoLocalDateG5.i(aVar3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateG3 = chronoLocalDateG5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return chronoLocalDateG3;
            }
        }
        if (rVar != ChronoUnit.YEARS) {
            return null;
        }
        long j12 = intExact;
        ChronoLocalDate chronoLocalDateK2 = lVarN.K(iA2, 1, 1);
        if (c0Var == c0.LENIENT) {
            int iB3 = b(chronoLocalDateK2);
            int iE3 = chronoLocalDateK2.e(a.DAY_OF_YEAR);
            chronoLocalDateG2 = chronoLocalDateK2.g(Math.addExact(Math.multiplyExact(Math.subtractExact(j12, a(h(iE3, iB3), iE3)), 7), iFloorMod - b(chronoLocalDateK2)), (r) ChronoUnit.DAYS);
        } else {
            long jA2 = tVar.a(j12, this);
            int iB4 = b(chronoLocalDateK2);
            int iE4 = chronoLocalDateK2.e(a.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateG6 = chronoLocalDateK2.g((((int) (jA2 - ((long) a(h(iE4, iB4), iE4)))) * 7) + (iFloorMod - b(chronoLocalDateK2)), (r) ChronoUnit.DAYS);
            if (c0Var == c0.STRICT && chronoLocalDateG6.i(aVar2) != iA2) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateG2 = chronoLocalDateG6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return chronoLocalDateG2;
    }

    @Override // j$.time.temporal.p
    public final t E() {
        return this.f82233e;
    }

    @Override // j$.time.temporal.p
    public final boolean s(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.h(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f82232d;
        if (rVar == chronoUnit) {
            return true;
        }
        if (rVar == ChronoUnit.MONTHS) {
            return temporalAccessor.h(a.DAY_OF_MONTH);
        }
        if (rVar == ChronoUnit.YEARS) {
            return temporalAccessor.h(a.DAY_OF_YEAR);
        }
        if (rVar == v.f82235h) {
            return temporalAccessor.h(a.DAY_OF_YEAR);
        }
        if (rVar == ChronoUnit.FOREVER) {
            return temporalAccessor.h(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final t w(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f82232d;
        if (rVar == chronoUnit) {
            return this.f82233e;
        }
        if (rVar == ChronoUnit.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (rVar == ChronoUnit.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (rVar == v.f82235h) {
            return g(temporalAccessor);
        }
        if (rVar == ChronoUnit.FOREVER) {
            return a.YEAR.f82197b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
    }

    public final t f(TemporalAccessor temporalAccessor, a aVar) {
        int iH = h(temporalAccessor.e(aVar), b(temporalAccessor));
        t tVarJ = temporalAccessor.j(aVar);
        return t.f(a(iH, (int) tVarJ.f82221a), a(iH, (int) tVarJ.f82224d));
    }

    public final t g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.h(aVar)) {
            return f82227h;
        }
        int iB = b(temporalAccessor);
        int iE = temporalAccessor.e(aVar);
        int iH = h(iE, iB);
        int iA = a(iH, iE);
        if (iA != 0) {
            int i11 = (int) temporalAccessor.j(aVar).f82224d;
            int iA2 = a(iH, this.f82230b.f82237b + i11);
            if (iA >= iA2) {
                return g(j$.time.chrono.l.n(temporalAccessor).C(temporalAccessor).g((i11 - iE) + 8, (r) ChronoUnit.DAYS));
            }
            return t.f(1L, iA2 - 1);
        }
        return g(j$.time.chrono.l.n(temporalAccessor).C(temporalAccessor).a(iE + 7, (r) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f82229a + "[" + this.f82230b.toString() + "]";
    }
}
