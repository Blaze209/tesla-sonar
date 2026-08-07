package ur;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import br.r;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f extends com.google.android.exoplayer2.f implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f116512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e f116513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f116514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f116515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f116516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f116517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f116518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f116519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f116520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f116521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f116522z;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f116510a);
    }

    private void a0(a aVar, List<a.b> list) {
        for (int i11 = 0; i11 < aVar.e(); i11++) {
            u0 u0VarH = aVar.d(i11).H();
            if (u0VarH == null || !this.f116512p.b(u0VarH)) {
                list.add(aVar.d(i11));
            } else {
                b bVarA = this.f116512p.a(u0VarH);
                byte[] bArr = (byte[]) ts.a.e(aVar.d(i11).C());
                this.f116515s.f();
                this.f116515s.q(bArr.length);
                ((ByteBuffer) p0.j(this.f116515s.f39720c)).put(bArr);
                this.f116515s.r();
                a aVarA = bVarA.a(this.f116515s);
                if (aVarA != null) {
                    a0(aVarA, list);
                }
            }
        }
    }

    @SideEffectFree
    private long b0(long j11) {
        ts.a.g(j11 != -9223372036854775807L);
        ts.a.g(this.f116522z != -9223372036854775807L);
        return j11 - this.f116522z;
    }

    private void c0(a aVar) {
        Handler handler = this.f116514r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            d0(aVar);
        }
    }

    private void d0(a aVar) {
        this.f116513q.onMetadata(aVar);
    }

    private boolean e0(long j11) {
        boolean z11;
        a aVar = this.f116521y;
        if (aVar == null || (!this.f116516t && aVar.f116509b > b0(j11))) {
            z11 = false;
        } else {
            c0(this.f116521y);
            this.f116521y = null;
            z11 = true;
        }
        if (this.f116518v && this.f116521y == null) {
            this.f116519w = true;
        }
        return z11;
    }

    private void f0() {
        if (this.f116518v || this.f116521y != null) {
            return;
        }
        this.f116515s.f();
        r rVarJ = J();
        int iX = X(rVarJ, this.f116515s, 0);
        if (iX != -4) {
            if (iX == -5) {
                this.f116520x = ((u0) ts.a.e(rVarJ.f17943b)).f40716p;
            }
        } else {
            if (this.f116515s.k()) {
                this.f116518v = true;
                return;
            }
            d dVar = this.f116515s;
            dVar.f116511i = this.f116520x;
            dVar.r();
            a aVarA = ((b) p0.j(this.f116517u)).a(this.f116515s);
            if (aVarA != null) {
                ArrayList arrayList = new ArrayList(aVarA.e());
                a0(aVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f116521y = new a(b0(this.f116515s.f39722e), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void O() {
        this.f116521y = null;
        this.f116517u = null;
        this.f116522z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) {
        this.f116521y = null;
        this.f116518v = false;
        this.f116519w = false;
    }

    @Override // com.google.android.exoplayer2.f
    protected void W(u0[] u0VarArr, long j11, long j12) {
        this.f116517u = this.f116512p.a(u0VarArr[0]);
        a aVar = this.f116521y;
        if (aVar != null) {
            this.f116521y = aVar.c((aVar.f116509b + this.f116522z) - j12);
        }
        this.f116522z = j12;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean a() {
        return this.f116519w;
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(u0 u0Var) {
        if (this.f116512p.b(u0Var)) {
            return a2.g(u0Var.G == 0 ? 4 : 2);
        }
        return a2.g(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public void d(long j11, long j12) {
        boolean zE0 = true;
        while (zE0) {
            f0();
            zE0 = e0(j11);
        }
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        d0((a) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean isReady() {
        return true;
    }

    public f(e eVar, Looper looper, c cVar) {
        this(eVar, looper, cVar, false);
    }

    public f(e eVar, Looper looper, c cVar, boolean z11) {
        super(5);
        this.f116513q = (e) ts.a.e(eVar);
        this.f116514r = looper == null ? null : p0.u(looper, this);
        this.f116512p = (c) ts.a.e(cVar);
        this.f116516t = z11;
        this.f116515s = new d();
        this.f116522z = -9223372036854775807L;
    }
}
