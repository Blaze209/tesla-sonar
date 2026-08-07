package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f93919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f93920b;

    public SPX() {
    }

    private g0 a(DataInput dataInput, byte b11) throws IOException {
        int i11;
        int i12 = b11 & 15;
        byte b12 = dataInput.readByte();
        int i13 = (b12 >> 5) & 3;
        int i14 = b12 & 31;
        if (i13 == 1) {
            i11 = dataInput.readByte() + 1978;
        } else if (i13 == 2) {
            i11 = dataInput.readShort();
        } else {
            if (i13 != 3) {
                throw new StreamCorruptedException("Unknown year range.");
            }
            i11 = dataInput.readInt();
        }
        return g0.N0(i11, c0.valueOf(i12), i14);
    }

    private Object b(ObjectInput objectInput, byte b11) throws IOException {
        boolean z11 = (b11 & 1) == 1;
        if ((b11 & 2) == 2) {
            return new l.b(z11, l.s((Map) objectInput.readObject()));
        }
        String utf = objectInput.readUTF();
        String utf2 = objectInput.readUTF();
        int iIndexOf = utf.indexOf("-");
        return new l.b(z11, iIndexOf == -1 ? new Locale(utf) : new Locale(utf.substring(0, iIndexOf), utf.substring(iIndexOf + 1)), utf2);
    }

    private Object c(ObjectInput objectInput, byte b11) throws IOException {
        boolean z11 = (b11 & 15) == 1;
        int i11 = objectInput.readInt();
        if (i11 == 0) {
            return o.h();
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(net.time4j.engine.j0.a.c(z11 ? objectInput.readLong() : objectInput.readInt(), (x) objectInput.readObject()));
        }
        return new o(arrayList, objectInput.readBoolean());
    }

    private Object d(ObjectInput objectInput, byte b11) throws IOException {
        fp0.f fVar = (b11 & 1) == 1 ? fp0.f.UTC : fp0.f.POSIX;
        long j11 = objectInput.readLong();
        int i11 = (b11 & 2) == 2 ? objectInput.readInt() : 0;
        return fVar == fp0.f.UTC ? z.i(j11, i11) : z.h(j11, i11);
    }

    private Object e(DataInput dataInput, byte b11) {
        return b0.n0(dataInput, (b11 & 1) != 0, ((b11 & 2) >>> 1) != 0);
    }

    private h0 f(DataInput dataInput) throws IOException {
        int i11;
        byte b11 = dataInput.readByte();
        if (b11 < 0) {
            return h0.F0(~b11);
        }
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
        } else {
            byte b12 = dataInput.readByte();
            if (b12 < 0) {
                i13 = ~b12;
                i11 = 0;
            } else {
                i11 = dataInput.readInt();
                i13 = b12;
            }
        }
        return h0.J0(b11, i12, i13, i11);
    }

    private Object g(DataInput dataInput, byte b11) {
        return i0.Y(a(dataInput, b11), f(dataInput));
    }

    private Object h(DataInput dataInput, byte b11) throws IOException {
        byte b12 = dataInput.readByte();
        x0 x0VarValueOf = x0.valueOf(b12 >> 4);
        int i11 = b12 & 15;
        x0 x0VarValueOf2 = x0.SATURDAY;
        x0 x0VarValueOf3 = x0.SUNDAY;
        if ((b11 & 15) == 1) {
            byte b13 = dataInput.readByte();
            x0VarValueOf2 = x0.valueOf(b13 >> 4);
            x0VarValueOf3 = x0.valueOf(b13 & 15);
        }
        return z0.l(x0VarValueOf, i11, x0VarValueOf2, x0VarValueOf3);
    }

    private void i(DataOutput dataOutput) throws IOException {
        j((g0) this.f93919a, 1, dataOutput);
    }

    private static void j(g0 g0Var, int i11, DataOutput dataOutput) throws IOException {
        int i12;
        int iB = g0Var.b();
        if (iB < 1850 || iB > 2100) {
            i12 = Math.abs(iB) < 10000 ? 2 : 3;
        } else {
            i12 = 1;
        }
        dataOutput.writeByte((i11 << 4) | g0Var.r());
        dataOutput.writeByte(g0Var.f() | (i12 << 5));
        if (i12 == 1) {
            dataOutput.writeByte(iB - 1978);
        } else if (i12 == 2) {
            dataOutput.writeShort(iB);
        } else {
            dataOutput.writeInt(iB);
        }
    }

    private void k(ObjectOutput objectOutput) throws IOException {
        l.b bVar = (l.b) l.b.class.cast(this.f93919a);
        Locale localeV = bVar.v();
        int i11 = bVar.z() ? 113 : 112;
        if (localeV == null) {
            i11 |= 2;
        }
        objectOutput.writeByte(i11);
        if (localeV == null) {
            objectOutput.writeObject(bVar.s());
            return;
        }
        String language = localeV.getLanguage();
        if (!localeV.getCountry().isEmpty()) {
            language = language + "-" + localeV.getCountry();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(bVar.p());
    }

    private void l(ObjectOutput objectOutput) throws IOException {
        boolean z11;
        o oVar = (o) o.class.cast(this.f93919a);
        int size = oVar.a().size();
        int iMin = Math.min(size, 6);
        int i11 = 0;
        while (true) {
            if (i11 >= iMin) {
                z11 = false;
                break;
            } else {
                if (((net.time4j.engine.j0.a) oVar.a().get(i11)).a() >= 1000) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        objectOutput.writeByte(z11 ? 97 : 96);
        objectOutput.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            net.time4j.engine.j0.a aVar = (net.time4j.engine.j0.a) oVar.a().get(i12);
            if (z11) {
                objectOutput.writeLong(aVar.a());
            } else {
                objectOutput.writeInt((int) aVar.a());
            }
            objectOutput.writeObject(aVar.b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(oVar.isNegative());
        }
    }

    private void m(ObjectOutput objectOutput) throws IOException {
        z zVar = (z) z.class.cast(this.f93919a);
        int i11 = zVar.f() == fp0.f.UTC ? 81 : 80;
        if (zVar.e() == 0) {
            objectOutput.writeByte(i11);
            objectOutput.writeLong(zVar.g());
        } else {
            objectOutput.writeByte(i11 | 2);
            objectOutput.writeLong(zVar.g());
            objectOutput.writeInt(zVar.e());
        }
    }

    private void n(DataOutput dataOutput) {
        ((b0) this.f93919a).w0(dataOutput);
    }

    private void o(DataOutput dataOutput) throws IOException {
        h0 h0Var = (h0) this.f93919a;
        dataOutput.writeByte(32);
        p(h0Var, dataOutput);
    }

    private static void p(h0 h0Var, DataOutput dataOutput) throws IOException {
        if (h0Var.a() != 0) {
            dataOutput.writeByte(h0Var.c());
            dataOutput.writeByte(h0Var.e());
            dataOutput.writeByte(h0Var.d());
            dataOutput.writeInt(h0Var.a());
            return;
        }
        if (h0Var.d() != 0) {
            dataOutput.writeByte(h0Var.c());
            dataOutput.writeByte(h0Var.e());
            dataOutput.writeByte(~h0Var.d());
        } else if (h0Var.e() == 0) {
            dataOutput.writeByte(~h0Var.c());
        } else {
            dataOutput.writeByte(h0Var.c());
            dataOutput.writeByte(~h0Var.e());
        }
    }

    private void q(DataOutput dataOutput) throws IOException {
        i0 i0Var = (i0) this.f93919a;
        j(i0Var.S(), 8, dataOutput);
        p(i0Var.U(), dataOutput);
    }

    private void r(DataOutput dataOutput) throws IOException {
        z0 z0Var = (z0) this.f93919a;
        boolean z11 = z0Var.h() == x0.SATURDAY && z0Var.e() == x0.SUNDAY;
        dataOutput.writeByte(!z11 ? 49 : 48);
        dataOutput.writeByte((z0Var.f().getValue() << 4) | z0Var.g());
        if (z11) {
            return;
        }
        dataOutput.writeByte(z0Var.e().getValue() | (z0Var.h().getValue() << 4));
    }

    private Object readResolve() {
        return this.f93919a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b11 = objectInput.readByte();
        switch ((b11 & 255) >> 4) {
            case 1:
                this.f93919a = a(objectInput, b11);
                return;
            case 2:
                this.f93919a = f(objectInput);
                return;
            case 3:
                this.f93919a = h(objectInput, b11);
                return;
            case 4:
                this.f93919a = e(objectInput, b11);
                return;
            case 5:
                this.f93919a = d(objectInput, b11);
                return;
            case 6:
                this.f93919a = c(objectInput, b11);
                return;
            case 7:
                this.f93919a = b(objectInput, b11);
                return;
            case 8:
                this.f93919a = g(objectInput, b11);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        switch (this.f93920b) {
            case 1:
                i(objectOutput);
                return;
            case 2:
                o(objectOutput);
                return;
            case 3:
                r(objectOutput);
                return;
            case 4:
                n(objectOutput);
                return;
            case 5:
                m(objectOutput);
                return;
            case 6:
                l(objectOutput);
                return;
            case 7:
                k(objectOutput);
                return;
            case 8:
                q(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    SPX(Object obj, int i11) {
        this.f93919a = obj;
        this.f93920b = i11;
    }
}
