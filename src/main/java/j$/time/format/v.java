package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChronoLocalDate f82150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f82151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.l f82152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f82153d;

    public v(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.f82150a = chronoLocalDate;
        this.f82151b = temporalAccessor;
        this.f82152c = lVar;
        this.f82153d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f82150a;
        if (chronoLocalDate != null && pVar.isDateBased()) {
            return chronoLocalDate.h(pVar);
        }
        return this.f82151b.h(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f82150a;
        if (chronoLocalDate != null && pVar.isDateBased()) {
            return chronoLocalDate.j(pVar);
        }
        return this.f82151b.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f82150a;
        if (chronoLocalDate != null && pVar.isDateBased()) {
            return chronoLocalDate.i(pVar);
        }
        return this.f82151b.i(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return this.f82152c;
        }
        if (temporalQuery == j$.time.temporal.q.f82214a) {
            return this.f82153d;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return this.f82151b.b(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.f82152c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f82153d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f82151b + str + str2;
    }
}
