package p0;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Thread f100232c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected EGLConfig f100236g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Surface f100238i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f100230a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<Surface, r0.g> f100231b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    protected EGLDisplay f100233d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    protected EGLContext f100234e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    protected int[] f100235f = r0.d.f106300a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    protected EGLSurface f100237h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    protected Map<r0.d.e, r0.d.f> f100239j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected r0.d.f f100240k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    protected r0.d.e f100241l = r0.d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f100242m = -1;

    private void a(int i11) {
        GLES20.glActiveTexture(33984);
        r0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        r0.d.g("glBindTexture");
    }

    private void b(@NonNull c0.b0 b0Var, r0.e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f100233d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f100233d, iArr, 0, iArr, 1)) {
            this.f100233d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i11 = b0Var.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f100233d, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, b0Var.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, b0Var.d() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, b0Var.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f100233d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, b0Var.d() ? 3 : 2, 12344}, 0);
        r0.d.f("eglCreateContext");
        this.f100236g = eGLConfig;
        this.f100234e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f100233d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f100233d;
        EGLConfig eGLConfig = this.f100236g;
        Objects.requireNonNull(eGLConfig);
        this.f100237h = r0.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    @NonNull
    private u5.d<String, String> e(@NonNull c0.b0 b0Var) {
        r0.d.i(this.f100230a, false);
        try {
            b(b0Var, null);
            d();
            i(this.f100237h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f100233d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new u5.d<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e11) {
            c0.y0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e11.getMessage(), e11);
            return new u5.d<>("", "");
        } finally {
            l();
        }
    }

    private void l() {
        Iterator<r0.d.f> it = this.f100239j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f100239j = Collections.EMPTY_MAP;
        this.f100240k = null;
        if (!Objects.equals(this.f100233d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f100233d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (r0.g gVar : this.f100231b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f100233d, gVar.a())) {
                    r0.d.e("eglDestroySurface");
                }
            }
            this.f100231b.clear();
            if (!Objects.equals(this.f100237h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f100233d, this.f100237h);
                this.f100237h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f100234e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f100233d, this.f100234e);
                this.f100234e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f100233d);
            this.f100233d = EGL14.EGL_NO_DISPLAY;
        }
        this.f100236g = null;
        this.f100242m = -1;
        this.f100241l = r0.d.e.UNKNOWN;
        this.f100238i = null;
        this.f100232c = null;
    }

    private void q(@NonNull ByteBuffer byteBuffer, @NonNull Size size, @NonNull float[] fArr) {
        u5.h.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        u5.h.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = r0.d.u();
        GLES20.glActiveTexture(33985);
        r0.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        r0.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        r0.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = r0.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        r0.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        r0.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        r0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f100242m);
        r0.d.g("glBindTexture");
        this.f100238i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        r0.d.f fVar = (r0.d.f) u5.h.g(this.f100240k);
        if (fVar instanceof r0.d.g) {
            ((r0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        r0.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        r0.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        r0.d.s(iU);
        r0.d.r(iT);
        a(this.f100242m);
    }

    protected r0.g c(@NonNull Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f100233d;
            EGLConfig eGLConfig = this.f100236g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = r0.d.q(eGLDisplay, eGLConfig, surface, this.f100235f);
            Size sizeX = r0.d.x(this.f100233d, eGLSurfaceQ);
            return r0.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e11) {
            c0.y0.m("OpenGlRenderer", "Failed to create EGL surface: " + e11.getMessage(), e11);
            return null;
        }
    }

    @NonNull
    protected r0.g f(@NonNull Surface surface) {
        u5.h.j(this.f100231b.containsKey(surface), "The surface is not registered.");
        r0.g gVar = this.f100231b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        return this.f100242m;
    }

    @NonNull
    public r0.e h(@NonNull c0.b0 b0Var, @NonNull Map<r0.d.e, c0> map) throws Throwable {
        r0.d.i(this.f100230a, false);
        r0.e.a aVarA = r0.e.a();
        try {
            if (b0Var.d()) {
                u5.d<String, String> dVarE = e(b0Var);
                String str = (String) u5.h.g(dVarE.f115407a);
                String str2 = (String) u5.h.g(dVarE.f115408b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    c0.y0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    b0Var = c0.b0.f18255d;
                }
                this.f100235f = r0.d.k(str2, b0Var);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(b0Var, aVarA);
            d();
            i(this.f100237h);
            aVarA.e(r0.d.w());
            this.f100239j = r0.d.o(b0Var, map);
            int iP = r0.d.p();
            this.f100242m = iP;
            s(iP);
            this.f100232c = Thread.currentThread();
            this.f100230a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e11) {
            e = e11;
            l();
            throw e;
        } catch (IllegalStateException e12) {
            e = e12;
            l();
            throw e;
        }
    }

    protected void i(@NonNull EGLSurface eGLSurface) {
        u5.h.g(this.f100233d);
        u5.h.g(this.f100234e);
        if (!EGL14.eglMakeCurrent(this.f100233d, eGLSurface, eGLSurface, this.f100234e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(@NonNull Surface surface) {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        if (this.f100231b.containsKey(surface)) {
            return;
        }
        this.f100231b.put(surface, r0.d.f106311l);
    }

    public void k() {
        if (this.f100230a.getAndSet(false)) {
            r0.d.h(this.f100232c);
            l();
        }
    }

    protected void m(@NonNull Surface surface, boolean z11) {
        if (this.f100238i == surface) {
            this.f100238i = null;
            i(this.f100237h);
        }
        r0.g gVarRemove = z11 ? this.f100231b.remove(surface) : this.f100231b.put(surface, r0.d.f106311l);
        if (gVarRemove == null || gVarRemove == r0.d.f106311l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f100233d, gVarRemove.a());
        } catch (RuntimeException e11) {
            c0.y0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e11.getMessage(), e11);
        }
    }

    public void n(long j11, @NonNull float[] fArr, @NonNull Surface surface) {
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
        if (surface != this.f100238i) {
            i(gVarF.a());
            this.f100238i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        r0.d.f fVar = (r0.d.f) u5.h.g(this.f100240k);
        if (fVar instanceof r0.d.g) {
            ((r0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        r0.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f100233d, gVarF.a(), j11);
        if (EGL14.eglSwapBuffers(this.f100233d, gVarF.a())) {
            return;
        }
        c0.y0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(@NonNull r0.d.e eVar) {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        if (this.f100241l != eVar) {
            this.f100241l = eVar;
            s(this.f100242m);
        }
    }

    @NonNull
    public Bitmap p(@NonNull Size size, @NonNull float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void r(@NonNull Surface surface) {
        r0.d.i(this.f100230a, true);
        r0.d.h(this.f100232c);
        m(surface, true);
    }

    protected void s(int i11) {
        r0.d.f fVar = this.f100239j.get(this.f100241l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f100241l);
        }
        if (this.f100240k != fVar) {
            this.f100240k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f100241l + ": " + this.f100240k);
        }
        a(i11);
    }
}
