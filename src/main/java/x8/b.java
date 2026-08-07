package x8;

import androidx.media3.common.ParserException;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.EOFException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;
import w8.e0;
import w8.i;
import w8.i0;
import w8.j0;
import w8.n;
import w8.o0;
import w8.p;
import w8.q;
import w8.r;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f123066s = new u() { // from class: x8.a
        @Override // w8.u
        public final p[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f123067t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f123068u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f123069v = q0.E0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f123070w = q0.E0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f123071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f123072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f123073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f123074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f123075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f123076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f123077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f123078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f123079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f123080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f123081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f123082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f123083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f123084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j0 f123085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f123086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f123087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f123088r;

    public b() {
        this(0);
    }

    public static /* synthetic */ p[] b() {
        return new p[]{new b()};
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void c() {
        s7.a.j(this.f123083m);
        q0.l(this.f123082l);
    }

    private static int d(int i11, long j11) {
        return (int) ((((long) i11) * 8000000) / j11);
    }

    private j0 f(long j11, boolean z11) {
        return new i(j11, this.f123078h, d(this.f123079i, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT), this.f123079i, z11);
    }

    private int g(int i11) throws ParserException {
        if (n(i11)) {
            return this.f123074d ? f123068u[i11] : f123067t[i11];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f123074d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i11);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean k(int i11) {
        if (this.f123074d) {
            return false;
        }
        return i11 < 12 || i11 > 14;
    }

    private boolean m(long j11, long j12) {
        return Math.abs(j12 - j11) < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    }

    private boolean n(int i11) {
        if (i11 < 0 || i11 > 15) {
            return false;
        }
        return o(i11) || k(i11);
    }

    private boolean o(int i11) {
        if (this.f123074d) {
            return i11 < 10 || i11 > 13;
        }
        return false;
    }

    @RequiresNonNull({"realTrackOutput"})
    private void p() {
        if (this.f123088r) {
            return;
        }
        this.f123088r = true;
        boolean z11 = this.f123074d;
        String str = z11 ? "audio/amr-wb" : "audio/amr";
        this.f123083m.g(new p7.u.b().W(str).y0(z11 ? "audio/amr-wb" : "audio/3gpp").o0(z11 ? f123068u[8] : f123067t[7]).T(1).z0(z11 ? 16000 : ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED).P());
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private void q(long j11, int i11) {
        int i12;
        if (this.f123085o != null) {
            return;
        }
        int i13 = this.f123072b;
        if ((i13 & 4) != 0) {
            this.f123085o = new e0(new long[]{this.f123078h}, new long[]{0}, -9223372036854775807L);
        } else if ((i13 & 1) == 0 || !((i12 = this.f123079i) == -1 || i12 == this.f123076f)) {
            this.f123085o = new j0.b(-9223372036854775807L);
        } else if (this.f123080j >= 20 || i11 == -1) {
            j0 j0VarF = f(j11, (i13 & 2) != 0);
            this.f123085o = j0VarF;
            this.f123083m.d(j0VarF.g());
        }
        j0 j0Var = this.f123085o;
        if (j0Var != null) {
            this.f123082l.t(j0Var);
        }
    }

    private static boolean r(q qVar, byte[] bArr) {
        qVar.g();
        byte[] bArr2 = new byte[bArr.length];
        qVar.e(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int s(q qVar) throws ParserException {
        qVar.g();
        qVar.e(this.f123071a, 0, 1);
        byte b11 = this.f123071a[0];
        if ((b11 & 131) <= 0) {
            return g((b11 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b11), null);
    }

    private boolean t(q qVar) {
        byte[] bArr = f123069v;
        if (r(qVar, bArr)) {
            this.f123074d = false;
            qVar.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f123070w;
        if (!r(qVar, bArr2)) {
            return false;
        }
        this.f123074d = true;
        qVar.k(bArr2.length);
        return true;
    }

    @RequiresNonNull({"realTrackOutput"})
    private int u(q qVar) throws ParserException {
        if (this.f123077g == 0) {
            try {
                int iS = s(qVar);
                this.f123076f = iS;
                this.f123077g = iS;
                if (this.f123079i == -1) {
                    this.f123078h = qVar.getPosition();
                    this.f123079i = this.f123076f;
                }
                if (this.f123079i == this.f123076f) {
                    this.f123080j++;
                }
                j0 j0Var = this.f123085o;
                if (j0Var instanceof e0) {
                    e0 e0Var = (e0) j0Var;
                    long j11 = this.f123081k + this.f123075e + DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                    long position = qVar.getPosition() + ((long) this.f123076f);
                    if (!e0Var.e(j11, 100000L)) {
                        e0Var.a(j11, position);
                    }
                    if (this.f123086p && m(j11, this.f123087q)) {
                        this.f123086p = false;
                        this.f123084n = this.f123083m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iE = this.f123084n.e(qVar, this.f123077g, true);
        if (iE == -1) {
            return -1;
        }
        int i11 = this.f123077g - iE;
        this.f123077g = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f123084n.b(this.f123081k + this.f123075e, 1, this.f123076f, 0, null);
        this.f123075e += DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        return 0;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f123075e = 0L;
        this.f123076f = 0;
        this.f123077g = 0;
        this.f123087q = j12;
        j0 j0Var = this.f123085o;
        if (!(j0Var instanceof e0)) {
            if (j11 == 0 || !(j0Var instanceof i)) {
                this.f123081k = 0L;
                return;
            } else {
                this.f123081k = ((i) j0Var).e(j11);
                return;
            }
        }
        long jB = ((e0) j0Var).b(j11);
        this.f123081k = jB;
        if (m(jB, this.f123087q)) {
            return;
        }
        this.f123086p = true;
        this.f123084n = this.f123073c;
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f123082l = rVar;
        o0 o0VarB = rVar.b(0, 1);
        this.f123083m = o0VarB;
        this.f123084n = o0VarB;
        rVar.j();
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) throws ParserException {
        c();
        if (qVar.getPosition() == 0 && !t(qVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        p();
        int iU = u(qVar);
        q(qVar.getLength(), iU);
        if (iU == -1) {
            j0 j0Var = this.f123085o;
            if (j0Var instanceof e0) {
                long j11 = this.f123081k + this.f123075e;
                ((e0) j0Var).h(j11);
                this.f123082l.t(this.f123085o);
                this.f123083m.d(j11);
            }
        }
        return iU;
    }

    @Override // w8.p
    public boolean l(q qVar) {
        return t(qVar);
    }

    public b(int i11) {
        this.f123072b = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f123071a = new byte[1];
        this.f123079i = -1;
        n nVar = new n();
        this.f123073c = nVar;
        this.f123084n = nVar;
    }

    @Override // w8.p
    public void release() {
    }
}
