package j$.time.zone;

import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.uwb.RangingPosition;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f82252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f82253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DayOfWeek f82254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalTime f82255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f82256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f82257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f82258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f82259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f82260i;

    public e(Month month, int i11, DayOfWeek dayOfWeek, LocalTime localTime, boolean z11, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f82252a = month;
        this.f82253b = (byte) i11;
        this.f82254c = dayOfWeek;
        this.f82255d = localTime;
        this.f82256e = z11;
        this.f82257f = dVar;
        this.f82258g = zoneOffset;
        this.f82259h = zoneOffset2;
        this.f82260i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b11;
        int secondOfDay = this.f82256e ? Strategy.TTL_SECONDS_MAX : this.f82255d.toSecondOfDay();
        int totalSeconds = this.f82258g.getTotalSeconds();
        int totalSeconds2 = this.f82259h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.f82260i.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            b11 = this.f82256e ? (byte) 24 : this.f82255d.f81972a;
        } else {
            b11 = 31;
        }
        int i11 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i12 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i13 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f82254c;
        dataOutput.writeInt((this.f82252a.getValue() << 28) + ((this.f82253b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b11 << 14) + (this.f82257f.ordinal() << 12) + (i11 << 4) + (i12 << 2) + i13);
        if (b11 == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i11 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.f82259h.getTotalSeconds());
        }
        if (i13 == 3) {
            dataOutput.writeInt(this.f82260i.getTotalSeconds());
        }
    }

    public static e a(DataInput dataInput) {
        LocalTime localTimeS;
        int totalSeconds;
        int totalSeconds2;
        int i11 = dataInput.readInt();
        Month monthE = Month.E(i11 >>> 28);
        int i12 = ((264241152 & i11) >>> 22) - 32;
        int i13 = (3670016 & i11) >>> 19;
        DayOfWeek dayOfWeekS = i13 == 0 ? null : DayOfWeek.s(i13);
        int i14 = (507904 & i11) >>> 14;
        d dVar = d.values()[(i11 & 12288) >>> 12];
        int i15 = (i11 & 4080) >>> 4;
        int i16 = (i11 & 12) >>> 2;
        int i17 = i11 & 3;
        if (i14 == 31) {
            long j11 = dataInput.readInt();
            LocalTime localTime = LocalTime.MIN;
            j$.time.temporal.a.SECOND_OF_DAY.R(j11);
            int i18 = (int) (j11 / 3600);
            long j12 = j11 - ((long) (i18 * 3600));
            int i19 = (int) (j12 / 60);
            localTimeS = LocalTime.s(i18, i19, (int) (j12 - ((long) (i19 * 60))), 0);
        } else {
            int i21 = i14 % 24;
            LocalTime localTime2 = LocalTime.MIN;
            j$.time.temporal.a.HOUR_OF_DAY.R(i21);
            localTimeS = LocalTime.f81971f[i21];
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i15 == 255 ? dataInput.readInt() : (i15 + RangingPosition.RSSI_UNKNOWN) * 900);
        if (i16 == 3) {
            totalSeconds = dataInput.readInt();
        } else {
            totalSeconds = (i16 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds();
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(totalSeconds);
        if (i17 == 3) {
            totalSeconds2 = dataInput.readInt();
        } else {
            totalSeconds2 = (i17 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds();
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(totalSeconds2);
        boolean z11 = i14 == 24;
        Objects.requireNonNull(monthE, "month");
        Objects.requireNonNull(localTimeS, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i12 < -28 || i12 > 31 || i12 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z11 && !localTimeS.equals(LocalTime.f81970e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeS.f81975d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthE, i12, dayOfWeekS, localTimeS, z11, dVar, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f82252a == eVar.f82252a && this.f82253b == eVar.f82253b && this.f82254c == eVar.f82254c && this.f82257f == eVar.f82257f && this.f82255d.equals(eVar.f82255d) && this.f82256e == eVar.f82256e && this.f82258g.equals(eVar.f82258g) && this.f82259h.equals(eVar.f82259h) && this.f82260i.equals(eVar.f82260i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.f82255d.toSecondOfDay() + (this.f82256e ? 1 : 0)) << 15) + (this.f82252a.ordinal() << 11) + ((this.f82253b + 32) << 5);
        DayOfWeek dayOfWeek = this.f82254c;
        return ((this.f82258g.hashCode() ^ (this.f82257f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f82259h.hashCode()) ^ this.f82260i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f82260i.f81986b - this.f82259h.f81986b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f82259h);
        sb2.append(" to ");
        sb2.append(this.f82260i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.f82254c;
        if (dayOfWeek != null) {
            byte b11 = this.f82253b;
            if (b11 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f82252a.name());
            } else if (b11 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f82253b) - 1);
                sb2.append(" of ");
                sb2.append(this.f82252a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.f82252a.name());
                sb2.append(' ');
                sb2.append((int) this.f82253b);
            }
        } else {
            sb2.append(this.f82252a.name());
            sb2.append(' ');
            sb2.append((int) this.f82253b);
        }
        sb2.append(" at ");
        sb2.append(this.f82256e ? "24:00" : this.f82255d.toString());
        sb2.append(" ");
        sb2.append(this.f82257f);
        sb2.append(", standard offset ");
        sb2.append(this.f82258g);
        sb2.append(']');
        return sb2.toString();
    }
}
