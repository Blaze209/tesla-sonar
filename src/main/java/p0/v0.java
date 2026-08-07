package p0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.camera.core.ProcessingException;
import androidx.core.util.Consumer;
import c0.o1;
import c0.z1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final r0 f100209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final androidx.camera.core.impl.j0 f100210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f100211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f100212d;

    class a implements j0.c<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f100213a;

        a(n0 n0Var) {
            this.f100213a = n0Var;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(o1 o1Var) {
            u5.h.g(o1Var);
            try {
                v0.this.f100209a.c(o1Var);
            } catch (ProcessingException e11) {
                c0.y0.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
            }
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (this.f100213a.t() == 2 && (th2 instanceof CancellationException)) {
                c0.y0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            c0.y0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.b(this.f100213a.t()), th2);
        }
    }

    public static abstract class b {
        @NonNull
        public static b c(@NonNull n0 n0Var, @NonNull List<r0.f> list) {
            return new p0.c(n0Var, list);
        }

        @NonNull
        public abstract List<r0.f> a();

        @NonNull
        public abstract n0 b();
    }

    public static class c extends HashMap<r0.f, n0> {
    }

    public v0(@NonNull androidx.camera.core.impl.j0 j0Var, @NonNull r0 r0Var) {
        this.f100210b = j0Var;
        this.f100209a = r0Var;
    }

    public static /* synthetic */ void b(Map map, z1.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((r0.f) entry.getKey()).c();
            if (((r0.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((n0) entry.getValue()).z(h0.s.w(iB), -1);
        }
    }

    public static /* synthetic */ void c(v0 v0Var) {
        c cVar = v0Var.f100211c;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@NonNull n0 n0Var, Map.Entry<r0.f, n0> entry) {
        n0 value = entry.getValue();
        j0.n.j(value.j(entry.getKey().b(), o1.a.f(n0Var.s().e(), entry.getKey().a(), n0Var.u() ? this.f100210b : null, entry.getKey().c(), entry.getKey().g()), null), new a(value), i0.c.e());
    }

    private void g(@NonNull final n0 n0Var, @NonNull Map<r0.f, n0> map) {
        for (final Map.Entry<r0.f, n0> entry : map.entrySet()) {
            d(n0Var, entry);
            entry.getValue().e(new Runnable() { // from class: p0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100189a.d(n0Var, entry);
                }
            });
        }
    }

    private void h(@NonNull n0 n0Var) {
        try {
            this.f100209a.b(n0Var.k(this.f100210b));
        } catch (ProcessingException e11) {
            c0.y0.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
    }

    @NonNull
    private n0 k(@NonNull n0 n0Var, @NonNull r0.f fVar) {
        Rect rectR;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        Matrix matrixE = h0.s.e(new RectF(rectA), h0.s.t(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        u5.h.a(h0.s.j(h0.s.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            u5.h.b(fVar.a().contains(n0Var.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n0Var.n()));
            rectR = new Rect();
            RectF rectF = new RectF(n0Var.n());
            matrixE.mapRect(rectF);
            rectF.round(rectR);
        } else {
            rectR = h0.s.r(fVar.d());
        }
        Rect rect = rectR;
        return new n0(fVar.e(), fVar.b(), n0Var.s().g().e(fVar.d()).a(), matrix, false, rect, n0Var.q() - iC, -1, n0Var.w() != zG);
    }

    @NonNull
    public r0 e() {
        return this.f100209a;
    }

    public void f() {
        this.f100209a.release();
        h0.r.e(new Runnable() { // from class: p0.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.c(this.f100206a);
            }
        });
    }

    void i(@NonNull n0 n0Var, @NonNull final Map<r0.f, n0> map) {
        n0Var.f(new Consumer() { // from class: p0.t0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                v0.b(map, (z1.h) obj);
            }
        });
    }

    @NonNull
    public c j(@NonNull b bVar) {
        h0.r.b();
        this.f100212d = bVar;
        this.f100211c = new c();
        n0 n0VarB = bVar.b();
        for (r0.f fVar : bVar.a()) {
            this.f100211c.put(fVar, k(n0VarB, fVar));
        }
        h(n0VarB);
        g(n0VarB, this.f100211c);
        i(n0VarB, this.f100211c);
        return this.f100211c;
    }
}
