package qs;

import com.google.android.exoplayer2.f2;
import com.google.common.collect.k0;
import com.google.common.collect.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ss.d f105931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f105932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f105933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f105934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f105935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f105936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f105937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f105938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.common.collect.x<C2253a> f105939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ts.d f105940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f105941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f105942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f105943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f105944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f105945v;

    /* JADX INFO: renamed from: qs.a$a, reason: collision with other inner class name */
    public static final class C2253a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f105946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f105947b;

        public C2253a(long j11, long j12) {
            this.f105946a = j11;
            this.f105947b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2253a)) {
                return false;
            }
            C2253a c2253a = (C2253a) obj;
            return this.f105946a == c2253a.f105946a && this.f105947b == c2253a.f105947b;
        }

        public int hashCode() {
            return (((int) this.f105946a) * 31) + ((int) this.f105947b);
        }
    }

    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f105948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f105949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f105950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f105951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f105952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f105953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f105954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ts.d f105955h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // qs.r.b
        public final r[] a(r.a[] aVarArr, ss.d dVar, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var) {
            ss.d dVar2;
            r rVarB;
            com.google.common.collect.x xVarN = a.n(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            int i11 = 0;
            while (i11 < aVarArr.length) {
                r.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f106072b;
                    if (iArr.length == 0) {
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            rVarB = new s(aVar.f106071a, iArr[0], aVar.f106073c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            rVarB = b(aVar.f106071a, iArr, aVar.f106073c, dVar2, (com.google.common.collect.x) xVarN.get(i11));
                        }
                        rVarArr[i11] = rVarB;
                    }
                } else {
                    dVar2 = dVar;
                }
                i11++;
                dVar = dVar2;
            }
            return rVarArr;
        }

        protected a b(es.u uVar, int[] iArr, int i11, ss.d dVar, com.google.common.collect.x<C2253a> xVar) {
            return new a(uVar, iArr, i11, dVar, this.f105948a, this.f105949b, this.f105950c, this.f105951d, this.f105952e, this.f105953f, this.f105954g, xVar, this.f105955h);
        }

        public b(int i11, int i12, int i13, float f11) {
            this(i11, i12, i13, 1279, 719, f11, 0.75f, ts.d.f114979a);
        }

        public b(int i11, int i12, int i13, int i14, int i15, float f11, float f12, ts.d dVar) {
            this.f105948a = i11;
            this.f105949b = i12;
            this.f105950c = i13;
            this.f105951d = i14;
            this.f105952e = i15;
            this.f105953f = f11;
            this.f105954g = f12;
            this.f105955h = dVar;
        }
    }

    protected a(es.u uVar, int[] iArr, int i11, ss.d dVar, long j11, long j12, long j13, int i12, int i13, float f11, float f12, List<C2253a> list, ts.d dVar2) {
        long j14;
        super(uVar, iArr, i11);
        if (j13 < j11) {
            ts.u.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j14 = j11;
        } else {
            j14 = j13;
        }
        this.f105931h = dVar;
        this.f105932i = j11 * 1000;
        this.f105933j = j12 * 1000;
        this.f105934k = j14 * 1000;
        this.f105935l = i12;
        this.f105936m = i13;
        this.f105937n = f11;
        this.f105938o = f12;
        this.f105939p = com.google.common.collect.x.n(list);
        this.f105940q = dVar2;
        this.f105941r = 1.0f;
        this.f105943t = 0;
        this.f105944u = -9223372036854775807L;
        this.f105945v = Long.MIN_VALUE;
    }

    private static void m(List<com.google.common.collect.x.a<C2253a>> list, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.common.collect.x.a<C2253a> aVar = list.get(i11);
            if (aVar != null) {
                aVar.a(new C2253a(j11, jArr[i11]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.x<com.google.common.collect.x<C2253a>> n(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f106072b.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
                aVarK.a(new C2253a(0L, 0L));
                arrayList.add(aVarK);
            }
        }
        long[][] jArrO = o(aVarArr);
        int[] iArr = new int[jArrO.length];
        long[] jArr = new long[jArrO.length];
        for (int i11 = 0; i11 < jArrO.length; i11++) {
            long[] jArr2 = jArrO[i11];
            jArr[i11] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m(arrayList, jArr);
        com.google.common.collect.x<Integer> xVarP = p(jArrO);
        for (int i12 = 0; i12 < xVarP.size(); i12++) {
            int iIntValue = xVarP.get(i12).intValue();
            int i13 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i13;
            jArr[iIntValue] = jArrO[iIntValue][i13];
            m(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        m(arrayList, jArr);
        com.google.common.collect.x.a aVarK2 = com.google.common.collect.x.k();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            com.google.common.collect.x.a aVar2 = (com.google.common.collect.x.a) arrayList.get(i15);
            aVarK2.a(aVar2 == null ? com.google.common.collect.x.r() : aVar2.k());
        }
        return aVarK2.k();
    }

    private static long[][] o(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            r.a aVar = aVarArr[i11];
            if (aVar == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[aVar.f106072b.length];
                int i12 = 0;
                while (true) {
                    int[] iArr = aVar.f106072b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    long j11 = aVar.f106071a.c(iArr[i12]).f40708h;
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

    private static com.google.common.collect.x<Integer> p(long[][] jArr) {
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

    @Override // qs.r
    public int a() {
        return this.f105942s;
    }

    @Override // qs.c, qs.r
    public void enable() {
        this.f105944u = -9223372036854775807L;
    }

    @Override // qs.c, qs.r
    public void i(float f11) {
        this.f105941r = f11;
    }

    @Override // qs.c, qs.r
    public void disable() {
    }
}
