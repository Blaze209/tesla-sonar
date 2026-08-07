package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
final class SPX implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f94551c = new int[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f94552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f94553b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94554a;

        static {
            int[] iArr = new int[ep0.b.values().length];
            f94554a = iArr;
            try {
                iArr[ep0.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94554a[ep0.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94554a[ep0.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94554a[ep0.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94554a[ep0.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    private static ep0.b a(int i11) throws StreamCorruptedException {
        for (ep0.b bVar : ep0.b.values()) {
            if (bVar.getSerialValue() == i11) {
                return bVar;
            }
        }
        throw new StreamCorruptedException("Unknown variant of chronological history.");
    }

    private d b(DataInput dataInput, byte b11) {
        int i11 = a.f94554a[a(b11 & 15).ordinal()];
        if (i11 == 1) {
            return d.f94563q;
        }
        if (i11 == 2) {
            return d.f94564r;
        }
        if (i11 == 3) {
            return d.f94565s;
        }
        if (i11 != 4) {
            return i11 != 5 ? d.G(g0.O0(dataInput.readLong(), z.MODIFIED_JULIAN_DATE)) : d.E();
        }
        return d.H();
    }

    private static net.time4j.history.a c(DataInput dataInput) throws IOException {
        int i11 = dataInput.readInt();
        if (i11 <= 0) {
            return null;
        }
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = 1 - dataInput.readInt();
        }
        return net.time4j.history.a.f(iArr);
    }

    private void d(DataOutput dataOutput) throws IOException {
        d dVar = (d) this.f94552a;
        dataOutput.writeByte(dVar.t().getSerialValue() | (this.f94553b << 4));
        if (dVar.t() == ep0.b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(dVar.p().get(0).f94588a);
        }
        int[] iArrE = dVar.x() ? dVar.l().e() : f94551c;
        dataOutput.writeInt(iArrE.length);
        for (int i11 : iArrE) {
            dataOutput.writeInt(i11);
        }
        dVar.w().g(dataOutput);
        dVar.o().h(dataOutput);
    }

    private Object readResolve() {
        return this.f94552a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        d dVarB;
        byte b11 = objectInput.readByte();
        int i11 = (b11 & 255) >> 4;
        if (i11 == 1) {
            dVarB = b(objectInput, b11);
        } else if (i11 == 2) {
            d dVarB2 = b(objectInput, b11);
            net.time4j.history.a aVarC = c(objectInput);
            dVarB = aVarC != null ? dVarB2.I(aVarC) : dVarB2;
        } else {
            if (i11 != 3) {
                throw new StreamCorruptedException("Unknown serialized type.");
            }
            d dVarB3 = b(objectInput, b11);
            net.time4j.history.a aVarC2 = c(objectInput);
            if (aVarC2 != null) {
                dVarB3 = dVarB3.I(aVarC2);
            }
            dVarB = dVarB3.K(o.e(objectInput)).J(g.g(objectInput));
        }
        this.f94552a = dVarB;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int i11 = this.f94553b;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            throw new InvalidClassException("Unknown serialized type.");
        }
        d(objectOutput);
    }

    SPX(Object obj, int i11) {
        this.f94552a = obj;
        this.f94553b = i11;
    }
}
