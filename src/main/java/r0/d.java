package r0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import c0.b0;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.c0;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f106300a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f106301b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f106302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f106303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f106304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f106305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c0 f106306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f106307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f106308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f106309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f106310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r0.g f106311l;

    class a implements c0 {
        a() {
        }

        @Override // p0.c0
        @NonNull
        public String a(@NonNull String str, @NonNull String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    class b implements c0 {
        b() {
        }

        @Override // p0.c0
        @NonNull
        public String a(@NonNull String str, @NonNull String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    class c implements c0 {
        c() {
        }

        @Override // p0.c0
        @NonNull
        public String a(@NonNull String str, @NonNull String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: r0.d$d, reason: collision with other inner class name */
    public static class C2257d extends f {
        public C2257d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f106312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f106313b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f106314c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f106315d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0078  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0082  */
        protected f(@NonNull String str, @NonNull String str2) throws Throwable {
            int iY;
            int iY2;
            int iGlCreateProgram;
            try {
                iY = d.y(35633, str);
                try {
                    iY2 = d.y(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            d.g("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iY);
                            d.g("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iY2);
                            d.g("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f106312a = iGlCreateProgram;
                                c();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e12) {
                            e = e12;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e13) {
                        e = e13;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e14) {
                    e = e14;
                    iY2 = -1;
                    iGlCreateProgram = iY2;
                    if (iY != -1) {
                        GLES20.glDeleteShader(iY);
                    }
                    if (iY2 != -1) {
                        GLES20.glDeleteShader(iY2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e15) {
                e = e15;
                iY = -1;
                iY2 = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f106312a, "aPosition");
            this.f106315d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f106312a, "uTransMatrix");
            this.f106313b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f106312a, "uAlphaScale");
            this.f106314c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f106312a);
        }

        public void d(float f11) {
            GLES20.glUniform1f(this.f106314c, f11);
            d.g("glUniform1f");
        }

        public void e(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f106313b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f106312a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f106315d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f106315d, 2, 5126, false, 0, (Buffer) d.f106308i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f106316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f106317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f106318g;

        public g(@NonNull b0 b0Var, @NonNull e eVar) {
            this(b0Var, g(b0Var, eVar));
        }

        private void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f106312a, "sTexture");
            this.f106316e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f106312a, "aTextureCoord");
            this.f106318g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f106312a, "uTexMatrix");
            this.f106317f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static c0 g(@NonNull b0 b0Var, e eVar) {
            if (!b0Var.d()) {
                return d.f106304e;
            }
            h.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f106306g : d.f106305f;
        }

        @Override // r0.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f106316e, 0);
            GLES20.glEnableVertexAttribArray(this.f106318g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f106318g, 2, 5126, false, 0, (Buffer) d.f106310k);
            d.g("glVertexAttribPointer");
        }

        public void h(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f106317f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(@NonNull b0 b0Var, @NonNull c0 c0Var) {
            super(b0Var.d() ? d.f106303d : d.f106302c, d.v(c0Var));
            this.f106316e = -1;
            this.f106317f = -1;
            this.f106318g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f106302c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f106303d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f106304e = new a();
        f106305f = new b();
        f106306g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f106307h = fArr;
        f106308i = m(fArr);
        float[] fArr2 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f};
        f106309j = fArr2;
        f106310k = m(fArr2);
        f106311l = r0.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void e(@NonNull String str) {
        try {
            f(str);
        } catch (IllegalStateException e11) {
            y0.d("GLUtils", e11.toString(), e11);
        }
    }

    public static void f(@NonNull String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(@NonNull String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        h.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(@NonNull AtomicBoolean atomicBoolean, boolean z11) {
        h.j(z11 == atomicBoolean.get(), z11 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i11, @NonNull String str) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    @NonNull
    public static int[] k(@NonNull String str, @NonNull b0 b0Var) {
        int[] iArr = f106300a;
        if (b0Var.b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f106301b;
            }
            y0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    @NonNull
    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    @NonNull
    public static FloatBuffer m(@NonNull float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    @NonNull
    public static EGLSurface n(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, int i11, int i12) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i11, 12374, i12, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    @NonNull
    public static Map<e, f> o(@NonNull b0 b0Var, @NonNull Map<e, c0> map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i11 = 0; i11 < length; i11++) {
            e eVar2 = eVarArrValues[i11];
            c0 c0Var = map.get(eVar2);
            if (c0Var != null) {
                gVar = new g(b0Var, c0Var);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(b0Var, eVar2);
            } else {
                h.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (b0Var.d()) {
                    gVar = new C2257d();
                } else {
                    c0 c0Var2 = map.get(eVar);
                    gVar = c0Var2 != null ? new g(b0Var, c0Var2) : new g(b0Var, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i11 = iArr[0];
        GLES20.glBindTexture(36197, i11);
        g("glBindTexture " + i11);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i11;
    }

    @NonNull
    public static EGLSurface q(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, @NonNull Surface surface, @NonNull int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i11) {
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i11) {
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(@NonNull c0 c0Var) {
        try {
            String strA = c0Var.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    @NonNull
    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) h.g(matcher.group(1))) + "." + ((String) h.g(matcher.group(2)));
    }

    @NonNull
    public static Size x(@NonNull EGLDisplay eGLDisplay, @NonNull EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i11, @NonNull String str) {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        g("glCreateShader type=" + i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        y0.l("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i11 + ":" + strGlGetShaderInfoLog);
    }

    public static int z(@NonNull EGLDisplay eGLDisplay, @NonNull EGLSurface eGLSurface, int i11) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i11, iArr, 0);
        return iArr[0];
    }
}
