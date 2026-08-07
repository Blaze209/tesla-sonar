package v;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeferrableSurface f117069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private androidx.camera.core.impl.x2 f117070b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Size f117072d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f117074f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final z.x f117073e = new z.x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.x2.c f117075g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final b f117071c = new b();

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f117076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f117077b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f117076a = surface;
            this.f117077b = surfaceTexture;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            this.f117076a.release();
            this.f117077b.release();
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    private static class b implements androidx.camera.core.impl.o3<c0.a2> {

        @NonNull
        private final androidx.camera.core.impl.x0 K;

        b() {
            androidx.camera.core.impl.d2 d2VarC0 = androidx.camera.core.impl.d2.c0();
            d2VarC0.K(androidx.camera.core.impl.o3.f3268w, new m2());
            d2VarC0.K(androidx.camera.core.impl.q1.f3281h, 34);
            Z(d2VarC0);
            this.K = d2VarC0;
        }

        private void Z(androidx.camera.core.impl.d2 d2Var) {
            d2Var.K(k0.k.I, k4.class);
            d2Var.K(k0.k.H, k4.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.o3
        @NonNull
        public androidx.camera.core.impl.p3.b U() {
            return androidx.camera.core.impl.p3.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.s2
        @NonNull
        public androidx.camera.core.impl.x0 getConfig() {
            return this.K;
        }
    }

    interface c {
        void a();
    }

    k4(@NonNull w.z zVar, @NonNull i3 i3Var, c cVar) {
        this.f117074f = cVar;
        Size sizeG = g(zVar, i3Var);
        this.f117072d = sizeG;
        c0.y0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f117070b = d();
    }

    public static /* synthetic */ void a(k4 k4Var, androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.x2.g gVar) {
        k4Var.f117070b = k4Var.d();
        c cVar = k4Var.f117074f;
        if (cVar != null) {
            cVar.a();
        }
    }

    @NonNull
    private Size g(@NonNull w.z zVar, @NonNull i3 i3Var) {
        Size[] sizeArrC = zVar.d().c(34);
        if (sizeArrC == null) {
            c0.y0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f117073e.a(sizeArrC);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: v.j4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeF = i3Var.f();
        long jMin = Math.min(((long) sizeF.getWidth()) * ((long) sizeF.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i11 = 0;
        while (i11 < length) {
            Size size2 = sizeArrA[i11];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size == null) {
                    break;
                }
                return size;
            }
            i11++;
            size = size2;
        }
        return (Size) listAsList.get(0);
    }

    void c() {
        c0.y0.a("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f117069a;
        if (deferrableSurface != null) {
            deferrableSurface.d();
        }
        this.f117069a = null;
    }

    @NonNull
    androidx.camera.core.impl.x2 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f117072d.getWidth(), this.f117072d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.x2.b bVarR = androidx.camera.core.impl.x2.b.r(this.f117071c, this.f117072d);
        bVarR.B(1);
        androidx.camera.core.impl.t1 t1Var = new androidx.camera.core.impl.t1(surface);
        this.f117069a = t1Var;
        j0.n.j(t1Var.k(), new a(surface, surfaceTexture), i0.c.b());
        bVarR.m(this.f117069a);
        androidx.camera.core.impl.x2.c cVar = this.f117075g;
        if (cVar != null) {
            cVar.b();
        }
        androidx.camera.core.impl.x2.c cVar2 = new androidx.camera.core.impl.x2.c(new androidx.camera.core.impl.x2.d() { // from class: v.i4
            @Override // androidx.camera.core.impl.x2.d
            public final void a(androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.x2.g gVar) {
                k4.a(this.f117041a, x2Var, gVar);
            }
        });
        this.f117075g = cVar2;
        bVarR.u(cVar2);
        return bVarR.p();
    }

    @NonNull
    Size e() {
        return this.f117072d;
    }

    @NonNull
    String f() {
        return "MeteringRepeating";
    }

    @NonNull
    androidx.camera.core.impl.x2 h() {
        return this.f117070b;
    }

    @NonNull
    androidx.camera.core.impl.o3<?> i() {
        return this.f117071c;
    }
}
