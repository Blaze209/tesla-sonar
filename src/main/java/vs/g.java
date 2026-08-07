package vs;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f119796j = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f119797k = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f119798l = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f119799m = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f119800n = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f119801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f119802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f119803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.util.b f119804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f119805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f119806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f119807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f119808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f119809i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f119810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f119811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f119812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f119813d;

        public a(e.b bVar) {
            this.f119810a = bVar.a();
            this.f119811b = GlUtil.e(bVar.f119794c);
            this.f119812c = GlUtil.e(bVar.f119795d);
            int i11 = bVar.f119793b;
            if (i11 == 1) {
                this.f119813d = 5;
            } else if (i11 != 2) {
                this.f119813d = 4;
            } else {
                this.f119813d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f119787a;
        e.a aVar2 = eVar.f119788b;
        return aVar.b() == 1 && aVar.a(0).f119792a == 0 && aVar2.b() == 1 && aVar2.a(0).f119792a == 0;
    }

    public void a(int i11, float[] fArr, boolean z11) {
        float[] fArr2;
        a aVar = z11 ? this.f119803c : this.f119802b;
        if (aVar == null) {
            return;
        }
        int i12 = this.f119801a;
        if (i12 == 1) {
            fArr2 = z11 ? f119798l : f119797k;
        } else if (i12 == 2) {
            fArr2 = z11 ? f119800n : f119799m;
        } else {
            fArr2 = f119796j;
        }
        GLES20.glUniformMatrix3fv(this.f119806f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f119805e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(this.f119809i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(this.f119807g, 3, 5126, false, 12, (Buffer) aVar.f119811b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(this.f119808h, 2, 5126, false, 8, (Buffer) aVar.f119812c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(aVar.f119813d, 0, aVar.f119810a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    public void b() {
        try {
            com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f119804d = bVar;
            this.f119805e = bVar.j("uMvpMatrix");
            this.f119806f = this.f119804d.j("uTexMatrix");
            this.f119807g = this.f119804d.e("aPosition");
            this.f119808h = this.f119804d.e("aTexCoords");
            this.f119809i = this.f119804d.j("uTexture");
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e11);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f119801a = eVar.f119789c;
            a aVar = new a(eVar.f119787a.a(0));
            this.f119802b = aVar;
            if (!eVar.f119790d) {
                aVar = new a(eVar.f119788b.a(0));
            }
            this.f119803c = aVar;
        }
    }
}
