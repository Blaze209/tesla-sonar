package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.d0;
import androidx.work.r0;
import com.google.common.util.concurrent.s;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import lb.e1;
import lb.l1;
import tb.l0;
import tb.n0;
import xb.k;
import xb.l;
import xb.n;
import xb.o;
import xb.p;
import xb.q;

/* JADX INFO: loaded from: classes3.dex */
public class g extends androidx.work.multiprocess.b.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static byte[] f14717o = new byte[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e1 f14718n;

    class a extends androidx.work.multiprocess.d<d0.b.c> {
        a(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class b extends androidx.work.multiprocess.d<d0.b.c> {
        b(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class c extends androidx.work.multiprocess.d<d0.b.c> {
        c(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class d extends androidx.work.multiprocess.d<d0.b.c> {
        d(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class e extends androidx.work.multiprocess.d<d0.b.c> {
        e(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class f extends androidx.work.multiprocess.d<d0.b.c> {
        f(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    /* JADX INFO: renamed from: androidx.work.multiprocess.g$g, reason: collision with other inner class name */
    class C0254g extends androidx.work.multiprocess.d<d0.b.c> {
        C0254g(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(d0.b.c cVar) {
            return g.f14717o;
        }
    }

    class h extends androidx.work.multiprocess.d<List<r0>> {
        h(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(List<r0> list) {
            return xb.a.a(new n(list));
        }
    }

    class i extends androidx.work.multiprocess.d<Void> {
        i(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(Void r11) {
            return g.f14717o;
        }
    }

    class j extends androidx.work.multiprocess.d<Void> {
        j(Executor executor, androidx.work.multiprocess.c cVar, s sVar) {
            super(executor, cVar, sVar);
        }

        @Override // androidx.work.multiprocess.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(Void r11) {
            return g.f14717o;
        }
    }

    g(Context context) {
        this.f14718n = e1.s(context);
    }

    @Override // androidx.work.multiprocess.b
    public void A2(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            xb.f fVar = (xb.f) xb.a.b(bArr, xb.f.CREATOR);
            ub.b bVarA = this.f14718n.A();
            new j(bVarA.d(), cVar, new l0(this.f14718n.y(), this.f14718n.u(), bVarA).a(this.f14718n.p(), UUID.fromString(fVar.getId()), fVar.a())).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void I(String str, androidx.work.multiprocess.c cVar) {
        try {
            new f(this.f14718n.A().d(), cVar, this.f14718n.m(str).getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void M1(String str, androidx.work.multiprocess.c cVar) {
        try {
            new d(this.f14718n.A().d(), cVar, this.f14718n.n(UUID.fromString(str)).getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void g1(String str, androidx.work.multiprocess.c cVar) {
        try {
            new e(this.f14718n.A().d(), cVar, this.f14718n.l(str).getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void h0(String str, byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            new a(this.f14718n.A().d(), cVar, l1.e(this.f14718n, str, ((p) xb.a.b(bArr, p.CREATOR)).a()).getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void q1(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            new b(this.f14718n.A().d(), cVar, this.f14718n.b(((q) xb.a.b(bArr, q.CREATOR)).a()).getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void r1(androidx.work.multiprocess.c cVar) {
        try {
            new C0254g(this.f14718n.A().d(), cVar, this.f14718n.k().getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void v0(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            k kVar = (k) xb.a.b(bArr, k.CREATOR);
            Context contextP = this.f14718n.p();
            ub.b bVarA = this.f14718n.A();
            new i(bVarA.d(), cVar, new n0(this.f14718n.y(), bVarA).a(contextP, UUID.fromString(kVar.getId()), kVar.a())).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void v2(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            new h(this.f14718n.A().d(), cVar, this.f14718n.z(((o) xb.a.b(bArr, o.CREATOR)).a())).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }

    @Override // androidx.work.multiprocess.b
    public void y0(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            new c(this.f14718n.A().d(), cVar, ((l) xb.a.b(bArr, l.CREATOR)).b(this.f14718n).b().getResult()).a();
        } catch (Throwable th2) {
            androidx.work.multiprocess.d.a.a(cVar, th2);
        }
    }
}
