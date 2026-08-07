package k8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.m2;
import androidx.media3.exoplayer.source.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p7.f0;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Handler.Callback {
    private long A;
    private f0 B;
    private long C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f85318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f85319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Handler f85320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f9.b f85321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f85322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private f9.a f85323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f85324y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f85325z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f85317a);
    }

    private void q0(f0 f0Var, List<f0.a> list) {
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            u uVarH = f0Var.d(i11).H();
            if (uVarH == null || !this.f85318s.b(uVarH)) {
                list.add(f0Var.d(i11));
            } else {
                f9.a aVarA = this.f85318s.a(uVarH);
                byte[] bArr = (byte[]) s7.a.f(f0Var.d(i11).C());
                this.f85321v.f();
                this.f85321v.p(bArr.length);
                ((ByteBuffer) q0.l(this.f85321v.f9286d)).put(bArr);
                this.f85321v.q();
                f0 f0VarA = aVarA.a(this.f85321v);
                if (f0VarA != null) {
                    q0(f0VarA, list);
                }
            }
        }
    }

    @SideEffectFree
    private long r0(long j11) {
        s7.a.h(j11 != -9223372036854775807L);
        s7.a.h(this.C != -9223372036854775807L);
        return j11 - this.C;
    }

    private void s0(f0 f0Var) {
        Handler handler = this.f85320u;
        if (handler != null) {
            handler.obtainMessage(1, f0Var).sendToTarget();
        } else {
            t0(f0Var);
        }
    }

    private void t0(f0 f0Var) {
        this.f85319t.t(f0Var);
    }

    private boolean u0(long j11) {
        boolean z11;
        f0 f0Var = this.B;
        if (f0Var == null || (!this.f85322w && f0Var.f101338b > r0(j11))) {
            z11 = false;
        } else {
            s0(this.B);
            this.B = null;
            z11 = true;
        }
        if (this.f85324y && this.B == null) {
            this.f85325z = true;
        }
        return z11;
    }

    private void v0() {
        if (this.f85324y || this.B != null) {
            return;
        }
        this.f85321v.f();
        z7.u uVarU = U();
        int iN0 = n0(uVarU, this.f85321v, 0);
        if (iN0 != -4) {
            if (iN0 == -5) {
                this.A = ((u) s7.a.f(uVarU.f127112b)).f101549t;
                return;
            }
            return;
        }
        if (this.f85321v.i()) {
            this.f85324y = true;
            return;
        }
        if (this.f85321v.f9288f >= W()) {
            f9.b bVar = this.f85321v;
            bVar.f64593j = this.A;
            bVar.q();
            f0 f0VarA = ((f9.a) q0.l(this.f85323x)).a(this.f85321v);
            if (f0VarA != null) {
                ArrayList arrayList = new ArrayList(f0VarA.e());
                q0(f0VarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.B = new f0(r0(this.f85321v.f9288f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean a() {
        return this.f85325z;
    }

    @Override // androidx.media3.exoplayer.m2
    public int b(u uVar) {
        if (this.f85318s.b(uVar)) {
            return m2.g(uVar.P == 0 ? 4 : 2);
        }
        return m2.g(0);
    }

    @Override // androidx.media3.exoplayer.h
    protected void c0() {
        this.B = null;
        this.f85323x = null;
        this.C = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.l2
    public void d(long j11, long j12) {
        boolean zU0 = true;
        while (zU0) {
            v0();
            zU0 = u0(j11);
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) {
        this.B = null;
        this.f85324y = false;
        this.f85325z = false;
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        t0((f0) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.h
    protected void l0(u[] uVarArr, long j11, long j12, r.b bVar) {
        this.f85323x = this.f85318s.a(uVarArr[0]);
        f0 f0Var = this.B;
        if (f0Var != null) {
            this.B = f0Var.c((f0Var.f101338b + this.C) - j12);
        }
        this.C = j12;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z11) {
        super(5);
        this.f85319t = (b) s7.a.f(bVar);
        this.f85320u = looper == null ? null : q0.B(looper, this);
        this.f85318s = (a) s7.a.f(aVar);
        this.f85322w = z11;
        this.f85321v = new f9.b();
        this.C = -9223372036854775807L;
    }
}
