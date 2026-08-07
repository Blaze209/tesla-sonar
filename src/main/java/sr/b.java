package sr;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import dr.w;
import hr.b0;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f111593h = new p() { // from class: sr.a
        @Override // hr.p
        public final k[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f111594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f111595b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC2385b f111598e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111596c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f111597d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111599f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f111600g = -1;

    private static final class a implements InterfaceC2385b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f111601m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f111602n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 143, 157, 173, 190, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 307, 337, 371, 408, 449, DownloaderService.STATUS_UNHANDLED_HTTP_CODE, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f111603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f111604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sr.c f111605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f111606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f111607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f111608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f111609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final u0 f111610h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f111611i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f111612j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f111613k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f111614l;

        public a(m mVar, b0 b0Var, sr.c cVar) throws ParserException {
            this.f111603a = mVar;
            this.f111604b = b0Var;
            this.f111605c = cVar;
            int iMax = Math.max(1, cVar.f111625c / 10);
            this.f111609g = iMax;
            d0 d0Var = new d0(cVar.f111629g);
            d0Var.z();
            int iZ = d0Var.z();
            this.f111606d = iZ;
            int i11 = cVar.f111624b;
            int i12 = (((cVar.f111627e - (i11 * 4)) * 8) / (cVar.f111628f * i11)) + 1;
            if (iZ == i12) {
                int iL = p0.l(iMax, iZ);
                this.f111607e = new byte[cVar.f111627e * iL];
                this.f111608f = new d0(iL * h(iZ, i11));
                int i13 = ((cVar.f111625c * cVar.f111627e) * 8) / iZ;
                this.f111610h = new u0.b().g0("audio/raw").I(i13).b0(i13).Y(h(iMax, i11)).J(cVar.f111624b).h0(cVar.f111625c).a0(2).G();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i12 + "; got: " + iZ, null);
        }

        private void d(byte[] bArr, int i11, d0 d0Var) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < this.f111605c.f111624b; i13++) {
                    e(bArr, i12, i13, d0Var.e());
                }
            }
            int iG = g(this.f111606d * i11);
            d0Var.U(0);
            d0Var.T(iG);
        }

        private void e(byte[] bArr, int i11, int i12, byte[] bArr2) {
            sr.c cVar = this.f111605c;
            int i13 = cVar.f111627e;
            int i14 = cVar.f111624b;
            int i15 = (i11 * i13) + (i12 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int iQ = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int iMin = Math.min(bArr[i15 + 2] & 255, 88);
            int i18 = f111602n[iMin];
            int i19 = ((i11 * this.f111606d * i14) + i12) * 2;
            bArr2[i19] = (byte) (iQ & 255);
            bArr2[i19 + 1] = (byte) (iQ >> 8);
            for (int i21 = 0; i21 < i17 * 2; i21++) {
                byte b11 = bArr[((i21 / 8) * i14 * 4) + i16 + ((i21 / 2) % 4)];
                int i22 = i21 % 2 == 0 ? b11 & 15 : (b11 & 255) >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                iQ = p0.q(iQ + i23, -32768, 32767);
                i19 += i14 * 2;
                bArr2[i19] = (byte) (iQ & 255);
                bArr2[i19 + 1] = (byte) (iQ >> 8);
                int i24 = iMin + f111601m[i22];
                int[] iArr = f111602n;
                iMin = p0.q(i24, 0, iArr.length - 1);
                i18 = iArr[iMin];
            }
        }

        private int f(int i11) {
            return i11 / (this.f111605c.f111624b * 2);
        }

        private int g(int i11) {
            return h(i11, this.f111605c.f111624b);
        }

        private static int h(int i11, int i12) {
            return i11 * 2 * i12;
        }

        private void i(int i11) {
            long jM0 = this.f111612j + p0.M0(this.f111614l, 1000000L, this.f111605c.f111625c);
            int iG = g(i11);
            this.f111604b.e(jM0, 1, iG, this.f111613k - iG, null);
            this.f111614l += (long) i11;
            this.f111613k -= iG;
        }

        @Override // sr.b.InterfaceC2385b
        public void a(int i11, long j11) {
            this.f111603a.p(new e(this.f111605c, this.f111606d, i11, j11));
            this.f111604b.b(this.f111610h);
        }

        @Override // sr.b.InterfaceC2385b
        public void b(long j11) {
            this.f111611i = 0;
            this.f111612j = j11;
            this.f111613k = 0;
            this.f111614l = 0L;
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
        @Override // sr.b.InterfaceC2385b
        public boolean c(hr.l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f111609g
                int r1 = r6.f111613k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f111606d
                int r0 = ts.p0.l(r0, r1)
                sr.c r1 = r6.f111605c
                int r1 = r1.f111627e
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
                int r3 = r6.f111611i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f111607e
                int r5 = r6.f111611i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f111611i
                int r4 = r4 + r3
                r6.f111611i = r4
                goto L1e
            L3e:
                int r7 = r6.f111611i
                sr.c r8 = r6.f111605c
                int r8 = r8.f111627e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f111607e
                ts.d0 r9 = r6.f111608f
                r6.d(r8, r7, r9)
                int r8 = r6.f111611i
                sr.c r9 = r6.f111605c
                int r9 = r9.f111627e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f111611i = r8
                ts.d0 r7 = r6.f111608f
                int r7 = r7.g()
                hr.b0 r8 = r6.f111604b
                ts.d0 r9 = r6.f111608f
                r8.d(r9, r7)
                int r8 = r6.f111613k
                int r8 = r8 + r7
                r6.f111613k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f111609g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f111613k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sr.b.a.c(hr.l, long):boolean");
        }
    }

    /* JADX INFO: renamed from: sr.b$b, reason: collision with other inner class name */
    private interface InterfaceC2385b {
        void a(int i11, long j11);

        void b(long j11);

        boolean c(l lVar, long j11);
    }

    private static final class c implements InterfaceC2385b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f111615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f111616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sr.c f111617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u0 f111618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f111619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f111620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f111621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f111622h;

        public c(m mVar, b0 b0Var, sr.c cVar, String str, int i11) throws ParserException {
            this.f111615a = mVar;
            this.f111616b = b0Var;
            this.f111617c = cVar;
            int i12 = (cVar.f111624b * cVar.f111628f) / 8;
            if (cVar.f111627e == i12) {
                int i13 = cVar.f111625c;
                int i14 = i13 * i12 * 8;
                int iMax = Math.max(i12, (i13 * i12) / 10);
                this.f111619e = iMax;
                this.f111618d = new u0.b().g0(str).I(i14).b0(i14).Y(iMax).J(cVar.f111624b).h0(cVar.f111625c).a0(i11).G();
                return;
            }
            throw ParserException.a("Expected block size: " + i12 + "; got: " + cVar.f111627e, null);
        }

        @Override // sr.b.InterfaceC2385b
        public void a(int i11, long j11) {
            this.f111615a.p(new e(this.f111617c, 1, i11, j11));
            this.f111616b.b(this.f111618d);
        }

        @Override // sr.b.InterfaceC2385b
        public void b(long j11) {
            this.f111620f = j11;
            this.f111621g = 0;
            this.f111622h = 0L;
        }

        @Override // sr.b.InterfaceC2385b
        public boolean c(l lVar, long j11) {
            int i11;
            int i12;
            long j12 = j11;
            while (j12 > 0 && (i11 = this.f111621g) < (i12 = this.f111619e)) {
                int iA = this.f111616b.a(lVar, (int) Math.min(i12 - i11, j12), true);
                if (iA == -1) {
                    j12 = 0;
                } else {
                    this.f111621g += iA;
                    j12 -= (long) iA;
                }
            }
            sr.c cVar = this.f111617c;
            int i13 = cVar.f111627e;
            int i14 = this.f111621g / i13;
            if (i14 > 0) {
                long jM0 = this.f111620f + p0.M0(this.f111622h, 1000000L, cVar.f111625c);
                int i15 = i14 * i13;
                int i16 = this.f111621g - i15;
                this.f111616b.e(jM0, 1, i15, i16, null);
                this.f111622h += (long) i14;
                this.f111621g = i16;
            }
            return j12 <= 0;
        }
    }

    public static /* synthetic */ k[] b() {
        return new k[]{new b()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void c() {
        ts.a.i(this.f111595b);
        p0.j(this.f111594a);
    }

    private void d(l lVar) throws ParserException {
        ts.a.g(lVar.getPosition() == 0);
        int i11 = this.f111599f;
        if (i11 != -1) {
            lVar.k(i11);
            this.f111596c = 4;
        } else {
            if (!d.a(lVar)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            lVar.k((int) (lVar.h() - lVar.getPosition()));
            this.f111596c = 1;
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void f(l lVar) throws ParserException {
        sr.c cVarB = d.b(lVar);
        int i11 = cVarB.f111623a;
        if (i11 == 17) {
            this.f111598e = new a(this.f111594a, this.f111595b, cVarB);
        } else if (i11 == 6) {
            this.f111598e = new c(this.f111594a, this.f111595b, cVarB, "audio/g711-alaw", -1);
        } else if (i11 == 7) {
            this.f111598e = new c(this.f111594a, this.f111595b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = w.a(i11, cVarB.f111628f);
            if (iA == 0) {
                throw ParserException.c("Unsupported WAV format type: " + cVarB.f111623a);
            }
            this.f111598e = new c(this.f111594a, this.f111595b, cVarB, "audio/raw", iA);
        }
        this.f111596c = 3;
    }

    private void g(l lVar) {
        this.f111597d = d.c(lVar);
        this.f111596c = 2;
    }

    private int j(l lVar) {
        ts.a.g(this.f111600g != -1);
        return ((InterfaceC2385b) ts.a.e(this.f111598e)).c(lVar, this.f111600g - lVar.getPosition()) ? -1 : 0;
    }

    private void k(l lVar) throws ParserException {
        Pair<Long, Long> pairE = d.e(lVar);
        this.f111599f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j11 = this.f111597d;
        if (j11 != -1 && jLongValue == 4294967295L) {
            jLongValue = j11;
        }
        this.f111600g = ((long) this.f111599f) + jLongValue;
        long length = lVar.getLength();
        if (length != -1 && this.f111600g > length) {
            u.i("WavExtractor", "Data exceeds input length: " + this.f111600g + ", " + length);
            this.f111600g = length;
        }
        ((InterfaceC2385b) ts.a.e(this.f111598e)).a(this.f111599f, this.f111600g);
        this.f111596c = 4;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f111596c = j11 == 0 ? 0 : 4;
        InterfaceC2385b interfaceC2385b = this.f111598e;
        if (interfaceC2385b != null) {
            interfaceC2385b.b(j12);
        }
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f111594a = mVar;
        this.f111595b = mVar.b(0, 1);
        mVar.j();
    }

    @Override // hr.k
    public boolean h(l lVar) {
        return d.a(lVar);
    }

    @Override // hr.k
    public int i(l lVar, y yVar) throws ParserException {
        c();
        int i11 = this.f111596c;
        if (i11 == 0) {
            d(lVar);
            return 0;
        }
        if (i11 == 1) {
            g(lVar);
            return 0;
        }
        if (i11 == 2) {
            f(lVar);
            return 0;
        }
        if (i11 == 3) {
            k(lVar);
            return 0;
        }
        if (i11 == 4) {
            return j(lVar);
        }
        throw new IllegalStateException();
    }

    @Override // hr.k
    public void release() {
    }
}
