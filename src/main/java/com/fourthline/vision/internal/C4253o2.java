package com.fourthline.vision.internal;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.EglBase;

/* JADX INFO: renamed from: com.fourthline.vision.internal.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4253o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLConfig f38684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f38685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f38686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLSurface f38687d;

    public C4253o2(EGLContext sharedContext, Surface surface) {
        p013kotlin.jvm.internal.s.k(sharedContext, "sharedContext");
        p013kotlin.jvm.internal.s.k(surface, "surface");
        this.f38685b = EGL14.EGL_NO_CONTEXT;
        this.f38686c = EGL14.EGL_NO_DISPLAY;
        this.f38687d = EGL14.EGL_NO_SURFACE;
        tryInitEglDisplay();
        tryInitEgl();
        tryInitConfig();
        tryInitEglContext(sharedContext);
        this.f38687d = createWindowSurface(surface);
        makeCurrent();
    }

    private final EGLConfig buildConfig() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f38686c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344, 12344, 12344, 12344, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("chooseConfig failed");
    }

    private final EGLContext createContext(EGLContext eGLContext) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f38686c, this.f38684a, eGLContext, new int[]{12440, 2, 12344}, 0);
        if (EGL14.eglGetError() != 12288) {
            throw new RuntimeException("eglCreateContext: EGL error");
        }
        p013kotlin.jvm.internal.s.h(eGLContextEglCreateContext);
        return eGLContextEglCreateContext;
    }

    private final EGLSurface createWindowSurface(Surface surface) {
        int[] iArr = {12344};
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        try {
            return EGL14.eglCreateWindowSurface(this.f38686c, this.f38684a, surface, iArr, 0);
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return eGLSurface;
        }
    }

    private final void destroyContext() {
        EGL14.eglDestroyContext(this.f38686c, this.f38685b);
        this.f38685b = EGL14.EGL_NO_CONTEXT;
    }

    private final void destroyWindowSurface() {
        EGLSurface eGLSurface = this.f38687d;
        if (eGLSurface != null) {
            EGLDisplay eGLDisplay = this.f38686c;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f38686c, eGLSurface);
        }
    }

    private final void makeCurrent() {
        EGLSurface eGLSurface = this.f38687d;
        if (eGLSurface != null) {
            EGL14.eglMakeCurrent(this.f38686c, eGLSurface, eGLSurface, this.f38685b);
        }
    }

    private final void makeDefault() {
        EGLDisplay eGLDisplay = this.f38686c;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    private final void tryInitConfig() {
        this.f38684a = buildConfig();
    }

    private final void tryInitEgl() {
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f38686c, iArr, 0, iArr, 1)) {
            throw new RuntimeException("eglInitialize failed");
        }
    }

    private final void tryInitEglContext(EGLContext eGLContext) {
        this.f38685b = createContext(eGLContext);
    }

    private final void tryInitEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f38686c = eGLDisplayEglGetDisplay;
        if (p013kotlin.jvm.internal.s.f(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("eglGetDisplay failed");
        }
    }

    public final void release() {
        makeDefault();
        destroyWindowSurface();
        this.f38687d = EGL14.EGL_NO_SURFACE;
        EGLDisplay eGLDisplay = this.f38686c;
        if (eGLDisplay != null) {
            destroyContext();
            EGL14.eglTerminate(eGLDisplay);
            EGL14.eglReleaseThread();
        }
        this.f38686c = EGL14.EGL_NO_DISPLAY;
        this.f38685b = EGL14.EGL_NO_CONTEXT;
    }

    public final void swap() {
        EGL14.eglSwapBuffers(this.f38686c, this.f38687d);
    }
}
