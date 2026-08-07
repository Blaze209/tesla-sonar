package ir;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import hr.b0;
import hr.d;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.y;
import hr.z;
import java.io.EOFException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f81782r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f81785u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f81786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f81788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f81789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f81791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f81792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f81793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f81795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m f81797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b0 f81798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private z f81799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f81800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f81780p = new p() { // from class: ir.a
        @Override // hr.p
        public final k[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f81781q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f81783s = p0.l0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f81784t = p0.l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f81782r = iArr;
        f81785u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ k[] b() {
        return new k[]{new b()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void c() {
        ts.a.i(this.f81798m);
        p0.j(this.f81797l);
    }

    private static int d(int i11, long j11) {
        return (int) ((((long) i11) * 8000000) / j11);
    }

    private z f(long j11, boolean z11) {
        return new d(j11, this.f81793h, d(this.f81794i, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT), this.f81794i, z11);
    }

    private int g(int i11) throws ParserException {
        if (k(i11)) {
            return this.f81788c ? f81782r[i11] : f81781q[i11];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f81788c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i11);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean j(int i11) {
        if (this.f81788c) {
            return false;
        }
        return i11 < 12 || i11 > 14;
    }

    private boolean k(int i11) {
        if (i11 < 0 || i11 > 15) {
            return false;
        }
        return l(i11) || j(i11);
    }

    private boolean l(int i11) {
        if (this.f81788c) {
            return i11 < 10 || i11 > 13;
        }
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    private void m() {
        if (this.f81800o) {
            return;
        }
        this.f81800o = true;
        boolean z11 = this.f81788c;
        this.f81798m.b(new u0.b().g0(z11 ? "audio/amr-wb" : "audio/3gpp").Y(f81785u).J(1).h0(z11 ? 16000 : ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED).G());
    }

    @RequiresNonNull({"extractorOutput"})
    private void n(long j11, int i11) {
        int i12;
        if (this.f81792g) {
            return;
        }
        int i13 = this.f81787b;
        if ((i13 & 1) == 0 || j11 == -1 || !((i12 = this.f81794i) == -1 || i12 == this.f81790e)) {
            z.b bVar = new z.b(-9223372036854775807L);
            this.f81799n = bVar;
            this.f81797l.p(bVar);
            this.f81792g = true;
            return;
        }
        if (this.f81795j >= 20 || i11 == -1) {
            z zVarF = f(j11, (i13 & 2) != 0);
            this.f81799n = zVarF;
            this.f81797l.p(zVarF);
            this.f81792g = true;
        }
    }

    private static boolean o(l lVar, byte[] bArr) {
        lVar.g();
        byte[] bArr2 = new byte[bArr.length];
        lVar.e(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int p(l lVar) throws ParserException {
        lVar.g();
        lVar.e(this.f81786a, 0, 1);
        byte b11 = this.f81786a[0];
        if ((b11 & 131) <= 0) {
            return g((b11 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b11), null);
    }

    private boolean q(l lVar) {
        byte[] bArr = f81783s;
        if (o(lVar, bArr)) {
            this.f81788c = false;
            lVar.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f81784t;
        if (!o(lVar, bArr2)) {
            return false;
        }
        this.f81788c = true;
        lVar.k(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    private int r(l lVar) throws ParserException {
        if (this.f81791f == 0) {
            try {
                int iP = p(lVar);
                this.f81790e = iP;
                this.f81791f = iP;
                if (this.f81794i == -1) {
                    this.f81793h = lVar.getPosition();
                    this.f81794i = this.f81790e;
                }
                if (this.f81794i == this.f81790e) {
                    this.f81795j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f81798m.a(lVar, this.f81791f, true);
        if (iA == -1) {
            return -1;
        }
        int i11 = this.f81791f - iA;
        this.f81791f = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f81798m.e(this.f81796k + this.f81789d, 1, this.f81790e, 0, null);
        this.f81789d += DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        return 0;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f81789d = 0L;
        this.f81790e = 0;
        this.f81791f = 0;
        if (j11 != 0) {
            z zVar = this.f81799n;
            if (zVar instanceof d) {
                this.f81796k = ((d) zVar).e(j11);
                return;
            }
        }
        this.f81796k = 0L;
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f81797l = mVar;
        this.f81798m = mVar.b(0, 1);
        mVar.j();
    }

    @Override // hr.k
    public boolean h(l lVar) {
        return q(lVar);
    }

    @Override // hr.k
    public int i(l lVar, y yVar) throws ParserException {
        c();
        if (lVar.getPosition() == 0 && !q(lVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        m();
        int iR = r(lVar);
        n(lVar.getLength(), iR);
        return iR;
    }

    public b(int i11) {
        this.f81787b = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f81786a = new byte[1];
        this.f81794i = -1;
    }

    @Override // hr.k
    public void release() {
    }
}
