package q9;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.plaid.internal.EnumC4419g;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.f0;
import p7.g0;
import s7.c0;
import s7.q0;
import w8.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f104930a = q0.E0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f104931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104932b;

        public a(long j11, long j12) {
            this.f104931a = j11;
            this.f104932b = j12;
        }

        static /* synthetic */ long a(a aVar) {
            return aVar.f104932b;
        }

        static /* synthetic */ long b(a aVar) {
            return aVar.f104931a;
        }
    }

    /* JADX INFO: renamed from: q9.b$b, reason: collision with other inner class name */
    private static final class C2219b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f104936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f104937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c0 f104938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c0 f104939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f104940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f104941i;

        public C2219b(c0 c0Var, c0 c0Var2, boolean z11) throws ParserException {
            this.f104939g = c0Var;
            this.f104938f = c0Var2;
            this.f104937e = z11;
            c0Var2.b0(12);
            this.f104933a = c0Var2.Q();
            c0Var.b0(12);
            this.f104941i = c0Var.Q();
            w8.s.a(c0Var.v() == 1, "first_chunk must be 1");
            this.f104934b = -1;
        }

        public boolean a() {
            int i11 = this.f104934b + 1;
            this.f104934b = i11;
            if (i11 == this.f104933a) {
                return false;
            }
            this.f104936d = this.f104937e ? this.f104938f.T() : this.f104938f.O();
            if (this.f104934b == this.f104940h) {
                this.f104935c = this.f104939g.Q();
                this.f104939g.c0(4);
                int i12 = this.f104941i - 1;
                this.f104941i = i12;
                this.f104940h = i12 > 0 ? this.f104939g.Q() - 1 : -1;
            }
            return true;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f104942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f104943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f104944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f104945d;

        public c(String str, byte[] bArr, long j11, long j12) {
            this.f104942a = str;
            this.f104943b = bArr;
            this.f104944c = j11;
            this.f104945d = j12;
        }

        static /* synthetic */ String a(c cVar) {
            return cVar.f104942a;
        }

        static /* synthetic */ long b(c cVar) {
            return cVar.f104945d;
        }

        static /* synthetic */ long c(c cVar) {
            return cVar.f104944c;
        }

        static /* synthetic */ byte[] d(c cVar) {
            return cVar.f104943b;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f104946a;

        public d(g gVar) {
            this.f104946a = gVar;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f104947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f104949c;

        public e(long j11, long j12, String str) {
            this.f104947a = j11;
            this.f104948b = j12;
            this.f104949c = str;
        }
    }

    private interface f {
        int a();

        int b();

        int c();
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f104950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f104951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f104952c;

        public g(boolean z11, boolean z12, boolean z13) {
            this.f104950a = z11;
            this.f104951b = z12;
            this.f104952c = z13;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f104953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p7.u f104954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104956d = 0;

        public h(int i11) {
            this.f104953a = new u[i11];
        }
    }

    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f104957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f104958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0 f104959c;

        public i(t7.e.c cVar, p7.u uVar) {
            c0 c0Var = cVar.f112704b;
            this.f104959c = c0Var;
            c0Var.b0(12);
            int iQ = c0Var.Q();
            if ("audio/raw".equals(uVar.f101544o)) {
                int iT0 = q0.t0(uVar.I, uVar.G);
                if (iQ == 0 || iQ % iT0 != 0) {
                    s7.t.i("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT0 + ", stsz sample size: " + iQ);
                    iQ = iT0;
                }
            }
            this.f104957a = iQ == 0 ? -1 : iQ;
            this.f104958b = c0Var.Q();
        }

        @Override // q9.b.f
        public int a() {
            int i11 = this.f104957a;
            return i11 == -1 ? this.f104959c.Q() : i11;
        }

        @Override // q9.b.f
        public int b() {
            return this.f104958b;
        }

        @Override // q9.b.f
        public int c() {
            return this.f104957a;
        }
    }

    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f104960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f104961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f104962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f104963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f104964e;

        public j(t7.e.c cVar) {
            c0 c0Var = cVar.f112704b;
            this.f104960a = c0Var;
            c0Var.b0(12);
            this.f104962c = c0Var.Q() & 255;
            this.f104961b = c0Var.Q();
        }

        @Override // q9.b.f
        public int a() {
            int i11 = this.f104962c;
            if (i11 == 8) {
                return this.f104960a.M();
            }
            if (i11 == 16) {
                return this.f104960a.U();
            }
            int i12 = this.f104963d;
            this.f104963d = i12 + 1;
            if (i12 % 2 != 0) {
                return this.f104964e & 15;
            }
            int iM = this.f104960a.M();
            this.f104964e = iM;
            return (iM & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        }

        @Override // q9.b.f
        public int b() {
            return this.f104961b;
        }

        @Override // q9.b.f
        public int c() {
            return -1;
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f104965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f104967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f104968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f104969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f104970f;

        public k(int i11, long j11, int i12, int i13, int i14, int i15) {
            this.f104965a = i11;
            this.f104966b = j11;
            this.f104967c = i12;
            this.f104968d = i13;
            this.f104969e = i14;
            this.f104970f = i15;
        }
    }

    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f104971a;

        public l(d dVar) {
            this.f104971a = dVar;
        }

        public boolean b() {
            d dVar = this.f104971a;
            return dVar != null && dVar.f104946a.f104950a && this.f104971a.f104946a.f104951b;
        }
    }

    private static u A(c0 c0Var, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15 = i11 + 8;
        while (true) {
            byte[] bArr = null;
            if (i15 - i11 >= i12) {
                return null;
            }
            c0Var.b0(i15);
            int iV = c0Var.v();
            if (c0Var.v() == 1952804451) {
                int iQ = q(c0Var.v());
                c0Var.c0(1);
                if (iQ == 0) {
                    c0Var.c0(1);
                    i14 = 0;
                    i13 = 0;
                } else {
                    int iM = c0Var.M();
                    i13 = iM & 15;
                    i14 = (iM & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                }
                boolean z11 = c0Var.M() == 1;
                int iM2 = c0Var.M();
                byte[] bArr2 = new byte[16];
                c0Var.q(bArr2, 0, 16);
                if (z11 && iM2 == 0) {
                    int iM3 = c0Var.M();
                    bArr = new byte[iM3];
                    c0Var.q(bArr, 0, iM3);
                }
                return new u(z11, str, iM2, bArr2, i14, i13, bArr);
            }
            i15 += iV;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r22v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    public static w B(t tVar, t7.e.b bVar, b0 b0Var) throws ParserException {
        f jVar;
        boolean z11;
        int iQ;
        int iQ2;
        int iQ3;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        boolean z13;
        long[] jArr;
        int[] iArr2;
        long j11;
        long j12;
        int i15;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        ?? r11;
        int[] iArr5;
        boolean z14;
        int[] iArr6;
        int i16;
        boolean z15;
        int i17;
        t tVarA = tVar;
        t7.e.c cVarE = bVar.e(1937011578);
        if (cVarE != null) {
            jVar = new i(cVarE, tVarA.f105081g);
        } else {
            t7.e.c cVarE2 = bVar.e(1937013298);
            if (cVarE2 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            jVar = new j(cVarE2);
        }
        int iB = jVar.b();
        if (iB == 0) {
            return new w(tVarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (tVarA.f105076b == 2) {
            long j13 = tVarA.f105080f;
            if (j13 > 0) {
                tVarA = tVarA.a(tVarA.f105081g.b().f0(iB / (j13 / 1000000.0f)).P());
            }
        }
        t7.e.c cVarE3 = bVar.e(1937007471);
        if (cVarE3 == null) {
            cVarE3 = (t7.e.c) s7.a.f(bVar.e(1668232756));
            z11 = true;
        } else {
            z11 = false;
        }
        c0 c0Var = cVarE3.f112704b;
        c0 c0Var2 = ((t7.e.c) s7.a.f(bVar.e(1937011555))).f112704b;
        c0 c0Var3 = ((t7.e.c) s7.a.f(bVar.e(1937011827))).f112704b;
        t7.e.c cVarE4 = bVar.e(1937011571);
        c0 c0Var4 = cVarE4 != null ? cVarE4.f112704b : null;
        t7.e.c cVarE5 = bVar.e(1668576371);
        c0 c0Var5 = cVarE5 != null ? cVarE5.f112704b : null;
        C2219b c2219b = new C2219b(c0Var2, c0Var, z11);
        c0Var3.b0(12);
        int iQ4 = c0Var3.Q() - 1;
        int iQ5 = c0Var3.Q();
        int iQ6 = c0Var3.Q();
        if (c0Var5 != null) {
            c0Var5.b0(12);
            iQ = c0Var5.Q();
        } else {
            iQ = 0;
        }
        if (c0Var4 != null) {
            c0Var4.b0(12);
            iQ3 = c0Var4.Q();
            if (iQ3 > 0) {
                iQ2 = c0Var4.Q() - 1;
                z12 = false;
            } else {
                iQ2 = -1;
                z12 = false;
                c0Var4 = null;
            }
        } else {
            iQ2 = -1;
            iQ3 = 0;
            z12 = false;
        }
        int iC = jVar.c();
        String str = tVarA.f105081g.f101544o;
        if ((iC == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iQ4 == 0 && iQ == 0 && iQ3 == 0)) ? z12 ? 1 : 0 : true) {
            int i18 = c2219b.f104933a;
            long[] jArr3 = new long[i18];
            int[] iArr7 = new int[i18];
            while (c2219b.a()) {
                int i19 = c2219b.f104934b;
                jArr3[i19] = c2219b.f104936d;
                iArr7[i19] = c2219b.f104935c;
            }
            q9.d.b bVarA = q9.d.a(iC, jArr3, iArr7, iQ6);
            long[] jArr4 = bVarA.f104976a;
            int[] iArr8 = bVarA.f104977b;
            int i21 = bVarA.f104978c;
            long[] jArr5 = bVarA.f104979d;
            int[] iArr9 = bVarA.f104980e;
            long j14 = bVarA.f104981f;
            j12 = bVarA.f104982g;
            j11 = j14;
            i11 = 1;
            jArr = jArr5;
            iArr2 = iArr9;
            i15 = i21;
            iArr3 = iArr8;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[iB];
            int[] iArr10 = new int[iB];
            long[] jArrCopyOf = new long[iB];
            i11 = 1;
            int[] iArrCopyOf = new int[iB];
            c0 c0Var6 = c0Var5;
            f fVar = jVar;
            int iV = iQ6;
            c0 c0Var7 = c0Var4;
            long j15 = 0;
            long j16 = 0;
            int i22 = iQ;
            int iQ7 = iQ2;
            int i23 = z12 ? 1 : 0;
            int iV2 = i23;
            int i24 = iV2 == true ? 1 : 0;
            int i25 = i24;
            int iQ8 = iQ5;
            long j17 = 0;
            int i26 = iQ4;
            int i27 = iQ3;
            int i28 = i25 == true ? 1 : 0;
            while (true) {
                if (i23 >= iB) {
                    boolean z16 = iB == true ? 1 : 0;
                    i12 = i26;
                    i13 = iQ8;
                    iArr = iArr10;
                    i14 = i24;
                    break;
                }
                long j18 = j16;
                int i29 = i24;
                boolean zA = true;
                while (i29 == 0) {
                    zA = c2219b.a();
                    if (!zA) {
                        break;
                    }
                    int i31 = i26;
                    long j19 = c2219b.f104936d;
                    i29 = c2219b.f104935c;
                    j18 = j19;
                    i26 = i31;
                    iQ8 = iQ8;
                    iB = iB == true ? 1 : 0;
                }
                int i32 = iB;
                i12 = i26;
                i13 = iQ8;
                if (!zA) {
                    s7.t.i("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr6, i23);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr10, i23);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                    jArr6 = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    iB = i23;
                    i14 = i29;
                    break;
                }
                if (c0Var6 != null) {
                    int iQ9 = i25 == true ? 1 : 0;
                    while (iQ9 == 0 && i22 > 0) {
                        iQ9 = c0Var6.Q();
                        iV2 = c0Var6.v();
                        i22--;
                    }
                    i25 = iQ9 - 1;
                }
                jArr6[i23] = j18;
                int iA = fVar.a();
                iArr10[i23] = iA;
                j17 += (long) iA;
                if (iA > i28) {
                    i28 = iA;
                }
                jArrCopyOf[i23] = j15 + ((long) iV2);
                iArrCopyOf[i23] = c0Var7 == null ? 1 : z12 ? 1 : 0;
                if (i23 == iQ7) {
                    iArrCopyOf[i23] = 1;
                    i27--;
                    if (i27 > 0) {
                        iQ7 = ((c0) s7.a.f(c0Var7)).Q() - 1;
                    }
                }
                j15 += (long) iV;
                iQ8 = i13 - 1;
                if (iQ8 != 0 || i12 <= 0) {
                    i26 = i12;
                } else {
                    i26 = i12 - 1;
                    iQ8 = c0Var3.Q();
                    iV = c0Var3.v();
                }
                long j21 = j18 + ((long) iArr10[i23]);
                i24 = i29 - 1;
                i23++;
                j16 = j21;
                iB = i32 == true ? 1 : 0;
            }
            long j22 = j15 + ((long) iV2);
            if (c0Var6 == null) {
                z13 = true;
                break;
            }
            while (true) {
                if (i22 <= 0) {
                    z13 = true;
                    break;
                }
                if (c0Var6.Q() != 0) {
                    z13 = z12 ? 1 : 0;
                    break;
                }
                c0Var6.v();
                i22--;
            }
            if (i27 != 0 || i13 != 0 || i14 != 0 || i12 != 0 || i25 != 0 || !z13) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(tVarA.f105075a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i27);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i13);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i14);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i12);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i25 == true ? 1 : 0 ? 1 : 0);
                sb2.append(!z13 ? ", ctts invalid" : "");
                s7.t.i("BoxParsers", sb2.toString());
            }
            jArr = jArrCopyOf;
            iArr2 = iArrCopyOf;
            j11 = j22;
            j12 = j17;
            i15 = i28 == true ? 1 : 0;
            jArr2 = jArr6;
            iArr3 = iArr;
        }
        long j23 = tVarA.f105080f;
        if (j23 > 0) {
            long jV1 = q0.v1(j12 * 8, 1000000L, j23, RoundingMode.HALF_DOWN);
            if (jV1 > 0 && jV1 < 2147483647L) {
                tVarA = tVarA.a(tVarA.f105081g.b().S((int) jV1).P());
            }
        }
        t tVarA2 = tVarA;
        long jS1 = q0.s1(j11, 1000000L, tVarA2.f105077c);
        long[] jArr7 = tVarA2.f105083i;
        if (jArr7 == null) {
            q0.u1(jArr, 1000000L, tVarA2.f105077c);
            return new w(tVarA2, jArr2, iArr3, i15, jArr, iArr2, jS1);
        }
        int i33 = i15;
        int[] iArr11 = iArr2;
        int i34 = i11;
        if (jArr7.length == i34 && tVarA2.f105076b == i34 && jArr.length >= 2) {
            long j24 = ((long[]) s7.a.f(tVarA2.f105084j))[z12 ? 1 : 0];
            long jS2 = j24 + q0.s1(tVarA2.f105083i[z12 ? 1 : 0], tVarA2.f105077c, tVarA2.f105078d);
            if (b(jArr, j11, j24, jS2)) {
                long jS3 = q0.s1(j24 - jArr[z12 ? 1 : 0], tVarA2.f105081g.H, tVarA2.f105077c);
                long jS4 = q0.s1(j11 - jS2, tVarA2.f105081g.H, tVarA2.f105077c);
                if ((jS3 != 0 || jS4 != 0) && jS3 <= 2147483647L && jS4 <= 2147483647L) {
                    b0Var.f121224a = (int) jS3;
                    b0Var.f121225b = (int) jS4;
                    q0.u1(jArr, 1000000L, tVarA2.f105077c);
                    return new w(tVarA2, jArr2, iArr3, i33 == true ? 1 : 0, jArr, iArr11, q0.s1(tVarA2.f105083i[z12 ? 1 : 0], 1000000L, tVarA2.f105078d));
                }
            }
        }
        boolean z17 = i33 == true ? 1 : 0;
        long[] jArr8 = tVarA2.f105083i;
        if (jArr8.length == 1 && jArr8[z12 ? 1 : 0] == 0) {
            long j25 = ((long[]) s7.a.f(tVarA2.f105084j))[z12 ? 1 : 0];
            for (int i35 = z12 ? 1 : 0; i35 < jArr.length; i35++) {
                jArr[i35] = q0.s1(jArr[i35] - j25, 1000000L, tVarA2.f105077c);
            }
            return new w(tVarA2, jArr2, iArr3, z17 ? 1 : 0, jArr, iArr11, q0.s1(j11 - j25, 1000000L, tVarA2.f105077c));
        }
        boolean z18 = tVarA2.f105076b == 1 ? true : z12 ? 1 : 0;
        int[] iArr12 = new int[jArr8.length];
        int[] iArr13 = new int[jArr8.length];
        long[] jArr9 = (long[]) s7.a.f(tVarA2.f105084j);
        int i36 = z12 ? 1 : 0;
        int i37 = i36;
        int i38 = i37 == true ? 1 : 0;
        int i39 = i38;
        boolean z19 = z17;
        while (true) {
            long[] jArr10 = tVarA2.f105083i;
            iArr4 = iArr13;
            if (i36 >= jArr10.length) {
                break;
            }
            int i41 = i36;
            int i42 = i37;
            long j26 = jArr9[i41 == true ? 1 : 0];
            if (j26 != -1) {
                long jS5 = q0.s1(jArr10[i41 == true ? 1 : 0], tVarA2.f105077c, tVarA2.f105078d);
                i16 = i41 == true ? 1 : 0;
                iArr12[i16 == true ? 1 : 0] = q0.k(jArr, j26, true, true);
                long j27 = j26 + jS5;
                z15 = z12;
                iArr4[i16 == true ? 1 : 0] = q0.g(jArr, j27, z18, z15);
                int i43 = iArr12[i16 == true ? 1 : 0];
                while (true) {
                    i17 = iArr12[i16 == true ? 1 : 0];
                    if (i17 < 0 || (iArr11[i17] & 1) != 0) {
                        break;
                    }
                    iArr12[i16 == true ? 1 : 0] = i17 - 1;
                }
                if (i17 < 0) {
                    iArr12[i16 == true ? 1 : 0] = i43;
                    while (true) {
                        int i44 = iArr12[i16 == true ? 1 : 0];
                        if (i44 >= iArr4[i16 == true ? 1 : 0] || (iArr11[i44] & 1) != 0) {
                            break;
                        }
                        iArr12[i16 == true ? 1 : 0] = i44 + 1;
                    }
                }
                if (tVarA2.f105076b == 2 && iArr12[i16 == true ? 1 : 0] != iArr4[i16 == true ? 1 : 0]) {
                    while (true) {
                        int i45 = iArr4[i16 == true ? 1 : 0];
                        if (i45 >= jArr.length - 1 || jArr[i45 + 1] > j27) {
                            break;
                        }
                        iArr4[i16 == true ? 1 : 0] = i45 + 1;
                    }
                }
                int i46 = iArr4[i16 == true ? 1 : 0];
                int i47 = iArr12[i16 == true ? 1 : 0];
                i38 += i46 - i47;
                i37 = (i42 == true ? 1 : 0) | (i39 != i47 ? 1 : z15 ? 1 : 0);
                i39 = i46;
            } else {
                i16 = i41 == true ? 1 : 0;
                z15 = z12;
                i37 = i42 == true ? 1 : 0;
            }
            i36 = i16 + 1;
            z12 = z15;
            iArr3 = iArr3;
            iArr13 = iArr4;
            z19 = z19;
        }
        ?? r15 = iArr3;
        boolean z21 = z19;
        boolean z22 = z12;
        boolean z23 = (i37 == true ? 1 : 0) | (i38 != iB ? true : z22);
        long[] jArr11 = z23 != 0 ? new long[i38] : jArr2;
        if (z23 != 0) {
            iArr6 = new int[i38];
        } else {
            r11 = r15;
        }
        boolean z24 = z23 != 0 ? z22 : z21 ? 1 : 0;
        if (z23 != 0) {
            r11 = iArr6;
            r11 = iArr6;
            iArr5 = new int[i38];
        } else {
            r11 = iArr6;
            r11 = iArr6;
            iArr5 = iArr11;
        }
        long[] jArr12 = new long[i38];
        ?? r23 = z24;
        boolean z25 = z22;
        int i48 = z25 ? 1 : 0;
        long j28 = 0;
        boolean z26 = z23;
        boolean z27 = z25;
        for (?? r12 = z22; r12 < tVarA2.f105083i.length; r12++) {
            long j29 = tVarA2.f105084j[r12];
            int i49 = iArr12[r12];
            int i51 = iArr4[r12];
            boolean z28 = z26;
            if (z26 != 0) {
                int i52 = i51 - i49;
                System.arraycopy(jArr2, i49, jArr11, i48, i52);
                System.arraycopy(r15, i49, r11, i48, i52);
                System.arraycopy(iArr11, i49, iArr5, i48, i52);
            }
            ?? r13 = r23;
            boolean z29 = z27;
            while (i49 < i51) {
                long[] jArr13 = jArr11;
                int[] iArr14 = iArr12;
                long jS6 = q0.s1(j28, 1000000L, tVarA2.f105078d);
                long jS7 = q0.s1(jArr[i49] - j29, 1000000L, tVarA2.f105077c);
                if (jS7 < 0) {
                    z14 = z29;
                    z14 = true;
                }
                z14 = z29;
                jArr12[i48] = jS6 + jS7;
                if (z28 != 0 && r11[i48] > r13) {
                    r13 = r15[i49];
                }
                i48++;
                i49++;
                iArr12 = iArr14;
                jArr11 = jArr13;
                r13 = r13;
                z29 = z14;
            }
            j28 += tVarA2.f105083i[r12];
            r23 = r13;
            jArr11 = jArr11;
            z26 = z28;
            z27 = z29;
        }
        long[] jArr14 = jArr11;
        long jS8 = q0.s1(j28, 1000000L, tVarA2.f105078d);
        if (z27) {
            tVarA2 = tVarA2.a(tVarA2.f105081g.b().g0(true).P());
        }
        return new w(tVarA2, jArr14, r11, r23, jArr12, iArr5, jS8);
    }

    private static d C(c0 c0Var, int i11, int i12) throws ParserException {
        c0Var.b0(i11 + 8);
        int iG = c0Var.g();
        while (iG - i11 < i12) {
            c0Var.b0(iG);
            int iV = c0Var.v();
            w8.s.a(iV > 0, "childAtomSize must be positive");
            if (c0Var.v() == 1937011305) {
                c0Var.c0(4);
                int iM = c0Var.M();
                return new d(new g((iM & 1) == 1, (iM & 2) == 2, (iM & 8) == 8));
            }
            iG += iV;
        }
        return null;
    }

    private static h D(c0 c0Var, k kVar, String str, p7.n nVar, boolean z11) throws ParserException {
        c0Var.b0(12);
        int iV = c0Var.v();
        h hVar = new h(iV);
        for (int i11 = 0; i11 < iV; i11++) {
            int iG = c0Var.g();
            int iV2 = c0Var.v();
            w8.s.a(iV2 > 0, "childAtomSize must be positive");
            int iV3 = c0Var.v();
            if (iV3 == 1635148593 || iV3 == 1635148595 || iV3 == 1701733238 || iV3 == 1831958048 || iV3 == 1836070006 || iV3 == 1752589105 || iV3 == 1751479857 || iV3 == 1932670515 || iV3 == 1211250227 || iV3 == 1748121139 || iV3 == 1987063864 || iV3 == 1987063865 || iV3 == 1635135537 || iV3 == 1685479798 || iV3 == 1685479729 || iV3 == 1685481573 || iV3 == 1685481521 || iV3 == 1634760241) {
                L(c0Var, iV3, iG, iV2, kVar.f104965a, str, kVar.f104968d, nVar, hVar, i11);
            } else if (iV3 == 1836069985 || iV3 == 1701733217 || iV3 == 1633889587 || iV3 == 1700998451 || iV3 == 1633889588 || iV3 == 1835823201 || iV3 == 1685353315 || iV3 == 1685353317 || iV3 == 1685353320 || iV3 == 1685353324 || iV3 == 1685353336 || iV3 == 1935764850 || iV3 == 1935767394 || iV3 == 1819304813 || iV3 == 1936684916 || iV3 == 1953984371 || iV3 == 778924082 || iV3 == 778924083 || iV3 == 1835557169 || iV3 == 1835560241 || iV3 == 1634492771 || iV3 == 1634492791 || iV3 == 1970037111 || iV3 == 1332770163 || iV3 == 1716281667 || iV3 == 1767992678 || iV3 == 1768973165 || iV3 == 1718641517) {
                i(c0Var, iV3, iG, iV2, kVar.f104965a, str, z11, nVar, hVar, i11);
            } else if (iV3 == 1414810956 || iV3 == 1954034535 || iV3 == 2004251764 || iV3 == 1937010800 || iV3 == 1664495672 || iV3 == 1836070003) {
                h hVar2 = hVar;
                E(c0Var, iV3, iG, iV2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (iV3 == 1835365492) {
                v(c0Var, iV3, iG, kVar.f104965a, hVar);
            } else if (iV3 == 1667329389) {
                hVar.f104954b = new p7.u.b().i0(kVar.f104965a).y0("application/x-camera-motion").P();
            }
            c0Var.b0(iG + iV2);
        }
        return hVar;
    }

    private static void E(c0 c0Var, int i11, int i12, int i13, k kVar, String str, h hVar) {
        c0Var.b0(i12 + 16);
        String str2 = "application/ttml+xml";
        com.google.common.collect.x xVarS = null;
        long j11 = Long.MAX_VALUE;
        if (i11 != 1414810956) {
            if (i11 == 1954034535) {
                int i14 = i13 - 16;
                byte[] bArr = new byte[i14];
                c0Var.q(bArr, 0, i14);
                xVarS = com.google.common.collect.x.s(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i11 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i11 == 1937010800) {
                j11 = 0;
            } else if (i11 == 1664495672) {
                hVar.f104956d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i11 != 1836070003) {
                    throw new IllegalStateException();
                }
                int iG = c0Var.g();
                c0Var.c0(4);
                if (c0Var.v() == 1702061171) {
                    c cVarN = n(c0Var, iG);
                    if (cVarN.f104943b == null || cVarN.f104943b.length != 64) {
                        return;
                    }
                    xVarS = com.google.common.collect.x.s(q0.E0(d(cVarN.f104943b, kVar.f104969e, kVar.f104970f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f104954b = new p7.u.b().i0(kVar.f104965a).y0(str2).n0(str).C0(j11).k0(xVarS).P();
        }
    }

    private static k F(c0 c0Var) {
        long j11;
        c0Var.b0(8);
        int iQ = q(c0Var.v());
        c0Var.c0(iQ == 0 ? 8 : 16);
        int iV = c0Var.v();
        c0Var.c0(4);
        int iG = c0Var.g();
        int i11 = iQ == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            j11 = -9223372036854775807L;
            if (i12 >= i11) {
                c0Var.c0(i11);
                break;
            }
            if (c0Var.f()[iG + i12] != -1) {
                long jO = iQ == 0 ? c0Var.O() : c0Var.T();
                if (jO == 0) {
                    break;
                }
                j11 = jO;
                break;
            }
            i12++;
        }
        c0Var.c0(10);
        int i13 = 0;
        long j12 = j11;
        int iU = c0Var.U();
        c0Var.c0(4);
        int iV2 = c0Var.v();
        int iV3 = c0Var.v();
        c0Var.c0(4);
        int iV4 = c0Var.v();
        int iV5 = c0Var.v();
        if (iV2 == 0 && iV3 == 65536 && ((iV4 == -65536 || iV4 == 65536) && iV5 == 0)) {
            i13 = 90;
        } else if (iV2 == 0 && iV3 == -65536 && ((iV4 == 65536 || iV4 == -65536) && iV5 == 0)) {
            i13 = EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        } else if ((iV2 == -65536 || iV2 == 65536) && iV3 == 0 && iV4 == 0 && iV5 == -65536) {
            i13 = 180;
        }
        int i14 = i13;
        c0Var.c0(16);
        short sI = c0Var.I();
        c0Var.c0(2);
        return new k(iV, j12, iU, i14, sI, c0Var.I());
    }

    public static t G(t7.e.b bVar, t7.e.c cVar, long j11, p7.n nVar, boolean z11, boolean z12) throws ParserException {
        long[] jArr;
        long[] jArr2;
        p7.u uVarP;
        t7.e.b bVarD;
        Pair<long[], long[]> pairM;
        t7.e.b bVar2 = (t7.e.b) s7.a.f(bVar.d(1835297121));
        int iF = f(r(((t7.e.c) s7.a.f(bVar2.e(1751411826))).f112704b));
        if (iF == -1) {
            return null;
        }
        k kVarF = F(((t7.e.c) s7.a.f(bVar.e(1953196132))).f112704b);
        long j12 = j11 == -9223372036854775807L ? kVarF.f104966b : j11;
        long j13 = w(cVar.f112704b).f112709c;
        long jS1 = j12 != -9223372036854775807L ? q0.s1(j12, 1000000L, j13) : -9223372036854775807L;
        t7.e.b bVar3 = (t7.e.b) s7.a.f(((t7.e.b) s7.a.f(bVar2.d(1835626086))).d(1937007212));
        e eVarT = t(((t7.e.c) s7.a.f(bVar2.e(1835296868))).f112704b);
        t7.e.c cVarE = bVar3.e(1937011556);
        if (cVarE == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarD = D(cVarE.f112704b, kVarF, eVarT.f104949c, nVar, z12);
        if (z11 || (bVarD = bVar.d(1701082227)) == null || (pairM = m(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM.first;
            jArr2 = (long[]) pairM.second;
            jArr = jArr3;
        }
        if (hVarD.f104954b == null) {
            return null;
        }
        if (kVarF.f104967c != 0) {
            t7.d dVar = new t7.d(kVarF.f104967c);
            p7.u.b bVarB = hVarD.f104954b.b();
            f0 f0Var = hVarD.f104954b.f101541l;
            uVarP = bVarB.r0(f0Var != null ? f0Var.a(dVar) : new f0(dVar)).P();
        } else {
            uVarP = hVarD.f104954b;
        }
        return new t(kVarF.f104965a, iF, eVarT.f104947a, j13, jS1, eVarT.f104948b, uVarP, hVarD.f104956d, hVarD.f104953a, hVarD.f104955c, jArr, jArr2);
    }

    public static List<w> H(t7.e.b bVar, b0 b0Var, long j11, p7.n nVar, boolean z11, boolean z12, ou.h<t, t> hVar) {
        t tVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < bVar.f112703d.size(); i11++) {
            t7.e.b bVar2 = bVar.f112703d.get(i11);
            if (bVar2.f112700a == 1953653099 && (tVarApply = hVar.apply(G(bVar2, (t7.e.c) s7.a.f(bVar.e(1836476516)), j11, nVar, z11, z12))) != null) {
                arrayList.add(B(tVarApply, (t7.e.b) s7.a.f(((t7.e.b) s7.a.f(((t7.e.b) s7.a.f(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b0Var));
            }
        }
        return arrayList;
    }

    public static f0 I(t7.e.c cVar) {
        c0 c0Var = cVar.f112704b;
        c0Var.b0(8);
        f0 f0Var = new f0(new f0.a[0]);
        while (c0Var.a() >= 8) {
            int iG = c0Var.g();
            int iV = c0Var.v();
            int iV2 = c0Var.v();
            if (iV2 == 1835365473) {
                c0Var.b0(iG);
                f0Var = f0Var.b(J(c0Var, iG + iV));
            } else if (iV2 == 1936553057) {
                c0Var.b0(iG);
                f0Var = f0Var.b(r.b(c0Var, iG + iV));
            } else if (iV2 == -1451722374) {
                f0Var = f0Var.b(M(c0Var));
            }
            c0Var.b0(iG + iV);
        }
        return f0Var;
    }

    private static f0 J(c0 c0Var, int i11) {
        c0Var.c0(8);
        g(c0Var);
        while (c0Var.g() < i11) {
            int iG = c0Var.g();
            int iV = c0Var.v();
            if (c0Var.v() == 1768715124) {
                c0Var.b0(iG);
                return s(c0Var, iG + iV);
            }
            c0Var.b0(iG + iV);
        }
        return null;
    }

    static l K(c0 c0Var, int i11, int i12) throws ParserException {
        c0Var.b0(i11 + 8);
        int iG = c0Var.g();
        d dVarC = null;
        while (iG - i11 < i12) {
            c0Var.b0(iG);
            int iV = c0Var.v();
            w8.s.a(iV > 0, "childAtomSize must be positive");
            if (c0Var.v() == 1702454643) {
                dVarC = C(c0Var, iG, iV);
            }
            iG += iV;
        }
        if (dVarC == null) {
            return null;
        }
        return new l(dVarC);
    }

    private static void L(c0 c0Var, int i11, int i12, int i13, int i14, String str, int i15, p7.n nVar, h hVar, int i16) throws ParserException {
        String str2;
        int i17;
        String str3;
        int iK;
        int i18;
        t7.h.k kVar;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24 = i12;
        int i25 = i13;
        p7.n nVarC = nVar;
        h hVar2 = hVar;
        c0Var.b0(i24 + 16);
        c0Var.c0(16);
        int iU = c0Var.U();
        int iU2 = c0Var.U();
        c0Var.c0(50);
        int iG = c0Var.g();
        int iIntValue = i11;
        if (iIntValue == 1701733238) {
            Pair<Integer, u> pairZ = z(c0Var, i24, i25);
            if (pairZ != null) {
                iIntValue = ((Integer) pairZ.first).intValue();
                nVarC = nVarC == null ? null : nVarC.c(((u) pairZ.second).f105088b);
                hVar2.f104953a[i16] = (u) pairZ.second;
            }
            c0Var.b0(iG);
        }
        String str4 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fX = 1.0f;
        int i26 = 8;
        int i27 = 8;
        ByteBuffer byteBufferA = null;
        List<byte[]> listK = null;
        String str5 = null;
        byte[] bArrY = null;
        int i28 = -1;
        int i29 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int iL = -1;
        a aVarK = null;
        c cVarN = null;
        t7.h.k kVar2 = null;
        boolean z11 = false;
        while (iG - i24 < i25) {
            c0Var.b0(iG);
            int iG2 = c0Var.g();
            int iV = c0Var.v();
            if (iV == 0 && c0Var.g() - i12 == i25) {
                break;
            }
            w8.s.a(iV > 0, "childAtomSize must be positive");
            int iV2 = c0Var.v();
            if (iV2 == 1635148611) {
                w8.s.a(str2 == null, null);
                c0Var.b0(iG2 + 8);
                w8.d dVarB = w8.d.b(c0Var);
                List<byte[]> list = dVarB.f121256a;
                hVar2.f104955c = dVarB.f121257b;
                if (!z11) {
                    fX = dVarB.f121266k;
                }
                String str6 = dVarB.f121267l;
                int i36 = dVarB.f121265j;
                int i37 = dVarB.f121262g;
                int i38 = dVarB.f121263h;
                listK = list;
                int i39 = dVarB.f121264i;
                int i41 = dVarB.f121260e;
                t7.h.k kVar3 = kVar2;
                nVarC = nVarC;
                kVar = kVar3;
                i27 = dVarB.f121261f;
                i17 = iG;
                iIntValue = iIntValue;
                str3 = str4;
                iK = i37;
                i18 = i38;
                iL = i39;
                i26 = i41;
                str5 = str6;
                str2 = "video/avc";
                i29 = i36;
            } else {
                i17 = iG;
                if (iV2 == 1752589123) {
                    w8.s.a(str2 == null, null);
                    c0Var.b0(iG2 + 8);
                    w8.c0 c0VarA = w8.c0.a(c0Var);
                    List<byte[]> list2 = c0VarA.f121239a;
                    hVar2.f104955c = c0VarA.f121240b;
                    if (!z11) {
                        fX = c0VarA.f121252n;
                    }
                    int i42 = c0VarA.f121253o;
                    int i43 = c0VarA.f121241c;
                    String str7 = c0VarA.f121254p;
                    int i44 = c0VarA.f121251m;
                    listK = list2;
                    if (i44 != -1) {
                        i28 = i44;
                    }
                    int i45 = c0VarA.f121244f;
                    int i46 = c0VarA.f121245g;
                    int i47 = c0VarA.f121248j;
                    int i48 = c0VarA.f121249k;
                    int i49 = c0VarA.f121250l;
                    i33 = i46;
                    i26 = c0VarA.f121246h;
                    i27 = c0VarA.f121247i;
                    nVarC = nVarC;
                    iIntValue = iIntValue;
                    str3 = str4;
                    iK = i47;
                    i18 = i48;
                    iL = i49;
                    kVar = c0VarA.f121255q;
                    i29 = i42;
                    i31 = i43;
                    i32 = i45;
                    str2 = "video/hevc";
                    str5 = str7;
                } else {
                    str3 = str4;
                    if (iV2 == 1818785347) {
                        w8.s.a("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                        t7.h.k kVar4 = kVar2;
                        w8.s.a(kVar4 != null && kVar4.f112765b.size() >= 2, "must have at least two layers");
                        c0Var.b0(iG2 + 8);
                        w8.c0 c0VarC = w8.c0.c(c0Var, (t7.h.k) s7.a.f(kVar4));
                        w8.s.a(hVar2.f104955c == c0VarC.f121240b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i51 = c0VarC.f121248j;
                        int i52 = i34;
                        if (i51 != -1) {
                            w8.s.a(i52 == i51, "colorSpace must be the same for both views");
                        }
                        int i53 = c0VarC.f121249k;
                        int i54 = i35;
                        if (i53 != -1) {
                            w8.s.a(i54 == i53, "colorRange must be the same for both views");
                        }
                        int i55 = c0VarC.f121250l;
                        if (i55 != -1) {
                            int i56 = iL;
                            i23 = i56;
                            w8.s.a(i56 == i55, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iL;
                        }
                        w8.s.a(i26 == c0VarC.f121246h, "bitdepthLuma must be the same for both views");
                        w8.s.a(i27 == c0VarC.f121247i, "bitdepthChroma must be the same for both views");
                        List<byte[]> listK2 = listK;
                        if (listK2 != null) {
                            listK2 = com.google.common.collect.x.k().j(listK2).j(c0VarC.f121239a).k();
                        } else {
                            w8.s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str2 = "video/mv-hevc";
                        i18 = i54;
                        iK = i52;
                        iL = i23;
                        str5 = c0VarC.f121254p;
                        kVar = kVar4;
                        listK = listK2;
                    } else {
                        List<byte[]> listK3 = listK;
                        iK = i34;
                        i18 = i35;
                        int i57 = iL;
                        t7.h.k kVar5 = kVar2;
                        if (iV2 == 1986361461) {
                            l lVarK = K(c0Var, iG2, iV);
                            if (lVarK == null || lVarK.f104971a == null) {
                                i22 = i28;
                                i28 = i22;
                            } else if (kVar5 == null || kVar5.f112765b.size() < 2) {
                                i22 = i28;
                                if (i22 == -1) {
                                    i28 = lVarK.f104971a.f104946a.f104952c ? 5 : 4;
                                } else {
                                    i28 = i22;
                                }
                            } else {
                                w8.s.a(lVarK.b(), "both eye views must be marked as available");
                                w8.s.a(!lVarK.f104971a.f104946a.f104952c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i28;
                                i28 = i22;
                            }
                            listK = listK3;
                            iL = i57;
                            kVar = kVar5;
                        } else {
                            int i58 = i28;
                            kVar = kVar5;
                            if (iV2 == 1685480259 || iV2 == 1685485123 || iV2 == 1685485379) {
                                nVarC = nVarC;
                                iIntValue = iIntValue;
                                i19 = i58;
                                i27 = i27;
                                float f11 = fX;
                                int i59 = i26;
                                i21 = i57;
                                int i61 = iV - 8;
                                byte[] bArr = new byte[i61];
                                c0Var.q(bArr, 0, i61);
                                if (listK3 != null) {
                                    listK = com.google.common.collect.x.k().j(listK3).a(bArr).k();
                                } else {
                                    w8.s.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    listK = listK3;
                                }
                                c0Var.b0(iG2 + 8);
                                t7.a aVarA = t7.a.a(c0Var);
                                if (aVarA != null) {
                                    str2 = "video/dolby-vision";
                                    str5 = aVarA.f112694c;
                                }
                                iK = iK;
                                i26 = i59;
                                fX = f11;
                            } else if (iV2 == 1987076931) {
                                w8.s.a(str2 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                c0Var.b0(iG2 + 12);
                                byte bM = (byte) c0Var.M();
                                byte bM2 = (byte) c0Var.M();
                                int iM = c0Var.M();
                                i26 = iM >> 4;
                                iIntValue = iIntValue;
                                byte b11 = (byte) ((iM >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listK3 = s7.k.k(bM, bM2, (byte) i26, b11);
                                }
                                boolean z12 = (iM & 1) != 0;
                                int iM2 = c0Var.M();
                                int iM3 = c0Var.M();
                                int iK2 = p7.i.k(iM2);
                                int i62 = z12 ? 1 : 2;
                                iL = p7.i.l(iM3);
                                str2 = str8;
                                nVarC = nVarC;
                                i18 = i62;
                                kVar = kVar;
                                iK = iK2;
                                listK = listK3;
                                i28 = i58;
                                i27 = i26;
                            } else {
                                iIntValue = iIntValue;
                                if (iV2 == 1635135811) {
                                    int i63 = iV - 8;
                                    byte[] bArr2 = new byte[i63];
                                    c0Var.q(bArr2, 0, i63);
                                    listK = com.google.common.collect.x.s(bArr2);
                                    c0Var.b0(iG2 + 8);
                                    p7.i iVarJ = j(c0Var);
                                    int i64 = iVarJ.f101367e;
                                    int i65 = iVarJ.f101368f;
                                    int i66 = iVarJ.f101363a;
                                    int i67 = iVarJ.f101364b;
                                    iL = iVarJ.f101365c;
                                    i26 = i64;
                                    i27 = i65;
                                    iK = i66;
                                    i18 = i67;
                                    str2 = "video/av01";
                                } else if (iV2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c0Var.I());
                                    byteBuffer.putShort(c0Var.I());
                                    byteBufferA = byteBuffer;
                                    listK = listK3;
                                    i27 = i27;
                                    iL = i57;
                                } else if (iV2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sI = c0Var.I();
                                    short sI2 = c0Var.I();
                                    short sI3 = c0Var.I();
                                    short sI4 = c0Var.I();
                                    i27 = i27;
                                    short sI5 = c0Var.I();
                                    int i68 = i26;
                                    short sI6 = c0Var.I();
                                    nVarC = nVarC;
                                    short sI7 = c0Var.I();
                                    short sI8 = c0Var.I();
                                    long jO = c0Var.O();
                                    long jO2 = c0Var.O();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sI5);
                                    byteBuffer2.putShort(sI6);
                                    byteBuffer2.putShort(sI);
                                    byteBuffer2.putShort(sI2);
                                    byteBuffer2.putShort(sI3);
                                    byteBuffer2.putShort(sI4);
                                    byteBuffer2.putShort(sI7);
                                    byteBuffer2.putShort(sI8);
                                    byteBuffer2.putShort((short) (jO / 10000));
                                    byteBuffer2.putShort((short) (jO2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    listK = listK3;
                                    kVar = kVar;
                                    i26 = i68;
                                    iL = i57;
                                    i28 = i58;
                                    fX = fX;
                                } else {
                                    nVarC = nVarC;
                                    i19 = i58;
                                    i27 = i27;
                                    float f12 = fX;
                                    i26 = i26;
                                    if (iV2 == 1681012275) {
                                        w8.s.a(str2 == null, null);
                                        listK = listK3;
                                        str2 = str3;
                                    } else if (iV2 == 1702061171) {
                                        w8.s.a(str2 == null, null);
                                        cVarN = n(c0Var, iG2);
                                        String str9 = cVarN.f104942a;
                                        byte[] bArr3 = cVarN.f104943b;
                                        listK = bArr3 != null ? com.google.common.collect.x.s(bArr3) : listK3;
                                        str2 = str9;
                                    } else {
                                        if (iV2 == 1651798644) {
                                            aVarK = k(c0Var, iG2);
                                        } else if (iV2 == 1885434736) {
                                            fX = x(c0Var, iG2);
                                            listK = listK3;
                                            kVar = kVar;
                                            i26 = i26;
                                            iL = i57;
                                            i28 = i19;
                                            z11 = true;
                                        } else if (iV2 == 1937126244) {
                                            bArrY = y(c0Var, iG2, iV);
                                        } else if (iV2 == 1936995172) {
                                            int iM4 = c0Var.M();
                                            c0Var.c0(3);
                                            if (iM4 == 0) {
                                                int iM5 = c0Var.M();
                                                if (iM5 == 0) {
                                                    i19 = 0;
                                                } else if (iM5 == 1) {
                                                    i19 = 1;
                                                } else if (iM5 == 2) {
                                                    i19 = 2;
                                                } else if (iM5 == 3) {
                                                    i19 = 3;
                                                }
                                            }
                                        } else if (iV2 == 1634760259) {
                                            int i69 = iV - 12;
                                            byte[] bArr4 = new byte[i69];
                                            c0Var.b0(iG2 + 12);
                                            c0Var.q(bArr4, 0, i69);
                                            listK = com.google.common.collect.x.s(bArr4);
                                            p7.i iVarH = h(new c0(bArr4));
                                            int i71 = iVarH.f101367e;
                                            int i72 = iVarH.f101368f;
                                            int i73 = iVarH.f101363a;
                                            int i74 = iVarH.f101364b;
                                            iL = iVarH.f101365c;
                                            i26 = i71;
                                            i27 = i72;
                                            iK = i73;
                                            i18 = i74;
                                            str2 = "video/apv";
                                            kVar = kVar;
                                            i28 = i19;
                                            fX = f12;
                                        } else {
                                            if (iV2 == 1668246642) {
                                                i21 = i57;
                                                if (iK == -1 && i21 == -1) {
                                                    int iV3 = c0Var.v();
                                                    if (iV3 == 1852009592 || iV3 == 1852009571) {
                                                        int iU3 = c0Var.U();
                                                        int iU4 = c0Var.U();
                                                        c0Var.c0(2);
                                                        boolean z13 = iV == 19 && (c0Var.M() & 128) != 0;
                                                        iK = p7.i.k(iU3);
                                                        listK = listK3;
                                                        i18 = z13 ? 1 : 2;
                                                        kVar = kVar;
                                                        i26 = i26;
                                                        i28 = i19;
                                                        fX = f12;
                                                        iL = p7.i.l(iU4);
                                                    } else {
                                                        s7.t.i("BoxParsers", "Unsupported color type: " + t7.e.a(iV3));
                                                    }
                                                }
                                            } else {
                                                i21 = i57;
                                            }
                                            listK = listK3;
                                            iK = iK;
                                            i26 = i26;
                                            fX = f12;
                                        }
                                        listK = listK3;
                                    }
                                    iL = i57;
                                    i28 = i19;
                                    fX = f12;
                                }
                                i28 = i58;
                            }
                            iL = i21;
                            kVar = kVar;
                            i28 = i19;
                        }
                    }
                }
            }
            iG = i17 + iV;
            p7.n nVar2 = nVarC;
            kVar2 = kVar;
            nVarC = nVar2;
            i24 = i12;
            i25 = i13;
            hVar2 = hVar;
            i27 = i27;
            iIntValue = iIntValue;
            str4 = str3;
            i34 = iK;
            i35 = i18;
        }
        p7.n nVar3 = nVarC;
        float f13 = fX;
        List<byte[]> list3 = listK;
        int i75 = i28;
        int i76 = i34;
        int i77 = i35;
        int i78 = iL;
        int i79 = i27;
        int i81 = i26;
        if (str2 == null) {
            return;
        }
        p7.u.b bVarV = new p7.u.b().i0(i14).y0(str2).U(str5).F0(iU).h0(iU2).b0(i32).a0(i33).u0(f13).x0(i15).v0(bArrY).B0(i75).k0(list3).p0(i29).q0(i31).c0(nVar3).n0(str).V(new p7.i.b().d(i76).c(i77).e(i78).f(byteBufferA != null ? byteBufferA.array() : null).g(i81).b(i79).a());
        if (aVarK != null) {
            bVarV.S(ru.f.m(aVarK.f104931a)).t0(ru.f.m(aVarK.f104932b));
        } else if (cVarN != null) {
            bVarV.S(ru.f.m(cVarN.f104944c)).t0(ru.f.m(cVarN.f104945d));
        }
        hVar.f104954b = bVarV.P();
    }

    private static f0 M(c0 c0Var) {
        short sI = c0Var.I();
        c0Var.c0(2);
        String strJ = c0Var.J(sI);
        int iMax = Math.max(strJ.lastIndexOf(43), strJ.lastIndexOf(45));
        try {
            return new f0(new t7.f(Float.parseFloat(strJ.substring(0, iMax)), Float.parseFloat(strJ.substring(iMax, strJ.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int N(int i11) {
        int i12 = (i11 >> 16) & 255;
        int i13 = ((i11 >> 8) & 255) + RangingPosition.RSSI_UNKNOWN;
        int i14 = (i11 & 255) + RangingPosition.RSSI_UNKNOWN;
        return q0.r(i12 + ((i14 * 17790) / 10000), 0, 255) | (q0.r(((i13 * 14075) / 10000) + i12, 0, 255) << 16) | (q0.r((i12 - ((i14 * 3455) / 10000)) - ((i13 * 7169) / 10000), 0, 255) << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length - 1;
        return jArr[0] <= j12 && j12 < jArr[q0.r(4, 0, length)] && jArr[q0.r(jArr.length - 4, 0, length)] < j13 && j13 <= j11;
    }

    private static int c(c0 c0Var, int i11, int i12, int i13) throws ParserException {
        int iG = c0Var.g();
        w8.s.a(iG >= i12, null);
        while (iG - i12 < i13) {
            c0Var.b0(iG);
            int iV = c0Var.v();
            w8.s.a(iV > 0, "childAtomSize must be positive");
            if (c0Var.v() == i11) {
                return iG;
            }
            iG += iV;
        }
        return -1;
    }

    private static String d(byte[] bArr, int i11, int i12) {
        s7.a.h(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i13 = 0; i13 < bArr.length - 3; i13 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(ru.f.i(bArr[i13], bArr[i13 + 1], bArr[i13 + 2], bArr[i13 + 3])))));
        }
        return "size: " + i11 + "x" + i12 + "\npalette: " + ou.i.g(", ").d(arrayList) + "\n";
    }

    private static String e(int i11) {
        char[] cArr = {(char) (((i11 >> 10) & 31) + 96), (char) (((i11 >> 5) & 31) + 96), (char) ((i11 & 31) + 96)};
        for (int i12 = 0; i12 < 3; i12++) {
            char c11 = cArr[i12];
            if (c11 < 'a' || c11 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int f(int i11) {
        if (i11 == 1936684398) {
            return 1;
        }
        if (i11 == 1986618469) {
            return 2;
        }
        if (i11 == 1952807028 || i11 == 1935832172 || i11 == 1937072756 || i11 == 1668047728 || i11 == 1937072752) {
            return 3;
        }
        return i11 == 1835365473 ? 5 : -1;
    }

    public static void g(c0 c0Var) {
        int iG = c0Var.g();
        c0Var.c0(4);
        if (c0Var.v() != 1751411826) {
            iG += 4;
        }
        c0Var.b0(iG);
    }

    private static p7.i h(c0 c0Var) {
        p7.i.b bVar = new p7.i.b();
        s7.b0 b0Var = new s7.b0(c0Var.f());
        b0Var.p(c0Var.g() * 8);
        b0Var.s(1);
        int iH = b0Var.h(8);
        for (int i11 = 0; i11 < iH; i11++) {
            b0Var.s(1);
            int iH2 = b0Var.h(8);
            for (int i12 = 0; i12 < iH2; i12++) {
                b0Var.r(6);
                boolean zG = b0Var.g();
                b0Var.q();
                b0Var.s(11);
                b0Var.r(4);
                int iH3 = b0Var.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                b0Var.s(1);
                if (zG) {
                    int iH4 = b0Var.h(8);
                    int iH5 = b0Var.h(8);
                    b0Var.s(1);
                    bVar.d(p7.i.k(iH4)).c(b0Var.g() ? 1 : 2).e(p7.i.l(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: p7.u$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: byte
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private static void i(s7.c0 r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, p7.n r33, q9.b.h r34, int r35) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.b.i(s7.c0, int, int, int, int, java.lang.String, boolean, p7.n, q9.b$h, int):void");
    }

    private static p7.i j(c0 c0Var) {
        p7.i.b bVar = new p7.i.b();
        s7.b0 b0Var = new s7.b0(c0Var.f());
        b0Var.p(c0Var.g() * 8);
        b0Var.s(1);
        int iH = b0Var.h(3);
        b0Var.r(6);
        boolean zG = b0Var.g();
        boolean zG2 = b0Var.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        b0Var.r(13);
        b0Var.q();
        int iH2 = b0Var.h(4);
        if (iH2 != 1) {
            s7.t.g("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (b0Var.g()) {
            s7.t.g("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = b0Var.g();
        b0Var.q();
        if (zG3 && b0Var.h(8) > 127) {
            s7.t.g("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = b0Var.h(3);
        b0Var.q();
        if (b0Var.g()) {
            s7.t.g("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (b0Var.g()) {
            s7.t.g("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (b0Var.g()) {
            s7.t.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = b0Var.h(5);
        boolean z11 = false;
        for (int i11 = 0; i11 <= iH4; i11++) {
            b0Var.r(12);
            if (b0Var.h(5) > 7) {
                b0Var.q();
            }
        }
        int iH5 = b0Var.h(4);
        int iH6 = b0Var.h(4);
        b0Var.r(iH5 + 1);
        b0Var.r(iH6 + 1);
        if (b0Var.g()) {
            b0Var.r(7);
        }
        b0Var.r(7);
        boolean zG4 = b0Var.g();
        if (zG4) {
            b0Var.r(2);
        }
        if ((b0Var.g() ? 2 : b0Var.h(1)) > 0 && !b0Var.g()) {
            b0Var.r(1);
        }
        if (zG4) {
            b0Var.r(3);
        }
        b0Var.r(3);
        boolean zG5 = b0Var.g();
        if (iH3 == 2 && zG5) {
            b0Var.q();
        }
        if (iH3 != 1 && b0Var.g()) {
            z11 = true;
        }
        if (b0Var.g()) {
            int iH7 = b0Var.h(8);
            int iH8 = b0Var.h(8);
            bVar.d(p7.i.k(iH7)).c(((z11 || iH7 != 1 || iH8 != 13 || b0Var.h(8) != 0) ? b0Var.h(1) : 1) != 1 ? 2 : 1).e(p7.i.l(iH8));
        }
        return bVar.a();
    }

    private static a k(c0 c0Var, int i11) {
        c0Var.b0(i11 + 8);
        c0Var.c0(4);
        return new a(c0Var.O(), c0Var.O());
    }

    static Pair<Integer, u> l(c0 c0Var, int i11, int i12) throws ParserException {
        int i13 = i11 + 8;
        int i14 = -1;
        int i15 = 0;
        String strJ = null;
        Integer numValueOf = null;
        while (i13 - i11 < i12) {
            c0Var.b0(i13);
            int iV = c0Var.v();
            int iV2 = c0Var.v();
            if (iV2 == 1718775137) {
                numValueOf = Integer.valueOf(c0Var.v());
            } else if (iV2 == 1935894637) {
                c0Var.c0(4);
                strJ = c0Var.J(4);
            } else if (iV2 == 1935894633) {
                i14 = i13;
                i15 = iV;
            }
            i13 += iV;
        }
        if (!"cenc".equals(strJ) && !"cbc1".equals(strJ) && !"cens".equals(strJ) && !"cbcs".equals(strJ)) {
            return null;
        }
        w8.s.a(numValueOf != null, "frma atom is mandatory");
        w8.s.a(i14 != -1, "schi atom is mandatory");
        u uVarA = A(c0Var, i14, i15, strJ);
        w8.s.a(uVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) q0.l(uVarA));
    }

    private static Pair<long[], long[]> m(t7.e.b bVar) {
        t7.e.c cVarE = bVar.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        c0 c0Var = cVarE.f112704b;
        c0Var.b0(8);
        int iQ = q(c0Var.v());
        int iQ2 = c0Var.Q();
        long[] jArr = new long[iQ2];
        long[] jArr2 = new long[iQ2];
        for (int i11 = 0; i11 < iQ2; i11++) {
            jArr[i11] = iQ == 1 ? c0Var.T() : c0Var.O();
            jArr2[i11] = iQ == 1 ? c0Var.F() : c0Var.v();
            if (c0Var.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c0Var.c0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c n(c0 c0Var, int i11) {
        c0Var.b0(i11 + 12);
        c0Var.c0(1);
        o(c0Var);
        c0Var.c0(2);
        int iM = c0Var.M();
        if ((iM & 128) != 0) {
            c0Var.c0(2);
        }
        if ((iM & 64) != 0) {
            c0Var.c0(c0Var.M());
        }
        if ((iM & 32) != 0) {
            c0Var.c0(2);
        }
        c0Var.c0(1);
        o(c0Var);
        String strH = g0.h(c0Var.M());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        c0Var.c0(4);
        long jO = c0Var.O();
        long jO2 = c0Var.O();
        c0Var.c0(1);
        int iO = o(c0Var);
        long j11 = jO2;
        byte[] bArr = new byte[iO];
        c0Var.q(bArr, 0, iO);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new c(strH, bArr, j11, jO > 0 ? jO : -1L);
    }

    private static int o(c0 c0Var) {
        int iM = c0Var.M();
        int i11 = iM & 127;
        while ((iM & 128) == 128) {
            iM = c0Var.M();
            i11 = (i11 << 7) | (iM & 127);
        }
        return i11;
    }

    public static int p(int i11) {
        return i11 & 16777215;
    }

    public static int q(int i11) {
        return (i11 >> 24) & 255;
    }

    private static int r(c0 c0Var) {
        c0Var.b0(16);
        return c0Var.v();
    }

    private static f0 s(c0 c0Var, int i11) {
        c0Var.c0(8);
        ArrayList arrayList = new ArrayList();
        while (c0Var.g() < i11) {
            f0.a aVarD = q9.j.d(c0Var);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f0(arrayList);
    }

    private static e t(c0 c0Var) {
        long j11;
        c0Var.b0(8);
        int iQ = q(c0Var.v());
        c0Var.c0(iQ == 0 ? 8 : 16);
        long jO = c0Var.O();
        int iG = c0Var.g();
        int i11 = iQ == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            j11 = -9223372036854775807L;
            if (i12 >= i11) {
                c0Var.c0(i11);
                break;
            }
            if (c0Var.f()[iG + i12] != -1) {
                long jO2 = iQ == 0 ? c0Var.O() : c0Var.T();
                if (jO2 == 0) {
                    break;
                }
                long jS1 = q0.s1(jO2, 1000000L, jO);
                jO = jO;
                j11 = jS1;
                break;
            }
            i12++;
        }
        return new e(jO, j11, e(c0Var.U()));
    }

    public static f0 u(t7.e.b bVar) {
        t7.e.c cVarE = bVar.e(1751411826);
        t7.e.c cVarE2 = bVar.e(1801812339);
        t7.e.c cVarE3 = bVar.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || r(cVarE.f112704b) != 1835299937) {
            return null;
        }
        c0 c0Var = cVarE2.f112704b;
        c0Var.b0(12);
        int iV = c0Var.v();
        String[] strArr = new String[iV];
        for (int i11 = 0; i11 < iV; i11++) {
            int iV2 = c0Var.v();
            c0Var.c0(4);
            strArr[i11] = c0Var.J(iV2 - 8);
        }
        c0 c0Var2 = cVarE3.f112704b;
        c0Var2.b0(8);
        ArrayList arrayList = new ArrayList();
        while (c0Var2.a() > 8) {
            int iG = c0Var2.g();
            int iV3 = c0Var2.v();
            int iV4 = c0Var2.v() - 1;
            if (iV4 < 0 || iV4 >= iV) {
                s7.t.i("BoxParsers", "Skipped metadata with unknown key index: " + iV4);
            } else {
                t7.c cVarI = q9.j.i(c0Var2, iG + iV3, strArr[iV4]);
                if (cVarI != null) {
                    arrayList.add(cVarI);
                }
            }
            c0Var2.b0(iG + iV3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f0(arrayList);
    }

    private static void v(c0 c0Var, int i11, int i12, int i13, h hVar) {
        c0Var.b0(i12 + 16);
        if (i11 == 1835365492) {
            c0Var.G();
            String strG = c0Var.G();
            if (strG != null) {
                hVar.f104954b = new p7.u.b().i0(i13).y0(strG).P();
            }
        }
    }

    public static t7.g w(c0 c0Var) {
        long jF;
        long jF2;
        c0Var.b0(8);
        if (q(c0Var.v()) == 0) {
            jF = c0Var.O();
            jF2 = c0Var.O();
        } else {
            jF = c0Var.F();
            jF2 = c0Var.F();
        }
        return new t7.g(jF, jF2, c0Var.O());
    }

    private static float x(c0 c0Var, int i11) {
        c0Var.b0(i11 + 8);
        return c0Var.Q() / c0Var.Q();
    }

    private static byte[] y(c0 c0Var, int i11, int i12) {
        int i13 = i11 + 8;
        while (i13 - i11 < i12) {
            c0Var.b0(i13);
            int iV = c0Var.v();
            if (c0Var.v() == 1886547818) {
                return Arrays.copyOfRange(c0Var.f(), i13, iV + i13);
            }
            i13 += iV;
        }
        return null;
    }

    private static Pair<Integer, u> z(c0 c0Var, int i11, int i12) throws ParserException {
        Pair<Integer, u> pairL;
        int iG = c0Var.g();
        while (iG - i11 < i12) {
            c0Var.b0(iG);
            int iV = c0Var.v();
            w8.s.a(iV > 0, "childAtomSize must be positive");
            if (c0Var.v() == 1936289382 && (pairL = l(c0Var, iG, iV)) != null) {
                return pairL;
            }
            iG += iV;
        }
        return null;
    }
}
