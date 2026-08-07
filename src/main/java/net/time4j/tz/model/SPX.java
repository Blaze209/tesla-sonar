package net.time4j.tz.model;

import com.google.android.gms.nearby.messages.Strategy;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.c0;
import net.time4j.h0;
import net.time4j.tz.p;
import net.time4j.tz.q;
import net.time4j.x0;

/* JADX INFO: loaded from: classes9.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f94782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f94783b;

    public SPX() {
    }

    private static Object a(ObjectInput objectInput) {
        return new a(j(objectInput), false, false);
    }

    private static Object b(ObjectInput objectInput) throws IOException {
        List<q> listJ = j(objectInput);
        return l.g(p.p(listJ.get(0).f()), listJ, h(objectInput), false, false);
    }

    private static d c(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        c0 c0VarValueOf = c0.valueOf((b11 & 255) >>> 4);
        int i11 = b11 & 15;
        i iVar = i.VALUES[i11 % 3];
        int i12 = i(i11);
        byte b12 = dataInput.readByte();
        int i13 = (b12 & 255) >>> 3;
        x0 x0VarValueOf = x0.valueOf(b12 & 7);
        byte b13 = dataInput.readByte();
        boolean z11 = ((b13 & 255) >>> 7) == 1;
        int i14 = b13 & 63;
        if (i12 == -1) {
            i12 = f(dataInput);
        }
        return new c(c0VarValueOf, i13, x0VarValueOf, i14 == 63 ? dataInput.readInt() : i14 * 1800, iVar, i12, z11);
    }

    private static d d(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        int i11 = (b11 & 255) >>> 4;
        int i12 = b11 & 15;
        i iVar = i.VALUES[i12 % 3];
        int i13 = i(i12);
        byte b12 = dataInput.readByte();
        int i14 = (b12 & 255) >>> 3;
        int iN = n(b12 & 7);
        if (i13 == -1) {
            i13 = f(dataInput);
        }
        int i15 = i13;
        if (iN == -1) {
            iN = dataInput.readInt();
        }
        return new f(c0.valueOf(i11), i14, iN, iVar, i15);
    }

    private static d e(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        c0 c0VarValueOf = c0.valueOf((b11 & 255) >>> 4);
        int i11 = b11 & 15;
        i iVar = i.VALUES[i11 % 3];
        int i12 = i(i11);
        byte b12 = dataInput.readByte();
        x0 x0VarValueOf = x0.valueOf((b12 & 255) >>> 5);
        int i13 = b12 & 31;
        if (i12 == -1) {
            i12 = f(dataInput);
        }
        return new h(c0VarValueOf, x0VarValueOf, i13 == 31 ? dataInput.readInt() : i13 * 3600, iVar, i12);
    }

    private static int f(DataInput dataInput) throws IOException {
        byte b11 = dataInput.readByte();
        return b11 == 127 ? dataInput.readInt() : b11 * 900;
    }

    private static Object g(ObjectInput objectInput) throws IOException {
        long j11;
        int i11 = objectInput.readByte() & 255;
        if (i11 == 255) {
            j11 = objectInput.readLong();
        } else {
            j11 = (((long) (((i11 << 16) + ((objectInput.readByte() & 255) << 8)) + (255 & objectInput.readByte()))) * 900) - 4575744000L;
        }
        return new j(new q(j11, f(objectInput), f(objectInput), f(objectInput)), h(objectInput), false);
    }

    private static List<d> h(ObjectInput objectInput) throws IOException {
        d dVarD;
        byte b11 = objectInput.readByte();
        if (b11 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(b11);
        d dVar = null;
        int i11 = 0;
        while (i11 < b11) {
            switch (objectInput.readByte()) {
                case 120:
                    dVarD = d(objectInput);
                    break;
                case 121:
                    dVarD = c(objectInput);
                    break;
                case 122:
                    dVarD = e(objectInput);
                    break;
                default:
                    dVarD = (d) objectInput.readObject();
                    break;
            }
            if (dVar != null && k.INSTANCE.compare(dVar, dVarD) >= 0) {
                throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
            }
            arrayList.add(dVarD);
            i11++;
            dVar = dVarD;
        }
        return arrayList;
    }

    private static int i(int i11) {
        int i12 = i11 / 3;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            return 1800;
        }
        if (i12 != 2) {
            return i12 != 3 ? -1 : 7200;
        }
        return 3600;
    }

    private static List<q> j(ObjectInput objectInput) throws IOException {
        int iF;
        int i11 = objectInput.readInt();
        if (i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i11);
        int iF2 = f(objectInput);
        long j11 = Long.MIN_VALUE;
        int i12 = iF2;
        int i13 = 0;
        while (i13 < i11) {
            byte b11 = objectInput.readByte();
            boolean z11 = b11 < 0;
            int i14 = (b11 >>> 5) & 3;
            int iO = o((b11 >>> 2) & 7);
            long j12 = iO == -1 ? objectInput.readLong() : ((((((long) ((((b11 & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255))) * 86400) - 4575744000L) + ((long) iO)) - 7200) - ((long) iF2);
            if (j12 <= j11) {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
            if (i14 == 1) {
                iF = 0;
            } else if (i14 != 2) {
                iF = i14 != 3 ? f(objectInput) : 7200;
            } else {
                iF = 3600;
            }
            if (z11) {
                iF2 = f(objectInput);
            }
            int i15 = iF2 + (iF == Integer.MAX_VALUE ? 0 : iF);
            arrayList.add(new q(j12, i12, i15, iF));
            i13++;
            j11 = j12;
            i12 = i15;
        }
        return arrayList;
    }

    private static int k(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 3600) {
            return 2;
        }
        if (i11 == 7200) {
            return 3;
        }
        if (i11 == 10800) {
            return 4;
        }
        if (i11 == 79200) {
            return 5;
        }
        if (i11 != 82800) {
            return i11 != 86400 ? 0 : 7;
        }
        return 6;
    }

    private static int l(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 60) {
            return 2;
        }
        if (i11 == 3600) {
            return 3;
        }
        if (i11 == 7200) {
            return 4;
        }
        if (i11 == 10800) {
            return 5;
        }
        if (i11 != 14400) {
            return i11 != 18000 ? 0 : 7;
        }
        return 6;
    }

    private static int m(g gVar) {
        return gVar.f().p(h0.f94535z) + net.time4j.base.c.g(gVar.c() * 86400);
    }

    private static int n(int i11) {
        switch (i11) {
            case 1:
                return 0;
            case 2:
                return 3600;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return Strategy.TTL_SECONDS_MAX;
            default:
                return -1;
        }
    }

    private static int o(int i11) {
        switch (i11) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return 3600;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    private static void p(Object obj, ObjectOutput objectOutput) {
        ((a) obj).u(objectOutput);
    }

    private static void q(Object obj, ObjectOutput objectOutput) throws IOException {
        b bVar = (b) obj;
        bVar.l(objectOutput);
        x(bVar.k(), objectOutput);
    }

    private static void r(Object obj, DataOutput dataOutput) throws IOException {
        int i11;
        c cVar = (c) obj;
        boolean zU = u(cVar, dataOutput);
        dataOutput.writeByte(((cVar.m() << 3) | cVar.n()) & 255);
        boolean z11 = false;
        int i12 = cVar.o() ? 128 : 0;
        int iM = m(cVar);
        if (iM % 1800 == 0) {
            i11 = i12 | (iM / 1800);
            z11 = true;
        } else {
            i11 = i12 | 63;
        }
        dataOutput.writeByte(i11 & 255);
        if (!zU) {
            v(dataOutput, cVar.e());
        }
        if (z11) {
            return;
        }
        dataOutput.writeInt(iM);
    }

    private Object readResolve() {
        return this.f94782a;
    }

    private static void s(Object obj, DataOutput dataOutput) throws IOException {
        f fVar = (f) obj;
        boolean zU = u(fVar, dataOutput);
        int iM = fVar.m() << 3;
        int iM2 = m(fVar);
        int iK = k(iM2);
        dataOutput.writeByte((iM | iK) & 255);
        if (!zU) {
            v(dataOutput, fVar.e());
        }
        if (iK == 0) {
            dataOutput.writeInt(iM2);
        }
    }

    private static void t(Object obj, DataOutput dataOutput) throws IOException {
        int i11;
        boolean z11;
        h hVar = (h) obj;
        boolean zU = u(hVar, dataOutput);
        int iM = hVar.m() << 5;
        int iM2 = m(hVar);
        if (iM2 % 3600 == 0) {
            i11 = iM | (iM2 / 3600);
            z11 = true;
        } else {
            i11 = iM | 31;
            z11 = false;
        }
        dataOutput.writeByte(i11 & 255);
        if (!zU) {
            v(dataOutput, hVar.e());
        }
        if (z11) {
            return;
        }
        dataOutput.writeInt(iM2);
    }

    private static boolean u(g gVar, DataOutput dataOutput) throws IOException {
        int i11;
        int iK = gVar.k() << 4;
        int iOrdinal = gVar.d().ordinal();
        int iE = gVar.e();
        boolean z11 = true;
        if (iE == 0) {
            i11 = iK | iOrdinal;
        } else {
            if (iE == 1800) {
                iOrdinal += 3;
            } else if (iE == 3600) {
                iOrdinal += 6;
            } else if (iE != 7200) {
                i11 = iK | (iOrdinal + 12);
                z11 = false;
            } else {
                iOrdinal += 9;
            }
            i11 = iK | iOrdinal;
        }
        dataOutput.writeByte(i11 & 255);
        return z11;
    }

    private static void v(DataOutput dataOutput, int i11) throws IOException {
        if (i11 % 900 == 0) {
            dataOutput.writeByte(i11 / 900);
        } else {
            dataOutput.writeByte(127);
            dataOutput.writeInt(i11);
        }
    }

    private static void w(Object obj, ObjectOutput objectOutput) throws IOException {
        j jVar = (j) obj;
        q qVarL = jVar.l();
        long jE = qVarL.e();
        if (jE < -4575744000L || jE >= 10464767099L || jE % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(qVarL.e());
        } else {
            int i11 = (int) ((jE - (-4575744000L)) / 900);
            objectOutput.writeByte((i11 >>> 16) & 255);
            objectOutput.writeByte((i11 >>> 8) & 255);
            objectOutput.writeByte(i11 & 255);
        }
        v(objectOutput, qVarL.f());
        v(objectOutput, qVarL.i());
        v(objectOutput, qVarL.d());
        x(jVar.n(), objectOutput);
    }

    private static void x(List<d> list, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(list.size());
        for (d dVar : list) {
            objectOutput.writeByte(dVar.g());
            switch (dVar.g()) {
                case 120:
                    s(dVar, objectOutput);
                    break;
                case 121:
                    r(dVar, objectOutput);
                    break;
                case 122:
                    t(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    private static int y(q qVar, int i11, DataOutput dataOutput) throws IOException {
        int iH = qVar.h();
        int i12 = 1;
        int iL = 0;
        boolean z11 = iH != i11;
        byte b11 = z11 ? (byte) 128 : (byte) 0;
        int iD = qVar.d();
        if (iD != 0) {
            if (iD != 3600) {
                i12 = iD != 7200 ? 0 : 3;
            } else {
                i12 = 2;
            }
        }
        byte b12 = (byte) (b11 | (i12 << 5));
        long jE = qVar.e() + ((long) i11);
        long j11 = 7200 + jE;
        if (j11 >= -4575744000L && j11 < 18067104000L) {
            iL = l(net.time4j.base.c.d(j11, Strategy.TTL_SECONDS_MAX));
        }
        byte b13 = (byte) ((iL << 2) | b12);
        if (iL == 0) {
            dataOutput.writeByte(b13);
            dataOutput.writeLong(qVar.e());
        } else {
            int i13 = (int) ((jE + 4575751200L) / 86400);
            dataOutput.writeByte((byte) (b13 | ((byte) ((i13 >>> 16) & 3))));
            dataOutput.writeByte((i13 >>> 8) & 255);
            dataOutput.writeByte(i13 & 255);
        }
        if (i12 == 0) {
            v(dataOutput, iD);
        }
        if (z11) {
            v(dataOutput, iH);
        }
        return iH;
    }

    static void z(q[] qVarArr, int i11, DataOutput dataOutput) throws IOException {
        int iMin = Math.min(i11, qVarArr.length);
        dataOutput.writeInt(iMin);
        if (iMin > 0) {
            int iF = qVarArr[0].f();
            v(dataOutput, iF);
            for (int i12 = 0; i12 < iMin; i12++) {
                iF = y(qVarArr[i12], iF, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws StreamCorruptedException {
        switch (objectInput.readByte()) {
            case 120:
                this.f94782a = d(objectInput);
                return;
            case 121:
                this.f94782a = c(objectInput);
                return;
            case 122:
                this.f94782a = e(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                this.f94782a = g(objectInput);
                return;
            case 126:
                this.f94782a = a(objectInput);
                return;
            case 127:
                this.f94782a = b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f94783b);
        switch (this.f94783b) {
            case 120:
                s(this.f94782a, objectOutput);
                return;
            case 121:
                r(this.f94782a, objectOutput);
                return;
            case 122:
                t(this.f94782a, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                w(this.f94782a, objectOutput);
                return;
            case 126:
                p(this.f94782a, objectOutput);
                return;
            case 127:
                q(this.f94782a, objectOutput);
                return;
        }
    }

    SPX(Object obj, int i11) {
        this.f94782a = obj;
        this.f94783b = i11;
    }
}
