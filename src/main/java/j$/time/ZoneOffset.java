package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f81987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f81982d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f81983e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f81984f = ofTotalSeconds(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f81985g = ofTotalSeconds(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f81986b - this.f81986b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static ZoneOffset P(String str) {
        int iR;
        int iR2;
        int iR3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) f81983e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + WebrtcBuildVersion.maint_version + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iR = R(str, 1, false);
                    iR2 = R(str, 3, false);
                } else if (length == 6) {
                    iR = R(str, 1, false);
                    iR2 = R(str, 4, true);
                } else if (length == 7) {
                    iR = R(str, 1, false);
                    iR2 = R(str, 3, false);
                    iR3 = R(str, 5, false);
                } else if (length == 9) {
                    iR = R(str, 1, false);
                    iR2 = R(str, 4, true);
                    iR3 = R(str, 7, true);
                } else {
                    throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iR3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return ofHoursMinutesSeconds(-iR, -iR2, -iR3);
            }
            return ofHoursMinutesSeconds(iR, iR2, iR3);
        }
        iR = R(str, 1, false);
        iR2 = 0;
        iR3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return ofHoursMinutesSeconds(-iR, -iR2, -iR3);
        }
        return ofHoursMinutesSeconds(iR, iR2, iR3);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f s() {
        return new j$.time.zone.f(this);
    }

    public static int R(CharSequence charSequence, int i11, boolean z11) {
        if (z11) {
            String str = (String) charSequence;
            if (str.charAt(i11 - 1) != ':') {
                throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i11);
        char cCharAt2 = str2.charAt(i11 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.b(j$.time.temporal.q.f82217d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i11, int i12, int i13) {
        if (i11 < -18 || i11 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i11 + " is not in the range -18 to 18");
        }
        if (i11 > 0) {
            if (i12 < 0 || i13 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i11 < 0) {
            if (i12 > 0 || i13 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i12 > 0 && i13 < 0) || (i12 < 0 && i13 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i12 < -59 || i12 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (i13 < -59 || i13 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i13 + " is not in the range -59 to 59");
        }
        if (Math.abs(i11) != 18 || (i12 | i13) == 0) {
            return ofTotalSeconds((i12 * 60) + (i11 * 3600) + i13);
        }
        throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    public static ZoneOffset ofTotalSeconds(int i11) {
        if (i11 < -64800 || i11 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i11 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i11);
            ConcurrentMap concurrentMap = f81982d;
            ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            ((ConcurrentHashMap) concurrentMap).putIfAbsent(numValueOf, new ZoneOffset(i11));
            ZoneOffset zoneOffset2 = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
            ((ConcurrentHashMap) f81983e).putIfAbsent(zoneOffset2.f81987c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i11);
    }

    public ZoneOffset(int i11) {
        String string;
        this.f81986b = i11;
        if (i11 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i11);
            StringBuilder sb2 = new StringBuilder();
            int i12 = iAbs / 3600;
            int i13 = (iAbs / 60) % 60;
            sb2.append(i11 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            sb2.append(i12 < 10 ? WebrtcBuildVersion.maint_version : "");
            sb2.append(i12);
            sb2.append(i13 < 10 ? ":0" : ":");
            sb2.append(i13);
            int i14 = iAbs % 60;
            if (i14 != 0) {
                sb2.append(i14 < 10 ? ":0" : ":");
                sb2.append(i14);
            }
            string = sb2.toString();
        }
        this.f81987c = string;
    }

    public int getTotalSeconds() {
        return this.f81986b;
    }

    @Override // j$.time.ZoneId
    public final String m() {
        return this.f81987c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f81986b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        return super.j(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f81986b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        return pVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.q.f82217d || temporalQuery == j$.time.temporal.q.f82218e) ? this : super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(this.f81986b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f81986b == ((ZoneOffset) obj).f81986b;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f81986b;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.f81987c;
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void J(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        T(dataOutput);
    }

    public final void T(DataOutput dataOutput) throws IOException {
        int i11 = this.f81986b;
        int i12 = i11 % 900 == 0 ? i11 / 900 : 127;
        dataOutput.writeByte(i12);
        if (i12 == 127) {
            dataOutput.writeInt(i11);
        }
    }

    public static ZoneOffset S(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        return b11 == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b11 * 900);
    }
}
