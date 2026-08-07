package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f82001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f82002b;

    public e0() {
    }

    public e0(byte b11, Object obj) {
        this.f82001a = b11;
        this.f82002b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f82001a;
        Object obj = this.f82002b;
        objectOutput.writeByte(b11);
        switch (b11) {
            case 1:
                objectOutput.writeUTF(((a) obj).m());
                return;
            case 2:
                f fVar = (f) obj;
                objectOutput.writeObject(fVar.f82003a);
                objectOutput.writeObject(fVar.f82004b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.f82017a);
                objectOutput.writeObject(kVar.f82018b);
                objectOutput.writeObject(kVar.f82019c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(xVar.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(xVar.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(xVar.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).f82048a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.f82032a);
                objectOutput.writeInt(qVar.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(qVar.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(qVar.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                objectOutput.writeInt(c0Var.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(c0Var.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(c0Var.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                objectOutput.writeInt(i0Var.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(i0Var.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(i0Var.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                g gVar = (g) obj;
                objectOutput.writeUTF(gVar.f82007a.m());
                objectOutput.writeInt(gVar.f82008b);
                objectOutput.writeInt(gVar.f82009c);
                objectOutput.writeInt(gVar.f82010d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b11 = objectInput.readByte();
        this.f82001a = b11;
        switch (b11) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f81993a;
                objOf = l.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((ChronoLocalDate) objectInput.readObject()).F((LocalTime) objectInput.readObject());
                break;
            case 3:
                objOf = ((d) objectInput.readObject()).A((ZoneOffset) objectInput.readObject()).z((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = x.f82042d;
                int i11 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                v.f82040c.getClass();
                objOf = new x(LocalDate.of(i11, b12, b13));
                break;
            case 5:
                y yVar = y.f82046d;
                objOf = y.n(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int i12 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                oVar.getClass();
                objOf = new q(oVar, i12, b14, b15);
                break;
            case 7:
                int i13 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                a0.f81995c.getClass();
                objOf = new c0(LocalDate.of(i13 + 1911, b16, b17));
                break;
            case 8:
                int i14 = objectInput.readInt();
                byte b18 = objectInput.readByte();
                byte b19 = objectInput.readByte();
                g0.f82011c.getClass();
                objOf = new i0(LocalDate.of(i14 - 543, b18, b19));
                break;
            case 9:
                int i15 = g.f82006e;
                objOf = new g(l.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f82002b = objOf;
    }

    private Object readResolve() {
        return this.f82002b;
    }
}
