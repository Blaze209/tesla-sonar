package com.fourthline.vision.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.fourthline.vision.internal.camera.view.glutils.GLDrawer2D;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f37701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SurfaceTexture f37702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GLDrawer2D f37704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f37705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f37706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private F2 f37707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f37708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37709i;

    public G(C4298v parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        this.f37701a = new WeakReference(parent);
        this.f37703c = -1;
        this.f37705e = new float[16];
        float[] fArr = new float[16];
        this.f37706f = fArr;
        this.f37709i = true;
        Matrix.setIdentityM(fArr, 0);
    }

    private final void checkOesEglExtension() {
        String strGlGetString = GLES20.glGetString(7939);
        p013kotlin.jvm.internal.s.h(strGlGetString);
        if (!p013kotlin.text.t.h0(strGlGetString, "OES_EGL_image_external", false, 2, null)) {
            throw new RuntimeException("This system does not support OES_EGL_image_external.");
        }
    }

    private final void createDrawer() {
        GLDrawer2D gLDrawer2D = new GLDrawer2D();
        gLDrawer2D.setMatrix(this.f37706f, 0);
        this.f37704d = gLDrawer2D;
    }

    @SuppressLint({"Recycle"})
    private final void createSurfaceTexture() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f37703c);
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f37702b = surfaceTexture;
    }

    private final void createTextureId() {
        this.f37703c = GLDrawer2D.initTex();
    }

    private final void drawPreview() {
        GLDrawer2D gLDrawer2D = this.f37704d;
        if (gLDrawer2D != null) {
            gLDrawer2D.draw(this.f37703c, this.f37705e);
        }
    }

    private final void notifyNewFrameAvailableAt30Fps() {
        boolean z11 = this.f37709i;
        this.f37709i = !z11;
        if (z11) {
            return;
        }
        synchronized (this) {
            F2 f11 = this.f37707g;
            if (f11 != null) {
                f11.frameAvailableSoon(this.f37703c, this.f37705e, this.f37706f);
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }
    }

    private final void releaseDrawer() {
        GLDrawer2D gLDrawer2D = this.f37704d;
        if (gLDrawer2D != null) {
            gLDrawer2D.release();
        }
        this.f37704d = null;
    }

    private final void releaseSurfaceTexture() {
        getSurfaceTexture().release();
    }

    private final void resetFrame() {
        GLES20.glClear(16384);
    }

    private final void resetFrameToYellow() {
        GLES20.glClearColor(1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    private final void resetTextureId() {
        GLDrawer2D.deleteTex(this.f37703c);
    }

    private final void tryNotifySurfaceCreated() {
        final C4298v c4298v = (C4298v) this.f37701a.get();
        if (c4298v != null) {
            c4298v.post(new Runnable() { // from class: com.fourthline.vision.internal.q7
                @Override // java.lang.Runnable
                public final void run() {
                    G.tryNotifySurfaceCreated$lambda$3$lambda$2(c4298v);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryNotifySurfaceCreated$lambda$3$lambda$2(C4298v c4298v) {
        C4298v.a aVar;
        WeakReference<C4298v.a> listener = c4298v.getListener();
        if (listener == null || (aVar = listener.get()) == null) {
            return;
        }
        aVar.onSurfaceCreated(c4298v.getSurfaceTexture());
    }

    private final void tryNotifySurfaceDestroyed() {
        WeakReference<C4298v.a> listener;
        C4298v.a aVar;
        C4298v c4298v = (C4298v) this.f37701a.get();
        if (c4298v == null || (listener = c4298v.getListener()) == null || (aVar = listener.get()) == null) {
            return;
        }
        aVar.onSurfaceDestroyed();
    }

    private final void updateTextureIfNecessary() {
        if (this.f37708h) {
            this.f37708h = false;
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.f37705e);
            }
        }
    }

    private final void updateViewport() {
        C4298v c4298v = (C4298v) this.f37701a.get();
        if (c4298v != null) {
            GLES20.glViewport(0, 0, c4298v.getWidth(), c4298v.getHeight());
            resetFrame();
            Matrix.setIdentityM(this.f37706f, 0);
            GLDrawer2D gLDrawer2D = this.f37704d;
            if (gLDrawer2D != null) {
                gLDrawer2D.setMatrix(this.f37706f, 0);
            }
        }
    }

    public final SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.f37702b;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        p013kotlin.jvm.internal.s.B("surfaceTexture");
        return null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 unused) {
        p013kotlin.jvm.internal.s.k(unused, "unused");
        resetFrame();
        updateTextureIfNecessary();
        drawPreview();
        notifyNewFrameAvailableAt30Fps();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture st2) {
        p013kotlin.jvm.internal.s.k(st2, "st");
        this.f37708h = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 unused, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(unused, "unused");
        updateViewport();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        p013kotlin.jvm.internal.s.k(unused, "unused");
        p013kotlin.jvm.internal.s.k(config, "config");
        checkOesEglExtension();
        createTextureId();
        createSurfaceTexture();
        resetFrameToYellow();
        createDrawer();
        tryNotifySurfaceCreated();
    }

    public final void onSurfaceDestroyed() {
        releaseDrawer();
        releaseSurfaceTexture();
        resetTextureId();
        tryNotifySurfaceDestroyed();
        this.f37708h = false;
    }

    public final void setFrameListener(F2 f11) {
        this.f37707g = f11;
    }
}
