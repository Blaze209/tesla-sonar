package com.fourthline.vision.internal.camera.view.glutils;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class GLDrawer2D {
    private static final boolean DEBUG = false;
    private static final int FLOAT_SZ = 4;
    private static final String TAG = "GLDrawer2D";
    private static final int VERTEX_NUM = 4;
    private static final int VERTEX_SZ = 8;
    private static final String fss = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nvarying highp vec2 vTextureCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}";
    private static final String vss = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\n\nvoid main() {\n\tgl_Position = uMVPMatrix * aPosition;\n\tvTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    private int hProgram;
    private final float[] mMvpMatrix;
    int maPositionLoc;
    int maTextureCoordLoc;
    int muMVPMatrixLoc;
    int muTexMatrixLoc;
    private final FloatBuffer pTexCoord;
    private final FloatBuffer pVertex;
    private static final float[] VERTICES = {1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, -1.0f};
    private static final float[] TEXCOORD = {1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    public GLDrawer2D() {
        float[] fArr = new float[16];
        this.mMvpMatrix = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.pVertex = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(VERTICES);
        floatBufferAsFloatBuffer.flip();
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.pTexCoord = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(TEXCOORD);
        floatBufferAsFloatBuffer2.flip();
        int iLoadShader = loadShader(vss, fss);
        this.hProgram = iLoadShader;
        GLES20.glUseProgram(iLoadShader);
        this.maPositionLoc = GLES20.glGetAttribLocation(this.hProgram, "aPosition");
        this.maTextureCoordLoc = GLES20.glGetAttribLocation(this.hProgram, "aTextureCoord");
        this.muMVPMatrixLoc = GLES20.glGetUniformLocation(this.hProgram, "uMVPMatrix");
        this.muTexMatrixLoc = GLES20.glGetUniformLocation(this.hProgram, "uTexMatrix");
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr, 0);
        GLES20.glVertexAttribPointer(this.maPositionLoc, 2, 5126, false, 8, (Buffer) floatBufferAsFloatBuffer);
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, 8, (Buffer) floatBufferAsFloatBuffer2);
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
    }

    public static void deleteTex(int i11) {
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
    }

    public static int initTex() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9728);
        return iArr[0];
    }

    public static int loadShader(String str, String str2) {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        int i11 = 0;
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(iGlCreateShader);
            iGlCreateShader = 0;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(iGlCreateShader2);
        } else {
            i11 = iGlCreateShader2;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, i11);
        GLES20.glLinkProgram(iGlCreateProgram);
        return iGlCreateProgram;
    }

    public void draw(int i11, float[] fArr) {
        GLES20.glUseProgram(this.hProgram);
        if (fArr != null) {
            GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr, 0);
        }
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, this.mMvpMatrix, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    public void release() {
        int i11 = this.hProgram;
        if (i11 >= 0) {
            GLES20.glDeleteProgram(i11);
        }
        this.hProgram = -1;
    }

    public void setMatrix(float[] fArr, int i11) {
        if (fArr == null || fArr.length < i11 + 16) {
            Matrix.setIdentityM(this.mMvpMatrix, 0);
        } else {
            System.arraycopy(fArr, i11, this.mMvpMatrix, 0, 16);
        }
    }
}
