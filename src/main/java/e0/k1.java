package e0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61342a = new n0.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Boolean> f61343b = new HashMap();

    interface a {
        void a(@NonNull k1 k1Var);
    }

    public static /* synthetic */ void a(k1 k1Var, ImageCaptureException imageCaptureException) {
        boolean z11 = k1Var.j() != null;
        boolean z12 = k1Var.l() != null;
        if (z11 && !z12) {
            c0.r0.e eVarJ = k1Var.j();
            Objects.requireNonNull(eVarJ);
            eVarJ.onError(imageCaptureException);
        } else {
            if (!z12 || z11) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            c0.r0.f fVarL = k1Var.l();
            Objects.requireNonNull(fVarL);
            fVarL.c(imageCaptureException);
        }
    }

    public static /* synthetic */ void b(k1 k1Var, c0.r0.h hVar) {
        c0.r0.f fVarL = k1Var.l();
        Objects.requireNonNull(fVarL);
        Objects.requireNonNull(hVar);
        fVarL.d(hVar);
    }

    public static /* synthetic */ void c(k1 k1Var, androidx.camera.core.n nVar) {
        c0.r0.e eVarJ = k1Var.j();
        Objects.requireNonNull(eVarJ);
        Objects.requireNonNull(nVar);
        eVarJ.onCaptureSuccess(nVar);
    }

    public static /* synthetic */ void d(k1 k1Var, Bitmap bitmap) {
        if (k1Var.l() != null) {
            k1Var.l().b(bitmap);
        } else if (k1Var.j() != null) {
            k1Var.j().onPostviewBitmapAvailable(bitmap);
        }
    }

    public static /* synthetic */ void e(k1 k1Var, int i11) {
        if (k1Var.l() != null) {
            k1Var.l().onCaptureProcessProgressed(i11);
        } else if (k1Var.j() != null) {
            k1Var.j().onCaptureProcessProgressed(i11);
        }
    }

    @NonNull
    public static k1 v(@NonNull Executor executor, c0.r0.e eVar, c0.r0.f fVar, c0.r0.g gVar, c0.r0.g gVar2, @NonNull Rect rect, @NonNull Matrix matrix, int i11, int i12, int i13, boolean z11, @NonNull List<androidx.camera.core.impl.p> list) {
        u5.h.b((fVar == null) == (gVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        u5.h.b((eVar == null) ^ (fVar == null), "One and only one on-disk or in-memory callback should be present.");
        i iVar = new i(executor, eVar, fVar, gVar, gVar2, rect, matrix, i11, i12, i13, z11, list);
        if (z11) {
            iVar.r();
        }
        return iVar;
    }

    void A(final c0.r0.h hVar) {
        g().execute(new Runnable() { // from class: e0.j1
            @Override // java.lang.Runnable
            public final void run() {
                k1.b(this.f61339a, hVar);
            }
        });
    }

    boolean f() {
        h0.r.b();
        int i11 = this.f61342a;
        if (i11 <= 0) {
            return false;
        }
        this.f61342a = i11 - 1;
        return true;
    }

    @NonNull
    abstract Executor g();

    abstract int h();

    @NonNull
    public abstract Rect i();

    public abstract c0.r0.e j();

    public abstract int k();

    public abstract c0.r0.f l();

    public abstract c0.r0.g m();

    public abstract int n();

    public abstract c0.r0.g o();

    @NonNull
    abstract Matrix p();

    @NonNull
    abstract List<androidx.camera.core.impl.p> q();

    void r() {
        Map<Integer, Boolean> map = this.f61343b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.f61343b.put(256, bool);
    }

    boolean s() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f61343b.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    abstract boolean t();

    void u(int i11, boolean z11) {
        if (this.f61343b.containsKey(Integer.valueOf(i11))) {
            this.f61343b.put(Integer.valueOf(i11), Boolean.valueOf(z11));
        } else {
            c0.y0.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    void w(final int i11) {
        g().execute(new Runnable() { // from class: e0.g1
            @Override // java.lang.Runnable
            public final void run() {
                k1.e(this.f61315a, i11);
            }
        });
    }

    void x(@NonNull final ImageCaptureException imageCaptureException) {
        g().execute(new Runnable() { // from class: e0.f1
            @Override // java.lang.Runnable
            public final void run() {
                k1.a(this.f61311a, imageCaptureException);
            }
        });
    }

    void y(@NonNull final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: e0.i1
            @Override // java.lang.Runnable
            public final void run() {
                k1.d(this.f61335a, bitmap);
            }
        });
    }

    void z(final androidx.camera.core.n nVar) {
        g().execute(new Runnable() { // from class: e0.h1
            @Override // java.lang.Runnable
            public final void run() {
                k1.c(this.f61319a, nVar);
            }
        });
    }
}
