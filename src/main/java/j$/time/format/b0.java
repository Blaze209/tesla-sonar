package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZoneId f82078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j$.time.chrono.l f82079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f82081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ChronoLocalDate f82082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalTime f82083g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f82077a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j$.time.n f82084h = j$.time.n.f82174d;

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (((HashMap) this.f82077a).containsKey(pVar)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f82082f;
        if (chronoLocalDate != null && chronoLocalDate.h(pVar)) {
            return true;
        }
        LocalTime localTime = this.f82083g;
        if (localTime == null || !localTime.h(pVar)) {
            return (pVar == null || (pVar instanceof j$.time.temporal.a) || !pVar.s(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l11 = (Long) ((HashMap) this.f82077a).get(pVar);
        if (l11 != null) {
            return l11.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f82082f;
        if (chronoLocalDate != null && chronoLocalDate.h(pVar)) {
            return this.f82082f.i(pVar);
        }
        LocalTime localTime = this.f82083g;
        if (localTime != null && localTime.h(pVar)) {
            return this.f82083g.i(pVar);
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        return pVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82214a) {
            return this.f82078b;
        }
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return this.f82079c;
        }
        if (temporalQuery == j$.time.temporal.q.f82219f) {
            ChronoLocalDate chronoLocalDate = this.f82082f;
            if (chronoLocalDate != null) {
                return LocalDate.B(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82220g) {
            return this.f82083g;
        }
        if (temporalQuery == j$.time.temporal.q.f82217d) {
            Long l11 = (Long) ((HashMap) this.f82077a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l11 != null) {
                return ZoneOffset.ofTotalSeconds(l11.intValue());
            }
            ZoneId zoneId = this.f82078b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.q.f82218e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final void v(j$.time.temporal.p pVar, j$.time.temporal.a aVar, Long l11) {
        Long l12 = (Long) ((HashMap) this.f82077a).put(aVar, l11);
        if (l12 == null || l12.longValue() == l11.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + " " + l12 + " differs from " + aVar + " " + l11 + " while resolving  " + pVar);
    }

    public final void m() {
        if (((HashMap) this.f82077a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f82078b;
            if (zoneId != null) {
                n(zoneId);
                return;
            }
            Long l11 = (Long) ((HashMap) this.f82077a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l11 != null) {
                n(ZoneOffset.ofTotalSeconds(l11.intValue()));
            }
        }
    }

    public final void n(ZoneId zoneId) {
        Map map = this.f82077a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        j$.time.chrono.i iVarN = this.f82079c.N(Instant.s(((Long) ((HashMap) map).remove(aVar)).longValue(), 0), zoneId);
        u(iVarN.toLocalDate());
        v(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(iVarN.toLocalTime().toSecondOfDay()));
    }

    public final void u(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f82082f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f82082f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f82079c.equals(chronoLocalDate.getChronology())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f82079c);
            }
            this.f82082f = chronoLocalDate;
        }
    }

    public final void q() {
        Map map = this.f82077a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(aVar)) {
            long jLongValue = ((Long) ((HashMap) this.f82077a).remove(aVar)).longValue();
            c0 c0Var = this.f82081e;
            if (c0Var == c0.STRICT || (c0Var == c0.SMART && jLongValue != 0)) {
                aVar.R(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            v(aVar, aVar2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f82077a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(aVar3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f82077a).remove(aVar3)).longValue();
            c0 c0Var2 = this.f82081e;
            if (c0Var2 == c0.STRICT || (c0Var2 == c0.SMART && jLongValue2 != 0)) {
                aVar3.R(jLongValue2);
            }
            v(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f82077a;
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(aVar4)) {
            Map map4 = this.f82077a;
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(aVar5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f82077a).remove(aVar4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f82077a).remove(aVar5)).longValue();
                if (this.f82081e == c0.LENIENT) {
                    v(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.R(jLongValue3);
                    aVar5.R(jLongValue3);
                    v(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f82077a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(aVar6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f82077a).remove(aVar6)).longValue();
            if (this.f82081e != c0.LENIENT) {
                aVar6.R(jLongValue5);
            }
            v(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            v(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            v(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            v(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f82077a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(aVar7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f82077a).remove(aVar7)).longValue();
            if (this.f82081e != c0.LENIENT) {
                aVar7.R(jLongValue6);
            }
            v(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            v(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f82077a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(aVar8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f82077a).remove(aVar8)).longValue();
            if (this.f82081e != c0.LENIENT) {
                aVar8.R(jLongValue7);
            }
            v(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            v(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f82077a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(aVar9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f82077a).remove(aVar9)).longValue();
            if (this.f82081e != c0.LENIENT) {
                aVar9.R(jLongValue8);
            }
            v(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            v(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            v(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f82077a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(aVar10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f82077a).remove(aVar10)).longValue();
            if (this.f82081e != c0.LENIENT) {
                aVar10.R(jLongValue9);
            }
            v(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            v(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f82077a;
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(aVar11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f82077a).get(aVar11)).longValue();
            c0 c0Var3 = this.f82081e;
            c0 c0Var4 = c0.LENIENT;
            if (c0Var3 != c0Var4) {
                aVar11.R(jLongValue10);
            }
            Map map11 = this.f82077a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(aVar12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f82077a).remove(aVar12)).longValue();
                if (this.f82081e != c0Var4) {
                    aVar12.R(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                v(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f82077a;
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(aVar13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f82077a).remove(aVar13)).longValue();
                if (this.f82081e != c0Var4) {
                    aVar13.R(jLongValue12);
                }
                v(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f82077a;
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(aVar14)) {
            Map map14 = this.f82077a;
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(aVar15)) {
                Map map15 = this.f82077a;
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(aVar16) && ((HashMap) this.f82077a).containsKey(aVar11)) {
                    p(((Long) ((HashMap) this.f82077a).remove(aVar14)).longValue(), ((Long) ((HashMap) this.f82077a).remove(aVar15)).longValue(), ((Long) ((HashMap) this.f82077a).remove(aVar16)).longValue(), ((Long) ((HashMap) this.f82077a).remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void p(long j11, long j12, long j13, long j14) {
        if (this.f82081e == c0.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j11, 3600000000000L), Math.multiplyExact(j12, 60000000000L)), Math.multiplyExact(j13, 1000000000L)), j14);
            s(LocalTime.E(Math.floorMod(jAddExact, 86400000000000L)), j$.time.n.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.f82197b.a(j12, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.f82197b.a(j14, aVar2);
        if (this.f82081e == c0.SMART && j11 == 24 && iA == 0 && j13 == 0 && iA2 == 0) {
            s(LocalTime.f81970e, j$.time.n.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.f82197b.a(j11, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        s(LocalTime.of(iA3, iA, aVar4.f82197b.a(j13, aVar4), iA2), j$.time.n.f82174d);
    }

    public final void s(LocalTime localTime, j$.time.n nVar) {
        LocalTime localTime2 = this.f82083g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f82083g + " " + localTime);
            }
            j$.time.n nVar2 = this.f82084h;
            nVar2.getClass();
            j$.time.n nVar3 = j$.time.n.f82174d;
            if (nVar2 != nVar3 && nVar != nVar3 && !this.f82084h.equals(nVar)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f82084h + " " + nVar);
            }
            this.f82084h = nVar;
            return;
        }
        this.f82083g = localTime;
        this.f82084h = nVar;
    }

    public final void l(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f82077a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
            if (temporalAccessor.h(pVar)) {
                try {
                    long jI = temporalAccessor.i(pVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jI != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + pVar + " " + jI + " differs from " + pVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f82077a);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(this.f82079c);
        if (this.f82078b != null) {
            sb2.append(CoreConstants.COMMA_CHAR);
            sb2.append(this.f82078b);
        }
        if (this.f82082f != null || this.f82083g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f82082f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f82083g != null) {
                    sb2.append('T');
                    sb2.append(this.f82083g);
                }
            } else {
                sb2.append(this.f82083g);
            }
        }
        return sb2.toString();
    }
}
