package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class s<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s<?> f8190d = new s<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1<T, Object> f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8193c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8195b;

        static {
            int[] iArr = new int[p1.b.values().length];
            f8195b = iArr;
            try {
                iArr[p1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8195b[p1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8195b[p1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8195b[p1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8195b[p1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8195b[p1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8195b[p1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8195b[p1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8195b[p1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8195b[p1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8195b[p1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8195b[p1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8195b[p1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8195b[p1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8195b[p1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8195b[p1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8195b[p1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8195b[p1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[p1.c.values().length];
            f8194a = iArr2;
            try {
                iArr2[p1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8194a[p1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8194a[p1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8194a[p1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8194a[p1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8194a[p1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8194a[p1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8194a[p1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8194a[p1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        p0.a H0(p0.a aVar, p0 p0Var);

        p1.c getLiteJavaType();

        p1.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private s() {
        this.f8191a = h1.t();
    }

    static void A(CodedOutputStream codedOutputStream, p1.b bVar, int i11, Object obj) {
        if (bVar == p1.b.GROUP) {
            codedOutputStream.z0(i11, (p0) obj);
        } else {
            codedOutputStream.V0(i11, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, p1.b bVar, Object obj) {
        switch (a.f8195b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.q0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.y0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.w0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.u0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.B0((p0) obj);
                break;
            case 10:
                codedOutputStream.I0((p0) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    codedOutputStream.U0((String) obj);
                } else {
                    codedOutputStream.o0((g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    codedOutputStream.l0((byte[]) obj);
                } else {
                    codedOutputStream.o0((g) obj);
                }
                break;
            case 13:
                codedOutputStream.X0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.M0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.O0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Q0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof y.a)) {
                    codedOutputStream.s0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.s0(((y.a) obj).getNumber());
                }
                break;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(p1.b bVar, int i11, Object obj) {
        int iU = CodedOutputStream.U(i11);
        if (bVar == p1.b.GROUP) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    static int e(p1.b bVar, Object obj) {
        switch (a.f8195b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((p0) obj);
            case 10:
                return obj instanceof a0 ? CodedOutputStream.B((a0) obj) : CodedOutputStream.G((p0) obj);
            case 11:
                return obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.T((String) obj);
            case 12:
                return obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                return obj instanceof y.a ? CodedOutputStream.l(((y.a) obj).getNumber()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        p1.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i11 = 0;
        if (!bVar.isPacked()) {
            int iD = 0;
            while (i11 < size) {
                iD += d(liteType, number, list.get(i11));
                i11++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i11 < size) {
            iE += e(liteType, list.get(i11));
            i11++;
        }
        return CodedOutputStream.U(number) + iE + CodedOutputStream.W(iE);
    }

    public static <T extends b<T>> s<T> h() {
        return (s<T>) f8190d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != p1.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            return f(key, value);
        }
        return value instanceof a0 ? CodedOutputStream.z(entry.getKey().getNumber(), (a0) value) : CodedOutputStream.D(entry.getKey().getNumber(), (p0) value);
    }

    static int m(p1.b bVar, boolean z11) {
        if (z11) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != p1.c.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!r(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof q0) {
            return ((q0) obj).isInitialized();
        }
        if (obj instanceof a0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(p1.b bVar, Object obj) {
        y.a(obj);
        switch (a.f8194a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof y.a);
            case 9:
                return (obj instanceof p0) || (obj instanceof a0);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z11 = value instanceof a0;
        if (key.isRepeated()) {
            if (z11) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f8191a.u(key, objI);
            return;
        }
        if (key.getLiteJavaType() != p1.c.MESSAGE) {
            if (z11) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f8191a.u(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f8191a.u(key, c(value));
            if (z11) {
                this.f8193c = true;
                return;
            }
            return;
        }
        if (z11) {
            value = ((a0) value).f();
        }
        this.f8191a.u(key, key.H0(((p0) objI2).toBuilder(), (p0) value).build());
    }

    public static <T extends b<T>> s<T> x() {
        return new s<>();
    }

    private void z(T t11, Object obj) {
        if (!s(t11.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t11.getNumber()), t11.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public void a(T t11, Object obj) {
        List arrayList;
        if (!t11.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t11, obj);
        Object objI = i(t11);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f8191a.u(t11, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s<T> clone() {
        s<T> sVarX = x();
        int iN = this.f8191a.n();
        for (int i11 = 0; i11 < iN; i11++) {
            Map.Entry<K, Object> entryM = this.f8191a.m(i11);
            sVarX.y((b) entryM.getKey(), entryM.getValue());
        }
        Iterator it = this.f8191a.p().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sVarX.y((b) entry.getKey(), entry.getValue());
        }
        sVarX.f8193c = this.f8193c;
        return sVarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f8191a.equals(((s) obj).f8191a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f8193c ? new a0.c(this.f8191a.k().iterator()) : this.f8191a.k().iterator();
    }

    public int hashCode() {
        return this.f8191a.hashCode();
    }

    public Object i(T t11) {
        Object obj = this.f8191a.get(t11);
        return obj instanceof a0 ? ((a0) obj).f() : obj;
    }

    public int j() {
        int iN = this.f8191a.n();
        int iK = 0;
        for (int i11 = 0; i11 < iN; i11++) {
            iK += k(this.f8191a.m(i11));
        }
        Iterator it = this.f8191a.p().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iN = this.f8191a.n();
        int iF = 0;
        for (int i11 = 0; i11 < iN; i11++) {
            Map.Entry<K, Object> entryM = this.f8191a.m(i11);
            iF += f((b) entryM.getKey(), entryM.getValue());
        }
        Iterator it = this.f8191a.p().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f8191a.isEmpty();
    }

    public boolean o() {
        return this.f8192b;
    }

    public boolean p() {
        int iN = this.f8191a.n();
        for (int i11 = 0; i11 < iN; i11++) {
            if (!q(this.f8191a.m(i11))) {
                return false;
            }
        }
        Iterator it = this.f8191a.p().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f8193c ? new a0.c(this.f8191a.entrySet().iterator()) : this.f8191a.entrySet().iterator();
    }

    public void u() {
        if (this.f8192b) {
            return;
        }
        int iN = this.f8191a.n();
        for (int i11 = 0; i11 < iN; i11++) {
            Map.Entry<K, Object> entryM = this.f8191a.m(i11);
            if (entryM.getValue() instanceof w) {
                ((w) entryM.getValue()).A();
            }
        }
        this.f8191a.s();
        this.f8192b = true;
    }

    public void v(s<T> sVar) {
        int iN = sVar.f8191a.n();
        for (int i11 = 0; i11 < iN; i11++) {
            w(sVar.f8191a.m(i11));
        }
        Iterator it = sVar.f8191a.p().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public void y(T t11, Object obj) {
        if (!t11.isRepeated()) {
            z(t11, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t11, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof a0) {
            this.f8193c = true;
        }
        this.f8191a.u(t11, obj);
    }

    private s(boolean z11) {
        this(h1.t());
        u();
    }

    private s(h1<T, Object> h1Var) {
        this.f8191a = h1Var;
        u();
    }
}
