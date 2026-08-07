package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f82243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f82244b;

    public a() {
    }

    public a(byte b11, Object obj) {
        this.f82243a = b11;
        this.f82244b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f82243a;
        Object obj = this.f82244b;
        objectOutput.writeByte(b11);
        if (b11 != 1) {
            if (b11 == 2) {
                b bVar = (b) obj;
                c(bVar.f82246a, objectOutput);
                d(bVar.f82248c, objectOutput);
                d(bVar.f82249d, objectOutput);
                return;
            }
            if (b11 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b11 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) obj).f82271g.getID());
                return;
            }
        }
        f fVar = (f) obj;
        objectOutput.writeInt(fVar.f82265a.length);
        for (long j11 : fVar.f82265a) {
            c(j11, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f82266b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(fVar.f82267c.length);
        for (long j12 : fVar.f82267c) {
            c(j12, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f82269e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(fVar.f82270f.length);
        for (e eVar : fVar.f82270f) {
            eVar.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object fVar;
        byte b11 = objectInput.readByte();
        this.f82243a = b11;
        if (b11 == 1) {
            long[] jArr = f.f82261i;
            int i11 = objectInput.readInt();
            long[] jArr2 = i11 == 0 ? jArr : new long[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr2[i12] = a(objectInput);
            }
            int i13 = i11 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                zoneOffsetArr[i14] = b(objectInput);
            }
            int i15 = objectInput.readInt();
            if (i15 != 0) {
                jArr = new long[i15];
            }
            long[] jArr3 = jArr;
            for (int i16 = 0; i16 < i15; i16++) {
                jArr3[i16] = a(objectInput);
            }
            int i17 = i15 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i17];
            for (int i18 = 0; i18 < i17; i18++) {
                zoneOffsetArr2[i18] = b(objectInput);
            }
            int i19 = objectInput.readByte();
            e[] eVarArr = i19 == 0 ? f.f82262j : new e[i19];
            for (int i21 = 0; i21 < i19; i21++) {
                eVarArr[i21] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b11 == 2) {
            int i22 = b.f82245e;
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b11 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b11 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f82244b = fVar;
    }

    private Object readResolve() {
        return this.f82244b;
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i11 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    public static ZoneOffset b(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        return b11 == 127 ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(b11 * 900);
    }

    public static void c(long j11, DataOutput dataOutput) throws IOException {
        if (j11 >= -4575744000L && j11 < 10413792000L && j11 % 900 == 0) {
            int i11 = (int) ((j11 + 4575744000L) / 900);
            dataOutput.writeByte((i11 >>> 16) & 255);
            dataOutput.writeByte((i11 >>> 8) & 255);
            dataOutput.writeByte(i11 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j11);
    }

    public static long a(DataInput dataInput) {
        int i11 = dataInput.readByte() & 255;
        if (i11 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i11 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
