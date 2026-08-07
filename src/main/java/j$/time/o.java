package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f82178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f82179b;

    public o() {
    }

    public o(byte b11, Object obj) {
        this.f82178a = b11;
        this.f82179b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f82178a;
        Object obj = this.f82179b;
        objectOutput.writeByte(b11);
        switch (b11) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f81959a);
                objectOutput.writeInt(duration.f81960b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f81961a);
                objectOutput.writeInt(instant.f81962b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f81963a);
                objectOutput.writeByte(localDate.f81964b);
                objectOutput.writeByte(localDate.f81965c);
                return;
            case 4:
                ((LocalTime) obj).Y(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f81968a;
                objectOutput.writeInt(localDate2.f81963a);
                objectOutput.writeByte(localDate2.f81964b);
                objectOutput.writeByte(localDate2.f81965c);
                localDateTime.f81969b.Y(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f81988a;
                LocalDate localDate3 = localDateTime2.f81968a;
                objectOutput.writeInt(localDate3.f81963a);
                objectOutput.writeByte(localDate3.f81964b);
                objectOutput.writeByte(localDate3.f81965c);
                localDateTime2.f81969b.Y(objectOutput);
                zonedDateTime.f81989b.T(objectOutput);
                zonedDateTime.f81990c.J(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((t) obj).f82190b);
                return;
            case 8:
                ((ZoneOffset) obj).T(objectOutput);
                return;
            case 9:
                m mVar = (m) obj;
                mVar.f82172a.Y(objectOutput);
                mVar.f82173b.T(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f81979a;
                LocalDate localDate4 = localDateTime3.f81968a;
                objectOutput.writeInt(localDate4.f81963a);
                objectOutput.writeByte(localDate4.f81964b);
                objectOutput.writeByte(localDate4.f81965c);
                localDateTime3.f81969b.Y(objectOutput);
                offsetDateTime.f81980b.T(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((q) obj).f82183a);
                return;
            case 12:
                s sVar = (s) obj;
                objectOutput.writeInt(sVar.f82187a);
                objectOutput.writeByte(sVar.f82188b);
                return;
            case 13:
                k kVar = (k) obj;
                objectOutput.writeByte(kVar.f82168a);
                objectOutput.writeByte(kVar.f82169b);
                return;
            case 14:
                n nVar = (n) obj;
                objectOutput.writeInt(nVar.f82175a);
                objectOutput.writeInt(nVar.f82176b);
                objectOutput.writeInt(nVar.f82177c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b11 = objectInput.readByte();
        this.f82178a = b11;
        this.f82179b = a(b11, objectInput);
    }

    public static Object a(byte b11, ObjectInput objectInput) throws IOException {
        switch (b11) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.U(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f81966c;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.E(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.U(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f81966c;
                LocalDate localDate3 = LocalDate.MIN;
                LocalDateTime localDateTimeE = LocalDateTime.E(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.U(objectInput));
                ZoneOffset zoneOffsetS = ZoneOffset.S(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneOffsetS, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetS.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeE, zoneId, zoneOffsetS);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i11 = t.f82189d;
                return ZoneId.w(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.S(objectInput);
            case 9:
                int i12 = m.f82171c;
                return new m(LocalTime.U(objectInput), ZoneOffset.S(objectInput));
            case 10:
                int i13 = OffsetDateTime.f81978c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(LocalDateTime.E(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.U(objectInput)), ZoneOffset.S(objectInput));
            case 11:
                int i14 = q.f82182b;
                return q.s(objectInput.readInt());
            case 12:
                int i15 = s.f82186c;
                int i16 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                j$.time.temporal.a.YEAR.R(i16);
                j$.time.temporal.a.MONTH_OF_YEAR.R(b12);
                return new s(i16, b12);
            case 13:
                int i17 = k.f82167c;
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                Month monthE = Month.E(b13);
                Objects.requireNonNull(monthE, "month");
                j$.time.temporal.a.DAY_OF_MONTH.R(b14);
                if (b14 <= monthE.B()) {
                    return new k(monthE.getValue(), b14);
                }
                throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b14) + " is not valid for month " + monthE.name());
            case 14:
                n nVar = n.f82174d;
                return n.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f82179b;
    }
}
