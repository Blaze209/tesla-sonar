package xz;

import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes6.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final g f124085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f124086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f124088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f124089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a[] f124090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f124092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f124093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f124094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a[] f124096l;

    a0(g gVar) {
        this.f124085a = gVar;
        this.f124086b = null;
        this.f124090f = new a[256];
        this.f124091g = 1;
        this.f124092h = new d();
    }

    private void A(int i11, String str, String str2) {
        a(new a(i11, 12, str, str2, Y(12, str, str2)));
    }

    private void E(int i11, String str) {
        a(new a(i11, 1, str, W(1, str)));
    }

    private z F(int i11, String str) {
        int iW = W(i11, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == i11 && aVarN.f124097h == iW && aVarN.f124305e.equals(str)) {
                return aVarN;
            }
        }
        this.f124092h.e(i11, D(str));
        int i12 = this.f124091g;
        this.f124091g = i12 + 1;
        return c0(new a(i12, i11, str, iW));
    }

    private void G(int i11, int i12, String str) {
        a(new a(i11, i12, str, W(i12, str)));
    }

    private int J(a aVar) {
        if (this.f124096l == null) {
            this.f124096l = new a[16];
        }
        int i11 = this.f124095k;
        a[] aVarArr = this.f124096l;
        if (i11 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f124096l = aVarArr2;
        }
        a[] aVarArr3 = this.f124096l;
        int i12 = this.f124095k;
        this.f124095k = i12 + 1;
        aVarArr3[i12] = aVar;
        return c0(aVar).f124301a;
    }

    private void M(e eVar, char[] cArr) {
        byte[] bArr = eVar.f124130c;
        int iE = eVar.e();
        for (int I = eVar.I(iE - 2); I > 0; I--) {
            if ("BootstrapMethods".equals(eVar.H(iE, cArr))) {
                this.f124093i = eVar.I(iE + 6);
                break;
            }
            iE += eVar.t(iE + 2) + 6;
        }
        if (this.f124093i > 0) {
            int i11 = iE + 8;
            int iT = eVar.t(iE + 2) - 2;
            d dVar = new d(iT);
            this.f124094j = dVar;
            dVar.h(bArr, i11, iT);
            int i12 = i11;
            for (int i13 = 0; i13 < this.f124093i; i13++) {
                int i14 = i12 - i11;
                int I2 = eVar.I(i12);
                int I3 = eVar.I(i12 + 2);
                i12 += 4;
                int iHashCode = eVar.o(I2, cArr).hashCode();
                while (true) {
                    int i15 = I3 - 1;
                    if (I3 > 0) {
                        int I4 = eVar.I(i12);
                        i12 += 2;
                        iHashCode ^= eVar.o(I4, cArr).hashCode();
                        I3 = i15;
                    }
                }
                a(new a(i13, 64, i14, iHashCode & Integer.MAX_VALUE));
            }
        }
    }

    private a N(int i11) {
        a[] aVarArr = this.f124090f;
        return aVarArr[i11 % aVarArr.length];
    }

    private static int U(int i11, int i12) {
        return (i11 + i12) & Integer.MAX_VALUE;
    }

    private static int V(int i11, long j11) {
        return (i11 + ((int) j11) + ((int) (j11 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int W(int i11, String str) {
        return (i11 + str.hashCode()) & Integer.MAX_VALUE;
    }

    private static int X(int i11, String str, int i12) {
        return (i11 + str.hashCode() + i12) & Integer.MAX_VALUE;
    }

    private static int Y(int i11, String str, String str2) {
        return (i11 + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    private static int Z(int i11, String str, String str2, int i12) {
        return (i11 + (str.hashCode() * str2.hashCode() * (i12 + 1))) & Integer.MAX_VALUE;
    }

    private void a(a aVar) {
        this.f124089e++;
        int i11 = aVar.f124097h;
        a[] aVarArr = this.f124090f;
        int length = i11 % aVarArr.length;
        aVar.f124098i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    private static int a0(int i11, String str, String str2, String str3) {
        return (i11 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    private z b(int i11, int i12, int i13) {
        byte[] bArr = this.f124094j.f124126a;
        for (a aVarN = N(i13); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 64 && aVarN.f124097h == i13) {
                int i14 = (int) aVarN.f124306f;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        this.f124094j.f124127b = i11;
                        return aVarN;
                    }
                    if (bArr[i11 + i15] != bArr[i14 + i15]) {
                        break;
                    }
                    i15++;
                }
            }
        }
        int i16 = this.f124093i;
        this.f124093i = i16 + 1;
        return c0(new a(i16, 64, i11, i13));
    }

    private static int b0(int i11, String str, String str2, String str3, int i12) {
        return (i11 + (str.hashCode() * str2.hashCode() * str3.hashCode() * i12)) & Integer.MAX_VALUE;
    }

    private a c0(a aVar) {
        int i11 = this.f124089e;
        a[] aVarArr = this.f124090f;
        if (i11 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i12 = (length * 2) + 1;
            a[] aVarArr2 = new a[i12];
            for (int i13 = length - 1; i13 >= 0; i13--) {
                a aVar2 = this.f124090f[i13];
                while (aVar2 != null) {
                    int i14 = aVar2.f124097h % i12;
                    a aVar3 = aVar2.f124098i;
                    aVar2.f124098i = aVarArr2[i14];
                    aVarArr2[i14] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f124090f = aVarArr2;
        }
        this.f124089e++;
        int i15 = aVar.f124097h;
        a[] aVarArr3 = this.f124090f;
        int length2 = i15 % aVarArr3.length;
        aVar.f124098i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    private z h(int i11, String str, String str2, int i12) {
        int iZ = Z(i11, str, str2, i12);
        for (a aVarN = N(iZ); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == i11 && aVarN.f124097h == iZ && aVarN.f124306f == i12 && aVarN.f124304d.equals(str) && aVarN.f124305e.equals(str2)) {
                return aVarN;
            }
        }
        this.f124092h.f(i11, i12, z(str, str2));
        int i13 = this.f124091g;
        this.f124091g = i13 + 1;
        return c0(new a(i13, i11, null, str, str2, i12, iZ));
    }

    private void i(int i11, int i12, String str, String str2, int i13) {
        a(new a(i12, i11, null, str, str2, i13, Z(i11, str, str2, i13)));
    }

    private z m(int i11, int i12) {
        int iU = U(i11, i12);
        for (a aVarN = N(iU); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == i11 && aVarN.f124097h == iU && aVarN.f124306f == i12) {
                return aVarN;
            }
        }
        this.f124092h.g(i11).i(i12);
        int i13 = this.f124091g;
        this.f124091g = i13 + 1;
        return c0(new a(i13, i11, i12, iU));
    }

    private void n(int i11, int i12, int i13) {
        a(new a(i11, i12, i13, U(i12, i13)));
    }

    private z q(int i11, long j11) {
        int iV = V(i11, j11);
        for (a aVarN = N(iV); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == i11 && aVarN.f124097h == iV && aVarN.f124306f == j11) {
                return aVarN;
            }
        }
        int i12 = this.f124091g;
        this.f124092h.g(i11).j(j11);
        this.f124091g += 2;
        return c0(new a(i12, i11, j11, iV));
    }

    private void r(int i11, int i12, long j11) {
        a(new a(i11, i12, j11, V(i12, j11)));
    }

    private a s(int i11, String str, String str2, String str3) {
        int iA0 = a0(i11, str, str2, str3);
        for (a aVarN = N(iA0); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == i11 && aVarN.f124097h == iA0 && aVarN.f124303c.equals(str) && aVarN.f124304d.equals(str2) && aVarN.f124305e.equals(str3)) {
                return aVarN;
            }
        }
        this.f124092h.f(i11, e(str).f124301a, z(str2, str3));
        int i12 = this.f124091g;
        this.f124091g = i12 + 1;
        return c0(new a(i12, i11, str, str2, str3, 0L, iA0));
    }

    private void t(int i11, int i12, String str, String str2, String str3) {
        a(new a(i11, i12, str, str2, str3, 0L, a0(i12, str, str2, str3)));
    }

    private void v(int i11, int i12, String str, String str2, String str3) {
        a(new a(i11, 15, str, str2, str3, i12, b0(15, str, str2, str3, i12)));
    }

    z B(String str) {
        return F(20, str);
    }

    z C(String str) {
        return F(8, str);
    }

    int D(String str) {
        int iW = W(1, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 1 && aVarN.f124097h == iW && aVarN.f124305e.equals(str)) {
                return aVarN.f124301a;
            }
        }
        this.f124092h.g(1).l(str);
        int i11 = this.f124091g;
        this.f124091g = i11 + 1;
        return c0(new a(i11, 1, str, iW)).f124301a;
    }

    int H(int i11, int i12) {
        long j11;
        long j12;
        if (i11 < i12) {
            j11 = i11;
            j12 = i12;
        } else {
            j11 = i12;
            j12 = i11;
        }
        long j13 = j11 | (j12 << 32);
        int iU = U(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, i11 + i12);
        for (a aVarN = N(iU); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 130 && aVarN.f124097h == iU && aVarN.f124306f == j13) {
                return aVarN.f124307g;
            }
        }
        a[] aVarArr = this.f124096l;
        int I = I(this.f124085a.r(aVarArr[i11].f124305e, aVarArr[i12].f124305e));
        c0(new a(this.f124095k, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, j13, iU)).f124307g = I;
        return I;
    }

    int I(String str) {
        int iW = W(128, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 128 && aVarN.f124097h == iW && aVarN.f124305e.equals(str)) {
                return aVarN.f124301a;
            }
        }
        return J(new a(this.f124095k, 128, str, iW));
    }

    int K(String str, int i11) {
        int iX = X(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, str, i11);
        for (a aVarN = N(iX); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 129 && aVarN.f124097h == iX && aVarN.f124306f == i11 && aVarN.f124305e.equals(str)) {
                return aVarN.f124301a;
            }
        }
        return J(new a(this.f124095k, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, str, i11, iX));
    }

    int L() {
        if (this.f124094j == null) {
            return 0;
        }
        D("BootstrapMethods");
        return this.f124094j.f124127b + 8;
    }

    String O() {
        return this.f124088d;
    }

    int P() {
        return this.f124091g;
    }

    int Q() {
        return this.f124092h.f124127b;
    }

    int R() {
        return this.f124087c;
    }

    e S() {
        return this.f124086b;
    }

    z T(int i11) {
        return this.f124096l[i11];
    }

    z c(p pVar, Object... objArr) {
        d dVar = this.f124094j;
        if (dVar == null) {
            dVar = new d();
            this.f124094j = dVar;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = d(objArr[i11]).f124301a;
        }
        int i12 = dVar.f124127b;
        dVar.k(u(pVar.d(), pVar.c(), pVar.b(), pVar.a(), pVar.e()).f124301a);
        dVar.k(length);
        for (int i13 = 0; i13 < length; i13++) {
            dVar.k(iArr[i13]);
        }
        int i14 = dVar.f124127b - i12;
        int iHashCode = pVar.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        return b(i12, i14, iHashCode & Integer.MAX_VALUE);
    }

    z d(Object obj) {
        if (obj instanceof Integer) {
            return l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C((String) obj);
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int iL = b0Var.l();
            if (iL == 10) {
                return e(b0Var.f());
            }
            return iL == 11 ? w(b0Var.d()) : e(b0Var.d());
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return u(pVar.d(), pVar.c(), pVar.b(), pVar.a(), pVar.e());
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return g(hVar.d(), hVar.c(), hVar.a(), hVar.b());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    void d0(d dVar) {
        if (this.f124094j != null) {
            d dVarK = dVar.k(D("BootstrapMethods")).i(this.f124094j.f124127b + 2).k(this.f124093i);
            d dVar2 = this.f124094j;
            dVarK.h(dVar2.f124126a, 0, dVar2.f124127b);
        }
    }

    z e(String str) {
        return F(7, str);
    }

    void e0(d dVar) {
        d dVarK = dVar.k(this.f124091g);
        d dVar2 = this.f124092h;
        dVarK.h(dVar2.f124126a, 0, dVar2.f124127b);
    }

    z f(double d11) {
        return q(6, Double.doubleToRawLongBits(d11));
    }

    int f0(int i11, String str) {
        this.f124087c = i11;
        this.f124088d = str;
        return e(str).f124301a;
    }

    z g(String str, String str2, p pVar, Object... objArr) {
        return h(17, str, str2, c(pVar, objArr).f124301a);
    }

    z j(String str, String str2, String str3) {
        return s(9, str, str2, str3);
    }

    z k(float f11) {
        return m(4, Float.floatToRawIntBits(f11));
    }

    z l(int i11) {
        return m(3, i11);
    }

    z o(String str, String str2, p pVar, Object... objArr) {
        return h(18, str, str2, c(pVar, objArr).f124301a);
    }

    z p(long j11) {
        return q(5, j11);
    }

    z u(int i11, String str, String str2, String str3, boolean z11) {
        int iB0 = b0(15, str, str2, str3, i11);
        for (a aVarN = N(iB0); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 15 && aVarN.f124097h == iB0 && aVarN.f124306f == i11 && aVarN.f124303c.equals(str) && aVarN.f124304d.equals(str2) && aVarN.f124305e.equals(str3)) {
                return aVarN;
            }
        }
        if (i11 <= 4) {
            this.f124092h.d(15, i11, j(str, str2, str3).f124301a);
        } else {
            this.f124092h.d(15, i11, x(str, str2, str3, z11).f124301a);
        }
        int i12 = this.f124091g;
        this.f124091g = i12 + 1;
        return c0(new a(i12, 15, str, str2, str3, i11, iB0));
    }

    z w(String str) {
        return F(16, str);
    }

    z x(String str, String str2, String str3, boolean z11) {
        return s(z11 ? 11 : 10, str, str2, str3);
    }

    z y(String str) {
        return F(19, str);
    }

    int z(String str, String str2) {
        int iY = Y(12, str, str2);
        for (a aVarN = N(iY); aVarN != null; aVarN = aVarN.f124098i) {
            if (aVarN.f124302b == 12 && aVarN.f124097h == iY && aVarN.f124304d.equals(str) && aVarN.f124305e.equals(str2)) {
                return aVarN.f124301a;
            }
        }
        this.f124092h.f(12, D(str), D(str2));
        int i11 = this.f124091g;
        this.f124091g = i11 + 1;
        return c0(new a(i11, 12, str, str2, iY)).f124301a;
    }

    private static class a extends z {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f124097h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        a f124098i;

        a(int i11, int i12, String str, String str2, String str3, long j11, int i13) {
            super(i11, i12, str, str2, str3, j11);
            this.f124097h = i13;
        }

        a(int i11, int i12, String str, int i13) {
            super(i11, i12, null, null, str, 0L);
            this.f124097h = i13;
        }

        a(int i11, int i12, String str, long j11, int i13) {
            super(i11, i12, null, null, str, j11);
            this.f124097h = i13;
        }

        a(int i11, int i12, String str, String str2, int i13) {
            super(i11, i12, null, str, str2, 0L);
            this.f124097h = i13;
        }

        a(int i11, int i12, long j11, int i13) {
            super(i11, i12, null, null, null, j11);
            this.f124097h = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:24:0x0103  */
    a0(g gVar, e eVar) {
        byte b11;
        int i11;
        a0 a0Var;
        int i12;
        this.f124085a = gVar;
        this.f124086b = eVar;
        byte[] bArr = eVar.f124130c;
        int iF = eVar.f(1) - 1;
        int i13 = eVar.f124129b - iF;
        this.f124091g = eVar.g();
        d dVar = new d(i13);
        this.f124092h = dVar;
        dVar.h(bArr, iF, i13);
        this.f124090f = new a[this.f124091g * 2];
        char[] cArr = new char[eVar.h()];
        boolean z11 = false;
        int i14 = 1;
        while (i14 < this.f124091g) {
            int iF2 = eVar.f(i14);
            byte b12 = bArr[iF2 - 1];
            switch (b12) {
                case 1:
                    b11 = b12;
                    i11 = i14;
                    E(i11, eVar.K(i11, cArr));
                    if (b11 != 5 || b11 == 6) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    i14 = i12 + i11;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    b11 = b12;
                    i11 = i14;
                    n(i11, b11, eVar.t(iF2));
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 5:
                case 6:
                    b11 = b12;
                    i11 = i14;
                    r(i11, b11, eVar.v(iF2));
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    b11 = b12;
                    i11 = i14;
                    G(i11, b11, eVar.H(iF2, cArr));
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 9:
                case 10:
                case 11:
                    b11 = b12;
                    int iF3 = eVar.f(eVar.I(iF2 + 2));
                    a0Var = this;
                    i14 = i14;
                    a0Var.t(i14, b11, eVar.m(iF2, cArr), eVar.H(iF3, cArr), eVar.H(iF3 + 2, cArr));
                    i11 = i14;
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 12:
                    b11 = b12;
                    i11 = i14;
                    A(i11, eVar.H(iF2, cArr), eVar.H(iF2 + 2, cArr));
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 15:
                    b11 = b12;
                    int iF4 = eVar.f(eVar.I(iF2 + 1));
                    int iF5 = eVar.f(eVar.I(iF4 + 2));
                    a0Var = this;
                    a0Var.v(i14, eVar.l(iF2), eVar.m(iF4, cArr), eVar.H(iF5, cArr), eVar.H(iF5 + 2, cArr));
                    i11 = i14;
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
                case 17:
                case 18:
                    int iF6 = eVar.f(eVar.I(iF2 + 2));
                    i11 = i14;
                    i(b12, i11, eVar.H(iF6, cArr), eVar.H(iF6 + 2, cArr), eVar.I(iF2));
                    z11 = true;
                    b11 = b12;
                    if (b11 != 5) {
                        i12 = 2;
                    } else {
                        i12 = 2;
                    }
                    i14 = i12 + i11;
                    break;
            }
        }
        if (z11) {
            M(eVar, cArr);
        }
    }
}
