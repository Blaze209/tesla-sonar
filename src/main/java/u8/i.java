package u8;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends GLSurfaceView implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f115879b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f115880a;

    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f115881k = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.392f, 2.017f, 1.596f, -0.813f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f115882l = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.213f, 2.112f, 1.793f, -0.533f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f115883m = {1.168f, 1.168f, 1.168f, BitmapDescriptorFactory.HUE_RED, -0.188f, 2.148f, 1.683f, -0.652f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f115884n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final FloatBuffer f115885o = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f115886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f115887b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f115888c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f115889d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f115890e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference<y7.g> f115891f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f115892g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.media3.common.util.b f115893h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f115894i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private y7.g f115895j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f115886a = gLSurfaceView;
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArr = this.f115889d;
                this.f115890e[i11] = -1;
                iArr[i11] = -1;
            }
        }

        @RequiresNonNull({"program"})
        private void b() {
            try {
                GLES20.glGenTextures(3, this.f115887b, 0);
                for (int i11 = 0; i11 < 3; i11++) {
                    GLES20.glUniform1i(this.f115893h.j(f115884n[i11]), i11);
                    GLES20.glActiveTexture(33984 + i11);
                    GlUtil.a(3553, this.f115887b[i11], 9729);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e11);
            }
        }

        public void a(y7.g gVar) {
            y7.g andSet = this.f115891f.getAndSet(gVar);
            if (andSet != null) {
                andSet.o();
            }
            this.f115886a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            y7.g andSet = this.f115891f.getAndSet(null);
            if (andSet == null && this.f115895j == null) {
                return;
            }
            if (andSet != null) {
                y7.g gVar = this.f115895j;
                if (gVar != null) {
                    gVar.o();
                }
                this.f115895j = andSet;
            }
            y7.g gVar2 = (y7.g) s7.a.f(this.f115895j);
            float[] fArr = f115882l;
            int i11 = gVar2.f125215i;
            if (i11 == 1) {
                fArr = f115881k;
            } else if (i11 == 3) {
                fArr = f115883m;
            }
            GLES20.glUniformMatrix3fv(this.f115894i, 1, false, fArr, 0);
            int[] iArr = (int[]) s7.a.f(gVar2.f125214h);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) s7.a.f(gVar2.f125213g);
            int i12 = 0;
            while (i12 < 3) {
                int i13 = i12 == 0 ? gVar2.f125212f : (gVar2.f125212f + 1) / 2;
                GLES20.glActiveTexture(33984 + i12);
                GLES20.glBindTexture(3553, this.f115887b[i12]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i12], i13, 0, 6409, 5121, byteBufferArr[i12]);
                i12++;
            }
            int i14 = gVar2.f125211e;
            int i15 = (i14 + 1) / 2;
            int[] iArr2 = {i14, i15, i15};
            for (int i16 = 0; i16 < 3; i16++) {
                if (this.f115889d[i16] != iArr2[i16] || this.f115890e[i16] != iArr[i16]) {
                    s7.a.h(iArr[i16] != 0);
                    float f11 = iArr2[i16] / iArr[i16];
                    this.f115892g[i16] = GlUtil.e(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, f11, BitmapDescriptorFactory.HUE_RED, f11, 1.0f});
                    GLES20.glVertexAttribPointer(this.f115888c[i16], 2, 5126, false, 0, (Buffer) this.f115892g[i16]);
                    this.f115889d[i16] = iArr2[i16];
                    this.f115890e[i16] = iArr[i16];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e11);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f115893h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f115885o);
                this.f115888c[0] = this.f115893h.e("in_tc_y");
                this.f115888c[1] = this.f115893h.e("in_tc_u");
                this.f115888c[2] = this.f115893h.e("in_tc_v");
                this.f115894i = this.f115893h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(y7.g gVar) {
        this.f115880a.a(gVar);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f115880a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public j getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
