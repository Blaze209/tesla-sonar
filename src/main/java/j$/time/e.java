package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements TemporalQuery, j$.time.temporal.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82054a;

    public /* synthetic */ e(int i11) {
        this.f82054a = i11;
    }

    @Override // j$.time.temporal.m
    public j$.time.temporal.l c(j$.time.temporal.l lVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return lVar.d(lVar.j(aVar).f82224d, aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i11 = this.f82054a;
        e eVar = j$.time.temporal.q.f82214a;
        switch (i11) {
            case 0:
                return LocalDate.B(temporalAccessor);
            case 1:
                return LocalTime.w(temporalAccessor);
            case 2:
                e eVar2 = DateTimeFormatterBuilder.f82065h;
                ZoneId zoneId = (ZoneId) temporalAccessor.b(eVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.h(aVar)) {
                    return LocalTime.E(temporalAccessor.i(aVar));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.b(eVar);
            case 5:
                return (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.q.f82215b);
            case 6:
                return (j$.time.temporal.r) temporalAccessor.b(j$.time.temporal.q.f82216c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.h(aVar2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.e(aVar2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.b(eVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.b(j$.time.temporal.q.f82217d);
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.h(aVar3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.i(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f82054a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
