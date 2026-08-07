package el;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bm.l;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import ll.p;
import ll.s;
import nm.x;
import pk.i;
import pk.k;
import pk.n;
import um.m;

/* JADX INFO: loaded from: classes3.dex */
public class e extends il.a<tk.a<um.e>, m> {
    private static final Class<?> M = e.class;
    private final tm.a A;
    private final pk.f<tm.a> B;
    private final x<jk.d, um.e> C;
    private jk.d D;
    private n<com.facebook.datasource.c<tk.a<um.e>>> E;
    private boolean F;
    private pk.f<tm.a> G;
    private fl.a H;
    private Set<wm.e> I;
    private com.facebook.imagepipeline.request.a J;
    private com.facebook.imagepipeline.request.a[] K;
    private com.facebook.imagepipeline.request.a L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Resources f63040z;

    public e(Resources resources, hl.a aVar, tm.a aVar2, tm.a aVar3, Executor executor, x<jk.d, um.e> xVar, pk.f<tm.a> fVar) {
        super(aVar, executor, null, null);
        this.f63040z = resources;
        this.A = new a(resources, aVar2, aVar3);
        this.B = fVar;
        this.C = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p l0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof p) {
            return (p) drawable;
        }
        if (drawable instanceof ll.c) {
            return l0(((ll.c) drawable).a());
        }
        if (drawable instanceof ll.a) {
            ll.a aVar = (ll.a) drawable;
            int iD = aVar.d();
            for (int i11 = 0; i11 < iD; i11++) {
                p pVarL0 = l0(aVar.b(i11));
                if (pVarL0 != null) {
                    return pVarL0;
                }
            }
        }
        return null;
    }

    private void r0(n<com.facebook.datasource.c<tk.a<um.e>>> nVar) {
        this.E = nVar;
        v0(null);
    }

    private Drawable u0(pk.f<tm.a> fVar, um.e eVar) {
        Drawable drawableA;
        if (fVar == null) {
            return null;
        }
        for (tm.a aVar : fVar) {
            if (aVar.b(eVar) && (drawableA = aVar.a(eVar)) != null) {
                return drawableA;
            }
        }
        return null;
    }

    private void v0(um.e eVar) {
        if (this.F) {
            if (r() == null) {
                jl.a aVar = new jl.a();
                j(new kl.a(aVar));
                b0(aVar);
            }
            if (r() instanceof jl.a) {
                C0(eVar, (jl.a) r());
            }
        }
    }

    public void A0(pk.f<tm.a> fVar) {
        this.G = fVar;
    }

    public void B0(boolean z11) {
        this.F = z11;
    }

    protected void C0(um.e eVar, jl.a aVar) {
        p pVarL0;
        aVar.j(v());
        ol.b bVarF = f();
        s sVarB = null;
        if (bVarF != null && (pVarL0 = l0(bVarF.b())) != null) {
            sVarB = pVarL0.getMScaleType();
        }
        aVar.m(sVarB);
        String strN0 = n0();
        if (strN0 != null) {
            aVar.b("cc", strN0);
        }
        if (eVar == null) {
            aVar.i();
        } else {
            aVar.k(eVar.getWidth(), eVar.getHeight());
            aVar.l(eVar.v());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // il.a
    protected void P(Drawable drawable) {
        if (drawable instanceof cl.a) {
            ((cl.a) drawable).a();
        }
    }

    @Override // il.a, ol.a
    public void e(ol.b bVar) {
        super.e(bVar);
        v0(null);
    }

    public synchronized void j0(wm.e eVar) {
        try {
            if (this.I == null) {
                this.I = new HashSet();
            }
            this.I.add(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public Drawable l(tk.a<um.e> aVar) {
        try {
            if (bn.b.d()) {
                bn.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(tk.a.b0(aVar));
            um.e eVarH = aVar.H();
            v0(eVarH);
            Drawable drawableU0 = u0(this.G, eVarH);
            if (drawableU0 != null) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                return drawableU0;
            }
            Drawable drawableU1 = u0(this.B, eVarH);
            if (drawableU1 != null) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                return drawableU1;
            }
            Drawable drawableA = this.A.a(eVarH);
            if (drawableA != null) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + eVarH);
        } catch (Throwable th2) {
            if (bn.b.d()) {
                bn.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public tk.a<um.e> n() {
        jk.d dVar;
        if (bn.b.d()) {
            bn.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x<jk.d, um.e> xVar = this.C;
            if (xVar != null && (dVar = this.D) != null) {
                tk.a<um.e> aVar = xVar.get(dVar);
                if (aVar == null || aVar.H().o3().a()) {
                    return aVar;
                }
                aVar.close();
                return null;
            }
            return null;
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    protected String n0() {
        Object objO = o();
        if (objO == null) {
            return null;
        }
        return objO.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public int x(tk.a<um.e> aVar) {
        if (aVar != null) {
            return aVar.I();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public m y(tk.a<um.e> aVar) {
        k.i(tk.a.b0(aVar));
        return aVar.H().z();
    }

    public synchronized wm.e q0() {
        Set<wm.e> set = this.I;
        if (set == null) {
            return null;
        }
        return new wm.c(set);
    }

    @Override // il.a
    protected com.facebook.datasource.c<tk.a<um.e>> s() {
        if (bn.b.d()) {
            bn.b.a("PipelineDraweeController#getDataSource");
        }
        if (qk.a.w(2)) {
            qk.a.y(M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.c<tk.a<um.e>> cVar = this.E.get();
        if (bn.b.d()) {
            bn.b.b();
        }
        return cVar;
    }

    public void s0(n<com.facebook.datasource.c<tk.a<um.e>>> nVar, String str, jk.d dVar, Object obj, pk.f<tm.a> fVar) {
        if (bn.b.d()) {
            bn.b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        r0(nVar);
        this.D = dVar;
        A0(fVar);
        v0(null);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    protected synchronized void t0(bm.g gVar, il.b<f, com.facebook.imagepipeline.request.a, tk.a<um.e>, m> bVar) {
        try {
            fl.a aVar = this.H;
            if (aVar != null) {
                aVar.f();
            }
            if (gVar != null) {
                if (this.H == null) {
                    this.H = new fl.a(AwakeTimeSinceBootClock.get(), this);
                }
                this.H.c(gVar);
                this.H.g(true);
            }
            this.J = bVar.n();
            this.K = bVar.m();
            this.L = bVar.o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // il.a
    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.E).toString();
    }

    @Override // il.a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> K(m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void M(String str, tk.a<um.e> aVar) {
        super.M(str, aVar);
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.a
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void R(tk.a<um.e> aVar) {
        tk.a.C(aVar);
    }

    @Override // il.a
    protected Uri z() {
        return l.a(this.J, this.L, this.K, com.facebook.imagepipeline.request.a.A);
    }

    public synchronized void z0(wm.e eVar) {
        Set<wm.e> set = this.I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }
}
