package q0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import c0.b0;
import c0.o1;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import p0.c0;
import p0.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f104129n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f104130o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final c0.z f104131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final c0.z f104132q;

    public c(@NonNull c0.z zVar, @NonNull c0.z zVar2) {
        this.f104131p = zVar;
        this.f104132q = zVar2;
    }

    @NonNull
    private static float[] u(@NonNull Size size, @NonNull Size size2, @NonNull c0.z zVar) {
        float[] fArrL = r0.d.l();
        float[] fArrL2 = r0.d.l();
        float[] fArrL3 = r0.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (zVar.c().f115407a.floatValue() != BitmapDescriptorFactory.HUE_RED || zVar.c().f115408b.floatValue() != BitmapDescriptorFactory.HUE_RED) {
            Matrix.translateM(fArrL2, 0, zVar.b().f115407a.floatValue() / zVar.c().f115407a.floatValue(), zVar.b().f115408b.floatValue() / zVar.c().f115408b.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    private void w(@NonNull r0.g gVar, @NonNull o1 o1Var, @NonNull SurfaceTexture surfaceTexture, @NonNull c0.z zVar, int i11, boolean z11) {
        s(i11);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        o1Var.R1(fArr2, fArr, z11);
        r0.d.f fVar = (r0.d.f) u5.h.g(this.f100240k);
        if (fVar instanceof r0.d.g) {
            ((r0.d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * zVar.c().f115407a.floatValue()), (int) (gVar.b() * zVar.c().f115408b.floatValue())), new Size(gVar.c(), gVar.b()), zVar));
        fVar.d(zVar.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        r0.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // p0.z
    @NonNull
    public r0.e h(@NonNull b0 b0Var, @NonNull Map<r0.d.e, c0> map) throws Throwable {
        r0.e eVarH = super.h(b0Var, map);
        this.f104129n = r0.d.p();
        this.f104130o = r0.d.p();
        return eVarH;
    }

    @Override // p0.z
    public void k() {
        super.k();
        this.f104129n = -1;
        this.f104130o = -1;
    }

    public int t(boolean z11) {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        return z11 ? this.f104129n : this.f104130o;
    }

    public void v(long j11, @NonNull Surface surface, @NonNull o1 o1Var, @NonNull SurfaceTexture surfaceTexture, @NonNull SurfaceTexture surfaceTexture2) {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        r0.g gVarF = f(surface);
        if (gVarF == r0.d.f106311l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f100231b.put(surface, gVarF);
            }
        }
        r0.g gVar = gVarF;
        if (surface != this.f100238i) {
            i(gVar.a());
            this.f100238i = surface;
        }
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        GLES20.glClear(16384);
        w(gVar, o1Var, surfaceTexture, this.f104131p, this.f104129n, true);
        w(gVar, o1Var, surfaceTexture2, this.f104132q, this.f104130o, true);
        EGLExt.eglPresentationTimeANDROID(this.f100233d, gVar.a(), j11);
        if (EGL14.eglSwapBuffers(this.f100233d, gVar.a())) {
            return;
        }
        y0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }
}
