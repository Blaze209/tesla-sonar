package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8123d = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8124a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f8124a = iArr;
            try {
                iArr[p1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8124a[p1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8124a[p1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8124a[p1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8124a[p1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8124a[p1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8124a[p1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8124a[p1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8124a[p1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8124a[p1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8124a[p1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8124a[p1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8124a[p1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8124a[p1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8124a[p1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8124a[p1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8124a[p1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) y.b(hVar, "input");
        this.f8120a = hVar2;
        hVar2.f8079d = this;
    }

    public static i h(h hVar) {
        i iVar = hVar.f8079d;
        return iVar != null ? iVar : new i(hVar);
    }

    private <T> void i(T t11, e1<T> e1Var, n nVar) {
        int i11 = this.f8122c;
        this.f8122c = p1.c(p1.a(this.f8121b), 4);
        try {
            e1Var.b(t11, this, nVar);
            if (this.f8121b != this.f8122c) {
                throw InvalidProtocolBufferException.h();
            }
            this.f8122c = i11;
        } catch (Throwable th2) {
            this.f8122c = i11;
            throw th2;
        }
    }

    private <T> void j(T t11, e1<T> e1Var, n nVar) throws InvalidProtocolBufferException {
        int iD = this.f8120a.D();
        h hVar = this.f8120a;
        if (hVar.f8076a >= hVar.f8077b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = hVar.m(iD);
        this.f8120a.f8076a++;
        e1Var.b(t11, this, nVar);
        this.f8120a.a(0);
        h hVar2 = this.f8120a;
        hVar2.f8076a--;
        hVar2.l(iM);
    }

    private Object k(p1.b bVar, Class<?> cls, n nVar) {
        switch (a.f8124a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return a(cls, nVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T l(e1<T> e1Var, n nVar) {
        T tNewInstance = e1Var.newInstance();
        i(tNewInstance, e1Var, nVar);
        e1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T m(e1<T> e1Var, n nVar) throws InvalidProtocolBufferException {
        T tNewInstance = e1Var.newInstance();
        j(tNewInstance, e1Var, nVar);
        e1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private void o(int i11) throws InvalidProtocolBufferException {
        if (this.f8120a.e() != i11) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void p(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (p1.b(this.f8121b) != i11) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void q(int i11) throws InvalidProtocolBufferException {
        if ((i11 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void r(int i11) throws InvalidProtocolBufferException {
        if ((i11 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> T a(Class<T> cls, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(2);
        return (T) m(a1.a().c(cls), nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void b(T t11, e1<T> e1Var, n nVar) throws InvalidProtocolBufferException {
        p(2);
        j(t11, e1Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void c(List<T> list, e1<T> e1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (p1.b(this.f8121b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i11 = this.f8121b;
        do {
            list.add(m(e1Var, nVar));
            if (this.f8120a.f() || this.f8123d != 0) {
                return;
            } else {
                iC = this.f8120a.C();
            }
        } while (iC == i11);
        this.f8123d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    @Deprecated
    public <T> T d(Class<T> cls, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(3);
        return (T) l(a1.a().c(cls), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    public <K, V> void e(Map<K, V> map, i0.a<K, V> aVar, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(2);
        int iM = this.f8120a.m(this.f8120a.D());
        Object objK = aVar.f8129b;
        Object objK2 = aVar.f8131d;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f8120a.f()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objK = k(aVar.f8128a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objK2 = k(aVar.f8130c, aVar.f8131d.getClass(), nVar);
                }
            } catch (Throwable th2) {
                this.f8120a.l(iM);
                throw th2;
            }
        }
        map.put(objK, objK2);
        this.f8120a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void f(T t11, e1<T> e1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(3);
        i(t11, e1Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    @Deprecated
    public <T> void g(List<T> list, e1<T> e1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (p1.b(this.f8121b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i11 = this.f8121b;
        do {
            list.add(l(e1Var, nVar));
            if (this.f8120a.f() || this.f8123d != 0) {
                return;
            } else {
                iC = this.f8120a.C();
            }
        } while (iC == i11);
        this.f8123d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int getFieldNumber() {
        int i11 = this.f8123d;
        if (i11 != 0) {
            this.f8121b = i11;
            this.f8123d = 0;
        } else {
            this.f8121b = this.f8120a.C();
        }
        int i12 = this.f8121b;
        if (i12 == 0 || i12 == this.f8122c) {
            return Integer.MAX_VALUE;
        }
        return p1.a(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int getTag() {
        return this.f8121b;
    }

    public void n(List<String> list, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        int iC2;
        if (p1.b(this.f8121b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof c0) || z11) {
            do {
                list.add(z11 ? readStringRequireUtf8() : readString());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC = this.f8120a.C();
                }
            } while (iC == this.f8121b);
            this.f8123d = iC;
            return;
        }
        c0 c0Var = (c0) list;
        do {
            c0Var.c1(readBytes());
            if (this.f8120a.f()) {
                return;
            } else {
                iC2 = this.f8120a.C();
            }
        } while (iC2 == this.f8121b);
        this.f8123d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof e)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f8120a.n()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Boolean.valueOf(this.f8120a.n()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        e eVar = (e) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                eVar.addBoolean(this.f8120a.n());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            eVar.addBoolean(this.f8120a.n());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public g readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(2);
        return this.f8120a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readBytesList(List<g> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (p1.b(this.f8121b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(readBytes());
            if (this.f8120a.f()) {
                return;
            } else {
                iC = this.f8120a.C();
            }
        } while (iC == this.f8121b);
        this.f8123d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(1);
        return this.f8120a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readDoubleList(List<Double> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof k)) {
            int iB = p1.b(this.f8121b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f8120a.p()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f8120a.D();
            r(iD);
            int iE = this.f8120a.e() + iD;
            do {
                list.add(Double.valueOf(this.f8120a.p()));
            } while (this.f8120a.e() < iE);
            return;
        }
        k kVar = (k) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 1) {
            do {
                kVar.addDouble(this.f8120a.p());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f8120a.D();
        r(iD2);
        int iE2 = this.f8120a.e() + iD2;
        do {
            kVar.addDouble(this.f8120a.p());
        } while (this.f8120a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readEnumList(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8120a.q()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Integer.valueOf(this.f8120a.q()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f8120a.q());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            xVar.addInt(this.f8120a.q());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(5);
        return this.f8120a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 2) {
                int iD = this.f8120a.D();
                q(iD);
                int iE = this.f8120a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f8120a.r()));
                } while (this.f8120a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f8120a.r()));
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC = this.f8120a.C();
                }
            } while (iC == this.f8121b);
            this.f8123d = iC;
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 2) {
            int iD2 = this.f8120a.D();
            q(iD2);
            int iE2 = this.f8120a.e() + iD2;
            do {
                xVar.addInt(this.f8120a.r());
            } while (this.f8120a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            xVar.addInt(this.f8120a.r());
            if (this.f8120a.f()) {
                return;
            } else {
                iC2 = this.f8120a.C();
            }
        } while (iC2 == this.f8121b);
        this.f8123d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(1);
        return this.f8120a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f8121b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f8120a.s()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f8120a.D();
            r(iD);
            int iE = this.f8120a.e() + iD;
            do {
                list.add(Long.valueOf(this.f8120a.s()));
            } while (this.f8120a.e() < iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 1) {
            do {
                g0Var.addLong(this.f8120a.s());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f8120a.D();
        r(iD2);
        int iE2 = this.f8120a.e() + iD2;
        do {
            g0Var.addLong(this.f8120a.s());
        } while (this.f8120a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(5);
        return this.f8120a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFloatList(List<Float> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof u)) {
            int iB = p1.b(this.f8121b);
            if (iB == 2) {
                int iD = this.f8120a.D();
                q(iD);
                int iE = this.f8120a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f8120a.t()));
                } while (this.f8120a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f8120a.t()));
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC = this.f8120a.C();
                }
            } while (iC == this.f8121b);
            this.f8123d = iC;
            return;
        }
        u uVar = (u) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 2) {
            int iD2 = this.f8120a.D();
            q(iD2);
            int iE2 = this.f8120a.e() + iD2;
            do {
                uVar.addFloat(this.f8120a.t());
            } while (this.f8120a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            uVar.addFloat(this.f8120a.t());
            if (this.f8120a.f()) {
                return;
            } else {
                iC2 = this.f8120a.C();
            }
        } while (iC2 == this.f8121b);
        this.f8123d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8120a.u()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Integer.valueOf(this.f8120a.u()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f8120a.u());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            xVar.addInt(this.f8120a.u());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8120a.v()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Long.valueOf(this.f8120a.v()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f8120a.v());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            g0Var.addLong(this.f8120a.v());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(5);
        return this.f8120a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 2) {
                int iD = this.f8120a.D();
                q(iD);
                int iE = this.f8120a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f8120a.w()));
                } while (this.f8120a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f8120a.w()));
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC = this.f8120a.C();
                }
            } while (iC == this.f8121b);
            this.f8123d = iC;
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 2) {
            int iD2 = this.f8120a.D();
            q(iD2);
            int iE2 = this.f8120a.e() + iD2;
            do {
                xVar.addInt(this.f8120a.w());
            } while (this.f8120a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            xVar.addInt(this.f8120a.w());
            if (this.f8120a.f()) {
                return;
            } else {
                iC2 = this.f8120a.C();
            }
        } while (iC2 == this.f8121b);
        this.f8123d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(1);
        return this.f8120a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f8121b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f8120a.x()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f8120a.D();
            r(iD);
            int iE = this.f8120a.e() + iD;
            do {
                list.add(Long.valueOf(this.f8120a.x()));
            } while (this.f8120a.e() < iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 1) {
            do {
                g0Var.addLong(this.f8120a.x());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f8120a.D();
        r(iD2);
        int iE2 = this.f8120a.e() + iD2;
        do {
            g0Var.addLong(this.f8120a.x());
        } while (this.f8120a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8120a.y()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Integer.valueOf(this.f8120a.y()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f8120a.y());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            xVar.addInt(this.f8120a.y());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8120a.z()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Long.valueOf(this.f8120a.z()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f8120a.z());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            g0Var.addLong(this.f8120a.z());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(2);
        return this.f8120a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readStringList(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        n(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        n(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(2);
        return this.f8120a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8120a.D()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Integer.valueOf(this.f8120a.D()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f8120a.D());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            xVar.addInt(this.f8120a.D());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        p(0);
        return this.f8120a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readUInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f8121b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8120a.E()));
                    if (this.f8120a.f()) {
                        return;
                    } else {
                        iC = this.f8120a.C();
                    }
                } while (iC == this.f8121b);
                this.f8123d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f8120a.e() + this.f8120a.D();
            do {
                list.add(Long.valueOf(this.f8120a.E()));
            } while (this.f8120a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f8121b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f8120a.E());
                if (this.f8120a.f()) {
                    return;
                } else {
                    iC2 = this.f8120a.C();
                }
            } while (iC2 == this.f8121b);
            this.f8123d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f8120a.e() + this.f8120a.D();
        do {
            g0Var.addLong(this.f8120a.E());
        } while (this.f8120a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public boolean skipField() {
        int i11;
        if (this.f8120a.f() || (i11 = this.f8121b) == this.f8122c) {
            return false;
        }
        return this.f8120a.F(i11);
    }
}
