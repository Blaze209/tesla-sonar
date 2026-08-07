package y00;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0016R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0016R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0016¨\u00064"}, d2 = {"Ly00/h;", "", "<init>", "()V", "", "shaderType", "", "source", "e", "(ILjava/lang/String;)I", "b", "()I", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/SurfaceTexture;", "st", "Ljn0/h0;", "c", "(Landroid/graphics/SurfaceTexture;)V", "f", "op", "a", "(Ljava/lang/String;)V", "I", "floatSizeBytes", "triangleVerticesDataStrideBytes", "triangleVerticesDataPosOffset", "triangleVerticesDataUvOffset", "Ljava/nio/FloatBuffer;", "Ljava/nio/FloatBuffer;", "mTriangleVertices", "Ljava/lang/String;", "vertexShader", "g", "fragmentShader", "", "h", "[F", "mMVPMatrix", IntegerTokenConverter.CONVERTER_KEY, "mSTMatrix", "j", "mProgram", "k", "mTextureID", "l", "muMVPMatrixHandle", "m", "muSTMatrixHandle", "n", "maPositionHandle", "o", "maTextureHandle", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int triangleVerticesDataPosOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private FloatBuffer mTriangleVertices;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float[] mSTMatrix;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int mProgram;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int muMVPMatrixHandle;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int muSTMatrixHandle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int maPositionHandle;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int maTextureHandle;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int floatSizeBytes = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int triangleVerticesDataStrideBytes = 4 * 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int triangleVerticesDataUvOffset = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String vertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String fragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] mMVPMatrix = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int mTextureID = -12345;

    public h() {
        float[] fArr = new float[16];
        this.mSTMatrix = fArr;
        float[] fArr2 = {-1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(20 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTriangleVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr2).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    private final int b() {
        int iE;
        int iE2 = e(35633, this.vertexShader);
        if (iE2 == 0 || (iE = e(35632, this.fragmentShader)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iE2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iE);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    private final int e(int shaderType, String source) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        a("glCreateShader type=" + shaderType);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final void a(String op2) {
        s.k(op2, "op");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(op2 + ": glError " + iGlGetError);
    }

    public final void c(SurfaceTexture st2) {
        s.k(st2, "st");
        a("onDrawFrame start");
        st2.getTransformMatrix(this.mSTMatrix);
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mTextureID);
        this.mTriangleVertices.position(this.triangleVerticesDataPosOffset);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, this.triangleVerticesDataStrideBytes, (Buffer) this.mTriangleVertices);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        a("glEnableVertexAttribArray maPositionHandle");
        this.mTriangleVertices.position(this.triangleVerticesDataUvOffset);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, this.triangleVerticesDataStrideBytes, (Buffer) this.mTriangleVertices);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMTextureID() {
        return this.mTextureID;
    }

    public final void f() {
        int iB = b();
        this.mProgram = iB;
        if (iB == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(iB, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.mTextureID = i11;
        GLES20.glBindTexture(36197, i11);
        a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a("glTexParameter");
    }
}
