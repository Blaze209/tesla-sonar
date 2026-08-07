package ea;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.c0;
import s7.q0;
import s7.t;
import w8.i0;
import w8.o0;
import w8.p;
import w8.q;
import w8.r;
import w8.s0;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f62287h = new u() { // from class: ea.a
        @Override // w8.u
        public final p[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f62288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f62289b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1281b f62292e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62290c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62291d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f62293f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f62294g = -1;

    private static final class a implements InterfaceC1281b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f62295m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f62296n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 143, 157, 173, 190, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 307, 337, 371, 408, 449, DownloaderService.STATUS_UNHANDLED_HTTP_CODE, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f62297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f62298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ea.c f62299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f62300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f62301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c0 f62302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f62303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final p7.u f62304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f62306j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f62307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f62308l;

        public a(r rVar, o0 o0Var, ea.c cVar) throws ParserException {
            this.f62297a = rVar;
            this.f62298b = o0Var;
            this.f62299c = cVar;
            int iMax = Math.max(1, cVar.f62319c / 10);
            this.f62303g = iMax;
            c0 c0Var = new c0(cVar.f62323g);
            c0Var.E();
            int iE = c0Var.E();
            this.f62300d = iE;
            int i11 = cVar.f62318b;
            int i12 = (((cVar.f62321e - (i11 * 4)) * 8) / (cVar.f62322f * i11)) + 1;
            if (iE == i12) {
                int iN = q0.n(iMax, iE);
                this.f62301e = new byte[cVar.f62321e * iN];
                this.f62302f = new c0(iN * h(iE, i11));
                int i13 = ((cVar.f62319c * cVar.f62321e) * 8) / iE;
                this.f62304h = new p7.u.b().y0("audio/raw").S(i13).t0(i13).o0(h(iMax, i11)).T(cVar.f62318b).z0(cVar.f62319c).s0(2).P();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i12 + "; got: " + iE, null);
        }

        private void d(byte[] bArr, int i11, c0 c0Var) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < this.f62299c.f62318b; i13++) {
                    e(bArr, i12, i13, c0Var.f());
                }
            }
            int iG = g(this.f62300d * i11);
            c0Var.b0(0);
            c0Var.a0(iG);
        }

        private void e(byte[] bArr, int i11, int i12, byte[] bArr2) {
            ea.c cVar = this.f62299c;
            int i13 = cVar.f62321e;
            int i14 = cVar.f62318b;
            int i15 = (i11 * i13) + (i12 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int iR = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int iMin = Math.min(bArr[i15 + 2] & 255, 88);
            int i18 = f62296n[iMin];
            int i19 = ((i11 * this.f62300d * i14) + i12) * 2;
            bArr2[i19] = (byte) (iR & 255);
            bArr2[i19 + 1] = (byte) (iR >> 8);
            for (int i21 = 0; i21 < i17 * 2; i21++) {
                byte b11 = bArr[((i21 / 8) * i14 * 4) + i16 + ((i21 / 2) % 4)];
                int i22 = i21 % 2 == 0 ? b11 & 15 : (b11 & 255) >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                iR = q0.r(iR + i23, -32768, 32767);
                i19 += i14 * 2;
                bArr2[i19] = (byte) (iR & 255);
                bArr2[i19 + 1] = (byte) (iR >> 8);
                int i24 = iMin + f62295m[i22];
                int[] iArr = f62296n;
                iMin = q0.r(i24, 0, iArr.length - 1);
                i18 = iArr[iMin];
            }
        }

        private int f(int i11) {
            return i11 / (this.f62299c.f62318b * 2);
        }

        private int g(int i11) {
            return h(i11, this.f62299c.f62318b);
        }

        private static int h(int i11, int i12) {
            return i11 * 2 * i12;
        }

        private void i(int i11) {
            long jS1 = this.f62306j + q0.s1(this.f62308l, 1000000L, this.f62299c.f62319c);
            int iG = g(i11);
            this.f62298b.b(jS1, 1, iG, this.f62307k - iG, null);
            this.f62308l += (long) i11;
            this.f62307k -= iG;
        }

        @Override // ea.b.InterfaceC1281b
        public void a(int i11, long j11) {
            e eVar = new e(this.f62299c, this.f62300d, i11, j11);
            this.f62297a.t(eVar);
            this.f62298b.g(this.f62304h);
            this.f62298b.d(eVar.g());
        }

        @Override // ea.b.InterfaceC1281b
        public void b(long j11) {
            this.f62305i = 0;
            this.f62306j = j11;
            this.f62307k = 0;
            this.f62308l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ea.b.InterfaceC1281b
        public boolean c(w8.q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f62303g
                int r1 = r6.f62307k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f62300d
                int r0 = s7.q0.n(r0, r1)
                ea.c r1 = r6.f62299c
                int r1 = r1.f62321e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f62305i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f62301e
                int r5 = r6.f62305i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f62305i
                int r4 = r4 + r3
                r6.f62305i = r4
                goto L1e
            L3e:
                int r7 = r6.f62305i
                ea.c r8 = r6.f62299c
                int r8 = r8.f62321e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f62301e
                s7.c0 r9 = r6.f62302f
                r6.d(r8, r7, r9)
                int r8 = r6.f62305i
                ea.c r9 = r6.f62299c
                int r9 = r9.f62321e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f62305i = r8
                s7.c0 r7 = r6.f62302f
                int r7 = r7.j()
                w8.o0 r8 = r6.f62298b
                s7.c0 r9 = r6.f62302f
                r8.f(r9, r7)
                int r8 = r6.f62307k
                int r8 = r8 + r7
                r6.f62307k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f62303g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f62307k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.b.a.c(w8.q, long):boolean");
        }
    }

    /* JADX INFO: renamed from: ea.b$b, reason: collision with other inner class name */
    private interface InterfaceC1281b {
        void a(int i11, long j11);

        void b(long j11);

        boolean c(q qVar, long j11);
    }

    private static final class c implements InterfaceC1281b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f62309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f62310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ea.c f62311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p7.u f62312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f62313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f62314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f62315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f62316h;

        public c(r rVar, o0 o0Var, ea.c cVar, String str, int i11) throws ParserException {
            this.f62309a = rVar;
            this.f62310b = o0Var;
            this.f62311c = cVar;
            int i12 = (cVar.f62318b * cVar.f62322f) / 8;
            if (cVar.f62321e == i12) {
                int i13 = cVar.f62319c;
                int i14 = i13 * i12 * 8;
                int iMax = Math.max(i12, (i13 * i12) / 10);
                this.f62313e = iMax;
                this.f62312d = new p7.u.b().W("audio/wav").y0(str).S(i14).t0(i14).o0(iMax).T(cVar.f62318b).z0(cVar.f62319c).s0(i11).P();
                return;
            }
            throw ParserException.a("Expected block size: " + i12 + "; got: " + cVar.f62321e, null);
        }

        @Override // ea.b.InterfaceC1281b
        public void a(int i11, long j11) {
            e eVar = new e(this.f62311c, 1, i11, j11);
            this.f62309a.t(eVar);
            this.f62310b.g(this.f62312d);
            this.f62310b.d(eVar.g());
        }

        @Override // ea.b.InterfaceC1281b
        public void b(long j11) {
            this.f62314f = j11;
            this.f62315g = 0;
            this.f62316h = 0L;
        }

        @Override // ea.b.InterfaceC1281b
        public boolean c(q qVar, long j11) {
            int i11;
            int i12;
            long j12 = j11;
            while (j12 > 0 && (i11 = this.f62315g) < (i12 = this.f62313e)) {
                int iE = this.f62310b.e(qVar, (int) Math.min(i12 - i11, j12), true);
                if (iE == -1) {
                    j12 = 0;
                } else {
                    this.f62315g += iE;
                    j12 -= (long) iE;
                }
            }
            ea.c cVar = this.f62311c;
            int i13 = cVar.f62321e;
            int i14 = this.f62315g / i13;
            if (i14 > 0) {
                long jS1 = this.f62314f + q0.s1(this.f62316h, 1000000L, cVar.f62319c);
                int i15 = i14 * i13;
                int i16 = this.f62315g - i15;
                this.f62310b.b(jS1, 1, i15, i16, null);
                this.f62316h += (long) i14;
                this.f62315g = i16;
            }
            return j12 <= 0;
        }
    }

    public static /* synthetic */ p[] b() {
        return new p[]{new b()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void c() {
        s7.a.j(this.f62289b);
        q0.l(this.f62288a);
    }

    private void d(q qVar) throws ParserException {
        s7.a.h(qVar.getPosition() == 0);
        int i11 = this.f62293f;
        if (i11 != -1) {
            qVar.k(i11);
            this.f62290c = 4;
        } else {
            if (!d.a(qVar)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            qVar.k((int) (qVar.h() - qVar.getPosition()));
            this.f62290c = 1;
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void f(q qVar) throws ParserException {
        ea.c cVarB = d.b(qVar);
        int i11 = cVarB.f62317a;
        if (i11 == 17) {
            this.f62292e = new a(this.f62288a, this.f62289b, cVarB);
        } else if (i11 == 6) {
            this.f62292e = new c(this.f62288a, this.f62289b, cVarB, "audio/g711-alaw", -1);
        } else if (i11 == 7) {
            this.f62292e = new c(this.f62288a, this.f62289b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = s0.a(i11, cVarB.f62322f);
            if (iA == 0) {
                throw ParserException.d("Unsupported WAV format type: " + cVarB.f62317a);
            }
            this.f62292e = new c(this.f62288a, this.f62289b, cVarB, "audio/raw", iA);
        }
        this.f62290c = 3;
    }

    private void g(q qVar) {
        this.f62291d = d.c(qVar);
        this.f62290c = 2;
    }

    private int k(q qVar) {
        s7.a.h(this.f62294g != -1);
        return ((InterfaceC1281b) s7.a.f(this.f62292e)).c(qVar, this.f62294g - qVar.getPosition()) ? -1 : 0;
    }

    private void m(q qVar) throws ParserException {
        Pair<Long, Long> pairE = d.e(qVar);
        this.f62293f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j11 = this.f62291d;
        if (j11 != -1 && jLongValue == 4294967295L) {
            jLongValue = j11;
        }
        this.f62294g = ((long) this.f62293f) + jLongValue;
        long length = qVar.getLength();
        if (length != -1 && this.f62294g > length) {
            t.i("WavExtractor", "Data exceeds input length: " + this.f62294g + ", " + length);
            this.f62294g = length;
        }
        ((InterfaceC1281b) s7.a.f(this.f62292e)).a(this.f62293f, this.f62294g);
        this.f62290c = 4;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f62290c = j11 == 0 ? 0 : 4;
        InterfaceC1281b interfaceC1281b = this.f62292e;
        if (interfaceC1281b != null) {
            interfaceC1281b.b(j12);
        }
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f62288a = rVar;
        this.f62289b = rVar.b(0, 1);
        rVar.j();
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) throws ParserException {
        c();
        int i11 = this.f62290c;
        if (i11 == 0) {
            d(qVar);
            return 0;
        }
        if (i11 == 1) {
            g(qVar);
            return 0;
        }
        if (i11 == 2) {
            f(qVar);
            return 0;
        }
        if (i11 == 3) {
            m(qVar);
            return 0;
        }
        if (i11 == 4) {
            return k(qVar);
        }
        throw new IllegalStateException();
    }

    @Override // w8.p
    public boolean l(q qVar) {
        return d.a(qVar);
    }

    @Override // w8.p
    public void release() {
    }
}
