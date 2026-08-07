package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.o, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81960b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofSeconds(long j11, long j12) {
        return w(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
    }

    public static Duration B(long j11) {
        long j12 = j11 / 1000000000;
        int i11 = (int) (j11 % 1000000000);
        if (i11 < 0) {
            i11 = (int) (((long) i11) + 1000000000);
            j12--;
        }
        return w(j12, i11);
    }

    public static Duration w(long j11, int i11) {
        if ((((long) i11) | j11) == 0) {
            return ZERO;
        }
        return new Duration(j11, i11);
    }

    public Duration(long j11, int i11) {
        this.f81959a = j11;
        this.f81960b = i11;
    }

    public long getSeconds() {
        return this.f81959a;
    }

    public int getNano() {
        return this.f81960b;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l s(ChronoLocalDate chronoLocalDate) {
        long j11 = this.f81959a;
        ChronoLocalDate chronoLocalDateG = chronoLocalDate;
        if (j11 != 0) {
            chronoLocalDateG = chronoLocalDate.g(j11, (j$.time.temporal.r) ChronoUnit.SECONDS);
        }
        int i11 = this.f81960b;
        return i11 != 0 ? chronoLocalDateG.g(i11, (j$.time.temporal.r) ChronoUnit.NANOS) : chronoLocalDateG;
    }

    public long toMillis() {
        long j11 = this.f81959a;
        long j12 = this.f81960b;
        if (j11 < 0) {
            j11++;
            j12 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j11, 1000), j12 / 1000000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.f81959a, duration.f81959a);
        return iCompare != 0 ? iCompare : this.f81960b - duration.f81960b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f81959a == duration.f81959a && this.f81960b == duration.f81960b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f81959a;
        return (this.f81960b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j11 = this.f81959a;
        if (j11 < 0 && this.f81960b > 0) {
            j11++;
        }
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i12 == 0 && this.f81960b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f81959a < 0 && this.f81960b > 0 && i12 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i12);
        }
        if (this.f81960b > 0) {
            int length = sb2.length();
            if (this.f81959a < 0) {
                sb2.append(2000000000 - ((long) this.f81960b));
            } else {
                sb2.append(((long) this.f81960b) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, CoreConstants.DOT);
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
