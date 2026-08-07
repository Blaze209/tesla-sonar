package j$.time.zone;

import com.google.android.gms.nearby.messages.Strategy;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f82261i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f82262j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f82263k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f82264l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f82265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f82266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f82267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f82268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f82269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f82270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f82271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f82272h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f82247b;
        if (bVar.s()) {
            if (localDateTime.B(localDateTime2)) {
                return bVar.f82248c;
            }
            if (!localDateTime.B(bVar.f82247b.R(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds()))) {
                return bVar.f82249d;
            }
        } else {
            if (!localDateTime.B(localDateTime2)) {
                return bVar.f82249d;
            }
            if (localDateTime.B(bVar.f82247b.R(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds()))) {
                return bVar.f82248c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f82265a = jArr;
        this.f82266b = zoneOffsetArr;
        this.f82267c = jArr2;
        this.f82269e = zoneOffsetArr2;
        this.f82270f = eVarArr;
        if (jArr2.length == 0) {
            this.f82268d = f82263k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 < jArr2.length) {
                int i12 = i11 + 1;
                b bVar = new b(jArr2[i11], zoneOffsetArr2[i11], zoneOffsetArr2[i12]);
                if (bVar.s()) {
                    arrayList.add(bVar.f82247b);
                    arrayList.add(bVar.f82247b.R(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds()));
                } else {
                    arrayList.add(bVar.f82247b.R(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds()));
                    arrayList.add(bVar.f82247b);
                }
                i11 = i12;
            }
            this.f82268d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f82271g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f82266b = zoneOffsetArr;
        long[] jArr = f82261i;
        this.f82265a = jArr;
        this.f82267c = jArr;
        this.f82268d = f82263k;
        this.f82269e = zoneOffsetArr;
        this.f82270f = f82262j;
        this.f82271g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f82266b = zoneOffsetArr;
        long[] jArr = f82261i;
        this.f82265a = jArr;
        this.f82267c = jArr;
        this.f82268d = f82263k;
        this.f82269e = zoneOffsetArr;
        this.f82270f = f82262j;
        this.f82271g = timeZone;
    }

    public static ZoneOffset i(int i11) {
        return ZoneOffset.ofTotalSeconds(i11 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f82271g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    public final boolean h() {
        int iBinarySearch;
        b bVar;
        TimeZone timeZone = this.f82271g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.f82271g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            b bVar2 = null;
            if (this.f82271g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iC = c(epochSecond, d(instantNow));
                b[] bVarArrB = b(iC);
                int length = bVarArrB.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = bVarArrB[length];
                        if (epochSecond > bVar.f82246a) {
                            break;
                        }
                        length--;
                    } else if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                j$.time.a.f81991b.getClass();
                                int offset = this.f82271g.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                for (long jMin = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                                    int offset2 = this.f82271g.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, i(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                                            bVar2 = bVarArrB3[length3];
                                            if (epochSecond > bVar2.f82246a) {
                                                break;
                                            }
                                        }
                                        b[] bVarArrB4 = b(iC2);
                                        bVar2 = bVarArrB4[bVarArrB4.length - 1];
                                        break;
                                    }
                                }
                                break;
                            }
                            bVar = bVarArrB2[length2];
                            if (epochSecond > bVar.f82246a) {
                                break;
                            }
                            length2--;
                        }
                    }
                }
                bVar2 = bVar;
            } else if (this.f82267c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f82267c;
                long j11 = jArr[jArr.length - 1];
                if (this.f82270f.length <= 0 || epochSecond2 <= j11) {
                    iBinarySearch = Arrays.binarySearch(this.f82267c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i11 = iBinarySearch - 1;
                        long j12 = this.f82267c[i11];
                        ZoneOffset[] zoneOffsetArr = this.f82269e;
                        bVar2 = new b(j12, zoneOffsetArr[i11], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.f82269e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iC3 = c(epochSecond2, zoneOffset);
                    b[] bVarArrB5 = b(iC3);
                    for (int length4 = bVarArrB5.length - 1; length4 >= 0; length4--) {
                        b bVar3 = bVarArrB5[length4];
                        if (epochSecond2 > bVar3.f82246a) {
                            bVar2 = bVar3;
                        }
                    }
                    int i12 = iC3 - 1;
                    if (i12 > c(j11, zoneOffset)) {
                        b[] bVarArrB6 = b(i12);
                        bVar2 = bVarArrB6[bVarArrB6.length - 1];
                    } else {
                        iBinarySearch = Arrays.binarySearch(this.f82267c, epochSecond2);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (-iBinarySearch) - 1;
                        }
                        if (iBinarySearch > 0) {
                            int i13 = iBinarySearch - 1;
                            long j13 = this.f82267c[i13];
                            ZoneOffset[] zoneOffsetArr3 = this.f82269e;
                            bVar2 = new b(j13, zoneOffsetArr3[i13], zoneOffsetArr3[iBinarySearch]);
                        }
                    }
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.f82267c.length != 0) {
            return false;
        }
        return true;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f82271g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f82267c.length == 0) {
            return this.f82266b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f82270f.length > 0) {
            long[] jArr = this.f82267c;
            if (epochSecond > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f82269e;
                b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
                b bVar = null;
                for (int i11 = 0; i11 < bVarArrB.length; i11++) {
                    bVar = bVarArrB[i11];
                    if (epochSecond < bVar.f82246a) {
                        return bVar.f82248c;
                    }
                }
                return bVar.f82249d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f82267c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f82269e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.s() ? Collections.EMPTY_LIST : j$.time.b.c(new Object[]{bVar.f82248c, bVar.f82249d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r8.s(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8.f81969b.V() <= r0.f81969b.V()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i11) {
        LocalDate localDateW;
        b[] bVarArr = f82264l;
        Integer numValueOf = Integer.valueOf(i11);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f82272h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j11 = 1;
        int i12 = 0;
        int i13 = 1;
        if (this.f82271g != null) {
            if (i11 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f81966c;
            LocalDate localDateOf = LocalDate.of(i11 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.R(0);
            long jR = new LocalDateTime(localDateOf, LocalTime.f81971f[0]).r(this.f82266b[0]);
            long j12 = 1000;
            int offset = this.f82271g.getOffset(jR * 1000);
            long j13 = 31968000 + jR;
            while (jR < j13) {
                long j14 = jR + 7776000;
                long j15 = j12;
                if (offset != this.f82271g.getOffset(j14 * j15)) {
                    while (j14 - jR > j11) {
                        long jFloorDiv = Math.floorDiv(j14 + jR, 2L);
                        if (this.f82271g.getOffset(jFloorDiv * j15) == offset) {
                            jR = jFloorDiv;
                        } else {
                            j14 = jFloorDiv;
                        }
                        j11 = 1;
                    }
                    if (this.f82271g.getOffset(jR * j15) == offset) {
                        jR = j14;
                    }
                    ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = this.f82271g.getOffset(jR * j15);
                    ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(jR, zoneOffsetI2) == i11) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jR, zoneOffsetI, zoneOffsetI2);
                    }
                    offset = offset2;
                } else {
                    jR = j14;
                }
                j12 = j15;
                j11 = 1;
            }
            if (1916 <= i11 && i11 < 2100) {
                ((ConcurrentHashMap) this.f82272h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f82270f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i14 = 0;
        while (i14 < eVarArr.length) {
            e eVar = eVarArr[i14];
            byte b11 = eVar.f82253b;
            if (b11 < 0) {
                Month month = eVar.f82252a;
                long j16 = i11;
                int iW = month.w(s.f82037c.Q(j16)) + 1 + eVar.f82253b;
                LocalDate localDate = LocalDate.MIN;
                j$.time.temporal.a.YEAR.R(j16);
                j$.time.temporal.a.DAY_OF_MONTH.R(iW);
                localDateW = LocalDate.w(i11, month.getValue(), iW);
                DayOfWeek dayOfWeek = eVar.f82254c;
                if (dayOfWeek != null) {
                    localDateW = localDateW.f(new n(dayOfWeek.getValue(), i13));
                }
            } else {
                Month month2 = eVar.f82252a;
                LocalDate localDate2 = LocalDate.MIN;
                j$.time.temporal.a.YEAR.R(i11);
                j$.time.temporal.a.DAY_OF_MONTH.R(b11);
                localDateW = LocalDate.w(i11, month2.getValue(), b11);
                DayOfWeek dayOfWeek2 = eVar.f82254c;
                if (dayOfWeek2 != null) {
                    localDateW = localDateW.f(new n(dayOfWeek2.getValue(), i12));
                }
            }
            if (eVar.f82256e) {
                localDateW = localDateW.W(1L);
            }
            LocalDateTime localDateTimeE = LocalDateTime.E(localDateW, eVar.f82255d);
            d dVar = eVar.f82257f;
            ZoneOffset zoneOffset = eVar.f82258g;
            ZoneOffset zoneOffset2 = eVar.f82259h;
            int i15 = c.f82250a[dVar.ordinal()];
            if (i15 == 1) {
                localDateTimeE = localDateTimeE.R(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i15 == 2) {
                localDateTimeE = localDateTimeE.R(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i14] = new b(localDateTimeE, eVar.f82259h, eVar.f82260i);
            i14++;
            i12 = 0;
        }
        if (i11 < 2100) {
            ((ConcurrentHashMap) this.f82272h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.f82271g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else if (this.f82267c.length == 0) {
            zoneOffsetI = this.f82266b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f82265a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetI = this.f82266b[iBinarySearch + 1];
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public static int c(long j11, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j11 + ((long) zoneOffset.getTotalSeconds()), Strategy.TTL_SECONDS_MAX)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f82271g, fVar.f82271g) && Arrays.equals(this.f82265a, fVar.f82265a) && Arrays.equals(this.f82266b, fVar.f82266b) && Arrays.equals(this.f82267c, fVar.f82267c) && Arrays.equals(this.f82269e, fVar.f82269e) && Arrays.equals(this.f82270f, fVar.f82270f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f82271g) ^ Arrays.hashCode(this.f82265a)) ^ Arrays.hashCode(this.f82266b)) ^ Arrays.hashCode(this.f82267c)) ^ Arrays.hashCode(this.f82269e)) ^ Arrays.hashCode(this.f82270f);
    }

    public final String toString() {
        TimeZone timeZone = this.f82271g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f82266b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
