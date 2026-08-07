package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        Long lA = wVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = wVar.f82154a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.h(aVar) ? Long.valueOf(temporalAccessor.i(aVar)) : null;
        int i11 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.f82197b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j11 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j11, 315569520000L) + 1;
            LocalDateTime localDateTimeJ = LocalDateTime.J(Math.floorMod(j11, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb2.append('+');
                sb2.append(jFloorDiv);
            }
            sb2.append(localDateTimeJ);
            if (localDateTimeJ.f81969b.f81974c == 0) {
                sb2.append(":00");
            }
        } else {
            long j12 = jLongValue + 62167219200L;
            long j13 = j12 / 315569520000L;
            long j14 = j12 % 315569520000L;
            LocalDateTime localDateTimeJ2 = LocalDateTime.J(j14 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeJ2);
            if (localDateTimeJ2.f81969b.f81974c == 0) {
                sb2.append(":00");
            }
            if (j13 < 0) {
                if (localDateTimeJ2.f81968a.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j13 - 1));
                } else if (j14 == 0) {
                    sb2.insert(length, j13);
                } else {
                    sb2.insert(length + 1, Math.abs(j13));
                }
            }
        }
        if (iA > 0) {
            sb2.append(CoreConstants.DOT);
            int i12 = 100000000;
            while (true) {
                if (iA <= 0 && i11 % 3 == 0 && i11 >= -2) {
                    break;
                }
                int i13 = iA / i12;
                sb2.append((char) (i13 + 48));
                iA -= i13 * i12;
                i12 /= 10;
                i11++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.k(aVar, 2);
        dateTimeFormatterBuilder.d(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.k(aVar2, 2);
        dateTimeFormatterBuilder.d(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.k(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i12 = 1;
        dateTimeFormatterBuilder.b(aVar4, 0, 9, true);
        dateTimeFormatterBuilder.d('Z');
        d dVar = dateTimeFormatterBuilder.toFormatter().f82059a;
        if (dVar.f82088b) {
            dVar = new d(dVar.f82087a, false);
        }
        u uVar2 = new u(uVar.f82145a);
        uVar2.f82146b = uVar.f82146b;
        uVar2.f82147c = uVar.f82147c;
        int iW = dVar.w(uVar2, charSequence, i11);
        if (iW < 0) {
            return iW;
        }
        long jLongValue = uVar2.d(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = uVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = uVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = uVar2.d(aVar).intValue();
        int iIntValue4 = uVar2.d(aVar2).intValue();
        Long lD = uVar2.d(aVar3);
        Long lD2 = uVar2.d(aVar4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            uVar.c().f82080d = true;
            i12 = 0;
            iIntValue5 = 59;
        } else {
            i12 = 0;
        }
        int i13 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.f81966c;
            LocalDate localDateOf = LocalDate.of(i13, iIntValue, iIntValue2);
            LocalTime localTimeOf = LocalTime.of(iIntValue3, iIntValue4, iIntValue5, 0);
            return uVar.f(aVar4, iIntValue6, i11, uVar.f(j$.time.temporal.a.INSTANT_SECONDS, new LocalDateTime(localDateOf, localTimeOf).U(localDateOf.W(i12), localTimeOf).r(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i11, iW));
        } catch (RuntimeException unused) {
            return ~i11;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
