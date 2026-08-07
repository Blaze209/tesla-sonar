package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l1 f8143f = new l1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f8145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8148e;

    private l1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i11) {
        int[] iArr = this.f8145b;
        if (i11 > iArr.length) {
            int i12 = this.f8144a;
            int i13 = i12 + (i12 / 2);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f8145b = Arrays.copyOf(iArr, i11);
            this.f8146c = Arrays.copyOf(this.f8146c, i11);
        }
    }

    public static l1 c() {
        return f8143f;
    }

    private static int f(int[] iArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        return i12;
    }

    private static int g(Object[] objArr, int i11) {
        int iHashCode = 17;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return iHashCode;
    }

    static l1 j(l1 l1Var, l1 l1Var2) {
        int i11 = l1Var.f8144a + l1Var2.f8144a;
        int[] iArrCopyOf = Arrays.copyOf(l1Var.f8145b, i11);
        System.arraycopy(l1Var2.f8145b, 0, iArrCopyOf, l1Var.f8144a, l1Var2.f8144a);
        Object[] objArrCopyOf = Arrays.copyOf(l1Var.f8146c, i11);
        System.arraycopy(l1Var2.f8146c, 0, objArrCopyOf, l1Var.f8144a, l1Var2.f8144a);
        return new l1(i11, iArrCopyOf, objArrCopyOf, true);
    }

    static l1 k() {
        return new l1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (!objArr[i12].equals(objArr2[i12])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i11, Object obj, q1 q1Var) {
        int iA = p1.a(i11);
        int iB = p1.b(i11);
        if (iB == 0) {
            q1Var.writeInt64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            q1Var.writeFixed64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            q1Var.a(iA, (g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            q1Var.writeFixed32(iA, ((Integer) obj).intValue());
        } else if (q1Var.fieldOrder() == q1.a.ASCENDING) {
            q1Var.writeStartGroup(iA);
            ((l1) obj).r(q1Var);
            q1Var.writeEndGroup(iA);
        } else {
            q1Var.writeEndGroup(iA);
            ((l1) obj).r(q1Var);
            q1Var.writeStartGroup(iA);
        }
    }

    void a() {
        if (!this.f8148e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iX;
        int i11 = this.f8147d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f8144a; i13++) {
            int i14 = this.f8145b[i13];
            int iA = p1.a(i14);
            int iB = p1.b(i14);
            if (iB == 0) {
                iX = CodedOutputStream.X(iA, ((Long) this.f8146c[i13]).longValue());
            } else if (iB == 1) {
                iX = CodedOutputStream.o(iA, ((Long) this.f8146c[i13]).longValue());
            } else if (iB == 2) {
                iX = CodedOutputStream.g(iA, (g) this.f8146c[i13]);
            } else if (iB == 3) {
                iX = (CodedOutputStream.U(iA) * 2) + ((l1) this.f8146c[i13]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iX = CodedOutputStream.m(iA, ((Integer) this.f8146c[i13]).intValue());
            }
            i12 += iX;
        }
        this.f8147d = i12;
        return i12;
    }

    public int e() {
        int i11 = this.f8147d;
        if (i11 != -1) {
            return i11;
        }
        int iJ = 0;
        for (int i12 = 0; i12 < this.f8144a; i12++) {
            iJ += CodedOutputStream.J(p1.a(this.f8145b[i12]), (g) this.f8146c[i12]);
        }
        this.f8147d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        int i11 = this.f8144a;
        return i11 == l1Var.f8144a && o(this.f8145b, l1Var.f8145b, i11) && l(this.f8146c, l1Var.f8146c, this.f8144a);
    }

    public void h() {
        if (this.f8148e) {
            this.f8148e = false;
        }
    }

    public int hashCode() {
        int i11 = this.f8144a;
        return ((((527 + i11) * 31) + f(this.f8145b, i11)) * 31) + g(this.f8146c, this.f8144a);
    }

    l1 i(l1 l1Var) {
        if (l1Var.equals(c())) {
            return this;
        }
        a();
        int i11 = this.f8144a + l1Var.f8144a;
        b(i11);
        System.arraycopy(l1Var.f8145b, 0, this.f8145b, this.f8144a, l1Var.f8144a);
        System.arraycopy(l1Var.f8146c, 0, this.f8146c, this.f8144a, l1Var.f8144a);
        this.f8144a = i11;
        return this;
    }

    final void m(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f8144a; i12++) {
            r0.d(sb2, i11, String.valueOf(p1.a(this.f8145b[i12])), this.f8146c[i12]);
        }
    }

    void n(int i11, Object obj) {
        a();
        b(this.f8144a + 1);
        int[] iArr = this.f8145b;
        int i12 = this.f8144a;
        iArr[i12] = i11;
        this.f8146c[i12] = obj;
        this.f8144a = i12 + 1;
    }

    void p(q1 q1Var) {
        if (q1Var.fieldOrder() == q1.a.DESCENDING) {
            for (int i11 = this.f8144a - 1; i11 >= 0; i11--) {
                q1Var.writeMessageSetItem(p1.a(this.f8145b[i11]), this.f8146c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f8144a; i12++) {
            q1Var.writeMessageSetItem(p1.a(this.f8145b[i12]), this.f8146c[i12]);
        }
    }

    public void r(q1 q1Var) {
        if (this.f8144a == 0) {
            return;
        }
        if (q1Var.fieldOrder() == q1.a.ASCENDING) {
            for (int i11 = 0; i11 < this.f8144a; i11++) {
                q(this.f8145b[i11], this.f8146c[i11], q1Var);
            }
            return;
        }
        for (int i12 = this.f8144a - 1; i12 >= 0; i12--) {
            q(this.f8145b[i12], this.f8146c[i12], q1Var);
        }
    }

    private l1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f8147d = -1;
        this.f8144a = i11;
        this.f8145b = iArr;
        this.f8146c = objArr;
        this.f8148e = z11;
    }
}
