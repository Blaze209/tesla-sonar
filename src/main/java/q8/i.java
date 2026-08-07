package q8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.m2;
import androidx.media3.exoplayer.source.r;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p7.g0;
import s7.q0;
import s7.t;
import t9.j;
import t9.k;
import t9.n;
import t9.o;
import z7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends androidx.media3.exoplayer.h implements Handler.Callback {
    private o A;
    private o B;
    private int C;
    private final Handler D;
    private final h E;
    private final u F;
    private boolean G;
    private boolean H;
    private p7.u I;
    private long J;
    private long K;
    private boolean L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t9.a f104897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f104898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f104899u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g f104900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f104901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f104902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k f104903y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private n f104904z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f104895a);
    }

    @RequiresNonNull({"this.cuesResolver"})
    private boolean A0(long j11) {
        if (this.G || n0(this.F, this.f104898t, 0) != -4) {
            return false;
        }
        if (this.f104898t.i()) {
            this.G = true;
            return false;
        }
        this.f104898t.q();
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(this.f104898t.f9286d);
        t9.d dVarA = this.f104897s.a(this.f104898t.f9288f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f104898t.f();
        return this.f104899u.e(dVarA, j11);
    }

    private void B0() {
        this.f104904z = null;
        this.C = -1;
        o oVar = this.A;
        if (oVar != null) {
            oVar.o();
            this.A = null;
        }
        o oVar2 = this.B;
        if (oVar2 != null) {
            oVar2.o();
            this.B = null;
        }
    }

    private void C0() {
        B0();
        ((k) s7.a.f(this.f104903y)).release();
        this.f104903y = null;
        this.f104902x = 0;
    }

    @RequiresNonNull({"this.cuesResolver"})
    private void D0(long j11) {
        boolean zA0 = A0(j11);
        long jB = this.f104899u.b(this.J);
        if (jB == Long.MIN_VALUE && this.G && !zA0) {
            this.H = true;
        }
        if (jB != Long.MIN_VALUE && jB <= j11) {
            zA0 = true;
        }
        if (zA0) {
            x<r7.a> xVarA = this.f104899u.a(j11);
            long jD = this.f104899u.d(j11);
            H0(new r7.e(xVarA, u0(jD)));
            this.f104899u.c(jD);
        }
        this.J = j11;
    }

    private void E0(long j11) {
        boolean z11;
        this.J = j11;
        if (this.B == null) {
            ((k) s7.a.f(this.f104903y)).c(j11);
            try {
                this.B = ((k) s7.a.f(this.f104903y)).a();
            } catch (SubtitleDecoderException e11) {
                v0(e11);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.A != null) {
            long jT0 = t0();
            z11 = false;
            while (jT0 <= j11) {
                this.C++;
                jT0 = t0();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        o oVar = this.B;
        if (oVar != null) {
            if (oVar.i()) {
                if (!z11 && t0() == Long.MAX_VALUE) {
                    if (this.f104902x == 2) {
                        F0();
                    } else {
                        B0();
                        this.H = true;
                    }
                }
            } else if (oVar.f125193b <= j11) {
                o oVar2 = this.A;
                if (oVar2 != null) {
                    oVar2.o();
                }
                this.C = oVar.c(j11);
                this.A = oVar;
                this.B = null;
                z11 = true;
            }
        }
        if (z11) {
            s7.a.f(this.A);
            H0(new r7.e(this.A.d(j11), u0(s0(j11))));
        }
        if (this.f104902x == 2) {
            return;
        }
        while (!this.G) {
            try {
                n nVarB = this.f104904z;
                if (nVarB == null) {
                    nVarB = ((k) s7.a.f(this.f104903y)).b();
                    if (nVarB == null) {
                        return;
                    } else {
                        this.f104904z = nVarB;
                    }
                }
                if (this.f104902x == 1) {
                    nVarB.n(4);
                    ((k) s7.a.f(this.f104903y)).d(nVarB);
                    this.f104904z = null;
                    this.f104902x = 2;
                    return;
                }
                int iN0 = n0(this.F, nVarB, 0);
                if (iN0 == -4) {
                    if (nVarB.i()) {
                        this.G = true;
                        this.f104901w = false;
                    } else {
                        p7.u uVar = this.F.f127112b;
                        if (uVar == null) {
                            return;
                        }
                        nVarB.f112978j = uVar.f101549t;
                        nVarB.q();
                        this.f104901w &= !nVarB.k();
                    }
                    if (!this.f104901w) {
                        ((k) s7.a.f(this.f104903y)).d(nVarB);
                        this.f104904z = null;
                    }
                } else if (iN0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e12) {
                v0(e12);
                return;
            }
        }
    }

    private void F0() {
        C0();
        x0();
    }

    private void H0(r7.e eVar) {
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, eVar).sendToTarget();
        } else {
            y0(eVar);
        }
    }

    @RequiresNonNull({"streamFormat"})
    private void q0() {
        s7.a.i(this.L || Objects.equals(this.I.f101544o, "application/cea-608") || Objects.equals(this.I.f101544o, "application/x-mp4-cea-608") || Objects.equals(this.I.f101544o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.I.f101544o + " samples (expected application/x-media3-cues).");
    }

    private void r0() {
        H0(new r7.e(x.r(), u0(this.J)));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long s0(long j11) {
        int iC = this.A.c(j11);
        if (iC == 0 || this.A.b() == 0) {
            return this.A.f125193b;
        }
        if (iC != -1) {
            return this.A.a(iC - 1);
        }
        o oVar = this.A;
        return oVar.a(oVar.b() - 1);
    }

    private long t0() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        s7.a.f(this.A);
        if (this.C >= this.A.b()) {
            return Long.MAX_VALUE;
        }
        return this.A.a(this.C);
    }

    @SideEffectFree
    private long u0(long j11) {
        s7.a.h(j11 != -9223372036854775807L);
        return j11 - Z();
    }

    private void v0(SubtitleDecoderException subtitleDecoderException) {
        t.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, subtitleDecoderException);
        r0();
        F0();
    }

    private static boolean w0(j jVar, long j11) {
        return jVar != null && jVar.b() > 0 && jVar.a(jVar.b() - 1) > j11;
    }

    private void x0() {
        this.f104901w = true;
        k kVarA = this.f104900v.a((p7.u) s7.a.f(this.I));
        this.f104903y = kVarA;
        kVarA.e(W());
    }

    private void y0(r7.e eVar) {
        this.E.onCues(eVar.f107106a);
        this.E.B(eVar);
    }

    @SideEffectFree
    private static boolean z0(p7.u uVar) {
        return Objects.equals(uVar.f101544o, "application/x-media3-cues");
    }

    public void G0(long j11) {
        s7.a.h(l());
        this.K = j11;
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean a() {
        return this.H;
    }

    @Override // androidx.media3.exoplayer.m2
    public int b(p7.u uVar) {
        if (z0(uVar) || this.f104900v.b(uVar)) {
            return m2.g(uVar.P == 0 ? 4 : 2);
        }
        return g0.s(uVar.f101544o) ? m2.g(1) : m2.g(0);
    }

    @Override // androidx.media3.exoplayer.h
    protected void c0() {
        this.I = null;
        this.K = -9223372036854775807L;
        r0();
        this.J = -9223372036854775807L;
        if (this.f104903y != null) {
            C0();
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public void d(long j11, long j12) {
        if (l()) {
            long j13 = this.K;
            if (j13 != -9223372036854775807L && j11 >= j13) {
                B0();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        if (z0((p7.u) s7.a.f(this.I))) {
            s7.a.f(this.f104899u);
            D0(j11);
        } else {
            q0();
            E0(j11);
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) {
        this.J = j11;
        a aVar = this.f104899u;
        if (aVar != null) {
            aVar.clear();
        }
        r0();
        this.G = false;
        this.H = false;
        this.K = -9223372036854775807L;
        p7.u uVar = this.I;
        if (uVar == null || z0(uVar)) {
            return;
        }
        if (this.f104902x != 0) {
            F0();
            return;
        }
        B0();
        k kVar = (k) s7.a.f(this.f104903y);
        kVar.flush();
        kVar.e(W());
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        y0((r7.e) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean isReady() {
        p7.u uVar = this.I;
        if (uVar == null) {
            return true;
        }
        if (!z0((p7.u) s7.a.f(uVar))) {
            return !this.H && (!this.G || w0(this.A, this.J) || w0(this.B, this.J) || this.f104904z == null);
        }
        if (((a) s7.a.f(this.f104899u)).b(this.J) != Long.MIN_VALUE) {
            return true;
        }
        try {
            w();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void l0(p7.u[] uVarArr, long j11, long j12, r.b bVar) {
        p7.u uVar = uVarArr[0];
        this.I = uVar;
        if (z0(uVar)) {
            this.f104899u = this.I.M == 1 ? new e() : new f();
            return;
        }
        q0();
        if (this.f104903y != null) {
            this.f104902x = 1;
        } else {
            x0();
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.E = (h) s7.a.f(hVar);
        this.D = looper == null ? null : q0.B(looper, this);
        this.f104900v = gVar;
        this.f104897s = new t9.a();
        this.f104898t = new DecoderInputBuffer(1);
        this.F = new u();
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.L = false;
    }
}
