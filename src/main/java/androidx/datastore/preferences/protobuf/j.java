package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class j implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f8137a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8138a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f8138a = iArr;
            try {
                iArr[p1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8138a[p1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8138a[p1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8138a[p1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8138a[p1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8138a[p1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8138a[p1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8138a[p1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8138a[p1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8138a[p1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8138a[p1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8138a[p1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) y.b(codedOutputStream, "output");
        this.f8137a = codedOutputStream2;
        codedOutputStream2.f8018a = this;
    }

    private void A(int i11, g0 g0Var, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < g0Var.size()) {
                this.f8137a.F0(i11, g0Var.getLong(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iY = 0;
        for (int i13 = 0; i13 < g0Var.size(); i13++) {
            iY += CodedOutputStream.y(g0Var.getLong(i13));
        }
        this.f8137a.X0(iY);
        while (i12 < g0Var.size()) {
            this.f8137a.G0(g0Var.getLong(i12));
            i12++;
        }
    }

    private void B(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.F0(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iY = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iY += CodedOutputStream.y(list.get(i13).longValue());
        }
        this.f8137a.X0(iY);
        while (i12 < list.size()) {
            this.f8137a.G0(list.get(i12).longValue());
            i12++;
        }
    }

    private void C(int i11, Object obj) {
        if (obj instanceof String) {
            this.f8137a.T0(i11, (String) obj);
        } else {
            this.f8137a.n0(i11, (g) obj);
        }
    }

    private void D(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.L0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iL = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iL += CodedOutputStream.L(xVar.getInt(i13));
        }
        this.f8137a.X0(iL);
        while (i12 < xVar.size()) {
            this.f8137a.M0(xVar.getInt(i12));
            i12++;
        }
    }

    private void E(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.L0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iL = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iL += CodedOutputStream.L(list.get(i13).intValue());
        }
        this.f8137a.X0(iL);
        while (i12 < list.size()) {
            this.f8137a.M0(list.get(i12).intValue());
            i12++;
        }
    }

    private void F(int i11, g0 g0Var, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < g0Var.size()) {
                this.f8137a.N0(i11, g0Var.getLong(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iN = 0;
        for (int i13 = 0; i13 < g0Var.size(); i13++) {
            iN += CodedOutputStream.N(g0Var.getLong(i13));
        }
        this.f8137a.X0(iN);
        while (i12 < g0Var.size()) {
            this.f8137a.O0(g0Var.getLong(i12));
            i12++;
        }
    }

    private void G(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.N0(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iN = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iN += CodedOutputStream.N(list.get(i13).longValue());
        }
        this.f8137a.X0(iN);
        while (i12 < list.size()) {
            this.f8137a.O0(list.get(i12).longValue());
            i12++;
        }
    }

    private void H(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.P0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iP = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iP += CodedOutputStream.P(xVar.getInt(i13));
        }
        this.f8137a.X0(iP);
        while (i12 < xVar.size()) {
            this.f8137a.Q0(xVar.getInt(i12));
            i12++;
        }
    }

    private void J(int i11, g0 g0Var, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < g0Var.size()) {
                this.f8137a.R0(i11, g0Var.getLong(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iR = 0;
        for (int i13 = 0; i13 < g0Var.size(); i13++) {
            iR += CodedOutputStream.R(g0Var.getLong(i13));
        }
        this.f8137a.X0(iR);
        while (i12 < g0Var.size()) {
            this.f8137a.S0(g0Var.getLong(i12));
            i12++;
        }
    }

    private void K(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.R0(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iR = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iR += CodedOutputStream.R(list.get(i13).longValue());
        }
        this.f8137a.X0(iR);
        while (i12 < list.size()) {
            this.f8137a.S0(list.get(i12).longValue());
            i12++;
        }
    }

    private void L(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.W0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iW += CodedOutputStream.W(xVar.getInt(i13));
        }
        this.f8137a.X0(iW);
        while (i12 < xVar.size()) {
            this.f8137a.X0(xVar.getInt(i12));
            i12++;
        }
    }

    private void N(int i11, g0 g0Var, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < g0Var.size()) {
                this.f8137a.Y0(i11, g0Var.getLong(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iY = 0;
        for (int i13 = 0; i13 < g0Var.size(); i13++) {
            iY += CodedOutputStream.Y(g0Var.getLong(i13));
        }
        this.f8137a.X0(iY);
        while (i12 < g0Var.size()) {
            this.f8137a.Z0(g0Var.getLong(i12));
            i12++;
        }
    }

    private void O(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.Y0(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iY = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iY += CodedOutputStream.Y(list.get(i13).longValue());
        }
        this.f8137a.X0(iY);
        while (i12 < list.size()) {
            this.f8137a.Z0(list.get(i12).longValue());
            i12++;
        }
    }

    public static j g(CodedOutputStream codedOutputStream) {
        j jVar = codedOutputStream.f8018a;
        return jVar != null ? jVar : new j(codedOutputStream);
    }

    private void h(int i11, e eVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < eVar.size()) {
                this.f8137a.j0(i11, eVar.getBoolean(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iE = 0;
        for (int i13 = 0; i13 < eVar.size(); i13++) {
            iE += CodedOutputStream.e(eVar.getBoolean(i13));
        }
        this.f8137a.X0(iE);
        while (i12 < eVar.size()) {
            this.f8137a.k0(eVar.getBoolean(i12));
            i12++;
        }
    }

    private void i(int i11, List<Boolean> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.j0(i11, list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iE = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iE += CodedOutputStream.e(list.get(i13).booleanValue());
        }
        this.f8137a.X0(iE);
        while (i12 < list.size()) {
            this.f8137a.k0(list.get(i12).booleanValue());
            i12++;
        }
    }

    private <V> void j(int i11, boolean z11, V v11, i0.a<Boolean, V> aVar) {
        this.f8137a.V0(i11, 2);
        this.f8137a.X0(i0.b(aVar, Boolean.valueOf(z11), v11));
        i0.e(this.f8137a, aVar, Boolean.valueOf(z11), v11);
    }

    private <V> void k(int i11, i0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = it.next().intValue();
            i12++;
        }
        Arrays.sort(iArr);
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            V v11 = map.get(Integer.valueOf(i14));
            this.f8137a.V0(i11, 2);
            this.f8137a.X0(i0.b(aVar, Integer.valueOf(i14), v11));
            i0.e(this.f8137a, aVar, Integer.valueOf(i14), v11);
        }
    }

    private <V> void l(int i11, i0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        Arrays.sort(jArr);
        for (int i13 = 0; i13 < size; i13++) {
            long j11 = jArr[i13];
            V v11 = map.get(Long.valueOf(j11));
            this.f8137a.V0(i11, 2);
            this.f8137a.X0(i0.b(aVar, Long.valueOf(j11), v11));
            i0.e(this.f8137a, aVar, Long.valueOf(j11), v11);
        }
    }

    private <K, V> void m(int i11, i0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f8138a[aVar.f8128a.ordinal()]) {
            case 1:
                V v11 = map.get(Boolean.FALSE);
                if (v11 != null) {
                    j(i11, false, v11, aVar);
                }
                V v12 = map.get(Boolean.TRUE);
                if (v12 != null) {
                    j(i11, true, v12, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k(i11, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                l(i11, aVar, map);
                return;
            case 12:
                n(i11, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f8128a);
        }
    }

    private <V> void n(int i11, i0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            strArr[i12] = it.next();
            i12++;
        }
        Arrays.sort(strArr);
        for (int i13 = 0; i13 < size; i13++) {
            String str = strArr[i13];
            V v11 = map.get(str);
            this.f8137a.V0(i11, 2);
            this.f8137a.X0(i0.b(aVar, str, v11));
            i0.e(this.f8137a, aVar, str, v11);
        }
    }

    private void o(int i11, k kVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < kVar.size()) {
                this.f8137a.p0(i11, kVar.getDouble(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < kVar.size(); i13++) {
            iJ += CodedOutputStream.j(kVar.getDouble(i13));
        }
        this.f8137a.X0(iJ);
        while (i12 < kVar.size()) {
            this.f8137a.q0(kVar.getDouble(i12));
            i12++;
        }
    }

    private void p(int i11, List<Double> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.p0(i11, list.get(i12).doubleValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iJ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iJ += CodedOutputStream.j(list.get(i13).doubleValue());
        }
        this.f8137a.X0(iJ);
        while (i12 < list.size()) {
            this.f8137a.q0(list.get(i12).doubleValue());
            i12++;
        }
    }

    private void q(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.r0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iL = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iL += CodedOutputStream.l(xVar.getInt(i13));
        }
        this.f8137a.X0(iL);
        while (i12 < xVar.size()) {
            this.f8137a.s0(xVar.getInt(i12));
            i12++;
        }
    }

    private void r(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.r0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iL = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iL += CodedOutputStream.l(list.get(i13).intValue());
        }
        this.f8137a.X0(iL);
        while (i12 < list.size()) {
            this.f8137a.s0(list.get(i12).intValue());
            i12++;
        }
    }

    private void s(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.t0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iN = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iN += CodedOutputStream.n(xVar.getInt(i13));
        }
        this.f8137a.X0(iN);
        while (i12 < xVar.size()) {
            this.f8137a.u0(xVar.getInt(i12));
            i12++;
        }
    }

    private void t(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.t0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iN = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iN += CodedOutputStream.n(list.get(i13).intValue());
        }
        this.f8137a.X0(iN);
        while (i12 < list.size()) {
            this.f8137a.u0(list.get(i12).intValue());
            i12++;
        }
    }

    private void u(int i11, g0 g0Var, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < g0Var.size()) {
                this.f8137a.v0(i11, g0Var.getLong(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iP = 0;
        for (int i13 = 0; i13 < g0Var.size(); i13++) {
            iP += CodedOutputStream.p(g0Var.getLong(i13));
        }
        this.f8137a.X0(iP);
        while (i12 < g0Var.size()) {
            this.f8137a.w0(g0Var.getLong(i12));
            i12++;
        }
    }

    private void v(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.v0(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iP = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iP += CodedOutputStream.p(list.get(i13).longValue());
        }
        this.f8137a.X0(iP);
        while (i12 < list.size()) {
            this.f8137a.w0(list.get(i12).longValue());
            i12++;
        }
    }

    private void w(int i11, u uVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < uVar.size()) {
                this.f8137a.x0(i11, uVar.getFloat(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iR = 0;
        for (int i13 = 0; i13 < uVar.size(); i13++) {
            iR += CodedOutputStream.r(uVar.getFloat(i13));
        }
        this.f8137a.X0(iR);
        while (i12 < uVar.size()) {
            this.f8137a.y0(uVar.getFloat(i12));
            i12++;
        }
    }

    private void x(int i11, List<Float> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.x0(i11, list.get(i12).floatValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iR = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iR += CodedOutputStream.r(list.get(i13).floatValue());
        }
        this.f8137a.X0(iR);
        while (i12 < list.size()) {
            this.f8137a.y0(list.get(i12).floatValue());
            i12++;
        }
    }

    private void y(int i11, x xVar, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < xVar.size()) {
                this.f8137a.D0(i11, xVar.getInt(i12));
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < xVar.size(); i13++) {
            iW += CodedOutputStream.w(xVar.getInt(i13));
        }
        this.f8137a.X0(iW);
        while (i12 < xVar.size()) {
            this.f8137a.E0(xVar.getInt(i12));
            i12++;
        }
    }

    private void z(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.D0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += CodedOutputStream.w(list.get(i13).intValue());
        }
        this.f8137a.X0(iW);
        while (i12 < list.size()) {
            this.f8137a.E0(list.get(i12).intValue());
            i12++;
        }
    }

    public void I(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.P0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iP = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iP += CodedOutputStream.P(list.get(i13).intValue());
        }
        this.f8137a.X0(iP);
        while (i12 < list.size()) {
            this.f8137a.Q0(list.get(i12).intValue());
            i12++;
        }
    }

    public void M(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.f8137a.W0(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.f8137a.V0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += CodedOutputStream.W(list.get(i13).intValue());
        }
        this.f8137a.X0(iW);
        while (i12 < list.size()) {
            this.f8137a.X0(list.get(i12).intValue());
            i12++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void a(int i11, g gVar) {
        this.f8137a.n0(i11, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void b(int i11, Object obj, e1 e1Var) {
        this.f8137a.H0(i11, (p0) obj, e1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public <K, V> void c(int i11, i0.a<K, V> aVar, Map<K, V> map) {
        if (this.f8137a.d0()) {
            m(i11, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f8137a.V0(i11, 2);
            this.f8137a.X0(i0.b(aVar, entry.getKey(), entry.getValue()));
            i0.e(this.f8137a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void d(int i11, List<?> list, e1 e1Var) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            e(i11, list.get(i12), e1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void e(int i11, Object obj, e1 e1Var) {
        this.f8137a.A0(i11, (p0) obj, e1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void f(int i11, List<?> list, e1 e1Var) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            b(i11, list.get(i12), e1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public q1.a fieldOrder() {
        return q1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBool(int i11, boolean z11) {
        this.f8137a.j0(i11, z11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBoolList(int i11, List<Boolean> list, boolean z11) {
        if (list instanceof e) {
            h(i11, (e) list, z11);
        } else {
            i(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBytesList(int i11, List<g> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f8137a.n0(i11, list.get(i12));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeDouble(int i11, double d11) {
        this.f8137a.p0(i11, d11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeDoubleList(int i11, List<Double> list, boolean z11) {
        if (list instanceof k) {
            o(i11, (k) list, z11);
        } else {
            p(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    @Deprecated
    public void writeEndGroup(int i11) {
        this.f8137a.V0(i11, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeEnum(int i11, int i12) {
        this.f8137a.r0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeEnumList(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            q(i11, (x) list, z11);
        } else {
            r(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed32(int i11, int i12) {
        this.f8137a.t0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            s(i11, (x) list, z11);
        } else {
            t(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed64(int i11, long j11) {
        this.f8137a.v0(i11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof g0) {
            u(i11, (g0) list, z11);
        } else {
            v(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFloat(int i11, float f11) {
        this.f8137a.x0(i11, f11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFloatList(int i11, List<Float> list, boolean z11) {
        if (list instanceof u) {
            w(i11, (u) list, z11);
        } else {
            x(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt32(int i11, int i12) {
        this.f8137a.D0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            y(i11, (x) list, z11);
        } else {
            z(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt64(int i11, long j11) {
        this.f8137a.F0(i11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof g0) {
            A(i11, (g0) list, z11);
        } else {
            B(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void writeMessageSetItem(int i11, Object obj) {
        if (obj instanceof g) {
            this.f8137a.K0(i11, (g) obj);
        } else {
            this.f8137a.J0(i11, (p0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed32(int i11, int i12) {
        this.f8137a.L0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            D(i11, (x) list, z11);
        } else {
            E(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed64(int i11, long j11) {
        this.f8137a.N0(i11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof g0) {
            F(i11, (g0) list, z11);
        } else {
            G(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt32(int i11, int i12) {
        this.f8137a.P0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            H(i11, (x) list, z11);
        } else {
            I(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt64(int i11, long j11) {
        this.f8137a.R0(i11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof g0) {
            J(i11, (g0) list, z11);
        } else {
            K(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    @Deprecated
    public void writeStartGroup(int i11) {
        this.f8137a.V0(i11, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeString(int i11, String str) {
        this.f8137a.T0(i11, str);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeStringList(int i11, List<String> list) {
        int i12 = 0;
        if (!(list instanceof c0)) {
            while (i12 < list.size()) {
                this.f8137a.T0(i11, list.get(i12));
                i12++;
            }
        } else {
            c0 c0Var = (c0) list;
            while (i12 < list.size()) {
                C(i11, c0Var.getRaw(i12));
                i12++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt32(int i11, int i12) {
        this.f8137a.W0(i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof x) {
            L(i11, (x) list, z11);
        } else {
            M(i11, list, z11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt64(int i11, long j11) {
        this.f8137a.Y0(i11, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof g0) {
            N(i11, (g0) list, z11);
        } else {
            O(i11, list, z11);
        }
    }
}
