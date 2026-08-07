package androidx.datastore.preferences.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class s0<T> implements e1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f8196r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f8197s = n1.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f8199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f8202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f8205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f8207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f8208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f8209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u0 f8210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f8211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k1<?, ?> f8212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o<?> f8213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k0 f8214q;

    private s0(int[] iArr, Object[] objArr, int i11, int i12, p0 p0Var, z0 z0Var, boolean z11, int[] iArr2, int i13, int i14, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        this.f8198a = iArr;
        this.f8199b = objArr;
        this.f8200c = i11;
        this.f8201d = i12;
        this.f8204g = p0Var instanceof w;
        this.f8205h = z0Var;
        this.f8203f = oVar != null && oVar.e(p0Var);
        this.f8206i = z11;
        this.f8207j = iArr2;
        this.f8208k = i13;
        this.f8209l = i14;
        this.f8210m = u0Var;
        this.f8211n = d0Var;
        this.f8212o = k1Var;
        this.f8213p = oVar;
        this.f8202e = p0Var;
        this.f8214q = k0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.s.b<ET>> void A(androidx.datastore.preferences.protobuf.k1<UT, UB> r18, androidx.datastore.preferences.protobuf.o<ET> r19, T r20, androidx.datastore.preferences.protobuf.d1 r21, androidx.datastore.preferences.protobuf.n r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.A(androidx.datastore.preferences.protobuf.k1, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.n):void");
    }

    private final <K, V> void B(Object obj, int i11, Object obj2, n nVar, d1 d1Var) {
        long jL = L(e0(i11));
        Object objZ = n1.z(obj, jL);
        if (objZ == null) {
            objZ = this.f8214q.newMapField(obj2);
            n1.O(obj, jL, objZ);
        } else if (this.f8214q.isImmutable(objZ)) {
            Object objNewMapField = this.f8214q.newMapField(obj2);
            this.f8214q.mergeFrom(objNewMapField, objZ);
            n1.O(obj, jL, objNewMapField);
            objZ = objNewMapField;
        }
        d1Var.e(this.f8214q.forMutableMapData(objZ), this.f8214q.forMapMetadata(obj2), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(T t11, T t12, int i11) {
        if (q(t12, i11)) {
            long jL = L(e0(i11));
            Unsafe unsafe = f8197s;
            Object object = unsafe.getObject(t12, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + K(i11) + " is present but null: " + t12);
            }
            e1 e1VarM = m(i11);
            if (!q(t11, i11)) {
                if (v(object)) {
                    Object objNewInstance = e1VarM.newInstance();
                    e1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t11, jL, objNewInstance);
                } else {
                    unsafe.putObject(t11, jL, object);
                }
                Y(t11, i11);
                return;
            }
            Object object2 = unsafe.getObject(t11, jL);
            if (!v(object2)) {
                Object objNewInstance2 = e1VarM.newInstance();
                e1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t11, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            e1VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D(T t11, T t12, int i11) {
        int iK = K(i11);
        if (x(t12, iK, i11)) {
            long jL = L(e0(i11));
            Unsafe unsafe = f8197s;
            Object object = unsafe.getObject(t12, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + K(i11) + " is present but null: " + t12);
            }
            e1 e1VarM = m(i11);
            if (!x(t11, iK, i11)) {
                if (v(object)) {
                    Object objNewInstance = e1VarM.newInstance();
                    e1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t11, jL, objNewInstance);
                } else {
                    unsafe.putObject(t11, jL, object);
                }
                Z(t11, iK, i11);
                return;
            }
            Object object2 = unsafe.getObject(t11, jL);
            if (!v(object2)) {
                Object objNewInstance2 = e1VarM.newInstance();
                e1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t11, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            e1VarM.mergeFrom(object2, object);
        }
    }

    private void E(T t11, T t12, int i11) {
        int iE0 = e0(i11);
        long jL = L(iE0);
        int iK = K(i11);
        switch (d0(iE0)) {
            case 0:
                if (q(t12, i11)) {
                    n1.K(t11, jL, n1.u(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 1:
                if (q(t12, i11)) {
                    n1.L(t11, jL, n1.v(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 2:
                if (q(t12, i11)) {
                    n1.N(t11, jL, n1.x(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 3:
                if (q(t12, i11)) {
                    n1.N(t11, jL, n1.x(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 4:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 5:
                if (q(t12, i11)) {
                    n1.N(t11, jL, n1.x(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 6:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 7:
                if (q(t12, i11)) {
                    n1.E(t11, jL, n1.p(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 8:
                if (q(t12, i11)) {
                    n1.O(t11, jL, n1.z(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 9:
                C(t11, t12, i11);
                break;
            case 10:
                if (q(t12, i11)) {
                    n1.O(t11, jL, n1.z(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 11:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 12:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 13:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 14:
                if (q(t12, i11)) {
                    n1.N(t11, jL, n1.x(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 15:
                if (q(t12, i11)) {
                    n1.M(t11, jL, n1.w(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 16:
                if (q(t12, i11)) {
                    n1.N(t11, jL, n1.x(t12, jL));
                    Y(t11, i11);
                }
                break;
            case 17:
                C(t11, t12, i11);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f8211n.a(t11, t12, jL);
                break;
            case 50:
                g1.F(this.f8214q, t11, t12, jL);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (x(t12, iK, i11)) {
                    n1.O(t11, jL, n1.z(t12, jL));
                    Z(t11, iK, i11);
                }
                break;
            case 60:
                D(t11, t12, i11);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (x(t12, iK, i11)) {
                    n1.O(t11, jL, n1.z(t12, jL));
                    Z(t11, iK, i11);
                }
                break;
            case 68:
                D(t11, t12, i11);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object F(T t11, int i11) {
        e1 e1VarM = m(i11);
        long jL = L(e0(i11));
        if (!q(t11, i11)) {
            return e1VarM.newInstance();
        }
        Object object = f8197s.getObject(t11, jL);
        if (v(object)) {
            return object;
        }
        Object objNewInstance = e1VarM.newInstance();
        if (object != null) {
            e1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object G(T t11, int i11, int i12) {
        e1 e1VarM = m(i12);
        if (!x(t11, i11, i12)) {
            return e1VarM.newInstance();
        }
        Object object = f8197s.getObject(t11, L(e0(i12)));
        if (v(object)) {
            return object;
        }
        Object objNewInstance = e1VarM.newInstance();
        if (object != null) {
            e1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> s0<T> H(Class<T> cls, n0 n0Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        return n0Var instanceof c1 ? J((c1) n0Var, u0Var, d0Var, k1Var, oVar, k0Var) : I((i1) n0Var, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    static <T> s0<T> I(i1 i1Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        r[] rVarArrB = i1Var.b();
        if (rVarArrB.length != 0) {
            r rVar = rVarArrB[0];
            throw null;
        }
        int length = rVarArrB.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (rVarArrB.length > 0) {
            r rVar2 = rVarArrB[0];
            throw null;
        }
        int[] iArrA = i1Var.a();
        if (iArrA == null) {
            iArrA = f8196r;
        }
        if (rVarArrB.length > 0) {
            r rVar3 = rVarArrB[0];
            throw null;
        }
        int[] iArr2 = f8196r;
        int[] iArr3 = f8196r;
        int[] iArr4 = new int[iArrA.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrA, 0, iArr4, 0, iArrA.length);
        System.arraycopy(iArr2, 0, iArr4, iArrA.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrA.length + iArr2.length, iArr3.length);
        return new s0<>(iArr, objArr, 0, 0, i1Var.getDefaultInstance(), i1Var.getSyntax(), true, iArr4, iArrA.length, iArrA.length + iArr2.length, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static <T> s0<T> J(c1 c1Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i21;
        char cCharAt3;
        int i22;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int i31;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i32;
        int i33;
        int iObjectFieldOffset3;
        int i34;
        Field fieldX;
        char cCharAt9;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field fieldX2;
        int i38;
        Object obj2;
        Field fieldX3;
        int i39;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        int i43;
        char cCharAt13;
        String strB = c1Var.b();
        int length = strB.length();
        char c11 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i11 = i44 + 1;
                if (strB.charAt(i44) < 55296) {
                    break;
                }
                i44 = i11;
            }
        } else {
            i11 = 1;
        }
        int i45 = i11 + 1;
        int iCharAt2 = strB.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i46 = iCharAt2 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                cCharAt13 = strB.charAt(i45);
                if (cCharAt13 < 55296) {
                    break;
                }
                i46 |= (cCharAt13 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            iCharAt2 = i46 | (cCharAt13 << i47);
            i45 = i43;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            iCharAt = 0;
            i13 = 0;
            i17 = 0;
            i12 = 0;
            i16 = 0;
            iArr = f8196r;
            i15 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt3 = strB.charAt(i45);
            if (iCharAt3 >= 55296) {
                int i49 = iCharAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i26 = i48 + 1;
                    cCharAt8 = strB.charAt(i48);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt8 & 8191) << i51;
                    i51 += 13;
                    i48 = i26;
                }
                iCharAt3 = i49 | (cCharAt8 << i51);
                i48 = i26;
            }
            int i52 = i48 + 1;
            int iCharAt4 = strB.charAt(i48);
            if (iCharAt4 >= 55296) {
                int i53 = iCharAt4 & 8191;
                int i54 = 13;
                while (true) {
                    i25 = i52 + 1;
                    cCharAt7 = strB.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i25;
                }
                iCharAt4 = i53 | (cCharAt7 << i54);
                i52 = i25;
            }
            int i55 = i52 + 1;
            int iCharAt5 = strB.charAt(i52);
            if (iCharAt5 >= 55296) {
                int i56 = iCharAt5 & 8191;
                int i57 = 13;
                while (true) {
                    i24 = i55 + 1;
                    cCharAt6 = strB.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i24;
                }
                iCharAt5 = i56 | (cCharAt6 << i57);
                i55 = i24;
            }
            int i58 = i55 + 1;
            int iCharAt6 = strB.charAt(i55);
            if (iCharAt6 >= 55296) {
                int i59 = iCharAt6 & 8191;
                int i61 = 13;
                while (true) {
                    i23 = i58 + 1;
                    cCharAt5 = strB.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i58 = i23;
                }
                iCharAt6 = i59 | (cCharAt5 << i61);
                i58 = i23;
            }
            int i62 = i58 + 1;
            iCharAt = strB.charAt(i58);
            if (iCharAt >= 55296) {
                int i63 = iCharAt & 8191;
                int i64 = 13;
                while (true) {
                    i22 = i62 + 1;
                    cCharAt4 = strB.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i22;
                }
                iCharAt = i63 | (cCharAt4 << i64);
                i62 = i22;
            }
            int i65 = i62 + 1;
            int iCharAt7 = strB.charAt(i62);
            if (iCharAt7 >= 55296) {
                int i66 = iCharAt7 & 8191;
                int i67 = 13;
                while (true) {
                    i21 = i65 + 1;
                    cCharAt3 = strB.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i21;
                }
                iCharAt7 = i66 | (cCharAt3 << i67);
                i65 = i21;
            }
            int i68 = i65 + 1;
            int iCharAt8 = strB.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i69 = iCharAt8 & 8191;
                int i71 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = strB.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i71;
                    i71 += 13;
                    i68 = i19;
                }
                iCharAt8 = i69 | (cCharAt2 << i71);
                i68 = i19;
            }
            int i72 = i68 + 1;
            int iCharAt9 = strB.charAt(i68);
            if (iCharAt9 >= 55296) {
                int i73 = iCharAt9 & 8191;
                int i74 = 13;
                while (true) {
                    i18 = i72 + 1;
                    cCharAt = strB.charAt(i72);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i73 |= (cCharAt & 8191) << i74;
                    i74 += 13;
                    i72 = i18;
                }
                iCharAt9 = i73 | (cCharAt << i74);
                i72 = i18;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i12 = (iCharAt3 * 2) + iCharAt4;
            int i75 = iCharAt7;
            i13 = iCharAt5;
            i14 = i75;
            i15 = iCharAt3;
            iArr = iArr2;
            i16 = iCharAt9;
            i45 = i72;
            i17 = iCharAt6;
        }
        Unsafe unsafe = f8197s;
        Object[] objArrA = c1Var.a();
        Class<?> cls = c1Var.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i76 = i16 + i14;
        int i77 = i76;
        int i78 = i16;
        int i79 = 0;
        int i81 = 0;
        while (i45 < length) {
            int i82 = i45 + 1;
            int iCharAt10 = strB.charAt(i45);
            if (iCharAt10 >= c11) {
                int i83 = iCharAt10 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i42 = i84 + 1;
                    cCharAt12 = strB.charAt(i84);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i42;
                }
                iCharAt10 = i83 | (cCharAt12 << i85);
                i27 = i42;
            } else {
                i27 = i82;
            }
            int i86 = i27 + 1;
            int iCharAt11 = strB.charAt(i27);
            if (iCharAt11 >= c11) {
                int i87 = iCharAt11 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i41 = i88 + 1;
                    cCharAt11 = strB.charAt(i88);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i87 |= (cCharAt11 & 8191) << i89;
                    i89 += 13;
                    i88 = i41;
                }
                iCharAt11 = i87 | (cCharAt11 << i89);
                i28 = i41;
            } else {
                i28 = i86;
            }
            int i91 = iCharAt11 & 255;
            int i92 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i79] = i81;
                i79++;
            }
            int[] iArr4 = iArr3;
            if (i91 >= 51) {
                int i93 = i28 + 1;
                int iCharAt12 = strB.charAt(i28);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i94 = iCharAt12 & 8191;
                    int i95 = 13;
                    while (true) {
                        i39 = i93 + 1;
                        cCharAt10 = strB.charAt(i93);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i94 |= (cCharAt10 & 8191) << i95;
                        i95 += 13;
                        i93 = i39;
                        c12 = 55296;
                    }
                    iCharAt12 = i94 | (cCharAt10 << i95);
                    i93 = i39;
                }
                int i96 = i91 - 51;
                int i97 = i93;
                if (i96 == 9 || i96 == 17) {
                    i36 = i12 + 1;
                    objArr[((i81 / 3) * 2) + 1] = objArrA[i12];
                } else {
                    if (i96 == 12 && (c1Var.getSyntax().equals(z0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i36 = i12 + 1;
                        objArr[((i81 / 3) * 2) + 1] = objArrA[i12];
                    }
                    i37 = iCharAt12 * 2;
                    obj = objArrA[i37];
                    if (obj instanceof Field) {
                        fieldX2 = (Field) obj;
                    } else {
                        fieldX2 = X(cls, (String) obj);
                        objArrA[i37] = fieldX2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldX2);
                    i38 = i37 + 1;
                    obj2 = objArrA[i38];
                    if (obj2 instanceof Field) {
                        fieldX3 = (Field) obj2;
                    } else {
                        fieldX3 = X(cls, (String) obj2);
                        objArrA[i38] = fieldX3;
                    }
                    strB = strB;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldX3);
                    i34 = iObjectFieldOffset4;
                    i33 = 0;
                    i29 = iCharAt10;
                    i45 = i97;
                }
                i12 = i36;
                i37 = iCharAt12 * 2;
                obj = objArrA[i37];
                if (obj instanceof Field) {
                    fieldX2 = (Field) obj;
                } else {
                    fieldX2 = X(cls, (String) obj);
                    objArrA[i37] = fieldX2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldX2);
                i38 = i37 + 1;
                obj2 = objArrA[i38];
                if (obj2 instanceof Field) {
                    fieldX3 = (Field) obj2;
                } else {
                    fieldX3 = X(cls, (String) obj2);
                    objArrA[i38] = fieldX3;
                }
                strB = strB;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldX3);
                i34 = iObjectFieldOffset5;
                i33 = 0;
                i29 = iCharAt10;
                i45 = i97;
            } else {
                int i98 = i12 + 1;
                Field fieldX4 = X(cls, (String) objArrA[i12]);
                if (i91 == 9 || i91 == 17) {
                    i29 = iCharAt10;
                    objArr[((i81 / 3) * 2) + 1] = fieldX4.getType();
                } else {
                    if (i91 == 27 || i91 == 49) {
                        i29 = iCharAt10;
                        i35 = i12 + 2;
                        objArr[((i81 / 3) * 2) + 1] = objArrA[i98];
                    } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                        i29 = iCharAt10;
                        if (c1Var.getSyntax() == z0.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i35 = i12 + 2;
                            objArr[((i81 / 3) * 2) + 1] = objArrA[i98];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                        if ((iCharAt11 & 4096) != 0 || i91 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        } else {
                            int i99 = i28 + 1;
                            int iCharAt13 = strB.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i100 = iCharAt13 & 8191;
                                int i101 = 13;
                                while (true) {
                                    i32 = i99 + 1;
                                    cCharAt9 = strB.charAt(i99);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i100 |= (cCharAt9 & 8191) << i101;
                                    i101 += 13;
                                    i99 = i32;
                                }
                                iCharAt13 = i100 | (cCharAt9 << i101);
                            } else {
                                i32 = i99;
                            }
                            int i102 = (i15 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrA[i102];
                            if (obj3 instanceof Field) {
                                fieldX = (Field) obj3;
                            } else {
                                fieldX = X(cls, (String) obj3);
                                objArrA[i102] = fieldX;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX);
                            i33 = iCharAt13 % 32;
                        }
                        int i103 = iObjectFieldOffset2;
                        if (i91 >= 18 && i91 <= 49) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        iObjectFieldOffset3 = i103;
                        i34 = iObjectFieldOffset;
                        i12 = i31;
                        i45 = i32;
                    } else {
                        if (i91 == 50) {
                            int i104 = i78 + 1;
                            iArr[i78] = i81;
                            int i105 = (i81 / 3) * 2;
                            int i106 = i12 + 2;
                            objArr[i105] = objArrA[i98];
                            if ((iCharAt11 & 2048) != 0) {
                                i31 = i12 + 3;
                                objArr[i105 + 1] = objArrA[i106];
                                i29 = iCharAt10;
                                i78 = i104;
                            } else {
                                i31 = i106;
                                i78 = i104;
                                i29 = iCharAt10;
                            }
                        } else {
                            i29 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        }
                        int i107 = iObjectFieldOffset2;
                        if (i91 >= 18) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        iObjectFieldOffset3 = i107;
                        i34 = iObjectFieldOffset;
                        i12 = i31;
                        i45 = i32;
                    }
                    i31 = i35;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i32 = i28;
                        i33 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i32 = i28;
                        i33 = 0;
                    }
                    int i108 = iObjectFieldOffset2;
                    if (i91 >= 18) {
                        iArr[i77] = iObjectFieldOffset;
                        i77++;
                    }
                    iObjectFieldOffset3 = i108;
                    i34 = iObjectFieldOffset;
                    i12 = i31;
                    i45 = i32;
                }
                i31 = i98;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i32 = i28;
                    i33 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i32 = i28;
                    i33 = 0;
                }
                int i109 = iObjectFieldOffset2;
                if (i91 >= 18) {
                    iArr[i77] = iObjectFieldOffset;
                    i77++;
                }
                iObjectFieldOffset3 = i109;
                i34 = iObjectFieldOffset;
                i12 = i31;
                i45 = i32;
            }
            int i110 = i81 + 1;
            iArr4[i81] = i29;
            int i111 = i81 + 2;
            int i112 = iObjectFieldOffset3;
            iArr4[i110] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i91 << 20) | i34;
            i81 += 3;
            iArr4[i111] = (i33 << 20) | i112;
            length = i92;
            iArr3 = iArr4;
            strB = strB;
            c11 = 55296;
        }
        return new s0<>(iArr3, objArr, i13, i17, c1Var.getDefaultInstance(), c1Var.getSyntax(), false, iArr, i16, i76, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    private int K(int i11) {
        return this.f8198a[i11];
    }

    private static long L(int i11) {
        return i11 & 1048575;
    }

    private static <T> boolean M(T t11, long j11) {
        return ((Boolean) n1.z(t11, j11)).booleanValue();
    }

    private static <T> double N(T t11, long j11) {
        return ((Double) n1.z(t11, j11)).doubleValue();
    }

    private static <T> float O(T t11, long j11) {
        return ((Float) n1.z(t11, j11)).floatValue();
    }

    private static <T> int P(T t11, long j11) {
        return ((Integer) n1.z(t11, j11)).intValue();
    }

    private static <T> long Q(T t11, long j11) {
        return ((Long) n1.z(t11, j11)).longValue();
    }

    private int R(int i11) {
        if (i11 < this.f8200c || i11 > this.f8201d) {
            return -1;
        }
        return a0(i11, 0);
    }

    private int S(int i11) {
        return this.f8198a[i11 + 2];
    }

    private <E> void T(Object obj, long j11, d1 d1Var, e1<E> e1Var, n nVar) {
        d1Var.g(this.f8211n.c(obj, j11), e1Var, nVar);
    }

    private <E> void U(Object obj, int i11, d1 d1Var, e1<E> e1Var, n nVar) {
        d1Var.c(this.f8211n.c(obj, L(i11)), e1Var, nVar);
    }

    private void V(Object obj, int i11, d1 d1Var) {
        if (p(i11)) {
            n1.O(obj, L(i11), d1Var.readStringRequireUtf8());
        } else if (this.f8204g) {
            n1.O(obj, L(i11), d1Var.readString());
        } else {
            n1.O(obj, L(i11), d1Var.readBytes());
        }
    }

    private void W(Object obj, int i11, d1 d1Var) {
        if (p(i11)) {
            d1Var.readStringListRequireUtf8(this.f8211n.c(obj, L(i11)));
        } else {
            d1Var.readStringList(this.f8211n.c(obj, L(i11)));
        }
    }

    private static Field X(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void Y(T t11, int i11) {
        int iS = S(i11);
        long j11 = 1048575 & iS;
        if (j11 == 1048575) {
            return;
        }
        n1.M(t11, j11, (1 << (iS >>> 20)) | n1.w(t11, j11));
    }

    private void Z(T t11, int i11, int i12) {
        n1.M(t11, S(i12) & 1048575, i11);
    }

    private int a0(int i11, int i12) {
        int length = (this.f8198a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int iK = K(i14);
            if (i11 == iK) {
                return i14;
            }
            if (i11 < iK) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private void b0(T t11, int i11, Object obj) {
        f8197s.putObject(t11, L(e0(i11)), obj);
        Y(t11, i11);
    }

    private boolean c(T t11, T t12, int i11) {
        return q(t11, i11) == q(t12, i11);
    }

    private void c0(T t11, int i11, int i12, Object obj) {
        f8197s.putObject(t11, L(e0(i12)), obj);
        Z(t11, i11, i12);
    }

    private static <T> boolean d(T t11, long j11) {
        return n1.p(t11, j11);
    }

    private static int d0(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    private static void e(Object obj) {
        if (v(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int e0(int i11) {
        return this.f8198a[i11 + 1];
    }

    private static <T> double f(T t11, long j11) {
        return n1.u(t11, j11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void f0(T t11, q1 q1Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        s0<T> s0Var = this;
        if (s0Var.f8203f) {
            s<T> sVarC = s0Var.f8213p.c(t11);
            if (sVarC.n()) {
                entry = null;
                it = null;
            } else {
                Iterator itT = sVarC.t();
                entry = (Map.Entry) itT.next();
                it = itT;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = s0Var.f8198a.length;
        Unsafe unsafe = f8197s;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int iE0 = s0Var.e0(i15);
            int iK = s0Var.K(i15);
            int iD0 = d0(iE0);
            if (iD0 <= 17) {
                int i17 = s0Var.f8198a[i15 + 2];
                z11 = true;
                int i18 = i17 & 1048575;
                if (i18 != i14) {
                    i16 = i18 == 1048575 ? 0 : unsafe.getInt(t11, i18);
                    i14 = i18;
                }
                i11 = i14;
                i12 = i16;
                i13 = 1 << (i17 >>> 20);
            } else {
                z11 = true;
                i11 = i14;
                i12 = i16;
                i13 = 0;
            }
            while (entry != null && s0Var.f8213p.a(entry) <= iK) {
                s0Var.f8213p.j(q1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jL = L(iE0);
            switch (iD0) {
                case 0:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeDouble(iK, f(t11, jL));
                    }
                    break;
                case 1:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeFloat(iK, j(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 2:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeInt64(iK, unsafe.getLong(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 3:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeUInt64(iK, unsafe.getLong(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 4:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeInt32(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 5:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeFixed64(iK, unsafe.getLong(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 6:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeFixed32(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 7:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeBool(iK, d(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 8:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        s0Var.i0(iK, unsafe.getObject(t11, jL), q1Var);
                    }
                    break;
                case 9:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.b(iK, unsafe.getObject(t11, jL), s0Var.m(i15));
                    }
                    break;
                case 10:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.a(iK, (g) unsafe.getObject(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 11:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeUInt32(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 12:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeEnum(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 13:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeSFixed32(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 14:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeSFixed64(iK, unsafe.getLong(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 15:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeSInt32(iK, unsafe.getInt(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 16:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.writeSInt64(iK, unsafe.getLong(t11, jL));
                    }
                    s0Var = this;
                    break;
                case 17:
                    if (s0Var.r(t11, i15, i11, i12, i13)) {
                        q1Var.e(iK, unsafe.getObject(t11, jL), s0Var.m(i15));
                    }
                    break;
                case 18:
                    g1.O(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 19:
                    g1.S(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 20:
                    g1.V(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 21:
                    g1.d0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 22:
                    g1.U(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 23:
                    g1.R(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 24:
                    g1.Q(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 25:
                    g1.M(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 26:
                    g1.b0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var);
                    break;
                case 27:
                    g1.W(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, s0Var.m(i15));
                    break;
                case 28:
                    g1.N(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var);
                    break;
                case 29:
                    z12 = false;
                    g1.c0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 30:
                    z12 = false;
                    g1.P(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 31:
                    z12 = false;
                    g1.X(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 32:
                    z12 = false;
                    g1.Y(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 33:
                    z12 = false;
                    g1.Z(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 34:
                    z12 = false;
                    g1.a0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, false);
                    break;
                case 35:
                    g1.O(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 36:
                    g1.S(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 37:
                    g1.V(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 38:
                    g1.d0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 39:
                    g1.U(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 40:
                    g1.R(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 41:
                    g1.Q(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 42:
                    g1.M(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 43:
                    g1.c0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 44:
                    g1.P(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 45:
                    g1.X(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 46:
                    g1.Y(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 47:
                    g1.Z(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 48:
                    g1.a0(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, z11);
                    break;
                case 49:
                    g1.T(s0Var.K(i15), (List) unsafe.getObject(t11, jL), q1Var, s0Var.m(i15));
                    break;
                case 50:
                    s0Var.h0(q1Var, iK, unsafe.getObject(t11, jL), i15);
                    break;
                case 51:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeDouble(iK, N(t11, jL));
                    }
                    break;
                case 52:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeFloat(iK, O(t11, jL));
                    }
                    break;
                case 53:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeInt64(iK, Q(t11, jL));
                    }
                    break;
                case 54:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeUInt64(iK, Q(t11, jL));
                    }
                    break;
                case 55:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeInt32(iK, P(t11, jL));
                    }
                    break;
                case 56:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeFixed64(iK, Q(t11, jL));
                    }
                    break;
                case 57:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeFixed32(iK, P(t11, jL));
                    }
                    break;
                case 58:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeBool(iK, M(t11, jL));
                    }
                    break;
                case 59:
                    if (s0Var.x(t11, iK, i15)) {
                        s0Var.i0(iK, unsafe.getObject(t11, jL), q1Var);
                    }
                    break;
                case 60:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.b(iK, unsafe.getObject(t11, jL), s0Var.m(i15));
                    }
                    break;
                case 61:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.a(iK, (g) unsafe.getObject(t11, jL));
                    }
                    break;
                case 62:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeUInt32(iK, P(t11, jL));
                    }
                    break;
                case 63:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeEnum(iK, P(t11, jL));
                    }
                    break;
                case 64:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeSFixed32(iK, P(t11, jL));
                    }
                    break;
                case 65:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeSFixed64(iK, Q(t11, jL));
                    }
                    break;
                case 66:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeSInt32(iK, P(t11, jL));
                    }
                    break;
                case 67:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.writeSInt64(iK, Q(t11, jL));
                    }
                    break;
                case 68:
                    if (s0Var.x(t11, iK, i15)) {
                        q1Var.e(iK, unsafe.getObject(t11, jL), s0Var.m(i15));
                    }
                    break;
                default:
                    break;
            }
            i15 += 3;
            i16 = i12;
            i14 = i11;
            entry = entry;
        }
        while (entry != null) {
            s0Var.f8213p.j(q1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        s0Var.j0(s0Var.f8212o, t11, q1Var);
    }

    private boolean g(T t11, T t12, int i11) {
        int iE0 = e0(i11);
        long jL = L(iE0);
        switch (d0(iE0)) {
            case 0:
                return c(t11, t12, i11) && Double.doubleToLongBits(n1.u(t11, jL)) == Double.doubleToLongBits(n1.u(t12, jL));
            case 1:
                return c(t11, t12, i11) && Float.floatToIntBits(n1.v(t11, jL)) == Float.floatToIntBits(n1.v(t12, jL));
            case 2:
                return c(t11, t12, i11) && n1.x(t11, jL) == n1.x(t12, jL);
            case 3:
                return c(t11, t12, i11) && n1.x(t11, jL) == n1.x(t12, jL);
            case 4:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 5:
                return c(t11, t12, i11) && n1.x(t11, jL) == n1.x(t12, jL);
            case 6:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 7:
                return c(t11, t12, i11) && n1.p(t11, jL) == n1.p(t12, jL);
            case 8:
                return c(t11, t12, i11) && g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 9:
                return c(t11, t12, i11) && g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 10:
                return c(t11, t12, i11) && g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 11:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 12:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 13:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 14:
                return c(t11, t12, i11) && n1.x(t11, jL) == n1.x(t12, jL);
            case 15:
                return c(t11, t12, i11) && n1.w(t11, jL) == n1.w(t12, jL);
            case 16:
                return c(t11, t12, i11) && n1.x(t11, jL) == n1.x(t12, jL);
            case 17:
                return c(t11, t12, i11) && g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 50:
                return g1.I(n1.z(t11, jL), n1.z(t12, jL));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return w(t11, t12, i11) && g1.I(n1.z(t11, jL), n1.z(t12, jL));
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void g0(T t11, q1 q1Var) {
        Iterator itG;
        Map.Entry<?, ?> entry;
        j0(this.f8212o, t11, q1Var);
        if (this.f8203f) {
            s<T> sVarC = this.f8213p.c(t11);
            if (sVarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = sVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f8198a.length - 3; length >= 0; length -= 3) {
            int iE0 = e0(length);
            int iK = K(length);
            while (entry != null && this.f8213p.a(entry) > iK) {
                this.f8213p.j(q1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (d0(iE0)) {
                case 0:
                    if (q(t11, length)) {
                        q1Var.writeDouble(iK, f(t11, L(iE0)));
                    }
                    break;
                case 1:
                    if (q(t11, length)) {
                        q1Var.writeFloat(iK, j(t11, L(iE0)));
                    }
                    break;
                case 2:
                    if (q(t11, length)) {
                        q1Var.writeInt64(iK, z(t11, L(iE0)));
                    }
                    break;
                case 3:
                    if (q(t11, length)) {
                        q1Var.writeUInt64(iK, z(t11, L(iE0)));
                    }
                    break;
                case 4:
                    if (q(t11, length)) {
                        q1Var.writeInt32(iK, o(t11, L(iE0)));
                    }
                    break;
                case 5:
                    if (q(t11, length)) {
                        q1Var.writeFixed64(iK, z(t11, L(iE0)));
                    }
                    break;
                case 6:
                    if (q(t11, length)) {
                        q1Var.writeFixed32(iK, o(t11, L(iE0)));
                    }
                    break;
                case 7:
                    if (q(t11, length)) {
                        q1Var.writeBool(iK, d(t11, L(iE0)));
                    }
                    break;
                case 8:
                    if (q(t11, length)) {
                        i0(iK, n1.z(t11, L(iE0)), q1Var);
                    }
                    break;
                case 9:
                    if (q(t11, length)) {
                        q1Var.b(iK, n1.z(t11, L(iE0)), m(length));
                    }
                    break;
                case 10:
                    if (q(t11, length)) {
                        q1Var.a(iK, (g) n1.z(t11, L(iE0)));
                    }
                    break;
                case 11:
                    if (q(t11, length)) {
                        q1Var.writeUInt32(iK, o(t11, L(iE0)));
                    }
                    break;
                case 12:
                    if (q(t11, length)) {
                        q1Var.writeEnum(iK, o(t11, L(iE0)));
                    }
                    break;
                case 13:
                    if (q(t11, length)) {
                        q1Var.writeSFixed32(iK, o(t11, L(iE0)));
                    }
                    break;
                case 14:
                    if (q(t11, length)) {
                        q1Var.writeSFixed64(iK, z(t11, L(iE0)));
                    }
                    break;
                case 15:
                    if (q(t11, length)) {
                        q1Var.writeSInt32(iK, o(t11, L(iE0)));
                    }
                    break;
                case 16:
                    if (q(t11, length)) {
                        q1Var.writeSInt64(iK, z(t11, L(iE0)));
                    }
                    break;
                case 17:
                    if (q(t11, length)) {
                        q1Var.e(iK, n1.z(t11, L(iE0)), m(length));
                    }
                    break;
                case 18:
                    g1.O(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 19:
                    g1.S(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 20:
                    g1.V(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 21:
                    g1.d0(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 22:
                    g1.U(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 23:
                    g1.R(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 24:
                    g1.Q(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 25:
                    g1.M(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 26:
                    g1.b0(K(length), (List) n1.z(t11, L(iE0)), q1Var);
                    break;
                case 27:
                    g1.W(K(length), (List) n1.z(t11, L(iE0)), q1Var, m(length));
                    break;
                case 28:
                    g1.N(K(length), (List) n1.z(t11, L(iE0)), q1Var);
                    break;
                case 29:
                    g1.c0(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 30:
                    g1.P(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 31:
                    g1.X(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 32:
                    g1.Y(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 33:
                    g1.Z(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 34:
                    g1.a0(K(length), (List) n1.z(t11, L(iE0)), q1Var, false);
                    break;
                case 35:
                    g1.O(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 36:
                    g1.S(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 37:
                    g1.V(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 38:
                    g1.d0(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 39:
                    g1.U(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 40:
                    g1.R(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 41:
                    g1.Q(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 42:
                    g1.M(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 43:
                    g1.c0(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 44:
                    g1.P(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 45:
                    g1.X(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 46:
                    g1.Y(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 47:
                    g1.Z(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 48:
                    g1.a0(K(length), (List) n1.z(t11, L(iE0)), q1Var, true);
                    break;
                case 49:
                    g1.T(K(length), (List) n1.z(t11, L(iE0)), q1Var, m(length));
                    break;
                case 50:
                    h0(q1Var, iK, n1.z(t11, L(iE0)), length);
                    break;
                case 51:
                    if (x(t11, iK, length)) {
                        q1Var.writeDouble(iK, N(t11, L(iE0)));
                    }
                    break;
                case 52:
                    if (x(t11, iK, length)) {
                        q1Var.writeFloat(iK, O(t11, L(iE0)));
                    }
                    break;
                case 53:
                    if (x(t11, iK, length)) {
                        q1Var.writeInt64(iK, Q(t11, L(iE0)));
                    }
                    break;
                case 54:
                    if (x(t11, iK, length)) {
                        q1Var.writeUInt64(iK, Q(t11, L(iE0)));
                    }
                    break;
                case 55:
                    if (x(t11, iK, length)) {
                        q1Var.writeInt32(iK, P(t11, L(iE0)));
                    }
                    break;
                case 56:
                    if (x(t11, iK, length)) {
                        q1Var.writeFixed64(iK, Q(t11, L(iE0)));
                    }
                    break;
                case 57:
                    if (x(t11, iK, length)) {
                        q1Var.writeFixed32(iK, P(t11, L(iE0)));
                    }
                    break;
                case 58:
                    if (x(t11, iK, length)) {
                        q1Var.writeBool(iK, M(t11, L(iE0)));
                    }
                    break;
                case 59:
                    if (x(t11, iK, length)) {
                        i0(iK, n1.z(t11, L(iE0)), q1Var);
                    }
                    break;
                case 60:
                    if (x(t11, iK, length)) {
                        q1Var.b(iK, n1.z(t11, L(iE0)), m(length));
                    }
                    break;
                case 61:
                    if (x(t11, iK, length)) {
                        q1Var.a(iK, (g) n1.z(t11, L(iE0)));
                    }
                    break;
                case 62:
                    if (x(t11, iK, length)) {
                        q1Var.writeUInt32(iK, P(t11, L(iE0)));
                    }
                    break;
                case 63:
                    if (x(t11, iK, length)) {
                        q1Var.writeEnum(iK, P(t11, L(iE0)));
                    }
                    break;
                case 64:
                    if (x(t11, iK, length)) {
                        q1Var.writeSFixed32(iK, P(t11, L(iE0)));
                    }
                    break;
                case 65:
                    if (x(t11, iK, length)) {
                        q1Var.writeSFixed64(iK, Q(t11, L(iE0)));
                    }
                    break;
                case 66:
                    if (x(t11, iK, length)) {
                        q1Var.writeSInt32(iK, P(t11, L(iE0)));
                    }
                    break;
                case 67:
                    if (x(t11, iK, length)) {
                        q1Var.writeSInt64(iK, Q(t11, L(iE0)));
                    }
                    break;
                case 68:
                    if (x(t11, iK, length)) {
                        q1Var.e(iK, n1.z(t11, L(iE0)), m(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f8213p.j(q1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    private <UT, UB> UB h(Object obj, int i11, UB ub2, k1<UT, UB> k1Var, Object obj2) {
        y.c cVarK;
        int iK = K(i11);
        Object objZ = n1.z(obj, L(e0(i11)));
        return (objZ == null || (cVarK = k(i11)) == null) ? ub2 : (UB) i(i11, iK, this.f8214q.forMutableMapData(objZ), cVarK, ub2, k1Var, obj2);
    }

    private <K, V> void h0(q1 q1Var, int i11, Object obj, int i12) {
        if (obj != null) {
            q1Var.c(i11, this.f8214q.forMapMetadata(l(i12)), this.f8214q.forMapData(obj));
        }
    }

    private <K, V, UT, UB> UB i(int i11, int i12, Map<K, V> map, y.c cVar, UB ub2, k1<UT, UB> k1Var, Object obj) {
        i0.a<?, ?> aVarForMapMetadata = this.f8214q.forMapMetadata(l(i11));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = k1Var.f(obj);
                }
                g.h hVarL = g.l(i0.b(aVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    i0.e(hVarL.b(), aVarForMapMetadata, next.getKey(), next.getValue());
                    k1Var.d(ub2, i12, hVarL.a());
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private void i0(int i11, Object obj, q1 q1Var) {
        if (obj instanceof String) {
            q1Var.writeString(i11, (String) obj);
        } else {
            q1Var.a(i11, (g) obj);
        }
    }

    private static <T> float j(T t11, long j11) {
        return n1.v(t11, j11);
    }

    private <UT, UB> void j0(k1<UT, UB> k1Var, T t11, q1 q1Var) {
        k1Var.t(k1Var.g(t11), q1Var);
    }

    private y.c k(int i11) {
        return (y.c) this.f8199b[((i11 / 3) * 2) + 1];
    }

    private Object l(int i11) {
        return this.f8199b[(i11 / 3) * 2];
    }

    private e1 m(int i11) {
        int i12 = (i11 / 3) * 2;
        e1 e1Var = (e1) this.f8199b[i12];
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> e1VarC = a1.a().c((Class) this.f8199b[i12 + 1]);
        this.f8199b[i12] = e1VarC;
        return e1VarC;
    }

    private <UT, UB> int n(k1<UT, UB> k1Var, T t11) {
        return k1Var.h(k1Var.g(t11));
    }

    private static <T> int o(T t11, long j11) {
        return n1.w(t11, j11);
    }

    private static boolean p(int i11) {
        return (i11 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private boolean q(T t11, int i11) {
        boolean zEquals;
        int iS = S(i11);
        long j11 = 1048575 & iS;
        if (j11 != 1048575) {
            return (n1.w(t11, j11) & (1 << (iS >>> 20))) != 0;
        }
        int iE0 = e0(i11);
        long jL = L(iE0);
        switch (d0(iE0)) {
            case 0:
                return Double.doubleToRawLongBits(n1.u(t11, jL)) != 0;
            case 1:
                return Float.floatToRawIntBits(n1.v(t11, jL)) != 0;
            case 2:
                return n1.x(t11, jL) != 0;
            case 3:
                return n1.x(t11, jL) != 0;
            case 4:
                return n1.w(t11, jL) != 0;
            case 5:
                return n1.x(t11, jL) != 0;
            case 6:
                return n1.w(t11, jL) != 0;
            case 7:
                return n1.p(t11, jL);
            case 8:
                Object objZ = n1.z(t11, jL);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = g.f8057b.equals(objZ);
                }
                break;
            case 9:
                return n1.z(t11, jL) != null;
            case 10:
                zEquals = g.f8057b.equals(n1.z(t11, jL));
                break;
            case 11:
                return n1.w(t11, jL) != 0;
            case 12:
                return n1.w(t11, jL) != 0;
            case 13:
                return n1.w(t11, jL) != 0;
            case 14:
                return n1.x(t11, jL) != 0;
            case 15:
                return n1.w(t11, jL) != 0;
            case 16:
                return n1.x(t11, jL) != 0;
            case 17:
                return n1.z(t11, jL) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean r(T t11, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return q(t11, i11);
        }
        return (i13 & i14) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean s(Object obj, int i11, e1 e1Var) {
        return e1Var.isInitialized(n1.z(obj, L(i11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean t(Object obj, int i11, int i12) {
        List list = (List) n1.z(obj, L(i11));
        if (list.isEmpty()) {
            return true;
        }
        e1 e1VarM = m(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!e1VarM.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.e1] */
    private boolean u(T t11, int i11, int i12) {
        Map<?, ?> mapForMapData = this.f8214q.forMapData(n1.z(t11, L(i11)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f8214q.forMapMetadata(l(i12)).f8130c.getJavaType() != p1.c.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapForMapData.values()) {
            if (C == 0) {
                C = C;
                C = a1.a().c(obj.getClass());
            }
            C = C;
            if (!C.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).z();
        }
        return true;
    }

    private boolean w(T t11, T t12, int i11) {
        long jS = S(i11) & 1048575;
        return n1.w(t11, jS) == n1.w(t12, jS);
    }

    private boolean x(T t11, int i11, int i12) {
        return n1.w(t11, (long) (S(i12) & 1048575)) == i11;
    }

    private static boolean y(int i11) {
        return (i11 & 268435456) != 0;
    }

    private static <T> long z(T t11, long j11) {
        return n1.x(t11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void a(T t11, q1 q1Var) {
        if (q1Var.fieldOrder() == q1.a.DESCENDING) {
            g0(t11, q1Var);
        } else {
            f0(t11, q1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void b(T t11, d1 d1Var, n nVar) {
        nVar.getClass();
        e(t11);
        A(this.f8212o, this.f8213p, t11, d1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public boolean equals(T t11, T t12) {
        int length = this.f8198a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!g(t11, t12, i11)) {
                return false;
            }
        }
        if (!this.f8212o.g(t11).equals(this.f8212o.g(t12))) {
            return false;
        }
        if (this.f8203f) {
            return this.f8213p.c(t11).equals(this.f8213p.c(t12));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.s0<T>) = 
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v24 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v30 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.s0<T>)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.e1
    public int getSerializedSize(T t11) {
        int i11;
        int i12;
        int iQ;
        int iX;
        int i13;
        int iU;
        int iW;
        s0<T> s0Var = this;
        T t12 = t11;
        Unsafe unsafe = f8197s;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i15 < s0Var.f8198a.length) {
            int iE0 = s0Var.e0(i15);
            int iD0 = d0(iE0);
            int iK = s0Var.K(i15);
            int i19 = s0Var.f8198a[i15 + 2];
            int i21 = i19 & i14;
            if (iD0 <= 17) {
                if (i21 != i18) {
                    i16 = i21 == i14 ? 0 : unsafe.getInt(t12, i21);
                    i18 = i21;
                }
                i11 = 1 << (i19 >>> 20);
            } else {
                i11 = 0;
            }
            int i22 = i17;
            long jL = L(iE0);
            if (iD0 < t.DOUBLE_LIST_PACKED.id() || iD0 > t.SINT64_LIST_PACKED.id()) {
                i21 = 0;
            }
            switch (iD0) {
                case 0:
                    if (!s0Var.r(t12, i15, i18, i16, i11)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.i(iK, 0.0d);
                        i17 = i22 + i12;
                    }
                    break;
                case 1:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.q(iK, BitmapDescriptorFactory.HUE_RED);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 2:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.x(iK, unsafe.getLong(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 3:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.X(iK, unsafe.getLong(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 4:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.v(iK, unsafe.getInt(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 5:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.o(iK, 0L);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 6:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.m(iK, 0);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 7:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.d(iK, true);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 8:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        Object object = unsafe.getObject(t12, jL);
                        iX = object instanceof g ? CodedOutputStream.g(iK, (g) object) : CodedOutputStream.S(iK, (String) object);
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 9:
                    if (!s0Var.r(t12, i15, i18, i16, i11)) {
                        i17 = i22;
                    } else {
                        i12 = g1.o(iK, unsafe.getObject(t12, jL), s0Var.m(i15));
                        i17 = i22 + i12;
                    }
                    break;
                case 10:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.g(iK, (g) unsafe.getObject(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 11:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.V(iK, unsafe.getInt(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 12:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.k(iK, unsafe.getInt(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 13:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.K(iK, 0);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 14:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iQ = CodedOutputStream.M(iK, 0L);
                        i17 = i22 + iQ;
                        s0Var = this;
                        t12 = t11;
                    }
                    s0Var = this;
                    t12 = t11;
                    i17 = i22;
                    break;
                case 15:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.O(iK, unsafe.getInt(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 16:
                    if (s0Var.r(t12, i15, i18, i16, i11)) {
                        iX = CodedOutputStream.Q(iK, unsafe.getLong(t12, jL));
                        i17 = i22 + iX;
                        s0Var = this;
                    }
                    s0Var = this;
                    i17 = i22;
                    break;
                case 17:
                    if (!s0Var.r(t12, i15, i18, i16, i11)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.s(iK, (p0) unsafe.getObject(t12, jL), s0Var.m(i15));
                        i17 = i22 + i12;
                    }
                    break;
                case 18:
                    i12 = g1.h(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 19:
                    i12 = g1.f(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 20:
                    i12 = g1.m(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 21:
                    i12 = g1.x(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 22:
                    i12 = g1.k(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 23:
                    i12 = g1.h(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 24:
                    i12 = g1.f(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 25:
                    i12 = g1.a(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 26:
                    i12 = g1.u(iK, (List) unsafe.getObject(t12, jL));
                    i17 = i22 + i12;
                    break;
                case 27:
                    i12 = g1.p(iK, (List) unsafe.getObject(t12, jL), s0Var.m(i15));
                    i17 = i22 + i12;
                    break;
                case 28:
                    i12 = g1.c(iK, (List) unsafe.getObject(t12, jL));
                    i17 = i22 + i12;
                    break;
                case 29:
                    i12 = g1.v(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 30:
                    i12 = g1.d(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 31:
                    i12 = g1.f(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 32:
                    i12 = g1.h(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 33:
                    i12 = g1.q(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 34:
                    i12 = g1.s(iK, (List) unsafe.getObject(t12, jL), false);
                    i17 = i22 + i12;
                    break;
                case 35:
                    i13 = g1.i((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 36:
                    i13 = g1.g((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 37:
                    i13 = g1.n((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 38:
                    i13 = g1.y((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 39:
                    i13 = g1.l((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 40:
                    i13 = g1.i((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 41:
                    i13 = g1.g((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 42:
                    i13 = g1.b((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 43:
                    i13 = g1.w((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 44:
                    i13 = g1.e((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 45:
                    i13 = g1.g((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 46:
                    i13 = g1.i((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 47:
                    i13 = g1.r((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 48:
                    i13 = g1.t((List) unsafe.getObject(t12, jL));
                    if (i13 <= 0) {
                        i17 = i22;
                    } else {
                        if (s0Var.f8206i) {
                            unsafe.putInt(t12, i21, i13);
                        }
                        iU = CodedOutputStream.U(iK);
                        iW = CodedOutputStream.W(i13);
                        i17 = i22 + iU + iW + i13;
                    }
                    break;
                case 49:
                    i12 = g1.j(iK, (List) unsafe.getObject(t12, jL), s0Var.m(i15));
                    i17 = i22 + i12;
                    break;
                case 50:
                    i12 = s0Var.f8214q.getSerializedSize(iK, unsafe.getObject(t12, jL), s0Var.l(i15));
                    i17 = i22 + i12;
                    break;
                case 51:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.i(iK, 0.0d);
                        i17 = i22 + i12;
                    }
                    break;
                case 52:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.q(iK, BitmapDescriptorFactory.HUE_RED);
                        i17 = i22 + i12;
                    }
                    break;
                case 53:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.x(iK, Q(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 54:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.X(iK, Q(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 55:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.v(iK, P(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 56:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.o(iK, 0L);
                        i17 = i22 + i12;
                    }
                    break;
                case 57:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.m(iK, 0);
                        i17 = i22 + i12;
                    }
                    break;
                case 58:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.d(iK, true);
                        i17 = i22 + i12;
                    }
                    break;
                case 59:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        Object object2 = unsafe.getObject(t12, jL);
                        i12 = object2 instanceof g ? CodedOutputStream.g(iK, (g) object2) : CodedOutputStream.S(iK, (String) object2);
                        i17 = i22 + i12;
                    }
                    break;
                case 60:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = g1.o(iK, unsafe.getObject(t12, jL), s0Var.m(i15));
                        i17 = i22 + i12;
                    }
                    break;
                case 61:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.g(iK, (g) unsafe.getObject(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 62:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.V(iK, P(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 63:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.k(iK, P(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 64:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.K(iK, 0);
                        i17 = i22 + i12;
                    }
                    break;
                case 65:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.M(iK, 0L);
                        i17 = i22 + i12;
                    }
                    break;
                case 66:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.O(iK, P(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 67:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.Q(iK, Q(t12, jL));
                        i17 = i22 + i12;
                    }
                    break;
                case 68:
                    if (!s0Var.x(t12, iK, i15)) {
                        i17 = i22;
                    } else {
                        i12 = CodedOutputStream.s(iK, (p0) unsafe.getObject(t12, jL), s0Var.m(i15));
                        i17 = i22 + i12;
                    }
                    break;
                default:
                    i17 = i22;
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        int iN = i17 + s0Var.n(s0Var.f8212o, t12);
        return s0Var.f8203f ? iN + s0Var.f8213p.c(t12).l() : iN;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int hashCode(T t11) {
        int i11;
        int iF;
        int length = this.f8198a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iE0 = e0(i13);
            int iK = K(i13);
            long jL = L(iE0);
            int iHashCode = 37;
            switch (d0(iE0)) {
                case 0:
                    i11 = i12 * 53;
                    iF = y.f(Double.doubleToLongBits(n1.u(t11, jL)));
                    i12 = i11 + iF;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iF = Float.floatToIntBits(n1.v(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 2:
                    i11 = i12 * 53;
                    iF = y.f(n1.x(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 3:
                    i11 = i12 * 53;
                    iF = y.f(n1.x(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 5:
                    i11 = i12 * 53;
                    iF = y.f(n1.x(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iF = y.c(n1.p(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iF = ((String) n1.z(t11, jL)).hashCode();
                    i12 = i11 + iF;
                    break;
                case 9:
                    Object objZ = n1.z(t11, jL);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iF = n1.z(t11, jL).hashCode();
                    i12 = i11 + iF;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 14:
                    i11 = i12 * 53;
                    iF = y.f(n1.x(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iF = n1.w(t11, jL);
                    i12 = i11 + iF;
                    break;
                case 16:
                    i11 = i12 * 53;
                    iF = y.f(n1.x(t11, jL));
                    i12 = i11 + iF;
                    break;
                case 17:
                    Object objZ2 = n1.z(t11, jL);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    iF = n1.z(t11, jL).hashCode();
                    i12 = i11 + iF;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iF = n1.z(t11, jL).hashCode();
                    i12 = i11 + iF;
                    break;
                case 51:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Double.doubleToLongBits(N(t11, jL)));
                        i12 = i11 + iF;
                    }
                    break;
                case 52:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = Float.floatToIntBits(O(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 53:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Q(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 54:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Q(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 55:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 56:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Q(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 57:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 58:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.c(M(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 59:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = ((String) n1.z(t11, jL)).hashCode();
                        i12 = i11 + iF;
                    }
                    break;
                case 60:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = n1.z(t11, jL).hashCode();
                        i12 = i11 + iF;
                    }
                    break;
                case 61:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = n1.z(t11, jL).hashCode();
                        i12 = i11 + iF;
                    }
                    break;
                case 62:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 63:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 64:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 65:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Q(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 66:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = P(t11, jL);
                        i12 = i11 + iF;
                    }
                    break;
                case 67:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = y.f(Q(t11, jL));
                        i12 = i11 + iF;
                    }
                    break;
                case 68:
                    if (x(t11, iK, i13)) {
                        i11 = i12 * 53;
                        iF = n1.z(t11, jL).hashCode();
                        i12 = i11 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i12 * 53) + this.f8212o.g(t11).hashCode();
        return this.f8203f ? (iHashCode2 * 53) + this.f8213p.c(t11).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.e1
    public final boolean isInitialized(T t11) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.f8208k) {
            int i16 = this.f8207j[i14];
            int iK = K(i16);
            int iE0 = e0(i16);
            int i17 = this.f8198a[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i15 = f8197s.getInt(t11, i18);
                }
                i12 = i15;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i15;
            }
            T t12 = t11;
            if (y(iE0) && !r(t12, i16, i11, i12, i19)) {
                return false;
            }
            int iD0 = d0(iE0);
            if (iD0 == 9 || iD0 == 17) {
                if (r(t12, i16, i11, i12, i19) && !s(t12, iE0, m(i16))) {
                    return false;
                }
            } else if (iD0 == 27) {
                if (!t(t12, iE0, i16)) {
                    return false;
                }
            } else if (iD0 == 60 || iD0 == 68) {
                if (x(t12, iK, i16) && !s(t12, iE0, m(i16))) {
                    return false;
                }
            } else if (iD0 != 49) {
                if (iD0 == 50 && !u(t12, iE0, i16)) {
                    return false;
                }
            } else if (!t(t12, iE0, i16)) {
                return false;
            }
            i14++;
            t11 = t12;
            i13 = i11;
            i15 = i12;
        }
        return !this.f8203f || this.f8213p.c(t11).p();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e1
    public void makeImmutable(T t11) {
        if (v(t11)) {
            if (t11 instanceof w) {
                w wVar = (w) t11;
                wVar.l();
                wVar.k();
                wVar.B();
            }
            int length = this.f8198a.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iE0 = e0(i11);
                long jL = L(iE0);
                int iD0 = d0(iE0);
                if (iD0 != 9) {
                    if (iD0 != 60 && iD0 != 68) {
                        switch (iD0) {
                            case 17:
                                if (q(t11, i11)) {
                                    m(i11).makeImmutable(f8197s.getObject(t11, jL));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f8211n.b(t11, jL);
                                break;
                            case 50:
                                Unsafe unsafe = f8197s;
                                Object object = unsafe.getObject(t11, jL);
                                if (object != null) {
                                    unsafe.putObject(t11, jL, this.f8214q.toImmutable(object));
                                }
                                break;
                        }
                    } else if (x(t11, K(i11), i11)) {
                        m(i11).makeImmutable(f8197s.getObject(t11, jL));
                    }
                } else if (q(t11, i11)) {
                    m(i11).makeImmutable(f8197s.getObject(t11, jL));
                }
            }
            this.f8212o.j(t11);
            if (this.f8203f) {
                this.f8213p.f(t11);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void mergeFrom(T t11, T t12) {
        e(t11);
        t12.getClass();
        for (int i11 = 0; i11 < this.f8198a.length; i11 += 3) {
            E(t11, t12, i11);
        }
        g1.G(this.f8212o, t11, t12);
        if (this.f8203f) {
            g1.E(this.f8213p, t11, t12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public T newInstance() {
        return (T) this.f8210m.newInstance(this.f8202e);
    }
}
