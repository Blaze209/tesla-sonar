package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract ChronoLocalDate B(long j11);

    public abstract ChronoLocalDate E(long j11);

    public abstract ChronoLocalDate w(long j11);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return a(j11, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        return d(j11, pVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ j$.time.temporal.l k(LocalDate localDate) {
        return k(localDate);
    }

    public static ChronoLocalDate s(l lVar, j$.time.temporal.l lVar2) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) lVar2;
        if (lVar.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + lVar.m() + ", actual: " + chronoLocalDate.getChronology().m());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return super.g(j11, rVar);
        }
        switch (b.f81996a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return w(j11);
            case 2:
                return w(Math.multiplyExact(j11, 7));
            case 3:
                return B(j11);
            case 4:
                return E(j11);
            case 5:
                return E(Math.multiplyExact(j11, 10));
            case 6:
                return E(Math.multiplyExact(j11, 100));
            case 7:
                return E(Math.multiplyExact(j11, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(Math.addExact(i(aVar), j11), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jI = i(j$.time.temporal.a.YEAR_OF_ERA);
        long jI2 = i(j$.time.temporal.a.MONTH_OF_YEAR);
        long jI3 = i(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(getChronology().toString());
        sb2.append(" ");
        sb2.append(H());
        sb2.append(" ");
        sb2.append(jI);
        sb2.append(jI2 < 10 ? "-0" : "-");
        sb2.append(jI2);
        sb2.append(jI3 < 10 ? "-0" : "-");
        sb2.append(jI3);
        return sb2.toString();
    }
}
