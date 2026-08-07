package r8;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.c0;
import com.google.common.collect.k0;
import com.google.common.collect.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.r0;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s8.d f107126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f107127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f107128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f107129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f107130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f107131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f107132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f107133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.common.collect.x<C2281a> f107134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s7.j f107135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f107136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f107137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f107138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f107139v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p8.m f107140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f107141x;

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C2281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f107142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f107143b;

        public C2281a(long j11, long j12) {
            this.f107142a = j11;
            this.f107143b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2281a)) {
                return false;
            }
            C2281a c2281a = (C2281a) obj;
            return this.f107142a == c2281a.f107142a && this.f107143b == c2281a.f107143b;
        }

        public int hashCode() {
            return (((int) this.f107142a) * 31) + ((int) this.f107143b);
        }
    }

    public static class b implements t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f107144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f107146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f107147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f107150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final s7.j f107151h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r8.t.b
        public final t[] a(t.a[] aVarArr, s8.d dVar, androidx.media3.exoplayer.source.r.b bVar, r0 r0Var) {
            s8.d dVar2;
            t tVarB;
            com.google.common.collect.x xVarZ = a.z(aVarArr);
            t[] tVarArr = new t[aVarArr.length];
            int i11 = 0;
            while (i11 < aVarArr.length) {
                t.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f107270b;
                    if (iArr.length == 0) {
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            tVarB = new u(aVar.f107269a, iArr[0], aVar.f107271c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            tVarB = b(aVar.f107269a, iArr, aVar.f107271c, dVar2, (com.google.common.collect.x) xVarZ.get(i11));
                        }
                        tVarArr[i11] = tVarB;
                    }
                } else {
                    dVar2 = dVar;
                }
                i11++;
                dVar = dVar2;
            }
            return tVarArr;
        }

        protected a b(t0 t0Var, int[] iArr, int i11, s8.d dVar, com.google.common.collect.x<C2281a> xVar) {
            return new a(t0Var, iArr, i11, dVar, this.f107144a, this.f107145b, this.f107146c, this.f107147d, this.f107148e, this.f107149f, this.f107150g, xVar, this.f107151h);
        }

        public b(int i11, int i12, int i13, float f11) {
            this(i11, i12, i13, 1279, 719, f11, 0.75f, s7.j.f110429a);
        }

        public b(int i11, int i12, int i13, int i14, int i15, float f11, float f12, s7.j jVar) {
            this.f107144a = i11;
            this.f107145b = i12;
            this.f107146c = i13;
            this.f107147d = i14;
            this.f107148e = i15;
            this.f107149f = f11;
            this.f107150g = f12;
            this.f107151h = jVar;
        }
    }

    protected a(t0 t0Var, int[] iArr, int i11, s8.d dVar, long j11, long j12, long j13, int i12, int i13, float f11, float f12, List<C2281a> list, s7.j jVar) {
        long j14;
        super(t0Var, iArr, i11);
        if (j13 < j11) {
            s7.t.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j14 = j11;
        } else {
            j14 = j13;
        }
        this.f107126i = dVar;
        this.f107127j = j11 * 1000;
        this.f107128k = j12 * 1000;
        this.f107129l = j14 * 1000;
        this.f107130m = i12;
        this.f107131n = i13;
        this.f107132o = f11;
        this.f107133p = f12;
        this.f107134q = com.google.common.collect.x.n(list);
        this.f107135r = jVar;
        this.f107136s = 1.0f;
        this.f107138u = 0;
        this.f107139v = -9223372036854775807L;
        this.f107141x = -2147483647L;
    }

    private long A(long j11) {
        long jG = G(j11);
        if (this.f107134q.isEmpty()) {
            return jG;
        }
        int i11 = 1;
        while (i11 < this.f107134q.size() - 1 && this.f107134q.get(i11).f107142a < jG) {
            i11++;
        }
        C2281a c2281a = this.f107134q.get(i11 - 1);
        C2281a c2281a2 = this.f107134q.get(i11);
        long j12 = c2281a.f107142a;
        float f11 = (jG - j12) / (c2281a2.f107142a - j12);
        long j13 = c2281a.f107143b;
        return j13 + ((long) (f11 * (c2281a2.f107143b - j13)));
    }

    private long B(List<? extends p8.m> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        p8.m mVar = (p8.m) c0.d(list);
        long j11 = mVar.f101876g;
        if (j11 != -9223372036854775807L) {
            long j12 = mVar.f101877h;
            if (j12 != -9223372036854775807L) {
                return j12 - j11;
            }
        }
        return -9223372036854775807L;
    }

    private long D(p8.n[] nVarArr, List<? extends p8.m> list) {
        int i11 = this.f107137t;
        if (i11 < nVarArr.length && nVarArr[i11].next()) {
            p8.n nVar = nVarArr[this.f107137t];
            return nVar.a() - nVar.b();
        }
        for (p8.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.a() - nVar2.b();
            }
        }
        return B(list);
    }

    private static long[][] E(t.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            t.a aVar = aVarArr[i11];
            if (aVar == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[aVar.f107270b.length];
                int i12 = 0;
                while (true) {
                    int[] iArr = aVar.f107270b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    long j11 = aVar.f107269a.c(iArr[i12]).f101539j;
                    long[] jArr2 = jArr[i11];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i12] = j11;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        return jArr;
    }

    private static com.google.common.collect.x<Integer> F(long[][] jArr) {
        k0 k0VarE = l0.c().a().e();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long[] jArr2 = jArr[i11];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i12 = 0;
                while (true) {
                    long[] jArr3 = jArr[i11];
                    double dLog = 0.0d;
                    if (i12 >= jArr3.length) {
                        break;
                    }
                    long j11 = jArr3[i12];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i12] = dLog;
                    i12++;
                }
                int i13 = length - 1;
                double d11 = dArr[i13] - dArr[0];
                int i14 = 0;
                while (i14 < i13) {
                    double d12 = dArr[i14];
                    i14++;
                    k0VarE.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i14]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i11));
                }
            }
        }
        return com.google.common.collect.x.n(k0VarE.values());
    }

    private long G(long j11) {
        long jC = this.f107126i.c();
        this.f107141x = jC;
        long j12 = (long) (jC * this.f107132o);
        long jE = this.f107126i.e();
        if (jE == -9223372036854775807L || j11 == -9223372036854775807L) {
            return (long) (j12 / this.f107136s);
        }
        float f11 = j11;
        return (long) ((j12 * Math.max((f11 / this.f107136s) - jE, BitmapDescriptorFactory.HUE_RED)) / f11);
    }

    private long H(long j11, long j12) {
        if (j11 == -9223372036854775807L) {
            return this.f107127j;
        }
        if (j12 != -9223372036854775807L) {
            j11 -= j12;
        }
        return Math.min((long) (j11 * this.f107133p), this.f107127j);
    }

    private static void w(List<com.google.common.collect.x.a<C2281a>> list, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.common.collect.x.a<C2281a> aVar = list.get(i11);
            if (aVar != null) {
                aVar.a(new C2281a(j11, jArr[i11]));
            }
        }
    }

    private int y(long j11, long j12) {
        long jA = A(j12);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f107160b; i12++) {
            if (j11 == Long.MIN_VALUE || !l(i12, j11)) {
                p7.u uVarH = h(i12);
                if (x(uVarH, uVarH.f101539j, jA)) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.x<com.google.common.collect.x<C2281a>> z(t.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (t.a aVar : aVarArr) {
            if (aVar == null || aVar.f107270b.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
                aVarK.a(new C2281a(0L, 0L));
                arrayList.add(aVarK);
            }
        }
        long[][] jArrE = E(aVarArr);
        int[] iArr = new int[jArrE.length];
        long[] jArr = new long[jArrE.length];
        for (int i11 = 0; i11 < jArrE.length; i11++) {
            long[] jArr2 = jArrE[i11];
            jArr[i11] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        w(arrayList, jArr);
        com.google.common.collect.x<Integer> xVarF = F(jArrE);
        for (int i12 = 0; i12 < xVarF.size(); i12++) {
            int iIntValue = xVarF.get(i12).intValue();
            int i13 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i13;
            jArr[iIntValue] = jArrE[iIntValue][i13];
            w(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        w(arrayList, jArr);
        com.google.common.collect.x.a aVarK2 = com.google.common.collect.x.k();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            com.google.common.collect.x.a aVar2 = (com.google.common.collect.x.a) arrayList.get(i15);
            aVarK2.a(aVar2 == null ? com.google.common.collect.x.r() : aVar2.k());
        }
        return aVarK2.k();
    }

    protected long C() {
        return this.f107129l;
    }

    protected boolean I(long j11, List<? extends p8.m> list) {
        long j12 = this.f107139v;
        if (j12 == -9223372036854775807L || j11 - j12 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((p8.m) c0.d(list)).equals(this.f107140w)) ? false : true;
    }

    @Override // r8.t
    public int a() {
        return this.f107137t;
    }

    @Override // r8.c, r8.t
    public void disable() {
        this.f107140w = null;
    }

    @Override // r8.c, r8.t
    public void enable() {
        this.f107139v = -9223372036854775807L;
        this.f107140w = null;
    }

    @Override // r8.c, r8.t
    public void i(float f11) {
        this.f107136s = f11;
    }

    @Override // r8.t
    public long k() {
        return this.f107141x;
    }

    @Override // r8.t
    public void m(long j11, long j12, long j13, List<? extends p8.m> list, p8.n[] nVarArr) {
        long jElapsedRealtime = this.f107135r.elapsedRealtime();
        long jD = D(nVarArr, list);
        int i11 = this.f107138u;
        if (i11 == 0) {
            this.f107138u = 1;
            this.f107137t = y(jElapsedRealtime, jD);
            return;
        }
        int i12 = this.f107137t;
        int iS = list.isEmpty() ? -1 : s(((p8.m) c0.d(list)).f101873d);
        if (iS != -1) {
            i11 = ((p8.m) c0.d(list)).f101874e;
            i12 = iS;
        }
        int iY = y(jElapsedRealtime, jD);
        if (iY != i12 && !l(i12, jElapsedRealtime)) {
            p7.u uVarH = h(i12);
            p7.u uVarH2 = h(iY);
            long jH = H(j13, jD);
            int i13 = uVarH2.f101539j;
            int i14 = uVarH.f101539j;
            if ((i13 > i14 && j12 < jH) || (i13 < i14 && j12 >= this.f107128k)) {
                iY = i12;
            }
        }
        if (iY != i12) {
            i11 = 3;
        }
        this.f107138u = i11;
        this.f107137t = iY;
    }

    @Override // r8.c, r8.t
    public int o(long j11, List<? extends p8.m> list) {
        int i11;
        int i12;
        long jElapsedRealtime = this.f107135r.elapsedRealtime();
        if (!I(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f107139v = jElapsedRealtime;
        this.f107140w = list.isEmpty() ? null : (p8.m) c0.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jU0 = q0.u0(list.get(size - 1).f101876g - j11, this.f107136s);
        long jC = C();
        if (jU0 >= jC) {
            p7.u uVarH = h(y(jElapsedRealtime, B(list)));
            for (int i13 = 0; i13 < size; i13++) {
                p8.m mVar = list.get(i13);
                p7.u uVar = mVar.f101873d;
                if (q0.u0(mVar.f101876g - j11, this.f107136s) >= jC && uVar.f101539j < uVarH.f101539j && (i11 = uVar.f101552w) != -1 && i11 <= this.f107131n && (i12 = uVar.f101551v) != -1 && i12 <= this.f107130m && i11 < uVarH.f101552w) {
                    return i13;
                }
            }
        }
        return size;
    }

    @Override // r8.t
    public Object r() {
        return null;
    }

    @Override // r8.t
    public int t() {
        return this.f107138u;
    }

    protected boolean x(p7.u uVar, int i11, long j11) {
        return ((long) i11) <= j11;
    }
}
