package androidx.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f9096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0191b[] f9097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, a> f9098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, C0191b> f9099e;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9101b;

        private a(String str, int i11) {
            this.f9100a = str;
            this.f9101b = i11;
        }

        public static a a(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, 35722, iArr, 0);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i11, i12, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, b.f(i11, str));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    private static final class C0191b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f9105d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f9106e = new int[4];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9107f = 9729;

        private C0191b(String str, int i11, int i12) {
            this.f9102a = str;
            this.f9103b = i11;
            this.f9104c = i12;
        }

        public static C0191b a(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveUniform(i11, i12, i13, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0191b(str, b.i(i11, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f9095a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f9098d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f9096b = new a[iArr2[0]];
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            a aVarA = a.a(this.f9095a, i11);
            this.f9096b[i11] = aVarA;
            this.f9098d.put(aVarA.f9100a, aVarA);
        }
        this.f9099e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f9095a, 35718, iArr3, 0);
        this.f9097c = new C0191b[iArr3[0]];
        for (int i12 = 0; i12 < iArr3[0]; i12++) {
            C0191b c0191bA = C0191b.a(this.f9095a, i12);
            this.f9097c[i12] = c0191bA;
            this.f9099e.put(c0191bA.f9102a, c0191bA);
        }
        GlUtil.b();
    }

    private static void d(int i11, int i12, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i12);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i11, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i11, String str) {
        return GLES20.glGetAttribLocation(i11, str);
    }

    private int g(String str) {
        return f(this.f9095a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] == 0) {
                return i11;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i11, String str) {
        return GLES20.glGetUniformLocation(i11, str);
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f9095a, str);
    }
}
