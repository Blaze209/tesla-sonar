package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class p extends o<w.d> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8182a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f8182a = iArr;
            try {
                iArr[p1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8182a[p1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8182a[p1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8182a[p1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8182a[p1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8182a[p1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8182a[p1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8182a[p1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8182a[p1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8182a[p1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8182a[p1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8182a[p1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8182a[p1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8182a[p1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8182a[p1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8182a[p1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8182a[p1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8182a[p1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    p() {
    }

    @Override // androidx.datastore.preferences.protobuf.o
    int a(Map.Entry<?, ?> entry) {
        return ((w.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.o
    Object b(n nVar, p0 p0Var, int i11) {
        return nVar.a(p0Var, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o
    s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    s<w.d> d(Object obj) {
        return ((w.c) obj).L();
    }

    @Override // androidx.datastore.preferences.protobuf.o
    boolean e(p0 p0Var) {
        return p0Var instanceof w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.datastore.preferences.protobuf.o
    <UT, UB> UB g(Object obj, d1 d1Var, Object obj2, n nVar, s<w.d> sVar, UB ub2, k1<UT, UB> k1Var) {
        Object objI;
        ArrayList arrayList;
        w.e eVar = (w.e) obj2;
        int iC = eVar.c();
        if (eVar.f8231b.isRepeated() && eVar.f8231b.isPacked()) {
            switch (a.f8182a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    d1Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d1Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d1Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d1Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d1Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d1Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d1Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    d1Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    d1Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    d1Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    d1Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    d1Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d1Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d1Var.readEnumList(arrayList);
                    eVar.f8231b.b();
                    ub2 = (UB) g1.z(obj, iC, arrayList, null, ub2, k1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f8231b.getLiteType());
            }
            sVar.y(eVar.f8231b, arrayList);
            return ub2;
        }
        Object objG = null;
        if (eVar.a() == p1.b.ENUM) {
            d1Var.readInt32();
            eVar.f8231b.b();
            throw null;
        }
        int[] iArr = a.f8182a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                objG = Double.valueOf(d1Var.readDouble());
                break;
            case 2:
                objG = Float.valueOf(d1Var.readFloat());
                break;
            case 3:
                objG = Long.valueOf(d1Var.readInt64());
                break;
            case 4:
                objG = Long.valueOf(d1Var.readUInt64());
                break;
            case 5:
                objG = Integer.valueOf(d1Var.readInt32());
                break;
            case 6:
                objG = Long.valueOf(d1Var.readFixed64());
                break;
            case 7:
                objG = Integer.valueOf(d1Var.readFixed32());
                break;
            case 8:
                objG = Boolean.valueOf(d1Var.readBool());
                break;
            case 9:
                objG = Integer.valueOf(d1Var.readUInt32());
                break;
            case 10:
                objG = Integer.valueOf(d1Var.readSFixed32());
                break;
            case 11:
                objG = Long.valueOf(d1Var.readSFixed64());
                break;
            case 12:
                objG = Integer.valueOf(d1Var.readSInt32());
                break;
            case 13:
                objG = Long.valueOf(d1Var.readSInt64());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objG = d1Var.readBytes();
                break;
            case 16:
                objG = d1Var.readString();
                break;
            case 17:
                if (!eVar.d()) {
                    Object objI2 = sVar.i(eVar.f8231b);
                    if (objI2 instanceof w) {
                        e1 e1VarD = a1.a().d(objI2);
                        if (!((w) objI2).z()) {
                            Object objNewInstance = e1VarD.newInstance();
                            e1VarD.mergeFrom(objNewInstance, objI2);
                            sVar.y(eVar.f8231b, objNewInstance);
                            objI2 = objNewInstance;
                        }
                        d1Var.f(objI2, e1VarD, nVar);
                        return ub2;
                    }
                }
                objG = d1Var.d(eVar.b().getClass(), nVar);
                break;
            case 18:
                if (!eVar.d()) {
                    Object objI3 = sVar.i(eVar.f8231b);
                    if (objI3 instanceof w) {
                        e1 e1VarD2 = a1.a().d(objI3);
                        if (!((w) objI3).z()) {
                            Object objNewInstance2 = e1VarD2.newInstance();
                            e1VarD2.mergeFrom(objNewInstance2, objI3);
                            sVar.y(eVar.f8231b, objNewInstance2);
                            objI3 = objNewInstance2;
                        }
                        d1Var.b(objI3, e1VarD2, nVar);
                        return ub2;
                    }
                }
                objG = d1Var.a(eVar.b().getClass(), nVar);
                break;
        }
        if (eVar.d()) {
            sVar.a(eVar.f8231b, objG);
            return ub2;
        }
        int i11 = iArr[eVar.a().ordinal()];
        if ((i11 == 17 || i11 == 18) && (objI = sVar.i(eVar.f8231b)) != null) {
            objG = y.g(objI, objG);
        }
        sVar.y(eVar.f8231b, objG);
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void h(d1 d1Var, Object obj, n nVar, s<w.d> sVar) {
        w.e eVar = (w.e) obj;
        sVar.y(eVar.f8231b, d1Var.a(eVar.b().getClass(), nVar));
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void i(g gVar, Object obj, n nVar, s<w.d> sVar) {
        w.e eVar = (w.e) obj;
        p0.a aVarNewBuilderForType = eVar.b().newBuilderForType();
        h hVarM = gVar.m();
        aVarNewBuilderForType.x2(hVarM, nVar);
        sVar.y(eVar.f8231b, aVarNewBuilderForType.buildPartial());
        hVarM.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void j(q1 q1Var, Map.Entry<?, ?> entry) {
        w.d dVar = (w.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f8182a[dVar.getLiteType().ordinal()]) {
                case 1:
                    q1Var.writeDouble(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    q1Var.writeFloat(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    q1Var.writeInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    q1Var.writeUInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    q1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    q1Var.writeFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    q1Var.writeFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    q1Var.writeBool(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    q1Var.writeUInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    q1Var.writeSFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    q1Var.writeSFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    q1Var.writeSInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    q1Var.writeSInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    q1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    q1Var.a(dVar.getNumber(), (g) entry.getValue());
                    break;
                case 16:
                    q1Var.writeString(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    q1Var.e(dVar.getNumber(), entry.getValue(), a1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    q1Var.b(dVar.getNumber(), entry.getValue(), a1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f8182a[dVar.getLiteType().ordinal()]) {
            case 1:
                g1.O(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 2:
                g1.S(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 3:
                g1.V(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 4:
                g1.d0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 5:
                g1.U(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 6:
                g1.R(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 7:
                g1.Q(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 8:
                g1.M(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 9:
                g1.c0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 10:
                g1.X(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 11:
                g1.Y(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 12:
                g1.Z(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 13:
                g1.a0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 14:
                g1.U(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 15:
                g1.N(dVar.getNumber(), (List) entry.getValue(), q1Var);
                break;
            case 16:
                g1.b0(dVar.getNumber(), (List) entry.getValue(), q1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    g1.T(dVar.getNumber(), (List) entry.getValue(), q1Var, a1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    g1.W(dVar.getNumber(), (List) entry.getValue(), q1Var, a1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
