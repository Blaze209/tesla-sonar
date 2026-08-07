package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f8072a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k1<?, ?> f8073b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k1<?, ?> f8074c = new m1();

    static <UT, UB> UB A(Object obj, int i11, List<Integer> list, y.c cVar, UB ub2, k1<UT, UB> k1Var) {
        if (cVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.isInRange(iIntValue)) {
                    ub2 = (UB) J(obj, i11, iIntValue, ub2, k1Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int iIntValue2 = num.intValue();
            if (cVar.isInRange(iIntValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) J(obj, i11, iIntValue2, ub2, k1Var);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    private static Class<?> B() {
        if (a1.f8036d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static k1<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (k1) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (a1.f8036d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends s.b<FT>> void E(o<FT> oVar, T t11, T t12) {
        s<T> sVarC = oVar.c(t12);
        if (sVarC.n()) {
            return;
        }
        oVar.d(t11).v(sVarC);
    }

    static <T> void F(k0 k0Var, T t11, T t12, long j11) {
        n1.O(t11, j11, k0Var.mergeFrom(n1.z(t11, j11), n1.z(t12, j11)));
    }

    static <T, UT, UB> void G(k1<UT, UB> k1Var, T t11, T t12) {
        k1Var.p(t11, k1Var.k(k1Var.g(t11), k1Var.g(t12)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!w.class.isAssignableFrom(cls) && !a1.f8036d && (cls2 = f8072a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB J(Object obj, int i11, int i12, UB ub2, k1<UT, UB> k1Var) {
        if (ub2 == null) {
            ub2 = k1Var.f(obj);
        }
        k1Var.e(ub2, i11, i12);
        return ub2;
    }

    public static k1<?, ?> K() {
        return f8073b;
    }

    public static k1<?, ?> L() {
        return f8074c;
    }

    public static void M(int i11, List<Boolean> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeBoolList(i11, list, z11);
    }

    public static void N(int i11, List<g> list, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeBytesList(i11, list);
    }

    public static void O(int i11, List<Double> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeDoubleList(i11, list, z11);
    }

    public static void P(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeEnumList(i11, list, z11);
    }

    public static void Q(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFixed32List(i11, list, z11);
    }

    public static void R(int i11, List<Long> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFixed64List(i11, list, z11);
    }

    public static void S(int i11, List<Float> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFloatList(i11, list, z11);
    }

    public static void T(int i11, List<?> list, q1 q1Var, e1 e1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.d(i11, list, e1Var);
    }

    public static void U(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeInt32List(i11, list, z11);
    }

    public static void V(int i11, List<Long> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeInt64List(i11, list, z11);
    }

    public static void W(int i11, List<?> list, q1 q1Var, e1 e1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.f(i11, list, e1Var);
    }

    public static void X(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSFixed32List(i11, list, z11);
    }

    public static void Y(int i11, List<Long> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSFixed64List(i11, list, z11);
    }

    public static void Z(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSInt32List(i11, list, z11);
    }

    static int a(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(size) : size * CodedOutputStream.d(i11, true);
    }

    public static void a0(int i11, List<Long> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSInt64List(i11, list, z11);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i11, List<String> list, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeStringList(i11, list);
    }

    static int c(int i11, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * CodedOutputStream.U(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU += CodedOutputStream.h(list.get(i12));
        }
        return iU;
    }

    public static void c0(int i11, List<Integer> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeUInt32List(i11, list, z11);
    }

    static int d(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iE) : iE + (size * CodedOutputStream.U(i11));
    }

    public static void d0(int i11, List<Long> list, q1 q1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeUInt64List(i11, list, z11);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iL = 0;
            while (i11 < size) {
                iL += CodedOutputStream.l(list.get(i11).intValue());
                i11++;
            }
            return iL;
        }
        x xVar = (x) list;
        int iL2 = 0;
        while (i11 < size) {
            iL2 += CodedOutputStream.l(xVar.getInt(i11));
            i11++;
        }
        return iL2;
    }

    static int f(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(size * 4) : size * CodedOutputStream.m(i11, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(size * 8) : size * CodedOutputStream.o(i11, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i11, List<p0> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iS += CodedOutputStream.s(i11, list.get(i12), e1Var);
        }
        return iS;
    }

    static int k(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iL) : iL + (size * CodedOutputStream.U(i11));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iW = 0;
            while (i11 < size) {
                iW += CodedOutputStream.w(list.get(i11).intValue());
                i11++;
            }
            return iW;
        }
        x xVar = (x) list;
        int iW2 = 0;
        while (i11 < size) {
            iW2 += CodedOutputStream.w(xVar.getInt(i11));
            i11++;
        }
        return iW2;
    }

    static int m(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iN) : iN + (list.size() * CodedOutputStream.U(i11));
    }

    static int n(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iY = 0;
            while (i11 < size) {
                iY += CodedOutputStream.y(list.get(i11).longValue());
                i11++;
            }
            return iY;
        }
        g0 g0Var = (g0) list;
        int iY2 = 0;
        while (i11 < size) {
            iY2 += CodedOutputStream.y(g0Var.getLong(i11));
            i11++;
        }
        return iY2;
    }

    static int o(int i11, Object obj, e1 e1Var) {
        return obj instanceof b0 ? CodedOutputStream.A(i11, (b0) obj) : CodedOutputStream.F(i11, (p0) obj, e1Var);
    }

    static int p(int i11, List<?> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            iU += obj instanceof b0 ? CodedOutputStream.B((b0) obj) : CodedOutputStream.H((p0) obj, e1Var);
        }
        return iU;
    }

    static int q(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iR) : iR + (size * CodedOutputStream.U(i11));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iP = 0;
            while (i11 < size) {
                iP += CodedOutputStream.P(list.get(i11).intValue());
                i11++;
            }
            return iP;
        }
        x xVar = (x) list;
        int iP2 = 0;
        while (i11 < size) {
            iP2 += CodedOutputStream.P(xVar.getInt(i11));
            i11++;
        }
        return iP2;
    }

    static int s(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iT) : iT + (size * CodedOutputStream.U(i11));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iR = 0;
            while (i11 < size) {
                iR += CodedOutputStream.R(list.get(i11).longValue());
                i11++;
            }
            return iR;
        }
        g0 g0Var = (g0) list;
        int iR2 = 0;
        while (i11 < size) {
            iR2 += CodedOutputStream.R(g0Var.getLong(i11));
            i11++;
        }
        return iR2;
    }

    static int u(int i11, List<?> list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i11) * size;
        if (!(list instanceof c0)) {
            while (i12 < size) {
                Object obj = list.get(i12);
                iU += obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.T((String) obj);
                i12++;
            }
            return iU;
        }
        c0 c0Var = (c0) list;
        while (i12 < size) {
            Object raw = c0Var.getRaw(i12);
            iU += raw instanceof g ? CodedOutputStream.h((g) raw) : CodedOutputStream.T((String) raw);
            i12++;
        }
        return iU;
    }

    static int v(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iW) : iW + (size * CodedOutputStream.U(i11));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iW = 0;
            while (i11 < size) {
                iW += CodedOutputStream.W(list.get(i11).intValue());
                i11++;
            }
            return iW;
        }
        x xVar = (x) list;
        int iW2 = 0;
        while (i11 < size) {
            iW2 += CodedOutputStream.W(xVar.getInt(i11));
            i11++;
        }
        return iW2;
    }

    static int x(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z11 ? CodedOutputStream.U(i11) + CodedOutputStream.C(iY) : iY + (size * CodedOutputStream.U(i11));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iY = 0;
            while (i11 < size) {
                iY += CodedOutputStream.Y(list.get(i11).longValue());
                i11++;
            }
            return iY;
        }
        g0 g0Var = (g0) list;
        int iY2 = 0;
        while (i11 < size) {
            iY2 += CodedOutputStream.Y(g0Var.getLong(i11));
            i11++;
        }
        return iY2;
    }

    static <UT, UB> UB z(Object obj, int i11, List<Integer> list, y.b<?> bVar, UB ub2, k1<UT, UB> k1Var) {
        if (bVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bVar.findValueByNumber(iIntValue) == null) {
                    ub2 = (UB) J(obj, i11, iIntValue, ub2, k1Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int iIntValue2 = num.intValue();
            if (bVar.findValueByNumber(iIntValue2) != null) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) J(obj, i11, iIntValue2, ub2, k1Var);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }
}
