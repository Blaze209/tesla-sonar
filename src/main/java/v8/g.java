package v8;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f118352j = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f118353k = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f118354l = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f118355m = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f118356n = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f118357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f118358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f118359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.common.util.b f118360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f118362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f118363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f118364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f118365i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f118366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f118367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f118368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f118369d;

        public a(e.b bVar) {
            this.f118366a = bVar.a();
            this.f118367b = GlUtil.e(bVar.f118350c);
            this.f118368c = GlUtil.e(bVar.f118351d);
            int i11 = bVar.f118349b;
            if (i11 == 1) {
                this.f118369d = 5;
            } else if (i11 != 2) {
                this.f118369d = 4;
            } else {
                this.f118369d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f118343a;
        e.a aVar2 = eVar.f118344b;
        return aVar.b() == 1 && aVar.a(0).f118348a == 0 && aVar2.b() == 1 && aVar2.a(0).f118348a == 0;
    }

    public void a(int i11, float[] fArr, boolean z11) {
        float[] fArr2;
        a aVar = z11 ? this.f118359c : this.f118358b;
        if (aVar == null) {
            return;
        }
        int i12 = this.f118357a;
        if (i12 == 1) {
            fArr2 = z11 ? f118354l : f118353k;
        } else if (i12 == 2) {
            fArr2 = z11 ? f118356n : f118355m;
        } else {
            fArr2 = f118352j;
        }
        GLES20.glUniformMatrix3fv(this.f118362f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f118361e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(this.f118365i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(this.f118363g, 3, 5126, false, 12, (Buffer) aVar.f118367b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(this.f118364h, 2, 5126, false, 8, (Buffer) aVar.f118368c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(aVar.f118369d, 0, aVar.f118366a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    public void b() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f118360d = bVar;
            this.f118361e = bVar.j("uMvpMatrix");
            this.f118362f = this.f118360d.j("uTexMatrix");
            this.f118363g = this.f118360d.e("aPosition");
            this.f118364h = this.f118360d.e("aTexCoords");
            this.f118365i = this.f118360d.j("uTexture");
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e11);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f118357a = eVar.f118345c;
            a aVar = new a(eVar.f118343a.a(0));
            this.f118358b = aVar;
            if (!eVar.f118346d) {
                aVar = new a(eVar.f118344b.a(0));
            }
            this.f118359c = aVar;
        }
    }
}
