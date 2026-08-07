package org.godotengine.godot.xr.regular;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.godotengine.godot.utils.GLUtils;

/* JADX INFO: loaded from: classes10.dex */
public class RegularConfigChooser implements GLSurfaceView.EGLConfigChooser {
    private static int EGL_OPENGL_ES2_BIT = 4;
    private static final String TAG = "RegularConfigChooser";
    private static int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    private static int[] s_configAttribs3 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue = new int[1];

    public RegularConfigChooser(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.mRedSize = i11;
        this.mGreenSize = i12;
        this.mBlueSize = i13;
        this.mAlphaSize = i14;
        this.mDepthSize = i15;
        this.mStencilSize = i16;
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, this.mValue) ? this.mValue[0] : i12;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, GLUtils.use_gl3 ? s_configAttribs3 : s_configAttribs2, null, 0, iArr);
        int i11 = iArr[0];
        if (i11 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i11];
        egl10.eglChooseConfig(eGLDisplay, GLUtils.use_gl3 ? s_configAttribs3 : s_configAttribs2, eGLConfigArr, i11, iArr);
        return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i11 = 0;
        while (i11 < length) {
            EGLConfig eGLConfig = eGLConfigArr[i11];
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iFindConfigAttrib = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iFindConfigAttrib2 = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iFindConfigAttrib >= this.mDepthSize && iFindConfigAttrib2 >= this.mStencilSize) {
                int iFindConfigAttrib3 = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iFindConfigAttrib4 = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iFindConfigAttrib5 = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iFindConfigAttrib6 = findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iFindConfigAttrib3 == this.mRedSize && iFindConfigAttrib4 == this.mGreenSize && iFindConfigAttrib5 == this.mBlueSize && iFindConfigAttrib6 == this.mAlphaSize) {
                    return eGLConfig;
                }
            }
            i11++;
            egl10 = egl11;
            eGLDisplay = eGLDisplay2;
        }
        return null;
    }
}
