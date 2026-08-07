package org.godotengine.godot.xr.regular;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.godotengine.godot.GodotLib;
import org.godotengine.godot.utils.GLUtils;

/* JADX INFO: loaded from: classes10.dex */
public class RegularContextFactory implements GLSurfaceView.EGLContextFactory {
    private static int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final String TAG = "RegularContextFactory";
    private static final int _EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int _EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext;
        String global = GodotLib.getGlobal("rendering/quality/driver/driver_name");
        boolean zEquals = GodotLib.getGlobal("rendering/quality/driver/upgrade_to_gles3").equals("True");
        if (GLUtils.use_gl3 && !global.equals("GLES3")) {
            GLUtils.use_gl3 = false;
        }
        if ((GLUtils.use_gl3 || zEquals) && zEquals) {
            Log.w(TAG, "creating OpenGL ES 3.0 context for GLES2 driver (rendering/quality/driver/upgrade_to_gles3 is set):");
        } else {
            Log.w(TAG, "creating OpenGL ES 2.0 context :");
        }
        GLUtils.checkEglError(TAG, "Before eglCreateContext", egl10);
        boolean z11 = GLUtils.use_debug_opengl;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        if (z11) {
            int i11 = EGL_CONTEXT_CLIENT_VERSION;
            int[] iArr = {i11, 2, _EGL_CONTEXT_FLAGS_KHR, 1, 12344};
            int[] iArr2 = {i11, 3, _EGL_CONTEXT_FLAGS_KHR, 1, 12344};
            if (GLUtils.use_gl3) {
                iArr = iArr2;
            }
            eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        } else {
            int i12 = EGL_CONTEXT_CLIENT_VERSION;
            int[] iArr3 = {i12, 2, 12344};
            int[] iArr4 = {i12, 3, 12344};
            EGLContext eGLContextEglCreateContext2 = null;
            if (GLUtils.use_gl3 || zEquals) {
                try {
                    eGLContextEglCreateContext2 = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr4);
                } catch (Exception unused) {
                    if (zEquals) {
                        Log.w(TAG, "Failed to create GLES3 context (error thrown) as requested with rendering/quality/driver/upgrade_to_gles3 option; falling back to GLES2");
                    }
                }
                if (eGLContextEglCreateContext2 == null && zEquals) {
                    Log.w(TAG, "Failed to create GLES3 context as requested with rendering/quality/driver/upgrade_to_gles3 option; falling back to GLES2");
                }
            }
            eGLContextEglCreateContext = (eGLContextEglCreateContext2 != null || GLUtils.use_gl3) ? eGLContextEglCreateContext2 : egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr3);
        }
        GLUtils.checkEglError(TAG, "After eglCreateContext", egl10);
        return eGLContextEglCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
