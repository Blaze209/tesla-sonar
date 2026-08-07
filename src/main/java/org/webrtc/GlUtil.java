package org.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class GlUtil {

    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int i11, String str) {
            super(i11, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            if (iGlGetError == 1285) {
                throw new GlOutOfMemoryException(iGlGetError, str);
            }
            throw new GLException(iGlGetError, str + ": GLES20 error: " + iGlGetError);
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i11) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i12 = iArr[0];
        GLES20.glBindTexture(i11, i12);
        GLES20.glTexParameterf(i11, 10241, 9729.0f);
        GLES20.glTexParameterf(i11, 10240, 9729.0f);
        GLES20.glTexParameterf(i11, 10242, 33071.0f);
        GLES20.glTexParameterf(i11, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i12;
    }
}
