package gs;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import br.r;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p extends com.google.android.exoplayer2.f implements Handler.Callback {
    private n A;
    private n B;
    private int C;
    private long D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f69538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o f69539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f69540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r f69541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f69542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f69544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f69545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private u0 f69546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j f69547y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m f69548z;

    public p(o oVar, Looper looper) {
        this(oVar, looper, k.f69523a);
    }

    private void a0() {
        l0(new f(x.r(), d0(this.F)));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long b0(long j11) {
        int iC = this.A.c(j11);
        if (iC == 0 || this.A.b() == 0) {
            return this.A.f66354b;
        }
        if (iC != -1) {
            return this.A.a(iC - 1);
        }
        n nVar = this.A;
        return nVar.a(nVar.b() - 1);
    }

    private long c0() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        ts.a.e(this.A);
        if (this.C >= this.A.b()) {
            return Long.MAX_VALUE;
        }
        return this.A.a(this.C);
    }

    @SideEffectFree
    private long d0(long j11) {
        ts.a.g(j11 != -9223372036854775807L);
        ts.a.g(this.E != -9223372036854775807L);
        return j11 - this.E;
    }

    private void e0(SubtitleDecoderException subtitleDecoderException) {
        u.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f69546x, subtitleDecoderException);
        a0();
        j0();
    }

    private void f0() {
        this.f69544v = true;
        this.f69547y = this.f69540r.a((u0) ts.a.e(this.f69546x));
    }

    private void g0(f fVar) {
        this.f69539q.onCues(fVar.f69511a);
        this.f69539q.onCues(fVar);
    }

    private void h0() {
        this.f69548z = null;
        this.C = -1;
        n nVar = this.A;
        if (nVar != null) {
            nVar.p();
            this.A = null;
        }
        n nVar2 = this.B;
        if (nVar2 != null) {
            nVar2.p();
            this.B = null;
        }
    }

    private void i0() {
        h0();
        ((j) ts.a.e(this.f69547y)).release();
        this.f69547y = null;
        this.f69545w = 0;
    }

    private void j0() {
        i0();
        f0();
    }

    private void l0(f fVar) {
        Handler handler = this.f69538p;
        if (handler != null) {
            handler.obtainMessage(0, fVar).sendToTarget();
        } else {
            g0(fVar);
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void O() {
        this.f69546x = null;
        this.D = -9223372036854775807L;
        a0();
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        i0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) {
        this.F = j11;
        a0();
        this.f69542t = false;
        this.f69543u = false;
        this.D = -9223372036854775807L;
        if (this.f69545w != 0) {
            j0();
        } else {
            h0();
            ((j) ts.a.e(this.f69547y)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void W(u0[] u0VarArr, long j11, long j12) {
        this.E = j12;
        this.f69546x = u0VarArr[0];
        if (this.f69547y != null) {
            this.f69545w = 1;
        } else {
            f0();
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean a() {
        return this.f69543u;
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(u0 u0Var) {
        if (this.f69540r.b(u0Var)) {
            return a2.g(u0Var.G == 0 ? 4 : 2);
        }
        return y.n(u0Var.f40712l) ? a2.g(1) : a2.g(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public void d(long j11, long j12) {
        boolean z11;
        this.F = j11;
        if (l()) {
            long j13 = this.D;
            if (j13 != -9223372036854775807L && j11 >= j13) {
                h0();
                this.f69543u = true;
            }
        }
        if (this.f69543u) {
            return;
        }
        if (this.B == null) {
            ((j) ts.a.e(this.f69547y)).c(j11);
            try {
                this.B = ((j) ts.a.e(this.f69547y)).a();
            } catch (SubtitleDecoderException e11) {
                e0(e11);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.A != null) {
            long jC0 = c0();
            z11 = false;
            while (jC0 <= j11) {
                this.C++;
                jC0 = c0();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        n nVar = this.B;
        if (nVar != null) {
            if (nVar.k()) {
                if (!z11 && c0() == Long.MAX_VALUE) {
                    if (this.f69545w == 2) {
                        j0();
                    } else {
                        h0();
                        this.f69543u = true;
                    }
                }
            } else if (nVar.f66354b <= j11) {
                n nVar2 = this.A;
                if (nVar2 != null) {
                    nVar2.p();
                }
                this.C = nVar.c(j11);
                this.A = nVar;
                this.B = null;
                z11 = true;
            }
        }
        if (z11) {
            ts.a.e(this.A);
            l0(new f(this.A.d(j11), d0(b0(j11))));
        }
        if (this.f69545w == 2) {
            return;
        }
        while (!this.f69542t) {
            try {
                m mVarB = this.f69548z;
                if (mVarB == null) {
                    mVarB = ((j) ts.a.e(this.f69547y)).b();
                    if (mVarB == null) {
                        return;
                    } else {
                        this.f69548z = mVarB;
                    }
                }
                if (this.f69545w == 1) {
                    mVarB.o(4);
                    ((j) ts.a.e(this.f69547y)).d(mVarB);
                    this.f69548z = null;
                    this.f69545w = 2;
                    return;
                }
                int iX = X(this.f69541s, mVarB, 0);
                if (iX == -4) {
                    if (mVarB.k()) {
                        this.f69542t = true;
                        this.f69544v = false;
                    } else {
                        u0 u0Var = this.f69541s.f17943b;
                        if (u0Var == null) {
                            return;
                        }
                        mVarB.f69535i = u0Var.f40716p;
                        mVarB.r();
                        this.f69544v &= !mVarB.m();
                    }
                    if (!this.f69544v) {
                        ((j) ts.a.e(this.f69547y)).d(mVarB);
                        this.f69548z = null;
                    }
                } else if (iX == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e12) {
                e0(e12);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        g0((f) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean isReady() {
        return true;
    }

    public void k0(long j11) {
        ts.a.g(l());
        this.D = j11;
    }

    public p(o oVar, Looper looper, k kVar) {
        super(3);
        this.f69539q = (o) ts.a.e(oVar);
        this.f69538p = looper == null ? null : p0.u(looper, this);
        this.f69540r = kVar;
        this.f69541s = new r();
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
    }
}
