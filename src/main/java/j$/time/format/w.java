package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f82154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f82155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82156c;

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00bd, please report this as an issue */
    public w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        int i11;
        ZoneId zoneIdD;
        j$.time.chrono.l lVar = dateTimeFormatter.f82063e;
        ZoneId zoneId = dateTimeFormatter.f82064f;
        if (lVar != null || zoneId != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.q.f82215b);
            ZoneId zoneId2 = (ZoneId) temporalAccessor.b(j$.time.temporal.q.f82214a);
            ChronoLocalDate chronoLocalDateC = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            zoneId = Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (lVar != null || zoneId != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (lVar != null) {
                        if (temporalAccessor.h(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateC = lVar3.C(temporalAccessor);
                        } else if (lVar == j$.time.chrono.s.f82037c || lVar2 != null) {
                            for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                                if (!aVar.isDateBased() && temporalAccessor.h(aVar)) {
                                    throw new DateTimeException("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new v(chronoLocalDateC, temporalAccessor, lVar3, zoneId2);
                } else if (temporalAccessor.h(j$.time.temporal.a.INSTANT_SECONDS)) {
                    j$.time.chrono.s sVar = j$.time.chrono.s.f82037c;
                    if (lVar3 == null) {
                        Objects.requireNonNull(sVar, "defaultObj");
                        lVar3 = sVar;
                    }
                    temporalAccessor = lVar3.N(Instant.w(temporalAccessor), zoneId);
                } else {
                    try {
                        j$.time.zone.f fVarS = zoneId.s();
                        zoneIdD = fVarS.h() ? fVarS.d(Instant.EPOCH) : zoneId;
                    } catch (j$.time.zone.g unused) {
                    }
                    if (zoneIdD instanceof ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.h(aVar2) && temporalAccessor.e(aVar2) != zoneId.s().d(Instant.EPOCH).getTotalSeconds()) {
                            throw new DateTimeException("Unable to apply override zone '" + zoneId + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (lVar != null) {
                        if (temporalAccessor.h(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateC = lVar3.C(temporalAccessor);
                        } else if (lVar == j$.time.chrono.s.f82037c) {
                            while (i11 < r2) {
                                if (!aVar.isDateBased()) {
                                }
                            }
                        } else {
                            while (i11 < r2) {
                                if (!aVar.isDateBased()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new v(chronoLocalDateC, temporalAccessor, lVar3, zoneId2);
                }
            }
        }
        this.f82154a = temporalAccessor;
        this.f82155b = dateTimeFormatter;
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f82154a;
        Object objB = temporalAccessor.b(temporalQuery);
        if (objB != null || this.f82156c != 0) {
            return objB;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i11 = this.f82156c;
        TemporalAccessor temporalAccessor = this.f82154a;
        if (i11 <= 0 || temporalAccessor.h(pVar)) {
            return Long.valueOf(temporalAccessor.i(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.f82154a.toString();
    }
}
