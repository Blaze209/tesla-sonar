package q0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.j0;
import c0.o1;
import c0.y0;
import h0.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p0.n0;
import p0.r0;
import p0.z0;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final r0 f104171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final j0 f104172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final j0 f104173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f104174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f104175e;

    class a implements j0.c<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f104176a;

        a(n0 n0Var) {
            this.f104176a = n0Var;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(o1 o1Var) {
            u5.h.g(o1Var);
            try {
                r.this.f104171a.c(o1Var);
            } catch (ProcessingException e11) {
                y0.d("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
            }
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (this.f104176a.t() == 2 && (th2 instanceof CancellationException)) {
                y0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            y0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.b(this.f104176a.t()), th2);
        }
    }

    public static abstract class b {
        @NonNull
        public static b d(@NonNull n0 n0Var, @NonNull n0 n0Var2, @NonNull List<d> list) {
            return new q0.b(n0Var, n0Var2, list);
        }

        @NonNull
        public abstract List<d> a();

        @NonNull
        public abstract n0 b();

        @NonNull
        public abstract n0 c();
    }

    public static class c extends HashMap<d, n0> {
    }

    public r(@NonNull j0 j0Var, @NonNull j0 j0Var2, @NonNull r0 r0Var) {
        this.f104172b = j0Var;
        this.f104173c = j0Var2;
        this.f104171a = r0Var;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f104174d;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@NonNull j0 j0Var, @NonNull j0 j0Var2, @NonNull n0 n0Var, @NonNull n0 n0Var2, Map.Entry<d, n0> entry) {
        n0 value = entry.getValue();
        Size sizeE = n0Var.s().e();
        Rect rectA = entry.getKey().a().a();
        if (!n0Var.u()) {
            j0Var = null;
        }
        o1.a aVarF = o1.a.f(sizeE, rectA, j0Var, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeE2 = n0Var2.s().e();
        Rect rectA2 = entry.getKey().b().a();
        if (!n0Var2.u()) {
            j0Var2 = null;
        }
        j0.n.j(value.j(entry.getKey().a().b(), aVarF, o1.a.f(sizeE2, rectA2, j0Var2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), i0.c.e());
    }

    private void e(@NonNull j0 j0Var, @NonNull j0 j0Var2, @NonNull n0 n0Var, @NonNull n0 n0Var2, @NonNull Map<d, n0> map) {
        for (final Map.Entry<d, n0> entry : map.entrySet()) {
            final j0 j0Var3 = j0Var;
            final j0 j0Var4 = j0Var2;
            final n0 n0Var3 = n0Var;
            final n0 n0Var4 = n0Var2;
            c(j0Var3, j0Var4, n0Var3, n0Var4, entry);
            entry.getValue().e(new Runnable() { // from class: q0.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104165a.c(j0Var3, j0Var4, n0Var3, n0Var4, entry);
                }
            });
            j0Var = j0Var3;
            j0Var2 = j0Var4;
            n0Var = n0Var3;
            n0Var2 = n0Var4;
        }
    }

    private void f(@NonNull j0 j0Var, @NonNull n0 n0Var, @NonNull Map<d, n0> map, boolean z11) {
        try {
            this.f104171a.b(n0Var.l(j0Var, z11));
        } catch (ProcessingException e11) {
            y0.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
    }

    @NonNull
    private n0 h(@NonNull n0 n0Var, @NonNull r0.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix();
        u5.h.a(s.j(s.f(rectA, iC), fVar.d()));
        Rect rectR = s.r(fVar.d());
        return new n0(fVar.e(), fVar.b(), n0Var.s().g().e(fVar.d()).a(), matrix, false, rectR, n0Var.q() - iC, -1, n0Var.w() != zG);
    }

    public void d() {
        this.f104171a.release();
        h0.r.e(new Runnable() { // from class: q0.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f104164a);
            }
        });
    }

    @NonNull
    public c g(@NonNull b bVar) {
        h0.r.b();
        this.f104175e = bVar;
        this.f104174d = new c();
        n0 n0VarB = this.f104175e.b();
        n0 n0VarC = this.f104175e.c();
        for (d dVar : this.f104175e.a()) {
            this.f104174d.put(dVar, h(n0VarB, dVar.a()));
        }
        f(this.f104172b, n0VarB, this.f104174d, true);
        f(this.f104173c, n0VarC, this.f104174d, false);
        e(this.f104172b, this.f104173c, n0VarB, n0VarC, this.f104174d);
        return this.f104174d;
    }
}
