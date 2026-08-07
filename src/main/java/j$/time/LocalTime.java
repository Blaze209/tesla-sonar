package j$.time;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.Strategy;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.math.ec.Tnaf;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalTime f81970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocalTime[] f81971f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f81972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f81973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f81974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81975d;

    static {
        int i11 = 0;
        while (true) {
            LocalTime[] localTimeArr = f81971f;
            if (i11 < localTimeArr.length) {
                localTimeArr[i11] = new LocalTime(i11, 0, 0, 0);
                i11++;
            } else {
                LocalTime localTime = localTimeArr[0];
                f81970e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime of(int i11, int i12, int i13, int i14) {
        j$.time.temporal.a.HOUR_OF_DAY.R(i11);
        j$.time.temporal.a.MINUTE_OF_HOUR.R(i12);
        j$.time.temporal.a.SECOND_OF_MINUTE.R(i13);
        j$.time.temporal.a.NANO_OF_SECOND.R(i14);
        return s(i11, i12, i13, i14);
    }

    public static LocalTime E(long j11) {
        j$.time.temporal.a.NANO_OF_DAY.R(j11);
        int i11 = (int) (j11 / 3600000000000L);
        long j12 = j11 - (((long) i11) * 3600000000000L);
        int i12 = (int) (j12 / 60000000000L);
        long j13 = j12 - (((long) i12) * 60000000000L);
        int i13 = (int) (j13 / 1000000000);
        return s(i11, i12, i13, (int) (j13 - (((long) i13) * 1000000000)));
    }

    public static LocalTime w(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.b(j$.time.temporal.q.f82220g);
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f82057g;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new e(1));
    }

    public static LocalTime s(int i11, int i12, int i13, int i14) {
        if ((i12 | i13 | i14) == 0) {
            return f81971f[i11];
        }
        return new LocalTime(i11, i12, i13, i14);
    }

    public LocalTime(int i11, int i12, int i13, int i14) {
        this.f81972a = (byte) i11;
        this.f81973b = (byte) i12;
        this.f81974c = (byte) i13;
        this.f81975d = i14;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S();
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return B(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return V();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return V() / 1000;
            }
            return B(pVar);
        }
        return pVar.J(this);
    }

    public final int B(j$.time.temporal.p pVar) {
        switch (h.f82163a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f81975d;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f81975d / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f81975d / 1000000;
            case 6:
                return (int) (V() / 1000000);
            case 7:
                return this.f81974c;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.f81973b;
            case 10:
                return (this.f81972a * 60) + this.f81973b;
            case 11:
                return this.f81972a % 12;
            case 12:
                int i11 = this.f81972a % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return this.f81972a;
            case 14:
                byte b11 = this.f81972a;
                if (b11 == 0) {
                    return 24;
                }
                return b11;
            case 15:
                return this.f81972a / 12;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (LocalTime) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalTime) pVar.P(this, j11);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.R(j11);
        switch (h.f82163a[aVar.ordinal()]) {
            case 1:
                return X((int) j11);
            case 2:
                return E(j11);
            case 3:
                return X(((int) j11) * 1000);
            case 4:
                return E(j11 * 1000);
            case 5:
                return X(((int) j11) * 1000000);
            case 6:
                return E(j11 * 1000000);
            case 7:
                int i11 = (int) j11;
                if (this.f81974c != i11) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.R(i11);
                    return s(this.f81972a, this.f81973b, i11, this.f81975d);
                }
                return this;
            case 8:
                return T(j11 - ((long) toSecondOfDay()));
            case 9:
                int i12 = (int) j11;
                if (this.f81973b != i12) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.R(i12);
                    return s(this.f81972a, i12, this.f81974c, this.f81975d);
                }
                return this;
            case 10:
                return R(j11 - ((long) ((this.f81972a * 60) + this.f81973b)));
            case 11:
                return P(j11 - ((long) (this.f81972a % 12)));
            case 12:
                if (j11 == 12) {
                    j11 = 0;
                }
                return P(j11 - ((long) (this.f81972a % 12)));
            case 13:
                int i13 = (int) j11;
                if (this.f81972a != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.R(i13);
                    return s(i13, this.f81973b, this.f81974c, this.f81975d);
                }
                return this;
            case 14:
                if (j11 == 24) {
                    j11 = 0;
                }
                int i14 = (int) j11;
                if (this.f81972a != i14) {
                    j$.time.temporal.a.HOUR_OF_DAY.R(i14);
                    return s(i14, this.f81973b, this.f81974c, this.f81975d);
                }
                return this;
            case 15:
                return P((j11 - ((long) (this.f81972a / 12))) * 12);
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    public final LocalTime X(int i11) {
        if (this.f81975d == i11) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.R(i11);
        return s(this.f81972a, this.f81973b, this.f81974c, i11);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final LocalTime g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            switch (h.f82164b[((ChronoUnit) rVar).ordinal()]) {
                case 1:
                    return S(j11);
                case 2:
                    return S((j11 % 86400000000L) * 1000);
                case 3:
                    return S((j11 % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
                case 4:
                    return T(j11);
                case 5:
                    return R(j11);
                case 6:
                    return P(j11);
                case 7:
                    return P((j11 % 2) * 12);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
        }
        return (LocalTime) rVar.s(this, j11);
    }

    public final LocalTime P(long j11) {
        return j11 == 0 ? this : s(((((int) (j11 % 24)) + this.f81972a) + 24) % 24, this.f81973b, this.f81974c, this.f81975d);
    }

    public final LocalTime R(long j11) {
        if (j11 != 0) {
            int i11 = (this.f81972a * 60) + this.f81973b;
            int i12 = ((((int) (j11 % 1440)) + i11) + 1440) % 1440;
            if (i11 != i12) {
                return s(i12 / 60, i12 % 60, this.f81974c, this.f81975d);
            }
        }
        return this;
    }

    public final LocalTime T(long j11) {
        if (j11 != 0) {
            int i11 = (this.f81973b * 60) + (this.f81972a * Tnaf.POW_2_WIDTH) + this.f81974c;
            int i12 = ((((int) (j11 % 86400)) + i11) + Strategy.TTL_SECONDS_MAX) % Strategy.TTL_SECONDS_MAX;
            if (i11 != i12) {
                return s(i12 / 3600, (i12 / 60) % 60, i12 % 60, this.f81975d);
            }
        }
        return this;
    }

    public final LocalTime S(long j11) {
        if (j11 != 0) {
            long jV = V();
            long j12 = (((j11 % 86400000000000L) + jV) + 86400000000000L) % 86400000000000L;
            if (jV != j12) {
                return s((int) (j12 / 3600000000000L), (int) ((j12 / 60000000000L) % 60), (int) ((j12 / 1000000000) % 60), (int) (j12 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82215b || temporalQuery == j$.time.temporal.q.f82214a || temporalQuery == j$.time.temporal.q.f82218e || temporalQuery == j$.time.temporal.q.f82217d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82220g) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.q.f82219f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(V(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public int toSecondOfDay() {
        return (this.f81973b * 60) + (this.f81972a * Tnaf.POW_2_WIDTH) + this.f81974c;
    }

    public final long V() {
        return (((long) this.f81974c) * 1000000000) + (((long) this.f81973b) * 60000000000L) + (((long) this.f81972a) * 3600000000000L) + ((long) this.f81975d);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f81972a, localTime.f81972a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f81973b, localTime.f81973b)) == 0 && (iCompare = Integer.compare(this.f81974c, localTime.f81974c)) == 0) ? Integer.compare(this.f81975d, localTime.f81975d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f81972a == localTime.f81972a && this.f81973b == localTime.f81973b && this.f81974c == localTime.f81974c && this.f81975d == localTime.f81975d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jV = V();
        return (int) (jV ^ (jV >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b11 = this.f81972a;
        byte b12 = this.f81973b;
        byte b13 = this.f81974c;
        int i11 = this.f81975d;
        sb2.append(b11 < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append((int) b11);
        sb2.append(b12 < 10 ? ":0" : ":");
        sb2.append((int) b12);
        if (b13 > 0 || i11 > 0) {
            sb2.append(b13 < 10 ? ":0" : ":");
            sb2.append((int) b13);
            if (i11 > 0) {
                sb2.append(CoreConstants.DOT);
                if (i11 % 1000000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000000) + 1000).substring(1));
                } else if (i11 % 1000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i11 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void Y(DataOutput dataOutput) {
        if (this.f81975d == 0) {
            if (this.f81974c == 0) {
                if (this.f81973b == 0) {
                    dataOutput.writeByte(~this.f81972a);
                    return;
                } else {
                    dataOutput.writeByte(this.f81972a);
                    dataOutput.writeByte(~this.f81973b);
                    return;
                }
            }
            dataOutput.writeByte(this.f81972a);
            dataOutput.writeByte(this.f81973b);
            dataOutput.writeByte(~this.f81974c);
            return;
        }
        dataOutput.writeByte(this.f81972a);
        dataOutput.writeByte(this.f81973b);
        dataOutput.writeByte(this.f81974c);
        dataOutput.writeInt(this.f81975d);
    }

    public static LocalTime U(DataInput dataInput) throws IOException {
        int i11;
        int i12;
        int i13 = dataInput.readByte();
        int i14 = 0;
        if (i13 < 0) {
            i13 = ~i13;
            i12 = 0;
            i11 = 0;
        } else {
            byte b11 = dataInput.readByte();
            if (b11 < 0) {
                int i15 = ~b11;
                i11 = 0;
                i14 = i15;
                i12 = 0;
            } else {
                byte b12 = dataInput.readByte();
                if (b12 < 0) {
                    i12 = ~b12;
                    i11 = 0;
                    i14 = b11;
                } else {
                    i11 = dataInput.readInt();
                    i14 = b11;
                    i12 = b12;
                }
            }
        }
        return of(i13, i14, i12, i11);
    }
}
